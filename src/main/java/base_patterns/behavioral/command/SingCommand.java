package main.java.base_patterns.behavioral.command;

public class SingCommand implements Command{
    MusicBand musicBand;

    public SingCommand(MusicBand musicBand){
        this.musicBand = musicBand;
    }

    @Override
    public void execute() {
        musicBand.sing();
    }
}
