package bankocr.kata;

import java.util.ArrayList;

public class charCorrector {

    public static ArrayList<String> computeNeighbors(String testCell, String[] correctCells) {
        ArrayList<String> out = new ArrayList<>();
        for (String repr : correctCells) {
            if (isNeighbor(repr, testCell)) {
                out.add(repr);
            }
        }
        return out;
    }

    private static boolean isNeighbor(String candidate, String correct) {
        String[] edits = {"-", "_", "|"};
        for (int i=0; i < candidate.length(); ++i) {
            for (String edit : edits) {
                if (correct.equals(candidate.substring(0, i) + edit + candidate.substring(i + 1))) {
                    return true;
                }
            }
        }
        return false;
    }
}
