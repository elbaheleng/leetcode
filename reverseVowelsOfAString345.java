import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class reverseVowelsOfAString345 {
    public static void main(String[] args) {
        String s = "IceCreAm";
        HashSet<Character> vowels = new HashSet<>();
        // StringBuilder vow = new StringBuilder();
        StringBuilder result = new StringBuilder(s);
        // List<Integer> in = new ArrayList<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
        // for (int index = 0; index < s.length(); index++) {
        // if (vowels.contains(s.charAt(index))) {
        // vow.append(s.charAt(index));
        // in.add(index);
        // }
        // }
        // for (int index = 0; index < in.size(); index++)
        // result.setCharAt(in.get(index), vow.charAt(in.size()-1-index));
        int left = 0;
        int right = s.length() - 1;
        while (left <= right) {
            if (vowels.contains(s.charAt(left))) {
                if (vowels.contains(s.charAt(right))) {
                    result.setCharAt(right, s.charAt(left));
                    result.setCharAt(left, s.charAt(right));
                    left++;
                    right--;
                } else {
                    right--;
                }
            } else {
                left++;
            }
        }
        System.out.println(result);
    }
}
