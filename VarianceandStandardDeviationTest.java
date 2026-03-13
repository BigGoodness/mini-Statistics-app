import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class VarianceandStandardDeviationTest{

        @Test
    public void deviationOfNumbersInAnArray(){

        int [] numberOfScoresGrade = {1,1,2,4,5,3,9,3};

        VarianceandStandardDeviationMethod deviation = new VarianceandStandardDeviationMethod();
        double actual = 6.25;
        double expected = deviation.additionOfNumbersInArray(numberOfScoresGrade);

        assertEquals(expected, actual);
}
        
      
   


        

}
