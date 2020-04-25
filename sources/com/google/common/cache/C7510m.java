package com.google.common.cache;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import p076c.p112d.p148d.p149a.C2776b;

@C2776b(emulated = true)
/* renamed from: com.google.common.cache.m */
/* compiled from: LongAdder */
final class C7510m extends C7522r implements Serializable, C7505k {
    private static final long serialVersionUID = 7249069246863182397L;

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.f21057N = 0;
        this.f21058a = null;
        this.f21059b = objectInputStream.readLong();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeLong(mo29575d());
    }

    /* renamed from: a */
    public void mo29574a(long j) {
        C7524b[] bVarArr = this.f21058a;
        if (bVarArr == null) {
            long j2 = this.f21059b;
            if (mo29596a(j2, j2 + j)) {
                return;
            }
        }
        C7525c cVar = (C7525c) C7522r.f21052O.get();
        int i = cVar.f21078a;
        boolean z = true;
        if (bVarArr != null) {
            int length = bVarArr.length;
            if (length >= 1) {
                C7524b bVar = bVarArr[i & (length - 1)];
                if (bVar != null) {
                    long j3 = bVar.f21069h;
                    z = bVar.mo29600a(j3, j3 + j);
                    if (z) {
                        return;
                    }
                }
            }
        }
        mo29595a(j, cVar, z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final long mo29576b(long j, long j2) {
        return j + j2;
    }

    /* renamed from: d */
    public long mo29575d() {
        long j = this.f21059b;
        C7524b[] bVarArr = this.f21058a;
        if (bVarArr != null) {
            for (C7524b bVar : bVarArr) {
                if (bVar != null) {
                    j += bVar.f21069h;
                }
            }
        }
        return j;
    }

    public double doubleValue() {
        return (double) mo29575d();
    }

    public float floatValue() {
        return (float) mo29575d();
    }

    /* renamed from: g */
    public void mo29579g() {
        mo29574a(-1);
    }

    /* renamed from: h */
    public void mo29580h() {
        mo29597b(0);
    }

    /* renamed from: i */
    public long mo29581i() {
        long j = this.f21059b;
        C7524b[] bVarArr = this.f21058a;
        this.f21059b = 0;
        if (bVarArr != null) {
            for (C7524b bVar : bVarArr) {
                if (bVar != null) {
                    j += bVar.f21069h;
                    bVar.f21069h = 0;
                }
            }
        }
        return j;
    }

    public int intValue() {
        return (int) mo29575d();
    }

    public long longValue() {
        return mo29575d();
    }

    public String toString() {
        return Long.toString(mo29575d());
    }

    /* renamed from: a */
    public void mo29573a() {
        mo29574a(1);
    }
}
