import java.util.*;
public class KthSmallest {
    public static void main(String[] args) {
        int arr[]={10, 5, 4, 3, 48, 6, 2, 33, 53, 10};
        int k=4;
        System.out.println(kthSmallest(arr,k));
    }
    public static int kthSmallest(int[] arr, int k) {
        PriorityQueue<Integer>pq = new PriorityQueue<>(Comparator.reverseOrder());
        // smallest so max heap
        // and each time we have to maintain the size of heap as k
        // hence nlogk tc
        for (int i=0;i<arr.length;i++){
            pq.add(arr[i]);
            if (pq.size()>k){
                pq.remove();
            }
        }
        return pq.peek();

    }
}
