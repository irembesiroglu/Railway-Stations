import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class RailwayStations{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int X = scanner.nextInt();
        int Y = scanner.nextInt();

        Graph graph = new Graph(N);

        for (int i = 0; i < M; i++) {
            int A = scanner.nextInt() - 1;
            int B = scanner.nextInt() - 1;
            graph.addEdge(A, B);
        }

        int[] originalDistances = graph.shortestDistances(X - 1);
        int originalDistance = originalDistances[Y - 1];

        List<Integer> newTracks = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (!graph.areConnected(i, j)) {
                    graph.addEdge(i, j);
                    int[] updatedDistances = graph.shortestDistances(X - 1);
                    graph.addEdge(i, j);  // Remove the temporary track

                    if (updatedDistances[Y - 1] >= originalDistance) {
                        newTracks.add(i + 1);
                        newTracks.add(j + 1);
                    }
                }
            }
        }

        if (newTracks.isEmpty()) {
            System.out.println(-1);
        } else {
            System.out.println(newTracks.size() / 2);
            for (int i = 0; i < newTracks.size(); i += 2) {
                System.out.println(newTracks.get(i) + " " + newTracks.get(i + 1));
            }
        }
    }
}
