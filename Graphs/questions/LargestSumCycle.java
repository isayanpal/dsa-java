package Graphs.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LargestSumCycle {
    //adjacency list
    static List<List<Integer>> adj = new ArrayList<>();
    //arrays for tracking visited nodes and their parent nodes
    static int[] vis, par;
    //temporary list for storing nodes in a cycle
    static List<Integer> temp = new ArrayList<>();

    //dfs function to find cycles and their sum
    static long dfs(int node, int p){
        vis[node] = 1;
        par[node] = p;
        temp.add(node);
        for (int i : adj.get(node)){
            if (vis[i] == 0){
                long z = dfs(i,node);
                if (z != -1){
                    return z;
                }
            }
            else if (vis[i] == 1) {
                long sum = i;
                while (node != i){
                    sum += node;
                    node = par[node];
                }
                if (node == i){
                    return sum;
                }
                return -1;
            }
        }
        return -1;
    }
    //function to find the largest sum cycle
    static long largestSumCycle(int N, List<Integer> Edge){
        long ans = -1;
        vis = new int[N];
        adj = new ArrayList<>();
        par = new int[N];

        //creating adjacency list
        for (int i = 0; i < N; i++) {
            adj.add(new ArrayList<>());
            if (Edge.get(i) != -1){
                adj.get(i).add(Edge.get(i));
            }
        }

        // finding cycles and their sum using dfs
        for (int i = 0; i < N; i++) {
            if (vis[i] == 0){
                ans = Math.max(ans,dfs(i,-1));
                for (int j : temp){
                    vis[j] = 2;
                }
                temp.clear();
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int N = 4;
        List<Integer> Edge = Arrays.asList(1, 2, 0, -1);

        // Function Call
        long ans = largestSumCycle(N, Edge);
        System.out.println(ans);
    }
}

//output: 3