public class RatMaze {

    public static String moveBackTrackingRecursion(String[][] maze, int[] startIdx, int[] endIdx, String str){
        String[] moves = {"UP", "LEFT", "RIGHT", "DOWN"};
        int startIdx_X = startIdx[0];
        int startIdx_Y = startIdx[1];

        if(maze[startIdx_X][startIdx_Y - 1].equals("■") && startIdx_Y != maze.length - 1){
            startIdx[1] -= 1;
            return str + "U" + moveBackTrackingRecursion(maze, startIdx, endIdx, str);
        }else if(maze[startIdx_X - 1][startIdx_Y].equals("■") && startIdx_X != 0){
            startIdx[0] -= 1;
            return str + "L" + moveBackTrackingRecursion(maze, startIdx, endIdx, str);
        }else if(maze[startIdx_X + 1][startIdx_Y].equals("■") && startIdx_X != maze.length - 1){
            startIdx[0] += 1;
            return str + "R" + moveBackTrackingRecursion(maze, startIdx, endIdx, str);
        }else if(maze[startIdx_X][startIdx_Y + 1].equals("■") && startIdx_X != maze.length - 1){
            startIdx[1] += 1;
            return str + "D" + moveBackTrackingRecursion(maze, startIdx, endIdx, str);
        }

        // Thought: Path prints out like LLUULU (Left, Left, Up....)

        // If left index[X][Y] = index[X-1][Y]
        // If right index[X][Y] = index[X+1][Y]
        // If up index[X][Y] = index[X][Y-1]
        // If down index[X][Y] = index[X][Y+1]

        // Check if out of bounds!!!!!!!!!!!!

        // Finally return string of moves that get to end goal ->
        // return move [ULRD] + func(maze, movedIndexes, endgoalIdx)

        // PROBLEM -> if mouse goes into a dead end and has to backtrack multiple spots
        // What to do?
        // [Save last indexes]?
        // [If rat went up, go down and try again?]
        // [How would it know to not go back up again?]

        return str;
    }

    public static void main(String[] args) {
        String[][] maze = {{"⚿", "□", "□", "□"},  // 00 01 02 03
                           {"■", "■", "□", "■"},  // 10 11 12 13
                           {"□", "■", "□", "□"},  // 20 21 22 23
                           {"■", "■", "■", "⛝"}}; // 30 31 32 33

        int[] exitIdx = new int[2];
        int[] startIdx = new int[2];
        String emptyStr = "";

        // Get indexes for start and finish in an int array -> start[x,y], end[x,y];
        for(int i = 0; i < maze.length; i++){
            for(int j = 0; j < maze[i].length; j++){
                if(maze[i][j].equals("⚿")){
                    exitIdx[0] = i;
                    exitIdx[1] = j;
                } else if (maze[i][j].equals("⛝")){
                    startIdx[0] = i;
                    startIdx[1] = j;
                }
            }
        }


        System.out.println(maze[exitIdx[0]][exitIdx[1]]);
        System.out.println(moveBackTrackingRecursion(maze, startIdx, exitIdx, emptyStr));
    }
}