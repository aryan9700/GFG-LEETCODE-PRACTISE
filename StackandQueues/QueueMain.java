public class QueueMain {
    public static void main(String[] args) throws Exception {
         CircularQueue queue=new DynamicQueue(4);
        queue.insert(23);
        queue.insert(44);
        queue.insert(99);
        queue.display();
        System.out.println(queue.remove());
        queue.insert(333);
        queue.display();
        
        queue.insert(329);
        queue.display();
queue.insert(34);
queue.insert(35);
queue.display();
    }
}
