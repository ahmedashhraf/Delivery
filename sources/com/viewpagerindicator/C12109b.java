package com.viewpagerindicator;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager.widget.ViewPager.C2019j;

/* renamed from: com.viewpagerindicator.b */
/* compiled from: IconPageIndicator */
public class C12109b extends HorizontalScrollView implements C12113e {

    /* renamed from: N */
    private C2019j f35086N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public Runnable f35087O;

    /* renamed from: P */
    private int f35088P;

    /* renamed from: a */
    private final C12112d f35089a;

    /* renamed from: b */
    private ViewPager f35090b;

    /* renamed from: com.viewpagerindicator.b$a */
    /* compiled from: IconPageIndicator */
    class C12110a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View f35091a;

        C12110a(View view) {
            this.f35091a = view;
        }

        public void run() {
            C12109b.this.smoothScrollTo(this.f35091a.getLeft() - ((C12109b.this.getWidth() - this.f35091a.getWidth()) / 2), 0);
            C12109b.this.f35087O = null;
        }
    }

    public C12109b(Context context) {
        this(context, null);
    }

    /* renamed from: b */
    private void m54707b(int i) {
        View childAt = this.f35089a.getChildAt(i);
        Runnable runnable = this.f35087O;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        this.f35087O = new C12110a(childAt);
        post(this.f35087O);
    }

    /* renamed from: c */
    public void mo8880c(int i) {
        setCurrentItem(i);
        C2019j jVar = this.f35086N;
        if (jVar != null) {
            jVar.mo8880c(i);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f35087O;
        if (runnable != null) {
            post(runnable);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f35087O;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    public void setCurrentItem(int i) {
        ViewPager viewPager = this.f35090b;
        if (viewPager != null) {
            this.f35088P = i;
            viewPager.setCurrentItem(i);
            int childCount = this.f35089a.getChildCount();
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = this.f35089a.getChildAt(i2);
                boolean z = i2 == i;
                childAt.setSelected(z);
                if (z) {
                    m54707b(i);
                }
                i2++;
            }
            return;
        }
        throw new IllegalStateException("ViewPager has not been bound.");
    }

    public void setOnPageChangeListener(C2019j jVar) {
        this.f35086N = jVar;
    }

    public void setViewPager(ViewPager viewPager) {
        ViewPager viewPager2 = this.f35090b;
        if (viewPager2 != viewPager) {
            if (viewPager2 != null) {
                viewPager2.setOnPageChangeListener(null);
            }
            if (viewPager.getAdapter() != null) {
                this.f35090b = viewPager;
                viewPager.setOnPageChangeListener(this);
                mo41436b();
                return;
            }
            throw new IllegalStateException("ViewPager does not have adapter instance.");
        }
    }

    public C12109b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setHorizontalScrollBarEnabled(false);
        this.f35089a = new C12112d(context, C12096R.attr.vpiIconPageIndicatorStyle);
        addView(this.f35089a, new LayoutParams(-2, -1, 17));
    }

    /* renamed from: a */
    public void mo8878a(int i) {
        C2019j jVar = this.f35086N;
        if (jVar != null) {
            jVar.mo8878a(i);
        }
    }

    /* renamed from: a */
    public void mo8879a(int i, float f, int i2) {
        C2019j jVar = this.f35086N;
        if (jVar != null) {
            jVar.mo8879a(i, f, i2);
        }
    }

    /* renamed from: a */
    public void mo41434a(ViewPager viewPager, int i) {
        setViewPager(viewPager);
        setCurrentItem(i);
    }

    /* renamed from: b */
    public void mo41436b() {
        this.f35089a.removeAllViews();
        C12111c cVar = (C12111c) this.f35090b.getAdapter();
        int count = cVar.getCount();
        for (int i = 0; i < count; i++) {
            ImageView imageView = new ImageView(getContext(), null, C12096R.attr.vpiIconPageIndicatorStyle);
            imageView.setImageResource(cVar.mo41541a(i));
            this.f35089a.addView(imageView);
        }
        if (this.f35088P > count) {
            this.f35088P = count - 1;
        }
        setCurrentItem(this.f35088P);
        requestLayout();
    }
}
