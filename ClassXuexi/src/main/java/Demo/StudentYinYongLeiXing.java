package Demo;

class StudentYinYongLeiXing {
    String name;
    int age;
    public StudentYinYongLeiXing(){

    }
    public StudentYinYongLeiXing(String name ,int age){
        this.name = name;//构造方法，参数指向成员变量，用this
        this.age = age;
    }
}

//编写学生测试类
class StudentTestYinYong{


    /**
     * 匿名对象 这个主要用于调用那些执行一次的方法的简化写法
     *
     * new StudentYinYongLeiMing() 他是对象的简化定义方法
     *
     * 匿名对象可以作为实际参数进行传递 change(new StudentYinYongLeiMing());
     * https://www.cnblogs.com/xuwangqi/p/11059905.html
     * s这个引用类型作为参数传递时，传递的是地址，前面的StudentYinYongLeiMing只是用来表示s是哪个类的
     * 类名+对象名  相当于  new s 新建了一个对象
     *
     *
     */
    public static void change(StudentYinYongLeiXing s){
        s.name ="小张";
        System.out.println("s.name"+s.name);
        System.out.println("s.age= "+ s.age);
    }

    public static void main(String[] args) {
        StudentYinYongLeiXing s = new StudentYinYongLeiXing();
        s.name="小赵";
        s.age=18;
        //引用地址中属性的小赵被小张替换，因此s中的值是小张，18
        change(s);
        System.out.println(s);
    }
}
