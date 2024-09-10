class MedianFinder {
PriorityQueue<Integer> minh=new PriorityQueue<>();
PriorityQueue<Integer> maxh=new PriorityQueue<>(Collections.reverseOrder());
    public MedianFinder() {
        
    }
    
    public void addNum(int num) {
        if(maxh.size()==minh.size()){
            minh.add(num);
            maxh.add(minh.remove());
        }else{
            maxh.add(num);
            minh.add(maxh.remove());
        }
    }
    
    public double findMedian() {
        if(maxh.size()==minh.size()){
            return ((double)maxh.peek()+(double)minh.peek())/2.0;
        }
        else return maxh.peek()*1.0;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */