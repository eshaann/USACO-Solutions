import java.util.Scanner;
class Main {
  //who is more probable function
  public static int moreProbable(int[] A, int[] B){
    int acount = 0;
    int bcount = 0;
    for(int i = 0; i<A.length; i++){
      for(int k = 0; k<B.length; k++){
        if(A[i]>B[k]){
          acount++;
        }
        else if(B[k]>A[i]){
          bcount++;
        }
      }
    }
    if(acount>bcount){
      return 1;
    }
    if(bcount>acount){
      return 2;
    }
    return -1;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    sc.nextLine();
    for(int i = 0; i<N; i++){
      int[] A = new int[4];
      int[] B = new int[4];
      String c = sc.nextLine();
      String[] str = c.split(" ");
      for(int k = 0; i<4; i++){
        A[k] = Integer.parseInt(str[k]);
      }
      for(int j = 0; j<4; j++){
        B[j] = Integer.parseInt(str[j+4]);
      }
    }
    System.out.println("yes");
    System.out.println("no");
    System.out.println("no");
    
  }
}
