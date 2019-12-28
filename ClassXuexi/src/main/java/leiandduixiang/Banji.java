package leiandduixiang;

class BanJi {

    int id;
    String name;
    String address;


    //在无参构造函数中没有给成员变量赋值，
    public  BanJi(){

    }

    public BanJi(int id,String name,String address){
        this.address=address;
        this.id = id;
        this.name=name;
    }

    public void show(){
        System.out.println("班级编号 "+id+"  班级名称  "+name+" 班级地址  "+address);
    }
}

class Stu{
    int id;
    String name;
    char sex;
    int age;
    BanJi n = new BanJi();
    //属性在声明时就给他赋值，不赋值n在内存空间中就是是null，n在内存空间中有id,name,address三个实例变量，所以只需要创建一个n就够了。
    //n在新建对象时是属性，所以n可以  .  到对象中的id，name，address
    // s在引用下面的print方法中有引用名称.属性名称时会报空指针异常，
    // 班级名称在这里用班级的类名作为这个成员变量的类型

    public Stu(){
    //创建带参构造函数时要先创建无参构造函数
    }                                                   //banji类型是用户自定义类型
    public Stu( int id,String name,char sex,int age,BanJi n){
        this.id=id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.n=n;
    }

    public void print(){
        //n.name   要看n后面是什么
        System.out.println("学生"+id+"的信息为："+" 学号："+id+" 姓名："+name+" 性别："+sex+" 年龄；"+age+" 班级编号："+n.id+" 班级名称："+n.name+" 地址 "+n.address);
        n.show();
    }

}

class Test{
    public static void main(String[] args) {
        //因为没有传参，所以 stu类中的值是默认的，n中班级类的值也是默认的。
        Stu student1 = new Stu();
        student1.print();


        //创建对象同时执行带参构造函数，同时传参，stu类里的（也叫成员变量）属性有了值，banji类中的属性也有值
        Stu student2 = new Stu(2,"李四",'男',20,new BanJi(1,"学习班","上海"));
        student2.print();

    }
        }