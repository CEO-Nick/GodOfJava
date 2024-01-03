package Chapter07;

public class ArrayLength {
    public static void main(String[] args) {
        ArrayLength ex = new ArrayLength();
        // ex.printArrayLength();
        ex.printArray1();
        System.out.println("=================================");
        ex.printArray2();
    }

    public void printArrayLength() {
        int[] oneDim = new int[3];
        int[][] twoDim = new int[4][2];

        System.out.println(oneDim.length);
        System.out.println(twoDim.length);
    }

    public void printArray1() {
        int[][] twoDim = {{1,2,3}, {4,5,6}};
        System.out.println("twoDim.length = " + twoDim.length);
        System.out.println("twoDim[0].length = " + twoDim[0].length);

        long before = System.currentTimeMillis();

        for (int i = 0; i < twoDim.length; i++) {
            for (int j = 0; j < twoDim[i].length; j++) {
                System.out.println("twoDim["+i+"]["+j+"] = " + twoDim[i][j]);
            }
        }
        
        long after = System.currentTimeMillis();
        long diff = (after - before);
        System.out.println("시간차이(s) : " + diff);
    }

    public void printArray2() {
        int[][] twoDim = {{1,2,3,4,5,6,7,1,2,3,1,2,2,3,4,5,5,6}, {1,2,3,4,5,6,6,6,3,2,4,5,6,1,2,3,4,5}};
        System.out.println("twoDim.length = " + twoDim.length);
        System.out.println("twoDim[0].length = " + twoDim[0].length);

        long before = System.currentTimeMillis();
        int twoDimLength = twoDim.length;

        for (int i = 0; i < twoDimLength; i++) {
            int twoDimOneLength = twoDim[i].length;

            for (int j = 0; j < twoDimOneLength; j++) {
                System.out.println("twoDim["+i+"]["+j+"] = " + twoDim[i][j]);
            }
        }
        
        long after = System.currentTimeMillis();
        long diff = (after - before);
        System.out.println("시간차이(s) : " + diff);
    }
}
