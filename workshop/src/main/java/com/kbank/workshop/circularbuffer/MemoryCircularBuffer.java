package com.kbank.workshop.circularbuffer;

public class MemoryCircularBuffer implements CircularBuffer {
    private String[] array;

    public MemoryCircularBuffer(int size){
        array = new String[size];
    }

    public int getSize(){
        return array.length;
    }
}
