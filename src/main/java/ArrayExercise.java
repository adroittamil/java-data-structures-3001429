import java.util.Arrays;

public class ArrayExercise {

  public void arrayToUpperCase(String[] input) {
    for(int i = 0; i < input.length; i++) {
      input[i] = input[i].toUpperCase();
    }
     Arrays.stream(input).forEach(System.out::println);
  }

  public void incrementArray(int[] input) {
    // Add code here to increment each element in the array by 1
    for ( int i =0; i< input.length;i++) {
      input[i]=input[i]+1;
    }
  }

}
