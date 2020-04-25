package org.jcodec.common;

import java.lang.reflect.Array;

public class IntObjectMap<T> {
    private static final int GROW_BY = 128;
    private int size;
    private Object[] storage = new Object[128];

    public void clear() {
        int i = 0;
        while (true) {
            Object[] objArr = this.storage;
            if (i < objArr.length) {
                objArr[i] = null;
                i++;
            } else {
                this.size = 0;
                return;
            }
        }
    }

    public T get(int i) {
        T[] tArr = this.storage;
        if (i >= tArr.length) {
            return null;
        }
        return tArr[i];
    }

    public int[] keys() {
        int[] iArr = new int[this.size];
        int i = 0;
        int i2 = 0;
        while (true) {
            Object[] objArr = this.storage;
            if (i >= objArr.length) {
                return iArr;
            }
            if (objArr[i] != null) {
                int i3 = i2 + 1;
                iArr[i2] = i;
                i2 = i3;
            }
            i++;
        }
    }

    public void put(int i, T t) {
        Object[] objArr = this.storage;
        if (objArr.length <= i) {
            Object[] objArr2 = new Object[(i + 128)];
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
            this.storage = objArr2;
        }
        if (this.storage[i] == null) {
            this.size++;
        }
        this.storage[i] = t;
    }

    public void remove(int i) {
        if (this.storage[i] != null) {
            this.size--;
        }
        this.storage[i] = null;
    }

    public int size() {
        return this.size;
    }

    public T[] values(T[] tArr) {
        T[] tArr2 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.size);
        int i = 0;
        int i2 = 0;
        while (true) {
            T[] tArr3 = this.storage;
            if (i >= tArr3.length) {
                return tArr2;
            }
            if (tArr3[i] != null) {
                int i3 = i2 + 1;
                tArr2[i2] = tArr3[i];
                i2 = i3;
            }
            i++;
        }
    }
}
