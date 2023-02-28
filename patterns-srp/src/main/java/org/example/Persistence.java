package org.example;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Persistence {
  public void saveToFile(Journal journal, String fileName) throws FileNotFoundException {
    try(PrintStream out = new PrintStream(fileName)) {
      out.println(journal.toString());
    }
  }
}
