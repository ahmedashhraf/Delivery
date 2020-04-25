package org.apache.http.p547h0;

import java.util.NoSuchElementException;
import org.apache.http.C15133c;
import org.apache.http.C15250f;

/* renamed from: org.apache.http.h0.e */
/* compiled from: BasicHeaderIterator */
public class C15328e implements C15250f {

    /* renamed from: N */
    protected String f44374N;

    /* renamed from: a */
    protected final C15133c[] f44375a;

    /* renamed from: b */
    protected int f44376b;

    public C15328e(C15133c[] cVarArr, String str) {
        if (cVarArr != null) {
            this.f44375a = cVarArr;
            this.f44374N = str;
            this.f44376b = mo47438b(-1);
            return;
        }
        throw new IllegalArgumentException("Header array must not be null.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo47437a(int i) {
        String str = this.f44374N;
        return str == null || str.equalsIgnoreCase(this.f44375a[i].getName());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo47438b(int i) {
        if (i < -1) {
            return -1;
        }
        int length = this.f44375a.length - 1;
        boolean z = false;
        while (!z && i < length) {
            i++;
            z = mo47437a(i);
        }
        if (!z) {
            i = -1;
        }
        return i;
    }

    /* renamed from: e */
    public C15133c mo47173e() throws NoSuchElementException {
        int i = this.f44376b;
        if (i >= 0) {
            this.f44376b = mo47438b(i);
            return this.f44375a[i];
        }
        throw new NoSuchElementException("Iteration already finished.");
    }

    public boolean hasNext() {
        return this.f44376b >= 0;
    }

    public final Object next() throws NoSuchElementException {
        return mo47173e();
    }

    public void remove() throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Removing headers is not supported.");
    }
}
