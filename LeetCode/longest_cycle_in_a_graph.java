// Longest Cycle in a Graph [Hard]
// https://leetcode.com/problems/longest-cycle-in-a-graph/

class Solution {
    static int ans = -1;
    public static void dfs(int node,int[] edges, int[] vis , int[] pathVis , List<Integer> path){
        int next = edges[node];
        vis[node]=1;
        pathVis[node] = 1;
        path.add(node);

        if(next!=-1){
        if(vis[next]==0){
            dfs(next,edges,vis,pathVis,path);
        }
        else if(pathVis[next]==1){
            int sum = 0;
            for(int i = path.size()-1;i>=0;i--){
            sum++;
                if(next == path.get(i)){
                    break;
                }
            }
            ans = Math.max(ans,sum);
        }
        }
        pathVis[node]=0;
        path.remove(path.size()-1);
    }
    public int longestCycle(int[] edges) {
        int n = edges.length;
        ans =-1;
        int[] vis = new int[n];

        int[] pathVis = new int[n];
        List<Integer> path = new ArrayList<>();
        for(int i = 0;i<n;i++){
           if(vis[i]==0){
            dfs(i,edges,vis,pathVis,path);
           }
    }
    return ans;
    }
}