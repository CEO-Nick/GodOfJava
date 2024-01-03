package Chapter08;

public class ReferenceReturn {
    public static void main(String[] args) {
        ReferenceReturn reference = new ReferenceReturn();
        reference.intArrayReturn();
    
    }

    public int intReturn() {
        int returnInt = 0;
        return returnInt;
    }

    public int[] intArrayReturn() {
        int returnIntArray[] = new int[10];
        return returnIntArray;
    }

    public String stringReturn() {
        String returnString = "I am IkHyeon!";
        return returnString;
    }
}
