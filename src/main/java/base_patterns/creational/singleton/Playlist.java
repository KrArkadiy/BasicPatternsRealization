package main.java.base_patterns.creational.singleton;

public class Playlist {
    private static Playlist playlist;
    private static String playlistFile = "Created playlist.\n";

    public static Playlist getPlaylist(){
        if(playlist == null){
            playlist = new Playlist();
        }
        return playlist;
    }

    private Playlist(){

    }

    public void addTrackToPlaylist(String track){
        playlistFile += track + "\n";
    }

    public void showPlaylist(){
        System.out.println(playlistFile);
    }
}
