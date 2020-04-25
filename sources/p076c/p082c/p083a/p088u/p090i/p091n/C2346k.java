package p076c.p082c.p083a.p088u.p090i.p091n;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import java.util.TreeMap;
import p076c.p082c.p083a.p084a0.C2216i;

@TargetApi(19)
/* renamed from: c.c.a.u.i.n.k */
/* compiled from: SizeStrategy */
class C2346k implements C2339g {

    /* renamed from: d */
    private static final int f9262d = 8;

    /* renamed from: a */
    private final C2348b f9263a = new C2348b();

    /* renamed from: b */
    private final C2332e<C2347a, Bitmap> f9264b = new C2332e<>();

    /* renamed from: c */
    private final TreeMap<Integer, Integer> f9265c = new C2341i();

    /* renamed from: c.c.a.u.i.n.k$a */
    /* compiled from: SizeStrategy */
    static final class C2347a implements C2340h {

        /* renamed from: a */
        private final C2348b f9266a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public int f9267b;

        C2347a(C2348b bVar) {
            this.f9266a = bVar;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C2347a)) {
                return false;
            }
            if (this.f9267b == ((C2347a) obj).f9267b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f9267b;
        }

        public String toString() {
            return C2346k.m12121b(this.f9267b);
        }

        /* renamed from: a */
        public void mo9754a(int i) {
            this.f9267b = i;
        }

        /* renamed from: a */
        public void mo9721a() {
            this.f9266a.mo9728a(this);
        }
    }

    /* renamed from: c.c.a.u.i.n.k$b */
    /* compiled from: SizeStrategy */
    static class C2348b extends C2329b<C2347a> {
        C2348b() {
        }

        /* renamed from: a */
        public C2347a mo9758a(int i) {
            C2347a aVar = (C2347a) mo9729b();
            aVar.mo9754a(i);
            return aVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C2347a m12132a() {
            return new C2347a(this);
        }
    }

    C2346k() {
    }

    /* renamed from: d */
    private static String m12122d(Bitmap bitmap) {
        return m12121b(C2216i.m11338a(bitmap));
    }

    /* renamed from: b */
    public String mo9717b(int i, int i2, Config config) {
        return m12121b(C2216i.m11336a(i, i2, config));
    }

    /* renamed from: c */
    public String mo9718c(Bitmap bitmap) {
        return m12122d(bitmap);
    }

    public Bitmap removeLast() {
        Bitmap bitmap = (Bitmap) this.f9264b.mo9737a();
        if (bitmap != null) {
            m12120a(Integer.valueOf(C2216i.m11338a(bitmap)));
        }
        return bitmap;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SizeStrategy:\n  ");
        sb.append(this.f9264b);
        sb.append("\n");
        sb.append("  SortedSizes");
        sb.append(this.f9265c);
        return sb.toString();
    }

    /* renamed from: a */
    public void mo9715a(Bitmap bitmap) {
        C2347a a = this.f9263a.mo9758a(C2216i.m11338a(bitmap));
        this.f9264b.mo9739a(a, bitmap);
        Integer num = (Integer) this.f9265c.get(Integer.valueOf(a.f9267b));
        TreeMap<Integer, Integer> treeMap = this.f9265c;
        Integer valueOf = Integer.valueOf(a.f9267b);
        int i = 1;
        if (num != null) {
            i = 1 + num.intValue();
        }
        treeMap.put(valueOf, Integer.valueOf(i));
    }

    /* renamed from: b */
    public int mo9716b(Bitmap bitmap) {
        return C2216i.m11338a(bitmap);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static String m12121b(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(i);
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: a */
    public Bitmap mo9714a(int i, int i2, Config config) {
        int a = C2216i.m11336a(i, i2, config);
        C2347a a2 = this.f9263a.mo9758a(a);
        Integer num = (Integer) this.f9265c.ceilingKey(Integer.valueOf(a));
        if (!(num == null || num.intValue() == a || num.intValue() > a * 8)) {
            this.f9263a.mo9728a(a2);
            a2 = this.f9263a.mo9758a(num.intValue());
        }
        Bitmap bitmap = (Bitmap) this.f9264b.mo9738a(a2);
        if (bitmap != null) {
            bitmap.reconfigure(i, i2, config);
            m12120a(num);
        }
        return bitmap;
    }

    /* renamed from: a */
    private void m12120a(Integer num) {
        Integer num2 = (Integer) this.f9265c.get(num);
        if (num2.intValue() == 1) {
            this.f9265c.remove(num);
        } else {
            this.f9265c.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }
}
