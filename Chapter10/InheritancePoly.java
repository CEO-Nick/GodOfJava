package Chapter10;

public class InheritancePoly {
    public static void main(String[] args) {
        InheritancePoly inheritance = new InheritancePoly();
        inheritance.callPrintNames();
    }

    public void callPrintNames() {
        Parent parent1 = new Parent();
        Parent parent2 = new Child();
        Parent parent3 = new ChildOther();

        parent1.printName();
        parent2.printName();
        parent3.printName();

        Parent[] parents = new Parent[3];
        parents[0] = parent1;
        parents[1] = parent2;
        parents[2] = parent3;

        checkType(parents);
    }

    private void checkType(Parent[] parents) {
        int len = parents.length;
        for (int i = 0; i < len; i++) {
            Parent temp = parents[i];
            if (temp instanceof Child) {
                System.out.println("parent" + i + " 의 원래 타입은 Child입니다.");
            } else if (temp instanceof ChildOther) {
                System.out.println("parent"+ i + " 의 원래 타입은 ChildOther입니다.");
            } else if (temp instanceof Parent) {
                System.out.println("parent" + i + " 의 원래 타입은 Parent입니다.");
            }
        }
    }
    
}
