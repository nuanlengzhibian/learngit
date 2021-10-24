package Java_study;

public class Circletest {
    public static void main(String[] args) {
        Circle c1= new Circle();
        c1.radius = 2.1;
        c1.findArea();
    }
}
class Circle{
    double radius;

    public void findArea(){
        double area = Math.PI*radius*radius;
        System.out.println("面积为"+area);

    }
}
