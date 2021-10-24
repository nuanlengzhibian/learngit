package Java_study;

public class StudentTest {
    public static void main(String[] args) {
        Student[] p = new Student[20];
        for(int i=0; i< p.length ;i++){
            //给数组元素赋值
            p[i]=new Student();
            p[i].number = i+1;
            // 年级，[1，6]
            p[i].state = (int)(Math.random()*(6-1+1)+1);
            p[i].score = (int)(Math.random()*(100-0+1)+0);
        }
        for (int i=0;i< p.length;i++) {
            System.out.println(p[i].info());
        }
       // System.out.println((int)1.1);
        for (int i = 0;i< p.length-1;i++){
            for (int j=i+1;j<p.length;j++){
                if(p[i].score>p[j].score){
                    Student temp = p[i];
                    p[i] = p[j];
                    p[j] = temp;
                }
            }
        }
        System.out.println("**************");
        for (int i=0;i< p.length;i++){
            System.out.println(p[i].info());
        }
    }

}
class Student extends Person{
    int number;//学号
    int state;//年级
    int score;//成绩
    //显示学生信息的方法

    public String info(){
        return "学号："+number+",年级："+state+",成绩："+score;
    }
}
