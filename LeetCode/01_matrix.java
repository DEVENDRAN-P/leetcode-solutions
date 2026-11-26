// 01 Matrix [Medium]
// https://leetcode.com/problems/01-matrix/

class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] dis = new int[m][n];

        Queue<int[]> q = new LinkedList<>();

        for(int i= 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(mat[i][j] == 0){
                    dis[i][j] = 0;
                    q.offer(new int[]{i,j});
                }
                else{
                    dis[i][j] = -1;
                }
            }
        }
        int[][] direction = {{-1,0},{1,0},{0,1},{0,-1}};
        while(!q.isEmpty()){
            int[] curr = q.poll();
            int r = curr[0];
            int c = curr[1];

            for(int[] d : direction){
                int r1 = r + d[0];
                int r2 = c + d[1];

                if(r1>=0 && r1<m && r2<n && r2>=0 && dis[r1][r2] == -1){
                    dis[r1][r2] = dis[r][c] + 1;
                    q.offer(new int[]{r1,r2});
                }
            }
        }
        return dis;
    }
}