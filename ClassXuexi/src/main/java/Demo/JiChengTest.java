package Demo;
/**
 * Demo class
 *
 * @author keriezhang
 * @date 2016/10/31
 */
public class JiChengTest {


    /*
     * 将多个类中找到相同的属性和方法，编写在单独的一个类中，这个类称为父类。
     * 编写子类，并继承父类 。
     * 在子类编写独有的属性和方法。
     * 继承可以减少代码的冗余
     */

    String name;
    int age;
    String color;
    //编写父类构造方法
    public  JiChengTest(){
        System.out.println("执行了父类的无参构造方法");
    }
    public JiChengTest(String name,int age,String color){
        this.age=age;
        this.color=color;
        this.name=name;
        System.out.println("执行了父类的带3个属性构造方法");
    }

    public void print(){
        System.out.println("名字："+ name +"\n年龄："+ age +"\n颜色："+ color);
    }
    public Object getInfo(){
        return  null;
    }
}
/*
 *class cat {}
 *等于
 *class cat extends Object{}
 *Object类是所有类的父类
 *父类也叫超类或者基类，子类也叫派生类
 * 继承有两大特性：
   1.一个子类只能继承一个直接的父类A，一个儿子只有一个亲爹，不能同时继承A，又继承B，也就是说类是单根性
   2.但是可以继承间接的父类： B继承A,D继承B，D继承了A和B的属性和方法，类具有传递性

 */


class Cat extends JiChengTest{

    char sex;

 /*
   所有的覆写方法，必须加@Override注解，override的意思就是重写。重写也叫覆盖

   重写后
   1.子类的方法的访问修饰符不能缩小范围（private是私有的其实也不能重写，和不能缩小范围一个意思），
   2.子类中的方法名必须与父类中的方法名一致，
   3.参数列表要一致，
   4.返回类型是相同的返回类型或者父类方法返回类型的子类类型。

   子类继承父类时，不能继承父类的构造方法/静态方法，但可以重写父类中的实例方法（没有加static的方法），。
   子类继承父类后，子类中可以直接访问父类的属性。
   重写以后，父类中的实例方法依然存在，只是不执行了，如果不存在就达不到重写的效果。
  */
    @Override
    //重写父类的方法
    public void print(){
        System.out.println("名字"+super.name+"\n年龄"+super.age+"\n颜色"+super.color+"\n性别"+this.sex);
    }


    /* 因为String也属于类，属于Object的子类。重写父类的getinfo方法,用父类方法返回类型的子类类型String
     * 如果把getinfo写成getinfo2，那么在引用getinfo方法就会返回父类的null，因为重写需要方法名一致。
     * ****************
     * 重载是 在同一个类中，方法名必须相同，但是参数列表必须不同（个数，顺序,类型不同)，与返回值类型无关。
     * 构造方法的重载也是方法名必须相同，但是参数列表必须不同，当冲在以后，在调用时，根据参数自动找相匹配的执行。
     */
    @Override
    public String getInfo(){
        return  "ok";
    }
}
class Dog extends  JiChengTest {

    String strain;

    //编写构造方法
    public Dog(){
        System.out.println("执行了子类的无参构造方法");
    }
    //因为继承了父类的属性，所以可以在构造方法中传父类的参数。形参是局部变量，
    public Dog(String name, int age, String color,String strain ){
        /*
        可以用
        this.name = name;
        this.age = age;
        this.color = color;
        this.strain = strain;
         */

        /*也可以用
        super.name = name;
        super.age = age;
        super.color = color;
        this.strain = strain;
         */
        /*
        1.this是先在当前这个类中去找，找不到再去父类中找。如果用super，就直接去父类中找。效率更高
        2.super关键字表示超类或者父类，只能在子类中使用，访问父类中的实例属性,实例方法,构造方法。
        3.访问子类独有的属性只能用this，用super会报错。
        也可以写成
         */
        super(name,age,color);
        /*
        如果Dog4中调用的是下面这段，相当于没有指定父类的构造方法，虽然用了父类的属性，但还是会执行父类的无参构造，再执行Dog类的有参构造。（和创建对象时相匹配的有参构造）
        this.name = name;
        this.age = age;
        this.color = color;
        this.strain = strain;

         */

        this.strain = strain;
        System.out.println("执行了子类的带4个属性构造方法");
    }

     @Override
    public void print() {

        /**System.out.println("名字" + super.name + "\n年龄" + super.age + "\n颜色" + super.color + "\n品种" + strain);
         *
         * 这一条语句等价于下面的语句，因为属性在父类中都有了，不用再写一次。直接调用父类的方法，再写子类的，就会拼起来
         *
         * super  关键字表示超类或者父类，只能在子类中使用，访问父类中的实例属性,或者实例方法。
         */

       super.print();
        System.out.println("品种 "+ strain);

      /*
        子类继承父类，子类中可以直接访问父类的属性。可以什么都不加，有一个默认的this。
        System.out.println("名字" + this.name + "\n年龄" + this.age + "\n颜色" + this.color + "\n性别" + this.strain);
        这里的属性是成员变量，就是属性。  属性=实例属性=实例变量=成员变量。
        this可以访问本类的属性，也可以访问父类中的属性，加与不加都行。范围大一点说，也可以访问本类中的实例方法，也可以访问本类中其他的构造方法，只是这里没用到。
        1.this是先在当前这个类中去找，找不到再去父类中找。如果用super，就直接去父类中找。效率更高
        2.super关键字表示超类或者父类，只能在子类中使用，访问父类中的实例属性,实例方法,构造方法。
        3.访问子类独有的属性只能用this，用super会报错。
       */

   }

      /**
        如果没重写父类的方法，直接调用父类的方法可以用 super.print()，也可以用this.print();
        要是重写了，只能用 super.
        上面的print等于下面的print2的使用。print2是Dog子类独有的，没有重写。


    public void print2(){
        this.print();
        System.out.println("品种 "+ strain);
    }
*/

}

class Test1{
    public static void main(String[] args) {
        Cat c = new Cat();
        // print方法中的内容先去子类也就是cat类中找，找不到就去父类中找，找到的话就是覆盖。
        //因此，想要打印完整的cat类中所有属性的语句，需要自己另外写一条，这样在子类中就可以找到了。
        c.print();
        System.out.println(c.getInfo());
        System.out.println("------Dog--------");
        Dog d = new Dog();
       // d.print();
        System.out.println("------Dog print2--------");
        d.print();
        System.out.println("------Dog print2--------");
        Dog d2 =new Dog("小花",5,"red","泰迪");
        d2.print();

        /*
        实例化子类时父类做了什么
        1.实例化子类时，先跳到子类相匹配的构造方法，如果子类构造方法中没有指定调用父类哪个构造方法，则默认调用父类无参的构造方法，再执行子类的相匹配的构造方法。（调用父类的无参，并不会一定执行子类的无参）
        2.构造方法可能有无参，也有可能有带参，所以是相匹配的构造方法。
        3.父类JiChengTset的父类是Object类，执行了Object类的无参构造方法。父类也会执行父类的，直到执行结束它的父类为止。
        构造方法执行结束后，把对象的地址赋值给d3
        要是构造方法中没有打印语句，那么什么都不会出现。
         */

        System.out.println("------Dog3打印了什么--------");
        Dog d3 = new Dog();


        /*
        因为Dog子类有参构造方法中已经用super指定调用父类的有参构造方法了，所以会调用父类的有参构造。如果没指定调用父类的哪个构造方法，就会调用无参的构造方法


         */
        System.out.println("------Dog4打印了什么--------");
        Dog d4 = new Dog("小黄",1,"yellow","来福");





    }
}