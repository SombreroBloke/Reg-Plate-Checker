
package reg.plate.checker;
import java.util.*;

public class RegPlateChecker {

    public static void main(String[] args) 
    {
      Scanner input = new Scanner (System.in);
      List<String>plates = new ArrayList<>();
      plates.add("BD51SMR");
      plates.add("NC03ASK");
      plates.add("MT64SKJ");
      plates.add("YC52RES");
      plates.add("TV32CTN");
      plates.add("MA64BHN");
      plates.add("KM17RKO");
      plates.add("LN15PNG");
      plates.add("LS12LMG");
      plates.add("GS11QDS");
      plates.add("AC17HOL");
                
      System.out.println("Insert registration plate:");
      String response = input.nextLine();
      response = response.toUpperCase();
      

      if (plates.contains(response))
      {
          System.out.println("Car found");
          
      }
      else
              {
                  System.out.println("Car not found");
              }
      
      
        
        
    }
    
}

