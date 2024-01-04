package Chapter10.DoItMyself;

public class Dog extends Animal{
    String ownerName;

    public Dog() {
        System.out.println("Dog Constructor");
    }

    public void move() {
        System.out.println("move() - Dog");
    }

    public void eatFood() {
        System.out.println("eatFood() - Dog");
    }
}
