package Demo;

import  java.util.Scanner;
class Input11 {
    public static  void main(String[] args){
            //创建 Scanner对象
        Scanner input = new Scanner(System.in);
        //友好提示
        System.out.println("请输入：");
       //接收键盘输入
        double num = input.nextDouble();
        System.out.println("数字是 " + num);
    }
}


//计算两个数的和
class input12{
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入两个数");
        double x = input.nextDouble();
        double y = input.nextDouble();
        double sum = x+y;
        System.out.println(x + "+" + y + "=" +sum);//字符串拼接
        System.out.printf("%.1f",sum);//保留一位小数

    }
}


class input13{
    public  static void main (String args[]){
        //输入个人信息
        Scanner input = new Scanner(System.in);
        System.out.print("请输入姓名");
        String name = input.next();//没有nextString方法，接收字符用next
        System.out.print("请输入年龄");
        int age = input.nextInt();
        System.out.print("请输入身高");
        double height = input.nextDouble();
        System.out.print("请输入性别");
        String s = input.next();
        //Java不能直接接受字符,先接受字符串类型，再取第0个值
        char sex = s.charAt(0);//获取整个字符串呢？
        System.out.print("学生信息为:"+"姓名 " +name +" 年龄 "+ age +" 身高 "+ height +  " 性别 " +sex);
    }
}

class input14{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("请输入成绩");
        double num = input.nextDouble();
      /*
        if (num>=90){
            System.out.print("有奖励");

        }else
            System.out.print("小于90");
*/
        //三目运算符

       // System.out.print(num >90 ? "有奖励":"小于90");
        //if   else if   用于有多重情况的条件
    }
}


class  if15{
    //if嵌套
    public static void main(String args[]){
        //判断水仙花数 ,123 1*1*1+2*2*2+3*3*3
        Scanner input = new Scanner(System.in);
        System.out.print("请输入一个三位数");
        int num = input.nextInt();
        //判断是否是三位数
        if(num>=100 && num<999){
            //   %  取余    /  获得商
            int bw = num/100, sw = num % 100 /10, gw = num %10;
            // 计算各个位的立方和
            int sum = bw * bw * bw+ sw * sw * sw + gw * gw * gw;
            if(sum == num){
                System.out.print(num+"这是水仙花数");
            }else{
                System.out.print("这不是水仙花数");
        }
        }else{
            System.out.print("这不是三位数");
        }
    }
}

class if16{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("请输入名次");
        String info = input.next();//String 型存的是地址，不能用 ==来和字符比较是否相等，要用equals方法来比较值
        if("第一名".equals(info)){
            System.out.print("奖励10w");
        }else if("第二名".equals(info))
        {
            System.out.print("5w");
        }
        else
        {
            System.out.print("没有奖励");
        }

    }
}

class  switch17{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        String info = input.next();
        switch (info){
            //     switch只能做等值操作，其他循环可以比较字符串，也可以比较值
            case"第一名":
                System.out.print("奖励10w");
                break;   //条件满足就自动中断，如果不加break，就会穿透执行下面的语句，打印所有的结果
            case"第二名":
                System.out.print("奖励5w");
                break;
            default:  //默认的结果
                System.out.print("没有奖励");
                break;
        }
    }
}

class switch18{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String info = input.next();
        switch (info){
            case"第一名":
                System.out.println("奖励1w");
                break;
            case"第二名":
                System.out.println("奖励2w");
                break;
            default:
                System.out.println("奖励大狗熊");

        }
    }
}

class  for1{
    public static void main(String args[]){
        int count =0;
        /*
        for(int i = 1;i<50;i++){
            //如果是偶数就输出
            if(i %2==0){
                System.out.println(i);
            }
        }*/
        //第二种写法
        for(int i=2;i<=50;i += 2){
            System.out.print(i+"\t");
            count++;
            if(count %5==0){
                System.out.println();
            }
        }
    }
}

class for2{
    public static void main(String args[]){
        int count =0;
        for(int i=100; i<1000;i++){
            //输出 所有能被7整除的数，并每行显示5个
            if(i%7==0) {
                System.out.print(i + "\t");
                count++;
                if (count % 5 == 0) {
                    System.out.println();
                }
            }
        }
    }
}

class  for3{
    //双重循环,不用判断计数了
    public static void main(String args[]){
        for(int j=1;j<=3;j++){
            for(int i=1;i<=6;){
                i++;  //写在循环体中或者for的条件中都可以
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class  while1{
    public  static  void  main(String args[]){
        int i=1;
        int count = 0;
        while(i<=100) {
            i++;//循环写在这里不容易忘记
            if (i % 4 == 0) {
                System.out.print(i + "\t");
                count++;
                if(count % 5 ==0){
                    System.out.println();
                }
            } //循环也可以写在这里
        }
    }
}

class dowhile01{
    public static void main(String args[]){
        //do-while循环  是do里面 放入循环体  while是条件
        //如果 输入的入口在循环体中，每次循环都会开辟一个新的内存空间，会消耗很多内存
        Scanner input = new Scanner(System.in);
        String info;
        do{
            System.out.println("请编写题目");   //循环体
            System.out.println("请检查编写的题目");
            info = input.next();
        }while("不合格".equals(info));  //条件
        System.out.println("不用编写了");
    }
}

class dowhile02 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
       int sum =0;
        do {
            System.out.println("请输入一个整数");
            int num = input.nextInt();
            //如果数字是0，中断循环，得出结果
            if (num == 0) {
                break; //结束当前的循环
            }
            sum = sum + num;
        } while (true);//条件为boolean类型，所以要填true这个条件，为了能够再次返回do的循环体继续循环
        System.out.println("所有输入的数的和" + sum );
    }
}

class continue1{
    //输入5个人的考试成绩，统计成绩在90分以上的人数
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        int count = 0;  //count放在外面是因为循环成功后一次才计数一次
        for (int i=1;i<=5;i++){
            System.out.print("请输入第"+i+"个人的成绩");
            int s = input.nextInt();
            if (s<90){
                continue;  //continue的作用是满足条件时结束本次循环，继续执行下一次循环
            }count++;
        }
        System.out.println("人数"+count);
    }
}
/* break和contiune的区别



*/

















