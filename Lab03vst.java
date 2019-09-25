// Lab03vst.java
// Student starting version of the Lab03 assignment.
// Resave this program as Lab03v80 for the 80 point version.
// Resave this program as Lab03v100 for the 100 point version.


public class Lab03vst
{
	public static void main(String[] args)
	{
      System.out.println("Lab03, 100 Point Version\n");
      int start = 10000123;
      System.out.println("Starting milli-seconds: " + start);
      System.out.println("Hours:\t\t\t" + ((start / 3600) / 1000));
      System.out.println("Minutes:\t\t" + ((start %= 3600000) / 60000));
      System.out.println("Seconds:\t\t" + ((start%= 60000) /1000));
      System.out.println("Milli Seconds:\t\t" + (start %= 1000));

		}
	}
