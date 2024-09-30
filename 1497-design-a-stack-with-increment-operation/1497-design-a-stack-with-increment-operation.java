class CustomStack {
public int arr[];
public int size;
public int curr;
    public CustomStack(int maxSize) {
        arr=new int[maxSize];
        size=maxSize;
        curr=0;
    }
    
    public void push(int x) {
        if(curr<size){
            arr[curr]=x;
            curr++;
        }
    }
    
    public int pop() {
        if(curr==0){
            return -1;
        }
        int a=curr;
        curr--;
        return arr[(a-1)];
    }
    
    public void increment(int k, int val) {
        for(int i=0;i<k;i++){
            if(i>=size) break;
            else{
                arr[i]+=val;
            }
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */