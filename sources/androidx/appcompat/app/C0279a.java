package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.SpinnerAdapter;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.C0213q;
import androidx.annotation.C0214q0;
import androidx.appcompat.C0238R;
import androidx.appcompat.p011d.C0338b;
import androidx.appcompat.p011d.C0338b.C0339a;
import androidx.fragment.app.C1406n;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: androidx.appcompat.app.a */
/* compiled from: ActionBar */
public abstract class C0279a {
    @Deprecated

    /* renamed from: a */
    public static final int f858a = 0;
    @Deprecated

    /* renamed from: b */
    public static final int f859b = 1;
    @Deprecated

    /* renamed from: c */
    public static final int f860c = 2;

    /* renamed from: d */
    public static final int f861d = 1;

    /* renamed from: e */
    public static final int f862e = 2;

    /* renamed from: f */
    public static final int f863f = 4;

    /* renamed from: g */
    public static final int f864g = 8;

    /* renamed from: h */
    public static final int f865h = 16;

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.appcompat.app.a$a */
    /* compiled from: ActionBar */
    public @interface C0280a {
    }

    /* renamed from: androidx.appcompat.app.a$b */
    /* compiled from: ActionBar */
    public static class C0281b extends MarginLayoutParams {

        /* renamed from: a */
        public int f866a;

        public C0281b(@C0193h0 Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f866a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0238R.styleable.ActionBarLayout);
            this.f866a = obtainStyledAttributes.getInt(C0238R.styleable.ActionBarLayout_android_layout_gravity, 0);
            obtainStyledAttributes.recycle();
        }

        public C0281b(int i, int i2) {
            super(i, i2);
            this.f866a = 0;
            this.f866a = 8388627;
        }

        public C0281b(int i, int i2, int i3) {
            super(i, i2);
            this.f866a = 0;
            this.f866a = i3;
        }

        public C0281b(int i) {
            this(-2, -1, i);
        }

        public C0281b(C0281b bVar) {
            super(bVar);
            this.f866a = 0;
            this.f866a = bVar.f866a;
        }

        public C0281b(LayoutParams layoutParams) {
            super(layoutParams);
            this.f866a = 0;
        }
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.appcompat.app.a$c */
    /* compiled from: ActionBar */
    public @interface C0282c {
    }

    /* renamed from: androidx.appcompat.app.a$d */
    /* compiled from: ActionBar */
    public interface C0283d {
        /* renamed from: a */
        void mo992a(boolean z);
    }

    @Deprecated
    /* renamed from: androidx.appcompat.app.a$e */
    /* compiled from: ActionBar */
    public interface C0284e {
        /* renamed from: a */
        boolean mo993a(int i, long j);
    }

    @Deprecated
    /* renamed from: androidx.appcompat.app.a$f */
    /* compiled from: ActionBar */
    public static abstract class C0285f {

        /* renamed from: a */
        public static final int f867a = -1;

        /* renamed from: a */
        public abstract C0285f mo994a(@C0214q0 int i);

        /* renamed from: a */
        public abstract C0285f mo995a(Drawable drawable);

        /* renamed from: a */
        public abstract C0285f mo996a(View view);

        /* renamed from: a */
        public abstract C0285f mo997a(C0286g gVar);

        /* renamed from: a */
        public abstract C0285f mo998a(CharSequence charSequence);

        /* renamed from: a */
        public abstract C0285f mo999a(Object obj);

        /* renamed from: a */
        public abstract CharSequence mo1000a();

        /* renamed from: b */
        public abstract View mo1001b();

        /* renamed from: b */
        public abstract C0285f mo1002b(int i);

        /* renamed from: b */
        public abstract C0285f mo1003b(CharSequence charSequence);

        /* renamed from: c */
        public abstract Drawable mo1004c();

        /* renamed from: c */
        public abstract C0285f mo1005c(@C0213q int i);

        /* renamed from: d */
        public abstract int mo1006d();

        /* renamed from: d */
        public abstract C0285f mo1007d(int i);

        /* renamed from: e */
        public abstract Object mo1008e();

        /* renamed from: f */
        public abstract CharSequence mo1009f();

        /* renamed from: g */
        public abstract void mo1010g();
    }

    @Deprecated
    /* renamed from: androidx.appcompat.app.a$g */
    /* compiled from: ActionBar */
    public interface C0286g {
        /* renamed from: a */
        void mo1011a(C0285f fVar, C1406n nVar);

        /* renamed from: b */
        void mo1012b(C0285f fVar, C1406n nVar);

        /* renamed from: c */
        void mo1013c(C0285f fVar, C1406n nVar);
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: A */
    public boolean mo916A() {
        return false;
    }

    @Deprecated
    /* renamed from: B */
    public abstract void mo917B();

    /* access modifiers changed from: 0000 */
    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: C */
    public boolean mo918C() {
        return false;
    }

    /* renamed from: D */
    public abstract void mo919D();

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: a */
    public C0338b mo920a(C0339a aVar) {
        return null;
    }

    /* renamed from: a */
    public void mo921a(float f) {
        if (f != 0.0f) {
            throw new UnsupportedOperationException("Setting a non-zero elevation is not supported in this action bar configuration.");
        }
    }

    /* renamed from: a */
    public abstract void mo922a(int i, int i2);

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: a */
    public void mo923a(Configuration configuration) {
    }

    /* renamed from: a */
    public abstract void mo924a(@C0195i0 Drawable drawable);

    /* renamed from: a */
    public abstract void mo925a(View view);

    /* renamed from: a */
    public abstract void mo926a(View view, C0281b bVar);

    @Deprecated
    /* renamed from: a */
    public abstract void mo927a(SpinnerAdapter spinnerAdapter, C0284e eVar);

    /* renamed from: a */
    public abstract void mo928a(C0283d dVar);

    @Deprecated
    /* renamed from: a */
    public abstract void mo929a(C0285f fVar);

    @Deprecated
    /* renamed from: a */
    public abstract void mo930a(C0285f fVar, int i);

    @Deprecated
    /* renamed from: a */
    public abstract void mo931a(C0285f fVar, int i, boolean z);

    @Deprecated
    /* renamed from: a */
    public abstract void mo932a(C0285f fVar, boolean z);

    /* renamed from: a */
    public void mo933a(@C0195i0 CharSequence charSequence) {
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: a */
    public boolean mo934a(int i, KeyEvent keyEvent) {
        return false;
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: a */
    public boolean mo935a(KeyEvent keyEvent) {
        return false;
    }

    @Deprecated
    /* renamed from: b */
    public abstract C0285f mo936b(int i);

    /* renamed from: b */
    public void mo937b(@C0195i0 Drawable drawable) {
    }

    /* renamed from: b */
    public abstract void mo938b(C0283d dVar);

    @Deprecated
    /* renamed from: b */
    public abstract void mo939b(C0285f fVar);

    /* renamed from: b */
    public abstract void mo940b(CharSequence charSequence);

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: b */
    public void mo941b(boolean z) {
    }

    @Deprecated
    /* renamed from: c */
    public abstract void mo942c(int i);

    /* renamed from: c */
    public abstract void mo943c(Drawable drawable);

    @Deprecated
    /* renamed from: c */
    public abstract void mo944c(C0285f fVar);

    /* renamed from: c */
    public abstract void mo945c(CharSequence charSequence);

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: c */
    public void mo946c(boolean z) {
    }

    /* renamed from: d */
    public abstract void mo947d(int i);

    /* renamed from: d */
    public abstract void mo948d(Drawable drawable);

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: d */
    public void mo949d(CharSequence charSequence) {
    }

    /* renamed from: d */
    public abstract void mo950d(boolean z);

    /* renamed from: e */
    public abstract void mo951e(int i);

    /* renamed from: e */
    public void mo952e(Drawable drawable) {
    }

    /* renamed from: e */
    public abstract void mo953e(boolean z);

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: e */
    public boolean mo954e() {
        return false;
    }

    /* renamed from: f */
    public void mo955f(int i) {
        if (i != 0) {
            throw new UnsupportedOperationException("Setting an explicit action bar hide offset is not supported in this action bar configuration.");
        }
    }

    /* renamed from: f */
    public void mo956f(Drawable drawable) {
    }

    /* renamed from: f */
    public abstract void mo957f(boolean z);

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: f */
    public boolean mo958f() {
        return false;
    }

    /* renamed from: g */
    public abstract View mo959g();

    /* renamed from: g */
    public void mo960g(@C0214q0 int i) {
    }

    /* renamed from: g */
    public abstract void mo961g(boolean z);

    /* renamed from: h */
    public abstract int mo962h();

    /* renamed from: h */
    public void mo963h(@C0213q int i) {
    }

    /* renamed from: h */
    public abstract void mo964h(boolean z);

    /* renamed from: i */
    public float mo965i() {
        return 0.0f;
    }

    /* renamed from: i */
    public abstract void mo966i(@C0213q int i);

    /* renamed from: i */
    public void mo967i(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("Hide on content scroll is not supported in this action bar configuration.");
        }
    }

    /* renamed from: j */
    public abstract int mo968j();

    /* renamed from: j */
    public abstract void mo969j(@C0213q int i);

    /* renamed from: j */
    public void mo970j(boolean z) {
    }

    /* renamed from: k */
    public int mo971k() {
        return 0;
    }

    @Deprecated
    /* renamed from: k */
    public abstract void mo972k(int i);

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: k */
    public void mo973k(boolean z) {
    }

    @Deprecated
    /* renamed from: l */
    public abstract int mo974l();

    @Deprecated
    /* renamed from: l */
    public abstract void mo975l(int i);

    @Deprecated
    /* renamed from: m */
    public abstract int mo976m();

    /* renamed from: m */
    public abstract void mo977m(int i);

    @Deprecated
    /* renamed from: n */
    public abstract int mo978n();

    /* renamed from: n */
    public abstract void mo979n(@C0214q0 int i);

    @Deprecated
    @C0195i0
    /* renamed from: o */
    public abstract C0285f mo980o();

    @C0195i0
    /* renamed from: p */
    public abstract CharSequence mo981p();

    @Deprecated
    /* renamed from: q */
    public abstract int mo982q();

    /* renamed from: r */
    public Context mo983r() {
        return null;
    }

    @C0195i0
    /* renamed from: s */
    public abstract CharSequence mo984s();

    /* renamed from: t */
    public abstract void mo985t();

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: u */
    public boolean mo986u() {
        return false;
    }

    /* renamed from: v */
    public boolean mo987v() {
        return false;
    }

    /* renamed from: w */
    public abstract boolean mo988w();

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: x */
    public boolean mo989x() {
        return false;
    }

    @Deprecated
    /* renamed from: y */
    public abstract C0285f mo990y();

    /* access modifiers changed from: 0000 */
    /* renamed from: z */
    public void mo991z() {
    }
}
