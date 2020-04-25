package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.appcompat.C0238R;
import java.lang.ref.WeakReference;

@C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
public final class ViewStubCompat extends View {

    /* renamed from: N */
    private WeakReference<View> f1846N;

    /* renamed from: O */
    private LayoutInflater f1847O;

    /* renamed from: P */
    private C0465a f1848P;

    /* renamed from: a */
    private int f1849a;

    /* renamed from: b */
    private int f1850b;

    /* renamed from: androidx.appcompat.widget.ViewStubCompat$a */
    public interface C0465a {
        /* renamed from: a */
        void mo2459a(ViewStubCompat viewStubCompat, View view);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public View mo2447a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        } else if (this.f1849a != 0) {
            ViewGroup viewGroup = (ViewGroup) parent;
            LayoutInflater layoutInflater = this.f1847O;
            if (layoutInflater == null) {
                layoutInflater = LayoutInflater.from(getContext());
            }
            View inflate = layoutInflater.inflate(this.f1849a, viewGroup, false);
            int i = this.f1850b;
            if (i != -1) {
                inflate.setId(i);
            }
            int indexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(inflate, indexOfChild);
            }
            this.f1846N = new WeakReference<>(inflate);
            C0465a aVar = this.f1848P;
            if (aVar != null) {
                aVar.mo2459a(this, inflate);
            }
            return inflate;
        } else {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
    }

    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f1850b;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f1847O;
    }

    public int getLayoutResource() {
        return this.f1849a;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i) {
        this.f1850b = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f1847O = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.f1849a = i;
    }

    public void setOnInflateListener(C0465a aVar) {
        this.f1848P = aVar;
    }

    public void setVisibility(int i) {
        WeakReference<View> weakReference = this.f1846N;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view != null) {
                view.setVisibility(i);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            mo2447a();
        }
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1849a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0238R.styleable.ViewStubCompat, i, 0);
        this.f1850b = obtainStyledAttributes.getResourceId(C0238R.styleable.ViewStubCompat_android_inflatedId, -1);
        this.f1849a = obtainStyledAttributes.getResourceId(C0238R.styleable.ViewStubCompat_android_layout, 0);
        setId(obtainStyledAttributes.getResourceId(C0238R.styleable.ViewStubCompat_android_id, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }
}
