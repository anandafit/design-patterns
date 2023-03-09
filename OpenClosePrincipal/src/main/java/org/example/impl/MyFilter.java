package org.example.impl;

import org.example.Filter;
import org.example.Product;
import org.example.Specification;

import java.util.List;
import java.util.stream.Stream;

public class MyFilter implements Filter<Product> {

  @Override
  public Stream<Product> filter(List<Product> productList, Specification<Product> specification) {
    return productList.stream().filter(specification::isSatisfied);
  }
}
