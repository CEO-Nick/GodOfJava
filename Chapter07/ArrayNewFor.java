package Chapter07;

public class ArrayNewFor {
    public static void main(String[] args) {
        ArrayNewFor ex = new ArrayNewFor();
        ex.newFor();
        ex.twoDimFor();
    }

    public void newFor() {
        int[] oneDim = new int[]{1,2,3,4,5,6,7,8,9,10};
        for (int tmp : oneDim) {
            System.out.println(tmp);
        }
    }

    public void twoDimFor() {
        int[][] twoDim = new int[][]{{1,2,3}, {4,5,6}};
        for (int[] array:twoDim) {
            for (int data:array) {
                System.out.println(data);
            }
        }
    }
}
