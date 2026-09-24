import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeating {

    public static char firstNonRepeating(String s) {
        Map<Character, Integer> counts = new HashMap<>();

        // Pass 1: count every character
        for (char c : s.toCharArray()) {
            counts.merge(c, 1, Integer::sum);
        }

        // Pass 2: walk the string IN ORDER, return first with count == 1
        for (char c : s.toCharArray()) {
            if (counts.get(c) == 1) {
                return c;
            }
        }

        return '_'; // no non-repeating character found
    }

    public static void main(String[] args) {
        System.out.println(firstNonRepeating("swiss"));      // expect 'w'
        System.out.println(firstNonRepeating("aabbcc"));     // expect '_'
        System.out.println(firstNonRepeating("teeter"));     // expect 'r'
        System.out.println(firstNonRepeating("x"));          // expect 'x'
        System.out.println(firstNonRepeating(""));           // expect '_'
    }
}