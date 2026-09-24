import java.util.*;

public class SyntaxDrill {

    public static void main(String[] args) {

        // The four collections that cover 90% of problems
        List<String> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        Deque<Integer> stack = new ArrayDeque<>();  // also doubles as a queue

        // List operations
        list.add("apple");
        list.add("banana");
        System.out.println(list.get(0));        // apple
        System.out.println(list.size());        // 2
        System.out.println(list.contains("apple")); // true
        list.remove(0);                          // removes by INDEX -> removes "apple"
        list.add("cherry");
        list.remove((Object) "cherry");          // removes by VALUE -> removes "cherry"
        Collections.sort(list);

        // Arrays
        int[] a = {5, 3, 1, 4};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));  // [1, 3, 4, 5]
        int rows = 3, cols = 3;
        int[][] grid = new int[rows][cols];

        // Strings (Strings are IMMUTABLE -- use StringBuilder in loops)
        String s = "hello";
        System.out.println(s.length());          // 5
        System.out.println(s.charAt(1));          // e
        System.out.println(s.substring(1, 3));    // el
        String[] parts = s.split("l");
        System.out.println(Arrays.toString(parts));
        System.out.println(s.trim().toUpperCase());
        System.out.println(s.equals("hello"));    // true -- NEVER use == for string content
        char[] chars = s.toCharArray();
        System.out.println(new StringBuilder(s).reverse().toString()); // olleh

        // Stack via Deque
        stack.push(10);
        stack.push(20);
        System.out.println(stack.peek());         // 20
        stack.pop();                                // note: pop() needs parentheses!
        System.out.println(stack.isEmpty());       // false

        // Conversions
        int n = Integer.parseInt("42");
        String numAsString = String.valueOf(99);
        char c = '7';
        int digit = c - '0';                        // char digit to int -> 7
        System.out.println(digit);
    }
}