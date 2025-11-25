///*
// * CSCI 185 M02
// * Fall 2025
// * M10: Text I/O Lab
// * Author: Benjamin Chau
// * Date: 11/25/2025
// */
public class TestTester{
  PrintWriter output = new PrintWriter("temp.txt");
  for (int i=0; i<10; i++){
    output.writeInt((int)(Math.random()*200)-100);
  }

  output.close();
}
