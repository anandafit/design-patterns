package org.example;


import java.io.FileNotFoundException;

public class Demo {
  public static void main(String[] args) {
    Journal journal = new Journal();
    journal.addEntry("This is my fist line");
    journal.addEntry("This is my second line");

    Persistence persistence = new Persistence();
    try {
      persistence.saveToFile(journal, "sample_file");
    } catch (FileNotFoundException e) {
      System.out.println("error while store the file");
      throw new RuntimeException(e);
    }
  }
}
