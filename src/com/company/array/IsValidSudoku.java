package com.company.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class IsValidSudoku {

    public static void main(String[] args) {
        IsValidSudoku isValidSudoku = new IsValidSudoku();

        char[][] shudu = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        isValidSudoku.isValidSudoku(shudu);

    }

    public boolean isValidSudoku(char[][] board) {

        for (int i = 0; i < board.length; i++) {
            Map<String, String> map = new HashMap<>();
            for (char c : board[i]) {
              
                if (map.containsKey("" + c)) {
                    return false;
                }
            }
        }

        return false;
    }
}
