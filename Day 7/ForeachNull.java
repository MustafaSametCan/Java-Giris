
import java.util.ArrayList;
import java.util.List;

public class ForeachNull {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("");
        list.add("Samet");
        list.add(null);
        list.add(".");

        for (String item : list) {
            if (item != null && !item.isEmpty()) {  // Check the null and empty items and don't print them.
                System.out.println(item);
            }
        }
    }
}