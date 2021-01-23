package utils.ipinrange;

/**
 * @author yuanjiajun
 * @description
 * @date 2019/11/28 17:45
 */
public class IsIPInRange2 {
    public static boolean IsIPInRange(String ipSection, String ip) {
        if (ipSection == null)
            throw new NullPointerException("IP段不能为空！");
        if (ip == null)
            throw new NullPointerException("IP不能为空！");
        ipSection = ipSection.trim();
        ip = ip.trim();
        boolean flag = true;
        final String REGX_IP = "((25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]\\d|\\d)\\.){3}(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]\\d|\\d)";//IP正则
        final String REGX_IPB = REGX_IP + "\\/" + REGX_IP;
        if (!ipSection.matches(REGX_IPB) || !ip.matches(REGX_IP)) {
            System.out.println("输入的IP地址或IP地址段不合法");
            return false;
        }
        int idx = ipSection.indexOf('/');
        String[] gatewayip_split = ipSection.substring(0, idx).split("\\.");
        String[] netmask_split = ipSection.substring(idx + 1).split("\\.");
        String[] ip_split = ip.split("\\.");
        long one = 1L;

        for (int i = 0; i < 4; i++) {
            for (int j = 7; j > 0; j--) {
                if (((Integer.parseInt(netmask_split[i]) >> j) & 1L) == 0)
                    if (((Integer.parseInt(gatewayip_split[i]) >> j) & 1L) != ((Integer.parseInt(ip_split[i]) >> j) & 1L))
                        flag = false;

            }
        }
        return flag;
    }

    public static void main(String[] args) {
        if (IsIPInRange("192.168.3.1/0.0.0.255", "192.168.4.54")) {
            System.out.println("ip属于该网段");
        } else
            System.out.println("ip不属于该网段");
    }
}