//this code contains java code of cycle sort
import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
int[] arr={3, 5, 2, 1,4};
cycle(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void cycle(int[] arr){
        int i=0;
        while(i < arr.length ){
            int a= arr[i]-1;
            if(i != a ){//or if(arr[i] != arr[a]){
                swap(arr, i, a);
                //int temp= arr[i];
                //arr[i] = arr[a];
                //arr[a] = temp;
            }else{
                i++;
            }
        }
    }

    private static void swap(int[] arr, int first, int sec) {
        int temp = arr[first];
        arr[first] = arr[sec];
        arr[sec] = temp;
    }
}
