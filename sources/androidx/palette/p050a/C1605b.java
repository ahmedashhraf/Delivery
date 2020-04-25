package androidx.palette.p050a;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.AsyncTask;
import android.util.SparseBooleanArray;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0198k;
import androidx.annotation.C0199k0;
import androidx.collection.C0635a;
import androidx.core.p018c.C0821b;
import androidx.core.p034l.C0962e0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.palette.a.b */
/* compiled from: Palette */
public final class C1605b {

    /* renamed from: f */
    static final int f6106f = 12544;

    /* renamed from: g */
    static final int f6107g = 16;

    /* renamed from: h */
    static final float f6108h = 3.0f;

    /* renamed from: i */
    static final float f6109i = 4.5f;

    /* renamed from: j */
    static final String f6110j = "Palette";

    /* renamed from: k */
    static final boolean f6111k = false;

    /* renamed from: l */
    static final C1609c f6112l = new C1606a();

    /* renamed from: a */
    private final List<C1611e> f6113a;

    /* renamed from: b */
    private final List<C1612c> f6114b;

    /* renamed from: c */
    private final Map<C1612c, C1611e> f6115c = new C0635a();

    /* renamed from: d */
    private final SparseBooleanArray f6116d = new SparseBooleanArray();
    @C0195i0

    /* renamed from: e */
    private final C1611e f6117e = m8170k();

    /* renamed from: androidx.palette.a.b$a */
    /* compiled from: Palette */
    static class C1606a implements C1609c {

        /* renamed from: a */
        private static final float f6118a = 0.05f;

        /* renamed from: b */
        private static final float f6119b = 0.95f;

        C1606a() {
        }

        /* renamed from: b */
        private boolean m8191b(float[] fArr) {
            return fArr[0] >= 10.0f && fArr[0] <= 37.0f && fArr[1] <= 0.82f;
        }

        /* renamed from: c */
        private boolean m8192c(float[] fArr) {
            return fArr[2] >= f6119b;
        }

        /* renamed from: a */
        public boolean mo6859a(int i, float[] fArr) {
            return !m8192c(fArr) && !m8190a(fArr) && !m8191b(fArr);
        }

        /* renamed from: a */
        private boolean m8190a(float[] fArr) {
            return fArr[2] <= f6118a;
        }
    }

    /* renamed from: androidx.palette.a.b$b */
    /* compiled from: Palette */
    public static final class C1607b {
        @C0195i0

        /* renamed from: a */
        private final List<C1611e> f6120a;
        @C0195i0

        /* renamed from: b */
        private final Bitmap f6121b;

        /* renamed from: c */
        private final List<C1612c> f6122c = new ArrayList();

        /* renamed from: d */
        private int f6123d = 16;

        /* renamed from: e */
        private int f6124e = C1605b.f6106f;

        /* renamed from: f */
        private int f6125f = -1;

        /* renamed from: g */
        private final List<C1609c> f6126g = new ArrayList();
        @C0195i0

        /* renamed from: h */
        private Rect f6127h;

        /* renamed from: androidx.palette.a.b$b$a */
        /* compiled from: Palette */
        class C1608a extends AsyncTask<Bitmap, Void, C1605b> {

            /* renamed from: a */
            final /* synthetic */ C1610d f6128a;

            C1608a(C1610d dVar) {
                this.f6128a = dVar;
            }

            /* access modifiers changed from: protected */
            @C0195i0
            /* renamed from: a */
            public C1605b doInBackground(Bitmap... bitmapArr) {
                try {
                    return C1607b.this.mo6870d();
                } catch (Exception unused) {
                    return null;
                }
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void onPostExecute(@C0195i0 C1605b bVar) {
                this.f6128a.mo6875a(bVar);
            }
        }

        public C1607b(@C0193h0 Bitmap bitmap) {
            if (bitmap == null || bitmap.isRecycled()) {
                throw new IllegalArgumentException("Bitmap is not valid");
            }
            this.f6126g.add(C1605b.f6112l);
            this.f6121b = bitmap;
            this.f6120a = null;
            this.f6122c.add(C1612c.f6163y);
            this.f6122c.add(C1612c.f6164z);
            this.f6122c.add(C1612c.f6139A);
            this.f6122c.add(C1612c.f6140B);
            this.f6122c.add(C1612c.f6141C);
            this.f6122c.add(C1612c.f6142D);
        }

        @C0193h0
        /* renamed from: a */
        public C1607b mo6862a(int i) {
            this.f6123d = i;
            return this;
        }

        @C0193h0
        /* renamed from: b */
        public C1607b mo6867b(int i) {
            this.f6124e = i;
            this.f6125f = -1;
            return this;
        }

        @C0193h0
        @Deprecated
        /* renamed from: c */
        public C1607b mo6869c(int i) {
            this.f6125f = i;
            this.f6124e = -1;
            return this;
        }

        @C0193h0
        /* renamed from: d */
        public C1605b mo6870d() {
            List<C1611e> list;
            C1609c[] cVarArr;
            Bitmap bitmap = this.f6121b;
            if (bitmap != null) {
                Bitmap b = m8195b(bitmap);
                Rect rect = this.f6127h;
                if (!(b == this.f6121b || rect == null)) {
                    double width = (double) b.getWidth();
                    double width2 = (double) this.f6121b.getWidth();
                    Double.isNaN(width);
                    Double.isNaN(width2);
                    double d = width / width2;
                    double d2 = (double) rect.left;
                    Double.isNaN(d2);
                    rect.left = (int) Math.floor(d2 * d);
                    double d3 = (double) rect.top;
                    Double.isNaN(d3);
                    rect.top = (int) Math.floor(d3 * d);
                    double d4 = (double) rect.right;
                    Double.isNaN(d4);
                    rect.right = Math.min((int) Math.ceil(d4 * d), b.getWidth());
                    double d5 = (double) rect.bottom;
                    Double.isNaN(d5);
                    rect.bottom = Math.min((int) Math.ceil(d5 * d), b.getHeight());
                }
                int[] a = m8194a(b);
                int i = this.f6123d;
                if (this.f6126g.isEmpty()) {
                    cVarArr = null;
                } else {
                    List<C1609c> list2 = this.f6126g;
                    cVarArr = (C1609c[]) list2.toArray(new C1609c[list2.size()]);
                }
                C1602a aVar = new C1602a(a, i, cVarArr);
                if (b != this.f6121b) {
                    b.recycle();
                }
                list = aVar.mo6829a();
            } else {
                list = this.f6120a;
                if (list == null) {
                    throw new AssertionError();
                }
            }
            C1605b bVar = new C1605b(list, this.f6122c);
            bVar.mo6843a();
            return bVar;
        }

        @C0193h0
        /* renamed from: a */
        public C1607b mo6861a() {
            this.f6126g.clear();
            return this;
        }

        @C0193h0
        /* renamed from: a */
        public C1607b mo6864a(C1609c cVar) {
            if (cVar != null) {
                this.f6126g.add(cVar);
            }
            return this;
        }

        @C0193h0
        /* renamed from: b */
        public C1607b mo6866b() {
            this.f6127h = null;
            return this;
        }

        @C0193h0
        /* renamed from: c */
        public C1607b mo6868c() {
            List<C1612c> list = this.f6122c;
            if (list != null) {
                list.clear();
            }
            return this;
        }

        /* renamed from: b */
        private Bitmap m8195b(Bitmap bitmap) {
            double d = -1.0d;
            if (this.f6124e > 0) {
                int width = bitmap.getWidth() * bitmap.getHeight();
                int i = this.f6124e;
                if (width > i) {
                    double d2 = (double) i;
                    double d3 = (double) width;
                    Double.isNaN(d2);
                    Double.isNaN(d3);
                    d = Math.sqrt(d2 / d3);
                }
            } else if (this.f6125f > 0) {
                int max = Math.max(bitmap.getWidth(), bitmap.getHeight());
                int i2 = this.f6125f;
                if (max > i2) {
                    double d4 = (double) i2;
                    double d5 = (double) max;
                    Double.isNaN(d4);
                    Double.isNaN(d5);
                    d = d4 / d5;
                }
            }
            if (d <= 0.0d) {
                return bitmap;
            }
            double width2 = (double) bitmap.getWidth();
            Double.isNaN(width2);
            int ceil = (int) Math.ceil(width2 * d);
            double height = (double) bitmap.getHeight();
            Double.isNaN(height);
            return Bitmap.createScaledBitmap(bitmap, ceil, (int) Math.ceil(height * d), false);
        }

        @C0193h0
        /* renamed from: a */
        public C1607b mo6863a(@C0199k0 int i, @C0199k0 int i2, @C0199k0 int i3, @C0199k0 int i4) {
            if (this.f6121b != null) {
                if (this.f6127h == null) {
                    this.f6127h = new Rect();
                }
                this.f6127h.set(0, 0, this.f6121b.getWidth(), this.f6121b.getHeight());
                if (!this.f6127h.intersect(i, i2, i3, i4)) {
                    throw new IllegalArgumentException("The given region must intersect with the Bitmap's dimensions.");
                }
            }
            return this;
        }

        @C0193h0
        /* renamed from: a */
        public C1607b mo6865a(@C0193h0 C1612c cVar) {
            if (!this.f6122c.contains(cVar)) {
                this.f6122c.add(cVar);
            }
            return this;
        }

        @C0193h0
        /* renamed from: a */
        public AsyncTask<Bitmap, Void, C1605b> mo6860a(@C0193h0 C1610d dVar) {
            if (dVar != null) {
                return new C1608a(dVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Bitmap[]{this.f6121b});
            }
            throw new IllegalArgumentException("listener can not be null");
        }

        /* renamed from: a */
        private int[] m8194a(Bitmap bitmap) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int[] iArr = new int[(width * height)];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            Rect rect = this.f6127h;
            if (rect == null) {
                return iArr;
            }
            int width2 = rect.width();
            int height2 = this.f6127h.height();
            int[] iArr2 = new int[(width2 * height2)];
            for (int i = 0; i < height2; i++) {
                Rect rect2 = this.f6127h;
                System.arraycopy(iArr, ((rect2.top + i) * width) + rect2.left, iArr2, i * width2, width2);
            }
            return iArr2;
        }

        public C1607b(@C0193h0 List<C1611e> list) {
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException("List of Swatches is not valid");
            }
            this.f6126g.add(C1605b.f6112l);
            this.f6120a = list;
            this.f6121b = null;
        }
    }

    /* renamed from: androidx.palette.a.b$c */
    /* compiled from: Palette */
    public interface C1609c {
        /* renamed from: a */
        boolean mo6859a(@C0198k int i, @C0193h0 float[] fArr);
    }

    /* renamed from: androidx.palette.a.b$d */
    /* compiled from: Palette */
    public interface C1610d {
        /* renamed from: a */
        void mo6875a(@C0195i0 C1605b bVar);
    }

    /* renamed from: androidx.palette.a.b$e */
    /* compiled from: Palette */
    public static final class C1611e {

        /* renamed from: a */
        private final int f6130a;

        /* renamed from: b */
        private final int f6131b;

        /* renamed from: c */
        private final int f6132c;

        /* renamed from: d */
        private final int f6133d;

        /* renamed from: e */
        private final int f6134e;

        /* renamed from: f */
        private boolean f6135f;

        /* renamed from: g */
        private int f6136g;

        /* renamed from: h */
        private int f6137h;
        @C0195i0

        /* renamed from: i */
        private float[] f6138i;

        public C1611e(@C0198k int i, int i2) {
            this.f6130a = Color.red(i);
            this.f6131b = Color.green(i);
            this.f6132c = Color.blue(i);
            this.f6133d = i;
            this.f6134e = i2;
        }

        /* renamed from: f */
        private void m8211f() {
            int i;
            int i2;
            if (!this.f6135f) {
                int b = C0821b.m4806b(-1, this.f6133d, (float) C1605b.f6109i);
                int b2 = C0821b.m4806b(-1, this.f6133d, (float) C1605b.f6108h);
                if (b == -1 || b2 == -1) {
                    int b3 = C0821b.m4806b((int) C0962e0.f4343t, this.f6133d, (float) C1605b.f6109i);
                    int b4 = C0821b.m4806b((int) C0962e0.f4343t, this.f6133d, (float) C1605b.f6108h);
                    if (b3 == -1 || b4 == -1) {
                        if (b != -1) {
                            i = C0821b.m4811d(-1, b);
                        } else {
                            i = C0821b.m4811d(C0962e0.f4343t, b3);
                        }
                        this.f6137h = i;
                        if (b2 != -1) {
                            i2 = C0821b.m4811d(-1, b2);
                        } else {
                            i2 = C0821b.m4811d(C0962e0.f4343t, b4);
                        }
                        this.f6136g = i2;
                        this.f6135f = true;
                    } else {
                        this.f6137h = C0821b.m4811d(C0962e0.f4343t, b3);
                        this.f6136g = C0821b.m4811d(C0962e0.f4343t, b4);
                        this.f6135f = true;
                    }
                } else {
                    this.f6137h = C0821b.m4811d(-1, b);
                    this.f6136g = C0821b.m4811d(-1, b2);
                    this.f6135f = true;
                }
            }
        }

        @C0198k
        /* renamed from: a */
        public int mo6876a() {
            m8211f();
            return this.f6137h;
        }

        @C0193h0
        /* renamed from: b */
        public float[] mo6877b() {
            if (this.f6138i == null) {
                this.f6138i = new float[3];
            }
            C0821b.m4797a(this.f6130a, this.f6131b, this.f6132c, this.f6138i);
            return this.f6138i;
        }

        /* renamed from: c */
        public int mo6878c() {
            return this.f6134e;
        }

        @C0198k
        /* renamed from: d */
        public int mo6879d() {
            return this.f6133d;
        }

        @C0198k
        /* renamed from: e */
        public int mo6880e() {
            m8211f();
            return this.f6136g;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || C1611e.class != obj.getClass()) {
                return false;
            }
            C1611e eVar = (C1611e) obj;
            if (!(this.f6134e == eVar.f6134e && this.f6133d == eVar.f6133d)) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            return (this.f6133d * 31) + this.f6134e;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(C1611e.class.getSimpleName());
            sb.append(" [RGB: #");
            sb.append(Integer.toHexString(mo6879d()));
            sb.append(']');
            sb.append(" [HSL: ");
            sb.append(Arrays.toString(mo6877b()));
            sb.append(']');
            sb.append(" [Population: ");
            sb.append(this.f6134e);
            sb.append(']');
            sb.append(" [Title Text: #");
            sb.append(Integer.toHexString(mo6880e()));
            sb.append(']');
            sb.append(" [Body Text: #");
            sb.append(Integer.toHexString(mo6876a()));
            sb.append(']');
            return sb.toString();
        }

        C1611e(int i, int i2, int i3, int i4) {
            this.f6130a = i;
            this.f6131b = i2;
            this.f6132c = i3;
            this.f6133d = Color.rgb(i, i2, i3);
            this.f6134e = i4;
        }

        C1611e(float[] fArr, int i) {
            this(C0821b.m4793a(fArr), i);
            this.f6138i = fArr;
        }
    }

    C1605b(List<C1611e> list, List<C1612c> list2) {
        this.f6113a = list;
        this.f6114b = list2;
    }

    @C0193h0
    /* renamed from: a */
    public static C1607b m8163a(@C0193h0 Bitmap bitmap) {
        return new C1607b(bitmap);
    }

    @Deprecated
    /* renamed from: b */
    public static C1605b m8167b(Bitmap bitmap) {
        return m8163a(bitmap).mo6870d();
    }

    @C0195i0
    /* renamed from: k */
    private C1611e m8170k() {
        int size = this.f6113a.size();
        int i = Integer.MIN_VALUE;
        C1611e eVar = null;
        for (int i2 = 0; i2 < size; i2++) {
            C1611e eVar2 = (C1611e) this.f6113a.get(i2);
            if (eVar2.mo6878c() > i) {
                i = eVar2.mo6878c();
                eVar = eVar2;
            }
        }
        return eVar;
    }

    @C0195i0
    /* renamed from: c */
    public C1611e mo6847c() {
        return mo6842a(C1612c.f6139A);
    }

    @C0198k
    /* renamed from: d */
    public int mo6848d(@C0198k int i) {
        return mo6841a(C1612c.f6140B, i);
    }

    @C0195i0
    /* renamed from: e */
    public C1611e mo6851e() {
        return mo6842a(C1612c.f6140B);
    }

    @C0195i0
    /* renamed from: f */
    public C1611e mo6853f() {
        return mo6842a(C1612c.f6163y);
    }

    @C0195i0
    /* renamed from: g */
    public C1611e mo6855g() {
        return mo6842a(C1612c.f6141C);
    }

    @C0193h0
    /* renamed from: h */
    public List<C1611e> mo6856h() {
        return Collections.unmodifiableList(this.f6113a);
    }

    @C0193h0
    /* renamed from: i */
    public List<C1612c> mo6857i() {
        return Collections.unmodifiableList(this.f6114b);
    }

    @C0195i0
    /* renamed from: j */
    public C1611e mo6858j() {
        return mo6842a(C1612c.f6164z);
    }

    @C0193h0
    /* renamed from: a */
    public static C1605b m8165a(@C0193h0 List<C1611e> list) {
        return new C1607b(list).mo6870d();
    }

    @C0195i0
    /* renamed from: b */
    public C1611e mo6845b() {
        return mo6842a(C1612c.f6142D);
    }

    @C0198k
    /* renamed from: c */
    public int mo6846c(@C0198k int i) {
        C1611e eVar = this.f6117e;
        return eVar != null ? eVar.mo6879d() : i;
    }

    @C0195i0
    /* renamed from: d */
    public C1611e mo6849d() {
        return this.f6117e;
    }

    @C0198k
    /* renamed from: e */
    public int mo6850e(@C0198k int i) {
        return mo6841a(C1612c.f6163y, i);
    }

    @C0198k
    /* renamed from: f */
    public int mo6852f(@C0198k int i) {
        return mo6841a(C1612c.f6141C, i);
    }

    @C0198k
    /* renamed from: g */
    public int mo6854g(@C0198k int i) {
        return mo6841a(C1612c.f6164z, i);
    }

    @Deprecated
    /* renamed from: a */
    public static C1605b m8164a(Bitmap bitmap, int i) {
        return m8163a(bitmap).mo6862a(i).mo6870d();
    }

    @C0195i0
    /* renamed from: c */
    private C1611e m8169c(C1612c cVar) {
        int size = this.f6113a.size();
        float f = 0.0f;
        C1611e eVar = null;
        for (int i = 0; i < size; i++) {
            C1611e eVar2 = (C1611e) this.f6113a.get(i);
            if (m8168b(eVar2, cVar)) {
                float a = m8160a(eVar2, cVar);
                if (eVar == null || a > f) {
                    eVar = eVar2;
                    f = a;
                }
            }
        }
        return eVar;
    }

    @C0198k
    /* renamed from: b */
    public int mo6844b(@C0198k int i) {
        return mo6841a(C1612c.f6139A, i);
    }

    @Deprecated
    /* renamed from: a */
    public static AsyncTask<Bitmap, Void, C1605b> m8162a(Bitmap bitmap, C1610d dVar) {
        return m8163a(bitmap).mo6860a(dVar);
    }

    @C0195i0
    /* renamed from: b */
    private C1611e m8166b(C1612c cVar) {
        C1611e c = m8169c(cVar);
        if (c != null && cVar.mo6893j()) {
            this.f6116d.append(c.mo6879d(), true);
        }
        return c;
    }

    @Deprecated
    /* renamed from: a */
    public static AsyncTask<Bitmap, Void, C1605b> m8161a(Bitmap bitmap, int i, C1610d dVar) {
        return m8163a(bitmap).mo6862a(i).mo6860a(dVar);
    }

    @C0198k
    /* renamed from: a */
    public int mo6840a(@C0198k int i) {
        return mo6841a(C1612c.f6142D, i);
    }

    /* renamed from: b */
    private boolean m8168b(C1611e eVar, C1612c cVar) {
        float[] b = eVar.mo6877b();
        if (b[1] < cVar.mo6888e() || b[1] > cVar.mo6886c() || b[2] < cVar.mo6887d() || b[2] > cVar.mo6885b() || this.f6116d.get(eVar.mo6879d())) {
            return false;
        }
        return true;
    }

    @C0195i0
    /* renamed from: a */
    public C1611e mo6842a(@C0193h0 C1612c cVar) {
        return (C1611e) this.f6115c.get(cVar);
    }

    @C0198k
    /* renamed from: a */
    public int mo6841a(@C0193h0 C1612c cVar, @C0198k int i) {
        C1611e a = mo6842a(cVar);
        return a != null ? a.mo6879d() : i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6843a() {
        int size = this.f6114b.size();
        for (int i = 0; i < size; i++) {
            C1612c cVar = (C1612c) this.f6114b.get(i);
            cVar.mo6894k();
            this.f6115c.put(cVar, m8166b(cVar));
        }
        this.f6116d.clear();
    }

    /* renamed from: a */
    private float m8160a(C1611e eVar, C1612c cVar) {
        float[] b = eVar.mo6877b();
        C1611e eVar2 = this.f6117e;
        int c = eVar2 != null ? eVar2.mo6878c() : 1;
        float f = 0.0f;
        float abs = cVar.mo6890g() > 0.0f ? (1.0f - Math.abs(b[1] - cVar.mo6892i())) * cVar.mo6890g() : 0.0f;
        float a = cVar.mo6884a() > 0.0f ? cVar.mo6884a() * (1.0f - Math.abs(b[2] - cVar.mo6891h())) : 0.0f;
        if (cVar.mo6889f() > 0.0f) {
            f = cVar.mo6889f() * (((float) eVar.mo6878c()) / ((float) c));
        }
        return abs + a + f;
    }
}
