
import java.io.*;

public class CheckBlankLine {

  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String s;
    //ygao: only detect ctrl-Z or ctrl-D to quit, accept blank line
    while ((s = in.readLine()) != null) {
      System.out.println(s);
      if (s.trim().isEmpty()) {
      //if (s.matches("\\s*")) {
        System.out.println("blank line");
      }
    }
  }
} ///:~


