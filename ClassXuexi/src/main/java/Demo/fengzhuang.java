package Demo;

 class FengZhuang {
     String name;
     char sex;
     /**
      * 加了 private后，就只能在当前类中使用，隐藏类的内部信息，外部程序通过方法访问
     */

     private int age;

     /**
      * 编辑对应属性的赋值set和取值get方法
      * @param age
      */
    public  void setAge(int age){  //int这里传参
            if(age >=0 && age<=120){
                //int age里的age是局部变量，传进来的参数需要赋值给成员变量
                this.age= age;
            }else{
                this.age = 18;
            }
     }

     /**返回值的类型为int型
      *
      * @return
      */
     public int getAge() {
        return age;
     }
 }

 class StudentTest{
     public static void main(String[] args) {
         FengZhuang sdu = new FengZhuang();
         sdu.name = "张三";
         sdu.setAge(19);
         System.out.println("年龄"+ sdu.getAge());
     }
 }
