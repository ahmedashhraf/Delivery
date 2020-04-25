package androidx.media;

import android.os.Build.VERSION;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.media.C1590o.C1592b;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: androidx.media.n */
/* compiled from: VolumeProviderCompat */
public abstract class C1586n {

    /* renamed from: f */
    public static final int f6061f = 0;

    /* renamed from: g */
    public static final int f6062g = 1;

    /* renamed from: h */
    public static final int f6063h = 2;

    /* renamed from: a */
    private final int f6064a;

    /* renamed from: b */
    private final int f6065b;

    /* renamed from: c */
    private int f6066c;

    /* renamed from: d */
    private C1588b f6067d;

    /* renamed from: e */
    private Object f6068e;

    /* renamed from: androidx.media.n$a */
    /* compiled from: VolumeProviderCompat */
    class C1587a implements C1592b {
        C1587a() {
        }

        /* renamed from: a */
        public void mo6815a(int i) {
            C1586n.this.mo6811b(i);
        }

        /* renamed from: b */
        public void mo6816b(int i) {
            C1586n.this.mo6808a(i);
        }
    }

    /* renamed from: androidx.media.n$b */
    /* compiled from: VolumeProviderCompat */
    public static abstract class C1588b {
        /* renamed from: a */
        public abstract void mo522a(C1586n nVar);
    }

    @C0207n0({C0208a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.media.n$c */
    /* compiled from: VolumeProviderCompat */
    public @interface C1589c {
    }

    public C1586n(int i, int i2, int i3) {
        this.f6064a = i;
        this.f6065b = i2;
        this.f6066c = i3;
    }

    /* renamed from: a */
    public final int mo6807a() {
        return this.f6066c;
    }

    /* renamed from: a */
    public void mo6808a(int i) {
    }

    /* renamed from: b */
    public final int mo6810b() {
        return this.f6065b;
    }

    /* renamed from: b */
    public void mo6811b(int i) {
    }

    /* renamed from: c */
    public final int mo6812c() {
        return this.f6064a;
    }

    /* renamed from: d */
    public Object mo6814d() {
        if (this.f6068e == null && VERSION.SDK_INT >= 21) {
            this.f6068e = C1590o.m8100a(this.f6064a, this.f6065b, this.f6066c, new C1587a());
        }
        return this.f6068e;
    }

    /* renamed from: a */
    public void mo6809a(C1588b bVar) {
        this.f6067d = bVar;
    }

    /* renamed from: c */
    public final void mo6813c(int i) {
        this.f6066c = i;
        Object d = mo6814d();
        if (d != null && VERSION.SDK_INT >= 21) {
            C1590o.m8101a(d, i);
        }
        C1588b bVar = this.f6067d;
        if (bVar != null) {
            bVar.mo522a(this);
        }
    }
}
