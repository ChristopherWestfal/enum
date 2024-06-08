package org.task;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PersonRepository {
    List<Person> personList;

    public PersonRepository(){
        personList = new ArrayList<>();

        personList.add(new Person(1, "Hans Peter", Gender.MALE, DayOfWeeks.MONDAY));
        personList.add(new Person(2, "Max Muster", Gender.DIVERS, DayOfWeeks.FRIDAY));
        personList.add(new Person(3, "Peter Peterson", Gender.MALE, DayOfWeeks.SATURDAY));
        personList.add(new Person(4, "Lischen Müller", Gender.DIVERS, DayOfWeeks.SUNDAY));
        personList.add(new Person(5, "Krissi Heinz", Gender.FEMALE, DayOfWeeks.THURSDAY));
    }

    public Optional<Person> searchByID(int id){
        for(Person p : personList){
            if(p.id() == id)
                return Optional.of(p);
        }
        return Optional.empty();
    }

    public String countByGender(){
        int male = 0, female = 0, divers = 0;

        for(Person p : personList){
            if(p.gender() == Gender.MALE)
                male++;
            else if (p.gender() == Gender.FEMALE) {
                female++;
            }
            else
                divers++;
        }
        return "Gender in der Liste ist folgendermaßen aufgeteilt:\n" +
                "Frauen: " + female +
                "\nMänner: " + male +
                "\nDivers: " + divers;
    }

    public Optional<Person> searchByName(String name){
        for(Person p : personList){
            if(p.name() == name)
                return Optional.of(p);
        }
        return Optional.empty();
    }

    public List<Person> searchPersonsByFavoriteDay(DayOfWeeks favoriteDay){
        List<Person> personByFavoriteDay = new ArrayList<>();

        for(Person p : personList){
            if(p.favoriteDay() == favoriteDay)
                personByFavoriteDay.add(p);
        }

        return personByFavoriteDay;
    }
}
