import java.io.*;

public class Timer {
  public static void main(String[] args) throws IOException {


    long startTime = System.nanoTime();
    for (long i=0; i<10000; i++)
        System.out.println("Hello, world");
    long endTime = System.nanoTime();
    long duration = endTime - startTime;

    System.out.println(duration);
  }
}




