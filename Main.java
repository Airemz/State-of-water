import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner key=new Scanner(System.in);

    System.out.println();
    System.out.println("What is the temperature of the water in degrees?");

    int temp = key.nextInt();

        if (-20<=temp && temp<0) {
          System.out.println("The state is ice");
        }

        else if (temp==0) {
          System.out.println("The state is ice+water");
        }

        else if (0<temp && temp<100) {
          System.out.println("The state is water");
        }

        else if (temp==100) {
          System.out.println("The state is water+steam");
        }

        else if (temp>100) {
          System.out.println("The state is steam");
        }

  }
}