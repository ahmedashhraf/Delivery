package p076c.p082c.p083a.p088u.p090i.p092o;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build.VERSION;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

/* renamed from: c.c.a.u.i.o.k */
/* compiled from: MemorySizeCalculator */
public class C2370k {

    /* renamed from: d */
    private static final String f9296d = "MemorySizeCalculator";

    /* renamed from: e */
    static final int f9297e = 4;

    /* renamed from: f */
    static final int f9298f = 2;

    /* renamed from: g */
    static final int f9299g = 4;

    /* renamed from: h */
    static final float f9300h = 0.4f;

    /* renamed from: i */
    static final float f9301i = 0.33f;

    /* renamed from: a */
    private final int f9302a;

    /* renamed from: b */
    private final int f9303b;

    /* renamed from: c */
    private final Context f9304c;

    /* renamed from: c.c.a.u.i.o.k$a */
    /* compiled from: MemorySizeCalculator */
    private static class C2371a implements C2372b {

        /* renamed from: a */
        private final DisplayMetrics f9305a;

        public C2371a(DisplayMetrics displayMetrics) {
            this.f9305a = displayMetrics;
        }

        /* renamed from: a */
        public int mo9780a() {
            return this.f9305a.heightPixels;
        }

        /* renamed from: b */
        public int mo9781b() {
            return this.f9305a.widthPixels;
        }
    }

    /* renamed from: c.c.a.u.i.o.k$b */
    /* compiled from: MemorySizeCalculator */
    interface C2372b {
        /* renamed from: a */
        int mo9780a();

        /* renamed from: b */
        int mo9781b();
    }

    public C2370k(Context context) {
        this(context, (ActivityManager) context.getSystemService("activity"), new C2371a(context.getResources().getDisplayMetrics()));
    }

    /* renamed from: a */
    public int mo9778a() {
        return this.f9302a;
    }

    /* renamed from: b */
    public int mo9779b() {
        return this.f9303b;
    }

    C2370k(Context context, ActivityManager activityManager, C2372b bVar) {
        this.f9304c = context;
        int a = m12181a(activityManager);
        int b = bVar.mo9781b() * bVar.mo9780a() * 4;
        int i = b * 4;
        int i2 = b * 2;
        int i3 = i2 + i;
        if (i3 <= a) {
            this.f9303b = i2;
            this.f9302a = i;
        } else {
            int round = Math.round(((float) a) / 6.0f);
            this.f9303b = round * 2;
            this.f9302a = round * 4;
        }
        if (Log.isLoggable(f9296d, 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Calculated memory cache size: ");
            sb.append(m12182a(this.f9303b));
            sb.append(" pool size: ");
            sb.append(m12182a(this.f9302a));
            sb.append(" memory class limited? ");
            sb.append(i3 > a);
            sb.append(" max size: ");
            sb.append(m12182a(a));
            sb.append(" memoryClass: ");
            sb.append(activityManager.getMemoryClass());
            sb.append(" isLowMemoryDevice: ");
            sb.append(m12183b(activityManager));
            sb.toString();
        }
    }

    /* renamed from: a */
    private static int m12181a(ActivityManager activityManager) {
        return Math.round(((float) (activityManager.getMemoryClass() * 1024 * 1024)) * (m12183b(activityManager) ? f9301i : f9300h));
    }

    @TargetApi(19)
    /* renamed from: b */
    private static boolean m12183b(ActivityManager activityManager) {
        int i = VERSION.SDK_INT;
        if (i >= 19) {
            return activityManager.isLowRamDevice();
        }
        return i < 11;
    }

    /* renamed from: a */
    private String m12182a(int i) {
        return Formatter.formatFileSize(this.f9304c, (long) i);
    }
}
