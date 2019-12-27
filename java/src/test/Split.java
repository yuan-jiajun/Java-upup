package test;

/**
 * @author yuanjiajun
 * @description
 * @date 2019/11/24 17:09
 */
public class Split {
    private String string =new String("yuan jia jun ");
    private String[] locate_line_split = string.split(" ");

    public static void main(String[] args) {
        Split split = new Split();
        System.out.println(split.getLocate_line_split().length);
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public String[] getLocate_line_split() {
        return locate_line_split;
    }

    public void setLocate_line_split(String[] locate_line_split) {
        this.locate_line_split = locate_line_split;
    }


}