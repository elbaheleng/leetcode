import java.util.HashMap;

public class validAnagram242 {
    public static void main(String[] args) {
        String s = "anagram";
        String  t = "nagaram";
        HashMap<Character,Integer> s1 = new HashMap<>();
        HashMap<Character,Integer> t1 = new HashMap<>();
        for (int index = 0; index < s.length(); index++) {
            s1.put(s.charAt(index), s1.getOrDefault(s.charAt(index), 0) + 1);
        }
        for (int index = 0; index < t.length(); index++) {
            t1.put(t.charAt(index), t1.getOrDefault(t.charAt(index), 0) + 1);
        }
        if (s1.equals(t1)){
            System.out.println("true");
        } else {
                        System.out.println("False");

        }

    }
}
