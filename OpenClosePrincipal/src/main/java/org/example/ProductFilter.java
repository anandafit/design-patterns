package org.example;

import java.util.List;
import java.util.stream.Stream;

public class ProductFilter {
  public String name;

  public Stream<Product> colourFilter(List<Product> productList, Color color){
    return productList.stream().filter(p -> p.color == color);
  }

  public Stream<Product> sizeFiler(List<Product> productList, Size size) {
    return productList.stream().filter(p -> p.size == size);
  }

  public Stream<Product> sizeAndColourFilter(List<Product> productList, Size size, Color color) {
    return productList.stream().filter(p -> p.size == size && p.color == color);
  }
}
