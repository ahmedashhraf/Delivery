package androidx.core.p018c;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.core.content.p020h.C0865d.C0868c;
import androidx.core.content.p020h.C0865d.C0869d;
import androidx.core.provider.C1074a.C1091h;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;

@C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.core.c.l */
/* compiled from: TypefaceCompatBaseImpl */
class C0833l {

    /* renamed from: b */
    private static final String f3958b = "TypefaceCompatBaseImpl";

    /* renamed from: c */
    private static final int f3959c = 0;

    /* renamed from: a */
    private ConcurrentHashMap<Long, C0868c> f3960a = new ConcurrentHashMap<>();

    /* renamed from: androidx.core.c.l$a */
    /* compiled from: TypefaceCompatBaseImpl */
    class C0834a implements C0836c<C1091h> {
        C0834a() {
        }

        /* renamed from: a */
        public int mo4485a(C1091h hVar) {
            return hVar.mo5261d();
        }

        /* renamed from: b */
        public boolean mo4487b(C1091h hVar) {
            return hVar.mo5262e();
        }
    }

    /* renamed from: androidx.core.c.l$b */
    /* compiled from: TypefaceCompatBaseImpl */
    class C0835b implements C0836c<C0869d> {
        C0835b() {
        }

        /* renamed from: a */
        public int mo4485a(C0869d dVar) {
            return dVar.mo4546e();
        }

        /* renamed from: b */
        public boolean mo4487b(C0869d dVar) {
            return dVar.mo4547f();
        }
    }

    /* renamed from: androidx.core.c.l$c */
    /* compiled from: TypefaceCompatBaseImpl */
    private interface C0836c<T> {
        /* renamed from: a */
        int mo4485a(T t);

        /* renamed from: b */
        boolean mo4487b(T t);
    }

    C0833l() {
    }

    /* renamed from: a */
    private static <T> T m4876a(T[] tArr, int i, C0836c<T> cVar) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        T t = null;
        int i3 = Integer.MAX_VALUE;
        for (T t2 : tArr) {
            int abs = (Math.abs(cVar.mo4485a(t2) - i2) * 2) + (cVar.mo4487b(t2) == z ? 0 : 1);
            if (t == null || i3 > abs) {
                t = t2;
                i3 = abs;
            }
        }
        return t;
    }

    /* renamed from: b */
    private static long m4878b(@C0195i0 Typeface typeface) {
        long j = 0;
        if (typeface == null) {
            return 0;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            j = ((Number) declaredField.get(typeface)).longValue();
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
        return j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C1091h mo4483a(C1091h[] hVarArr, int i) {
        return (C1091h) m4876a(hVarArr, i, new C0834a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Typeface mo4481a(Context context, InputStream inputStream) {
        File a = C0837m.m4895a(context);
        if (a == null) {
            return null;
        }
        try {
            if (!C0837m.m4901a(a, inputStream)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(a.getPath());
            a.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            a.delete();
        }
    }

    @C0195i0
    /* renamed from: a */
    public Typeface mo4470a(Context context, @C0195i0 CancellationSignal cancellationSignal, @C0193h0 C1091h[] hVarArr, int i) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (hVarArr.length < 1) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(mo4483a(hVarArr, i).mo5260c());
            try {
                Typeface a = mo4481a(context, inputStream);
                C0837m.m4899a((Closeable) inputStream);
                return a;
            } catch (IOException unused) {
                C0837m.m4899a((Closeable) inputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                inputStream2 = inputStream;
                C0837m.m4899a((Closeable) inputStream2);
                throw th;
            }
        } catch (IOException unused2) {
            inputStream = null;
            C0837m.m4899a((Closeable) inputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            C0837m.m4899a((Closeable) inputStream2);
            throw th;
        }
    }

    /* renamed from: a */
    private C0869d m4875a(C0868c cVar, int i) {
        return (C0869d) m4876a(cVar.mo4541a(), i, new C0835b());
    }

    @C0195i0
    /* renamed from: a */
    public Typeface mo4471a(Context context, C0868c cVar, Resources resources, int i) {
        C0869d a = m4875a(cVar, i);
        if (a == null) {
            return null;
        }
        Typeface a2 = C0828g.m4836a(context, resources, a.mo4543b(), a.mo4542a(), i);
        m4877a(a2, cVar);
        return a2;
    }

    @C0195i0
    /* renamed from: a */
    public Typeface mo4472a(Context context, Resources resources, int i, String str, int i2) {
        File a = C0837m.m4895a(context);
        if (a == null) {
            return null;
        }
        try {
            if (!C0837m.m4900a(a, resources, i)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(a.getPath());
            a.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            a.delete();
        }
    }

    /* access modifiers changed from: 0000 */
    @C0195i0
    /* renamed from: a */
    public C0868c mo4482a(Typeface typeface) {
        long b = m4878b(typeface);
        if (b == 0) {
            return null;
        }
        return (C0868c) this.f3960a.get(Long.valueOf(b));
    }

    /* renamed from: a */
    private void m4877a(Typeface typeface, C0868c cVar) {
        long b = m4878b(typeface);
        if (b != 0) {
            this.f3960a.put(Long.valueOf(b), cVar);
        }
    }
}
