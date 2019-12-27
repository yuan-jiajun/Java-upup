package javaregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.*;

/**
 * @author yuanjiajun
 * @description
 * @date 2019/12/5 20:16
 */
public class RegexDemo {
    public static void main(String[] args) {
        String regex = "[1-9][0-9]{4,14}";  //第一位字符1~9，后面的表示0~9的字符出现4~14次
        System.out.println("032425".matches(regex));//false，首字符为0
        System.out.println("2434".matches(regex));//false,除第一个字符，只有3个字符
        System.out.println("23464566".matches(regex));//true,符合规则

        //匹配
        String tel = "17608052407";
        String regex2 = "1[3578]\\d{9}";
        System.out.println(tel.matches(regex2));

        boolean a = matches(regex2, tel);
        System.out.println("a=" + a);

        String str1 = "zhangsan xiaoqiang zhaoliu";
        String str2 = "zhangsan      xiaoqiang      zhaoliu";//多个空格分割
        String str3 = "zhangsan.xiaoqiang.zhaoliu";//用特殊字符"."分割
        String str4 = "zhangsanttttxiaoqiangmmmmmmzhaoliu";//用多个重复字符分割，而且不相同

        //切割
        String[] names1 = str1.split(" ");//最简单的用空格区分
        String[] names2 = str2.split(" +");//X+表示X字符出现一次或多次
        String[] names3 = str3.split("\\.");//由于"."在正则中是一个特殊字符，如果要用"."来做字符的话，得用转义，先转义"\"再转义"."，所以双斜杠
        String[] names4 = str4.split("(.)\\1+");//(.)捕获一个任意字符组，然后用"\\1"调用这个组，1是组编号（名称），要用双"\"转义"1"成组编号，
        //不然就是是字符"1"。最后"X+"表示1个或多个，叠词。以上都成功切割出来3个名字，zhangsan，xiaoqiang，zhaoliu

        //替换
        String str = "zhangsanttttxiaoqiangmmmmmmzhaoliu";
        str1 = str.replaceAll("(.)\\1+", "$1");//"zhangsantxiaoqiangmzhaoliu",注意一定要用replaceAll
        //在一个方法中，第一个参数是正则，第二个参数要使用第一个参数，使用$,"$1"表示获取前一个参数的第一组
        str2 = str.replaceAll("(.)\\1+", "#");//"zhangsan#xiaoqiang#zhaoliu"

        String tel2 = "15800001111";
        tel2 = tel2.replaceAll("(\\d)(\\d)(\\d)", "$1****$2");//158****1111;


        //获取
        String str10 = "da jia hao,ming tian bu fang jia!";
        String regex3 = "(\\b[a-z]{3}\\b)";//"\\b"表示字符边界，表示3个字母的字符串，比如too匹配，但是tooday不是，虽然含有3个字符，但是却有五个字母
        //1,将正则封装成对象。
        Pattern p = compile(regex3);//不能new，要用静态方法返回
        //2, 通过正则对象获取匹配器对象。
        Matcher m = p.matcher(str10);
        System.out.println("count=" + m.groupCount());


        //使用Matcher对象的方法对字符串进行操作。
        //既然要获取三个字母组成的单词
        //查找。 find();
        System.out.println(str);
        while (m.find()) {
//            System.out.println(m.group());//获取匹配的子序列

            System.out.println(m.group() + " " + m.start() + ":" + m.end());
        }//输出结果是jia hao jia


        Pattern pattern = compile("[^abc]");
        Matcher matcher = pattern.matcher("plain");

        while (matcher.find()) {
            System.out.println(matcher.group());
        }

//       while (compile("[^abc]").matcher("plain").find()){
//           System.out.println("group = "+compile("[^abc]").matcher("plain").group());
//       }

        String string10 = "vlan batch 10  20 30 100";
        String[] strings10 = string10.split("\\s{1,}");

        String regex10 = "vlan\\sbatch";
        boolean a10 = string10.matches(regex10);


        String a11 = matchRegexString("vlan batch 10 20       30 100", "\\d");

        System.out.println("a11 = " + a11);

        String replace = "(CE6850 V100R003C00SPC600)";
        String repalceresult = replace.replace("(", "");
        repalceresult = replace.replace(")", "");
    }

    public static String matchRegexString(String str, String regEx) {
        StringBuilder matchStringBuilder = new StringBuilder();

        Pattern pattern11 = Pattern.compile(regEx);
        Matcher matcher11 = pattern11.matcher(str);

        while (matcher11.find()) {
            //System.out.println("发现 \"" + matcher.group() + "\" 开始于 "
            //+ matcher.start() + " 结束于 " + matcher.end());
            matchStringBuilder.append(matcher11.group());
        }
        return matchStringBuilder.toString();
    }

}