package leiandduixiang;

/**
 * 某汽车租赁公司有多种汽车可以出租，计算汽车的租金
 * Vehicle是所有车的父类。，属性：品牌，车牌号
 *方法：返回总租金的方法：public double getSunmRent(int days){}
 * Car:小轿车类是Vehicle的子类，属性：车型（两厢，三厢，越野）
 * 两厢：每天300，三厢：每天350，越野：每天500
 * Bus：也是Vehicle的子类，属性：座位数
 * 座位数<=16 ：每天400
 * 座位数>16 ：每天600
 * 测试类：
 * 根据用户选择的车型，计算总租金并输出总租金
 */
 class Vehicle{
        //属性：品牌，车牌号
        String brand;
        String id;

        //方法：返回总租金的方法 并在子类中重写
        public double getSumRent(int days){
             return  0;
         }
         public void print(){
             System.out.println("ok");
         }
}
class LittleCar extends Vehicle{
     //属性：车型（两厢，三厢，越野）
    String type ="";
    //重写父类的总租金方法
    public double getSumRent(int days){
        //当表达式的值为null时，不允许与case，default常量值进行比较，否则就会出现异常。
        //根据车型，算出日租金
         switch(type){
             case "两厢":return 300*days;
             case "三厢":return 350*days;
             //case "越野":return 500*days;如果不改为default，就要在switch外面加上一个return，要么就要在所有的case结束后加default。
             default  : return 500*days;
         }
       // return 1;
    }
}
class Bus extends Vehicle{
     int seat;
    public double getSumRent(int days){
        if(seat <=16){
            return 400*days;
        }else{
            return  600*days;
        }
    }
}
//编写测试类
class money{
    public static void main(String[] args) {
        /*
        //创建小轿车子类对象
        LittleCar car =new LittleCar();
        //输出总租金  因为默认赋值是空，所以是default的值，算出来是500
        System.out.println("总租金： "+car.getSumRent(1));

        Bus bus = new Bus();
        System.out.println("总租金： "+bus.getSumRent(5));
        */
        /**
         多态语法   父类类名  引用名称 = new 子类类名();
         当构成多态时，引用名称是父类类型，只能访问父类中的实例变量和实例方法，但是优先访问子类重写以后的方法
         多态是多个对象调用同一个方法得到不同的结果叫做多态

         多态的条件:
         1.子类必须继承父类
         2.子类必须重写父类的方法
         3.必须要构成多态的语法     父类类名  引用名称 = new 子类类名();
         */
        Vehicle car = new LittleCar();
        System.out.println("-----访问父类的实例变量------");
        System.out.println(car.brand);
        System.out.println(car.id);
        //System.out.println(car.type); type是子类的实例变量，会报错。
        System.out.println("------调用父类的实例方法-----");
        car.print();
        System.out.println(car.getSumRent(1));

        //另一种用法
        Vehicle v;
        //构成多态
        v = new Bus();
        System.out.println("打印Bus的租金");
        System.out.println("总租金" + v.getSumRent(3));
        System.out.println(System.identityHashCode(v));
        // v是局部变量，也是引用名称，只是变了以后，Bus这个对象就不存在了，地址变了
        v = new LittleCar();
        System.out.println("打印Car的租金");
        System.out.println("总租金" + v.getSumRent(2));
        System.out.println(System.identityHashCode(v));





















    }
}









































