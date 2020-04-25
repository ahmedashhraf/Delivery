package org.jcodec.common;

import java.util.Arrays;

public class IntIntMap {
    private static final int GROW_BY = 128;
    private int size;
    private int[] storage = createArray(128);

    public IntIntMap() {
        Arrays.fill(this.storage, Integer.MIN_VALUE);
    }

    private int[] createArray(int i) {
        return new int[i];
    }

    public void clear() {
        int i = 0;
        while (true) {
            int[] iArr = this.storage;
            if (i < iArr.length) {
                iArr[i] = Integer.MIN_VALUE;
                i++;
            } else {
                this.size = 0;
                return;
            }
        }
    }

    public int get(int i) {
        int[] iArr = this.storage;
        return (i >= iArr.length ? null : Integer.valueOf(iArr[i])).intValue();
    }

    public int[] keys() {
        int[] iArr = new int[this.size];
        int i = 0;
        int i2 = 0;
        while (true) {
            int[] iArr2 = this.storage;
            if (i >= iArr2.length) {
                return iArr;
            }
            if (iArr2[i] != Integer.MIN_VALUE) {
                int i3 = i2 + 1;
                iArr[i2] = i;
                i2 = i3;
            }
            i++;
        }
    }

    public void put(int i, int i2) {
        if (i2 != Integer.MIN_VALUE) {
            if (this.storage.length <= i) {
                int[] createArray = createArray(i + 128);
                int[] iArr = this.storage;
                System.arraycopy(iArr, 0, createArray, 0, iArr.length);
                Arrays.fill(createArray, this.storage.length, createArray.length, Integer.MIN_VALUE);
                this.storage = createArray;
            }
            if (this.storage[i] == Integer.MIN_VALUE) {
                this.size++;
            }
            this.storage[i] = i2;
            return;
        }
        throw new IllegalArgumentException("This implementation can not store -2147483648");
    }

    public void remove(int i) {
        if (this.storage[i] != Integer.MIN_VALUE) {
            this.size--;
        }
        this.storage[i] = Integer.MIN_VALUE;
    }

    public int size() {
        return this.size;
    }

    public int[] values() {
        int[] createArray = createArray(this.size);
        int i = 0;
        int i2 = 0;
        while (true) {
            int[] iArr = this.storage;
            if (i >= iArr.length) {
                return createArray;
            }
            if (iArr[i] != Integer.MIN_VALUE) {
                int i3 = i2 + 1;
                createArray[i2] = iArr[i];
                i2 = i3;
            }
            i++;
        }
    }
}
