package Demo;

//编写一个学生类
class Student {
        //编写成员变量，在类中声明
    String name;  //默认值  null
    char sex;    // \u0000
    int age;    //   0
    double height;// 0.0
        //编写方法，成员方法也叫实例方法
    public void study(){
        System.out.println("正在学习java");
    }
}
class studentTest{
    public static void main(String[] args){
        //创建对象  实例化
        //类名.引用名称 = new  类名()；
        /*
        new student()表示创建一个对象，并且在堆中开辟空间
        堆中包含了对象的属性和变量
        将右侧的对象赋值给左侧的张三
         */
        //一个类可以创建多个对象
        Student zs = new Student();
        //输出 引用名称zs中所有 的属性，引用名称.属性名称
        System.out.println(zs.age);  //如果不赋值，就输出这个属性的数据类型的默认值
        //  如果要对没有赋值的属性进行赋值，用这个语法格式   引用名称.属性名称 = 值； 来赋值
        //赋值写在main函数中比较好，这样上面的学生类可以重复使用
        zs.name = "张三";
        zs.height = 166;
        zs.sex = '男';
        //访问对象中的属性  引用名称.属性名称
        System.out.println(zs.sex);
        System.out.println();
        //访问对象中的方法  引用名称.方法名称
        zs.study();

    }
}



































