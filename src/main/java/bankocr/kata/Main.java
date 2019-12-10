package bankocr.kata;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Main {
    public static void main(String... args) throws IOException {
        EntryReader parser = new EntryReader(Path.of(args[0]));
        ArrayList<Entry> entry = parser.newReadEntry();
        AccountNumber accountNumber = new AccountNumber(entry);
        String out = accountNumber.toString();
        System.out.println(out);
        if (out.contains("?")) {
            out += " ILL";
        }
        else if (!accountNumber.getChecksums()) {
            out += " ERR";
        }
        Files.write(Paths.get(args[0] + ".txt"), out.getBytes());
    }
}
