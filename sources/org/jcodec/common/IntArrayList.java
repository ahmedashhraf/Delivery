package org.jcodec.common;

import java.util.Arrays;

public class IntArrayList {
    private static final int DEFAULT_GROW_AMOUNT = 128;
    private int growAmount;
    private int size;
    private int[] storage;

    public IntArrayList() {
        this(128);
    }

    public void add(int i) {
        int i2 = this.size;
        int[] iArr = this.storage;
        if (i2 >= iArr.length) {
            int[] iArr2 = new int[(iArr.length + this.growAmount)];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.storage = iArr2;
        }
        int[] iArr3 = this.storage;
        int i3 = this.size;
        this.size = i3 + 1;
        iArr3[i3] = i;
    }

    public void addAll(int[] iArr) {
        int i = this.size;
        int length = iArr.length + i;
        int[] iArr2 = this.storage;
        if (length >= iArr2.length) {
            int[] iArr3 = new int[(this.growAmount + i + iArr.length)];
            System.arraycopy(iArr2, 0, iArr3, 0, i);
            this.storage = iArr3;
        }
        System.arraycopy(iArr, 0, this.storage, this.size, iArr.length);
        this.size += iArr.length;
    }

    public void clear() {
        this.size = 0;
    }

    public boolean contains(int i) {
        for (int i2 = 0; i2 < this.size; i2++) {
            if (this.storage[i2] == i) {
                return true;
            }
        }
        return false;
    }

    public void fill(int i, int i2, int i3) {
        int[] iArr = this.storage;
        if (i2 > iArr.length) {
            int[] iArr2 = new int[(this.growAmount + i2)];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.storage = iArr2;
        }
        Arrays.fill(this.storage, i, i2, i3);
        this.size = Math.max(this.size, i2);
    }

    public int get(int i) {
        return this.storage[i];
    }

    public void pop() {
        int i = this.size;
        if (i != 0) {
            this.size = i - 1;
        }
    }

    public void push(int i) {
        add(i);
    }

    public void set(int i, int i2) {
        this.storage[i] = i2;
    }

    public int size() {
        return this.size;
    }

    public int[] toArray() {
        int i = this.size;
        int[] iArr = new int[i];
        System.arraycopy(this.storage, 0, iArr, 0, i);
        return iArr;
    }

    public IntArrayList(int i) {
        this.growAmount = i;
        this.storage = new int[i];
    }
}
