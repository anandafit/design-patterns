package org.example.impl;

import org.example.Product;
import org.example.Size;
import org.example.Specification;

import java.util.List;
import java.util.stream.Stream;

public class SizeSpecification implements Specification<Product> {
  final private Size size;

  public SizeSpecification(Size size) {
    this.size = size;
  }

  @Override
  public boolean isSatisfied(Product product) {
    return product.size == size;
  }


}
