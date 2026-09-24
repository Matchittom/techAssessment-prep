import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;

public class BalancedBrackets {
    public static boolean isBalanced(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        Map<Character, Character> pairs = Map.of(')', '(', ']', '[', '}', '{');

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (pairs.containsKey(c)) {
                if (stack.isEmpty() || stack.pop() != pairs.get(c)) {
                    return false;
                }
            }
            // any other character is ignored
        }

        return stack.isEmpty(); // true only if every opener got closed
    }

    public static void main(String[] args) {
        System.out.println(isBalanced("([{}])"));   // true
        System.out.println(isBalanced("([)]"));      // false — wrong order
        System.out.println(isBalanced("((("));       // false — never closed
        System.out.println(isBalanced(")"));          // false — closes nothing
        System.out.println(isBalanced(""));            // true — vacuously balanced
    }
}
