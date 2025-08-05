package DSA_PROBLEMS.Array;
public class SortZeroOneTwos {
    public void swap(int arr[],int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    //  Dutch National Flag Algorithm
    public void sort012(int[] arr) {
        int i=0;
        int j=0;
        int k=arr.length-1;
        while(j<=k){
            if(arr[j]==0){
                swap(arr,i,j);
                i++;
                j++;
            }
            else if(arr[j]==1) j++;
            else{
                swap(arr,j,k);
                k--;
            }
        }
        
    }
}
