package CwiczenieWinda20022023;

public class Elevator {
    Person[] people = new Person[4];
    int peopleNumber = 0 ;
    int maxWeight = 400 ;

    void add(Person person){
        if (peopleNumber < 4){
            people[peopleNumber]=person;
            peopleNumber++; }
        else {
            System.out.println("W windzie nie ma juz miejsca");
        }
    }

}
