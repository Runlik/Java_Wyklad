package RejestrPracownikow.test;

import RejestrPracownikow.Handlarz;
import org.junit.*;

public class HandlarzTest extends PracownikTest {

    @Test
    public void handlarzValueTest(){
        Handlarz handlarzTest = new Handlarz(id, name, surname, birth, experience, street, building, room, city , "NISKA", 10);
        double valueTest = 60*experience;
        Assert.assertEquals(valueTest, handlarzTest.getValue(), 0.001);
    }

}
