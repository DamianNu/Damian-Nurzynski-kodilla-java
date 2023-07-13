package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User johnny = new Millenials("Johnny Depp");
        User bradley = new YGeneration("Bradley Cooper");
        User joaquin = new ZGeneration("Joaquin Phoenix");

        //When
        String johnnyMedia = johnny.sharePost();
        System.out.println(johnny.getName() + " " + johnnyMedia);
        String bradleyMedia = bradley.sharePost();
        System.out.println(bradley.getName() + " " + bradleyMedia);
        String joaquinMedia = joaquin.sharePost();
        System.out.println(joaquin.getName() + " " + joaquinMedia);

        //Then
        assertEquals("Share Post in: Facebook", johnnyMedia);
        assertEquals("Share Post in: Twitter", bradleyMedia);
        assertEquals("Share Post in: Snapchat", joaquinMedia);
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User bradley = new YGeneration("Bradley Cooper");

        //When
        String bradleyMedia = bradley.sharePost();
        System.out.println(bradley.getName() + " " + bradleyMedia);
        bradley.setSocialPublisher(new FacebookPublisher());
        bradleyMedia = bradley.sharePost();
        System.out.println("Now " + bradley.getName() + " " + bradleyMedia);

        //Then
        assertEquals("Share Post in: Facebook", bradleyMedia);
    }
}
