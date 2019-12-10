package bankocr.kata;

import java.util.ArrayList;
import java.util.List;

public class ChecksumCalculator {

    public static boolean calculateChecksums(ArrayList<Entry> entry) {
        for (Entry e : entry) {
            if (!singleChecksum(e.cells)) {
                return false;
            }
        }
        return true;
    }

    private static boolean singleChecksum(List<Cell> cells) {
        int checksum = 0;
        String currCell;
        for (int i = 0; i < cells.size(); ++i) {
            currCell = cells.get(i).toString();
            if (!currCell.equals("?")) {
                checksum += Integer.parseInt(currCell) * (i + 1);
            } else {
                return true;
            }
        }
        return checksum % 11 == 0;
    }
}
