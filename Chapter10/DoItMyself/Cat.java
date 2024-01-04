package Chapter10.DoItMyself;

public class Cat extends Animal {
    String ownerName;

    public Cat() {
        System.out.println("Cat Constructor");
    }

    public void move() {
        System.out.println("move() - Cat");
    }

    public void eatFood() {
        System.out.println("eatFood() - Cat");
    }
}
