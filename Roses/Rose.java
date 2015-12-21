package Roses;

public class Rose extends Flower {

    private String currentString = "Rose";

    @Override
    public String getCurrentString(){
        return this.currentString;
    }
}