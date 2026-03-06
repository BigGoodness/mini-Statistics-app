public class VarianceandStandardDeviationMethod{


    public static double additionOfNumbersInArray(int[] numberOfScoreGrade){
        int sumOfScores = 0;
        double average = 0;
        double additionOfSquared = 0;

            for(int count = 0; count < numberOfScoreGrade.length; count++){
            sumOfScores += numberOfScoreGrade[count];
            average  = sumOfScores / numberOfScoreGrade.length;
        }

            double difference = 0;
            for(int count = 0; count < numberOfScoreGrade.length; count++){
            difference = numberOfScoreGrade[count] - average;

            double squared = 0;
            squared = difference * difference;

 
            additionOfSquared += squared;


}     

            double divide = 0;
            divide = additionOfSquared / numberOfScoreGrade.length;
                return divide;

    
    }






}
