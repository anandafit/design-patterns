package org.example;

import java.util.List;
import java.util.stream.Stream;

public interface Filter<T> {
  Stream<Product> filter(List<T> productList, Specification<T> specification);
}
