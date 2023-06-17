package com.shooter.game;

import com.badlogic.gdx.graphics.Texture;

public class Map {
    public static final int[][] WALLS_TO_UP_COL = new int[][] {{4,2}, {5,2}, {6,2}, {7,2}, {1,5}, {2,5}, {3,5}, {4,5},
            {7,5}, {8,5}, {9,5}, {10,5}, {4,8}, {5,8}, {6,8}, {7,8},
            {0,11}, {1,11}, {2,11}, {3,11}, {4,11}, {5,11}, {6,11}, {7,11}, {8,11}, {9,11}, {10,11}, {11,11}, {12,11}};

    public static final int[][] WALLS_TO_DOWN_COL = new int[][] {{4,2+1}, {5,2+1}, {6,2+1}, {7,2+1}, {1,5+1}, {2,5+1}, {3,5+1}, {4,5+1},
            {7,5+1}, {8,5+1}, {9,5+1}, {10,5+1}, {4,8+1}, {5,8+1}, {6,8+1}, {7,8+1},
            {0,0}, {1,0}, {2,0}, {3,0}, {4,0}, {5,0}, {6,0}, {7,0}, {8,0}, {9,0}, {10,0}, {11,0}, {12,0}};
    public static final int[][] WALLS_TO_RIGHT_COL = new int[][] {{4,2}, {4,2+1}, {1,5}, {1,5+1}, {4,8}, {4,8+1}, {7,5}, {7,5+1},
            {11,0}, {11,1}, {11,2}, {11,3}, {11,4}, {11,5}, {11,6}, {11,7}, {11,8}, {11,9}, {11,10}, {11,11}, {11,12}};

    public static final int[][] WALLS_TO_LEFT_COL = new int[][] {{7,2}, {7,2+1}, {4,5}, {4,5+1}, {10,5}, {10,5+1}, {7,8}, {7,8+1},
            {0,0}, {0,1}, {0,2}, {0,3}, {0,4}, {0,5}, {0,6}, {0,7}, {0,8}, {0,9}, {0,10}, {0,11}, {0,12}};


    public static final Texture MAP_PICTURE = new Texture("Shooter_map.png");;

    public static boolean checkUpCollusion(int x, int y) {
        for (int i = 0; i < WALLS_TO_UP_COL.length; i++) {
            if (x == WALLS_TO_UP_COL[i][0] && y == WALLS_TO_UP_COL[i][1]) return true;
        }
        return false;
    }

    public static boolean checkDownCollusion(int x, int y) {
        for (int i = 0; i < WALLS_TO_DOWN_COL.length; i++) {
            if (x == WALLS_TO_DOWN_COL[i][0] && y == WALLS_TO_DOWN_COL[i][1]) return true;
        }
        return false;
    }

    public static boolean checkRightCollusion(int x, int y) {
        for (int i = 0; i < WALLS_TO_RIGHT_COL.length; i++) {
            if (x == WALLS_TO_RIGHT_COL[i][0] && y == WALLS_TO_RIGHT_COL[i][1]) return true;
        }
        return false;
    }

    public static boolean checkLeftCollusion(int x, int y) {
        for (int i = 0; i < WALLS_TO_LEFT_COL.length; i++) {
            if (x == WALLS_TO_LEFT_COL[i][0] && y == WALLS_TO_LEFT_COL[i][1]) return true;
        }
        return false;
    }
}
