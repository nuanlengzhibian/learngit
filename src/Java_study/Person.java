package Java_study;
import java.math.*;

public class Person {
    String name;
    int age;
    public Person(){

    }
    public Person(String name,int age){
        this.age = age;
        this.name = name;
    }
//    public void setName(String i) {
//
//    }
//
//    public String getName() {
//        return name;
//    }
    public void eat(){
        System.out.println("吃饭");
    }
    public void sleep(){
        System.out.println("睡觉");
    }
}
