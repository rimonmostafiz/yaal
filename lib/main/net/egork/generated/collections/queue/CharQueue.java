package net.egork.generated.collections.queue;

import net.egork.generated.collections.*;

public interface CharQueue extends CharCollection {
    default public char first() {
        return peek();
    }

    public char peek();
    public char poll();
}
