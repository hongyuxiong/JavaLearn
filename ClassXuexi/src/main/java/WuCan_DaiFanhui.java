class WuCan_DanFanhui {
    public  static  String result() {
        char ch = 'h';
        if (ch >= 'A' && ch <= 'Z') {
            return "大写字母";
        } else if (ch >= 'a' && ch <= 'z') {
            return "小写字母";
        } else if (ch >= 0 && ch <= 9) {
            return "是数字";
        }
        return "其他字符";
    }
}
// 无参带返回    String int double  boolean char byte
class  DiaoYong{
    public static void main(String args[]){
        System.out.println(WuCan_DanFanhui.result());
    }
}

