package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window.Callback;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.SpinnerAdapter;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.appcompat.view.menu.C0370g.C0371a;
import androidx.appcompat.view.menu.C0386n.C0387a;
import androidx.core.p034l.C0990i0;

@C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.widget.z */
/* compiled from: DecorToolbar */
public interface C0566z {
    /* renamed from: a */
    int mo2896a();

    /* renamed from: a */
    C0990i0 mo2897a(int i, long j);

    /* renamed from: a */
    void mo2898a(int i);

    /* renamed from: a */
    void mo2899a(Drawable drawable);

    /* renamed from: a */
    void mo2900a(SparseArray<Parcelable> sparseArray);

    /* renamed from: a */
    void mo2901a(Menu menu, C0387a aVar);

    /* renamed from: a */
    void mo2902a(View view);

    /* renamed from: a */
    void mo2903a(SpinnerAdapter spinnerAdapter, OnItemSelectedListener onItemSelectedListener);

    /* renamed from: a */
    void mo2904a(C0387a aVar, C0371a aVar2);

    /* renamed from: a */
    void mo2905a(C0523l0 l0Var);

    /* renamed from: a */
    void mo2906a(CharSequence charSequence);

    /* renamed from: a */
    void mo2907a(boolean z);

    /* renamed from: b */
    void mo2908b(int i);

    /* renamed from: b */
    void mo2909b(Drawable drawable);

    /* renamed from: b */
    void mo2910b(SparseArray<Parcelable> sparseArray);

    /* renamed from: b */
    void mo2911b(CharSequence charSequence);

    /* renamed from: b */
    void mo2912b(boolean z);

    /* renamed from: b */
    boolean mo2913b();

    /* renamed from: c */
    Context mo2914c();

    /* renamed from: c */
    void mo2915c(int i);

    /* renamed from: c */
    void mo2916c(Drawable drawable);

    void collapseActionView();

    /* renamed from: d */
    void mo2918d();

    /* renamed from: d */
    void mo2919d(int i);

    /* renamed from: d */
    void mo2920d(Drawable drawable);

    /* renamed from: e */
    void mo2921e(int i);

    /* renamed from: e */
    boolean mo2922e();

    /* renamed from: f */
    void mo2923f(int i);

    /* renamed from: f */
    boolean mo2924f();

    /* renamed from: g */
    void mo2925g(int i);

    /* renamed from: g */
    boolean mo2926g();

    int getHeight();

    CharSequence getTitle();

    /* renamed from: h */
    boolean mo2929h();

    /* renamed from: i */
    boolean mo2930i();

    /* renamed from: j */
    boolean mo2931j();

    /* renamed from: k */
    void mo2932k();

    /* renamed from: l */
    View mo2933l();

    /* renamed from: m */
    boolean mo2934m();

    /* renamed from: n */
    boolean mo2935n();

    /* renamed from: o */
    Menu mo2936o();

    /* renamed from: p */
    boolean mo2937p();

    /* renamed from: q */
    int mo2938q();

    /* renamed from: r */
    ViewGroup mo2939r();

    /* renamed from: s */
    CharSequence mo2940s();

    void setIcon(int i);

    void setIcon(Drawable drawable);

    void setLogo(int i);

    void setTitle(CharSequence charSequence);

    void setVisibility(int i);

    void setWindowCallback(Callback callback);

    void setWindowTitle(CharSequence charSequence);

    /* renamed from: t */
    int mo2948t();

    /* renamed from: u */
    int mo2949u();

    /* renamed from: v */
    void mo2950v();

    /* renamed from: w */
    int mo2951w();

    /* renamed from: x */
    void mo2952x();
}
