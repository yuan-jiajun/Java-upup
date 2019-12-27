package getclassname;

/**
 * @author yuanjiajun
 * @description
 * @date 2019/11/21 18:23
 */
public class Account {
    //交换机唯一标识
    private String serialNum;

    private String accounrName;
    private String authorities;

    public Account() {
    }

    public Account(String serialNum, String accounrName, String authorities) {
        this.serialNum = serialNum;
        this.accounrName = accounrName;
        this.authorities = authorities;
    }

    public String getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(String serialNum) {
        this.serialNum = serialNum;
    }

    public String getAccounrName() {
        return accounrName;
    }

    public void setAccounrName(String accounrName) {
        this.accounrName = accounrName;
    }

    public String getAuthorities() {
        return authorities;
    }

    public void setAuthorities(String authorities) {
        this.authorities = authorities;
    }
}