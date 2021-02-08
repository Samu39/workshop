package com.kbank.workshop.circularbuffer;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MemoryCircularBufferTest {

    @DisplayName("Default Circular Buffer size should be 10")
    @Test
    public void check_default_size_10(){
        CircularBuffer buffer = new MemoryCircularBuffer();
        assertEquals(10,buffer.getSize());
    }

    @DisplayName("Init Circular Buffer with size 5, the size should return 5")
    @Test
    public void check_specific_buffer_size_5(){
        CircularBuffer buffer = new MemoryCircularBuffer(5);
        assertEquals(5,buffer.getSize());
    }

    @DisplayName("Write A and check result should be A")
    @Test
    public void write_A_should_read_A(){
        CircularBuffer buffer = new MemoryCircularBuffer();
        buffer.write("A");
        String result = buffer.read();
        assertEquals("A",result);
    }

    @DisplayName("Check empty after init Circular Buffer")
    @Test
    public void check_empty(){
        CircularBuffer buffer = new MemoryCircularBuffer();
        boolean result = buffer.isEmpty();
        assertEquals(true,result);
    }

    @DisplayName("Use default and after write A 10 times should be full")
    @Test
    public void after_write_A_10_times_should_be_full(){
        CircularBuffer buffer = new MemoryCircularBuffer();
        for(int i=0;i<10;i++) {
            buffer.write("A");
        }
        boolean result = buffer.isFull();
        assertEquals(true,result);
    }



}