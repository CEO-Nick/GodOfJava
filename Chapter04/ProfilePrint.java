package Chapter04;

public class ProfilePrint {
    byte age = 0;
    String name = "";
    boolean isMarried = false;

    public void setAge(byte age) {
        this.age = age;
    }

    public byte getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setIsMarried(boolean isMarried) {
        this.isMarried = isMarried;
    }

    public boolean getIsMarried() {
        return isMarried;
    }

    public static void main(String[] args) {
        ProfilePrint profilePrint = new ProfilePrint();

        byte age = 25;
        String name = "IkHyeonCho";
        boolean isMarried = false;

        profilePrint.setAge(age);
        profilePrint.setName(name);
        profilePrint.setIsMarried(isMarried);

        System.out.println("My age is ["+profilePrint.getAge()+"]");
        System.out.println("My name is ["+profilePrint.getName()+"]");
        System.out.println("My marriage is ["+profilePrint.getIsMarried()+"]");


    }
}
