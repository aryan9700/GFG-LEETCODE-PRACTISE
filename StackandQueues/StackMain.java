public class StackMain {
    public static void main(String[] args) throws StackException {
       CustomStack stack= new DynamicStack(5);
       // what all access you can get = what all type of access you can get
        stack.push(2);
        stack.push(21);
        stack.push(23);
        stack.push(24);
        stack.push(26);
        stack.push(89);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
