package com.kbank.workshop.circularbuffer;

public interface CircularBuffer {

    public int getSize();

    public void write(String a);

    public String read();

    public boolean isEmpty();

    public boolean isFull();
}
