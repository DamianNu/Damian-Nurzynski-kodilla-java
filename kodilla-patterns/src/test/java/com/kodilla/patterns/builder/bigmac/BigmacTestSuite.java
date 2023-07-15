package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {
    @Test
    void testNewBigmac() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun(Bun.SESAME)
                .burgers(3)
                .sauce(Sauce.THOUSAND_ISLANDS)
                .ingredient(Ingredient.MUSHROOMS)
                .ingredient(Ingredient.CHEESE)
                .ingredient(Ingredient.CHEESE)
                .ingredient(Ingredient.BACON)
                .ingredient(Ingredient.CUCUMBER)
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        assertEquals(5, howManyIngredients);
    }
}
