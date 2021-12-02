// import scanner so we can get user inputs
import java.util.Scanner;
// import so we can use ArrayList
import java.util.ArrayList; 

class Calculations {
// function that gets user inputs and calculates compound interest
    public void compound() {
    // create a scanner to get user inputs
    Scanner input = new Scanner(System.in);
    // get principal
    System.out.print("Enter the principal: ");
    double principal = input.nextDouble();
    // get interest rate
    System.out.print("Enter the interest rate: ");
    double rate = input.nextDouble();
    // get the number of years it will be compounded
    System.out.print("Enter number of years: ");
    int number = input.nextInt();
    // calculate the compounded interest
    double interest = principal * (Math.pow((1 + rate/100), (number))) - principal;
    // tell the user the results
    System.out.println("Principal: " + principal);
    System.out.println("Interest Rate: " + rate);
    System.out.println("Number of Years Interest Compounded: " + number);
    System.out.println("Compound Interest: " + interest);
    System.out.println("Final Principal: " + (interest + principal));
  }
    // function that gets user inputs and calculates simple interest
    public void simple() {
    // create a scanner to get user inputs
    Scanner input = new Scanner(System.in);
    // get principal
    System.out.print("Enter the principal: ");
    double principal = input.nextDouble();
    // get interest rate
    System.out.print("Enter the interest rate: ");
    double rate = input.nextDouble();
    // get the number of years it will be compounded
    System.out.print("Enter number of years: ");
    int number = input.nextInt();
    // calculate the compounded interest
    double interest = principal * (1 + (rate/100)*number) - principal;
    // tell the user the results
    System.out.println("Principal: " + principal);
    System.out.println("Interest Rate: " + rate);
    System.out.println("Number of Years Interest Compounded: " + number);
    System.out.println("Simple Interest: " + interest);
    System.out.println("Final Principal: " + (interest + principal));
  }
    // function that gets user inputs and calculates monthly savings to reach goal
    public void goal() {
    // create a scanner to get user inputs
    Scanner input = new Scanner(System.in);
    //create an ArrayList to store the numbers
    ArrayList nums = new ArrayList();
    // get principal
    System.out.print("Enter the goal amount: ");
    double goal = input.nextDouble();
    // add goal to ArrayList
    nums.add(goal);
    // get the number of years 
    System.out.print("Enter number of years: ");
    int years = input.nextInt();
    // add years to ArrayList
    nums.add(years);
    // calculate the compounded interest
    double monthlyAmount = goal / (12 * years);
    // add monthlyAmount to ArrayList
    nums.add(monthlyAmount);
    // tell the user the results
    System.out.println("Goal: " + nums.get(0));
    System.out.println("Number of Years Saving: " + nums.get(1));
    System.out.println("Amount to Save Each Month: " + nums.get(2));
  }
}
