import java.util.*;
class Conversation {


  /**
   * public static String[] transcript
   */
  public static String[] randomResponses = {"Is that so...","Interesting observation...", "I see...", "Mhm..."};

  /**
   * 
   * @param arguments
   */
  public static void main(String[] arguments) {
    // You will start the conversation here.
    List<String> transcript = new ArrayList<>();
    
    // Starts recording number of lines in transcript
    int transcriptNum = 0;
    // Starts transcript
    transcript.add("\nTranscript\n==========");
    
    // Takes user input of how many rounds
    Scanner sc = new Scanner(System.in);
    System.out.println("How many rounds? (in numbers)");
    int userRoundInput = sc.nextInt();
    System.out.println("Hi, what's up?");
    transcript.add("Hi, what's up?");
    transcriptNum += 1;

    String userInput = sc.nextLine();

    
    
    // Loop to take user input
    for (int i=0; i < userRoundInput; i++){
      userInput = sc.nextLine();
      String answer = userInput; // User input
      transcript.add(answer);
      transcriptNum += 1;

      // Checks user input for mirror words
      if (userInput.contains("I")|| 
      userInput.contains("me")||
      userInput.contains("am")||
      userInput.contains("are")||
      userInput.contains("you")||
      userInput.contains("am")||
      userInput.contains("my")||
      userInput.contains("I'm")||
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
          if (userInput.contains(" me ")){
            answer = userInput.replaceAll("me", "you");
            }
          else{
            answer = userInput.replaceAll("me", "you");
            }
          }

        if (userInput.contains("am")){
          answer = userInput.replaceAll("am", "are");
          }
          
        if (userInput.contains("are")){
          answer = userInput.replaceAll("are", "am");
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
            }
          else{
            answer = userInput.replaceAll("I'm", "You're");
            }
          }
        }
      
      // Replies in canned responses if not
      else{
        Random r = new Random();
        int randI = r.nextInt(randomResponses.length);
        answer = randomResponses[randI];

      }
      System.out.println(answer);
      transcript.add(answer);
      transcriptNum += 1;
      
    }  
    System.out.println("Bye! Have a nice day!");
    transcript.add("Bye! Have a nice day!");
    transcriptNum += 1; 

    sc.close();
    
    // Loop to print out transcript in lines
    for (int i=0; i < transcriptNum; i++){
      System.out.println(transcript.get(i));
      }
}
}
