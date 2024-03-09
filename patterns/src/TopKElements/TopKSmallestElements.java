package TopKElements;

import java.util.*;

public class TopKSmallestElements {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6};
        System.out.println(findTopKElements(arr, 3));
    }

    public static List<Integer> findTopKElements(int[] arr, int k){
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> {
            return b-a;
        });

        for(int i=0; i<arr.length; i++){
            maxHeap.add(arr[i]);
            if(maxHeap.size() > k){
                maxHeap.poll();
            }
        }

        List<Integer> result = new ArrayList<>();
        while(!maxHeap.isEmpty()){
            result.add(maxHeap.poll());
        }

        Collections.reverse(result);

        return result;
    }
}
