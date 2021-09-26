public class Timer {
    private ClockHand seconds;
    private ClockHand hundreds;
    public Timer() {
        this.hundreds=new ClockHand(100);
        this.seconds=new ClockHand(60);
    }

    public ClockHand getHundred() {
        return hundreds;
    }

    public ClockHand getSecond() {
        return seconds;
    }
    public void advance(){
        this.hundreds.advance();
        if(this.hundreds.value()==0){

            this.seconds.advance();
        }

    }
    @Override
    public String toString(){
        return seconds+":"+hundreds;
    }
}
