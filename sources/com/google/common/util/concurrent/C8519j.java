package com.google.common.util.concurrent;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* renamed from: com.google.common.util.concurrent.j */
/* compiled from: AtomicDouble */
public class C8519j extends Number implements Serializable {

    /* renamed from: b */
    private static final AtomicLongFieldUpdater<C8519j> f22467b = AtomicLongFieldUpdater.newUpdater(C8519j.class, "a");
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    private volatile transient long f22468a;

    public C8519j(double d) {
        this.f22468a = Double.doubleToRawLongBits(d);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        mo31765e(objectInputStream.readDouble());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeDouble(mo31757a());
    }

    /* renamed from: a */
    public final double mo31757a() {
        return Double.longBitsToDouble(this.f22468a);
    }

    /* renamed from: b */
    public final boolean mo31761b(double d, double d2) {
        return f22467b.weakCompareAndSet(this, Double.doubleToRawLongBits(d), Double.doubleToRawLongBits(d2));
    }

    /* renamed from: c */
    public final double mo31762c(double d) {
        return Double.longBitsToDouble(f22467b.getAndSet(this, Double.doubleToRawLongBits(d)));
    }

    /* renamed from: d */
    public final void mo31763d(double d) {
        mo31765e(d);
    }

    public double doubleValue() {
        return mo31757a();
    }

    /* renamed from: e */
    public final void mo31765e(double d) {
        this.f22468a = Double.doubleToRawLongBits(d);
    }

    public float floatValue() {
        return (float) mo31757a();
    }

    public int intValue() {
        return (int) mo31757a();
    }

    public long longValue() {
        return (long) mo31757a();
    }

    public String toString() {
        return Double.toString(mo31757a());
    }

    /* renamed from: a */
    public final boolean mo31759a(double d, double d2) {
        return f22467b.compareAndSet(this, Double.doubleToRawLongBits(d), Double.doubleToRawLongBits(d2));
    }

    /* renamed from: b */
    public final double mo31760b(double d) {
        long j;
        double longBitsToDouble;
        do {
            j = this.f22468a;
            longBitsToDouble = Double.longBitsToDouble(j);
        } while (!f22467b.compareAndSet(this, j, Double.doubleToRawLongBits(longBitsToDouble + d)));
        return longBitsToDouble;
    }

    public C8519j() {
    }

    /* renamed from: a */
    public final double mo31758a(double d) {
        long j;
        double longBitsToDouble;
        do {
            j = this.f22468a;
            longBitsToDouble = Double.longBitsToDouble(j) + d;
        } while (!f22467b.compareAndSet(this, j, Double.doubleToRawLongBits(longBitsToDouble)));
        return longBitsToDouble;
    }
}
