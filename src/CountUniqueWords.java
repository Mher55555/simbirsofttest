import java.util.HashMap;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Map;

class CountUniqueWords {
        public static Map<String, Integer> countWords(ArrayList<String> list) {
            HashMap<String, Integer> result = new HashMap<String, Integer>();

            for (int i = 0; i < list.size(); i++) {
                int count = 0;
                for (int j = 0; j < list.size(); j++) {
                    if (list.get(i).equals(list.get(j))) {
                        count++;
                    }
                }
                result.put(list.get(i), count);
            }
            return result;
        }

    }
