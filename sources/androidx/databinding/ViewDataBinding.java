package androidx.databinding;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.util.SparseLongArray;
import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewGroup;
import androidx.annotation.C0187e0;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.collection.C0642f;
import androidx.databinding.C1171a0.C1172a;
import androidx.databinding.C1269i.C1270a;
import androidx.databinding.C1296v.C1297a;
import androidx.databinding.C1301z.C1302a;
import androidx.databinding.library.C1274R;
import androidx.lifecycle.C1458h;
import androidx.lifecycle.C1459i;
import androidx.lifecycle.C1468o;
import androidx.lifecycle.C1469p;
import androidx.lifecycle.Lifecycle.C1441a;
import androidx.lifecycle.LiveData;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

public abstract class ViewDataBinding extends C1170a {

    /* renamed from: b0 */
    static int f5018b0 = VERSION.SDK_INT;

    /* renamed from: c0 */
    private static final int f5019c0 = 1;

    /* renamed from: d0 */
    private static final int f5020d0 = 2;

    /* renamed from: e0 */
    private static final int f5021e0 = 3;

    /* renamed from: f0 */
    public static final String f5022f0 = "binding_";

    /* renamed from: g0 */
    private static final int f5023g0 = 8;

    /* renamed from: h0 */
    private static final boolean f5024h0 = (f5018b0 >= 16);

    /* renamed from: i0 */
    private static final C1161i f5025i0 = new C1153a();

    /* renamed from: j0 */
    private static final C1161i f5026j0 = new C1154b();

    /* renamed from: k0 */
    private static final C1161i f5027k0 = new C1155c();

    /* renamed from: l0 */
    private static final C1161i f5028l0 = new C1156d();

    /* renamed from: m0 */
    private static final C1270a<C1175b0, ViewDataBinding, Void> f5029m0 = new C1157e();
    /* access modifiers changed from: private */

    /* renamed from: n0 */
    public static final ReferenceQueue<ViewDataBinding> f5030n0 = new ReferenceQueue<>();
    /* access modifiers changed from: private */

    /* renamed from: o0 */
    public static final OnAttachStateChangeListener f5031o0;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public boolean f5032N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public boolean f5033O;

    /* renamed from: P */
    private C1167o[] f5034P;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public final View f5035Q;

    /* renamed from: R */
    private C1269i<C1175b0, ViewDataBinding, Void> f5036R;

    /* renamed from: S */
    private boolean f5037S;

    /* renamed from: T */
    private Choreographer f5038T;

    /* renamed from: U */
    private final FrameCallback f5039U;

    /* renamed from: V */
    private Handler f5040V;

    /* renamed from: W */
    protected final C1273l f5041W;

    /* renamed from: X */
    private ViewDataBinding f5042X;

    /* renamed from: Y */
    private C1459i f5043Y;

    /* renamed from: Z */
    private OnStartListener f5044Z;

    /* renamed from: a0 */
    private boolean f5045a0;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Runnable f5046b;

    static class OnStartListener implements C1458h {

        /* renamed from: a */
        final WeakReference<ViewDataBinding> f5047a;

        /* synthetic */ OnStartListener(ViewDataBinding viewDataBinding, C1153a aVar) {
            this(viewDataBinding);
        }

        @C1469p(C1441a.ON_START)
        public void onStart() {
            ViewDataBinding viewDataBinding = (ViewDataBinding) this.f5047a.get();
            if (viewDataBinding != null) {
                viewDataBinding.mo5535j();
            }
        }

        private OnStartListener(ViewDataBinding viewDataBinding) {
            this.f5047a = new WeakReference<>(viewDataBinding);
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$a */
    static class C1153a implements C1161i {
        C1153a() {
        }

        /* renamed from: a */
        public C1167o mo5544a(ViewDataBinding viewDataBinding, int i) {
            return new C1169q(viewDataBinding, i).getListener();
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$b */
    static class C1154b implements C1161i {
        C1154b() {
        }

        /* renamed from: a */
        public C1167o mo5544a(ViewDataBinding viewDataBinding, int i) {
            return new C1166n(viewDataBinding, i).getListener();
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$c */
    static class C1155c implements C1161i {
        C1155c() {
        }

        /* renamed from: a */
        public C1167o mo5544a(ViewDataBinding viewDataBinding, int i) {
            return new C1168p(viewDataBinding, i).getListener();
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$d */
    static class C1156d implements C1161i {
        C1156d() {
        }

        /* renamed from: a */
        public C1167o mo5544a(ViewDataBinding viewDataBinding, int i) {
            return new C1163k(viewDataBinding, i).getListener();
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$e */
    static class C1157e extends C1270a<C1175b0, ViewDataBinding, Void> {
        C1157e() {
        }

        /* renamed from: a */
        public void mo5546a(C1175b0 b0Var, ViewDataBinding viewDataBinding, int i, Void voidR) {
            if (i != 1) {
                if (i == 2) {
                    b0Var.mo5584b(viewDataBinding);
                } else if (i == 3) {
                    b0Var.mo5583a(viewDataBinding);
                }
            } else if (!b0Var.mo5585c(viewDataBinding)) {
                viewDataBinding.f5033O = true;
            }
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$f */
    static class C1158f implements OnAttachStateChangeListener {
        C1158f() {
        }

        @TargetApi(19)
        public void onViewAttachedToWindow(View view) {
            ViewDataBinding.m6617b(view).f5046b.run();
            view.removeOnAttachStateChangeListener(this);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$g */
    class C1159g implements Runnable {
        C1159g() {
        }

        public void run() {
            synchronized (this) {
                ViewDataBinding.this.f5032N = false;
            }
            ViewDataBinding.m6632w();
            if (VERSION.SDK_INT < 19 || ViewDataBinding.this.f5035Q.isAttachedToWindow()) {
                ViewDataBinding.this.mo5535j();
                return;
            }
            ViewDataBinding.this.f5035Q.removeOnAttachStateChangeListener(ViewDataBinding.f5031o0);
            ViewDataBinding.this.f5035Q.addOnAttachStateChangeListener(ViewDataBinding.f5031o0);
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$h */
    class C1160h implements FrameCallback {
        C1160h() {
        }

        public void doFrame(long j) {
            ViewDataBinding.this.f5046b.run();
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$i */
    private interface C1161i {
        /* renamed from: a */
        C1167o mo5544a(ViewDataBinding viewDataBinding, int i);
    }

    /* renamed from: androidx.databinding.ViewDataBinding$j */
    protected static class C1162j {

        /* renamed from: a */
        public final String[][] f5050a;

        /* renamed from: b */
        public final int[][] f5051b;

        /* renamed from: c */
        public final int[][] f5052c;

        public C1162j(int i) {
            this.f5050a = new String[i][];
            this.f5051b = new int[i][];
            this.f5052c = new int[i][];
        }

        /* renamed from: a */
        public void mo5551a(int i, String[] strArr, int[] iArr, int[] iArr2) {
            this.f5050a[i] = strArr;
            this.f5051b[i] = iArr;
            this.f5052c[i] = iArr2;
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$k */
    private static class C1163k implements C1468o, C1164l<LiveData<?>> {

        /* renamed from: a */
        final C1167o<LiveData<?>> f5053a;

        /* renamed from: b */
        C1459i f5054b;

        public C1163k(ViewDataBinding viewDataBinding, int i) {
            this.f5053a = new C1167o<>(viewDataBinding, i, this);
        }

        /* renamed from: a */
        public void mo5553a(C1459i iVar) {
            LiveData liveData = (LiveData) this.f5053a.mo5570b();
            if (liveData != null) {
                if (this.f5054b != null) {
                    liveData.mo6482b((C1468o<? super T>) this);
                }
                if (iVar != null) {
                    liveData.mo6478a(iVar, this);
                }
            }
            this.f5054b = iVar;
        }

        public C1167o<LiveData<?>> getListener() {
            return this.f5053a;
        }

        /* renamed from: b */
        public void mo5556b(LiveData<?> liveData) {
            liveData.mo6482b((C1468o<? super T>) this);
        }

        /* renamed from: a */
        public void mo5557c(LiveData<?> liveData) {
            C1459i iVar = this.f5054b;
            if (iVar != null) {
                liveData.mo6478a(iVar, this);
            }
        }

        /* renamed from: a */
        public void mo5554a(@C0195i0 Object obj) {
            ViewDataBinding a = this.f5053a.mo5567a();
            if (a != null) {
                C1167o<LiveData<?>> oVar = this.f5053a;
                a.m6620b(oVar.f5058b, oVar.mo5570b(), 0);
            }
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$l */
    private interface C1164l<T> {
        /* renamed from: a */
        void mo5553a(C1459i iVar);

        /* renamed from: b */
        void mo5556b(T t);

        /* renamed from: c */
        void mo5557c(T t);

        C1167o<T> getListener();
    }

    /* renamed from: androidx.databinding.ViewDataBinding$m */
    protected static abstract class C1165m extends C1297a implements C1286o {

        /* renamed from: a */
        final int f5055a;

        public C1165m(int i) {
            this.f5055a = i;
        }

        /* renamed from: a */
        public void mo5559a(C1296v vVar, int i) {
            if (i == this.f5055a || i == 0) {
                mo5680a();
            }
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$n */
    private static class C1166n extends C1302a implements C1164l<C1301z> {

        /* renamed from: a */
        final C1167o<C1301z> f5056a;

        public C1166n(ViewDataBinding viewDataBinding, int i) {
            this.f5056a = new C1167o<>(viewDataBinding, i, this);
        }

        /* renamed from: a */
        public void mo5560a(C1301z zVar) {
            ViewDataBinding a = this.f5056a.mo5567a();
            if (a != null) {
                C1301z zVar2 = (C1301z) this.f5056a.mo5570b();
                if (zVar2 == zVar) {
                    a.m6620b(this.f5056a.f5058b, (Object) zVar2, 0);
                }
            }
        }

        /* renamed from: a */
        public void mo5553a(C1459i iVar) {
        }

        public C1167o<C1301z> getListener() {
            return this.f5056a;
        }

        /* renamed from: b */
        public void mo5557c(C1301z zVar) {
            zVar.mo5703b(this);
        }

        /* renamed from: c */
        public void mo5556b(C1301z zVar) {
            zVar.mo5698a(this);
        }

        /* renamed from: b */
        public void mo5564b(C1301z zVar, int i, int i2) {
            mo5560a(zVar);
        }

        /* renamed from: c */
        public void mo5566c(C1301z zVar, int i, int i2) {
            mo5560a(zVar);
        }

        /* renamed from: a */
        public void mo5561a(C1301z zVar, int i, int i2) {
            mo5560a(zVar);
        }

        /* renamed from: a */
        public void mo5562a(C1301z zVar, int i, int i2, int i3) {
            mo5560a(zVar);
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$o */
    private static class C1167o<T> extends WeakReference<ViewDataBinding> {

        /* renamed from: a */
        private final C1164l<T> f5057a;

        /* renamed from: b */
        protected final int f5058b;

        /* renamed from: c */
        private T f5059c;

        public C1167o(ViewDataBinding viewDataBinding, int i, C1164l<T> lVar) {
            super(viewDataBinding, ViewDataBinding.f5030n0);
            this.f5058b = i;
            this.f5057a = lVar;
        }

        /* renamed from: a */
        public void mo5568a(C1459i iVar) {
            this.f5057a.mo5553a(iVar);
        }

        /* renamed from: b */
        public T mo5570b() {
            return this.f5059c;
        }

        /* renamed from: c */
        public boolean mo5571c() {
            boolean z;
            T t = this.f5059c;
            if (t != null) {
                this.f5057a.mo5556b(t);
                z = true;
            } else {
                z = false;
            }
            this.f5059c = null;
            return z;
        }

        /* renamed from: a */
        public void mo5569a(T t) {
            mo5571c();
            this.f5059c = t;
            T t2 = this.f5059c;
            if (t2 != null) {
                this.f5057a.mo5557c(t2);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public ViewDataBinding mo5567a() {
            ViewDataBinding viewDataBinding = (ViewDataBinding) get();
            if (viewDataBinding == null) {
                mo5571c();
            }
            return viewDataBinding;
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$p */
    private static class C1168p extends C1172a implements C1164l<C1171a0> {

        /* renamed from: a */
        final C1167o<C1171a0> f5060a;

        public C1168p(ViewDataBinding viewDataBinding, int i) {
            this.f5060a = new C1167o<>(viewDataBinding, i, this);
        }

        /* renamed from: a */
        public void mo5557c(C1171a0 a0Var) {
            a0Var.mo5581a(this);
        }

        /* renamed from: a */
        public void mo5553a(C1459i iVar) {
        }

        public C1167o<C1171a0> getListener() {
            return this.f5060a;
        }

        /* renamed from: a */
        public void mo5573a(C1171a0 a0Var, Object obj) {
            ViewDataBinding a = this.f5060a.mo5567a();
            if (a != null && a0Var == this.f5060a.mo5570b()) {
                a.m6620b(this.f5060a.f5058b, (Object) a0Var, 0);
            }
        }

        /* renamed from: b */
        public void mo5556b(C1171a0 a0Var) {
            a0Var.mo5582b(this);
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$q */
    private static class C1169q extends C1297a implements C1164l<C1296v> {

        /* renamed from: a */
        final C1167o<C1296v> f5061a;

        public C1169q(ViewDataBinding viewDataBinding, int i) {
            this.f5061a = new C1167o<>(viewDataBinding, i, this);
        }

        /* renamed from: a */
        public void mo5557c(C1296v vVar) {
            vVar.mo5579a(this);
        }

        /* renamed from: a */
        public void mo5553a(C1459i iVar) {
        }

        public C1167o<C1296v> getListener() {
            return this.f5061a;
        }

        /* renamed from: a */
        public void mo5559a(C1296v vVar, int i) {
            ViewDataBinding a = this.f5061a.mo5567a();
            if (a != null && ((C1296v) this.f5061a.mo5570b()) == vVar) {
                a.m6620b(this.f5061a.f5058b, (Object) vVar, i);
            }
        }

        /* renamed from: b */
        public void mo5556b(C1296v vVar) {
            vVar.mo5580b(this);
        }
    }

    static {
        if (VERSION.SDK_INT < 19) {
            f5031o0 = null;
        } else {
            f5031o0 = new C1158f();
        }
    }

    protected ViewDataBinding(C1273l lVar, View view, int i) {
        this.f5046b = new C1159g();
        this.f5032N = false;
        this.f5033O = false;
        this.f5041W = lVar;
        this.f5034P = new C1167o[i];
        this.f5035Q = view;
        if (Looper.myLooper() == null) {
            throw new IllegalStateException("DataBinding must be created in view's UI Thread");
        } else if (f5024h0) {
            this.f5038T = Choreographer.getInstance();
            this.f5039U = new C1160h();
        } else {
            this.f5039U = null;
            this.f5040V = new Handler(Looper.myLooper());
        }
    }

    /* renamed from: d */
    protected static void m6626d(ViewDataBinding viewDataBinding) {
        viewDataBinding.mo39685u();
    }

    /* renamed from: u */
    private void mo39685u() {
        if (this.f5037S) {
            mo5541p();
        } else if (mo5539n()) {
            this.f5037S = true;
            this.f5033O = false;
            C1269i<C1175b0, ViewDataBinding, Void> iVar = this.f5036R;
            if (iVar != null) {
                iVar.mo5666a(this, 1, null);
                if (this.f5033O) {
                    this.f5036R.mo5666a(this, 2, null);
                }
            }
            if (!this.f5033O) {
                mo5534i();
                C1269i<C1175b0, ViewDataBinding, Void> iVar2 = this.f5036R;
                if (iVar2 != null) {
                    iVar2.mo5666a(this, 3, null);
                }
            }
            this.f5037S = false;
        }
    }

    /* renamed from: v */
    public static int m6631v() {
        return f5018b0;
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public static void m6632w() {
        while (true) {
            Reference poll = f5030n0.poll();
            if (poll == null) {
                return;
            }
            if (poll instanceof C1167o) {
                ((C1167o) poll).mo5571c();
            }
        }
    }

    /* renamed from: a */
    public abstract boolean mo5529a(int i, @C0195i0 Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo5530a(int i, Object obj, int i2);

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract void mo5534i();

    /* renamed from: j */
    public void mo5535j() {
        ViewDataBinding viewDataBinding = this.f5042X;
        if (viewDataBinding == null) {
            mo39685u();
        } else {
            viewDataBinding.mo5535j();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public void mo5536k() {
        mo5534i();
    }

    @C0195i0
    /* renamed from: l */
    public C1459i mo5537l() {
        return this.f5043Y;
    }

    @C0193h0
    /* renamed from: m */
    public View mo5538m() {
        return this.f5035Q;
    }

    /* renamed from: n */
    public abstract boolean mo5539n();

    /* renamed from: o */
    public abstract void mo5540o();

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002a, code lost:
        if (f5024h0 == false) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002c, code lost:
        r2.f5038T.postFrameCallback(r2.f5039U);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0034, code lost:
        r2.f5040V.post(r2.f5046b);
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo5541p() {
        /*
            r2 = this;
            androidx.databinding.ViewDataBinding r0 = r2.f5042X
            if (r0 == 0) goto L_0x0008
            r0.mo5541p()
            goto L_0x003b
        L_0x0008:
            androidx.lifecycle.i r0 = r2.f5043Y
            if (r0 == 0) goto L_0x001d
            androidx.lifecycle.Lifecycle r0 = r0.getLifecycle()
            androidx.lifecycle.Lifecycle$State r0 = r0.mo6471a()
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.STARTED
            boolean r0 = r0.isAtLeast(r1)
            if (r0 != 0) goto L_0x001d
            return
        L_0x001d:
            monitor-enter(r2)
            boolean r0 = r2.f5032N     // Catch:{ all -> 0x003c }
            if (r0 == 0) goto L_0x0024
            monitor-exit(r2)     // Catch:{ all -> 0x003c }
            return
        L_0x0024:
            r0 = 1
            r2.f5032N = r0     // Catch:{ all -> 0x003c }
            monitor-exit(r2)     // Catch:{ all -> 0x003c }
            boolean r0 = f5024h0
            if (r0 == 0) goto L_0x0034
            android.view.Choreographer r0 = r2.f5038T
            android.view.Choreographer$FrameCallback r1 = r2.f5039U
            r0.postFrameCallback(r1)
            goto L_0x003b
        L_0x0034:
            android.os.Handler r0 = r2.f5040V
            java.lang.Runnable r1 = r2.f5046b
            r0.post(r1)
        L_0x003b:
            return
        L_0x003c:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x003c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.databinding.ViewDataBinding.mo5541p():void");
    }

    /* renamed from: q */
    public void mo5542q() {
        C1167o[] oVarArr;
        for (C1167o oVar : this.f5034P) {
            if (oVar != null) {
                oVar.mo5571c();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo5533c(int i) {
        C1167o oVar = this.f5034P[i];
        if (oVar != null) {
            return oVar.mo5571c();
        }
        return false;
    }

    /* renamed from: b */
    private static C1273l m6618b(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof C1273l) {
            return (C1273l) obj;
        }
        throw new IllegalArgumentException("The provided bindingComponent parameter must be an instance of DataBindingComponent. See  https://issuetracker.google.com/issues/116541301 for details of why this parameter is not defined as DataBindingComponent");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo5519a(View view) {
        view.setTag(C1274R.C1275id.dataBinding, this);
    }

    /* renamed from: c */
    protected static Drawable m6624c(View view, int i) {
        if (VERSION.SDK_INT >= 21) {
            return view.getContext().getDrawable(i);
        }
        return view.getResources().getDrawable(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo5524a(View[] viewArr) {
        for (View tag : viewArr) {
            tag.setTag(C1274R.C1275id.dataBinding, this);
        }
    }

    @C0187e0
    /* renamed from: a */
    public void mo5522a(@C0195i0 C1459i iVar) {
        C1167o[] oVarArr;
        C1459i iVar2 = this.f5043Y;
        if (iVar2 != iVar) {
            if (iVar2 != null) {
                iVar2.getLifecycle().mo6473b(this.f5044Z);
            }
            this.f5043Y = iVar;
            if (iVar != null) {
                if (this.f5044Z == null) {
                    this.f5044Z = new OnStartListener(this, null);
                }
                iVar.getLifecycle().mo6472a(this.f5044Z);
            }
            for (C1167o oVar : this.f5034P) {
                if (oVar != null) {
                    oVar.mo5568a(iVar);
                }
            }
        }
    }

    /* renamed from: b */
    public void mo5532b(@C0193h0 C1175b0 b0Var) {
        C1269i<C1175b0, ViewDataBinding, Void> iVar = this.f5036R;
        if (iVar != null) {
            iVar.mo5669b(b0Var);
        }
    }

    /* renamed from: c */
    private static int m6623c(String str, int i) {
        int i2 = 0;
        while (i < str.length()) {
            i2 = (i2 * 10) + (str.charAt(i) - '0');
            i++;
        }
        return i2;
    }

    /* renamed from: b */
    static ViewDataBinding m6617b(View view) {
        if (view != null) {
            return (ViewDataBinding) view.getTag(C1274R.C1275id.dataBinding);
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m6620b(int i, Object obj, int i2) {
        if (!this.f5045a0 && mo5530a(i, obj, i2)) {
            mo5541p();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Object mo5531b(int i) {
        C1167o oVar = this.f5034P[i];
        if (oVar == null) {
            return null;
        }
        return oVar.mo5570b();
    }

    /* renamed from: b */
    private boolean m6621b(int i, Object obj, C1161i iVar) {
        if (obj == null) {
            return mo5533c(i);
        }
        C1167o oVar = this.f5034P[i];
        if (oVar == null) {
            mo5518a(i, obj, iVar);
            return true;
        } else if (oVar.mo5570b() == obj) {
            return false;
        } else {
            mo5533c(i);
            mo5518a(i, obj, iVar);
            return true;
        }
    }

    /* renamed from: a */
    public void mo5521a(@C0193h0 C1175b0 b0Var) {
        if (this.f5036R == null) {
            this.f5036R = new C1269i<>(f5029m0);
        }
        this.f5036R.mo5665a(b0Var);
    }

    protected ViewDataBinding(Object obj, View view, int i) {
        this(m6618b(obj), view, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo5526a(int i, C1296v vVar) {
        return m6621b(i, (Object) vVar, f5025i0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo5527a(int i, C1301z zVar) {
        return m6621b(i, (Object) zVar, f5026j0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo5525a(int i, C1171a0 a0Var) {
        return m6621b(i, (Object) a0Var, f5027k0);
    }

    /* renamed from: b */
    protected static int m6615b(String str, int i) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo5528a(int i, LiveData<?> liveData) {
        this.f5045a0 = true;
        try {
            return m6621b(i, (Object) liveData, f5028l0);
        } finally {
            this.f5045a0 = false;
        }
    }

    /* renamed from: b */
    protected static ColorStateList m6616b(View view, int i) {
        if (VERSION.SDK_INT >= 23) {
            return view.getContext().getColorStateList(i);
        }
        return view.getResources().getColorStateList(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo5523a(Class<?> cls) {
        if (this.f5041W == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Required DataBindingComponent is null in class ");
            sb.append(getClass().getSimpleName());
            sb.append(". A BindingAdapter in ");
            sb.append(cls.getCanonicalName());
            sb.append(" is not static and requires an object to use, retrieved from the DataBindingComponent. If you don't use an inflation method taking a DataBindingComponent, use DataBindingUtil.setDefaultComponent or make all BindingAdapter methods static.");
            throw new IllegalStateException(sb.toString());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo5518a(int i, Object obj, C1161i iVar) {
        if (obj != null) {
            C1167o oVar = this.f5034P[i];
            if (oVar == null) {
                oVar = iVar.mo5544a(this, i);
                this.f5034P[i] = oVar;
                C1459i iVar2 = this.f5043Y;
                if (iVar2 != null) {
                    oVar.mo5568a(iVar2);
                }
            }
            oVar.mo5569a(obj);
        }
    }

    /* renamed from: a */
    protected static ViewDataBinding m6577a(Object obj, View view, int i) {
        return C1284m.m6870a(m6618b(obj), view, i);
    }

    /* renamed from: a */
    protected static Object[] m6613a(C1273l lVar, View view, int i, C1162j jVar, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i];
        m6595a(lVar, view, objArr, jVar, sparseIntArray, true);
        return objArr;
    }

    /* renamed from: a */
    protected static boolean m6611a(String str, boolean z) {
        return str == null ? z : Boolean.parseBoolean(str);
    }

    /* renamed from: a */
    protected static byte m6555a(String str, byte b) {
        try {
            return Byte.parseByte(str);
        } catch (NumberFormatException unused) {
            return b;
        }
    }

    /* renamed from: a */
    protected static short m6585a(String str, short s) {
        try {
            return Short.parseShort(str);
        } catch (NumberFormatException unused) {
            return s;
        }
    }

    /* renamed from: a */
    protected static long m6574a(String str, long j) {
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j;
        }
    }

    /* renamed from: a */
    protected static float m6564a(String str, float f) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException unused) {
            return f;
        }
    }

    /* renamed from: a */
    protected static double m6561a(String str, double d) {
        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException unused) {
            return d;
        }
    }

    /* renamed from: a */
    protected static char m6558a(String str, char c) {
        return (str == null || str.isEmpty()) ? c : str.charAt(0);
    }

    /* renamed from: a */
    protected static int m6567a(View view, int i) {
        if (VERSION.SDK_INT >= 23) {
            return view.getContext().getColor(i);
        }
        return view.getResources().getColor(i);
    }

    /* renamed from: a */
    protected static <T> T m6583a(T[] tArr, int i) {
        if (tArr == null || i < 0 || i >= tArr.length) {
            return null;
        }
        return tArr[i];
    }

    /* renamed from: a */
    protected static <T> void m6604a(T[] tArr, int i, T t) {
        if (tArr != null && i >= 0 && i < tArr.length) {
            tArr[i] = t;
        }
    }

    /* renamed from: a */
    protected static boolean m6612a(boolean[] zArr, int i) {
        if (zArr == null || i < 0 || i >= zArr.length) {
            return false;
        }
        return zArr[i];
    }

    /* renamed from: a */
    protected static void m6606a(boolean[] zArr, int i, boolean z) {
        if (zArr != null && i >= 0 && i < zArr.length) {
            zArr[i] = z;
        }
    }

    /* renamed from: a */
    protected static byte m6556a(byte[] bArr, int i) {
        if (bArr == null || i < 0 || i >= bArr.length) {
            return 0;
        }
        return bArr[i];
    }

    /* renamed from: a */
    protected static void m6598a(byte[] bArr, int i, byte b) {
        if (bArr != null && i >= 0 && i < bArr.length) {
            bArr[i] = b;
        }
    }

    /* renamed from: a */
    protected static short m6586a(short[] sArr, int i) {
        if (sArr == null || i < 0 || i >= sArr.length) {
            return 0;
        }
        return sArr[i];
    }

    /* renamed from: a */
    protected static void m6605a(short[] sArr, int i, short s) {
        if (sArr != null && i >= 0 && i < sArr.length) {
            sArr[i] = s;
        }
    }

    /* renamed from: a */
    protected static char m6559a(char[] cArr, int i) {
        if (cArr == null || i < 0 || i >= cArr.length) {
            return 0;
        }
        return cArr[i];
    }

    /* renamed from: a */
    protected static void m6599a(char[] cArr, int i, char c) {
        if (cArr != null && i >= 0 && i < cArr.length) {
            cArr[i] = c;
        }
    }

    /* renamed from: a */
    protected static int m6571a(int[] iArr, int i) {
        if (iArr == null || i < 0 || i >= iArr.length) {
            return 0;
        }
        return iArr[i];
    }

    /* renamed from: a */
    protected static void m6602a(int[] iArr, int i, int i2) {
        if (iArr != null && i >= 0 && i < iArr.length) {
            iArr[i] = i2;
        }
    }

    /* renamed from: a */
    protected static long m6575a(long[] jArr, int i) {
        if (jArr == null || i < 0 || i >= jArr.length) {
            return 0;
        }
        return jArr[i];
    }

    /* renamed from: a */
    protected static void m6603a(long[] jArr, int i, long j) {
        if (jArr != null && i >= 0 && i < jArr.length) {
            jArr[i] = j;
        }
    }

    /* renamed from: a */
    protected static float m6565a(float[] fArr, int i) {
        if (fArr == null || i < 0 || i >= fArr.length) {
            return 0.0f;
        }
        return fArr[i];
    }

    /* renamed from: a */
    protected static void m6601a(float[] fArr, int i, float f) {
        if (fArr != null && i >= 0 && i < fArr.length) {
            fArr[i] = f;
        }
    }

    /* renamed from: a */
    protected static double m6562a(double[] dArr, int i) {
        if (dArr == null || i < 0 || i >= dArr.length) {
            return 0.0d;
        }
        return dArr[i];
    }

    /* renamed from: a */
    protected static void m6600a(double[] dArr, int i, double d) {
        if (dArr != null && i >= 0 && i < dArr.length) {
            dArr[i] = d;
        }
    }

    /* renamed from: a */
    protected static <T> T m6581a(List<T> list, int i) {
        if (list == null || i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    /* renamed from: a */
    protected static <T> void m6596a(List<T> list, int i, T t) {
        if (list != null && i >= 0 && i < list.size()) {
            list.set(i, t);
        }
    }

    /* renamed from: a */
    protected static <T> T m6579a(SparseArray<T> sparseArray, int i) {
        if (sparseArray == null || i < 0) {
            return null;
        }
        return sparseArray.get(i);
    }

    /* renamed from: a */
    protected static <T> void m6588a(SparseArray<T> sparseArray, int i, T t) {
        if (sparseArray != null && i >= 0 && i < sparseArray.size()) {
            sparseArray.put(i, t);
        }
    }

    @TargetApi(16)
    /* renamed from: a */
    protected static <T> T m6578a(LongSparseArray<T> longSparseArray, int i) {
        if (longSparseArray == null || i < 0) {
            return null;
        }
        return longSparseArray.get((long) i);
    }

    @TargetApi(16)
    /* renamed from: a */
    protected static <T> void m6587a(LongSparseArray<T> longSparseArray, int i, T t) {
        if (longSparseArray != null && i >= 0 && i < longSparseArray.size()) {
            longSparseArray.put((long) i, t);
        }
    }

    /* renamed from: a */
    protected static <T> T m6580a(C0642f<T> fVar, int i) {
        if (fVar == null || i < 0) {
            return null;
        }
        return fVar.mo3283c((long) i);
    }

    /* renamed from: a */
    protected static <T> void m6592a(C0642f<T> fVar, int i, T t) {
        if (fVar != null && i >= 0 && i < fVar.mo3287d()) {
            fVar.mo3284c((long) i, t);
        }
    }

    /* renamed from: a */
    protected static boolean m6607a(SparseBooleanArray sparseBooleanArray, int i) {
        if (sparseBooleanArray == null || i < 0) {
            return false;
        }
        return sparseBooleanArray.get(i);
    }

    /* renamed from: a */
    protected static void m6589a(SparseBooleanArray sparseBooleanArray, int i, boolean z) {
        if (sparseBooleanArray != null && i >= 0 && i < sparseBooleanArray.size()) {
            sparseBooleanArray.put(i, z);
        }
    }

    /* renamed from: a */
    protected static int m6566a(SparseIntArray sparseIntArray, int i) {
        if (sparseIntArray == null || i < 0) {
            return 0;
        }
        return sparseIntArray.get(i);
    }

    /* renamed from: a */
    protected static void m6590a(SparseIntArray sparseIntArray, int i, int i2) {
        if (sparseIntArray != null && i >= 0 && i < sparseIntArray.size()) {
            sparseIntArray.put(i, i2);
        }
    }

    @TargetApi(18)
    /* renamed from: a */
    protected static long m6572a(SparseLongArray sparseLongArray, int i) {
        if (sparseLongArray == null || i < 0) {
            return 0;
        }
        return sparseLongArray.get(i);
    }

    @TargetApi(18)
    /* renamed from: a */
    protected static void m6591a(SparseLongArray sparseLongArray, int i, long j) {
        if (sparseLongArray != null && i >= 0 && i < sparseLongArray.size()) {
            sparseLongArray.put(i, j);
        }
    }

    /* renamed from: a */
    protected static <K, T> T m6582a(Map<K, T> map, K k) {
        if (map == null) {
            return null;
        }
        return map.get(k);
    }

    /* renamed from: a */
    protected static <K, T> void m6597a(Map<K, T> map, K k, T t) {
        if (map != null) {
            map.put(k, t);
        }
    }

    /* renamed from: a */
    protected static void m6594a(ViewDataBinding viewDataBinding, C1286o oVar, C1165m mVar) {
        if (oVar != mVar) {
            if (oVar != null) {
                viewDataBinding.mo5580b((C1165m) oVar);
            }
            if (mVar != null) {
                viewDataBinding.mo5579a((C1297a) mVar);
            }
        }
    }

    /* renamed from: a */
    protected static int m6569a(Integer num) {
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* renamed from: a */
    protected static long m6573a(Long l) {
        if (l == null) {
            return 0;
        }
        return l.longValue();
    }

    /* renamed from: a */
    protected static short m6584a(Short sh) {
        if (sh == null) {
            return 0;
        }
        return sh.shortValue();
    }

    /* renamed from: a */
    protected static byte m6554a(Byte b) {
        if (b == null) {
            return 0;
        }
        return b.byteValue();
    }

    /* renamed from: a */
    protected static char m6557a(Character ch) {
        if (ch == null) {
            return 0;
        }
        return ch.charValue();
    }

    /* renamed from: a */
    protected static double m6560a(Double d) {
        if (d == null) {
            return 0.0d;
        }
        return d.doubleValue();
    }

    /* renamed from: a */
    protected static float m6563a(Float f) {
        if (f == null) {
            return 0.0f;
        }
        return f.floatValue();
    }

    /* renamed from: a */
    protected static boolean m6609a(Boolean bool) {
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo5520a(ViewDataBinding viewDataBinding) {
        if (viewDataBinding != null) {
            viewDataBinding.f5042X = this;
        }
    }

    /* renamed from: a */
    protected static Object[] m6614a(C1273l lVar, View[] viewArr, int i, C1162j jVar, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i];
        for (View a : viewArr) {
            m6595a(lVar, a, objArr, jVar, sparseIntArray, true);
        }
        return objArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:68:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x010e A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m6595a(androidx.databinding.C1273l r16, android.view.View r17, java.lang.Object[] r18, androidx.databinding.ViewDataBinding.C1162j r19, android.util.SparseIntArray r20, boolean r21) {
        /*
            r6 = r16
            r0 = r17
            r7 = r19
            r8 = r20
            androidx.databinding.ViewDataBinding r1 = m6617b(r17)
            if (r1 == 0) goto L_0x000f
            return
        L_0x000f:
            java.lang.Object r1 = r17.getTag()
            boolean r2 = r1 instanceof java.lang.String
            if (r2 == 0) goto L_0x001a
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x001b
        L_0x001a:
            r1 = 0
        L_0x001b:
            java.lang.String r9 = "layout"
            r2 = -1
            r11 = 1
            if (r21 == 0) goto L_0x004c
            if (r1 == 0) goto L_0x004c
            boolean r3 = r1.startsWith(r9)
            if (r3 == 0) goto L_0x004c
            r3 = 95
            int r3 = r1.lastIndexOf(r3)
            if (r3 <= 0) goto L_0x0048
            int r3 = r3 + r11
            boolean r4 = m6610a(r1, r3)
            if (r4 == 0) goto L_0x0048
            int r1 = m6623c(r1, r3)
            r3 = r18[r1]
            if (r3 != 0) goto L_0x0042
            r18[r1] = r0
        L_0x0042:
            if (r7 != 0) goto L_0x0045
            r1 = -1
        L_0x0045:
            r3 = r1
            r1 = 1
            goto L_0x004a
        L_0x0048:
            r1 = 0
            r3 = -1
        L_0x004a:
            r12 = r3
            goto L_0x006a
        L_0x004c:
            if (r1 == 0) goto L_0x0068
            java.lang.String r3 = "binding_"
            boolean r3 = r1.startsWith(r3)
            if (r3 == 0) goto L_0x0068
            int r3 = f5023g0
            int r1 = m6623c(r1, r3)
            r3 = r18[r1]
            if (r3 != 0) goto L_0x0062
            r18[r1] = r0
        L_0x0062:
            if (r7 != 0) goto L_0x0065
            r1 = -1
        L_0x0065:
            r12 = r1
            r1 = 1
            goto L_0x006a
        L_0x0068:
            r1 = 0
            r12 = -1
        L_0x006a:
            if (r1 != 0) goto L_0x0080
            int r1 = r17.getId()
            if (r1 <= 0) goto L_0x0080
            if (r8 == 0) goto L_0x0080
            int r1 = r8.get(r1, r2)
            if (r1 < 0) goto L_0x0080
            r2 = r18[r1]
            if (r2 != 0) goto L_0x0080
            r18[r1] = r0
        L_0x0080:
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto L_0x0116
            r13 = r0
            android.view.ViewGroup r13 = (android.view.ViewGroup) r13
            int r14 = r13.getChildCount()
            r0 = 0
            r1 = 0
        L_0x008d:
            if (r0 >= r14) goto L_0x0116
            android.view.View r2 = r13.getChildAt(r0)
            if (r12 < 0) goto L_0x00fc
            java.lang.Object r3 = r2.getTag()
            boolean r3 = r3 instanceof java.lang.String
            if (r3 == 0) goto L_0x00fc
            java.lang.Object r3 = r2.getTag()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "_0"
            boolean r4 = r3.endsWith(r4)
            if (r4 == 0) goto L_0x00fc
            boolean r4 = r3.startsWith(r9)
            if (r4 == 0) goto L_0x00fc
            r4 = 47
            int r4 = r3.indexOf(r4)
            if (r4 <= 0) goto L_0x00fc
            int r3 = m6570a(r3, r1, r7, r12)
            if (r3 < 0) goto L_0x00fc
            int r1 = r3 + 1
            int[][] r4 = r7.f5051b
            r4 = r4[r12]
            r4 = r4[r3]
            int[][] r5 = r7.f5052c
            r5 = r5[r12]
            r3 = r5[r3]
            int r5 = m6568a(r13, r0)
            if (r5 != r0) goto L_0x00dc
            androidx.databinding.ViewDataBinding r3 = androidx.databinding.C1284m.m6870a(r6, r2, r3)
            r18[r4] = r3
            r10 = r0
            r15 = r1
            goto L_0x00ff
        L_0x00dc:
            int r5 = r5 - r0
            int r5 = r5 + r11
            android.view.View[] r15 = new android.view.View[r5]
            r10 = 0
        L_0x00e1:
            if (r10 >= r5) goto L_0x00ef
            int r11 = r0 + r10
            android.view.View r11 = r13.getChildAt(r11)
            r15[r10] = r11
            int r10 = r10 + 1
            r11 = 1
            goto L_0x00e1
        L_0x00ef:
            androidx.databinding.ViewDataBinding r3 = androidx.databinding.C1284m.m6872a(r6, r15, r3)
            r18[r4] = r3
            int r5 = r5 + -1
            int r0 = r0 + r5
            r10 = r0
            r15 = r1
            r11 = 1
            goto L_0x00ff
        L_0x00fc:
            r10 = r0
            r15 = r1
            r11 = 0
        L_0x00ff:
            if (r11 != 0) goto L_0x010e
            r5 = 0
            r0 = r16
            r1 = r2
            r2 = r18
            r3 = r19
            r4 = r20
            m6595a(r0, r1, r2, r3, r4, r5)
        L_0x010e:
            r0 = 1
            int r1 = r10 + 1
            r0 = r1
            r1 = r15
            r11 = 1
            goto L_0x008d
        L_0x0116:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.databinding.ViewDataBinding.m6595a(androidx.databinding.l, android.view.View, java.lang.Object[], androidx.databinding.ViewDataBinding$j, android.util.SparseIntArray, boolean):void");
    }

    /* renamed from: a */
    private static int m6570a(String str, int i, C1162j jVar, int i2) {
        CharSequence subSequence = str.subSequence(str.indexOf(47) + 1, str.length() - 2);
        String[] strArr = jVar.f5050a[i2];
        int length = strArr.length;
        while (i < length) {
            if (TextUtils.equals(subSequence, strArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: a */
    private static int m6568a(ViewGroup viewGroup, int i) {
        String str = (String) viewGroup.getChildAt(i).getTag();
        String substring = str.substring(0, str.length() - 1);
        int length = substring.length();
        int childCount = viewGroup.getChildCount();
        for (int i2 = i + 1; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            String str2 = childAt.getTag() instanceof String ? (String) childAt.getTag() : null;
            if (str2 != null && str2.startsWith(substring)) {
                if (str2.length() == str.length() && str2.charAt(str2.length() - 1) == '0') {
                    return i;
                }
                if (m6610a(str2, length)) {
                    i = i2;
                }
            }
        }
        return i;
    }

    /* renamed from: a */
    private static boolean m6610a(String str, int i) {
        int length = str.length();
        if (length == i) {
            return false;
        }
        while (i < length) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
            i++;
        }
        return true;
    }

    @C0207n0({C0208a.LIBRARY_GROUP})
    /* renamed from: a */
    protected static <T extends ViewDataBinding> T m6576a(@C0193h0 LayoutInflater layoutInflater, int i, @C0195i0 ViewGroup viewGroup, boolean z, @C0195i0 Object obj) {
        return C1284m.m6867a(layoutInflater, i, viewGroup, z, m6618b(obj));
    }
}
