// Find Closest Node to Given Two Nodes [Medium]
// https://leetcode.com/problems/find-closest-node-to-given-two-nodes/

class Solution {
    public void findDis(int[] dis, int[] edges,int start){
        int distance = 0;
        int curr = start;
        Arrays.fill(dis,-1);

        while(curr!=-1 && dis[curr]==-1){
            dis[curr] = distance;
            curr = edges[curr];
            distance++;
        }
    }
    public int closestMeetingNode(int[] edges, int node1, int node2) {
        int n = edges.length;
        int[] dis1 = new int[n];
        int[] dis2 = new int[n];

        findDis(dis1,edges,node1);
        findDis(dis2,edges,node2);
        int ind = -1;
        int max = Integer.MAX_VALUE;
        for(int i = 0;i<n;i++){
            if(dis1[i]!=-1 && dis2[i]!=-1){
                int curr = Math.max(dis1[i],dis2[i]);

                if(curr<max){
                    max = curr;
                    ind = i;
                }
            }
        }

        return ind;
    }
}