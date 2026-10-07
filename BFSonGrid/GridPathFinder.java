import java.util.*;

public class GridPathFinder {

    public static boolean hasPath(int[][] grid) {
        int rows = grid.length, cols = grid[0].length;
        if (grid[0][0] == 1)
            return false;

        boolean[][] visited = new boolean[rows][cols];
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] { 0, 0 });
        visited[0][0] = true;
        int[][] dirs = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };

        while (!queue.isEmpty()) {
            int[] cur = queue.poll(); // fixed: was .pol()
            if (cur[0] == rows - 1 && cur[1] == cols - 1)
                return true;

            for (int[] d : dirs) {
                int nr = cur[0] + d[0], nc = cur[1] + d[1];
                if (nr >= 0 && nr < rows && nc >= 0 && nc < cols
                        && !visited[nr][nc] && grid[nr][nc] == 0) {
                    visited[nr][nc] = true;
                    queue.add(new int[] { nr, nc });
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] grid = {
                { 0, 0, 1 },
                { 0, 1, 0 },
                { 0, 0, 0 }
        };
        System.out.println(hasPath(grid)); // expect: true
    }
}