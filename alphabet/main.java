import java.util.Scanner;

class Main {
  public static void main(String[] args) throws Exception
  {
 
    Scanner sc = new Scanner(System.in);

    String cowphabet = sc.nextLine();

    String heard = sc.nextLine();

    char[] heardArr = new char[heard.length()];

    for(int j = 0; j<heardArr.length; j++){
      heardArr[j] = heard.charAt(j);
    }

    int count = 1;

    for(int i = 1; i<heardArr.length; i++){
      if(cowphabet.indexOf(heardArr[i])<=cowphabet.indexOf(heardArr[i-1])){
        count++;
      }
    }

    System.out.println(count);



    }
}
