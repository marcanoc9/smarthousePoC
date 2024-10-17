import java.util.Scanner;

class Device
{

   //sets up the booleans which determine on/off status
    private boolean powerState;


    public Device(){
        powerState = false;
    }


    public boolean getPowerState()
    {
        return powerState;
    }

    // Method to know if balcony is available
    public void changePowerStatus(boolean status)
    {
        powerState = status;
    }

}




// music section
class Music extends Entertainment
{

    //tells whether a track is playing
    private int trackActive;
    private boolean isActive;


    public Music()
    {
        trackActive = 0;
        isActive = false;
    }


    public void startPlay()
    {
        trackActive = 1;
        isActive = true;
        System.out.println("Music is now playing.");
    }

}

//TV section
class Television extends Entertainment
{

    private int channel;


    public Television()
    {
        channel = 0;
        System.out.println("The channel is: " + channel);
    }


    public void changeChannel(int ch)
    {
        System.out.print("Please select a new channel number: ");
        Scanner in;
        in = new Scanner(System.in);
        ch = in.nextInt();
        channel = ch;
        System.out.println("Thank you, the new channel is: " + channel);



    }


}


// Appliance section
class Appliance extends Device
{


    private int count; // Count of Appliance systems


    public Appliance()
    {
        count = 3;

    }


    public int getApplianceCount()
    {
        return count;

    }
}
// entertainment class
class Entertainment extends Device
{


    private int count; // how many entertainment systems
    private int volume;


    public Entertainment()
    {
        count = 2;
        volume = 0;
    }


    public int getEntertainmentCount()
    {
        return count;

    }

    // volume control
    public void incrVol()
    {
        volume = volume + 1;
        System.out.println("Volume has been increased.");
    }}
// HVAC section
class HVAC extends Appliance
{


    private int humidity; // Humidity level indicator


    public HVAC()
    {
        humidity = 0;
    }


    public void changeHumidity( int humid)
    {
        System.out.print("Please select the new humidity level (positive integer): ");
        Scanner in;
        in = new Scanner(System.in);
        humid = in.nextInt();
        humidity = humid;
        System.out.println("Thank you, the new humidity level is: " + humidity);

    }
}

// Oven section
class Oven extends Appliance
{


    private boolean state;


    public Oven()
    {
        state = false;
    }

    // starts oven
    public void startOven()
    {
        state = true;
        System.out.println ("The oven is now on.");
    }
}

// Fridge section
class Refrigerator extends Appliance
{

    // temperature variable
    private int temperature;


    public Refrigerator()
    {
        temperature = 0;
    }

    // changes the temperature
    public void changeTemp(int temp)
    { System.out.print("Please enter new temperature:");
        Scanner in;
        in = new Scanner(System.in);
        temp = in.nextInt();
        temperature = temp;
        System.out.println("Thank you, the new temperature is: " + temperature + " degrees Celsius.");
    }

}

// security section
class Security extends Device
{


    private int count; // Count of Security systems


    public Security()
    {
        count = 2;
    }


    public int getSecurityCount()
    {
        return count;
    }
}

// Motion sensor section
class MotionSensor extends Security
{


    private boolean triggerAlarm;


    public MotionSensor()
    {
        triggerAlarm = false;
    }


    public void detectMotion()
    {
        triggerAlarm = true;
        System.out.println("The motion sensing alarm is now set.");
    }
}

// camera section
class Camera extends Security
{


    private int photoCount;


    public Camera()
    {
        photoCount = 0;
    }


    public void clickPhoto()
    {
        photoCount = photoCount + 1;
        System.out.println("Photo taken");
        System.out.println("You have taken: "+ photoCount + " pictures.");
    }

    // allows to delete photo
    public void deletePhoto()
    {
        photoCount = photoCount - 1;
        System.out.println("Previous photo deleted");
    }
}

// Lights section
class Light extends Device
{


    private int count; // how many lights
    private boolean state; // on/off status


    public Light()
    {
        count = 1;
    }


    public int getLightCount()
    {
        return count;
    }


    public boolean getLightState()
    {
        return state;
    }

    // turns light on
    public void switchOn()
    {
        state = true;
        System.out.println("The lights are now on.");
    }

    // turns light off
    public void switchOff()
    {
        state = false;
        System.out.println("The lights are now off.");

    }}
