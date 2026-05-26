1class Solution {
2    public int numberOfSpecialChars(String word) {
3       int count=0;
4       for(char ch='a';ch<='z';ch++){
5        char upper=Character.toUpperCase(ch);
6        if(word.contains(String.valueOf(ch)) && word.contains(String.valueOf(upper))){
7            count++;
8        }
9       }
10       return count;
11    }
12}