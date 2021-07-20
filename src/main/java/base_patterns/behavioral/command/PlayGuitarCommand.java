package main.java.base_patterns.behavioral.command;

public class PlayGuitarCommand implements Command{
    MusicBand musicBand;

    public PlayGuitarCommand(MusicBand musicBand){
        this.musicBand = musicBand;

    }

    @Override
    public void execute() {
        musicBand.playGuitar();
    }
}
