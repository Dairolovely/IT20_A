package PRELIM;

import java.util.LinkedList;

 public class MySongPlaylist {
    
    public static void main(String[] args){
        
        LinkedList<String> playlist = new LinkedList<>();
        
        
        playlist.add("Love Story");
        playlist.add("Look after you");
        playlist.add("Terrified");
        
        playlist.addFirst("Intro song");
        
        playlist.addLast("Ending song");
        
        System.out.println(playlist.getFirst());
        
        System.out.println(playlist);
    }
    
}
