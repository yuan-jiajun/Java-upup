package jhj.fabricjartest;


//import com.google.api.Advice;

import cn.ntci.gmsdk.FabricNetworkNode;
import cn.ntci.gmsdk.FabricUser;
import cn.ntci.gmsdk.utils.CaClientUtil;
import cn.ntci.gmsdk.utils.CertUtil;
import cn.ntci.gmsdk.utils.FabricClientUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : yuanjiajun
 * @version :
 * @description :
 * @date : 2020/4/13 11:01
 */

public class Main {
    public static void main(String[] args) throws Exception {
        CaClientUtil clientUtil = CaClientUtil.getInstance("http://127.0.0.1:7054", null);
        FabricUser fabricUser = clientUtil.enrollAdminUser("admin", "adminpw");

        FabricUser enrollUser = clientUtil.registerAndEnrollUser(fabricUser, "111121222", "org1");

        CertUtil.saveUserToFile(enrollUser, "certpath/");

        //FabricUser enrollUser = CertUtil.loadFabricUser("certpath/", "11111222");

        FabricClientUtil fabricClientUtil = FabricClientUtil.getInstance(enrollUser);

        List<FabricNetworkNode> peers = new ArrayList<>();
        peers.add(new FabricNetworkNode("peer0.org1.example.com", "grpc://127.0.0.1:7051"));
        peers.add(new FabricNetworkNode("peer0.org2.example.com", "grpc://127.0.0.1:9051"));
        List<FabricNetworkNode> orderers = new ArrayList<>();
        orderers.add(new FabricNetworkNode("orderer.example.com", "grpc://127.0.0.1:7050"));

        fabricClientUtil.initializeChannel("mychannel", peers, orderers, "eventhub01", "grpc://127.0.0.1:7053");
        List<String> strings = fabricClientUtil.queryChaincode("mychannel", "mycc", "query", new String[]{"a"});
        System.out.println(strings);

        fabricClientUtil.invokeChaincode("mychannel", "mycc", "invoke", new String[]{"a", "b", "10"});

        strings = fabricClientUtil.queryChaincode("mychannel", "mycc", "query", new String[]{"a"});

        System.out.println(strings);
    }

}
