package org.jcodec.common;

import java.util.Arrays;

public class LongArrayList {
    private static final int DEFAULT_GROW_AMOUNT = 128;
    private int growAmount;
    private int size;
    private long[] storage;

    public LongArrayList() {
        this(128);
    }

    public void add(long j) {
        int i = this.size;
        long[] jArr = this.storage;
        if (i >= jArr.length) {
            long[] jArr2 = new long[(jArr.length + this.growAmount)];
            System.arraycopy(jArr, 0, jArr2, 0, jArr.length);
            this.storage = jArr2;
        }
        long[] jArr3 = this.storage;
        int i2 = this.size;
        this.size = i2 + 1;
        jArr3[i2] = j;
    }

    public void addAll(long[] jArr) {
        int i = this.size;
        int length = jArr.length + i;
        long[] jArr2 = this.storage;
        if (length >= jArr2.length) {
            long[] jArr3 = new long[(this.growAmount + i + jArr.length)];
            System.arraycopy(jArr2, 0, jArr3, 0, i);
            this.storage = jArr3;
        }
        System.arraycopy(jArr, 0, this.storage, this.size, jArr.length);
        this.size += jArr.length;
    }

    public void clear() {
        this.size = 0;
    }

    public boolean contains(long j) {
        for (int i = 0; i < this.size; i++) {
            if (this.storage[i] == j) {
                return true;
            }
        }
        return false;
    }

    public void fill(int i, int i2, int i3) {
        long[] jArr = this.storage;
        if (i2 > jArr.length) {
            long[] jArr2 = new long[(this.growAmount + i2)];
            System.arraycopy(jArr, 0, jArr2, 0, jArr.length);
            this.storage = jArr2;
        }
        Arrays.fill(this.storage, i, i2, (long) i3);
        this.size = Math.max(this.size, i2);
    }

    public long get(int i) {
        return this.storage[i];
    }

    public void pop() {
        int i = this.size;
        if (i != 0) {
            this.size = i - 1;
        }
    }

    public void push(long j) {
        add(j);
    }

    public void set(int i, int i2) {
        this.storage[i] = (long) i2;
    }

    public int size() {
        return this.size;
    }

    public long[] toArray() {
        int i = this.size;
        long[] jArr = new long[i];
        System.arraycopy(this.storage, 0, jArr, 0, i);
        return jArr;
    }

    public LongArrayList(int i) {
        this.growAmount = i;
        this.storage = new long[i];
    }
}
