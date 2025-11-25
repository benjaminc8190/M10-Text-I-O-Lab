///*
// * CSCI 185 M02
// * Fall 2025
// * M10: Text I/O Lab
// * Author: Benjamin Chau
// * Date: 11/25/2025
// */

import java.io.*;

public class TextTester{

  public static void main(String[] args) throws IOException{
    int num;
    BufferedWriter output = new BufferedWriter(new FileWriter("temp.txt"));
    for (int i = 0; i < 10; i++) {
        num = (int)(Math.random() * 200) - 100;
        output.write(num+" ");
    }
    output.close();

    BufferedReader input = new BufferedReader(new FileReader("temp.txt"));

    System.out.println(input.nextInt());

    input.close();
  }
}
