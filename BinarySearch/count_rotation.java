import java.util.*;

public class count_rotation
{
    public static int noRot(int[] arr , int start , int end){
        int N = arr.length;
        int m = 0;
        while(start<=end){
            m = start + (end-start)/2;
            int n = (m+1)%N;
            int pr = (m-1+N)%N;
            if(arr[m]<arr[n] && arr[m]<arr[pr]){
                return m;
            }
            else if(arr[m]<=arr[end]){
                //m=pr;//  5 6 7 2 2 2
                end = pr;
            }
            else{
                start = n; 
            }
        }
        return m;
    }
	public static void main(String[] args) {
	    //int[] arr = {11,12,15,18,2,5,6,8};
	    //int[] arr = {2,2,2};
	    int[] arr = {1,1,2,2,2,1};
	    int n = arr.length;
	    System.out.println(noRot(arr,0,n-1));
	}
}
