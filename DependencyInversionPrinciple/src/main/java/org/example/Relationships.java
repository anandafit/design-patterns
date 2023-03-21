package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.javatuples.Triplet;

public class Relationships implements RelationshipBrowser{ // low level module
  private List<Triplet<Person, Relationship, Person>> relations = new ArrayList<>();

  public void addParentAndChild(Person parent, Person child) {
    relations.add(new Triplet<>(parent, Relationship.PARENT, child));
    relations.add(new Triplet<>(child, Relationship.CHILD, parent));
  }

  public List<Triplet<Person, Relationship, Person>> getRelations() {
    return relations;
  }

  @Override
  public List<Person> findAllChildrenOf(String name) {
    // convert in order to used for high level information by hiding low level details.
    return relations.stream().filter(x -> x.getValue0().name.equals("Johan") && x.getValue1() == Relationship.PARENT)
        .map(Triplet::getValue2).collect(Collectors.toList());
  }
}
