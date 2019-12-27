package ssh;

import com.sun.istack.internal.NotNull;

/**
 * 用于接收前端上传的交换机账户及密码信息
 */
public class SwitchSSHSetting {
    @NotNull
    private String taskId;
    //交换机序列号，这个需要在检测之后才能存值并持久化
    private String serialNum;
    private String switchBrand;
    //这里的交换机型号如果不填则用Default，填写时只能填写代码有相应解析函数的型号，否则无法进行反射
    private String switchModel;//TODO README.MD
    //交换机ip地址
    @NotNull
    private String ip;
    private int port;
    //SSH账户
    @NotNull
    private String sshAccount;
    //SSH账户密码
    @NotNull
    private String sshPasswd;
    //所属的任务

    public SwitchSSHSetting() {
    }

    public SwitchSSHSetting(String serialNum, String switchBrand, String switchModel, String ip, int port, String sshAccount, String sshPasswd) {
        this.serialNum = serialNum;
        this.switchBrand = switchBrand;
        this.switchModel = switchModel;
        this.ip = ip;
        this.port = port;
        this.sshAccount = sshAccount;
        this.sshPasswd = sshPasswd;
    }


    public String getSwitchModel() {
        return switchModel;
    }

    public void setSwitchModel(String switchModel) {
        this.switchModel = switchModel;
    }

    public String getSwitchBrand() {
        return switchBrand;
    }

    public void setSwitchBrand(String switchBrand) {
        this.switchBrand = switchBrand;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(String serialNum) {
        this.serialNum = serialNum;
    }

    public String getSshAccount() {
        return sshAccount;
    }

    public void setSshAccount(String sshAccount) {
        this.sshAccount = sshAccount;
    }

    public String getSshPasswd() {
        return sshPasswd;
    }

    public void setSshPasswd(String sshPasswd) {
        this.sshPasswd = sshPasswd;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    @Override
    public String toString() {
        return "[SwitchSSHSetting:ip:" + ip + ";serialNum:" + serialNum + ";sshAccount:" + sshAccount + ";sshPasswd:" + sshPasswd + "]";
    }

}
