import java.util.*;

public class IntervalMerger {

    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        List<int[]> result = new ArrayList<>();
        int[] current = intervals[0];
        result.add(current);

        for (int[] interval : intervals) {
            if (interval[0] <= current[1]) {
                current[1] = Math.max(current[1], interval[1]); // overlap: extend
            } else {
                current = interval;      // no overlap: start new group
                result.add(current);
            }
        }

        return result.toArray(new int[0][]);
    }

    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int[][] merged = merge(intervals);
        for (int[] pair : merged) {
            System.out.println(Arrays.toString(pair));
        }
        // Expect: [1, 6]  [8, 10]  [15, 18]
    }
}