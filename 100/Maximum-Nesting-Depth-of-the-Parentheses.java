1class Solution {
2    public int maxDepth(String s) {
3        int count=0;
4        int max=0;
5        for(int i=0;i<s.length();i++){
6            if(s.charAt(i)=='('){
7                count++;
8                max=Math.max(count,max);
9            }
10            else if(s.charAt(i)==')'){
11                count--;
12            }
13
14        }
15        return max;
16    }
17}