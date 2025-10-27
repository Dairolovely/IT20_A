
package midterm;

import java.util.Queue;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Collections;

public class queue {

    public static void main(String[] args){
        
        PriorityQueue <Integer> queue = new PriorityQueue <> (Collections.reverseOrder());
        
        queue.add(40);
        queue.add(20);
        queue.add(50);
        queue.add(30);
           
           System.out.println(queue);
    }
}
