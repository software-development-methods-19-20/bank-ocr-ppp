package bankocr.kata;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;

public class EntryReader {

    private final BufferedReader bufferedReader;

    public EntryReader(Path filePath) throws FileNotFoundException {
        FileReader fileReader = new FileReader(filePath.toFile());
        bufferedReader = new BufferedReader(fileReader);
    }

    public ArrayList<Entry> newReadEntry() throws IOException {
        ArrayList<Entry>  ent = new ArrayList<>();
        String[] temp = new String[3];
        int i = 0;
        while(true){
            String newline = bufferedReader.readLine();
            if(newline==null){break;}
            else if (newline.isEmpty() && i==3){
                i=0;
                continue;}
            else{
                temp[i]=newline;
                i=i+1;
            }
        if(i==3){
            ent.add(new Entry(temp[0],temp[1],temp[2]));}
        }

        return ent;
    }
}
