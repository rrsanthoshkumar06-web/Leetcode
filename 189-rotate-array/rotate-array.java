class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        int rev=n-k;
        reverse(nums,0,rev-1);
        reverse(nums,rev,n-1);
        reverse(nums,0,n-1);
        

    }
    public static void reverse(int arr[],int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}