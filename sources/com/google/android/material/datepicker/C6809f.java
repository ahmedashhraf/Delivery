package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0199k0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.C0224v0;
import androidx.core.p033k.C0938f;
import androidx.core.p034l.C0947a;
import androidx.core.p034l.C0962e0;
import androidx.core.p034l.p035o0.C1016d;
import androidx.recyclerview.widget.C1762r;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C1650n;
import androidx.recyclerview.widget.RecyclerView.C1660t;
import androidx.recyclerview.widget.RecyclerView.State;
import com.google.android.material.C5582R;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Iterator;

@C0207n0({C0208a.LIBRARY_GROUP})
/* renamed from: com.google.android.material.datepicker.f */
/* compiled from: MaterialCalendar */
public final class C6809f<S> extends C6837n<S> {

    /* renamed from: W */
    private static final String f18953W = "THEME_RES_ID_KEY";

    /* renamed from: X */
    private static final String f18954X = "GRID_SELECTOR_KEY";

    /* renamed from: Y */
    private static final String f18955Y = "CALENDAR_CONSTRAINTS_KEY";

    /* renamed from: Z */
    private static final String f18956Z = "CURRENT_MONTH_KEY";

    /* renamed from: a0 */
    private static final int f18957a0 = 3;
    @C0224v0

    /* renamed from: b0 */
    static final Object f18958b0 = "MONTHS_VIEW_GROUP_TAG";
    @C0224v0

    /* renamed from: c0 */
    static final Object f18959c0 = "NAVIGATION_PREV_TAG";
    @C0224v0

    /* renamed from: d0 */
    static final Object f18960d0 = "NAVIGATION_NEXT_TAG";
    @C0224v0

    /* renamed from: e0 */
    static final Object f18961e0 = "SELECTOR_TOGGLE_TAG";
    /* access modifiers changed from: private */
    @C0195i0

    /* renamed from: N */
    public DateSelector<S> f18962N;
    /* access modifiers changed from: private */
    @C0195i0

    /* renamed from: O */
    public CalendarConstraints f18963O;
    /* access modifiers changed from: private */
    @C0195i0

    /* renamed from: P */
    public Month f18964P;

    /* renamed from: Q */
    private C6820k f18965Q;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public C6805b f18966R;
    /* access modifiers changed from: private */

    /* renamed from: S */
    public RecyclerView f18967S;
    /* access modifiers changed from: private */

    /* renamed from: T */
    public RecyclerView f18968T;

    /* renamed from: U */
    private View f18969U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public View f18970V;

    /* renamed from: b */
    private int f18971b;

    /* renamed from: com.google.android.material.datepicker.f$a */
    /* compiled from: MaterialCalendar */
    class C6810a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f18972a;

        C6810a(int i) {
            this.f18972a = i;
        }

        public void run() {
            C6809f.this.f18968T.smoothScrollToPosition(this.f18972a);
        }
    }

    /* renamed from: com.google.android.material.datepicker.f$b */
    /* compiled from: MaterialCalendar */
    class C6811b extends C0947a {
        C6811b() {
        }

        /* renamed from: a */
        public void mo4749a(View view, @C0193h0 C1016d dVar) {
            super.mo4749a(view, dVar);
            dVar.mo4939a((Object) null);
        }
    }

    /* renamed from: com.google.android.material.datepicker.f$c */
    /* compiled from: MaterialCalendar */
    class C6812c extends C6838o {

        /* renamed from: P */
        final /* synthetic */ int f18975P;

        C6812c(Context context, int i, boolean z, int i2) {
            this.f18975P = i2;
            super(context, i, z);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo6981a(@C0193h0 State state, @C0193h0 int[] iArr) {
            if (this.f18975P == 0) {
                iArr[0] = C6809f.this.f18968T.getWidth();
                iArr[1] = C6809f.this.f18968T.getWidth();
                return;
            }
            iArr[0] = C6809f.this.f18968T.getHeight();
            iArr[1] = C6809f.this.f18968T.getHeight();
        }
    }

    /* renamed from: com.google.android.material.datepicker.f$d */
    /* compiled from: MaterialCalendar */
    class C6813d implements C6821l {
        C6813d() {
        }

        /* renamed from: a */
        public void mo27164a(long j) {
            if (C6809f.this.f18963O.mo27074a().mo27085b(j)) {
                C6809f.this.f18962N.mo27095a(j);
                Iterator it = C6809f.this.f19046a.iterator();
                while (it.hasNext()) {
                    ((C6836m) it.next()).mo27184a(C6809f.this.f18962N.mo27102h());
                }
                C6809f.this.f18968T.getAdapter().mo7341e();
                if (C6809f.this.f18967S != null) {
                    C6809f.this.f18967S.getAdapter().mo7341e();
                }
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.f$e */
    /* compiled from: MaterialCalendar */
    class C6814e extends C1650n {

        /* renamed from: a */
        private final Calendar f18978a = C6840p.m32703h();

        /* renamed from: b */
        private final Calendar f18979b = C6840p.m32703h();

        C6814e() {
        }

        /* renamed from: a */
        public void mo7392a(@C0193h0 Canvas canvas, @C0193h0 RecyclerView recyclerView, @C0193h0 State state) {
            int i;
            if ((recyclerView.getAdapter() instanceof C6841q) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                C6841q qVar = (C6841q) recyclerView.getAdapter();
                GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                for (C0938f fVar : C6809f.this.f18962N.mo27098d()) {
                    F f = fVar.f4243a;
                    if (!(f == null || fVar.f4244b == null)) {
                        this.f18978a.setTimeInMillis(((Long) f).longValue());
                        this.f18979b.setTimeInMillis(((Long) fVar.f4244b).longValue());
                        int g = qVar.mo27215g(this.f18978a.get(1));
                        int g2 = qVar.mo27215g(this.f18979b.get(1));
                        View c = gridLayoutManager.mo6989c(g);
                        View c2 = gridLayoutManager.mo6989c(g2);
                        int Z = g / gridLayoutManager.mo6907Z();
                        int Z2 = g2 / gridLayoutManager.mo6907Z();
                        int i2 = Z;
                        while (i2 <= Z2) {
                            View c3 = gridLayoutManager.mo6989c(gridLayoutManager.mo6907Z() * i2);
                            if (c3 != null) {
                                int top = c3.getTop() + C6809f.this.f18966R.f18938d.mo27147d();
                                int bottom = c3.getBottom() - C6809f.this.f18966R.f18938d.mo27143a();
                                int left = i2 == Z ? c.getLeft() + (c.getWidth() / 2) : 0;
                                if (i2 == Z2) {
                                    i = c2.getLeft() + (c2.getWidth() / 2);
                                } else {
                                    i = recyclerView.getWidth();
                                }
                                canvas.drawRect((float) left, (float) top, (float) i, (float) bottom, C6809f.this.f18966R.f18942h);
                            }
                            i2++;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.f$f */
    /* compiled from: MaterialCalendar */
    class C6815f extends C0947a {
        C6815f() {
        }

        /* renamed from: a */
        public void mo4749a(View view, @C0193h0 C1016d dVar) {
            String str;
            super.mo4749a(view, dVar);
            if (C6809f.this.f18970V.getVisibility() == 0) {
                str = C6809f.this.getString(C5582R.string.mtrl_picker_toggle_to_year_selection);
            } else {
                str = C6809f.this.getString(C5582R.string.mtrl_picker_toggle_to_day_selection);
            }
            dVar.mo4969d((CharSequence) str);
        }
    }

    /* renamed from: com.google.android.material.datepicker.f$g */
    /* compiled from: MaterialCalendar */
    class C6816g extends C1660t {

        /* renamed from: a */
        final /* synthetic */ C6833l f18982a;

        /* renamed from: b */
        final /* synthetic */ MaterialButton f18983b;

        C6816g(C6833l lVar, MaterialButton materialButton) {
            this.f18982a = lVar;
            this.f18983b = materialButton;
        }

        /* renamed from: a */
        public void mo7532a(@C0193h0 RecyclerView recyclerView, int i, int i2) {
            int i3;
            if (i < 0) {
                i3 = C6809f.this.mo27156B().mo6959N();
            } else {
                i3 = C6809f.this.mo27156B().mo6961P();
            }
            C6809f.this.f18964P = this.f18982a.mo27208g(i3);
            this.f18983b.setText(this.f18982a.mo27209h(i3));
        }

        /* renamed from: a */
        public void mo7531a(@C0193h0 RecyclerView recyclerView, int i) {
            if (i == 0) {
                CharSequence text = this.f18983b.getText();
                if (VERSION.SDK_INT >= 16) {
                    recyclerView.announceForAccessibility(text);
                } else {
                    recyclerView.sendAccessibilityEvent(2048);
                }
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.f$h */
    /* compiled from: MaterialCalendar */
    class C6817h implements OnClickListener {
        C6817h() {
        }

        public void onClick(View view) {
            C6809f.this.mo27157C();
        }
    }

    /* renamed from: com.google.android.material.datepicker.f$i */
    /* compiled from: MaterialCalendar */
    class C6818i implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C6833l f18986a;

        C6818i(C6833l lVar) {
            this.f18986a = lVar;
        }

        public void onClick(View view) {
            int N = C6809f.this.mo27156B().mo6959N() + 1;
            if (N < C6809f.this.f18968T.getAdapter().mo7325b()) {
                C6809f.this.mo27158a(this.f18986a.mo27208g(N));
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.f$j */
    /* compiled from: MaterialCalendar */
    class C6819j implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C6833l f18988a;

        C6819j(C6833l lVar) {
            this.f18988a = lVar;
        }

        public void onClick(View view) {
            int P = C6809f.this.mo27156B().mo6961P() - 1;
            if (P >= 0) {
                C6809f.this.mo27158a(this.f18988a.mo27208g(P));
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.f$k */
    /* compiled from: MaterialCalendar */
    enum C6820k {
        DAY,
        YEAR
    }

    /* renamed from: com.google.android.material.datepicker.f$l */
    /* compiled from: MaterialCalendar */
    interface C6821l {
        /* renamed from: a */
        void mo27164a(long j);
    }

    @C0193h0
    /* renamed from: D */
    private C1650n m32577D() {
        return new C6814e();
    }

    /* access modifiers changed from: 0000 */
    @C0195i0
    /* renamed from: A */
    public Month mo27155A() {
        return this.f18964P;
    }

    /* access modifiers changed from: 0000 */
    @C0193h0
    /* renamed from: B */
    public LinearLayoutManager mo27156B() {
        return (LinearLayoutManager) this.f18968T.getLayoutManager();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: C */
    public void mo27157C() {
        C6820k kVar = this.f18965Q;
        if (kVar == C6820k.YEAR) {
            mo27159a(C6820k.DAY);
        } else if (kVar == C6820k.DAY) {
            mo27159a(C6820k.YEAR);
        }
    }

    public void onCreate(@C0195i0 Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f18971b = bundle.getInt(f18953W);
        this.f18962N = (DateSelector) bundle.getParcelable(f18954X);
        this.f18963O = (CalendarConstraints) bundle.getParcelable(f18955Y);
        this.f18964P = (Month) bundle.getParcelable(f18956Z);
    }

    @C0193h0
    public View onCreateView(@C0193h0 LayoutInflater layoutInflater, @C0195i0 ViewGroup viewGroup, @C0195i0 Bundle bundle) {
        int i;
        int i2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f18971b);
        this.f18966R = new C6805b(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        Month j = this.f18963O.mo27082j();
        if (C6822g.m32623f((Context) contextThemeWrapper)) {
            i2 = C5582R.layout.mtrl_calendar_vertical;
            i = 1;
        } else {
            i2 = C5582R.layout.mtrl_calendar_horizontal;
            i = 0;
        }
        View inflate = cloneInContext.inflate(i2, viewGroup, false);
        GridView gridView = (GridView) inflate.findViewById(C5582R.C5586id.mtrl_calendar_days_of_week);
        C0962e0.m5443a((View) gridView, (C0947a) new C6811b());
        gridView.setAdapter(new C6808e());
        gridView.setNumColumns(j.f18907P);
        gridView.setEnabled(false);
        this.f18968T = (RecyclerView) inflate.findViewById(C5582R.C5586id.mtrl_calendar_months);
        C6812c cVar = new C6812c(getContext(), i, false, i);
        this.f18968T.setLayoutManager(cVar);
        this.f18968T.setTag(f18958b0);
        C6833l lVar = new C6833l(contextThemeWrapper, this.f18962N, this.f18963O, new C6813d());
        this.f18968T.setAdapter(lVar);
        int integer = contextThemeWrapper.getResources().getInteger(C5582R.integer.mtrl_calendar_year_selector_span);
        this.f18967S = (RecyclerView) inflate.findViewById(C5582R.C5586id.mtrl_calendar_year_selector_frame);
        RecyclerView recyclerView = this.f18967S;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f18967S.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f18967S.setAdapter(new C6841q(this));
            this.f18967S.addItemDecoration(m32577D());
        }
        if (inflate.findViewById(C5582R.C5586id.month_navigation_fragment_toggle) != null) {
            m32583a(inflate, lVar);
        }
        if (!C6822g.m32623f((Context) contextThemeWrapper)) {
            new C1762r().mo7725a(this.f18968T);
        }
        this.f18968T.scrollToPosition(lVar.mo27206a(this.f18964P));
        return inflate;
    }

    public void onSaveInstanceState(@C0193h0 Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt(f18953W, this.f18971b);
        bundle.putParcelable(f18954X, this.f18962N);
        bundle.putParcelable(f18955Y, this.f18963O);
        bundle.putParcelable(f18956Z, this.f18964P);
    }

    @C0195i0
    /* renamed from: x */
    public DateSelector<S> mo27160x() {
        return this.f18962N;
    }

    /* access modifiers changed from: 0000 */
    @C0195i0
    /* renamed from: y */
    public CalendarConstraints mo27161y() {
        return this.f18963O;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: z */
    public C6805b mo27162z() {
        return this.f18966R;
    }

    @C0193h0
    /* renamed from: a */
    static <T> C6809f<T> m32581a(DateSelector<T> dateSelector, int i, @C0193h0 CalendarConstraints calendarConstraints) {
        C6809f<T> fVar = new C6809f<>();
        Bundle bundle = new Bundle();
        bundle.putInt(f18953W, i);
        bundle.putParcelable(f18954X, dateSelector);
        bundle.putParcelable(f18955Y, calendarConstraints);
        bundle.putParcelable(f18956Z, calendarConstraints.mo27081i());
        fVar.setArguments(bundle);
        return fVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo27158a(Month month) {
        C6833l lVar = (C6833l) this.f18968T.getAdapter();
        int a = lVar.mo27206a(month);
        int a2 = a - lVar.mo27206a(this.f18964P);
        boolean z = true;
        boolean z2 = Math.abs(a2) > 3;
        if (a2 <= 0) {
            z = false;
        }
        this.f18964P = month;
        if (z2 && z) {
            this.f18968T.scrollToPosition(a - 3);
            m32582a(a);
        } else if (z2) {
            this.f18968T.scrollToPosition(a + 3);
            m32582a(a);
        } else {
            m32582a(a);
        }
    }

    @C0199k0
    /* renamed from: a */
    static int m32578a(@C0193h0 Context context) {
        return context.getResources().getDimensionPixelSize(C5582R.dimen.mtrl_calendar_day_height);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo27159a(C6820k kVar) {
        this.f18965Q = kVar;
        if (kVar == C6820k.YEAR) {
            this.f18967S.getLayoutManager().mo6997i(((C6841q) this.f18967S.getAdapter()).mo27215g(this.f18964P.f18906O));
            this.f18969U.setVisibility(0);
            this.f18970V.setVisibility(8);
        } else if (kVar == C6820k.DAY) {
            this.f18969U.setVisibility(8);
            this.f18970V.setVisibility(0);
            mo27158a(this.f18964P);
        }
    }

    /* renamed from: a */
    private void m32583a(@C0193h0 View view, @C0193h0 C6833l lVar) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(C5582R.C5586id.month_navigation_fragment_toggle);
        materialButton.setTag(f18961e0);
        C0962e0.m5443a((View) materialButton, (C0947a) new C6815f());
        MaterialButton materialButton2 = (MaterialButton) view.findViewById(C5582R.C5586id.month_navigation_previous);
        materialButton2.setTag(f18959c0);
        MaterialButton materialButton3 = (MaterialButton) view.findViewById(C5582R.C5586id.month_navigation_next);
        materialButton3.setTag(f18960d0);
        this.f18969U = view.findViewById(C5582R.C5586id.mtrl_calendar_year_selector_frame);
        this.f18970V = view.findViewById(C5582R.C5586id.mtrl_calendar_day_selector_frame);
        mo27159a(C6820k.DAY);
        materialButton.setText(this.f18964P.mo27122c());
        this.f18968T.addOnScrollListener(new C6816g(lVar, materialButton));
        materialButton.setOnClickListener(new C6817h());
        materialButton3.setOnClickListener(new C6818i(lVar));
        materialButton2.setOnClickListener(new C6819j(lVar));
    }

    /* renamed from: a */
    private void m32582a(int i) {
        this.f18968T.post(new C6810a(i));
    }
}
