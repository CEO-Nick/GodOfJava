package Chapter13_Interface_Abstract_Enum;

public class OverTimeManager3 {
    public static void main(String[] args) {
        OverTimeManager3 manager = new OverTimeManager3();
        OverTimeValue2[] valueList = OverTimeValue2.values();
        for (OverTimeValue2 value : valueList) {
            System.out.println(value);
        }
    }
}
