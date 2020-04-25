package androidx.appcompat.widget;

import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.Menu;
import android.view.Window.Callback;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.appcompat.view.menu.C0386n.C0387a;

@C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.widget.y */
/* compiled from: DecorContentParent */
public interface C0564y {
    /* renamed from: a */
    void mo1883a(int i);

    /* renamed from: a */
    void mo1884a(SparseArray<Parcelable> sparseArray);

    /* renamed from: a */
    void mo1885a(Menu menu, C0387a aVar);

    /* renamed from: b */
    void mo1891b(SparseArray<Parcelable> sparseArray);

    /* renamed from: b */
    boolean mo1893b();

    /* renamed from: d */
    void mo1896d();

    /* renamed from: e */
    boolean mo1898e();

    /* renamed from: f */
    boolean mo1899f();

    /* renamed from: g */
    boolean mo1901g();

    CharSequence getTitle();

    /* renamed from: h */
    boolean mo1908h();

    /* renamed from: i */
    boolean mo1909i();

    /* renamed from: j */
    boolean mo1910j();

    /* renamed from: k */
    void mo1911k();

    void setIcon(int i);

    void setIcon(Drawable drawable);

    void setLogo(int i);

    void setUiOptions(int i);

    void setWindowCallback(Callback callback);

    void setWindowTitle(CharSequence charSequence);
}
