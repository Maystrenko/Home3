package MusicShop;

import java.util.ArrayList;

public class MusicShop {

    private ArrayList<Instruments> instrumentsList = new ArrayList<>();

    public MusicShop(Instruments... instruments){

        for (Instruments m : instruments) {
            this.instrumentsList.add(m);
        }
    }

    public ArrayList<Instruments> getInstrumentsList() {
        return this.instrumentsList;
    }

    public void setInstrumentsInShop(Instruments... instruments){
        for (Instruments m : instruments) {
            this.instrumentsList.add(m);
        }
    }

    public static void main(String[] args) {

        MusicShop musicShop = new MusicShop(new Guitar(), new Piano(), new Trumpet());

        musicShop.setInstrumentsInShop(new Piano(), new Guitar());

        for (Instruments m : musicShop.getInstrumentsList()){
            System.out.println(m.getCurrentString());
        }
    }
}