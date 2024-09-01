package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class bfsGraph {
    public static ArrayList<Integer> solution(int V, ArrayList<ArrayList<Integer>> graph){
        ArrayList<Integer> bfs = new ArrayList<>();
        boolean vis[] = new boolean[V];
        Queue<Integer> q = new LinkedList<>();

        q.add(0);
        vis[0] = true;

        while (!q.isEmpty()){
            Integer node = q.poll();
            bfs.add(node);

            //get all the adjacent vertices of the dequeued vertex s
            //if a adjacent has not visited , then mark it visited and enqueue it
            for (Integer it: graph.get(node)){
                if (!vis[it]){
                    vis[it] = true;
                    q.add(it);
                }
            }
        }
        return bfs;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            graph.add(new ArrayList<>());
        }
        graph.get(0).add(1);
        graph.get(1).add(0);
        graph.get(0).add(4);
        graph.get(4).add(0);
        graph.get(1).add(2);
        graph.get(2).add(1);
        graph.get(1).add(3);
        graph.get(3).add(1);

        ArrayList<Integer> ans = solution(5,graph);
        int n = ans.size();
        System.out.print("BFS: ");
        for (int i = 0; i < n; i++) {
            System.out.print(ans.get(i)+" ");
        }
    }
}
//expected output : BFS: 0 1 4 2 3