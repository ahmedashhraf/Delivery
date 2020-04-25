package org.apache.http.p547h0;

import java.util.List;
import java.util.NoSuchElementException;
import org.apache.http.C15133c;
import org.apache.http.C15250f;

/* renamed from: org.apache.http.h0.m */
/* compiled from: BasicListHeaderIterator */
public class C15336m implements C15250f {

    /* renamed from: N */
    protected int f44395N;

    /* renamed from: O */
    protected String f44396O;

    /* renamed from: a */
    protected final List f44397a;

    /* renamed from: b */
    protected int f44398b;

    public C15336m(List list, String str) {
        if (list != null) {
            this.f44397a = list;
            this.f44396O = str;
            this.f44398b = mo47489b(-1);
            this.f44395N = -1;
            return;
        }
        throw new IllegalArgumentException("Header list must not be null.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo47488a(int i) {
        if (this.f44396O == null) {
            return true;
        }
        return this.f44396O.equalsIgnoreCase(((C15133c) this.f44397a.get(i)).getName());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo47489b(int i) {
        if (i < -1) {
            return -1;
        }
        int size = this.f44397a.size() - 1;
        boolean z = false;
        while (!z && i < size) {
            i++;
            z = mo47488a(i);
        }
        if (!z) {
            i = -1;
        }
        return i;
    }

    /* renamed from: e */
    public C15133c mo47173e() throws NoSuchElementException {
        int i = this.f44398b;
        if (i >= 0) {
            this.f44395N = i;
            this.f44398b = mo47489b(i);
            return (C15133c) this.f44397a.get(i);
        }
        throw new NoSuchElementException("Iteration already finished.");
    }

    public boolean hasNext() {
        return this.f44398b >= 0;
    }

    public final Object next() throws NoSuchElementException {
        return mo47173e();
    }

    public void remove() throws UnsupportedOperationException {
        int i = this.f44395N;
        if (i >= 0) {
            this.f44397a.remove(i);
            this.f44395N = -1;
            this.f44398b--;
            return;
        }
        throw new IllegalStateException("No header to remove.");
    }
}
