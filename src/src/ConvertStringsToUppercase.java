import java.util.ArrayList;
import java.util.List;

public class ConvertStringsToUppercase {

    static void convertToUppercase(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i).toUpperCase());
        }
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("hello", "java", "world"));

        convertToUppercase(list);

        System.out.println(list);
    }
}
