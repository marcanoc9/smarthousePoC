

import java.util.Scanner;

public class SmartHome2
{
    public static void main(String args[])
    {
        //Declaring the objext
        Light lt = new Light();
        Music mu = new Music();
        Oven ov = new Oven();
        Television tv = new Television();
        HVAC hvac = new HVAC();
        Camera cm = new Camera();
        Refrigerator rf = new Refrigerator();
        MotionSensor ms = new MotionSensor();

       //set up scanner and variables
        Scanner in;
        int choice;
        while(true)
        {// intro instructions
            System.out.println("Enter Command 1 to 14.");
            System.out.println("Press 1 for Help.");
            System.out.println("Enter Command");
            in = new Scanner(System.in);
            choice = in.nextInt();
            //sets up the cases to process user input
            switch(choice)
            {// these all call the methods in the class set up in Device.java
                case 1 :

                    System.out.println("User Command");
                    System.out.println("1 - Help");
                    System.out.println("2 - Play Music");
                    System.out.println("3 - Increase Music Vol");
                    System.out.println("4 - Change TV Channel");
                    System.out.println("5 - Increase TV Vol");
                    System.out.println("6 - Change HVAC Humidity");
                    System.out.println("7 - Start Oven");
                    System.out.println("8 - Change Refrigerator Temperature");
                    System.out.println("9 - Take Photo");
                    System.out.println("10 - Delete Photo");
                    System.out.println("11 - Detect Motion");
                    System.out.println("12 - Switch On Light");
                    System.out.println("13 - Switch Off Light");
                    System.out.println("14 - Quit");
                    break;
                case 2:
                    mu.startPlay();
                    break;
                case 3:
                    mu.incrVol();
                    break;
                case 4:
                    tv.changeChannel(5);
                    break;
                case 5:
                    tv.incrVol();
                    break;
                case 6:
                    hvac.changeHumidity(5);
                    break;
                case 7:
                    ov.startOven();
                    break;
                case 8:
                    rf.changeTemp(5);
                    break;
                case 9:
                    cm.clickPhoto();
                    break;
                case 10:
                    cm.deletePhoto();
                    break;
                case 11:
                    ms.detectMotion();
                    break;
                case 12:
                    lt.switchOn();
                    break;
                case 13:
                    lt.switchOff();
                    break;
                case 14:
                    System.out.println("Quitting");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Command");
                    break;
            }
        }
    }
}