import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner stdin = new Scanner(System.in);
    int N = stdin.nextInt();
    stdin.nextLine();

    int[][] cells = new int[N][2];
    for(int i = 0; i<N; i++){
      for(int j = 0; j<2; j++){
        cells[i][j] = stdin.nextInt();
      }
    }
    int count = 0;
    for(int i = 0; i<N; i++){
      int cows = 0; 
      for(int k = 0; k<N; k++){
        if(cells[k][0] == cells[i][0] + 1 && cells[k][1] == cells[i][1]){
          cows++;
        }
        if(cells[k][0] == cells[i][0] - 1 && cells[k][1] == cells[i][1]){
          cows++;
        }
        if(cells[k][0] == cells[i][0] && cells[i][1]+1 == cells[k][1]){
          cows++;
        }
        if(cells[k][0] == cells[i][0] && cells[i][1]-1 == cells[k][1]){
          cows++;
        }
        if(cows == 3){
          System.out.println(count);
        }
      }
    }
  }
}
