1class Solution {
2    public String removeOuterParentheses(String s) {
3        StringBuilder ans = new StringBuilder();
4        int count = 0;
5        for(int i = 0; i < s.length(); i++) {
6            if(s.charAt(i) == '(') {
7                if(count > 0) {
8                    ans.append(s.charAt(i));
9                }
10                count++;
11            }
12            else {
13                count--;
14                if(count > 0) {
15                    ans.append(s.charAt(i));
16                }
17            }
18        }
19        return ans.toString();
20    }
21}
22    