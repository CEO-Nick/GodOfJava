package Chapter15_String.DoItSelf;

public class UseStringMethods {
    public static void main(String[] args) {
        UseStringMethods sample = new UseStringMethods();
        String text = "The String class represents character strings.";

        sample.printWords(text);
        sample.findString(text, "string");
        sample.findAnyCaseString(text, "string");
        sample.countChar(text, 's');
        sample.printContainWords(text, "ss");
        sample.testSubString();
    }

    public void printWords(String str) {
        String[] charArray = str.split(" ");
        for(String word : charArray) {
            System.out.println(word);
        }
    }

    public void findString(String str, String findStr) {
        int idx = str.indexOf(findStr);
        System.out.println(findStr + " is appeared at " + idx);
    }

    public void findAnyCaseString(String str, String findStr) {
        int idx = str.toLowerCase().indexOf(findStr.toLowerCase());

        if (idx != -1) {
            System.out.println(findStr + " is appeared at " + idx);
        }
    }

    public void countChar(String str, char c) {
        char[] charArray = str.toCharArray();
        int cnt = 0;
        for (char ch: charArray) {
            if (ch == c) {
                cnt++;
            }
        }
        System.out.println("char '" + c + "' count is " + cnt);
    }

    public void printContainWords(String str, String findStr) {
        String[] stringArray = str.split(" ");
//        String result = "";
        for (String s : stringArray) {
            if (s.contains(findStr)) {
//                result = s;
                System.out.println(s + " contains " + findStr);
            }
        }
//        System.out.println(result + " contains " + findStr);
    }

    public void testSubString() {
        String text = "This is the test code mf!!";
        System.out.println(text.substring(0, 10));
    }


}
