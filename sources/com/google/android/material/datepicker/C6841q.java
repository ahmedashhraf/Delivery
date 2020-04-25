package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.C0193h0;
import androidx.recyclerview.widget.RecyclerView.C1635d0;
import androidx.recyclerview.widget.RecyclerView.C1638g;
import com.google.android.material.C5582R;
import java.util.Calendar;
import java.util.Locale;

/* renamed from: com.google.android.material.datepicker.q */
/* compiled from: YearGridAdapter */
class C6841q extends C1638g<C6843b> {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C6809f<?> f19050c;

    /* renamed from: com.google.android.material.datepicker.q$a */
    /* compiled from: YearGridAdapter */
    class C6842a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ int f19051a;

        C6842a(int i) {
            this.f19051a = i;
        }

        public void onClick(View view) {
            C6841q.this.f19050c.mo27158a(Month.m32505a(this.f19051a, C6841q.this.f19050c.mo27155A().f18905N));
            C6841q.this.f19050c.mo27159a(C6820k.DAY);
        }
    }

    /* renamed from: com.google.android.material.datepicker.q$b */
    /* compiled from: YearGridAdapter */
    public static class C6843b extends C1635d0 {

        /* renamed from: s0 */
        final TextView f19053s0;

        C6843b(TextView textView) {
            super(textView);
            this.f19053s0 = textView;
        }
    }

    C6841q(C6809f<?> fVar) {
        this.f19050c = fVar;
    }

    @C0193h0
    /* renamed from: i */
    private OnClickListener m32706i(int i) {
        return new C6842a(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public int mo27215g(int i) {
        return i - this.f19050c.mo27161y().mo27082j().f18906O;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public int mo27216h(int i) {
        return this.f19050c.mo27161y().mo27082j().f18906O + i;
    }

    /* renamed from: a */
    public void mo7330b(@C0193h0 C6843b bVar, int i) {
        int h = mo27216h(i);
        String string = bVar.f19053s0.getContext().getString(C5582R.string.mtrl_picker_navigate_to_year_description);
        bVar.f19053s0.setText(String.format(Locale.getDefault(), "%d", new Object[]{Integer.valueOf(h)}));
        bVar.f19053s0.setContentDescription(String.format(string, new Object[]{Integer.valueOf(h)}));
        C6805b z = this.f19050c.mo27162z();
        Calendar f = C6840p.m32699f();
        C6804a aVar = f.get(1) == h ? z.f18940f : z.f18938d;
        for (Long longValue : this.f19050c.mo27160x().mo27101g()) {
            f.setTimeInMillis(longValue.longValue());
            if (f.get(1) == h) {
                aVar = z.f18939e;
            }
        }
        aVar.mo27144a(bVar.f19053s0);
        bVar.f19053s0.setOnClickListener(m32706i(h));
    }

    @C0193h0
    /* renamed from: b */
    public C6843b m32710b(@C0193h0 ViewGroup viewGroup, int i) {
        return new C6843b((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(C5582R.layout.mtrl_calendar_year, viewGroup, false));
    }

    /* renamed from: b */
    public int mo7325b() {
        return this.f19050c.mo27161y().mo27083k();
    }
}
