public class ex11 {
    public static String swap(String s){
        StringBuilder sb = new StringBuilder();
        String[] s_array = s.split(" ");
        for(int i = 0; i < s_array.length; i++){
            if(s_array[i].length() > 1){
                char[] c = s_array[i].toCharArray();
                char temp = c[0];
                c[0] = c[c.length - 1];
                c[c.length - 1] = temp;
                sb.append(c);
            } else {
                sb.append(s_array[i]);
            }
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        String sentence = "This is PP2";
        System.out.println(swap(sentence));
    }
}
