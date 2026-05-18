1class Solution {
2    public void merge(int[] nums1, int m, int[] nums2, int n) {
3        for(int i=m;i<m+n;i++){
4            nums1[i]=nums2[i-m];
5        }
6        Arrays.sort(nums1);
7    }
8}