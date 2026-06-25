import java.util.PriorityQueue;

public class MinimumCostofropes {
    public static void main(String[] args) {
        int arr[]={4};
        System.out.println(minCost(arr));
    }
    public static int minCost(int[] arr){
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for (int i=0;i<arr.length;i++){
            pq.add(arr[i]);
        }
        int ans=0;
        while (!pq.isEmpty()){
            int min1= pq.remove();
            if (pq.size()==0){
                break;
            }
            int min2=pq.remove();
            ans+=min1+min2;
            pq.add(min1+min2);
        }
        return ans;
    }
}
