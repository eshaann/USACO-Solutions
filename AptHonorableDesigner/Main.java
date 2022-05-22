import java.util.Scanner;
import java.util.HashMap;
class Main {
  public static void main(String[] args) throws Exception
  {
    // create an object of Scanner
    // associated with the file
    Scanner sc = new Scanner(System.in);
    HashMap <Character, Integer> correctMap= new HashMap<Character, Integer>();

   char[][] correct = new char[3][3];
   for(int i = 0; i<3; i++){
     String s = sc.nextLine();
     for(int k = 0;k<3; k++){
       correct[i][k] = s.charAt(k);
       if(correctMap.containsKey(correct[i][k])){
         correctMap.put(correct[i][k], correctMap.get(correct[i][k])+1);
       }
       else{
         correctMap.put(correct[i][k], 1);
       }
     }
   }
  //guess
  HashMap <Character, Integer> guessMap= new HashMap<Character, Integer>();
  char[][] guess = new char[3][3];
   for(int i = 0; i<3; i++){
     String s = sc.nextLine();
     for(int k = 0;k<3; k++){
       guess[i][k] = s.charAt(k);
     }
   }
  //checks
  int greens = 0;
  for(int i = 0;i<3; i++){
    for(int k = 0;k<3; k++){
      char curr = guess[i][k];
      if(guess[i][k]==correct[i][k]){
        greens++;
        correctMap.put(curr, correctMap.get(curr)-1);
      }
    }
  }
  System.out.println(greens);
  int yellow = 0;
  for(int i = 0;i<3; i++){
    for(int k = 0;k<3; k++){
      char curr = guess[i][k];
      if(guess[i][k]!=correct[i][k] && correctMap.containsKey(guess[i][k]) && correctMap.get(guess[i][k])>0){
        greens++;
        correctMap.put(curr, correctMap.get(curr)-1);
        yellow++;
      }
    }
  }
  System.out.println(yellow);
    
    }
}
