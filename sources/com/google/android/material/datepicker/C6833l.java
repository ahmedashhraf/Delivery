package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.annotation.C0193h0;
import androidx.core.p034l.C0962e0;
import androidx.recyclerview.widget.RecyclerView.C1635d0;
import androidx.recyclerview.widget.RecyclerView.C1638g;
import androidx.recyclerview.widget.RecyclerView.C1656p;
import com.google.android.material.C5582R;

/* renamed from: com.google.android.material.datepicker.l */
/* compiled from: MonthsPagerAdapter */
class C6833l extends C1638g<C6835b> {
    @C0193h0

    /* renamed from: c */
    private final CalendarConstraints f19038c;

    /* renamed from: d */
    private final DateSelector<?> f19039d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C6821l f19040e;

    /* renamed from: f */
    private final int f19041f;

    /* renamed from: com.google.android.material.datepicker.l$a */
    /* compiled from: MonthsPagerAdapter */
    class C6834a implements OnItemClickListener {

        /* renamed from: a */
        final /* synthetic */ MaterialCalendarGridView f19042a;

        C6834a(MaterialCalendarGridView materialCalendarGridView) {
            this.f19042a = materialCalendarGridView;
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (this.f19042a.getAdapter().mo27200e(i)) {
                C6833l.this.f19040e.mo27164a(this.f19042a.getAdapter().getItem(i).longValue());
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.l$b */
    /* compiled from: MonthsPagerAdapter */
    public static class C6835b extends C1635d0 {

        /* renamed from: s0 */
        final TextView f19044s0;

        /* renamed from: t0 */
        final MaterialCalendarGridView f19045t0;

        C6835b(@C0193h0 LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            this.f19044s0 = (TextView) linearLayout.findViewById(C5582R.C5586id.month_title);
            C0962e0.m5455a((View) this.f19044s0, true);
            this.f19045t0 = (MaterialCalendarGridView) linearLayout.findViewById(C5582R.C5586id.month_grid);
            if (!z) {
                this.f19044s0.setVisibility(8);
            }
        }
    }

    C6833l(@C0193h0 Context context, DateSelector<?> dateSelector, @C0193h0 CalendarConstraints calendarConstraints, C6821l lVar) {
        Month j = calendarConstraints.mo27082j();
        Month b = calendarConstraints.mo27075b();
        Month i = calendarConstraints.mo27081i();
        if (j.compareTo(i) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        } else if (i.compareTo(b) <= 0) {
            this.f19041f = (C6832k.f19033P * C6809f.m32578a(context)) + (C6822g.m32623f(context) ? C6809f.m32578a(context) : 0);
            this.f19038c = calendarConstraints;
            this.f19039d = dateSelector;
            this.f19040e = lVar;
            mo7323a(true);
        } else {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
    }

    /* access modifiers changed from: 0000 */
    @C0193h0
    /* renamed from: g */
    public Month mo27208g(int i) {
        return this.f19038c.mo27082j().mo27121b(i);
    }

    /* access modifiers changed from: 0000 */
    @C0193h0
    /* renamed from: h */
    public CharSequence mo27209h(int i) {
        return mo27208g(i).mo27122c();
    }

    /* renamed from: a */
    public void mo7330b(@C0193h0 C6835b bVar, int i) {
        Month b = this.f19038c.mo27082j().mo27121b(i);
        bVar.f19044s0.setText(b.mo27122c());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.f19045t0.findViewById(C5582R.C5586id.month_grid);
        if (materialCalendarGridView.getAdapter() == null || !b.equals(materialCalendarGridView.getAdapter().f19036a)) {
            C6832k kVar = new C6832k(b, this.f19039d, this.f19038c);
            materialCalendarGridView.setNumColumns(b.f18907P);
            materialCalendarGridView.setAdapter((ListAdapter) kVar);
        } else {
            materialCalendarGridView.getAdapter().notifyDataSetChanged();
        }
        materialCalendarGridView.setOnItemClickListener(new C6834a(materialCalendarGridView));
    }

    @C0193h0
    /* renamed from: b */
    public C6835b m32667b(@C0193h0 ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(C5582R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!C6822g.m32623f(viewGroup.getContext())) {
            return new C6835b(linearLayout, false);
        }
        linearLayout.setLayoutParams(new C1656p(-1, this.f19041f));
        return new C6835b(linearLayout, true);
    }

    /* renamed from: b */
    public long mo7326b(int i) {
        return this.f19038c.mo27082j().mo27121b(i).mo27127j();
    }

    /* renamed from: b */
    public int mo7325b() {
        return this.f19038c.mo27076c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo27206a(@C0193h0 Month month) {
        return this.f19038c.mo27082j().mo27120b(month);
    }
}
