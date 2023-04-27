import java.util.LinkedList;
import java.util.Queue;


public class queue {

    public static void main(String[] args) {
        String[] data ={"to","be","not","to","be"};
        Queue<String> queue = new LinkedList<>();

        for(String str : data){
            queue.add(str); 
        }
        System.out.println("Queue : " + queue);
        System.out.println("Size : " + queue.size());
        
        System.out.println("Peek : " + queue.peek());
        System.out.println("Poll : " + queue.poll());
        System.out.println("Poll : " + queue.poll());

        // while(!queue.isEmpty()){
        //     System.out.println(queue.remove());
        // }
    }
}
