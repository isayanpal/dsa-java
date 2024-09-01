package Graphs;

import java.util.ArrayList;

public class dfsGraph {
    public static void dfs(int node,boolean vis[], ArrayList<ArrayList<Integer>> graph,ArrayList<Integer> list){
        //marking current node as visited
        vis[node] = true;
        list.add(node);

        //getting neighbour nodes
        for(Integer it : graph.get(node)){
            if (!vis[it]){
                dfs(it,vis,graph,list);
            }
        }
    }
    public static ArrayList<Integer> solution(int V, ArrayList<ArrayList<Integer>> graph){
        //boolean array to keep track of visited vertices
        boolean vis[] = new boolean[V+1];
        vis[0] = true;
        ArrayList<Integer> list = new ArrayList<>();
        dfs(0,vis,graph,list);
        return list;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            graph.add(new ArrayList<>());
        }
        graph.get(0).add(2);
        graph.get(2).add(0);
        graph.get(0).add(1);
        graph.get(1).add(0);
        graph.get(0).add(3);
        graph.get(3).add(0);
        graph.get(2).add(4);
        graph.get(4).add(2);

        ArrayList<Integer> ans = solution(5,graph);
        System.out.print("DFS: ");
        int n = ans.size();
        for (int i = 0; i < n; i++) {
            System.out.print(ans.get(i)+" ");
        }
    }
}
//expected output: DFS: 0 2 4 1 3