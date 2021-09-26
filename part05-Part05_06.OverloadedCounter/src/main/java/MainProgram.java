
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        Counter count=new Counter(5);
        count.increase();
        count.decrease();
        count.decrease(3);
        count.increase(5);
        count.value();
    }
}
