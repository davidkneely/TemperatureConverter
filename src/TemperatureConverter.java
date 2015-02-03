/**
 * Created by davidneely on 2/2/15.
 */
public class TemperatureConverter {
  public static void main(String[] args) {
    double celsius, fahrenheit = 0;

    if(args[1] != null){

      if(args[0].equals("-F")){ // initial value is in farenheit
        fahrenheit = Double.parseDouble(args[1]);
        celsius = (fahrenheit - 32) * 5/9;
        System.out.println("celsius is: " + celsius);
      }
      else if(args[0].equals("-C")){ // init value is celcius
        celsius = Double.parseDouble(args[1]);
        fahrenheit = (celsius * 9/5) + 32;
        System.out.println("farenheit is: " + fahrenheit);
      }
      else{ // first arg is wrong
        // print error
        System.out.println("illegal first argument");
      }
    }
    else{
      System.out.println("illegal second argument");
    }

  }
}
