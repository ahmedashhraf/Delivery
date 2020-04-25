package com.google.common.util.concurrent;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLongArray;

/* renamed from: com.google.common.util.concurrent.k */
/* compiled from: AtomicDoubleArray */
public class C8532k implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    private transient AtomicLongArray f22487a;

    public C8532k(int i) {
        this.f22487a = new AtomicLongArray(i);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        this.f22487a = new AtomicLongArray(readInt);
        for (int i = 0; i < readInt; i++) {
            mo31805e(i, objectInputStream.readDouble());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        int a = mo31799a();
        objectOutputStream.writeInt(a);
        for (int i = 0; i < a; i++) {
            objectOutputStream.writeDouble(mo31797a(i));
        }
    }

    /* renamed from: a */
    public final int mo31799a() {
        return this.f22487a.length();
    }

    /* renamed from: b */
    public final boolean mo31802b(int i, double d, double d2) {
        return this.f22487a.weakCompareAndSet(i, Double.doubleToRawLongBits(d), Double.doubleToRawLongBits(d2));
    }

    /* renamed from: c */
    public final double mo31803c(int i, double d) {
        return Double.longBitsToDouble(this.f22487a.getAndSet(i, Double.doubleToRawLongBits(d)));
    }

    /* renamed from: d */
    public final void mo31804d(int i, double d) {
        mo31805e(i, d);
    }

    /* renamed from: e */
    public final void mo31805e(int i, double d) {
        this.f22487a.set(i, Double.doubleToRawLongBits(d));
    }

    public String toString() {
        int a = mo31799a() - 1;
        if (a == -1) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder((a + 1) * 19);
        sb.append('[');
        int i = 0;
        while (true) {
            sb.append(Double.longBitsToDouble(this.f22487a.get(i)));
            if (i == a) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(',');
            sb.append(' ');
            i++;
        }
    }

    /* renamed from: a */
    public final double mo31797a(int i) {
        return Double.longBitsToDouble(this.f22487a.get(i));
    }

    /* renamed from: b */
    public final double mo31801b(int i, double d) {
        long j;
        double longBitsToDouble;
        do {
            j = this.f22487a.get(i);
            longBitsToDouble = Double.longBitsToDouble(j);
        } while (!this.f22487a.compareAndSet(i, j, Double.doubleToRawLongBits(longBitsToDouble + d)));
        return longBitsToDouble;
    }

    public C8532k(double[] dArr) {
        int length = dArr.length;
        long[] jArr = new long[length];
        for (int i = 0; i < length; i++) {
            jArr[i] = Double.doubleToRawLongBits(dArr[i]);
        }
        this.f22487a = new AtomicLongArray(jArr);
    }

    /* renamed from: a */
    public final boolean mo31800a(int i, double d, double d2) {
        return this.f22487a.compareAndSet(i, Double.doubleToRawLongBits(d), Double.doubleToRawLongBits(d2));
    }

    /* renamed from: a */
    public double mo31798a(int i, double d) {
        long j;
        double longBitsToDouble;
        do {
            j = this.f22487a.get(i);
            longBitsToDouble = Double.longBitsToDouble(j) + d;
        } while (!this.f22487a.compareAndSet(i, j, Double.doubleToRawLongBits(longBitsToDouble)));
        return longBitsToDouble;
    }
}
