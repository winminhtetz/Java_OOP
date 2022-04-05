package aggreation;

public class Person{
    String name;
    int age;
    Address address;

    Person(String personName, int personAge, Address address){
        name = personName;
        age = personAge;
        this.address = address;
    }

}
