class CustomStack {
    Stack<Integer> s ;
    int size = 0;
    public CustomStack(int maxSize) {
        s = new Stack<>();
        size = maxSize ;
    }
    
    public void push(int x) {
        if(s.size() < size){
            s.push(x);
        }
    }
    
    public int pop() {
        if(!s.isEmpty()){
            return s.pop();
        }
        return -1 ;
    }
    
    public void increment(int k, int val) {
        Stack<Integer> temp = new Stack<>();
        int i = 1 ;
        while(!s.isEmpty()){
            temp.push(s.pop());
        }

        while(!temp.isEmpty()){
            if(i <= k){
             s.push(temp.pop() + val);
            }else{
             s.push(temp.pop());
            }
            i++;
        }
    }
}