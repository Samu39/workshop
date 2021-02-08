package com.kbank.workshop.circularbuffer;

public class MemoryCircularBuffer implements CircularBuffer {
    private String[] array;
    private static int DEFAULT_SIZE = 10;
    private int writePointer;
    private int readPointer;

    public MemoryCircularBuffer(){
        this(DEFAULT_SIZE);
    }

    public MemoryCircularBuffer(int size){
        array = new String[size];
        writePointer = 0;
        readPointer = 0;
    }

    public int getSize(){
        return array.length;
    }

    @Override
    public void write(String a) {
        array[writePointer++] = a;
    }

    @Override
    public String read() {
        return array[readPointer];
    }

    @Override
    public boolean isEmpty() {
        return writePointer - readPointer == 0;
    }

    @Override
    public boolean isFull() {
        return writePointer == array.length;
    }




}
