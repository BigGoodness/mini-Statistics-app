import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
        
public class TestAcIsWorking{

        @Test
    public void testThatAcIsSwitchedOn(){
        Acisworking switchedOn = new Acisworking();
        boolean isSwitchedOn = switchedOn.acIsTurnedOn();

        assertTrue(isSwitchedOn);
    }

           @Test
    public void testThatAcIsSwitchedOff(){
        Acisworking switchedOff = new Acisworking();
        boolean isSwitchedOff = switchedOff.acIsTurnedOff();

        assertTrue(isSwitchedOff);
    }

            @Test
    public void testAcWhenTemperatureIsIncreased(){
        Acisworking temperatureIncreased = new Acisworking();
        int tempincreased = temperatureIncreased.acTemperatureIncreased();

        assertEquals(17, tempincreased);
    }

            @Test
    public void testAcWhenTemperatureIsDecreased(){
        Acisworking temperatureDecreased = new Acisworking();
        int tempDecreased = temperatureDecreased.acTemperatureDecreased();

        assertEquals(29, tempDecreased);
    }

            @Test
    public void testAcWhenTemperatureIsIncreasedBy30(){
        Acisworking tempIncreasedBeyond30 = new Acisworking();
        int tempIncreased = tempIncreasedBeyond30.acTemperatureIncreased();

        assertEquals(30, tempIncreased);
    }

//            @Test
//    public void testAcWhenTemperatureIsIncreasedBy30(){
//        Acisworking tempIncreasedBeyond30 = new Acisworking();
//        int tempdecreased = temperatureIncreased.acTemperatureIncreased();
//
//        assertEquals(30, tempIncreasedBeyond30);
//    }
}
