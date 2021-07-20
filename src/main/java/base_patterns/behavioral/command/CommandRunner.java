package main.java.base_patterns.behavioral.command;

public class CommandRunner {
    public static void main(String[] args) {
        MusicBand musicBand = new MusicBand();

        FrontMan frontMan = new FrontMan(new PlayGuitarCommand(musicBand), new SingCommand(musicBand), new SocialMediaActivityCommand(musicBand));

        frontMan.sing();
        frontMan.playGuitar();
        frontMan.SocialMediaActivity();
    }
}
