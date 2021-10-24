package Java_study;

public class OverLoadExer {
    //如下三个方式构成重载
    OverLoadExer test=new OverLoadExer();
    public void mOL(int a){
        System.out.println(a*a);
    }
    public void moL(int a,int b){
        System.out.println(a*b);
    }
    public void moL(String a){
        System.out.println(a);
    }

    public int max(int a,int b){
       return (a>b)?a:b; //运用三元运算符
    }
    public double max(double a,double b){
        return (a > b)? a:b;
    }
    public double max(double a,double b,double c) {
        double max = (a > b) ? a : b;
        return (max > c) ? max : c;
    }
}
