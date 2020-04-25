package org.apache.http.p547h0;

import kotlin.p217i1.C14662d0;
import org.apache.http.p550k0.C15454b;

/* renamed from: org.apache.http.h0.x */
/* compiled from: ParserCursor */
public class C15347x {

    /* renamed from: a */
    private final int f44416a;

    /* renamed from: b */
    private final int f44417b;

    /* renamed from: c */
    private int f44418c;

    public C15347x(int i, int i2) {
        if (i < 0) {
            throw new IndexOutOfBoundsException("Lower bound cannot be negative");
        } else if (i <= i2) {
            this.f44416a = i;
            this.f44417b = i2;
            this.f44418c = i;
        } else {
            throw new IndexOutOfBoundsException("Lower bound cannot be greater then upper bound");
        }
    }

    /* renamed from: a */
    public void mo47530a(int i) {
        if (i < this.f44416a) {
            throw new IndexOutOfBoundsException();
        } else if (i <= this.f44417b) {
            this.f44418c = i;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    /* renamed from: b */
    public int mo47532b() {
        return this.f44416a;
    }

    /* renamed from: c */
    public int mo47533c() {
        return this.f44418c;
    }

    /* renamed from: d */
    public int mo47534d() {
        return this.f44417b;
    }

    public String toString() {
        C15454b bVar = new C15454b(16);
        bVar.mo47755a('[');
        bVar.mo47757a(Integer.toString(this.f44416a));
        bVar.mo47755a((char) C14662d0.f42854e);
        bVar.mo47757a(Integer.toString(this.f44418c));
        bVar.mo47755a((char) C14662d0.f42854e);
        bVar.mo47757a(Integer.toString(this.f44417b));
        bVar.mo47755a(']');
        return bVar.toString();
    }

    /* renamed from: a */
    public boolean mo47531a() {
        return this.f44418c >= this.f44417b;
    }
}
