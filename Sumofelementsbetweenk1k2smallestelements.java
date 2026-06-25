import java.util.Comparator;
import java.util.PriorityQueue;

public class Sumofelementsbetweenk1k2smallestelements {
    public static void main(String[] args) {


    }
    public static long sumBetweenTwoKth(long A[],long N,long K1,long K2){
        long ans=0;
        // k2 tak ki sum- k1 tak ki sum - (k1+k2)
        // ofcourse k2>k1
        PriorityQueue<Long>pq=new PriorityQueue<>(Comparator.reverseOrder());
        for (int i=0;i<N;i++){
            pq.add(A[i]);
            if (pq.size()>K1){
                pq.remove();
            }
        }
        long min=pq.peek();

        pq=new PriorityQueue<>(Comparator.reverseOrder());
        for (int i=0;i<N;i++){
            pq.add(A[i]);
            if (pq.size()>K2){
                pq.remove();
            }
        }
        long max=pq.peek();
        for (int i=0;i<N;i++){
            if (A[i]>min&&A[i]<max){
                ans+=A[i];
            }
        }
        return ans;
    }
}
