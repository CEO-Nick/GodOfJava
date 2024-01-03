package Chapter07;

public class ArrayTwoDimension {
    public static void main(String[] args) {
        ArrayTwoDimension ex = new ArrayTwoDimension();
        ex.twoDimension();
    }

    public void twoDimension() {
        int[][] twoDim;
        twoDim = new int[2][3];

        int[][] twoDim2;
        twoDim2 = new int[2][];
        twoDim2[0] = new int[2];
        twoDim2[1] = new int[3];

        System.out.println("two Dim = " + twoDim);
        System.out.println("twoDim2 = " + twoDim2);
        System.out.println("twoDim2[0] = " + twoDim2[0]);
        System.out.println("twoDim2[1] = " + twoDim2[1]);
        // twoDim2 != twoDim2[0] != twoDim2[1]
    }
}
