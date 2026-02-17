import java.util.Arrays;

public class ex09 {

    public static String sort(String s){
        char[] c = s.toCharArray();

        /* My try on this, but it didn't really work
        for(int i = 0; i < c.length - 1; i++){
            for(int j = i + 1; j < c.length; j++){
                if(c[i] > c[j]){
                    char replacement = c[i];
                    c[i] = c[j];
                    c[j] = replacement;
                }
            }
        }
        */

        Arrays.sort(c);
        return new String(c);
    }

    public static void main(String[] args){
        String s1 = "bagye";
        System.out.println(sort(s1));
    }
}
