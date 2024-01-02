package Chapter06;

public class ControlLabel {
    public static void main(String[] args) {
        ControlLabel controlLabel = new ControlLabel();
        controlLabel.printTimesTable();
    }

    public void printTimesTable() {
        startLabel:
        for (int i = 2; i <= 9; i++) {

            for (int j = 1; j <= 9; j++) {
                if (i == 4 ||j == 4) continue startLabel;
                System.out.print(i + "*" + j + "=" + i*j + " ");
            }
            System.out.println();
        }
    }
}
