package networking;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author yuanjiajun
 * @date 2019/5/30
 * @time 11:34
 * 如下的 GreetingClient 是一个客户端程序，该程序通过 socket 连接到服务器并发送一个请求，然后等待一个响应。
 */
public class GreetingClient {
    public static void main(String[] args) {
        String serverName = args[0];
        int port = Integer.parseInt(args[1]);

        try{
            System.out.println("link to host: "+serverName+",port: "+port);

            Socket client = new Socket(serverName, port);
            System.out.println("remote host ip: "+client.getRemoteSocketAddress());

            OutputStream outToServer=client.getOutputStream();
            DataOutputStream out = new DataOutputStream(outToServer);
            out.writeUTF("Hello from "+client.getLocalSocketAddress());

            InputStream inFromServer = client.getInputStream();
            DataInputStream in=new DataInputStream(inFromServer);
            System.out.println("server respons： " + in.readUTF());
            client.close();

        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
