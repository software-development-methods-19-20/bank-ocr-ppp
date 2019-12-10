package bankocr.kata;

import java.util.ArrayList;
import java.util.List;

public class Entry {

    List<Cell> cells = new ArrayList<>();

    public Entry(String firstLine, String secondLine, String thirdLine) {
        while (!firstLine.isEmpty()) {
            Cell cell = new Cell(firstLine.substring(0, 3) + secondLine.substring(0, 3) + thirdLine.substring(0, 3));
            cells.add(cell);
            firstLine = firstLine.substring(3);
            secondLine = secondLine.substring(3);
            thirdLine = thirdLine.substring(3);
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        cells.forEach(cell -> stringBuilder.append(cell.toString()));
        return stringBuilder.toString();
    }

    public boolean getChecksum() {
        int checksum = 0;
        String currCell;
        for (int i=0; i < cells.size(); ++i) {
            currCell = cells.get(i).toString();
            if (!currCell.equals("?")) {
                checksum += Integer.parseInt(currCell) * (i + 1);
            }
            else {
                return true;
            }
        }
        return checksum % 11 == 0;
    }
}
