package org.example;

import java.util.List;

public interface Specification<T> {
  boolean isSatisfied(Product product);
}
