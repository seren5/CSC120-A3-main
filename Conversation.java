import java.util.*;
class Conversation {

  public static String[] transcript;
  public static String[] randomResponses = {"Is that so...","Interesting observation...", "I see...", "Mhm..."};

  public static void main(String[] arguments) {
    // You will start the conversation here.

    Scanner sc = new Scanner(System.in);
    System.out.println("How many rounds? (in numbers)"); // Take input of how many rounds
    int userRoundInput = sc.nextInt();
    System.out.println("Hi, what's up?");
    
    String userInput = sc.nextLine();

    for (int i=0; i < userRoundInput; i++){
      userInput = sc.nextLine();
      String answer = userInput;
      // transcript.add(answer);

      if (userInput.contains("I")|| 
      userInput.contains("me")||
      userInput.contains("am")||
      userInput.contains("are")||
      userInput.contains("you")||
      userInput.contains("am")||
      userInput.contains("my")||
      userInput.contains("I'm")||
      userInput.contains("?")||
      userInput.contains(".")||
      userInput.contains("You")){
        if (userInput.contains("I")){
          System.out.println(userInput);
          if (userInput.contains(" I ")){
            answer = userInput.replaceAll(" I ", "you");
            }
          else{
            answer = userInput.replaceAll("I", "You");
            }
          
          }
        if (userInput.contains("me")){
          answer = userInput.replaceAll("me", "you");
          }

        if (userInput.contains("am")){
          answer = userInput.replaceAll("am", "are");
          }
        if (userInput.contains("you")){
          answer = userInput.replaceAll("you", "I");
          }
        
        if (userInput.contains("You")){
          answer = userInput.replaceAll("You", "I");
        }
          
        if (userInput.contains("my")){
          answer = userInput.replaceAll("my", "your");
          }
          
        if (userInput.contains("I'm")){
          if (userInput.contains(" I'm ")){
            answer = userInput.replaceAll("I'm", "you're");
              //userInput.replace(".", "?");
            }
          else{
            answer = userInput.replaceAll("I'm", "You're");
            }}
          
        if (userInput.contains("?")){
          answer = userInput.replaceAll("?", ".");
          }

        if (userInput.contains(".")){
          answer = userInput.replaceAll(".", "?");
          }
        
        // if (userInput.contains("temp")){
        //   answer = userInput.replaceAll("temp", "you");
        // }

        // if (userInput.contains("tempCapital")){
        //   answer = userInput.replaceAll("tempCapital", "You");
        // }
        }
      else{
        Random r = new Random();
        int randI = r.nextInt(randomResponses.length);
        answer = randomResponses[randI];
      }
      System.out.println(answer);
      
    }  
    System.out.println("Bye! Have a nice day!"); 

    sc.close();
  }
}
