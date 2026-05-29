1class Solution {
2    public int minAddToMakeValid(String s) {
3        Stack<Character>st=new Stack<>();
4        for(int i=0;i<s.length();i++){
5            if(s.charAt(i)=='('){
6                st.push(s.charAt(i));
7            }
8               
9             else{
10             if(!st.isEmpty() && st.peek()=='('){
11                    st.pop();
12                }
13                else{
14                    st.push(s.charAt(i));
15                
16             }
17            }
18        
19        }
20        return st.size();
21    }
22}