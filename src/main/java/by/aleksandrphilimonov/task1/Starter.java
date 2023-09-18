package by.aleksandrphilimonov.task1;

public class Starter {
    public static void main(String[] args) {
        int counter=10;
        for (int i = 1; i < counter; i++) {
            System.out.println(uniquePaths(i,i));
        }
    }

    public static int uniquePaths(int m, int n){
        int[][]db = new int[m][n];

        for (int i = 0; i < m; i++) {
            db[i][0] = 1;
        }
        for (int j = 0; j < n; j++) {
            db[0][j] = 1;
        }

        for (int i = 1; i < m; i++) {
            for (int j =1; j < n; j++) {
                db[i][j] = db[i-1][j] + db[i][j-1];
            }
        }
        return db[m-1][n-1];
    }
}
