package org.example;

import java.util.ArrayList;
import java.util.List;

public class Journal {
  List<String> entries = new ArrayList<>();
  int count = 0;
  public void addEntry(String entry) {
    entries.add(++count + ": "+ entry);
  }

  public void removeEntry(int index) {
    entries.remove(index);
  }
  //removeEntry
  //Violation
  public void savetoFile(){
  }

  @Override
  public String toString() {
    return String.join(System.lineSeparator(), entries);
  }
}

/**
 * Persistence
 *  saveToFile(Jur)
 *
 */
