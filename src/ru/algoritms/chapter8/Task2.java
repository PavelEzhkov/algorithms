package ru.algoritms.chapter8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Task2 {
    ArrayList<Point> getPath(boolean[][] maze){
        if (maze == null|| maze.length == 0) return  null;
        ArrayList<Point> path = new ArrayList<>();
        HashMap<Point, Boolean> cache = new HashMap<>();
        int lastRow = maze.length -1;
        int lastCol = maze[0].length -1;
        if (getPath(maze, lastRow, lastCol, path,cache)){
            return path;
        }
        return null;
    }

    private boolean getPath(boolean[][] maze, int row, int col, ArrayList<Point> path, HashMap<Point, Boolean> cache) {
        if (col<0 || row<0 || !maze[row][col]) {
            return false;
        }
        Point p = new Point(row, col);

        if (cache.containsKey(p)){
            return cache.get(p);
        }

        boolean isAtOrigin = (row == 0) && (col==0);
        boolean success = false;

        if (isAtOrigin || getPath(maze, row, col-1, path, cache) || getPath(maze,row-1, col, path,cache)){
            path.add(p);
            success =true;
        }

        cache.put(p,success);
        return success;
    }
}
