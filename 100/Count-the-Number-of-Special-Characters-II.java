1class Solution {
2    public int numberOfSpecialChars(String word) {
3        int count=0;
4        for(char ch='a';ch<='z';ch++){
5            char upper=Character.toUpperCase(ch);
6            int lowerLast=word.lastIndexOf(ch);
7            int upperInd=word.indexOf(upper);
8            if(lowerLast != -1 && upperInd != -1 && lowerLast<upperInd){
9                count++;
10                
11            }
12        }
13        return count;
14    }
15}