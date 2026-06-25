import java.util.*;
public class KClosestPointstotheOrigin {
    //973. K Closest Points to Origin
    public static void main(String[] args) {

    }
    public ArrayList<ArrayList<Integer>> kClosest(int[][] points, int k) {
        ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
        PriorityQueue<Pair>pq=new PriorityQueue<>(Comparator.reverseOrder());

        // based on min dis we need to maintain the heap of size k

        for (int i=0;i<points.length;i++){
            double dis=Math.sqrt(points[i][0]*points[i][0]+points[i][1]*points[i][1]);
            pq.add(new Pair(dis,points[i][0],points[i][1]));
            if (pq.size()>k){
                pq.remove();
            }
        }

        while (!pq.isEmpty()){
            Pair curr=pq.remove();
            int arr[]=curr.arr;
            ArrayList<Integer>cur=new ArrayList<>();
            cur.add(arr[0]);
            cur.add(arr[1]);
            ans.add(cur);
        }
        return ans;
    }
    static class Pair implements Comparable<Pair>{
        double dis;
        int arr[]=new int[2];
        public Pair(double dis,int u,int v){
            this.dis=dis;
            arr[0]=u;
            arr[1]=v;
        }
        public int compareTo(Pair o){
            return Double.compare(this.dis, o.dis);
        }
    }
}
