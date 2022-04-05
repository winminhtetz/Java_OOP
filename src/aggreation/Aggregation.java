package aggreation;

public class Aggregation {
    public static void main(String[] args) {
        Address address = new Address(7,
                "SainPan Street",
                "SouthOkkalapa",
                "Yangon"
              );


        Person person = new Person("Wayne", 20, address);

        Person person1 = new Person(
                "WMH", 20, new Address(6, "Paduak Street",
                        "NorthOkkalapa",
                        "Yangon"));

        System.out.println(person.name);
        System.out.println(person.age);
        System.out.println(person.address.number);
        System.out.println(person.address.street);
        System.out.println(person.address.township);
        System.out.println(person.address.region);

    }
}
