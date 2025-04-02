//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqr";

        String word3 = "";
        int i = 0;
        int j = 0;

        while(i < word1.length() || j < word2.length()) {
            word3 = word3 + word1.charAt(i);
            word3 = word3 + word2.charAt(j);

            i++;
            j++;
        }
        System.out.println(word3);
    }
}