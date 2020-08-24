package pl.C_to_F;

import java.util.Scanner;

public class Temp_Conv {

    public void getTemp() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter temperature: ");

        float temp = myObj.nextFloat();
        float farenTemp = (float) (temp * 1.8 + 32);
        System.out.println("Your temp in Farenheit is: " + farenTemp);

    }

}
