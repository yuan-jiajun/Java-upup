package utils.json;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import utils.file_utils.FileInputOutput;

import java.io.File;

/**
 * @author yuanjiajun
 * @description
 * @date 2020/12/28 15:32
 */
public class JsonToString {

    public static void main(String[] args) {
        String jsonFilePath = "F:\\modules\\毕业相关\\交流&汇报录音\\论文开题和进展报告.m4a.lfasr.json";
        String jsonString = FileInputOutput.fileToString(new File(jsonFilePath), "UTF-8");
        JSONArray jsonArray = JSONArray.parseArray(jsonString);
        StringBuilder sb = new StringBuilder();
        for (Object o : jsonArray) {
            JSONObject jsonObject = (JSONObject) o;
            sb.append(jsonObject.getString("onebest")).append("\n");
        }
        System.out.println(sb.toString());

        String re = jsonFilePath + ".txt";
        FileInputOutput.stringToFile(sb.toString(), new File(re));
    }
}
