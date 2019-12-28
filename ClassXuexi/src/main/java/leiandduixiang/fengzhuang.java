package leiandduixiang;

 class fengzhuang {
    //属性
     String name;
     char sex;
     private int age;  //加了 private后，就只能在当前类中使用，隐藏类的内部信息，外部程序通过方法访问
    //编辑对应属性的赋值set和取值get方法
    public  void setAge(int age){  //int这里传参
            if(age >=0 && age<=120){
                this.age= age;//int age里的age是局部变量，传进来的参数需要赋值给成员变量
            }else{
                this.age = 18;
            }
     }
            //返回值的类型
     public int getAge() {
        return age;
     }
 }
 //创建学生测试类
 class StudentTest{
     public static void main(String[] args) {
         fengzhuang sdu = new fengzhuang();
         sdu.name = "张三";
         sdu.setAge(19);
         System.out.println("年龄"+ sdu.getAge());
     }
 }
