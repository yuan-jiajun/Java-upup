package projects.itispect;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

/**
 * @author yuanjiajun
 * @description
 * @date 2019/12/31 21:58
 */
public class AnyDemoHere {
    @Test
    public void testList() {
        List<String> resultList = new LinkedList<String>();
        for (String s : resultList) {
            System.out.println("====");
        }
    }


    class SwitcherElementInfo {
        List<String> resultList;
        String functionRawString = "";

        public List<String> getResultList() {
            return resultList;
        }

        public void setResultList(List<String> resultList) {
            this.resultList = resultList;
        }

        public String getFunctionRawString() {
            return functionRawString;
        }

        public void setFunctionRawString(String functionRawString) {
            this.functionRawString = functionRawString;
        }
    }

    @Test
    public void setGet() {
        SwitcherElementInfo switcherElementInfo = new SwitcherElementInfo();
        List<String> resultList = new LinkedList<String>();
        List<String> resultList2 = new LinkedList<String>();
        switcherElementInfo.setResultList(resultList);
        StringBuilder functionRawStringBuilder = new StringBuilder(switcherElementInfo.getFunctionRawString());
        resultList.add("yuanjiajun");
        resultList2.add("yuanjiajun2");
        resultList2.add("yuanjiajun3");
//        resultList = resultList2;
        functionRawStringBuilder.append("yuan");
        switcherElementInfo.setFunctionRawString(functionRawStringBuilder.toString());
        System.out.println(switcherElementInfo.getFunctionRawString());
    }
}