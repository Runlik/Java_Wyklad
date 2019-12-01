package RejestrPracownikow;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Handlarz extends Pracownik {
    String efficiency;
    EfficiencyValues effVal = new EfficiencyValues();
    int provision;

    public Handlarz(String id, String name, String surname, LocalDate birth, int experience,
                    String street, int building, int room, String city, String efficiency, int provision) {
        super(id, name, surname, birth, experience, street, building, room, city);
        this.efficiency = efficiency;
        this.provision = provision;
        this.value = experience*effVal.values.get(efficiency);
    }
}


class EfficiencyValues{
    Map<String, Integer> values = new HashMap<>();

    EfficiencyValues(){
        values.put("NISKA", 60);
        values.put("SREDNIA", 90);
        values.put("WYSOKA", 120);
    }
}