public class Hangar {
    public static void main(String[] args) {

        Car twingo = new Car("Twingo");
        System.out.println(twingo.doStuff());

        Boat paquebot = new Boat("Paquebot");
        System.out.println(paquebot.doStuff());
    }
}
