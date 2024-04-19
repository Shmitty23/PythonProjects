public class Chapter6ProgrammingChallenge2 {

    public int yearModel;
    public String make;
    public int speed;
    public static void main(String[] args) {
        
        Car myCar = new Car(2018, "WRX");

        //Accelerate 5 times
        System.out.println("Accelerating:");
        for (int i = 0; i < 5; i++) {
            myCar.accelerate();
            System.out.println("Current speed: " + myCar.getSpeed() + " mph");
        }

        //Brake 5 times
        System.out.println("Braking:");
        for(int i = 0; i < 5; i++) {
            myCar.brake();
            System.out.println("Current speed: " + myCar.getSpeed() + " mph");
        }
    }
    
}

class Car{
    private int yearModel;
    private String make;
    private int speed;

    public Car(int yearModel, String make) {
        this.yearModel = yearModel;
        this.make = make;
        this.speed = 0;
    }


    public int getYearModel() {
        return yearModel;
    }

    public String getMake() {
        return make;
    }

    public int getSpeed() {
        return speed;
    }

    public void accelerate() {
        speed += 5;
    }

    public void brake() {
        speed -= 5;
    }
}
