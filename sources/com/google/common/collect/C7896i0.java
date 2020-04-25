package com.google.common.collect;

import java.io.Serializable;
import p076c.p112d.p148d.p149a.C2776b;
import p201f.p202a.C5952h;

@C2776b
/* renamed from: com.google.common.collect.i0 */
/* compiled from: Count */
final class C7896i0 implements Serializable {

    /* renamed from: a */
    private int f21628a;

    C7896i0(int i) {
        this.f21628a = i;
    }

    /* renamed from: a */
    public int mo30587a() {
        return this.f21628a;
    }

    /* renamed from: b */
    public int mo30589b(int i) {
        int i2 = this.f21628a;
        this.f21628a = i + i2;
        return i2;
    }

    /* renamed from: c */
    public int mo30590c(int i) {
        int i2 = this.f21628a;
        this.f21628a = i;
        return i2;
    }

    /* renamed from: d */
    public void mo30591d(int i) {
        this.f21628a = i;
    }

    public boolean equals(@C5952h Object obj) {
        return (obj instanceof C7896i0) && ((C7896i0) obj).f21628a == this.f21628a;
    }

    public int hashCode() {
        return this.f21628a;
    }

    public String toString() {
        return Integer.toString(this.f21628a);
    }

    /* renamed from: a */
    public int mo30588a(int i) {
        int i2 = this.f21628a + i;
        this.f21628a = i2;
        return i2;
    }
}
