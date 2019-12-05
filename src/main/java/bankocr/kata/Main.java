package bankocr.kata;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;

public class Main {
    public static void main(String... args) throws IOException {
        EntryReader parser = new EntryReader(Path.of(args[0]));
        ArrayList<Entry> entry = parser.newReadEntry();
        AccountNumber accountNumber = new AccountNumber(entry);
        String out = accountNumber.toString()+(accountNumber.toString().contains("?")?" ILL":"");
        System.out.println(out);
    }
}
