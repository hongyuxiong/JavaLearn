package Demo;

import java.util.Scanner;

class DaiCan_WuFanHui {
        public static  void print(int n){  //n是形式参数
            for (int i=1;i<=n;i++){
                System.out.println(i);
            }
        }
        public static void main(String args[]){
            DaiCan_WuFanHui.print(5);  //5是实际参数    实际参数赋值给形式参数
        }                              //需要保证实参和形参的数据类型和个数，顺序一致
}                //   带参数无返回的方法调用，在main函数中输入参数

class qiuhe{
    public static void sum(int a,int b){
        //带参数无返回
        int  c = a+b;
       System.out.println(c);
    }
}

class diaoyong{
    public static void main(String args[]){
        //键盘输入放在main函数里面，
        Scanner input = new Scanner(System.in);
        System.out.println("请输入第一个数");
        int x = input.nextInt();
        System.out.println("请输入第二个数");
        int y = input.nextInt();
        qiuhe.sum(x,y);  // 如果没有键盘输入，就要在sum的参数里面，填上实际参数，上面是键盘输入了实际参数
    }
}

