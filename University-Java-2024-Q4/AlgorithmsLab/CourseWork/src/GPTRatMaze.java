public class GPTRatMaze {

    private static boolean isValidMove(String[][] maze, int x, int y, boolean[][] visited) {
        // Check boundaries and if the cell is valid to move into (path or exit)
        return x >= 0 && x < maze.length && y >= 0 && y < maze[0].length &&
                (maze[x][y].equals("■") || maze[x][y].equals("⛝")) &&
                !visited[x][y];
    }

    public static String moveBackTrackingRecursion(String[][] maze, int x, int y, int[] endIdx, boolean[][] visited) {
        // Base case: reached the exit
        if (x == endIdx[0] && y == endIdx[1]) {
            return ""; // Exit found
        }

        // Mark the current cell as visited
        visited[x][y] = true;

        // Define possible moves and their directions
        String[] moves = {"D", "R", "U", "L"};
        int[][] directions = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}}; // Down, Right, Up, Left

        // Try all possible moves
        for (int i = 0; i < moves.length; i++) {
            int newX = x + directions[i][0];
            int newY = y + directions[i][1];

            // Check if the move is valid
            if (isValidMove(maze, newX, newY, visited)) {
                String result = moveBackTrackingRecursion(maze, newX, newY, endIdx, visited);
                if (result != null) {
                    return moves[i] + result; // Add the move to the path
                }
            }
        }

        // Backtrack: unmark the cell as visited
        visited[x][y] = false;

        return null; // No valid path found
    }

    public static void main(String[] args) {
        String[][] maze = {{"⚿", "□", "□", "□"},
                           {"■", "■", "□", "■"},
                           {"□", "■", "□", "□"},
                           {"■", "■", "■", "⛝"}};

        int[] exitIdx = new int[2];
        int[] startIdx = new int[2];

        // Find start and exit positions
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                if (maze[i][j].equals("⚿")) {
                    startIdx[0] = i;
                    startIdx[1] = j;
                } else if (maze[i][j].equals("⛝")) {
                    exitIdx[0] = i;
                    exitIdx[1] = j;
                }
            }
        }

        boolean[][] visited = new boolean[maze.length][maze[0].length];
        String path = moveBackTrackingRecursion(maze, startIdx[0], startIdx[1], exitIdx, visited);

        if (path != null) {
            System.out.println("Path to exit: " + path);
        } else {
            System.out.println("No path found.");
        }
    }
}
