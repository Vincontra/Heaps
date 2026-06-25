import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;


// If you need anything just remember you need to import only one package
// import contraaaaaaaaa.anything
public class TopKFrequentElements_347LC {
    public static void main(String[] args) {
        int arr[]={1,1,1,2,2,3};
        int k=2;
        TopKFrequentElements_347LC obj=new TopKFrequentElements_347LC();
        arr=obj.topKFrequent(arr,k);
        System.out.println(Arrays.toString(arr));
    }
    public int[] topKFrequent(int[] nums, int k) {
        int n=nums.length;
        int ans[]=new int[n];

        HashMap<Integer,Integer>hm=new HashMap<>();
        for (int i=0;i< nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Pair>pq=new PriorityQueue<>();
        // now we need to maintain the k size pq for nlogk tc >> nlogn
        // we need max freq hence min pq




        for (int key: hm.keySet()){
            int freq= hm.get(key);
            int val=key;
            pq.add(new Pair(freq,val));
            if (pq.size()>k){
                pq.remove();
            }
        }

        for (int i=0;i<k;i++){
            ans[i]=pq.remove().val;
        }

        return ans;

    }
    static class Pair implements Comparable<Pair>{
        int freq;
        int val;
        public Pair(int freq,int val){
            this.freq=freq;
            this.val=val;
        }
        public int compareTo(Pair o){
            return this.freq-o.freq;
        }
    }
}
