package human.being;

import java.time.LocalDate;
import java.time.Period;

/*
 * An immutable class. More accurately, this is a class definition written
 * in such a way that instance fo it (Person objects) cannot have their properties
 * changed once created. In short: getters but no setters.
 */
class Person {
    // properties (fields or instance variables)
    private final String name;
    private final LocalDate birthDay;

    Person(String name, LocalDate birthday) {
        this.name = name;
        this.birthDay = birthday;
    }

    // accessor methods
    /**
     * Returns the Person's age in whole years
     * Today's Date - birthday
     * This can be derived from the birthDate and today's date.
     * You basically need to get the period of time (in whole years) between
     * the birthDate and today's date.
     */
    public int getAge(){
        Period age = Period.between(getBirthDay(),LocalDate.now());
        return age.getYears();
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public String toString() {
        return String.format("Person: name= %s birthDay= %s age= %s",getName(), getBirthDay(),getAge());
    }
}