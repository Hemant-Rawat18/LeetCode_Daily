1class Solution {
2    public void merge(int[] nums1, int m, int[] nums2, int n) {
3        // for(int i=m;i<m+n;i++){
4        //     nums1[i]=nums2[i-m];
5        // }
6        // Arrays.sort(nums1);
7        int arr[]=new int[m+n];
8        for(int i=0;i<m;i++){
9            arr[i]=nums1[i];
10        }
11         for(int i=m;i<m+n;i++){
12            arr[i]=nums2[i-m];
13        }
14        Arrays.sort(arr);
15      for(int i=0;i<m+n;i++){
16        nums1[i]=arr[i];
17      }
18    }
19}