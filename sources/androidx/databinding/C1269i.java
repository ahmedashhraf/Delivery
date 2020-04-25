package androidx.databinding;

import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.databinding.i */
/* compiled from: CallbackRegistry */
public class C1269i<C, T, A> implements Cloneable {

    /* renamed from: Q */
    private static final String f5135Q = "CallbackRegistry";

    /* renamed from: N */
    private long[] f5136N;

    /* renamed from: O */
    private int f5137O;

    /* renamed from: P */
    private final C1270a<C, T, A> f5138P;

    /* renamed from: a */
    private List<C> f5139a = new ArrayList();

    /* renamed from: b */
    private long f5140b = 0;

    /* renamed from: androidx.databinding.i$a */
    /* compiled from: CallbackRegistry */
    public static abstract class C1270a<C, T, A> {
        /* renamed from: a */
        public abstract void mo5546a(C c, T t, int i, A a);
    }

    public C1269i(C1270a<C, T, A> aVar) {
        this.f5138P = aVar;
    }

    /* renamed from: b */
    private void m6844b(T t, int i, A a) {
        m6841a(t, i, a, 0, Math.min(64, this.f5139a.size()), this.f5140b);
    }

    /* renamed from: c */
    private void m6845c(T t, int i, A a) {
        int size = this.f5139a.size();
        long[] jArr = this.f5136N;
        int length = jArr == null ? -1 : jArr.length - 1;
        m6840a(t, i, a, length);
        m6841a(t, i, a, (length + 2) * 64, size, 0);
    }

    /* renamed from: a */
    public synchronized void mo5666a(T t, int i, A a) {
        this.f5137O++;
        m6845c(t, i, a);
        this.f5137O--;
        if (this.f5137O == 0) {
            if (this.f5136N != null) {
                for (int length = this.f5136N.length - 1; length >= 0; length--) {
                    long j = this.f5136N[length];
                    if (j != 0) {
                        m6839a((length + 1) * 64, j);
                        this.f5136N[length] = 0;
                    }
                }
            }
            if (this.f5140b != 0) {
                m6839a(0, this.f5140b);
                this.f5140b = 0;
            }
        }
    }

    /* renamed from: d */
    public synchronized boolean mo5672d() {
        if (this.f5139a.isEmpty()) {
            return true;
        }
        if (this.f5137O == 0) {
            return false;
        }
        int size = this.f5139a.size();
        for (int i = 0; i < size; i++) {
            if (!m6842a(i)) {
                return false;
            }
        }
        return true;
    }

    public synchronized C1269i<C, T, A> clone() {
        C1269i<C, T, A> iVar;
        CloneNotSupportedException e;
        try {
            iVar = (C1269i) super.clone();
            try {
                iVar.f5140b = 0;
                iVar.f5136N = null;
                iVar.f5137O = 0;
                iVar.f5139a = new ArrayList();
                int size = this.f5139a.size();
                for (int i = 0; i < size; i++) {
                    if (!m6842a(i)) {
                        iVar.f5139a.add(this.f5139a.get(i));
                    }
                }
            } catch (CloneNotSupportedException e2) {
                e = e2;
                e.printStackTrace();
                return iVar;
            }
        } catch (CloneNotSupportedException e3) {
            CloneNotSupportedException cloneNotSupportedException = e3;
            iVar = null;
            e = cloneNotSupportedException;
            e.printStackTrace();
            return iVar;
        }
        return iVar;
    }

    /* renamed from: b */
    public synchronized void mo5669b(C c) {
        if (this.f5137O == 0) {
            this.f5139a.remove(c);
        } else {
            int lastIndexOf = this.f5139a.lastIndexOf(c);
            if (lastIndexOf >= 0) {
                m6843b(lastIndexOf);
            }
        }
    }

    /* renamed from: c */
    public synchronized ArrayList<C> mo5670c() {
        ArrayList<C> arrayList;
        arrayList = new ArrayList<>(this.f5139a.size());
        int size = this.f5139a.size();
        for (int i = 0; i < size; i++) {
            if (!m6842a(i)) {
                arrayList.add(this.f5139a.get(i));
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    private void m6843b(int i) {
        if (i < 64) {
            this.f5140b = (1 << i) | this.f5140b;
            return;
        }
        int i2 = (i / 64) - 1;
        long[] jArr = this.f5136N;
        if (jArr == null) {
            this.f5136N = new long[(this.f5139a.size() / 64)];
        } else if (jArr.length <= i2) {
            long[] jArr2 = new long[(this.f5139a.size() / 64)];
            long[] jArr3 = this.f5136N;
            System.arraycopy(jArr3, 0, jArr2, 0, jArr3.length);
            this.f5136N = jArr2;
        }
        long j = 1 << (i % 64);
        long[] jArr4 = this.f5136N;
        jArr4[i2] = j | jArr4[i2];
    }

    /* renamed from: a */
    private void m6840a(T t, int i, A a, int i2) {
        if (i2 < 0) {
            m6844b(t, i, a);
            return;
        }
        long j = this.f5136N[i2];
        int i3 = (i2 + 1) * 64;
        int min = Math.min(this.f5139a.size(), i3 + 64);
        m6840a(t, i, a, i2 - 1);
        m6841a(t, i, a, i3, min, j);
    }

    /* renamed from: b */
    public synchronized void mo5668b() {
        if (this.f5137O == 0) {
            this.f5139a.clear();
        } else if (!this.f5139a.isEmpty()) {
            for (int size = this.f5139a.size() - 1; size >= 0; size--) {
                m6843b(size);
            }
        }
    }

    /* renamed from: a */
    private void m6841a(T t, int i, A a, int i2, int i3, long j) {
        long j2 = 1;
        while (i2 < i3) {
            if ((j & j2) == 0) {
                this.f5138P.mo5546a(this.f5139a.get(i2), t, i, a);
            }
            j2 <<= 1;
            i2++;
        }
    }

    /* renamed from: a */
    public synchronized void mo5665a(C c) {
        if (c != null) {
            int lastIndexOf = this.f5139a.lastIndexOf(c);
            if (lastIndexOf < 0 || m6842a(lastIndexOf)) {
                this.f5139a.add(c);
            }
        } else {
            throw new IllegalArgumentException("callback cannot be null");
        }
    }

    /* renamed from: a */
    private boolean m6842a(int i) {
        boolean z = true;
        if (i < 64) {
            if (((1 << i) & this.f5140b) == 0) {
                z = false;
            }
            return z;
        }
        long[] jArr = this.f5136N;
        if (jArr == null) {
            return false;
        }
        int i2 = (i / 64) - 1;
        if (i2 >= jArr.length) {
            return false;
        }
        if (((1 << (i % 64)) & jArr[i2]) == 0) {
            z = false;
        }
        return z;
    }

    /* renamed from: a */
    private void m6839a(int i, long j) {
        long j2 = Long.MIN_VALUE;
        for (int i2 = (i + 64) - 1; i2 >= i; i2--) {
            if ((j & j2) != 0) {
                this.f5139a.remove(i2);
            }
            j2 >>>= 1;
        }
    }

    /* renamed from: a */
    public synchronized void mo5667a(List<C> list) {
        list.clear();
        int size = this.f5139a.size();
        for (int i = 0; i < size; i++) {
            if (!m6842a(i)) {
                list.add(this.f5139a.get(i));
            }
        }
    }
}
