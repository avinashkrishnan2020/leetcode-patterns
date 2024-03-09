package TopKElements;

import java.util.*;

public class TopKBiggestElements {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6};
        System.out.println(findTopKElements(arr, 3));
    }

    public static List<Integer> findTopKElements(int[] arr, int k){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a, b) -> {
            return a-b;
        });

        for(int i=0; i<arr.length; i++){
            minHeap.add(arr[i]);
            if(minHeap.size() > k){
                minHeap.poll();
            }
        }

        List<Integer> result = new ArrayList<>();

        while(!minHeap.isEmpty()){
            result.add(minHeap.poll());
        }

        Collections.reverse(result);

        return result;
    }
}
