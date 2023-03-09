package org.example.impl;

import org.example.Color;
import org.example.Product;
import org.example.Size;
import org.example.Specification;

public class SizeAndColourSpecification implements Specification<Product> {
  final private Color color;
  final private Size size;

  public SizeAndColourSpecification(Color color, Size size) {
    this.color = color;
    this.size = size;
  }

  @Override
  public boolean isSatisfied(Product product) {
    return product.size == size && product.color == color;
  }
}
