import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ksortedarray {
    public static void main(String[] args) {
        int arr[]={3, 2, 1, 5, 6, 4};
        int k=2;
        System.out.println(isKSortedArray(arr,arr.length,k));
    }
    public static String isKSortedArray(int arr[],int n,int k) {
        int[] sorted = arr.clone();
        Arrays.sort(sorted);
        HashMap<Integer, Integer>hm=new HashMap<>();
        for (int i=0;i<n;i++){
            hm.put(arr[i],i);
        }
        for (int i=0;i<n;i++){
            if (Math.abs(hm.get(sorted[i])-i)>k){
                return "No";
            }
        }
        return "Yes";
    }
}
