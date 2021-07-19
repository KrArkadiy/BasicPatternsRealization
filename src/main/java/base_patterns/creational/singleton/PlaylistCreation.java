package main.java.base_patterns.creational.singleton;

public class PlaylistCreation {
    public static void main(String[] args) {
        Playlist.getPlaylist().addTrackToPlaylist("First track..");
        Playlist.getPlaylist().addTrackToPlaylist("Second track..");
        Playlist.getPlaylist().addTrackToPlaylist("Third track..");
        Playlist.getPlaylist().addTrackToPlaylist("Fourth track..");
        Playlist.getPlaylist().addTrackToPlaylist("Fifth track..");

        Playlist.getPlaylist().showPlaylist();

    }
}
