package org.example;

import org.example.impl.MyFilter;
import org.example.impl.SizeSpecification;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ProductFilterTest {
  @Test
  void testColoFilter() {
    List<Product> productList = List.of(
        new Product("Product1", Color.GREEN, Size.LARGE),
        new Product("Product1", Color.BLUE, Size.MEDIUM),
        new Product("Product1", Color.RED, Size.YUGE)
    );

    ProductFilter productFilter = new ProductFilter();
    Stream<Product> productStream = productFilter.sizeFiler(productList, Size.LARGE);

    SizeSpecification sizeSpecification = new SizeSpecification(Size.LARGE);
    MyFilter myFilter = new MyFilter();
    myFilter.filter(productList, sizeSpecification);

    Assertions.assertEquals(myFilter.filter(productList, sizeSpecification).count(), productStream.count());

  }
}
