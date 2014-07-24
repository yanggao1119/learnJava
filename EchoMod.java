// : c12:Echo.java
// How to read from standard input.
// {RunByHand}
// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.

import java.io.*;

public class EchoMod {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String s;
    //ygao: only detect ctrl-Z or ctrl-D to quit, accept blank line
    while ((s = in.readLine()) != null)
      System.out.println(s);
    // An empty line or Ctrl-Z terminates the program
  }
} ///:~
