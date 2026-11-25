// Find Closest Node to Given Two Nodes [Medium]
// https://leetcode.com/problems/find-closest-node-to-given-two-nodes/

class Solution {
    public static int[] bfs(int[] edge,int st){
        Queue<Integer> q = new LinkedList<>();
        int n = edge.length;
        int[] a = new int[n];
        Arrays.fill(a,Integer.MAX_VALUE);
        a[st] = 0;
        q.offer(st);
        while(!q.isEmpty()){
            int s = q.poll();
            int next = edge[s];
            if(next!=-1 && a[next]==Integer.MAX_VALUE){
                a[next] = a[s]+1;
                q.offer(next);
            }
        }
        return a;

    }
    public int closestMeetingNode(int[] edges, int node1, int node2) {
        int[] d1 = bfs(edges,node1);
        int[] d2 = bfs(edges,node2);
        int ans = -1;
        int dis = Integer.MAX_VALUE;
        for(int i = 0;i<edges.length;i++){
            if(d1[i] == Integer.MAX_VALUE || d2[i]==Integer.MAX_VALUE){
                continue;
            }
        int sum = Math.max(d1[i], d2[i]);

        if(sum<dis){
            dis = sum;
            ans = i;
        }
    }
    return ans;
    }
}