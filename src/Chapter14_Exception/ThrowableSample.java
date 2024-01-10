package Chapter14_Exception;

public class ThrowableSample {
    public static void main(String[] args) {

        ThrowableSample throwable = new ThrowableSample();
        throwable.throwable();
//        throwable.throwException(13);
    }

    public void throwable() {
        int[] intArray =new int[5];
        try {
//            intArray = null;
            System.out.println(intArray[5]);
        } catch (Throwable t) {
            System.out.println(t.getMessage());
            System.out.println(t.toString());
            t.printStackTrace();
        }
    }

    public void throwException(int number) {
        try {
            if(number > 12) {
                throw new Exception("Number is over than 12");
            }
            System.out.println("Number is " + number);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void throwsException(int number) throws Exception {
        if (number < 12) {
            throw new Exception("Number is over than 12");
        }
        System.out.println("Number is  " + number);
    }
}