package bankocr.kata;

import java.util.ArrayList;

public class AccountNumber {

    private ArrayList<Entry> entry;

    public AccountNumber(ArrayList<Entry> entry) {
        this.entry = entry;
    }

    @Override
    public String toString() {
        String temp = "";
        for(Entry i:this.entry){
            temp += i.toString()+ "\n";
        }
        temp = temp.substring(0,temp.length()-1);
        return temp;
    }

    public boolean getChecksums() {
        return ChecksumCalculator.calculateChecksums(entry);
    }
}
