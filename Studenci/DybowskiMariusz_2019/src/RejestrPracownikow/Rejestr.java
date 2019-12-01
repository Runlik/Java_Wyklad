package RejestrPracownikow;

import java.util.ArrayList;

public class Rejestr {
    ArrayList<Pracownik> register;

    public void addPracownik(Pracownik pracownik){
        boolean flag = false;
        for(Pracownik item:register)
            if(pracownik.getId() == item.getId()) {
                flag = true;
                break;
            }
        if(!flag)
            register.add(pracownik);
    }

}
