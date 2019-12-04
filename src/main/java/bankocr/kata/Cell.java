package bankocr.kata;

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
             " _ "+" |_"+  " _|";

    private static final String FOUR =
            "   " + "|_|" + "  |";

    private static final String THREE =
            " _ "+ " _|" + " _|";

    private static final String TWO =
            " _ "+" _|" + " |_";

    private static final String ONE =
            "   " + "  |"+"  |";

    private static final String[] NUM_CELL = new String[10]{ZERO};
    private String cellAsText;

    public Cell(String cellAsText) {
        this.cellAsText = cellAsText;
    }

    @Override
    public String toString() {
        return ZERO.equals(cellAsText) ? "0": "1";
    }
}
