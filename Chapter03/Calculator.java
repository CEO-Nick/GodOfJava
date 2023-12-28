package Chapter03;
public class Calculator {
    
    public static void main(String[] args) {

        System.out.println("Calculator method");

        Calculator calc = new Calculator();
        int a = 10;
        int b = 5;
        System.out.println("add = " + calc.add(a,b));
        System.out.println("add = " + calc.substract(a,b));
        System.out.println("add = " + calc.mulitply(a,b));
        System.out.println("add = " + calc.divide(a,b));



    }

    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int substract(int n1, int n2) {
        return n1 - n2;
    }

    public int mulitply(int n1, int n2) {
        return n1*n2;
    }

    public int divide(int n1, int n2) {
        int div = n1 / n2;
        return div;
    }

}
