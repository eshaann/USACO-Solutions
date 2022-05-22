import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner stdin = new Scanner(System.in);
    int N=stdin.nextInt();
    stdin.nextLine();
    
    String str = stdin.nextLine();

    int count = 0;

    for(int i = 0; i<N; i++){
      for(int k = i+3; k<N+1; k++){
        String s = str.substring(i, k);
        if(numOccur(s, "G") == 1){
          count++;
        }
        if(numOccur(s, "H") == 1){
          count++;
        }
        
      }
    }
    System.out.println(count);

    
    stdin.close();
  }
  public static int numOccur(String str, String s){
    int count = 0;
    for(int i = 0; i<str.length(); i++){
      if(str.substring(i, i+1).equals(s)){
        count++;
      }
    }
    return count;
  }
}