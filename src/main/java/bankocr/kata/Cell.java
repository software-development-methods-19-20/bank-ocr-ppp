package bankocr.kata;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Cell {

    private static final String ZERO =
                    " _ " +
                    "| |" +
                    "|_|";

    private static final String NINE =
                    " _ " +
                    "|_|" +
                    " _|";

    private static final String EIGHT =
                    " _ " +
                    "|_|" +
                    "|_|";

    private static final String SEVEN =
                    " _ " +
                    "  |" +
                    "  |";

    private static final String SIX =
                    " _ " +
                    "|_ " +
                    "|_|";

    private static final String FIVE =
                    " _ " +
                    "|_ " +
                    " _|";

    private static final String FOUR =
                    "   " +
                    "|_| " +
                    "  |";

    private static final String THREE =
                    " _ " +
                    " _| " +
                    " _|";

    private static final String TWO =
                    " _ " +
                    " _|" +
                    "|_ ";

    private static final String ONE =
                    "   " +
                    "  |" +
                    "  |";

    private static final String[] NUM_CELL = {ZERO, ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE};

    private String cellAsText;

    public Cell(String cellAsText) {
        this.cellAsText = cellAsText;
    }

    @Override
    public String toString() {
        for(int i = 0; i<10; ++i){
            if(NUM_CELL[i].equals(cellAsText)) return Integer.toString(i);
        }
        return null;
    }

}
