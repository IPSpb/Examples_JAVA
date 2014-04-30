package circle;

public class BranchingStatements {

    public void breakStatements() {
        int[] arrayOfInts =
                {32, 87, 3, 589,
                 12, 1076, 2000,
                 8, 622, 127};
        int searchFor = 12;

        int i;
        boolean foundIt = false;

        for (i = 0; i < arrayOfInts.length; i++) {
            if (arrayOfInts[i] == searchFor) {
                foundIt = true;
                break;
            }
        }

        if (foundIt) {
            System.out.println("Found " + searchFor + " at index " + i);
        } else {
            System.out.println(searchFor + " not in the array");
        }
    }

    public void breakWithLabelStatements() {
        int[][] arrayOfInts = {
                {32, 87, 3, 589},
                {12, 1076, 2000, 8},
                {622, 127, 77, 955}
        };
        int searchFor = 12;

        int i;
        int j = 0;
        boolean foundIt = false;

        search:
        for (i = 0; i < arrayOfInts.length; i++) {
            for (j = 0; j < arrayOfInts[i].length;
                 j++) {
                if (arrayOfInts[i][j] == searchFor) {
                    foundIt = true;
                    break search;
                }
            }
        }

        if (foundIt) {
            System.out.println("Found " + searchFor + " at " + i + ", " + j);
        } else {
            System.out.println(searchFor + " not in the array");
        }
    }

    public void continueStatements() {

        String searchMe = "peter piper picked a " + "peck of pickled peppers";
        int max = searchMe.length();
        int numPs = 0;

        for (int i = 0; i < max; i++) {
            // charAt - возвращает символ, индекс которого равен i
            if (searchMe.charAt(i) != 'p')
                continue;

            numPs++;
        }
        System.out.println("Found " + numPs + " p's in the string");
    }

    public void continueWithLabelStatements() {

        String searchMe = "Look for a substring in me";
        String substring = "sub";
        boolean foundIt = false;

        int max = searchMe.length() -
                  substring.length();
        test:
        for (int i = 0; i <= max; i++) {
            int n = substring.length();
            int j = i;
            int k = 0;
            while (n-- != 0) {
                if (searchMe.charAt(j++) != substring.charAt(k++)) {
                    continue test;
                }
            }
            foundIt = true;
                break test;
        }
        System.out.println(foundIt ? "Found it" : "Didn't find it");
    }
}
