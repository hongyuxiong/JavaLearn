package com.bao.baobao;


import com.kfc.mdl.chick;

/**
 *使用packge关键字定义包，oackge定义包的语句必须作为源文件的第一条语句
 *包名的命名规则： 公司域名的倒序，项目名，模块名，子模块名
 *  编辑包  javac -d . Test.java
 *  -d 可以指定生成字节码文件的目录
 *  小点  .  表示当前目录
 *  编译后，系统会在当前目录生成与包名对应的文件夹，把字节码文件存储到该文件夹中
 *  运行的方法   java  com.bao.baobao.Bao
 *  com.bao.baobao.Bao称为完整类名   Bao称为简易类名
 *  java后面跟完整类名
 *  导入其它包，可以直接通过简易类名调用类中的方法，用import
 *  被使用的类必须定义为用public修饰的公共类
 *
 */

public class Bao extends chick {
    public static void main(String[] args) {
        System.out.println("Hello World");
        chick.diaoyong3();
    }
}
