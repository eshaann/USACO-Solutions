import java.io.File;
import java.util.Scanner;
import java.io.*;
import java.util.Arrays;

class Main {

  public static void main(String[] args) throws Exception {
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("gymnastics.out")));
    // create a new file object
    File file = new File("gymnastics.in");

    // create an object of Scanner
    // associated with the file
    Scanner sc = new Scanner(file);

    // read each line and
    // increment count

    int K = sc.nextInt();
    int N = sc.nextInt();
    sc.nextLine();

    int[][] gym = new int[K][N];
    for (int i = 0; i < K; i++) {
      for (int k = 0; k < N; k++) {
        gym[i][k] = sc.nextInt();
      }
    }

    int count = 0;

    for (int i = 0; i < N; i++) {
      for (int j = i + 1; j < N; j++) {
        int beat = 0;
        int cowA = gym[0][i];
        int cowB = gym[0][j];
        for (int k = 0; k < K; k++) {
          // iIndex = findindex(gym[k][i], gym[k]);
          // jIndex = findindex(gym[k][j], gym[k])
          int iIndex = -1;
          int jIndex = -1;
          for (int g = 0; g < N; g++) {
            if (gym[k][g] == cowA) {
              iIndex = g;
            } else if (gym[k][g] == cowB) {
              jIndex = g;
            }
          }
          if (iIndex < jIndex) {
            beat++;
          }
        }
        if (beat == K) {
          count++;
        }
      }
    }
out.println(count);
    out.close();
    sc.close();
  }
}
