import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        PriorityQueue<Integer> maxh=new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minh=new PriorityQueue<>();
        int count=0;
        for(int i=0;i<nums1.length;i++){
                if(count%2==0){
                    minh.add(nums1[i]);
                    maxh.add(minh.remove());
                    count++;
                }else{
                    maxh.add(nums1[i]);
                    minh.add(maxh.remove());
                    count++;
                }

        }
        for(int i=0;i<nums2.length;i++){

                if(count%2==0){
                    minh.add(nums2[i]);
                    maxh.add(minh.remove());
                    count++;
                }else{
                    maxh.add(nums2[i]);
                    minh.add(maxh.remove());
                    count++;
                }

        }

        if(maxh.size()==minh.size()){
            return ((double)maxh.remove()+(double)minh.remove())/2.0;
        }
        else return maxh.remove();

    }
}