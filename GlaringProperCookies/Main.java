import java.util.Scanner;
class Main {
  private static int[] picknextPair(long[] arr){
    long max = arr[0];
    int index = 0;
    for(int i = 1; i<arr.length; i++){
      if(arr[i]>max){
        max = arr[i];
        index = i;
      }
    }
    int partnerIndex = 0;
    if(index!= 0 && index!= arr.length-1){
      if(arr[index-1]<=arr[index+1]){
        partnerIndex = index+1;
      }
      else{
        partnerIndex = index-1;
      }
    }
    else if(index == 0){
      partnerIndex = index+1;
    }
    else{
      partnerIndex = index-1;
    }
    int [] returned = {-1, -1};
    if(arr[index] != 0 && arr[partnerIndex] != 0){
      returned[0] = index;
      returned[1] = partnerIndex;
    }
    return returned;
  }
  
  //all equal
  public static boolean allEqual(long[] arr){
    long num = arr[0];
    for(int i = 1; i<arr.length; i++){
      if(arr[i]!=num){
        return false;
      }
    }
    return true;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    sc.nextLine();
    for(int i = 0; i<N; i++){
       long C = sc.nextLong();
    
      sc.nextLine();
      String str = sc.nextLine();
      String [] strArr = str.split(" ");
      long[] hunger = new long[strArr.length];
      long count = 0;
      for(int j = 0; j<strArr.length; j++){
        hunger[j] = Long.parseLong(strArr[j]);
      }
      while(!allEqual(hunger)){
        int[] arr = picknextPair(hunger);
        if(arr[0] == -1){
          count = -1;
          break;
        }
        else{
          hunger[arr[0]]--;
          hunger[arr[1]]--;
          count++;
        }
      }
      if(count!=-1){
        System.out.println(count*2);
      }
      else{
        System.out.println(count);
      }
    }
  }
}