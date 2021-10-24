package leet_code.string;

public class Day58 {
    public static void main(String[] args) {
        System.out.println(Day58.lengthOfLastWord("   fly me   to   the moon  "));
    }
    public static int lengthOfLastWord(String s) {
        int n = s.length();
        int count = 0;
        int temp = 0;
        for (int i = 0;i < n;i++){
            if (s.charAt(i) != ' '){
                count++;
            }else{
                if (count > 0)
                    temp = count;
                count = 0;
            }

        }

        return count == 0 ? temp : count;

    }
}
