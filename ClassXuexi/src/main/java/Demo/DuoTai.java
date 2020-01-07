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
}
class BigCat extends Pet{
    @Override
    public void eat(){
        System.out.println("猫正在吃鱼");
    }
}
class master{
    /**
     * 这里用了多态的写法   Pet pet =new BigDog()
     * pet代指一切宠物，指向不同的宠物。引用地址，指向不同的对象，很原始的道理。
     * 直接编写一个喂养的方法，再用多态的方式传参，不用给每个宠物单独编写一个喂养的方法
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
    }
}





