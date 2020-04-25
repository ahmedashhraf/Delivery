package com.instabug.featuresrequest.p373ui.custom;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.C0193h0;
import androidx.annotation.C0198k;
import androidx.annotation.C0213q;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0712c;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0716g;
import androidx.core.content.C0841b;
import androidx.core.p034l.C0962e0;
import androidx.core.p034l.C0990i0;
import androidx.core.p034l.C0996j0;
import androidx.core.p034l.C0998k0;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.behavior.SwipeDismissBehavior.C5626c;
import com.instabug.featuresrequest.C9525R;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import p053b.p065e.p066b.p067a.C2117b;
import p205i.p471b.p472a.p473a.p474c.C13938g;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

@SuppressFBWarnings({"RCN_REDUNDANT_NULLCHECK_OF_NONNULL_VALUE"})
/* renamed from: com.instabug.featuresrequest.ui.custom.c */
/* compiled from: InstaToast */
public final class C9640c {

    /* renamed from: g */
    public static final Interpolator f25553g = new C2117b();

    /* renamed from: h */
    private static final Handler f25554h = new Handler(Looper.getMainLooper(), new C9642b());

    /* renamed from: i */
    private static transient /* synthetic */ boolean[] f25555i;

    /* renamed from: a */
    private final ViewGroup f25556a;

    /* renamed from: b */
    private final Context f25557b;

    /* renamed from: c */
    private final SnackbarLayout f25558c;

    /* renamed from: d */
    private int f25559d;

    /* renamed from: e */
    private C9652k f25560e;

    /* renamed from: f */
    private final C9655b f25561f = new C9646f(this);

    /* renamed from: com.instabug.featuresrequest.ui.custom.c$a */
    /* compiled from: InstaToast */
    class C9641a implements AnimationListener {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f25562b;

        /* renamed from: a */
        final /* synthetic */ C9640c f25563a;

        C9641a(C9640c cVar) {
            boolean[] a = m45099a();
            this.f25563a = cVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45099a() {
            boolean[] zArr = f25562b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-6137008634818399733L, "com/instabug/featuresrequest/ui/custom/InstaToast$9", 8);
            f25562b = a;
            return a;
        }

        public void onAnimationEnd(Animation animation) {
            boolean[] a = m45099a();
            if (C9640c.m45079d(this.f25563a) == null) {
                a[1] = true;
            } else {
                a[2] = true;
                C9640c.m45079d(this.f25563a).mo34533a(this.f25563a);
                a[3] = true;
            }
            C9653d a2 = C9653d.m45124a();
            C9640c cVar = this.f25563a;
            a[4] = true;
            a2.mo34538b(C9640c.m45074a(cVar));
            a[5] = true;
        }

        public void onAnimationRepeat(Animation animation) {
            m45099a()[7] = true;
        }

        public void onAnimationStart(Animation animation) {
            m45099a()[6] = true;
        }
    }

    /* renamed from: com.instabug.featuresrequest.ui.custom.c$b */
    /* compiled from: InstaToast */
    static class C9642b implements Callback {

        /* renamed from: a */
        private static transient /* synthetic */ boolean[] f25564a;

        C9642b() {
            m45100a()[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45100a() {
            boolean[] zArr = f25564a;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(7929732541276330257L, "com/instabug/featuresrequest/ui/custom/InstaToast$1", 4);
            f25564a = a;
            return a;
        }

        public boolean handleMessage(Message message) {
            boolean[] a = m45100a();
            int i = message.what;
            if (i == 0) {
                ((C9640c) message.obj).mo34521e();
                a[1] = true;
                return true;
            } else if (i != 1) {
                a[3] = true;
                return false;
            } else {
                ((C9640c) message.obj).mo34519d(message.arg1);
                a[2] = true;
                return true;
            }
        }
    }

    /* renamed from: com.instabug.featuresrequest.ui.custom.c$c */
    /* compiled from: InstaToast */
    class C9643c extends C0998k0 {

        /* renamed from: c */
        private static transient /* synthetic */ boolean[] f25565c;

        /* renamed from: a */
        final /* synthetic */ int f25566a;

        /* renamed from: b */
        final /* synthetic */ C9640c f25567b;

        C9643c(C9640c cVar, int i) {
            boolean[] a = m45101a();
            this.f25567b = cVar;
            this.f25566a = i;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45101a() {
            boolean[] zArr = f25565c;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-2354762569308436173L, "com/instabug/featuresrequest/ui/custom/InstaToast$10", 3);
            f25565c = a;
            return a;
        }

        /* renamed from: b */
        public void mo865b(View view) {
            boolean[] a = m45101a();
            C9640c.m45077b(this.f25567b, this.f25566a);
            a[2] = true;
        }

        /* renamed from: c */
        public void mo866c(View view) {
            boolean[] a = m45101a();
            C9640c.m45078c(this.f25567b).mo34496b(0, 180);
            a[1] = true;
        }
    }

    /* renamed from: com.instabug.featuresrequest.ui.custom.c$d */
    /* compiled from: InstaToast */
    class C9644d implements AnimationListener {

        /* renamed from: N */
        private static transient /* synthetic */ boolean[] f25568N;

        /* renamed from: a */
        final /* synthetic */ int f25569a;

        /* renamed from: b */
        final /* synthetic */ C9640c f25570b;

        C9644d(C9640c cVar, int i) {
            boolean[] a = m45104a();
            this.f25570b = cVar;
            this.f25569a = i;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45104a() {
            boolean[] zArr = f25568N;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(9032597036387302493L, "com/instabug/featuresrequest/ui/custom/InstaToast$11", 4);
            f25568N = a;
            return a;
        }

        public void onAnimationEnd(Animation animation) {
            boolean[] a = m45104a();
            C9640c.m45077b(this.f25570b, this.f25569a);
            a[1] = true;
        }

        public void onAnimationRepeat(Animation animation) {
            m45104a()[3] = true;
        }

        public void onAnimationStart(Animation animation) {
            m45104a()[2] = true;
        }
    }

    /* renamed from: com.instabug.featuresrequest.ui.custom.c$e */
    /* compiled from: InstaToast */
    class C9645e implements OnTouchListener {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f25571b;

        /* renamed from: a */
        final /* synthetic */ C9640c f25572a;

        C9645e(C9640c cVar) {
            boolean[] a = m45105a();
            this.f25572a = cVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45105a() {
            boolean[] zArr = f25571b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(1338402761478035072L, "com/instabug/featuresrequest/ui/custom/InstaToast$3", 5);
            f25571b = a;
            return a;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            boolean[] a = m45105a();
            if (motionEvent.getAction() != 1) {
                a[1] = true;
            } else {
                a[2] = true;
                this.f25572a.mo34518c();
                a[3] = true;
            }
            a[4] = true;
            return false;
        }
    }

    /* renamed from: com.instabug.featuresrequest.ui.custom.c$f */
    /* compiled from: InstaToast */
    class C9646f implements C9655b {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f25573b;

        /* renamed from: a */
        final /* synthetic */ C9640c f25574a;

        C9646f(C9640c cVar) {
            boolean[] a = m45106a();
            this.f25574a = cVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45106a() {
            boolean[] zArr = f25573b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-12020761892458077L, "com/instabug/featuresrequest/ui/custom/InstaToast$4", 3);
            f25573b = a;
            return a;
        }

        /* renamed from: b */
        public void mo34530b(int i) {
            boolean[] a = m45106a();
            C9640c.m45081f().sendMessage(C9640c.m45081f().obtainMessage(1, i, 0, this.f25574a));
            a[2] = true;
        }

        /* renamed from: d */
        public void mo34531d() {
            boolean[] a = m45106a();
            C9640c.m45081f().sendMessage(C9640c.m45081f().obtainMessage(0, this.f25574a));
            a[1] = true;
        }
    }

    /* renamed from: com.instabug.featuresrequest.ui.custom.c$g */
    /* compiled from: InstaToast */
    class C9647g implements C5626c {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f25575b;

        /* renamed from: a */
        final /* synthetic */ C9640c f25576a;

        C9647g(C9640c cVar) {
            boolean[] a = m45109a();
            this.f25576a = cVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45109a() {
            boolean[] zArr = f25575b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(2845854770108798515L, "com/instabug/featuresrequest/ui/custom/InstaToast$5", 8);
            f25575b = a;
            return a;
        }

        /* renamed from: a */
        public void mo22299a(View view) {
            boolean[] a = m45109a();
            C9640c.m45075a(this.f25576a, 0);
            a[1] = true;
        }

        @SuppressFBWarnings({"SF_SWITCH_NO_DEFAULT"})
        /* renamed from: a */
        public void mo22298a(int i) {
            boolean[] a = m45109a();
            if (i == 0) {
                C9653d a2 = C9653d.m45124a();
                C9640c cVar = this.f25576a;
                a[5] = true;
                a2.mo34540d(C9640c.m45074a(cVar));
                a[6] = true;
            } else if (i == 1 || i == 2) {
                C9653d a3 = C9653d.m45124a();
                C9640c cVar2 = this.f25576a;
                a[3] = true;
                a3.mo34539c(C9640c.m45074a(cVar2));
                a[4] = true;
            } else {
                a[2] = true;
            }
            a[7] = true;
        }
    }

    /* renamed from: com.instabug.featuresrequest.ui.custom.c$h */
    /* compiled from: InstaToast */
    class C9648h implements C9636a {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f25577b;

        /* renamed from: a */
        final /* synthetic */ C9640c f25578a;

        /* renamed from: com.instabug.featuresrequest.ui.custom.c$h$a */
        /* compiled from: InstaToast */
        class C9649a implements Runnable {

            /* renamed from: b */
            private static transient /* synthetic */ boolean[] f25579b;

            /* renamed from: a */
            final /* synthetic */ C9648h f25580a;

            C9649a(C9648h hVar) {
                boolean[] a = m45115a();
                this.f25580a = hVar;
                a[0] = true;
            }

            /* renamed from: a */
            private static /* synthetic */ boolean[] m45115a() {
                boolean[] zArr = f25579b;
                if (zArr != null) {
                    return zArr;
                }
                boolean[] a = C13938g.m59885a(-2207483608964641686L, "com/instabug/featuresrequest/ui/custom/InstaToast$6$1", 2);
                f25579b = a;
                return a;
            }

            public void run() {
                boolean[] a = m45115a();
                C9640c.m45077b(this.f25580a.f25578a, 3);
                a[1] = true;
            }
        }

        C9648h(C9640c cVar) {
            boolean[] a = m45112a();
            this.f25578a = cVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45112a() {
            boolean[] zArr = f25577b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-2080155968320730847L, "com/instabug/featuresrequest/ui/custom/InstaToast$6", 6);
            f25577b = a;
            return a;
        }

        /* renamed from: a */
        public void mo34506a(View view) {
            boolean[] a = m45112a();
            if (!this.f25578a.mo34520d()) {
                a[2] = true;
            } else {
                a[3] = true;
                C9640c.m45081f().post(new C9649a(this));
                a[4] = true;
            }
            a[5] = true;
        }

        /* renamed from: b */
        public void mo34507b(View view) {
            m45112a()[1] = true;
        }
    }

    /* renamed from: com.instabug.featuresrequest.ui.custom.c$i */
    /* compiled from: InstaToast */
    class C9650i implements C9637b {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f25581b;

        /* renamed from: a */
        final /* synthetic */ C9640c f25582a;

        C9650i(C9640c cVar) {
            boolean[] a = m45116a();
            this.f25582a = cVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45116a() {
            boolean[] zArr = f25581b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-8439655807502595055L, "com/instabug/featuresrequest/ui/custom/InstaToast$7", 3);
            f25581b = a;
            return a;
        }

        /* renamed from: a */
        public void mo34508a(View view, int i, int i2, int i3, int i4) {
            boolean[] a = m45116a();
            C9640c.m45076b(this.f25582a);
            a[1] = true;
            C9640c.m45078c(this.f25582a).setOnLayoutChangeListener(null);
            a[2] = true;
        }
    }

    /* renamed from: com.instabug.featuresrequest.ui.custom.c$j */
    /* compiled from: InstaToast */
    class C9651j extends C0998k0 {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f25583b;

        /* renamed from: a */
        final /* synthetic */ C9640c f25584a;

        C9651j(C9640c cVar) {
            boolean[] a = m45118a();
            this.f25584a = cVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45118a() {
            boolean[] zArr = f25583b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-5542094519304263757L, "com/instabug/featuresrequest/ui/custom/InstaToast$8", 7);
            f25583b = a;
            return a;
        }

        /* renamed from: b */
        public void mo865b(View view) {
            boolean[] a = m45118a();
            if (C9640c.m45079d(this.f25584a) == null) {
                a[2] = true;
            } else {
                a[3] = true;
                C9640c.m45079d(this.f25584a).mo34533a(this.f25584a);
                a[4] = true;
            }
            C9653d a2 = C9653d.m45124a();
            C9640c cVar = this.f25584a;
            a[5] = true;
            a2.mo34538b(C9640c.m45074a(cVar));
            a[6] = true;
        }

        /* renamed from: c */
        public void mo866c(View view) {
            boolean[] a = m45118a();
            C9640c.m45078c(this.f25584a).mo34495a(70, 180);
            a[1] = true;
        }
    }

    /* renamed from: com.instabug.featuresrequest.ui.custom.c$k */
    /* compiled from: InstaToast */
    public static abstract class C9652k {

        /* renamed from: a */
        private static transient /* synthetic */ boolean[] f25585a;

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45121a() {
            boolean[] zArr = f25585a;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(8453508659451157822L, "com/instabug/featuresrequest/ui/custom/InstaToast$Callback", 3);
            f25585a = a;
            return a;
        }

        /* renamed from: a */
        public void mo34534a(C9640c cVar, int i) {
            m45121a()[1] = true;
        }

        /* renamed from: a */
        public void mo34533a(C9640c cVar) {
            m45121a()[2] = true;
        }
    }

    static {
        boolean[] i = m45086i();
        i[164] = true;
        i[165] = true;
    }

    private C9640c(ViewGroup viewGroup) {
        boolean[] i = m45086i();
        i[0] = true;
        this.f25556a = viewGroup;
        i[1] = true;
        this.f25557b = viewGroup.getContext();
        i[2] = true;
        LayoutInflater from = LayoutInflater.from(this.f25557b);
        i[3] = true;
        this.f25558c = (SnackbarLayout) from.inflate(C9525R.layout.ib_fr_insta_toast_layout, this.f25556a, false);
        i[4] = true;
    }

    /* renamed from: a */
    static /* synthetic */ C9655b m45074a(C9640c cVar) {
        boolean[] i = m45086i();
        C9655b bVar = cVar.f25561f;
        i[159] = true;
        return bVar;
    }

    /* renamed from: b */
    static /* synthetic */ void m45076b(C9640c cVar) {
        boolean[] i = m45086i();
        cVar.m45083g();
        i[161] = true;
    }

    /* renamed from: c */
    static /* synthetic */ SnackbarLayout m45078c(C9640c cVar) {
        boolean[] i = m45086i();
        SnackbarLayout snackbarLayout = cVar.f25558c;
        i[162] = true;
        return snackbarLayout;
    }

    /* renamed from: d */
    static /* synthetic */ C9652k m45079d(C9640c cVar) {
        boolean[] i = m45086i();
        C9652k kVar = cVar.f25560e;
        i[163] = true;
        return kVar;
    }

    /* renamed from: e */
    private void m45080e(int i) {
        boolean[] i2 = m45086i();
        C9653d a = C9653d.m45124a();
        C9655b bVar = this.f25561f;
        i2[86] = true;
        a.mo34537a(bVar, i);
        i2[87] = true;
    }

    /* renamed from: f */
    static /* synthetic */ Handler m45081f() {
        boolean[] i = m45086i();
        Handler handler = f25554h;
        i[158] = true;
        return handler;
    }

    /* renamed from: g */
    private void m45083g() {
        boolean[] i = m45086i();
        if (VERSION.SDK_INT >= 14) {
            i[109] = true;
            SnackbarLayout snackbarLayout = this.f25558c;
            C0962e0.m5526k((View) snackbarLayout, (float) (-snackbarLayout.getHeight()));
            i[110] = true;
            C0990i0 a = C0962e0.m5428a(this.f25558c);
            i[111] = true;
            C0990i0 o = a.mo4851o(0.0f);
            Interpolator interpolator = f25553g;
            i[112] = true;
            C0990i0 a2 = o.mo4826a(interpolator);
            i[113] = true;
            C0990i0 a3 = a2.mo4825a(250);
            C9651j jVar = new C9651j(this);
            i[114] = true;
            C0990i0 a4 = a3.mo4827a((C0996j0) jVar);
            i[115] = true;
            a4.mo4840e();
            i[116] = true;
        } else {
            Animation loadAnimation = AnimationUtils.loadAnimation(this.f25558c.getContext(), C9525R.anim.ib_fr_top_in);
            i[117] = true;
            loadAnimation.setInterpolator(f25553g);
            i[118] = true;
            loadAnimation.setDuration(250);
            i[119] = true;
            loadAnimation.setAnimationListener(new C9641a(this));
            i[120] = true;
            this.f25558c.startAnimation(loadAnimation);
            i[121] = true;
        }
        i[122] = true;
    }

    /* renamed from: h */
    private boolean m45085h() {
        boolean[] i = m45086i();
        LayoutParams layoutParams = this.f25558c.getLayoutParams();
        boolean z = false;
        if (!(layoutParams instanceof C0716g)) {
            i[149] = true;
        } else {
            C0716g gVar = (C0716g) layoutParams;
            i[150] = true;
            C0712c d = gVar.mo4027d();
            if (!(d instanceof SwipeDismissBehavior)) {
                i[151] = true;
            } else {
                i[152] = true;
                if (((SwipeDismissBehavior) d).mo22292b() != 0) {
                    i[153] = true;
                    z = true;
                } else {
                    i[154] = true;
                }
                i[155] = true;
                return z;
            }
        }
        i[156] = true;
        return false;
    }

    /* renamed from: i */
    private static /* synthetic */ boolean[] m45086i() {
        boolean[] zArr = f25555i;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-3406321485050689672L, "com/instabug/featuresrequest/ui/custom/InstaToast", C13959t.f40776C2);
        f25555i = a;
        return a;
    }

    /* renamed from: a */
    static /* synthetic */ void m45075a(C9640c cVar, int i) {
        boolean[] i2 = m45086i();
        cVar.m45080e(i);
        i2[157] = true;
    }

    /* renamed from: b */
    static /* synthetic */ void m45077b(C9640c cVar, int i) {
        boolean[] i2 = m45086i();
        cVar.m45084g(i);
        i2[160] = true;
    }

    /* renamed from: f */
    private void m45082f(int i) {
        boolean[] i2 = m45086i();
        if (VERSION.SDK_INT >= 14) {
            i2[123] = true;
            C0990i0 a = C0962e0.m5428a(this.f25558c);
            SnackbarLayout snackbarLayout = this.f25558c;
            i2[124] = true;
            C0990i0 o = a.mo4851o((float) (-snackbarLayout.getHeight()));
            Interpolator interpolator = f25553g;
            i2[125] = true;
            C0990i0 a2 = o.mo4826a(interpolator);
            i2[126] = true;
            C0990i0 a3 = a2.mo4825a(250);
            C9643c cVar = new C9643c(this, i);
            i2[127] = true;
            C0990i0 a4 = a3.mo4827a((C0996j0) cVar);
            i2[128] = true;
            a4.mo4840e();
            i2[129] = true;
        } else {
            Animation loadAnimation = AnimationUtils.loadAnimation(this.f25558c.getContext(), C9525R.anim.ib_fr_top_out);
            i2[130] = true;
            loadAnimation.setInterpolator(f25553g);
            i2[131] = true;
            loadAnimation.setDuration(250);
            i2[132] = true;
            loadAnimation.setAnimationListener(new C9644d(this, i));
            i2[133] = true;
            this.f25558c.startAnimation(loadAnimation);
            i2[134] = true;
        }
        i2[135] = true;
    }

    @C0193h0
    /* renamed from: c */
    public C9640c mo34517c(int i) {
        boolean[] i2 = m45086i();
        this.f25559d = i;
        i2[79] = true;
        return this;
    }

    /* renamed from: d */
    public boolean mo34520d() {
        boolean[] i = m45086i();
        C9653d a = C9653d.m45124a();
        C9655b bVar = this.f25561f;
        i[91] = true;
        boolean e = a.mo34541e(bVar);
        i[92] = true;
        return e;
    }

    @C0193h0
    /* renamed from: a */
    public static C9640c m45073a(View view, @C0193h0 CharSequence charSequence, int i) {
        boolean[] i2 = m45086i();
        C9640c cVar = new C9640c((ViewGroup) view);
        i2[5] = true;
        cVar.mo34513a(charSequence);
        i2[6] = true;
        cVar.mo34517c(i);
        i2[7] = true;
        return cVar;
    }

    /* renamed from: b */
    public C9640c mo34515b(@C0213q int i, float f) {
        boolean[] i2 = m45086i();
        TextView messageView = this.f25558c.getMessageView();
        i2[35] = true;
        Drawable c = C0841b.m4928c(this.f25557b, i);
        if (c != null) {
            i2[36] = true;
            Drawable a = m45072a(c, (int) m45069a(f, this.f25557b));
            Drawable[] compoundDrawables = messageView.getCompoundDrawables();
            i2[38] = true;
            messageView.setCompoundDrawables(compoundDrawables[0], compoundDrawables[1], a, compoundDrawables[3]);
            i2[39] = true;
            return this;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("resource_id is not a valid drawable!");
        i2[37] = true;
        throw illegalArgumentException;
    }

    /* renamed from: c */
    public void mo34518c() {
        boolean[] i = m45086i();
        m45080e(3);
        i[85] = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final void mo34521e() {
        boolean[] i = m45086i();
        if (this.f25558c.getParent() != null) {
            i[93] = true;
        } else {
            i[94] = true;
            LayoutParams layoutParams = this.f25558c.getLayoutParams();
            if (!(layoutParams instanceof C0716g)) {
                i[95] = true;
            } else {
                i[96] = true;
                C9638a aVar = new C9638a(this.f25561f);
                i[97] = true;
                aVar.mo22297d(0.1f);
                i[98] = true;
                aVar.mo22293b(0.6f);
                i[99] = true;
                aVar.mo22290a(0);
                i[100] = true;
                aVar.mo22291a((C5626c) new C9647g(this));
                i[101] = true;
                ((C0716g) layoutParams).mo4017a((C0712c) aVar);
                i[102] = true;
            }
            this.f25556a.addView(this.f25558c);
            i[103] = true;
        }
        this.f25558c.setOnAttachStateChangeListener(new C9648h(this));
        i[104] = true;
        if (C0962e0.m5540n0(this.f25558c)) {
            i[105] = true;
            m45083g();
            i[106] = true;
        } else {
            this.f25558c.setOnLayoutChangeListener(new C9650i(this));
            i[107] = true;
        }
        i[108] = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo34519d(int i) {
        boolean[] i2 = m45086i();
        if (this.f25558c.getVisibility() != 0) {
            i2[136] = true;
        } else if (m45085h()) {
            i2[137] = true;
        } else {
            m45082f(i);
            i2[139] = true;
            i2[140] = true;
        }
        m45084g(i);
        i2[138] = true;
        i2[140] = true;
    }

    /* renamed from: a */
    public C9640c mo34512a(@C0213q int i, float f) {
        boolean[] i2 = m45086i();
        TextView messageView = this.f25558c.getMessageView();
        i2[30] = true;
        Drawable c = C0841b.m4928c(this.f25557b, i);
        if (c != null) {
            i2[31] = true;
            Drawable a = m45072a(c, (int) m45069a(f, this.f25557b));
            Drawable[] compoundDrawables = messageView.getCompoundDrawables();
            i2[33] = true;
            messageView.setCompoundDrawables(a, compoundDrawables[1], compoundDrawables[2], compoundDrawables[3]);
            i2[34] = true;
            return this;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("resource_id is not a valid drawable!");
        i2[32] = true;
        throw illegalArgumentException;
    }

    @C0193h0
    /* renamed from: b */
    public C9640c mo34514b(@C0198k int i) {
        boolean[] i2 = m45086i();
        Button actionView = this.f25558c.getActionView();
        i2[74] = true;
        actionView.setTextColor(i);
        i2[75] = true;
        return this;
    }

    /* renamed from: b */
    public void mo34516b() {
        boolean[] i = m45086i();
        C9653d a = C9653d.m45124a();
        int i2 = this.f25559d;
        C9655b bVar = this.f25561f;
        i[82] = true;
        a.mo34535a(i2, bVar);
        i[83] = true;
        mo34510a().setOnTouchListener(new C9645e(this));
        i[84] = true;
    }

    /* renamed from: g */
    private void m45084g(int i) {
        boolean[] i2 = m45086i();
        C9653d a = C9653d.m45124a();
        C9655b bVar = this.f25561f;
        i2[141] = true;
        a.mo34536a(bVar);
        C9652k kVar = this.f25560e;
        if (kVar == null) {
            i2[142] = true;
        } else {
            i2[143] = true;
            kVar.mo34534a(this, i);
            i2[144] = true;
        }
        ViewParent parent = this.f25558c.getParent();
        if (!(parent instanceof ViewGroup)) {
            i2[145] = true;
        } else {
            i2[146] = true;
            ((ViewGroup) parent).removeView(this.f25558c);
            i2[147] = true;
        }
        i2[148] = true;
    }

    /* renamed from: a */
    public C9640c mo34511a(int i) {
        boolean[] i2 = m45086i();
        this.f25558c.f25542N = i;
        i2[40] = true;
        return this;
    }

    /* renamed from: a */
    private Drawable m45072a(Drawable drawable, int i) {
        boolean[] i2 = m45086i();
        if (drawable.getIntrinsicWidth() != i) {
            i2[41] = true;
        } else if (drawable.getIntrinsicHeight() == i) {
            i2[42] = true;
            drawable.setBounds(0, 0, i, i);
            i2[48] = true;
            return drawable;
        } else {
            i2[43] = true;
        }
        if (!(drawable instanceof BitmapDrawable)) {
            i2[44] = true;
        } else {
            i2[45] = true;
            Resources resources = this.f25557b.getResources();
            i2[46] = true;
            Drawable bitmapDrawable = new BitmapDrawable(resources, Bitmap.createScaledBitmap(m45070a(drawable), i, i, true));
            i2[47] = true;
            drawable = bitmapDrawable;
        }
        drawable.setBounds(0, 0, i, i);
        i2[48] = true;
        return drawable;
    }

    /* renamed from: a */
    public static float m45069a(float f, Context context) {
        boolean[] i = m45086i();
        Resources resources = context.getResources();
        i[49] = true;
        float f2 = f * (((float) resources.getDisplayMetrics().densityDpi) / 160.0f);
        i[50] = true;
        return f2;
    }

    @TargetApi(21)
    /* renamed from: a */
    private static Bitmap m45071a(VectorDrawable vectorDrawable) {
        boolean[] i = m45086i();
        int intrinsicWidth = vectorDrawable.getIntrinsicWidth();
        i[51] = true;
        int intrinsicHeight = vectorDrawable.getIntrinsicHeight();
        Config config = Config.ARGB_8888;
        i[52] = true;
        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, config);
        i[53] = true;
        Canvas canvas = new Canvas(createBitmap);
        i[54] = true;
        vectorDrawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        i[55] = true;
        vectorDrawable.draw(canvas);
        i[56] = true;
        return createBitmap;
    }

    /* renamed from: a */
    private static Bitmap m45070a(Drawable drawable) {
        boolean[] i = m45086i();
        if (drawable instanceof BitmapDrawable) {
            i[57] = true;
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            i[58] = true;
            return bitmap;
        } else if (drawable instanceof VectorDrawable) {
            i[59] = true;
            Bitmap a = m45071a((VectorDrawable) drawable);
            i[60] = true;
            return a;
        } else {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("unsupported drawable type");
            i[61] = true;
            throw illegalArgumentException;
        }
    }

    @C0193h0
    /* renamed from: a */
    public C9640c mo34513a(@C0193h0 CharSequence charSequence) {
        boolean[] i = m45086i();
        TextView messageView = this.f25558c.getMessageView();
        i[76] = true;
        messageView.setText(charSequence);
        i[77] = true;
        return this;
    }

    @C0193h0
    /* renamed from: a */
    public View mo34510a() {
        boolean[] i = m45086i();
        SnackbarLayout snackbarLayout = this.f25558c;
        i[81] = true;
        return snackbarLayout;
    }
}
