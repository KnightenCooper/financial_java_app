// import scanner so we can get user inputs
import java.util.Scanner;

class Main {
    
  public static void main(String[] args) {
    // create object with calculations
    Calculations calculate = new Calculations();

    // create a scanner to get user inputs
    Scanner input = new Scanner(System.in);
    // ask user to quit or calc
    System.out.print("Enter \'quit\' to exit or \'compound\' for compound interest or \'simple\' for simple interest or \'goal\' for amount per month for goal : ");
    String menu = input.nextLine();
    // options to use for compares
    String quit = "quit";
    String compound = "compound";
    String simple = "simple";
    String strgoal = "goal";
    // do this while the user menu input does NOT equal quit
    while (!menu.equals(quit)) {
  // if the user inputs compound do the compound interest calculation
    if (menu.equals(compound)) {
      // call the compound function
      calculate.compound();
  }
  // if the user inputs goal do the monthly savings calculation
    if (menu.equals(strgoal)) {
      // call the goal function
      calculate.goal();
  }
  // if the user inputs simple do the simple interest calculation
    if (menu.equals(simple)) {
      // call the simple function
      calculate.simple();
  }
  //have the user input menu input again
  System.out.print("Enter \'compound\' or \'simple\' or \'goal\' or \'quit\' : ");
    menu = input.nextLine();
  }
  // once the user inputs 'quit' run the below code b/c while loop ends
  // close input
  input.close();
  // close program
  System.exit(0);
}
}

// Sources:
// https://stackoverflow.com/questions/26269193/how-to-call-a-method-function-from-another-class/26269220
// https://www.w3schools.com/java/tryjava_multi.asp?filename=demo_classes&multi=demo_classes_multi
// https://mail.codejava.net/java-se/file-io/how-to-read-and-write-text-file-in-java
// https://stackoverflow.com/questions/7209110/java-util-nosuchelementexception-no-line-found
// https://www.w3schools.com/java/java_classes.asp
// https://www.w3schools.com/java/java_methods.asp
// https://www.dinkytown.net/java/savings-goal-calculator.html
// https://www.investor.gov/financial-tools-calculators/calculators/savings-goal-calculator
// https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html
// https://www.javatpoint.com/string-comparison-in-java
// https://www.delftstack.com/howto/java/java-end-program/
// https://www.programiz.com/java-programming/examples/simple-compound-interest
// https://www.dummies.com/programming/java/use-array-lists-in-java/
