package org.jcodec.common;

import java.util.Arrays;

public class ByteArrayList {
    private static final int DEFAULT_GROW_AMOUNT = 2048;
    private int growAmount;
    private int size;
    private byte[] storage;

    public ByteArrayList() {
        this(2048);
    }

    public void add(byte b) {
        int i = this.size;
        byte[] bArr = this.storage;
        if (i >= bArr.length) {
            byte[] bArr2 = new byte[(bArr.length + this.growAmount)];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.storage = bArr2;
        }
        byte[] bArr3 = this.storage;
        int i2 = this.size;
        this.size = i2 + 1;
        bArr3[i2] = b;
    }

    public void addAll(byte[] bArr) {
        int i = this.size;
        int length = bArr.length + i;
        byte[] bArr2 = this.storage;
        if (length >= bArr2.length) {
            byte[] bArr3 = new byte[(this.growAmount + i + bArr.length)];
            System.arraycopy(bArr2, 0, bArr3, 0, i);
            this.storage = bArr3;
        }
        System.arraycopy(bArr, 0, this.storage, this.size, bArr.length);
        this.size += bArr.length;
    }

    public boolean contains(byte b) {
        for (int i = 0; i < this.size; i++) {
            if (this.storage[i] == b) {
                return true;
            }
        }
        return false;
    }

    public void fill(int i, int i2, byte b) {
        byte[] bArr = this.storage;
        if (i2 > bArr.length) {
            byte[] bArr2 = new byte[(this.growAmount + i2)];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.storage = bArr2;
        }
        Arrays.fill(this.storage, i, i2, b);
        this.size = Math.max(this.size, i2);
    }

    public byte get(int i) {
        return this.storage[i];
    }

    public void pop() {
        int i = this.size;
        if (i != 0) {
            this.size = i - 1;
        }
    }

    public void push(byte b) {
        add(b);
    }

    public void set(int i, byte b) {
        this.storage[i] = b;
    }

    public int size() {
        return this.size;
    }

    public byte[] toArray() {
        int i = this.size;
        byte[] bArr = new byte[i];
        System.arraycopy(this.storage, 0, bArr, 0, i);
        return bArr;
    }

    public ByteArrayList(int i) {
        this.growAmount = i;
        this.storage = new byte[i];
    }
}
