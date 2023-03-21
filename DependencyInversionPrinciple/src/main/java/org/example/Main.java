package org.example;

public class Main {
  public static void main(String[] args) {

    Person parent = new Person("Johan");
    Person child1 = new Person("Chris");
    Person child2 = new Person("Matt");

    Relationships relationships = new Relationships();
    relationships.addParentAndChild(parent, child1);
    relationships.addParentAndChild(parent, child2);

    new Research(relationships);

    System.out.println("Hello world!");
  }
}
