1class Solution {
2    public boolean isPalindrome(int x) {
3         if(x<0){
4            return false;
5        }
6        String s=Integer.toString(x);
7        for(int i=0;i<s.length()/2;i++){
8                if(s.charAt(i)!=s.charAt(s.length()-i-1)){
9                    return false;
10                }
11        }
12        return true;
13        
14    }
15}