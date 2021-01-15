package ioreadstring.names;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileManager {
    private List<Human> humans = new ArrayList<>();
    private Path myFile;

    public FileManager(String fileRelativePath) {
        this.myFile = Path.of(fileRelativePath);
    }

    public void readFromFile() {

        try {
            List<String> temp = Files.readAllLines(myFile);
            for(String s:temp){
                String[] FirstAndLastName=s.split(" ");
                humans.add(new Human(FirstAndLastName[0],FirstAndLastName[1]));
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    public List<Human> getHumans() {
        return new ArrayList<>(humans);
    }

    public Path getMyFile() {
        return myFile;
    }

}

