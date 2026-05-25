/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.quickchatpp;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Asmin
 */
public class MessageTest {

   
    /**
     * Test of checkMessageID method, of class Message.
     */
   
    @Test
    void testCreateMessageHash() {
        String hash = QuickChat.createMessageHash("AB123", 1, "Hello World");
        assertEquals("AB:1:HELLOWORLD", hash);
    }

    @Test
    void testSentMessage_Send() {
        assertEquals("Message successfully sent.", QuickChat.SentMessage(1));
    }

    @Test
    void testSentMessage_Disregard() {
        assertEquals("Press 0 to delete the message.", QuickChat.SentMessage(2));
    }

    @Test
    void testSentMessage_Store() {
        assertEquals("Message successfully stored.", QuickChat.SentMessage(3));
    }

    @Test
    void testSentMessage_Invalid() {
        assertEquals("Invalid choice.", QuickChat.SentMessage(99));
    }

    @Test
    void testReturnTotalMessages() {
        assertEquals(5, QuickChat.returnTotalMessages(5));
    }
}
