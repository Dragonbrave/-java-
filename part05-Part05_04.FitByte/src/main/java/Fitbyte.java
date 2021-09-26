public class Fitbyte {
    private int age;
    private int restingHeartRate;
    public Fitbyte(int age, int restingHeartRate){
        this.age=age;
        this.restingHeartRate=restingHeartRate;
    }
    public double targetHeartRate(double percentageOfMaximun) {
        return ((206.3 - (0.711 * age)) - restingHeartRate) * (percentageOfMaximun) + restingHeartRate;
    }
}
