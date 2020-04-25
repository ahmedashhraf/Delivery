package androidx.core.app;

import android.app.Activity;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;
import android.view.Window.OnFrameMetricsAvailableListener;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.RequiresApi;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: androidx.core.app.l */
/* compiled from: FrameMetricsAggregator */
public class C0753l {

    /* renamed from: b */
    public static final int f3432b = 0;

    /* renamed from: c */
    public static final int f3433c = 1;

    /* renamed from: d */
    public static final int f3434d = 2;

    /* renamed from: e */
    public static final int f3435e = 3;

    /* renamed from: f */
    public static final int f3436f = 4;

    /* renamed from: g */
    public static final int f3437g = 5;

    /* renamed from: h */
    public static final int f3438h = 6;

    /* renamed from: i */
    public static final int f3439i = 7;

    /* renamed from: j */
    public static final int f3440j = 8;

    /* renamed from: k */
    private static final int f3441k = 8;

    /* renamed from: l */
    public static final int f3442l = 1;

    /* renamed from: m */
    public static final int f3443m = 2;

    /* renamed from: n */
    public static final int f3444n = 4;

    /* renamed from: o */
    public static final int f3445o = 8;

    /* renamed from: p */
    public static final int f3446p = 16;

    /* renamed from: q */
    public static final int f3447q = 32;

    /* renamed from: r */
    public static final int f3448r = 64;

    /* renamed from: s */
    public static final int f3449s = 128;

    /* renamed from: t */
    public static final int f3450t = 256;

    /* renamed from: u */
    public static final int f3451u = 511;

    /* renamed from: a */
    private C0756b f3452a;

    @RequiresApi(24)
    /* renamed from: androidx.core.app.l$a */
    /* compiled from: FrameMetricsAggregator */
    private static class C0754a extends C0756b {

        /* renamed from: e */
        private static final int f3453e = 1000000;

        /* renamed from: f */
        private static final int f3454f = 500000;

        /* renamed from: g */
        private static HandlerThread f3455g;

        /* renamed from: h */
        private static Handler f3456h;

        /* renamed from: a */
        int f3457a;

        /* renamed from: b */
        SparseIntArray[] f3458b = new SparseIntArray[9];

        /* renamed from: c */
        private ArrayList<WeakReference<Activity>> f3459c = new ArrayList<>();

        /* renamed from: d */
        OnFrameMetricsAvailableListener f3460d = new C0755a();

        /* renamed from: androidx.core.app.l$a$a */
        /* compiled from: FrameMetricsAggregator */
        class C0755a implements OnFrameMetricsAvailableListener {
            C0755a() {
            }

            public void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
                C0754a aVar = C0754a.this;
                if ((aVar.f3457a & 1) != 0) {
                    aVar.mo4121a(aVar.f3458b[0], frameMetrics.getMetric(8));
                }
                C0754a aVar2 = C0754a.this;
                if ((aVar2.f3457a & 2) != 0) {
                    aVar2.mo4121a(aVar2.f3458b[1], frameMetrics.getMetric(1));
                }
                C0754a aVar3 = C0754a.this;
                if ((aVar3.f3457a & 4) != 0) {
                    aVar3.mo4121a(aVar3.f3458b[2], frameMetrics.getMetric(3));
                }
                C0754a aVar4 = C0754a.this;
                if ((aVar4.f3457a & 8) != 0) {
                    aVar4.mo4121a(aVar4.f3458b[3], frameMetrics.getMetric(4));
                }
                C0754a aVar5 = C0754a.this;
                if ((aVar5.f3457a & 16) != 0) {
                    aVar5.mo4121a(aVar5.f3458b[4], frameMetrics.getMetric(5));
                }
                C0754a aVar6 = C0754a.this;
                if ((aVar6.f3457a & 64) != 0) {
                    aVar6.mo4121a(aVar6.f3458b[6], frameMetrics.getMetric(7));
                }
                C0754a aVar7 = C0754a.this;
                if ((aVar7.f3457a & 32) != 0) {
                    aVar7.mo4121a(aVar7.f3458b[5], frameMetrics.getMetric(6));
                }
                C0754a aVar8 = C0754a.this;
                if ((aVar8.f3457a & 128) != 0) {
                    aVar8.mo4121a(aVar8.f3458b[7], frameMetrics.getMetric(0));
                }
                C0754a aVar9 = C0754a.this;
                if ((aVar9.f3457a & 256) != 0) {
                    aVar9.mo4121a(aVar9.f3458b[8], frameMetrics.getMetric(2));
                }
            }
        }

        C0754a(int i) {
            this.f3457a = i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4121a(SparseIntArray sparseIntArray, long j) {
            if (sparseIntArray != null) {
                int i = (int) ((500000 + j) / 1000000);
                if (j >= 0) {
                    sparseIntArray.put(i, sparseIntArray.get(i) + 1);
                }
            }
        }

        /* renamed from: b */
        public SparseIntArray[] mo4124b(Activity activity) {
            Iterator it = this.f3459c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                WeakReference weakReference = (WeakReference) it.next();
                if (weakReference.get() == activity) {
                    this.f3459c.remove(weakReference);
                    break;
                }
            }
            activity.getWindow().removeOnFrameMetricsAvailableListener(this.f3460d);
            return this.f3458b;
        }

        /* renamed from: c */
        public SparseIntArray[] mo4125c() {
            for (int size = this.f3459c.size() - 1; size >= 0; size--) {
                WeakReference weakReference = (WeakReference) this.f3459c.get(size);
                Activity activity = (Activity) weakReference.get();
                if (weakReference.get() != null) {
                    activity.getWindow().removeOnFrameMetricsAvailableListener(this.f3460d);
                    this.f3459c.remove(size);
                }
            }
            return this.f3458b;
        }

        /* renamed from: a */
        public void mo4120a(Activity activity) {
            if (f3455g == null) {
                f3455g = new HandlerThread("FrameMetricsAggregator");
                f3455g.start();
                f3456h = new Handler(f3455g.getLooper());
            }
            for (int i = 0; i <= 8; i++) {
                SparseIntArray[] sparseIntArrayArr = this.f3458b;
                if (sparseIntArrayArr[i] == null && (this.f3457a & (1 << i)) != 0) {
                    sparseIntArrayArr[i] = new SparseIntArray();
                }
            }
            activity.getWindow().addOnFrameMetricsAvailableListener(this.f3460d, f3456h);
            this.f3459c.add(new WeakReference(activity));
        }

        /* renamed from: b */
        public SparseIntArray[] mo4123b() {
            SparseIntArray[] sparseIntArrayArr = this.f3458b;
            this.f3458b = new SparseIntArray[9];
            return sparseIntArrayArr;
        }

        /* renamed from: a */
        public SparseIntArray[] mo4122a() {
            return this.f3458b;
        }
    }

    /* renamed from: androidx.core.app.l$b */
    /* compiled from: FrameMetricsAggregator */
    private static class C0756b {
        C0756b() {
        }

        /* renamed from: a */
        public void mo4120a(Activity activity) {
        }

        /* renamed from: a */
        public SparseIntArray[] mo4122a() {
            return null;
        }

        /* renamed from: b */
        public SparseIntArray[] mo4123b() {
            return null;
        }

        /* renamed from: b */
        public SparseIntArray[] mo4124b(Activity activity) {
            return null;
        }

        /* renamed from: c */
        public SparseIntArray[] mo4125c() {
            return null;
        }
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.core.app.l$c */
    /* compiled from: FrameMetricsAggregator */
    public @interface C0757c {
    }

    public C0753l() {
        this(1);
    }

    /* renamed from: a */
    public void mo4115a(@C0193h0 Activity activity) {
        this.f3452a.mo4120a(activity);
    }

    @C0195i0
    /* renamed from: b */
    public SparseIntArray[] mo4118b(@C0193h0 Activity activity) {
        return this.f3452a.mo4124b(activity);
    }

    @C0195i0
    /* renamed from: c */
    public SparseIntArray[] mo4119c() {
        return this.f3452a.mo4125c();
    }

    public C0753l(int i) {
        if (VERSION.SDK_INT >= 24) {
            this.f3452a = new C0754a(i);
        } else {
            this.f3452a = new C0756b();
        }
    }

    @C0195i0
    /* renamed from: a */
    public SparseIntArray[] mo4116a() {
        return this.f3452a.mo4122a();
    }

    @C0195i0
    /* renamed from: b */
    public SparseIntArray[] mo4117b() {
        return this.f3452a.mo4123b();
    }
}
