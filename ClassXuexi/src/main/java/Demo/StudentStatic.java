package Demo;

class StudentStatic {
    //非静态属性，也叫实例变量
    String name;
    String color;
    /*静态属性存放在方法区中，所有对象都可以访问，并且只存储一次
    * 如果在 声明静态属性时没有赋值，就用静态代码块赋值
    * 静态代码块在类第一次被载入时自动执行，并且只执行一次
    */
    static{
        address ="北京";
    }
    static String address;
    public StudentStatic(){

        /**
         * 多个对象使用同一个属性，可以用static来修饰，这样可以节省空间，因为只需要在方法去中开辟一块空间
         * 如果属性在堆内存中很快被销毁，或者属性不一样时，不加static，因为加了static还是方法区中却没有用同时占用内存。
         * 相同的属性也可以不加static，比较浪费空间。
         *
         *static  String name 是类的属性，static修饰属性后，属性就变成静态属性，也叫作类的属性，
         * String name是对象的属性，也叫实例属性，只有对象可以访问
         *
         * 类的属性和类的方法与类生命周期是相同的
         *
         * 类访问静态属性，  用  类名.静态属性
         * 类访问静态方法，  用  类名.方法名称([参数列表])
         *
         * 对象（引用名称）可以访问  引用名称.静态属性
         * 对象（引用名称）可以访问  引用名称.静态方法
         *
         * 对象（引用名称）可以访问  引用名称.属性
         * 对象（引用名称）可以访问  引用名称.方法
         *
         *
         * 只要对象（堆中的地址没有被销毁，）在，就可以访问对象的属性和方法，也可以访问类的属性和方法。
         */
    }
    public StudentStatic(String name ){
        this.name = name;//构造方法，参数指向成员变量，用this
    }

    //静态方法也叫类的方法
    public static void print(){
        System.out.println("执行了静态方法");
    }

    //非静态方法叫实例方法
    public void show(){

        /*当方法体中使用实例变量，实例方法时，该方法只能编写为实例方法，不加static修饰
         *
         * 但是这个实例方法可以使用类的属性
         *
         * 意思就是要是方法加了static修饰，只能用静态属性了，不能用实例属性/实例方法
         */

        System.out.println("颜色 " + color + "名称 " + name);
        System.out.println("执行了实例方法");
        System.out.println(address);
        show2();

    }
    public void show2(){

        System.out.println("执行了实例方法");
    }

}

//编写学生测试类
class StudentTestStatic{

    public static void main(String[] args) {
        System.out.println(StudentStatic.address);//类名.类的静态属性
       // System.out.println(StudentStatic.name);//编译错误
        //当对象存在，则对象中实例变量和实例方法也就存在
        StudentStatic s = new StudentStatic();
        //类访问静态属性，  用  类名.静态属性
        System.out.println(StudentStatic.address);
        //类访问静态方法，  用  类名.静态方法
        StudentStatic.print();
        //只要对象在（堆中的地址没有被销毁），就可以访问对象的属性和方法，也可以访问类的属性和方法。
        //对象（引用名称）可以访问  引用名称.静态属性
        System.out.println(s.address);
        //对象（引用名称）可以访问  引用名称.静态方法
        s.print();
        //对象（引用名称）可以访问  引用名称.实例方法
        s.show();
        //对象（引用名称）可以访问  引用名称.属性  name没有赋值，为空
        System.out.println(s.name);


        s = null;
        //引用名称的值为null时，也可以访问类的方法。
        s.print();
        //引用名称的值为null时，也可以访问类的属性，不会报空指针异常，因为类的属性存在方法区里（共享区）,对象的属性存在堆内存中。
        System.out.println(s.address);
        //空指针异常
       // s.show();  实例方法
        //System.out.println(s.name); 实例属性


    }
}
