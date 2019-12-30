package Demo;

import java.util.Scanner;

class DaiCanShu_YouFanHui {
    public static String result(int age){
        //带参数有返回
        if(age >=60){
            return "老年人";
        }else if(age>=40){
            return "中年";
        }else if(age >=20){
            return "青年";
        }else {
            return "少年";
        }
    }


    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入年龄：");
        int age = input.nextInt();
        System.out.println(result(age));
        /* int  age = 21;
        System.out.println(result(age));
        方法中的变量是局部变量，不同的方法变量同名是不影响的，是相互独立的。
        如果参数是未知的就要用带参数的，在方法中 放了参数
        如果结果只有一个，就带返回。
         */
    }
}






//同一件事，有参有返回，无参有返回，有参无返回，都可以完成，区别在哪