package Chapter06;

public class InterestManager {
    public static void main(String[] args) {
        InterestManager manager = new InterestManager();
        int amount = 1000000;

        for (int day = 1; day <= 365; day++) {
            double interest = amount * manager.getInterestRate(day);
            System.out.println(day + " day interest : " + interest);
        }

        for (int day = 10; day <= 370; day+=10) {
            double interest = amount * manager.getInterestRate(day);
            System.out.println(day + " day interest : " + interest);
        }
    }

    public double getInterestRate(int days) {
        double interestRate = 0.0;
        
        // 365일 이상 -> 5.6%
        if (days >= 365) 
            interestRate = 0.056;
        // 181~364 -> 2%
        else if (days >= 181) {
            interestRate = 0.02;             
        }
        // 91~180 -> 1%
        else if (days >= 91) {
            interestRate = 0.01;
        }
        // 90일 이내 -> 0.5%   
        else {
            interestRate = 0.005;
        }

        return interestRate;
    }

    public double calculateAmount(int day, long amount) {
        InterestManager manager = new InterestManager();
        double interestRate =  manager.getInterestRate(day);
        return amount * (1+interestRate);
    }
}
