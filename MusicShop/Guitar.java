package MusicShop;

public class Guitar extends Instruments {

    private String currentString = "Guitar";

    @Override
    public String getCurrentString(){
        return this.currentString;
    }

}