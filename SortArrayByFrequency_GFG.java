import java.util.*;
// If you need anything just remember you need to import only one package
// import contraaaaa.anything
public class SortArrayByFrequency_GFG {
    public static void main(String[] args) {

    }
    public ArrayList<Integer> sortByFreq(int nums[]) {
        int n=nums.length;
        ArrayList<Integer>ans=new ArrayList<>();
        HashMap<Integer,Integer>hm=new HashMap<>();
        for (int i=0;i< nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Pair>pq=new PriorityQueue<>(Comparator.reverseOrder());
        // now we need to maintain the k size pq for nlogk tc >> nlogn
        // we need max freq hence min pq

        for (int key: hm.keySet()){
            int freq= hm.get(key);
            int val=key;
            pq.add(new Pair(freq,val));
        }

        while (!pq.isEmpty()){
            Pair curr=pq.remove();
            int freq=curr.freq;
            int val=curr.val;
            for (int j=0;j<freq;j++){
                ans.add(val);
            }
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
            if (this.freq==o.freq){
                return o.val-this.val;
            }
            return this.freq-o.freq;
        }
    }
}
