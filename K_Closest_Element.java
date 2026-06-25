import java.util.*;
public class K_Closest_Element {
    public static void main(String[] args) {
        // 658. Find K Closest Elements LC

    }
    class Solution {
        public List<Integer> findClosestElements(int[] arr, int k, int x) {
            PriorityQueue<Pair>pq=new PriorityQueue<>(Comparator.reverseOrder());
            for(int i=0;i<arr.length;i++){
                int diff=Math.abs(arr[i]-x);
                int val=arr[i];
                pq.add(new Pair(diff,val));

                if(pq.size()>k){
                    pq.remove();
                }
            }
            List<Integer>ans=new ArrayList<>();
            while(!pq.isEmpty()){
                int val=pq.remove().val;
                ans.add(val);
            }
            Collections.sort(ans);
            return ans;
        }

        public static class Pair implements Comparable<Pair>{
            int diff;
            int val;
            public Pair(int diff,int val){
                this.diff=diff;
                this.val=val;
            }

            public int compareTo(Pair o){
                if(this.diff==o.diff){
                    return this.val-o.val;
                }
                return this.diff-o.diff;
            }

        }
    }
}
