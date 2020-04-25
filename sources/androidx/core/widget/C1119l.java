package androidx.core.widget;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.OverScroller;

@Deprecated
/* renamed from: androidx.core.widget.l */
/* compiled from: ScrollerCompat */
public final class C1119l {

    /* renamed from: a */
    OverScroller f4929a;

    C1119l(Context context, Interpolator interpolator) {
        OverScroller overScroller;
        if (interpolator != null) {
            overScroller = new OverScroller(context, interpolator);
        } else {
            overScroller = new OverScroller(context);
        }
        this.f4929a = overScroller;
    }

    @Deprecated
    /* renamed from: a */
    public static C1119l m6350a(Context context) {
        return m6351a(context, null);
    }

    @Deprecated
    /* renamed from: b */
    public boolean mo5377b() {
        return this.f4929a.computeScrollOffset();
    }

    @Deprecated
    /* renamed from: c */
    public float mo5378c() {
        return this.f4929a.getCurrVelocity();
    }

    @Deprecated
    /* renamed from: d */
    public int mo5379d() {
        return this.f4929a.getCurrX();
    }

    @Deprecated
    /* renamed from: e */
    public int mo5380e() {
        return this.f4929a.getCurrY();
    }

    @Deprecated
    /* renamed from: f */
    public int mo5381f() {
        return this.f4929a.getFinalX();
    }

    @Deprecated
    /* renamed from: g */
    public int mo5382g() {
        return this.f4929a.getFinalY();
    }

    @Deprecated
    /* renamed from: h */
    public boolean mo5383h() {
        return this.f4929a.isFinished();
    }

    @Deprecated
    /* renamed from: i */
    public boolean mo5384i() {
        return this.f4929a.isOverScrolled();
    }

    @Deprecated
    /* renamed from: a */
    public static C1119l m6351a(Context context, Interpolator interpolator) {
        return new C1119l(context, interpolator);
    }

    @Deprecated
    /* renamed from: b */
    public void mo5376b(int i, int i2, int i3) {
        this.f4929a.notifyVerticalEdgeReached(i, i2, i3);
    }

    @Deprecated
    /* renamed from: a */
    public void mo5371a(int i, int i2, int i3, int i4) {
        this.f4929a.startScroll(i, i2, i3, i4);
    }

    @Deprecated
    /* renamed from: a */
    public void mo5372a(int i, int i2, int i3, int i4, int i5) {
        this.f4929a.startScroll(i, i2, i3, i4, i5);
    }

    @Deprecated
    /* renamed from: a */
    public void mo5373a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f4929a.fling(i, i2, i3, i4, i5, i6, i7, i8);
    }

    @Deprecated
    /* renamed from: a */
    public void mo5374a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        this.f4929a.fling(i, i2, i3, i4, i5, i6, i7, i8, i9, i10);
    }

    @Deprecated
    /* renamed from: a */
    public boolean mo5375a(int i, int i2, int i3, int i4, int i5, int i6) {
        return this.f4929a.springBack(i, i2, i3, i4, i5, i6);
    }

    @Deprecated
    /* renamed from: a */
    public void mo5369a() {
        this.f4929a.abortAnimation();
    }

    @Deprecated
    /* renamed from: a */
    public void mo5370a(int i, int i2, int i3) {
        this.f4929a.notifyHorizontalEdgeReached(i, i2, i3);
    }
}
