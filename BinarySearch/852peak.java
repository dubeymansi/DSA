class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0 ;
        int end = arr.length-1;
        int m  = start + (end-start)/2;
        if(arr[start]<=arr[m] && arr[m]<arr[end]){
            return end;
        }
        int N = arr.length;
        while(start<=end){
            int mid = start + (end-start)/2;
            int next = (mid+1)%N;
            int prev = (mid-1+N)%N;
            if(arr[mid]>arr[next] && arr[mid]>arr[prev]){
                return mid;
            }
        }
        return -1;
    }
}