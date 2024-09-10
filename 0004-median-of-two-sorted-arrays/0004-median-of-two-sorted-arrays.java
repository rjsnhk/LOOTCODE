import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        PriorityQueue<Integer> maxh=new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minh=new PriorityQueue<>();
       
        for(int i=0;i<nums1.length;i++){
                if(maxh.size()==minh.size()){
                    minh.add(nums1[i]);
                    maxh.add(minh.remove());
                    
                }else{
                    maxh.add(nums1[i]);
                    minh.add(maxh.remove());
               
                }

        }
        for(int i=0;i<nums2.length;i++){

                if(maxh.size()==minh.size()){
                    minh.add(nums2[i]);
                    maxh.add(minh.remove());
                    
                }else{
                    maxh.add(nums2[i]);
                    minh.add(maxh.remove());
                    
                }

        }

        if(maxh.size()==minh.size()){
            return ((double)maxh.remove()+(double)minh.remove())/2.0;
        }
        else return maxh.remove();

    }
}