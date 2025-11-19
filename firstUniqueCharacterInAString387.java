import java.util.HashMap;

public class firstUniqueCharacterInAString387 {
    public static void main(String[] args) {
        // String s = "aabb";
        // HashMap<Character,Integer> occurance = new HashMap<>();
        // for (int index = 0; index < s.length(); index++) {
        // if( occurance.containsKey(s.charAt(index)) ){
        // occurance.put(s.charAt(index), occurance.get(s.charAt(index))+1);
        // } else {
        // occurance.put(s.charAt(index), 1);
        // }
        // }
        // for (int index = 0; index < s.length(); index++) {
        // if( occurance.get(s.charAt(index)) == 1 ){
        // System.out.println(index);
        // }
        // }
        // return -1;
        //////////////////////////////////////////////////////////
        /// 
        /// // String s = "aabb";
        // HashMap<Character,Integer> occurance = new HashMap<>();
        // for (int index = 0; index < s.length(); index++) {
        //  occurance.put(s.charAt(index), occurance.getOrDefault(s.charAt(index), 0) + 1);
        // }
        // for (int index = 0; index < s.length(); index++) {
        // if( occurance.get(s.charAt(index)) == 1 ){
        // System.out.println(index);
        // }
        // }
        // return -1;
        //////////////////////////////////////////////////////////////
        String s = "loveleetcode";
        for (int i = 0; i < s.length(); i++) {
            boolean repeat = false;
            for (int j = 0; j < s.length(); j++) {
                if (i != j) {
                    if (s.charAt(i) == s.charAt(j)) {
                        repeat = true;
                    }
                }
                if (j == s.length() - 1 && repeat == false) {
                    System.out.println(i);
                }
            }
        }
        System.out.println("-1");
        /////////////////////////////////////////////////////////////

    }
}
