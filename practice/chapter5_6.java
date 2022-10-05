package practice;

public class chapter5_6 {
    public static final int INF = 999999999;

    public static void main(String[] args) {
        int[][] graph = {
                {0, 7, 5},
                {7, 0, INF},
                {5, INF, 0}
        };

        for(int i = 0; i < graph.length; i++) {
            for(int j = 0; j < graph.length; j++) {
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }

    }


}
