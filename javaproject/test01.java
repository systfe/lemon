package javaproject;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class test01 {
    public static void main(String[] args) throws Exception {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("test01.class"));
        oos.writeObject(new Student("张三", 20));
        oos.writeObject(new Student("李四", 21));
        oos.writeObject(new Student("王五", 22));
        oos.flush();
        oos.close();


        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("test01.class"));
        
        System.out.println(ois.readObject());
        
        
        ois.close();
    }
    
}
class Student implements Serializable{
    private String name;
    private int age;
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String toString() {
        return "姓名：" + name + " 年龄：" + age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
}