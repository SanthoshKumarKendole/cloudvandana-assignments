import java.util.HashMap;

public class RomanToInt {

    public static int roman(String s) {

        if (s == null || s.length() == 0)
            return -1;

        System.out.println("Roman Number: " + s);
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int res = map.get(s.charAt(s.length() - 1));
        for (int i = s.length() - 2; i >= 0; i--) {
            if (map.get(s.charAt(i)) >= map.get(s.charAt(i + 1)))
                res += map.get(s.charAt(i));
            else
                res -= map.get(s.charAt(i));
        }

        System.out.println("Integer: " + res);
        System.out.println();
        return res;
    }

    public static void main(String[] args) {
        roman("I");
   
    }
}

