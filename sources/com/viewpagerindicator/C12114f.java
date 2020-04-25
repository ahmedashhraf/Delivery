package com.viewpagerindicator;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.C2024a;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager.widget.ViewPager.C2019j;
import p076c.p112d.p148d.p150g.C6637f;

/* renamed from: com.viewpagerindicator.f */
/* compiled from: TabPageIndicator */
public class C12114f extends HorizontalScrollView implements C12113e {

    /* renamed from: T */
    private static final CharSequence f35102T = "";

    /* renamed from: N */
    private final C12112d f35103N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public ViewPager f35104O;

    /* renamed from: P */
    private C2019j f35105P;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public int f35106Q;

    /* renamed from: R */
    private int f35107R;
    /* access modifiers changed from: private */

    /* renamed from: S */
    public C12117c f35108S;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Runnable f35109a;

    /* renamed from: b */
    private final OnClickListener f35110b;

    /* renamed from: com.viewpagerindicator.f$a */
    /* compiled from: TabPageIndicator */
    class C12115a implements OnClickListener {
        C12115a() {
        }

        public void onClick(View view) {
            C12118d dVar = (C12118d) view;
            int currentItem = C12114f.this.f35104O.getCurrentItem();
            int a = dVar.mo41553a();
            C12114f.this.f35104O.setCurrentItem(a);
            if (currentItem == a && C12114f.this.f35108S != null) {
                C12114f.this.f35108S.mo41552a(a);
            }
        }
    }

    /* renamed from: com.viewpagerindicator.f$b */
    /* compiled from: TabPageIndicator */
    class C12116b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View f35112a;

        C12116b(View view) {
            this.f35112a = view;
        }

        public void run() {
            C12114f.this.smoothScrollTo(this.f35112a.getLeft() - ((C12114f.this.getWidth() - this.f35112a.getWidth()) / 2), 0);
            C12114f.this.f35109a = null;
        }
    }

    /* renamed from: com.viewpagerindicator.f$c */
    /* compiled from: TabPageIndicator */
    public interface C12117c {
        /* renamed from: a */
        void mo41552a(int i);
    }

    /* renamed from: com.viewpagerindicator.f$d */
    /* compiled from: TabPageIndicator */
    private class C12118d extends TextView {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public int f35114a;

        public C12118d(Context context) {
            super(context, null, C12096R.attr.vpiTabPageIndicatorStyle);
        }

        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (C12114f.this.f35106Q > 0 && getMeasuredWidth() > C12114f.this.f35106Q) {
                super.onMeasure(MeasureSpec.makeMeasureSpec(C12114f.this.f35106Q, C6637f.f18605b), i2);
            }
        }

        /* renamed from: a */
        public int mo41553a() {
            return this.f35114a;
        }
    }

    public C12114f(Context context) {
        this(context, null);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f35109a;
        if (runnable != null) {
            post(runnable);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f35109a;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    public void onMeasure(int i, int i2) {
        int mode = MeasureSpec.getMode(i);
        boolean z = mode == 1073741824;
        setFillViewport(z);
        int childCount = this.f35103N.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.f35106Q = -1;
        } else if (childCount > 2) {
            this.f35106Q = (int) (((float) MeasureSpec.getSize(i)) * 0.4f);
        } else {
            this.f35106Q = MeasureSpec.getSize(i) / 2;
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i, i2);
        int measuredWidth2 = getMeasuredWidth();
        if (z && measuredWidth != measuredWidth2) {
            setCurrentItem(this.f35107R);
        }
    }

    public void setCurrentItem(int i) {
        ViewPager viewPager = this.f35104O;
        if (viewPager != null) {
            this.f35107R = i;
            viewPager.setCurrentItem(i);
            int childCount = this.f35103N.getChildCount();
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = this.f35103N.getChildAt(i2);
                boolean z = i2 == i;
                childAt.setSelected(z);
                if (z) {
                    m54725b(i);
                }
                i2++;
            }
            return;
        }
        throw new IllegalStateException("ViewPager has not been bound.");
    }

    public void setOnPageChangeListener(C2019j jVar) {
        this.f35105P = jVar;
    }

    public void setOnTabReselectedListener(C12117c cVar) {
        this.f35108S = cVar;
    }

    public void setViewPager(ViewPager viewPager) {
        ViewPager viewPager2 = this.f35104O;
        if (viewPager2 != viewPager) {
            if (viewPager2 != null) {
                viewPager2.setOnPageChangeListener(null);
            }
            if (viewPager.getAdapter() != null) {
                this.f35104O = viewPager;
                viewPager.setOnPageChangeListener(this);
                mo41436b();
                return;
            }
            throw new IllegalStateException("ViewPager does not have adapter instance.");
        }
    }

    public C12114f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f35110b = new C12115a();
        setHorizontalScrollBarEnabled(false);
        this.f35103N = new C12112d(context, C12096R.attr.vpiTabPageIndicatorStyle);
        addView(this.f35103N, new LayoutParams(-2, -1));
    }

    /* renamed from: b */
    private void m54725b(int i) {
        View childAt = this.f35103N.getChildAt(i);
        Runnable runnable = this.f35109a;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        this.f35109a = new C12116b(childAt);
        post(this.f35109a);
    }

    /* renamed from: c */
    public void mo8880c(int i) {
        setCurrentItem(i);
        C2019j jVar = this.f35105P;
        if (jVar != null) {
            jVar.mo8880c(i);
        }
    }

    /* renamed from: a */
    private void m54723a(int i, CharSequence charSequence, int i2) {
        C12118d dVar = new C12118d(getContext());
        dVar.f35114a = i;
        dVar.setFocusable(true);
        dVar.setOnClickListener(this.f35110b);
        dVar.setText(charSequence);
        if (i2 != 0) {
            dVar.setCompoundDrawablesWithIntrinsicBounds(i2, 0, 0, 0);
        }
        this.f35103N.addView(dVar, new LinearLayout.LayoutParams(0, -1, 1.0f));
    }

    /* renamed from: b */
    public void mo41436b() {
        this.f35103N.removeAllViews();
        C2024a adapter = this.f35104O.getAdapter();
        C12111c cVar = adapter instanceof C12111c ? (C12111c) adapter : null;
        int a = adapter.mo8886a();
        int i = 0;
        while (i < a) {
            CharSequence a2 = adapter.mo8888a(i);
            if (a2 == null) {
                a2 = f35102T;
            }
            m54723a(i, a2, cVar != null ? cVar.mo41541a(i) : 0);
            i++;
        }
        if (this.f35107R > a) {
            this.f35107R = a - 1;
        }
        setCurrentItem(this.f35107R);
        requestLayout();
    }

    /* renamed from: a */
    public void mo8878a(int i) {
        C2019j jVar = this.f35105P;
        if (jVar != null) {
            jVar.mo8878a(i);
        }
    }

    /* renamed from: a */
    public void mo8879a(int i, float f, int i2) {
        C2019j jVar = this.f35105P;
        if (jVar != null) {
            jVar.mo8879a(i, f, i2);
        }
    }

    /* renamed from: a */
    public void mo41434a(ViewPager viewPager, int i) {
        setViewPager(viewPager);
        setCurrentItem(i);
    }
}
