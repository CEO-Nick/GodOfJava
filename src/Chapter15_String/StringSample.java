package Chapter15_String;

public class StringSample {
    public static void main(String[] args) {
        StringSample sample = new StringSample();
        sample.convertTest();
    }

    public void convert() {
        try {
            String korean = "한글";
            byte[] array1 = korean.getBytes();
            printByteArray(array1);
            String korean2 = new String(array1);
            System.out.println(korean2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void convertUTF16() {
        try {
            String korean = "한글";
            byte[] array1 = korean.getBytes("UTF-16");
            printByteArray(array1);

            String korean2 = new String(array1, "UTF-16");
            System.out.println(korean2);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void convertTest() {
        try {
            String korean = "자바의 신 최고!!!";
            byte[] array1 = korean.getBytes("UTF-16");
            printByteArray(array1);

            String korean2 = new String(array1, "UTF-16");
            System.out.println(korean2);

            byte[] array2 = korean.getBytes("EUC-KR");
            printByteArray(array2);
            String korean3 = new String(array2, "EUC-KR");
            System.out.println(korean3);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void printByteArray(byte[] array1) {
        for (byte data : array1) {
            System.out.print(data + " ");
        }
        System.out.println();
        System.out.println("array length = " + array1.length);
    }
}
