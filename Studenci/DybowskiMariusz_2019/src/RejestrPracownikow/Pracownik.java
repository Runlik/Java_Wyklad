package RejestrPracownikow;

import java.time.LocalDate;
import java.time.Period;

public class Pracownik {
    protected String id;
    protected String name;
    protected String surname;
    protected LocalDate birth;
    protected int experience;
    protected String adress;
    protected String street;
    protected int age;
    protected int building;
    protected int room;
    protected String city;
    protected double value;

    public Pracownik(String id, String name, String surname, LocalDate birth, int experience,
                     String street, int building, int room, String city) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.birth = birth;
        this.experience = experience;
        this.street = street;
        this.building = building;
        this.room = room;
        this.city = city;
        this.adress = street + " " + building + "/" + room + " " + city;
        Period.between(birth,LocalDate.now()).getYears();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Pracownik{" +
                "id='" + id + ' ' +
                ", name='" + name + ' ' +
                ", surname='" + surname + ' ' +
                ", experience=" + experience +
                ", adress='" + adress + ' ' +
                ", age=" + age +
                ", value=" + value +
                '}';
    }
}
