package Java_study;
import java.util.Date;

public class Employeetest {
    public static void main(String[] args){
        /* 使用构造器创建两个对象 */
//        Employee empOne = new Employee("RUNOOB1");
//        Employee empTwo = new Employee("RUNOOB2");
//
//        // 调用这两个对象的成员方法
//        empOne.empAge(26);
//        empOne.empDesignation("高级程序员");
//        empOne.empSalary(1000);
//        empOne.printEmployee();
//        System.out.print("\n");
//        empTwo.empAge(21);
//        empTwo.empDesignation("菜鸟程序员");
//        empTwo.empSalary(500);
//        empTwo.printEmployee();
//
//        Date date = new Date();
//        // 使用 toString() 函数显示日期时间
//        System.out.println(date.toString());
//
        // 初始化 Date 对象
        Date date = new Date();

        //c的使用
        System.out.printf("全部日期和时间信息：%tc\n",date);
        //f的使用
        System.out.printf("年-月-日格式：%tF%n",date);
        //d的使用
        System.out.printf("月/日/年格式：%tD%n",date);
        //r的使用
        System.out.printf("HH:MM:SS PM格式（12时制）：%tr%n",date);
        //t的使用
        System.out.printf("HH:MM:SS格式（24时制）：%tT%n",date);
        //R的使用
        System.out.printf("HH:MM格式（24时制）：%tR",date);

    }
}
