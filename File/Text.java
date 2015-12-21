package File;

public class Text extends File {

    private String currentString = "Text";

    @Override
    public String getCurrentString(){
        return this.currentString;
    }

}
