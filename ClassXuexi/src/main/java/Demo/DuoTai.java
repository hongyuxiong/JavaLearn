package Demo;

/**
 * 实现主人喂养宠物
 *
 */
class Pet{
     public void eat(){
         System.out.println("正在吃");
     }
}
class BigDog extends Pet{
    @Override
    public void eat() {
        System.out.println("狗正在吃肉");
    }
    public static void play(){
        System.out.println("狗打滚");
    }
}
class BigCat extends Pet{
    @Override
    public void eat(){
        System.out.println("猫正在吃鱼");
    }
    public static void catching(){
        System.out.println("猫打滚");
    }
}
class master{
    /**
     *
     *
     * 多态的条件：  子类必须继承父类，子类重写父类的方法，父类类名  引用名称 = new 子类类名();
     *
     *
     * pet代指一切宠物，指向不同的宠物。引用地址，指向不同的对象，很原始的道理。
     * 直接编写一个喂养的方法，再用多态的方式传参，因为子类已经重写了父类的方法，所以最终main方法中传 new BigDog()就指向了子类的方法，
     * 多态的好处就是可以像这样少写代码，继承以后多态，优先访问子类重写以后的方法,如果没有重写父类的方法，就会访问父类的方法（不重写 ，还多态干嘛）
     * public后面的static加不加要看需不需要实例，没实例就不加static，加了也不报错
     *
     */
                    // Pet 是父类的类型，类似int，还要把 Pet pet看成形参，混合知识点
    public void feed(Pet pet){
        pet.eat();
    }

    /**
     *    上面的pet.eat(); 和下面的一段是一样的作用
     *     public void feed(BigDog dog){   BigDog是类型，  类似 int
     *         dog.eat();
     *     }
     *     public void feed(BigCat cat){
     *         cat.eat();
     *     }
     *
     *      Pet pet  是上面函数的形参， new BigCat() 是实参，所以下面调用方法时传的是实参new BigCat()
     *      Pet pet = new BigCat()  子类对象赋给父类类型
     *      Pet pet = new BigDog() 子类对象赋给父类类型
     */
}
class Test2{
    public static void main(String[] args) {
        master m = new master();
        /*
        BigCat d = new BigCat（）；
        m.feed(d);
        m.feed(new BigCat());

         */
       //用多态的方式调用猫狗子类中吃的方法
        m.feed(new BigCat());
        m.feed(new BigDog());

        /*
         * 多态有两种类型转换
         * 分向上转型和向下转型
         * 向上转型   父类类型   引用名称 = new 子类类名();
         * 向上转型也叫做自动类型转换，构成多态时，引用名称只能访问父类中的实例变量和实例方法，但是优先访问子类重写以后的方法
         * 向下转型也叫强制类型转换，构成多态时，访问子类独有的属性或方法，必须进行向下转型。
         * 反过来说，当继承了，并且已经多态时，要访问子类独有的属性或方法，不止一个子类的时候，就要向下转型，把父类的引用地址强制转换为子类类型
         *
         *  用引用名称调用方法，而不是 BigCat这样的类型调用方法，是看做类型，不能混淆
         *  如果用类名调用方法，那么这个Cat的引用名称就毫无意义。
         *  括号中的BigCat看成类型，把 p强制转换为 BigCat类型。在这里的用法就是把父类类型的p强制转换为 子类类型
         *  double a =3.14; int b = (int)a;  强制转换
            BigCat cat = (BigCat)p;
            cat.play();
            BigDog dog = (BigDog)p;
            转型失败,报错  java.lang.ClassCastException    Demo.BigCat cannot be cast to Demo.BigDog，意思就是说猫不能强制转为狗（其他的子类）
            p已经引用了猫的对象，不能用来给狗用了，只能选一个
            dog.play();

        在进行向下转型之前，如果符合向下转型，用instanceof关键字，instanceof用来判断当前引用的对象是谁，是猫就输出猫的方法
        执行前先判断有点像CBS的逻辑，因为不知道入参是啥。这里是判断引用的对象是谁，这个对象在实际应用中应该可以从别的地方拿过来，这样就和CBS一样说得通了
        */
        Pet p;
        p = new BigCat();
        p = new BigDog();
        if(p instanceof BigCat){
            BigCat cat = (BigCat)p;
            cat.catching();
        }else if(p instanceof BigDog){
            BigDog dog = (BigDog)p;
            dog.play();
        }



    }
}





