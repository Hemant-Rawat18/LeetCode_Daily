1class Solution {
2    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
3        int total=0;
4        for(int i=0;i<worker.length;i++){
5            int sum=0;
6            for(int j=0;j<difficulty.length;j++){
7                if(difficulty[j]<=worker[i]){
8                    sum=Math.max(sum,profit[j]);
9                }  
10            }
11            total=total+sum;
12        }
13        return total;
14    }
15}