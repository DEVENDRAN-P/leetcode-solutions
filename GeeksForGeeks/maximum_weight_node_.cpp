// Maximum Weight Node [Medium]
// https://www.geeksforgeeks.org/problems/maximum-weight-node-/

class Solution {
    public int maxWeightNode(int[] exits) {
        // code here
        int n = exits.length;
        int[] a = new int[n];
        for(int i = 0;i<n;i++){
            if(exits[i]!=-1){
            a[exits[i]]+=i;
        }
            
    }
    
    int ans = -1;
    int ind = -1;
    
    for(int i = 0;i<n;i++){
        if(a[i]>=ans){
            ans = a[i];
            ind = i;
        }
    }
    return ind;
        
    }
}