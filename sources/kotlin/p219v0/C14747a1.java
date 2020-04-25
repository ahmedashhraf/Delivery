package kotlin.p219v0;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import kotlin.C6121u;
import kotlin.TypeCastException;
import kotlin.p214b1.p216u.C14445h0;
import p205i.p209c.p210a.C6003d;

@C6121u(mo24988bv = {1, 0, 2}, mo24989d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010(\n\u0002\b\f\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00060\u0003j\u0002`\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0013\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00028\u0000¢\u0006\u0002\u0010\u0016J\u0016\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00020\u0006H\u0002¢\u0006\u0002\u0010\u0019J\u0006\u0010\u001a\u001a\u00020\u001bJ\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dH\u0002J\u000e\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u0006J\u0015\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tH\u0014¢\u0006\u0002\u0010!J'\u0010 \u001a\b\u0012\u0004\u0012\u0002H\u00010\t\"\u0004\b\u0001\u0010\u00012\f\u0010\"\u001a\b\u0012\u0004\u0012\u0002H\u00010\tH\u0015¢\u0006\u0002\u0010#J9\u0010$\u001a\u00020\u0014\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\t2\u0006\u0010\u0015\u001a\u0002H\u00012\b\b\u0002\u0010%\u001a\u00020\u00062\b\b\u0002\u0010&\u001a\u00020\u0006H\u0002¢\u0006\u0002\u0010'J\u0015\u0010(\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0006H\bR\u0018\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tX\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR$\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006@RX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u0007R\u000e\u0010\u0012\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, mo24990d2 = {"Lkotlin/collections/RingBuffer;", "T", "Lkotlin/collections/AbstractList;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "capacity", "", "(I)V", "buffer", "", "", "[Ljava/lang/Object;", "getCapacity", "()I", "<set-?>", "size", "getSize", "setSize", "startIndex", "add", "", "element", "(Ljava/lang/Object;)V", "get", "index", "(I)Ljava/lang/Object;", "isFull", "", "iterator", "", "removeFirst", "n", "toArray", "()[Ljava/lang/Object;", "array", "([Ljava/lang/Object;)[Ljava/lang/Object;", "fill", "fromIndex", "toIndex", "([Ljava/lang/Object;Ljava/lang/Object;II)V", "forward", "kotlin-stdlib"}, mo24991k = 1, mo24992mv = {1, 1, 10})
/* renamed from: kotlin.v0.a1 */
/* compiled from: SlidingWindow.kt */
final class C14747a1<T> extends C14755d<T> implements RandomAccess {
    /* access modifiers changed from: private */

    /* renamed from: N */
    public int f42989N;

    /* renamed from: O */
    private int f42990O;

    /* renamed from: P */
    private final int f42991P;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object[] f42992b;

    /* renamed from: kotlin.v0.a1$a */
    /* compiled from: SlidingWindow.kt */
    public static final class C14748a extends C14752c<T> {

        /* renamed from: N */
        private int f42993N;

        /* renamed from: O */
        private int f42994O;

        /* renamed from: P */
        final /* synthetic */ C14747a1 f42995P;

        C14748a(C14747a1 a1Var) {
            this.f42995P = a1Var;
            this.f42993N = a1Var.size();
            this.f42994O = a1Var.f42989N;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo45765b() {
            if (this.f42993N == 0) {
                mo46026c();
                return;
            }
            mo46025b(this.f42995P.f42992b[this.f42994O]);
            this.f42994O = (this.f42994O + 1) % this.f42995P.mo46012c();
            this.f42993N--;
        }
    }

    public C14747a1(int i) {
        this.f42991P = i;
        if (this.f42991P >= 0) {
            this.f42992b = new Object[this.f42991P];
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("ring buffer capacity should not be negative but it is ");
        sb.append(this.f42991P);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public final void add(T t) {
        if (!mo46013e()) {
            this.f42992b[(this.f42989N + size()) % mo46012c()] = t;
            m63935c(size() + 1);
            return;
        }
        throw new IllegalStateException("ring buffer is full");
    }

    /* renamed from: e */
    public final boolean mo46013e() {
        return size() == this.f42991P;
    }

    public T get(int i) {
        C14755d.f43001a.mo46073a(i, size());
        return this.f42992b[(this.f42989N + i) % mo46012c()];
    }

    @C6003d
    public Iterator<T> iterator() {
        return new C14748a(this);
    }

    @C6003d
    public <T> T[] toArray(@C6003d T[] tArr) {
        C14445h0.m62478f(tArr, "array");
        if (tArr.length < size()) {
            tArr = Arrays.copyOf(tArr, size());
            C14445h0.m62453a((Object) tArr, "java.util.Arrays.copyOf(this, newSize)");
        }
        int size = size();
        int i = 0;
        int i2 = this.f42989N;
        int i3 = 0;
        while (i3 < size && i2 < this.f42991P) {
            tArr[i3] = this.f42992b[i2];
            i3++;
            i2++;
        }
        while (i3 < size) {
            tArr[i3] = this.f42992b[i];
            i3++;
            i++;
        }
        if (tArr.length > size()) {
            tArr[size()] = null;
        }
        if (tArr != null) {
            return tArr;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* renamed from: c */
    public final int mo46012c() {
        return this.f42991P;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m63935c(int i) {
        this.f42990O = i;
    }

    /* renamed from: b */
    public int mo45907b() {
        return this.f42990O;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final int m63926a(int i, int i2) {
        return (i + i2) % mo46012c();
    }

    /* renamed from: b */
    public final void mo46011b(int i) {
        boolean z = true;
        if (i >= 0) {
            if (i > size()) {
                z = false;
            }
            if (!z) {
                StringBuilder sb = new StringBuilder();
                sb.append("n shouldn't be greater than the buffer size: n = ");
                sb.append(i);
                sb.append(", size = ");
                sb.append(size());
                throw new IllegalArgumentException(sb.toString().toString());
            } else if (i > 0) {
                int i2 = this.f42989N;
                int c = (i2 + i) % mo46012c();
                if (i2 > c) {
                    m63930a(this.f42992b, null, i2, this.f42991P);
                    m63930a(this.f42992b, null, 0, c);
                } else {
                    m63930a(this.f42992b, null, i2, c);
                }
                this.f42989N = c;
                m63935c(size() - i);
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("n shouldn't be negative but it is ");
            sb2.append(i);
            throw new IllegalArgumentException(sb2.toString().toString());
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m63929a(C14747a1 a1Var, Object[] objArr, Object obj, int i, int i2, int i3, Object obj2) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = objArr.length;
        }
        a1Var.m63930a(objArr, obj, i, i2);
    }

    /* renamed from: a */
    private final <T> void m63930a(@C6003d T[] tArr, T t, int i, int i2) {
        while (i < i2) {
            tArr[i] = t;
            i++;
        }
    }

    @C6003d
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
