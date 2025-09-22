
package PRELIM;

 

public class LinkedList {
    
    public static void main(String[] args){
        
        LinkedList<String> playlist = new LinkedList<>();
        
        playlist.add("Love Story");
        playlist.add("Look after you");
        playlist.add("Terrified");
        
        playlist.addFirst("Intro song");
        
        playlist.addLast("Ending song");
        
        System.out.print(playlist.getFirst());
        
        System.out.print(playlist);
    }
    
}
