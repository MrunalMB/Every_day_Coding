//this code shows how many time the sorted array is rotated
//the number of rotation is nothing but the (pivot index+1)
public class RotationCountInSortedArr {
    public static void main(String[] args) {
        //int nums[]={4,5,6,7,0,1,2};
       // int nums[]={7,8,9,10,0,1,1,2,3,4,5,6,7};
         int nums[]={1,2,5,6,7,16,18,19};
        System.out.println(findRotationCount(nums));
    }

    private static int findRotationCount(int[] nums) {
       // int rotationcount=pivot(nums);
        int rotationcount=pivotWithDuplicates(nums);
        return rotationcount+1;
    }
    //use this mtd when array contain non duplicate ele
    static int pivot(int arr[]){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            //there are 4 cases
            if(mid<end && arr[mid]>arr[mid+1]){
                //end=mid;
                //we found the pivot,the only 2 numbers which are descending in order
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }if(arr[mid]<=arr[start]){
                end=mid-1;
            }
            //case 4 if star ele <mid ele then
            else{
                start=mid+1;
            }
        }
        return -1;
    }
    //use this mtd for finding pivot in duplicate array
    static int pivotWithDuplicates(int arr[]){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            // if arr[mid]==arr[start] then start searching from the next ele
            // if arr[mid]==arr[end] then start searching from the privious ele of end

            if(arr[mid]==arr[start] && arr[mid]==arr[end]) {
                //but we need to check whethere the skipping start or end are realy the pivot(lergest ele in arr) or not.
                //it these are pivot then return else skip these ele
                if (arr[start] >= arr[start + 1]) {
                    return start;
                } else {
                    start = start + 1;
                }//need to check wether our end is pivot or not.if yes then return end otherwise skip it.
                if (arr[end] >= arr[end - 1]) {
                    return end;
                } else {
                    end = end - 1;
                }
            }
            //left side is sorted, so pivot should be in the right
            else if(arr[start]<arr[mid] ||(arr[start]==arr[mid] && arr[mid]>arr[end])){
                start=mid+1;
            }else {
                end = mid - 1;
            }
        }
        return -1;
    }

}
