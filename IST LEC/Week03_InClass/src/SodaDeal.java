/**
 File name: Week03.java
 Short description:
 IST 140 Assignment:  Enter Assignment # here
 @author Sai Rangineeni
 @version 1/23  023
 date of last revision:
 details of the revision:
 */

public class SodaDeal {
  public static void main(String[] args) {
   int cansPerPack = 12;
   double totalVolume = 20;
   final double CAN_VOLUME = 4;

   Scanner input = new Scanner(System.in);

   System.out.println("How many cans are in a pack?");
   cansPerPack = input.nextInt();
   if (cansPerPack < 1) {
    System.out.println("Not enough cans.");
   }
   System.out.println("What is the volume of a can?");

   totalVolume = cansPerPack * totalVolume;


   System.out.println("Total Volume for " + cansPerPack+ " : " + totalVolume);
  }
}