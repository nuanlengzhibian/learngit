package leet_code;

public class Day12 {
    public static void main(String[] args) {
        System.out.println(Day12.intToRoman(1994));
    }
    public static String intToRoman(int num) {
        StringBuilder res = new StringBuilder();

        for (int a = num/1000;a > 0;a--){
            res.append("M");
        }
        num = num % 1000;

        for (int a = num/100;a > 0;a--){
            if (a == 4){
                res.append("CD");
                break;
            }
            else if (a == 9){
                res.append("CM");
                break;
            }
            if (a >= 5){
                res.append("D");
                a = a - 4;
                continue;
            }
            res.append("C");
        }
        num = num % 100;

        for (int a = num/10;a > 0;a--){
            if (a == 4){
                res.append("XL");
                break;
            }
            else if (a == 9){
                res.append("XC");
                break;
            }
            if (a >= 5){
                res.append("L");
                a = a - 4;
                continue;
            }
            res.append("X");
        }
        num = num % 10;

        for (int a = num;a > 0;a--){
            if (a == 4){
                res.append("IV");
                break;
            }
            else if (a == 9){
                res.append("IX");
                break;
            }
            if (a >= 5){
                res.append("V");
                a = a - 4;
                continue;
            }
            res.append("I");
        }

        return res.toString();
    }
//    int values[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
//    string reps[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
//
//    string res;
//        for(int i=0; i<13; i++){
//        while(num>=values[i]){
//            num -= values[i];
//            res += reps[i];
//        }
//    }
//        return res;
}
