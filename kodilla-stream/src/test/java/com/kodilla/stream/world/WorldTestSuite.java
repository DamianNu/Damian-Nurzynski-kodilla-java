package com.kodilla.stream.world;

import org.junit.jupiter.api.*;

import java.math.BigDecimal;


public class WorldTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Test case: start of test");
    }

    @AfterEach
    public void after() {
        System.out.println("Test case: end of test");
    }


    @DisplayName("Test method getPeopleQuantity from World Class")
    @Test
    void testGetPeopleQuantity() {
        //Given
        Continent europe = new Continent("Europe");
        europe.addCountry(new Country("Germany",new BigDecimal("83783942")));
        europe.addCountry(new Country("United Kingdom",new BigDecimal("67886011")));
        europe.addCountry(new Country("France",new BigDecimal("65273511")));
        europe.addCountry(new Country("Italy",new BigDecimal("60461826")));

        Continent africa = new Continent("Africa");
        africa.addCountry(new Country("Nigeria",new BigDecimal("206139589")));
        africa.addCountry(new Country("Ethiopia",new BigDecimal("114963588")));
        africa.addCountry(new Country("Egypt",new BigDecimal("102334404")));
        africa.addCountry(new Country("RPA",new BigDecimal("59308690")));

        Continent asia = new Continent("Asia");
        asia.addCountry(new Country("China",new BigDecimal("1410539758")));
        asia.addCountry(new Country("India",new BigDecimal("1389637446")));
        asia.addCountry(new Country("Indonesia",new BigDecimal("277329163")));
        asia.addCountry(new Country("Pakistan",new BigDecimal("242923845")));

        World world = new World();
        world.addContinent(europe);
        world.addContinent(africa);
        world.addContinent(asia);

        //When
        BigDecimal result = world.getPeopleQuantity();

        //Then
        Assertions.assertEquals(new BigDecimal("4080581773"),result);

    }

}
