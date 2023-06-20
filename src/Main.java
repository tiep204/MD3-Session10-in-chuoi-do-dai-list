import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String str = "Rekkei Academy để nông dân biết code";
        List<String> list = new ArrayList<>(Arrays.asList(str.split(" ")));
        for (String s : list) {
            if (s.length()>5){
                System.out.println(s);
            }
        }
    }
}