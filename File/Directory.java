package File;

import java.util.ArrayList;

public class Directory {

    private ArrayList<File> filesList = new ArrayList<>();

    public Directory(File... files){

        for (File f : files) {
            this.filesList.add(f);
        }
    }

    public ArrayList<File> getFilesList() {
        return this.filesList;
    }

    public void setFilesInDir(File... files){
        for (File f : files) {
            this.filesList.add(f);
        }
    }

    public static void main(String[] args) {

        Directory directory = new Directory(new Text(), new Audio(), new Picture());

        directory.setFilesInDir(new Picture(), new Audio(), new Text());

        for (File f : directory.getFilesList()){
            System.out.println(f.getCurrentString());
        }
    }

}
