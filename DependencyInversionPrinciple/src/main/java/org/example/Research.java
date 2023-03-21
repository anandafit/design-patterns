package org.example;

import org.javatuples.Triplet;

import java.util.List;

public class Research {  //high-level class which more close to the client
  public Research(Relationships relationships) {
    // this method is depend on low leave detials like List<Triplet<Person, Relationship, Person>>.
    // If some one need to change this we have to change the this method also.
    List<Triplet<Person, Relationship, Person>> relations = relationships.getRelations();
    relations.stream().filter(x -> x.getValue0().name.equals("Johan") && x.getValue1() == Relationship.PARENT)
        .forEach(ch -> System.out.println("Johan has a child called "+ ch.getValue2().name));
  }

  public Research(RelationshipBrowser browser) {
    // Here no dependency with low level impl. Therefore high level impl should not depend on low level details
    List <Person> children = browser.findAllChildrenOf("Johan");

    for (Person child: children) {
      System.out.println("Johan has a child called " + child.name);
    }
  }
}
