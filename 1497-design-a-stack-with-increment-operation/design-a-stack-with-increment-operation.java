class CustomStack {
    int[] stackArray;
    int currentIndex;

    public CustomStack(int maxSize) {
        this.stackArray = new int[maxSize];
        this.currentIndex = -1;
    }
    
    public void push(int x) {
        if(currentIndex < stackArray.length-1) {
            stackArray[++currentIndex] = x;
        }
    }
    
    public int pop() {
        if(currentIndex >= 0) {
            return stackArray[currentIndex--];
        }else{
            return -1;
        }
    }
    
    public void increment(int k, int val) {
        int limit = Math.min(k, currentIndex+1);
        for(int i=0; i<limit; i++) {
            stackArray[i] += val;
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