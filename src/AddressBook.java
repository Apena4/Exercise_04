import java.util.ArrayList;
public class AddressBook {
    static ArrayList<Person> addressbook = new ArrayList<>();
    public static void main(String[] args) {
        Person person1 = new Person("Andres","Andresat@gmail.com");
        Person person2 = new Person("Mohannad", "Mohannad1123@gmail.com");
        Person person3 = new Person("Hussein", "mhussein123@gmail.com");

        addressbook.add(person1);
        addressbook.add(person2);
        addressbook.add(person3);


        System.out.println(addressbook);



        //System.out.println("Hello World!");

        //Person person1 = new Person("Joe", 14);
        //System.out.println(person1);
        //Person person2 = new Person("Kieran", 40);
        //person2.display();

        //Book book1 = new Book("Goosebumps", "R.L.Stine","Thriller",100);
        //Book book2 = new Book("Programming logic", "Joyce Ferrell", "Comp Sci", 25);
        //System.out.println(book1);
        //System.out.println(book2);
        //System.out.println(Book.numBooks);
        //person2.read(book2);


    }


}