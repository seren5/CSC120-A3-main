import java.util.*;
class Conversation {

  public static String[] transcript;
  public static String[] randomResponses = {"Is that so...","Interesting observation"};

  public static void main(String[] arguments) {
    // You will start the conversation here.

    Scanner sc = new Scanner(System.in);
    System.out.println("How many rounds? (in numbers)"); // Take input of how many rounds
    int userRoundInput = sc.nextInt();
    System.out.println("Hi, what's up?");
    
    for (int i=0; i < userRoundInput; i++){
      String userInput = sc.nextLine();
      
      if (userInput.contains("I")){
        if (userInput.contains(" I ")){
          userInput.replace(" I ", "you");
          //userInput.replace(".", "?");
        }
        else{
          userInput.replace("I ", "You");
        }
      
      if (userInput.contains("me")){
        userInput.replace("me", "you");
      }

      if (userInput.contains("am")){
        userInput.replace("am", "are");
      }
      if (userInput.contains("you")){
        userInput.replace("you", "I");
      }
      
      if (userInput.contains("my")){
        userInput.replace("my", "your");
      }
      
      if (userInput.contains("I'm")){
        if (userInput.contains(" I'm ")){
          userInput.replace("I'm", "you're");
          //userInput.replace(".", "?");
        }
        else{
          userInput.replace("I'm", "You're");
        }

          System.out.println(userInput);
      }
    System.out.println("Bye! Have a nice day!");  

    } // Loop for number of rounds
      // Greeting line (maybe variation)
      // Take new user input
      //if userInput.contains("I "):
        // return "You" and userinput sentence
        // if userInput.contains
    
    // print different messages
        

  }
}}
