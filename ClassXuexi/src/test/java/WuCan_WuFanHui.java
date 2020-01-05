class WuCan_WuFanHui {
    public static void print() {
        //无参无返回  方法名不一定是main，main只是入口
        for (int i = 1; i < 5; i++) {
            if (i == 3) {
                return;//返回方法调用处，return后的语句不再执行
                // 这是他的特殊形式，党方式是无返回，可以再方法体中使用return，不能在return后面加返回值。
            }
            System.out.println("第" + i + "遍HelloWorld");
        } //   return;//加不加无所谓  因为是无返回类型的方法
        System.out.println("OK");
    }

    public static void print1() {
        //无参无返回  方法名不一定是main，main只是入口
        for (int i = 1; i < 5; i++) {
            if (i == 3) {
                continue;//跳过本次循环，执行后面的操作
            }
            System.out.println("第" + i + "遍HelloWorld");
        } //   return;//加不加无所谓  因为是无返回类型的方法
        System.out.println("OK");
    }

    public static void print2() {
        for (int i = 1; i < 7; i++) {
            if (i == 6) {
                return;
            }
            System.out.println("第" + i + "遍HelloWorld");
        }
    }
}

class Switch11{
    public static String getInfo(){
        String week = "星期五";
        switch (week) {
            case "星期一":
            case "星期二":
            case "星期三":
            case "星期四":
            case "星期五":
                return  "学习";
            case "星期六":
            default:
                return "吃";
                // 在switch中， 默认的选择不要忘了加
        }
    }
}

class  Diaoyong1{
    public static void main(String args[]){
        WuCan_WuFanHui.print();
        WuCan_WuFanHui.print1();
        WuCan_WuFanHui.print2();
       System.out.println(Switch11.getInfo());
    }

}
