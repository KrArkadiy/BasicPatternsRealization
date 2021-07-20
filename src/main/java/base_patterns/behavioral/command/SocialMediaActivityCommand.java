package main.java.base_patterns.behavioral.command;

public class SocialMediaActivityCommand implements Command{
    MusicBand musicBand;

    public SocialMediaActivityCommand(MusicBand musicBand){
        this.musicBand = musicBand;
    }

    @Override
    public void execute() {
        musicBand.socialMediaActivity();
    }
}
