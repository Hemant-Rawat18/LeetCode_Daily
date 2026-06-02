1class Solution {
2    public int minimumCost(int[] cost) {
3        Arrays.sort(cost);
4        int n=cost.length;
5        int sum=0;
6        if(n<=2){
7            for(int i=0;i<cost.length;i++){
8                sum=sum+cost[i];
9            }
10            return sum;
11        }
12        for(int i=n-1;i>=0;i=i-3){
13            {
14                sum=sum+cost[i];
15            }
16            if(i-1>=0){
17                sum=sum+cost[i-1];
18            }
19        }
20        return sum;
21    }
22}