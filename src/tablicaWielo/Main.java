package tablicaWielo;

public class Main {
    public static void main(String[] args) {
        int[][] tab = {
                {1, 2, 3, 4},
                {5, 6, 7, 8}
        };
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("tab[%d][%d] = %d", i, j, tab[i][j]);
            }
        }

        }
    }

