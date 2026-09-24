import java.util.*;

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] words) {
        Map<String, List<String>> groups = new HashMap<>();

        for (String w : words) {
            char[] chars = w.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars); // sorted letters = the bucket key

            groups.computeIfAbsent(key, k -> new ArrayList<>()).add(w);
        }

        return new ArrayList<>(groups.values());
    }

    public static void main(String[] args) {
        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = groupAnagrams(words);
        System.out.println(result);
        // Expect something like: [[eat, tea, ate], [tan, nat], [bat]]
        // (group order isn't guaranteed, but the contents of each group are fixed)
    }
}