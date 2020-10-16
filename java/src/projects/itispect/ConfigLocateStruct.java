package projects.itispect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author yuanjiajun
 * @description
 * @date 2019/12/27 21:05
 */
public class ConfigLocateStruct {
    private String variableName;
    private String[] blockLocateRegex;
    private String locateLineRegex;
    private String[] funcitonKeyword;
    private int[] regexGroupId;

    public ConfigLocateStruct(String variableName, String[] blockContainedRegex, String[] blockExclusiveRegex,
                              String locateLineRegex, String[] funcitonKeyword, int... regexGroupId) {
        if (regexGroupId.length == 0)
            regexGroupId = new int[]{0};

        this.variableName = variableName;
        List<String> list = new ArrayList<String>(Arrays.asList(blockContainedRegex));
        list.addAll(Arrays.asList(blockExclusiveRegex));
        this.blockLocateRegex = list.toArray(new String[0]);
        this.locateLineRegex = locateLineRegex;
        this.funcitonKeyword = funcitonKeyword;
        this.regexGroupId = regexGroupId;
    }

    public ConfigLocateStruct(String variableName, String[] blockContainedRegex, String[] blockExclusiveRegex,
                              String locateLineRegex, int... regexGroupId) {
        if (regexGroupId.length == 0)
            regexGroupId = new int[]{0};
        this.variableName = variableName;
        List<String> list = new ArrayList<String>(Arrays.asList(blockContainedRegex));
        list.addAll(Arrays.asList(blockExclusiveRegex));
        this.blockLocateRegex = list.toArray(new String[0]);
        this.locateLineRegex = locateLineRegex;
        this.funcitonKeyword = new String[]{};
        this.regexGroupId = regexGroupId;
    }

    public ConfigLocateStruct(String variableName, String[] blockContainedRegex,
                              String locateLineRegex, String[] funcitonKeyword, int... regexGroupId) {
        if (regexGroupId.length == 0)
            regexGroupId = new int[]{0};
        this.variableName = variableName;
        this.blockLocateRegex = blockContainedRegex;
        this.locateLineRegex = locateLineRegex;
        this.funcitonKeyword = funcitonKeyword;
        this.regexGroupId = regexGroupId;
    }

    public ConfigLocateStruct(String variableName, String[] blockContainedRegex,
                              String locateLineRegex, int... regexGroupId) {
        if (regexGroupId.length == 0)
            regexGroupId = new int[]{0};
        this.variableName = variableName;
        this.blockLocateRegex = blockContainedRegex;
        this.locateLineRegex = locateLineRegex;
        this.funcitonKeyword = new String[]{};
        this.regexGroupId = regexGroupId;
    }


    public String getVariableName() {
        return variableName;
    }

    public void setVariableName(String variableName) {
        this.variableName = variableName;
    }

    public String[] getBlockLocateRegex() {
        return blockLocateRegex;
    }

    public void setBlockLocateRegex(String[] blockLocateRegex) {
        this.blockLocateRegex = blockLocateRegex;
    }

    public String getLocateLineRegex() {
        return locateLineRegex;
    }

    public void setLocateLineRegex(String locateLineRegex) {
        this.locateLineRegex = locateLineRegex;
    }

    public String[] getFuncitonKeyword() {
        return funcitonKeyword;
    }

    public void setFuncitonKeyword(String[] funcitonKeyword) {
        this.funcitonKeyword = funcitonKeyword;
    }

    public int[] getRegexGroupId() {
        return regexGroupId;
    }

    public void setRegexGroupId(int[] regexGroupId) {
        this.regexGroupId = regexGroupId;
    }


}

