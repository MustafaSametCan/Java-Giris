import java.util.ArrayList;

public class LongestWord {

    static ArrayList<String> longestWords(String[] dictionary) {
        ArrayList<String> list = new ArrayList<String>();
        int longest_length = 0;
        for (String str : dictionary) {
            int length = str.length();
            if (length > longest_length) {
                longest_length = length;
                list.clear();
            }
            if (length == longest_length) {
                list.add(str);
            }

        }
        return list;

    }

    public static void main(String[] args) {
        String[] dict = {"kedi", "köpek", "kırmızı", "sen", "ben", "o"};
        System.out.println("Longest word(s) of the above dictionary: "+longestWords(dict));
    }
}
