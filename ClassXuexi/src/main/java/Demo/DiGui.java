package Demo;

public class DiGui {
    /**递归：方法自己调用自己，必须保证有出口，不然会无限调用
    递归完成  n！,无限调用自己，传入3，变成mul(2),就变成2*1，最后就变成3*2*1
     这种递归的东西要想到无限用自己，

     */

    public static int mul(int n){
         if(n == 0|| n==1){
             return 1;
         }
         //   后面* mul()就是乘自己
         return n * mul(n - 1);
    }
    public static void main(String[] args) {
        System.out.println(mul(3));
    }
}
