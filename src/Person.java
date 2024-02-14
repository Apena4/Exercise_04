import java.awt.*;

public class Person {
    private String name;
    private String email;

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return this.getName() + " email is "+ this.getEmail();
    }
}

    //public void display(){
    //    System.out.println(this.getName() + " is " +this.getPhoneNum()+ " years old.");
    //}
    //public void read(Book a){
    //    System.out.println(this.getName() + " is reading the book titled " + a.getTitle());
    //}

