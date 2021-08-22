import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> words = new ArrayList<String>();
        for (int i = 0; i <3; i++) {
            words.add(reader.readLine());
        }
        Map<String, Integer> map = CountUniqueWords.countWords (words);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

}



