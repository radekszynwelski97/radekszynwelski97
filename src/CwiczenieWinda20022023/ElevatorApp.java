package CwiczenieWinda20022023;

public class ElevatorApp {
    public static void main(String[] args) {

        Person person = new Person(0,110);
        Person person1 = new Person(1,120);
        Person person2 = new Person(2,130);
        Person person3 = new Person(3,150);

        Elevator elevator = new Elevator();
        elevator.add(person1);
        elevator.add(person2);
        elevator.add(person3);


    }
}
