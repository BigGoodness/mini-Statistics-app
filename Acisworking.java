public class Acisworking{
    private static boolean isOn = true;
    private static boolean isOff = true;
    private int temperatureIncrease = 16;
    private int temperatureDecrease = 30;
    
    public static boolean acIsTurnedOn(){

            if (isOn == true){
                System.out.println("Ac is turned on");    
            } else{
                System.out.println("Ac is turned off");
            }
            return isOn;

    }

   public static boolean acIsTurnedOff(){

            if (isOff == true){
                System.out.println("Ac is switched off");
            }
            return isOff;
    }

   public int acTemperatureIncreased(){

            if (temperatureIncrease < 30){
            temperatureIncrease++;

            }
            return temperatureIncrease;
    }

   public int acTemperatureDecreased(){

            if (temperatureDecrease > 16){
              temperatureDecrease--;
            }
              return temperatureDecrease;
    }
   public int acTemperatureIncreasedby30(){

            if (temperatureIsIncreased < 30){
                temperatureIncrease++;
            }
                return temperatureIncrease;
            
    }


}


