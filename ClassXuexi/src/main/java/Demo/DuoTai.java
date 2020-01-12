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
    public static void play(){
        System.out.println("猫打滚");
    }
}
class master{
    /**
     * 这里用了多态的写法   Pet pet =new BigDog()
     * pet代指一切宠物，指向不同的宠物。引用地址，指向不同的对象，很原始的道理。
     * 直接编写一个喂养的方法，再用多态的方式传参，因为子类已经重写了父类的方法，所以最终main方法中传 new BigDog()就指向了子类的方法。
     * 这样就不用给每个宠物单独编写一个喂养的方法
     * 多态的好处就是可以像这样减少代码的冗余，少写代码，要继承，多态，优先访问子类重写以后的方法
     */

    public void feed(Pet pet){
        pet.eat();
    }

    /**
     *     public void feed(BigDog dog){
     *         dog.eat();
     *     }
     *     public void feed(BigCat cat){
     *         cat.eat();
     *     }
     */
}
class Test2{
    public static void main(String[] args) {
        master m = new master();
        m.feed(new BigCat());
        m.feed(new BigDog());

        /**
         * 多态有两种类型转换
         *分向上转型和向下转型
         * 向上转型也叫做自动类型转换，构成多态时，引用名称只能访问父类中的实例变量和实例方法，但是优先访问子类重写以后的方法
         * 向下转型也叫强制类型转换，构成多态时，访问子类独有的属性或方法，必须进行向下转型。
         */
        Pet p;
        p = new BigCat();
        p = new BigDog();

        /**转型失败,报错  java.lang.ClassCastException    Demo.BigDog cannot be cast to Demo.BigCat，意思就是说狗不能强制转为猫（其他的子类）
         *  p已经引用了狗的对象，不能用来给猫用了，只能选一个
        BigCat cat = (BigCat)p;
        BigCat.play();
        BigDog dog = (BigDog)p;
        BigCat.play();
         *
         *
         *
         **/
        //在进行向下转型之前，如果符合再向下转型，用instanceof关键字，instanceof表示引用的对象是谁
        //执行前先判断有点像CBS的逻辑，因为不知道入参是啥。这里是引用的对象是谁，这个对象应该可以从别的地方拿过来，这样就和CBS一样说得通了。
        if(p instanceof BigCat){
            BigCat cat = (BigCat)p;
            BigCat.play();
        }else if(p instanceof BigDog){
            BigDog dog = (BigDog)p;
            BigDog.play();
        }



    }
}





