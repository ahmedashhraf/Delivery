package com.booking.rtlviewpager;

import android.content.Context;
import android.database.DataSetObserver;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.collection.C0635a;
import androidx.core.p031j.C0926g;
import androidx.viewpager.widget.C2024a;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager.widget.ViewPager.C2019j;
import java.util.Map;

public class RtlViewPager extends ViewPager {
    /* access modifiers changed from: private */

    /* renamed from: N */
    public boolean f10460N;
    @C0193h0

    /* renamed from: a */
    private final Map<C2019j, C2956d> f10461a = new C0635a(1);
    @C0195i0

    /* renamed from: b */
    private DataSetObserver f10462b;

    /* renamed from: com.booking.rtlviewpager.RtlViewPager$b */
    private static class C2954b extends DataSetObserver {
        @C0193h0

        /* renamed from: a */
        private final C2955c f10463a;

        public void onChanged() {
            super.onChanged();
            this.f10463a.m14139e();
        }

        private C2954b(@C0193h0 C2955c cVar) {
            this.f10463a = cVar;
        }
    }

    /* renamed from: com.booking.rtlviewpager.RtlViewPager$c */
    private class C2955c extends C2957a {

        /* renamed from: f */
        private int f10464f;

        public C2955c(@C0193h0 C2024a aVar) {
            super(aVar);
            this.f10464f = aVar.mo8886a();
        }

        /* renamed from: c */
        private int m14138c(int i) {
            return (mo8886a() - i) - 1;
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public void m14139e() {
            int a = mo8886a();
            int i = this.f10464f;
            if (a != i) {
                RtlViewPager.this.setCurrentItemWithoutNotification(Math.max(0, i - 1));
                this.f10464f = a;
            }
        }

        /* renamed from: b */
        public float mo8893b(int i) {
            return super.mo8893b(m14138c(i));
        }

        /* renamed from: a */
        public CharSequence mo8888a(int i) {
            return super.mo8888a(m14138c(i));
        }

        /* renamed from: b */
        public void mo6386b(ViewGroup viewGroup, int i, Object obj) {
            super.mo6386b(viewGroup, (this.f10464f - i) - 1, obj);
        }

        /* renamed from: a */
        public int mo8887a(Object obj) {
            int a = super.mo8887a(obj);
            return a < 0 ? a : m14138c(a);
        }

        /* renamed from: a */
        public Object mo6380a(ViewGroup viewGroup, int i) {
            return super.mo6380a(viewGroup, m14138c(i));
        }

        /* renamed from: a */
        public void mo6383a(ViewGroup viewGroup, int i, Object obj) {
            super.mo6383a(viewGroup, m14138c(i), obj);
        }
    }

    /* renamed from: com.booking.rtlviewpager.RtlViewPager$d */
    private class C2956d implements C2019j {
        @C0193h0

        /* renamed from: a */
        private final C2019j f10467a;

        /* renamed from: b */
        private int f10468b;

        /* renamed from: b */
        private int m14146b(int i) {
            C2024a adapter = RtlViewPager.this.getAdapter();
            return adapter == null ? i : (adapter.mo8886a() - i) - 1;
        }

        /* renamed from: a */
        public void mo8879a(int i, float f, int i2) {
            if (!RtlViewPager.this.f10460N) {
                if (f == 0.0f && i2 == 0) {
                    this.f10468b = m14146b(i);
                } else {
                    this.f10468b = m14146b(i + 1);
                }
                C2019j jVar = this.f10467a;
                int i3 = this.f10468b;
                if (f > 0.0f) {
                    f = 1.0f - f;
                }
                jVar.mo8879a(i3, f, i2);
            }
        }

        /* renamed from: c */
        public void mo8880c(int i) {
            if (!RtlViewPager.this.f10460N) {
                this.f10467a.mo8880c(m14146b(i));
            }
        }

        private C2956d(@C0193h0 C2019j jVar) {
            this.f10467a = jVar;
            this.f10468b = -1;
        }

        /* renamed from: a */
        public void mo8878a(int i) {
            if (!RtlViewPager.this.f10460N) {
                this.f10467a.mo8878a(i);
            }
        }
    }

    public RtlViewPager(Context context) {
        super(context);
    }

    /* renamed from: b */
    private void m14135b() {
        C2024a adapter = super.getAdapter();
        if (adapter instanceof C2955c) {
            DataSetObserver dataSetObserver = this.f10462b;
            if (dataSetObserver != null) {
                adapter.mo8898c(dataSetObserver);
                this.f10462b = null;
            }
        }
    }

    /* access modifiers changed from: private */
    public void setCurrentItemWithoutNotification(int i) {
        this.f10460N = true;
        setCurrentItem(i, false);
        this.f10460N = false;
    }

    public void addOnPageChangeListener(@C0193h0 C2019j jVar) {
        if (mo11734a()) {
            C2019j dVar = new C2956d(jVar);
            this.f10461a.put(jVar, dVar);
            jVar = dVar;
        }
        super.addOnPageChangeListener(jVar);
    }

    public void fakeDragBy(float f) {
        if (!mo11734a()) {
            f = -f;
        }
        super.fakeDragBy(f);
    }

    @C0195i0
    public C2024a getAdapter() {
        C2024a adapter = super.getAdapter();
        return adapter instanceof C2955c ? ((C2955c) adapter).mo11736d() : adapter;
    }

    public int getCurrentItem() {
        return m14131a(super.getCurrentItem());
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m14132a(super.getAdapter());
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        m14135b();
        super.onDetachedFromWindow();
    }

    public void removeOnPageChangeListener(@C0193h0 C2019j jVar) {
        if (mo11734a()) {
            jVar = (C2019j) this.f10461a.remove(jVar);
        }
        super.removeOnPageChangeListener(jVar);
    }

    public void setAdapter(@C0195i0 C2024a aVar) {
        m14135b();
        boolean z = aVar != null && mo11734a();
        if (z) {
            C2024a cVar = new C2955c(aVar);
            m14132a(cVar);
            aVar = cVar;
        }
        super.setAdapter(aVar);
        if (z) {
            setCurrentItemWithoutNotification(0);
        }
    }

    public void setCurrentItem(int i, boolean z) {
        super.setCurrentItem(m14131a(i), z);
    }

    public void setCurrentItem(int i) {
        super.setCurrentItem(m14131a(i));
    }

    public RtlViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    private void m14132a(C2024a aVar) {
        if ((aVar instanceof C2955c) && this.f10462b == null) {
            C2955c cVar = (C2955c) aVar;
            this.f10462b = new C2954b(cVar);
            aVar.mo8890a(this.f10462b);
            cVar.m14139e();
        }
    }

    /* renamed from: a */
    private int m14131a(int i) {
        if (i < 0 || !mo11734a()) {
            return i;
        }
        if (getAdapter() == null) {
            return 0;
        }
        return (getAdapter().mo8886a() - i) - 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo11734a() {
        return C0926g.m5287b(getContext().getResources().getConfiguration().locale) == 1;
    }
}
