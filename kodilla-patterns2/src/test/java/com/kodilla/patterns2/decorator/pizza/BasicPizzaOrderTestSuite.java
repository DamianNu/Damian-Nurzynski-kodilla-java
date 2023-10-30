package com.kodilla.patterns2.decorator.pizza;

import com.kodilla.patterns2.decorator.taxiportal.BasicTaxiOrder;
import com.kodilla.patterns2.decorator.taxiportal.TaxiOrder;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class BasicPizzaOrderTestSuite {
    @Test
    public void testBasicPizzaOrderGetCost() {
        // Given
        PizzaOrder pizza = new BasicPizzaOrder();
        // When
        BigDecimal cost = pizza.getCost();
        // Then
        assertEquals(new BigDecimal(18), cost);
    }

    @Test
    public void testBasicPizzaOrderGetDescription() {
        // Given
        PizzaOrder pizza = new BasicPizzaOrder();
        // When
        String description = pizza.getDescription();
        // Then
        assertEquals("Pizza: sauce tomato + cheese", description);
    }

    @Test
    public void testPizzaOrderWithHamGetCost() {
        // Given
        PizzaOrder pizza = new BasicPizzaOrder();
        pizza = new HamDecorator(pizza);
        // When
        BigDecimal cost = pizza.getCost();
        // Then
        assertEquals(new BigDecimal(24), cost);
    }

    @Test
    public void testPizzaOrderWithHamGetDescription() {
        // Given
        PizzaOrder pizza = new BasicPizzaOrder();
        pizza = new HamDecorator(pizza);
        // When
        String description = pizza.getDescription();
        // Then
        assertEquals("Pizza: sauce tomato + cheese + ham", description);
    }

    @Test
    public void testPizzaOrderWithHamMushroomsGetCost() {
        // Given
        PizzaOrder pizza = new BasicPizzaOrder();
        pizza = new HamDecorator(pizza);
        pizza = new MushroomsDecorator(pizza);
        // When
        BigDecimal cost = pizza.getCost();
        // Then
        assertEquals(new BigDecimal(28), cost);
    }

    @Test
    public void testPizzaOrderWithHamMushroomsGetDescription() {
        // Given
        PizzaOrder pizza = new BasicPizzaOrder();
        pizza = new HamDecorator(pizza);
        pizza = new MushroomsDecorator(pizza);
        // When
        String description = pizza.getDescription();
        // Then
        assertEquals("Pizza: sauce tomato + cheese + ham + mushrooms", description);
    }

    @Test
    public void testPizzaOrderWithHamMushroomsSalamiGetCost() {
        // Given
        PizzaOrder pizza = new BasicPizzaOrder();
        pizza = new HamDecorator(pizza);
        pizza = new MushroomsDecorator(pizza);
        pizza = new SalamiDecorator(pizza);
        // When
        BigDecimal cost = pizza.getCost();
        // Then
        assertEquals(new BigDecimal(34), cost);
    }

    @Test
    public void testPizzaOrderWithHamMushroomsSalamiGetDescription() {
        // Given
        PizzaOrder pizza = new BasicPizzaOrder();
        pizza = new HamDecorator(pizza);
        pizza = new MushroomsDecorator(pizza);
        pizza = new SalamiDecorator(pizza);
        // When
        String description = pizza.getDescription();
        // Then
        assertEquals("Pizza: sauce tomato + cheese " +
                "+ ham + mushrooms + salami", description);
    }

    @Test
    public void testPizzaOrderWithHamSalamiOnionMushroomsGetCost() {
        // Given
        PizzaOrder pizza = new BasicPizzaOrder();
        pizza = new HamDecorator(pizza);
        pizza = new SalamiDecorator(pizza);
        pizza = new OnionDecorator(pizza);
        pizza = new MushroomsDecorator(pizza);
        // When
        BigDecimal cost = pizza.getCost();
        // Then
        assertEquals(new BigDecimal(38), cost);
    }

    @Test
    public void testPizzaOrderWithHamSalamiOnionMushroomsGetDescription() {
        // Given
        PizzaOrder pizza = new BasicPizzaOrder();
        pizza = new HamDecorator(pizza);
        pizza = new SalamiDecorator(pizza);
        pizza = new OnionDecorator(pizza);
        pizza = new MushroomsDecorator(pizza);
        // When
        String description = pizza.getDescription();
        // Then
        assertEquals("Pizza: sauce tomato + cheese " +
                "+ ham + salami + onion + mushrooms", description);
    }

}