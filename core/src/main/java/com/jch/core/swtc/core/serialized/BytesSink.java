package com.jch.core.swtc.core.serialized;

public interface BytesSink {
    void add(byte aByte);
    void add(byte[] bytes);
}