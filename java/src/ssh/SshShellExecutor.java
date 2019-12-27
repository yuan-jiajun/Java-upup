package ssh;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author yuanjiajun
 * @description
 * @date 2019/12/25 17:36
 */
public class SshShellExecutor {
    private static String host;
    private static String username;
    private static String password;
    private static final int DEFAULT_SSH_PORT = 22;
    private static int port;

    public SshShellExecutor(String host, String username, String password) {
        this(host, DEFAULT_SSH_PORT, username, password);
    }

    SshShellExecutor(String host, int port, String username, String password) {
        SshShellExecutor.host = host;
        SshShellExecutor.port = port;
        SshShellExecutor.username = username;
        SshShellExecutor.password = password;
    }

    static Map<String, String> jschExecuteToMap(List<String> commands, boolean replaceMore) throws JSchException, IOException {
        Map<String, String> resultMap = new HashMap<String, String>();
        JSch jsch = new JSch();

        Session session = jsch.getSession(username, host, port);
        session.setConfig("StrictHostKeyChecking", "no");
        session.setPassword(password);

        session.connect();   // making a connection with timeout.

        Channel channel = session.openChannel("shell");
        InputStream in = channel.getInputStream();
        //如果connect这里不设timeOut值，会导致异常断开连接exit code -1
        channel.connect(60000);

        OutputStream os = channel.getOutputStream();
        StringBuilder sb = new StringBuilder();
        byte[] tmp = new byte[4096];
        int i;
        String command;
        String buf = null;
        int k = 0;
        while (k < commands.size()) {
            //往输出流里写数据
            command = commands.get(k);
            os.write((command + "\n").getBytes());
            os.flush();
            try {
                Thread.sleep(1000);
            } catch (Exception ignored) {
            }
            //读取输入流
            while (in.available() > 0) {
                if ((i = (in.read(tmp, 0, 4096))) < 0)
                    break;
                buf = new String(tmp, 0, i);
                sb.append(buf);
                if (i == 4096) {
                    try {
                        Thread.sleep(500);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
            resultMap.put(command, sb.toString());
            sb.delete(0, sb.length());
            if (channel.isClosed()) {
                System.out.println("exit-status: " + channel.getExitStatus());
                break;
            }
            k++;
        }
        //bfw.close();
        os.close();
        in.close();
        channel.disconnect();
        session.disconnect();
        return resultMap;
    }

    public static Map<String, String> sshCommandsToMapFunction(SwitchSSHSetting switchSSHSetting, List<String> commandList) {
        SshShellExecutor sshShellExecutor = new SshShellExecutor(switchSSHSetting.getIp(), switchSSHSetting.getPort(),
                switchSSHSetting.getSshAccount(), switchSSHSetting.getSshPasswd());
        Map<String, String> resultMap = null;
        try {
            resultMap = SshShellExecutor.jschExecuteToMap(commandList, false);
        } catch (Exception e) {
            if (e instanceof JSchException) {
                System.out.println("JSchException");
            }
            e.printStackTrace();
        }
        return resultMap;
    }

}