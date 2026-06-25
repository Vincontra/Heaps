import java.util.*;
public class K_LargestElements {
    public static void main(String[] args) {
        int arr[]={12, 5, 787, 1, 23};
        int k=2;
        K_LargestElements obj=new K_LargestElements();
        ArrayList<Integer>ans=obj.kLargest(arr,k);

        for (int i:ans){
            System.out.println(i);
        }
    }
    public ArrayList<Integer> kLargest(int[] arr, int k){
        ArrayList<Integer>ans=new ArrayList<>();
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        //k largest means we need to make the min heap
        // in java Priority Queue are internally min heap

        // we will keep the heap size k for better time complexity
        // if size exceed pop

        for (int i=0;i<arr.length;i++){
            pq.add(arr[i]);
            if (pq.size()>k){
                pq.remove();
            }
        }

        // now we have all the k largest elements in pq as of now so will return them in decending order

        while (!pq.isEmpty()){
            ans.add(pq.remove());
        }
        Collections.reverse(ans);       // this must be done to have that order as decending
        return ans;


    }
}
