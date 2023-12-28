package Chapter03;
public class Car {
    int speed;
    int distance;
    String color;

    public Car() {
        this.speed = 0;
        this.distance = 0;
        this.color = "";
    }

    public void speedUp() {
        this.speed += 5;
    
    }

    public void breakDowm() {
        this.speed -= 10;
    }

    public int getCurrentSpeed() {
        return speed;
    }
}


