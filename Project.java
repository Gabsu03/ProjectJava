import java.util.Scanner;

public class BranchManagerLogin {
   
    public static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String username, password;

   
    System.out.print("Enter username: ");
    username = input.nextLine();
    System.out.print("Enter password: ");
    password = input.nextLine();

   
    if (username.equals("Juan") && password.equals("120000")) {
      System.out.println("Correct Password. Choose a Transaction.");
     
      carRental();
     
     
    } else {
      System.out.println("Incorrect password.Please try again.");
    }
  }
 
  public static void carRental(){
      System.out.println("Choose a number.Services offered:");
    System.out.println("1. Rent a car");
    System.out.println("2. Membership");

   
    int choice = input.nextInt();
    if (choice == 1) {
      System.out.println("You chose #1, Rent a Car. Choose the number assigned for the car you want to rent.");
      System.out.println("1- Compact Sedan - 550 per day");
      System.out.println("2- Minivan - 700 per day");
      System.out.println("3- Midsize SUV - 900 per day");
      System.out.println("4- Fullsize Van - 1,100 per day");

     
      System.out.println("You chose car number: ");
      int carChoice = input.nextInt();

     
      int pricePerDay;
      switch (carChoice) {
        case 1:
          pricePerDay = 550;
          break;
        case 2:
          pricePerDay = 700;
          break;
        case 3:
          pricePerDay = 900;
          break;
        case 4:
          pricePerDay = 1100;
          break;
        default:
          System.out.println("Invalid choice. Please try again.");
          return;
      }

     
      System.out.print("Please input the number of rental days: ");
      int rentalDays = input.nextInt();

      int totalFees = pricePerDay * rentalDays;
      System.out.println("The total fees to pay is: " + totalFees);
      System.out.println("Thankyou");
     
  }else if(choice == 2){
      getMembership();
  }
 
 
}
   
    public static void getMembership(){
      System.out.println("Choose a membership ");
      System.out.println("Annual Membership Php 500.00 ");
      System.out.println("Monthly Membership Php 100.00 ");
     
      System.out.println("You chose: ");
      int selectedMembership = input.nextInt();
     
      System.out.println("Please input the number of months/year: ");
      int duration = input.nextInt();
     
      if(selectedMembership == 1){
          int total = 500 * duration;
          System.out.println("Your total membership is :" + total);
         
      }else if(selectedMembership == 2){
          int total = 100 * duration;
          System.out.println("Your total membership is :" + total);
      }
      System.out.println("Thank You!");
     
  }
}
