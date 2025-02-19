package com.mechanitis.mongodb.gettingstarted;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

public class Exercise1ConnectingTest {
    @Test
    public void shouldCreateANewMongoClientConnectedToLocalhost() throws Exception {
        // When
        MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));

        //If you’re connecting to a local instance on the default port, you can simply use:
        //MongoClient mongoClient = new MongoClient();

        // Then
        assertThat(mongoClient, is(notNullValue()));
    }
}
