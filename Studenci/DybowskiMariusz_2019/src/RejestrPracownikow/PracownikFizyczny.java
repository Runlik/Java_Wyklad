package RejestrPracownikow;

import java.time.LocalDate;
import java.time.Period;

public class PracownikFizyczny extends Pracownik {
    int strength;

    public PracownikFizyczny(String id, String name, String surname, LocalDate birth,
                             int experience, String street, int building, int room, String city, int strength) {
        super(id, name, surname, birth, experience, street, building, room, city);
        this.strength = strength;
        this.value = experience*strength/age;
    }
}
