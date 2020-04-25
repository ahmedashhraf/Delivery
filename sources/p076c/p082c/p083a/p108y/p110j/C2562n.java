package p076c.p082c.p083a.p108y.p110j;

import android.annotation.TargetApi;
import android.graphics.Point;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import p076c.p082c.p083a.p108y.C2525c;

/* renamed from: c.c.a.y.j.n */
/* compiled from: ViewTarget */
public abstract class C2562n<T extends View, Z> extends C2549b<Z> {

    /* renamed from: O */
    private static final String f9649O = "ViewTarget";

    /* renamed from: P */
    private static boolean f9650P = false;

    /* renamed from: Q */
    private static Integer f9651Q;

    /* renamed from: N */
    private final C2563a f9652N;

    /* renamed from: b */
    protected final T f9653b;

    /* renamed from: c.c.a.y.j.n$a */
    /* compiled from: ViewTarget */
    private static class C2563a {

        /* renamed from: e */
        private static final int f9654e = 0;

        /* renamed from: a */
        private final View f9655a;

        /* renamed from: b */
        private final List<C2558k> f9656b = new ArrayList();

        /* renamed from: c */
        private C2564a f9657c;

        /* renamed from: d */
        private Point f9658d;

        /* renamed from: c.c.a.y.j.n$a$a */
        /* compiled from: ViewTarget */
        private static class C2564a implements OnPreDrawListener {

            /* renamed from: a */
            private final WeakReference<C2563a> f9659a;

            public C2564a(C2563a aVar) {
                this.f9659a = new WeakReference<>(aVar);
            }

            public boolean onPreDraw() {
                if (Log.isLoggable(C2562n.f9649O, 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("OnGlobalLayoutListener called listener=");
                    sb.append(this);
                    sb.toString();
                }
                C2563a aVar = (C2563a) this.f9659a.get();
                if (aVar != null) {
                    aVar.m12654a();
                }
                return true;
            }
        }

        public C2563a(View view) {
            this.f9655a = view;
        }

        /* renamed from: a */
        private boolean m12657a(int i) {
            return i > 0 || i == -2;
        }

        @TargetApi(13)
        /* renamed from: b */
        private Point m12658b() {
            Point point = this.f9658d;
            if (point != null) {
                return point;
            }
            Display defaultDisplay = ((WindowManager) this.f9655a.getContext().getSystemService("window")).getDefaultDisplay();
            if (VERSION.SDK_INT >= 13) {
                this.f9658d = new Point();
                defaultDisplay.getSize(this.f9658d);
            } else {
                this.f9658d = new Point(defaultDisplay.getWidth(), defaultDisplay.getHeight());
            }
            return this.f9658d;
        }

        /* renamed from: c */
        private int m12659c() {
            LayoutParams layoutParams = this.f9655a.getLayoutParams();
            if (m12657a(this.f9655a.getHeight())) {
                return this.f9655a.getHeight();
            }
            if (layoutParams != null) {
                return m12653a(layoutParams.height, true);
            }
            return 0;
        }

        /* renamed from: d */
        private int m12660d() {
            LayoutParams layoutParams = this.f9655a.getLayoutParams();
            if (m12657a(this.f9655a.getWidth())) {
                return this.f9655a.getWidth();
            }
            if (layoutParams != null) {
                return m12653a(layoutParams.width, false);
            }
            return 0;
        }

        /* renamed from: a */
        private void m12655a(int i, int i2) {
            for (C2558k a : this.f9656b) {
                a.mo9402a(i, i2);
            }
            this.f9656b.clear();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m12654a() {
            if (!this.f9656b.isEmpty()) {
                int d = m12660d();
                int c = m12659c();
                if (m12657a(d) && m12657a(c)) {
                    m12655a(d, c);
                    ViewTreeObserver viewTreeObserver = this.f9655a.getViewTreeObserver();
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.removeOnPreDrawListener(this.f9657c);
                    }
                    this.f9657c = null;
                }
            }
        }

        /* renamed from: a */
        public void mo10063a(C2558k kVar) {
            int d = m12660d();
            int c = m12659c();
            if (!m12657a(d) || !m12657a(c)) {
                if (!this.f9656b.contains(kVar)) {
                    this.f9656b.add(kVar);
                }
                if (this.f9657c == null) {
                    ViewTreeObserver viewTreeObserver = this.f9655a.getViewTreeObserver();
                    this.f9657c = new C2564a(this);
                    viewTreeObserver.addOnPreDrawListener(this.f9657c);
                    return;
                }
                return;
            }
            kVar.mo9402a(d, c);
        }

        /* renamed from: a */
        private int m12653a(int i, boolean z) {
            if (i != -2) {
                return i;
            }
            Point b = m12658b();
            return z ? b.y : b.x;
        }
    }

    public C2562n(T t) {
        if (t != null) {
            this.f9653b = t;
            this.f9652N = new C2563a(t);
            return;
        }
        throw new NullPointerException("View must not be null!");
    }

    /* renamed from: a */
    public static void m12647a(int i) {
        if (f9651Q != null || f9650P) {
            throw new IllegalArgumentException("You cannot set the tag id more than once or change the tag id after the first request has been made");
        }
        f9651Q = Integer.valueOf(i);
    }

    /* renamed from: c */
    private Object m12649c() {
        Integer num = f9651Q;
        if (num == null) {
            return this.f9653b.getTag();
        }
        return this.f9653b.getTag(num.intValue());
    }

    public T getView() {
        return this.f9653b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Target for: ");
        sb.append(this.f9653b);
        return sb.toString();
    }

    /* renamed from: a */
    public void mo9506a(C2558k kVar) {
        this.f9652N.mo10063a(kVar);
    }

    /* renamed from: a */
    public void mo10001a(C2525c cVar) {
        mo10023a((Object) cVar);
    }

    /* renamed from: a */
    public C2525c mo10000a() {
        Object c = m12649c();
        if (c == null) {
            return null;
        }
        if (c instanceof C2525c) {
            return (C2525c) c;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    /* renamed from: a */
    private void mo10023a(Object obj) {
        Integer num = f9651Q;
        if (num == null) {
            f9650P = true;
            this.f9653b.setTag(obj);
            return;
        }
        this.f9653b.setTag(num.intValue(), obj);
    }
}
