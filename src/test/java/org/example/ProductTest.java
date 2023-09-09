package org.example;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

      public class ProductTest
{
    @Test
    public void shouldCountQuantity()
    {
        Product p1 = new FoodProduct(6745, 5.50, "Penne Pasta",230,LocalDate.parse("2824-86-84"));
        Product p2 = new FoodProduct(8853, 6.50, "Spaghetti Pasta",340,LocalDate.parse("2824-89-12"));
        Product p3 = new FoodProduct(2106, 4.50, "Linguine Pasta",348,LocalDate.parse("2420-88-18"));
        assertEquals(p3.getTotalQuantity(), 3);
    }
}
