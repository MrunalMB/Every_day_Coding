class Solution{
    
    public static int findClosest(int arr[], int n, int target) 
    { 
        // Complete the function
int ind1 = 0, ind2 = 0, diff1 = Integer.MAX_VALUE, diff2 = Integer.MAX_VALUE;
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return arr[mid];
            }else if(arr[mid]<target){
                ind1=mid;
                diff1 = target-arr[mid];
                start=mid+1;
            }else{
                ind2=mid;
                diff2=arr[mid]-target;
                end=mid-1;
            }
        }
        //System.out.println(ind1 +" "+ind2);
        if(diff1 == diff2 && arr[ind1]>arr[ind2])
        {
            return arr[ind1];
        }else if(diff1 == diff2 && arr[ind1]<arr[ind2]){
            return arr[ind2];
        }
        else if(diff1 < diff2 ){
            return arr[ind1];
        }else{
            return arr[ind2];
        }
    } 
}
