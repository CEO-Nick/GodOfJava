package Chapter14_Exception;

public class MultiCatchSample {
    public static void main(String[] args) {
        MultiCatchSample sample = new MultiCatchSample();
        sample.multiCatch();
    }

    public void multiCatch() {
        int[] intArray = new int[5];
        try {
            intArray = null;
            System.out.println(intArray[5]);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException Occured");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException Occured");
        } catch (Exception e) {
            System.out.println("Exception Occured");
        } finally {
            System.out.println("Here is finally");
        }
        System.out.println("This code must run");
    }
}
