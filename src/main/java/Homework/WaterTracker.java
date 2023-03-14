package Homework;

public class WaterTracker {
    int totalWaterIntake;
    public void addWater(int amount) {
        int totalWaterIntake = 0;
        if (amount <= 0) {
            System.out.println("The input should be positive!");
        } else {
            this.totalWaterIntake += amount;
            System.out.println("You have drank " + amount + " milliliters of water.");
        }
    }

    public int getWaterIntake(){
        System.out.println("Your total water intake for today is " + totalWaterIntake + " milliliters");
        return totalWaterIntake;
    }

    public String getStatus(){
        if(totalWaterIntake > 2000){
            return "You are hydrated!";
        }
        return "You need to drink more water.";
    }

    public void setDailyWaterIntake(int x) {
        int difference = 0;
        if (x < totalWaterIntake) {
            difference = totalWaterIntake - x;
            System.out.println(x + " milliliters is your daily water intake goal. You have outreached your goal by "
            + difference + " milliliters.");
        } else {
            difference = x - totalWaterIntake;
            System.out.println(x + " milliliters is your daily water intake goal. You need to drink " + difference
            + " milliliters more of water to reach your goal.");
        }
    }

    public void resetDailyWaterIntake(){
        totalWaterIntake = 0;
    }

    public void waterIntakeMultipleDays(){
        System.out.println("You have consumed " + totalWaterIntake + " milliliters of water today. Let's move to the next day."); // same as resetting water intake
        totalWaterIntake = 0;
    }

    public static void main(String[] args) {
        WaterTracker day1 = new WaterTracker();
        day1.addWater(500);
        day1.addWater(600);
        day1.addWater(2000);
        day1.getWaterIntake();
        System.out.println(day1.getStatus());
        day1.setDailyWaterIntake(1200);
        day1.waterIntakeMultipleDays();

        WaterTracker day2 = new WaterTracker();
        day2.addWater(200);
        day2.addWater(400);
        day2.addWater(600);
        day2.getWaterIntake();
        System.out.println(day2.getStatus());
        day2.setDailyWaterIntake(3000);
        day2.waterIntakeMultipleDays();

    }
}
