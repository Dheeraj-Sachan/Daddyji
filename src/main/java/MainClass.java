interface Dheeraj {
    void dance();
}

public class MainClass {

    public static void main(String[] args) {
        Dheeraj dheeraj = () -> System.out.println("I am dancing");
        dheeraj.dance();
    }
}

