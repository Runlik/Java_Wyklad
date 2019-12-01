package RejestrPracownikow.test;

import RejestrPracownikow.Pracownik;
import org.junit.*;

import java.time.LocalDate;
import java.time.Month;

public class PracownikTest {
     String id = "1234";
    String name = "Jan";
    String surname = "Kowalski";
    LocalDate birth = LocalDate.of(1987,1,1);
    int experience = 123;
    String adress;
    String street = "Grunwaldzka";
    int age;
    int building = 11;
    int room = 21;
    String city = "Gdansk";
    double value;

    @Test
    public void pracownikAddressTest(){
        Pracownik pracTest = new Pracownik(id, name, surname, birth, experience, street, building, room, city );

        Assert.assertEquals("Grunwaldzka 11/21 Gdansk",pracTest.getAdress() );
    }

}
