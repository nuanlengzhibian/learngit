package leet_code;

import java.util.ArrayList;
import java.util.List;

public class Day690 {
    public static void main(String[] args) {
        Day690.getImportance(new ArrayList<Employee>(), 1);
    }
    public static int getImportance(List<Employee> employees, int id) {
        List<Employee> employees1 = employees;

        int res = 1;

        return res;

    }

}
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
}
