package RejestrPracownikow;

import java.time.LocalDate;

public class PracownikBiurowy extends Pracownik {
    int intel;

    public PracownikBiurowy(String id, String name, String surname, LocalDate birth, int experience,
                            String street, int building, int room, String city, int intel) {
        super(id, name, surname, birth, experience, street, building, room, city);
        this.intel = intel;
        setValue();
    }

    void setValue(){
        this.value = this.experience*this.intel;
    }

    public void setExperience(int experience){
        this.experience = experience;
        setValue();
    }


}
