import java.util.Arrays;

public class ex10 {

    public static String sort(String s) {
        char[] c = s.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }

    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        String n_s1 = sort(s1);
        String n_s2 = sort(s2);
        return n_s1.equals(n_s2);
    }

    public static void main(String[] args) {
        String s1 = "bagye";
        String s2 = "gyabe";

        System.out.println("Sorted: " + sort(s1));
        System.out.println("Are anagrams? " + isAnagram(s1, s2));
    }
}
