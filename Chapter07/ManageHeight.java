package Chapter07;

public class ManageHeight {
    static int[][] getHeights = new int[6][];

    public static void main(String[] args) {
        ManageHeight mh = new ManageHeight();
        mh.setData();
        
        int length = getHeights.length;
        for (int i = 1; i < length; i++) {
            mh.printAverage(i);
            // mh.printHeight(i);
        }
    }

    public void setData() {
        getHeights[1] = new int[]{170, 180, 173, 175, 177};
        getHeights[2] = new int[]{160, 165, 167, 186}; 
        getHeights[3] = new int[]{158, 177, 187, 176};
        getHeights[4] = new int[]{173, 182, 181};
        getHeights[5] = new int[]{170, 180, 165, 177, 172};
    }

    public void printHeight(int classNo) {
        System.out.println("Class No.:" + classNo);
        for (int data:getHeights[classNo]) {
            System.out.println(data);
        }
    }

    public void printAverage(int classNo) {
        double sum = 0.0;
        int len = getHeights[classNo].length;

        System.out.println("Class No.:" + classNo);
        
        for (int data:getHeights[classNo]) {
            sum += data;
        }

        System.out.println("Height average:" + sum / len);
    }
}
