import java.util.*;

class Solution {

    public boolean validPath(int n, int[][] edges, int source, int destination) {

        // Create adjacency list
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        // Add edges
        for(int[] edge : edges) {

            int u = edge[0];
            int v = edge[1];

            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        // BFS
        boolean[] visited = new boolean[n];

        Queue<Integer> q = new LinkedList<>();

        visited[source] = true;
        q.add(source);

        while(!q.isEmpty()) {

            int top = q.remove();

            if(top == destination) {
                return true;
            }

            for(Integer neighbour : adj.get(top)) {

                if(!visited[neighbour]) {

                    visited[neighbour] = true;
                    q.add(neighbour);
                }
            }
        }

        return false;
    }
}