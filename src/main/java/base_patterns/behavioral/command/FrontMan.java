package main.java.base_patterns.behavioral.command;

public class FrontMan {
    Command sing;
    Command socialMediaActivity;
    Command playGuitar;

    public FrontMan(Command sing, Command socialMediaActivity, Command playGuitar){
        this.sing = sing;
        this.socialMediaActivity = socialMediaActivity;
        this.playGuitar = playGuitar;
    }

    public void sing(){
        sing.execute();
    }

    public void playGuitar(){
        playGuitar.execute();
    }

    public void SocialMediaActivity(){
        socialMediaActivity.execute();
    }

}
