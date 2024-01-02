public class OperatorConditionalTriple {
    public static void main(String[] args) {
        OperatorConditionalTriple sample = new OperatorConditionalTriple();
        sample.doBlindDate(30);
        sample.doBlindDate(80);
    }
    public Boolean doBlindDate(int point) {
        boolean doDate = false;

        doDate = point >= 80 ? true : false;
        System.out.println(doDate);
        return doDate;
    }
}
