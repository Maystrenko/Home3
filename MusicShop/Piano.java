package MusicShop;

public class Piano extends Instruments {

    private String currentString = "Piano";

    @Override
    public String getCurrentString(){
        return this.currentString;
    }

}