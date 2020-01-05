package Demo;

class fengzhuang2 {
        private String name;
        private char sex;
        private  int age;

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(char sex) {
        //性别只能为男或女，否则为男.  条件中的sex是局部变量，
        if(sex == '男' || sex=='女'){
            this.sex = sex;
        }else{
            this.sex = '男';
        }

    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }
}
class CatTest{
    public static void main(String[] args) {
        fengzhuang2 a = new fengzhuang2();
        a.setAge(19);
        a.setName("小白兔");
        a.setSex('男');
        System.out.println("年龄"+a.getAge()+"\n性别"+a.getSex()+"\n姓名"+a.getName());
    }
}

