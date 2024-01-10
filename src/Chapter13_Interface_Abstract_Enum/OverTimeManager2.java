package Chapter13_Interface_Abstract_Enum;

public class OverTimeManager2 {
    public static void main(String[] args) {
        OverTimeManager2 manager = new OverTimeManager2();
        OverTimeValue2 value = OverTimeValue2.FIVE_HOUR;
        OverTimeValue2 value2 = OverTimeValue2.FIVE_HOUR;

        System.out.println("value의 hashCode() = " + value.hashCode());
        System.out.println("value2의 hashCode() = " + value2.hashCode());

        System.out.println(value);
        System.out.println(value.getAmount());
    }
}
