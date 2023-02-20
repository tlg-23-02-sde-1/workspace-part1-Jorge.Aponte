package human.being;

import java.time.LocalDate;

class PersonClient {

    public static void main(String[] args) {
        Person p1 = new Person("Jorge Aponte", LocalDate.of(1993,5,29));
        System.out.println(p1);
        System.out.printf("%s is %s years old", p1.getName(), p1.getAge());
    }
}