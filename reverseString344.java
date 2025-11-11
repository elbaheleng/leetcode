public class reverseString344 {
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
       for (int i = 0; i < s.length; i++) {
        if( i< (s.length-1-i)){
            char temp = s[i];
            s[i] = s[s.length-1-i];
            s[s.length-1-i] = temp;
        }
       }
       System.out.println(s);
    }
}
