package Demo;

class Car {
    //属性也叫成员变量,成员变量有默认值
    String id;
    double price;
    String color;

    /**无参构造方法
       1.构造方法的名字必须与类名一致，2.必须没有返回值 3.方法中是给成员变量赋值
       如果把这段删除，但是还有其他的构造方法，因此系统不会再提供默认的无参构造方法，编译就会报错，如果删除了所有构造方法，又没有其他的赋值，成员变量的值就是默认值了
       手动编写构造方法前，先编写无参构造方法，在编写需要的构造方法
     */
    public Car(){
        id= "11";
        price = 999;
        color = "red";
    }

    //有参构造方法    给所有属性赋值，
    public Car(String id,String color,int price){
        //当前这个对象的带参构造方法,this方法时不用加 .
        this(id,color);
        //局部变量给成员变量赋值，用this.成员变量=局部变量,这种带参的方法，需要用this来给成员变量赋值
        this.price = price;
        // this(id,color,price);
    }

    //也可以构造只对id和color属性赋值的方法，price就是成员变量的默认值
    public Car(String id,String color){
        //局部变量给成员变量赋值，用this.成员变量=局部变量,这种带参的方法，需要用this来给成员变量赋值
         this.id = id;
         this.color = color;


    }

/**
 * 这两个print方法也就是重载了 -- 在同一个类中，方法名相同，参数不同（个数不同，类型不同，顺序不同），与返回值类型无关
   只是这个 double num没用到
   print的一小段函数和整个函数没什么关系，就是用来看id的默认值的。
   */
    public void print(double num){   //num是形参，也是局部变量因为在方法中声明的
        //a就是局部变量   局部变量在方法体中
        int a;
        a = 5;
        System.out.println(a);
        //值为null
        System.out.println(id);
    }
    /**
     * 方法，也叫成员方法或者实例方法，也是普通方法
     */
    public void print(){
        System.out.println("Id是" +id +"  价格是  "+ price +"  颜色是 "+color);
    }
    /**
     * 等价于当成员变量和局部变量同名时，如果访问成员变量，必须使用this
     */
    public void print2(){
        System.out.println("Id是" +this.id +"  价格是  "+ this.price +"  颜色是 "+this.color);
    }
    public void print(String id){
         this.id = id;
}
/**
    局部变量能与成员变量重名
    可以重名 但是最好使用this进行区分
    局部变量分为两种情况
    局部变量分配在栈上，成员变量分配在堆上，所以可以重名。
    相同的分配区域内不能重名
    */
    public void look(){
        print();//调用本类的方法，可以直接调用
        //等价于  this.print();
        //意思就是说调用这个方法的对象
    }


    public void show(){
        /*在同一个类中，局部变量名字可以和成员变量名字同名
        类中的成员变量需要声明对象来引用
        但是也需要赋值，不然就会编译报错
        */
        String id = "12345";
        System.out.println("局部变量的"+id);//这个id是局部变量的值12345
        System.out.println("输出成员变量id的值"+this.id);//this代表当前这个对象，当前调用这个方法的对象
    }

    public  void setPrice(double price){  //无返回带参数  局部变量
        //实现将局部变量price的值赋给成员变量
        this.price=price;  //成员变量需要用this来访问

    }
//car的测试类
    public static void main(String[] args) {
        Car c = new Car();
        /*不赋值，直接调用方法，就是默认值
                 有了无参的构造方法后，调用无参的构造方法，使用了方法中的变量值
                   */
        c.show();
        System.out.println();

        Car c2 = new Car();
        c2.id = "2222";   //成员变量赋值
        c2.show();//赋值后，调用的结果就是赋的值
        System.out.println();

        Car c3 = new Car();//  200赋值到方法里的price，方法里的price赋值到this.price ，this就是Car（）对象中的c3
        c3.setPrice(200);  //对象的值可以通过类中的this来给成员变量赋值，也可以直接赋值，就像c2.
                            //还可以用构造方法来赋值
        System.out.println("C3的价格是"+c3.price);//直接加上赋值就可以看到这个对象的属性的值了


        //创建Car对象同时执行匹配的构造方法,如果括号中没有内容则执行无参构造方法
        //这样比用对象来引用属性赋值要方便的多。看student类里就是引用属性实现的
        Car c4 = new Car();
        c4.print();//调用无参方法
        System.out.println();

        //  在创建Car对象时执行匹配带参的构造方法
        Car c5 = new Car("C5","blue",10);
        c5.print();

        Car c6 = new Car("C6","black");
        c6.print();
        c6.print2();

    }






}
