package androidx.viewpager.widget;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;

/* renamed from: androidx.viewpager.widget.a */
/* compiled from: PagerAdapter */
public abstract class C2024a {

    /* renamed from: c */
    public static final int f7768c = -1;

    /* renamed from: d */
    public static final int f7769d = -2;

    /* renamed from: a */
    private final DataSetObservable f7770a = new DataSetObservable();

    /* renamed from: b */
    private DataSetObserver f7771b;

    /* renamed from: a */
    public abstract int mo8886a();

    /* renamed from: a */
    public int mo8887a(@C0193h0 Object obj) {
        return -1;
    }

    @C0195i0
    /* renamed from: a */
    public CharSequence mo8888a(int i) {
        return null;
    }

    @C0193h0
    /* renamed from: a */
    public Object mo6380a(@C0193h0 ViewGroup viewGroup, int i) {
        return mo8889a((View) viewGroup, i);
    }

    /* renamed from: a */
    public void mo6381a(@C0195i0 Parcelable parcelable, @C0195i0 ClassLoader classLoader) {
    }

    @Deprecated
    /* renamed from: a */
    public void mo8891a(@C0193h0 View view) {
    }

    /* renamed from: a */
    public abstract boolean mo6384a(@C0193h0 View view, @C0193h0 Object obj);

    /* renamed from: b */
    public float mo8893b(int i) {
        return 1.0f;
    }

    @Deprecated
    /* renamed from: b */
    public void mo8896b(@C0193h0 View view) {
    }

    @Deprecated
    /* renamed from: b */
    public void mo8897b(@C0193h0 View view, int i, @C0193h0 Object obj) {
    }

    /* renamed from: b */
    public void mo6385b(@C0193h0 ViewGroup viewGroup) {
        mo8896b((View) viewGroup);
    }

    @C0195i0
    /* renamed from: c */
    public Parcelable mo6387c() {
        return null;
    }

    /* renamed from: c */
    public void mo8898c(@C0193h0 DataSetObserver dataSetObserver) {
        this.f7770a.unregisterObserver(dataSetObserver);
    }

    /* renamed from: a */
    public void mo6383a(@C0193h0 ViewGroup viewGroup, int i, @C0193h0 Object obj) {
        mo8892a((View) viewGroup, i, obj);
    }

    /* renamed from: b */
    public void mo6386b(@C0193h0 ViewGroup viewGroup, int i, @C0193h0 Object obj) {
        mo8897b((View) viewGroup, i, obj);
    }

    /* renamed from: a */
    public void mo6382a(@C0193h0 ViewGroup viewGroup) {
        mo8891a((View) viewGroup);
    }

    /* renamed from: b */
    public void mo8894b() {
        synchronized (this) {
            if (this.f7771b != null) {
                this.f7771b.onChanged();
            }
        }
        this.f7770a.notifyChanged();
    }

    @C0193h0
    @Deprecated
    /* renamed from: a */
    public Object mo8889a(@C0193h0 View view, int i) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    @Deprecated
    /* renamed from: a */
    public void mo8892a(@C0193h0 View view, int i, @C0193h0 Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    /* renamed from: a */
    public void mo8890a(@C0193h0 DataSetObserver dataSetObserver) {
        this.f7770a.registerObserver(dataSetObserver);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo8895b(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.f7771b = dataSetObserver;
        }
    }
}
