public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE=10;

    int ptr=-1;

    public CustomStack(){
        this(DEFAULT_SIZE);
        //Calling another constructor with the constructor
    }
    public CustomStack(int size){
        this.data=new int[size];
    }
    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is Full !!");
            return false;
        }
        ptr++;
        data[ptr]=item;
        return true;
    }
    public int pop() throws StackException{
        if(isEmpty()){
            throw new StackException("Cannot pop from an empty list");
        }
        // int removed=data[ptr];
        // ptr--;
        // return removed;
        return data[ptr--];
    }
    public int peek() throws StackException{
       if(isEmpty()){
            throw new StackException("Cannot peek from an empty list");
        } 
        return data[ptr];
    }
    public boolean isFull(){
        return ptr ==data.length-1; //ptr is at last Index
    }
    public boolean isEmpty(){
        return ptr ==-1; 
    }
}
 