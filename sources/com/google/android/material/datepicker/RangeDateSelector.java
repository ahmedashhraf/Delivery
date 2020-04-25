package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.core.p033k.C0938f;
import androidx.core.p033k.C0944i;
import com.fasterxml.jackson.core.p162w.C3868i;
import com.google.android.material.C5582R;
import com.google.android.material.internal.C6900g;
import com.google.android.material.internal.C6936w;
import com.google.android.material.p302m.C6951b;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;

@C0207n0({C0208a.LIBRARY_GROUP})
public class RangeDateSelector implements DateSelector<C0938f<Long, Long>> {
    public static final Creator<RangeDateSelector> CREATOR = new C6801c();
    /* access modifiers changed from: private */
    @C0195i0

    /* renamed from: N */
    public Long f18912N = null;
    /* access modifiers changed from: private */
    @C0195i0

    /* renamed from: O */
    public Long f18913O = null;
    /* access modifiers changed from: private */
    @C0195i0

    /* renamed from: P */
    public Long f18914P = null;
    /* access modifiers changed from: private */
    @C0195i0

    /* renamed from: Q */
    public Long f18915Q = null;

    /* renamed from: a */
    private String f18916a;

    /* renamed from: b */
    private final String f18917b = C3868i.f12248b;

    /* renamed from: com.google.android.material.datepicker.RangeDateSelector$a */
    class C6799a extends C6806c {

        /* renamed from: Q */
        final /* synthetic */ TextInputLayout f18918Q;

        /* renamed from: R */
        final /* synthetic */ TextInputLayout f18919R;

        /* renamed from: S */
        final /* synthetic */ C6836m f18920S;

        C6799a(String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, C6836m mVar) {
            this.f18918Q = textInputLayout2;
            this.f18919R = textInputLayout3;
            this.f18920S = mVar;
            super(str, dateFormat, textInputLayout, calendarConstraints);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo27135a(@C0195i0 Long l) {
            RangeDateSelector.this.f18914P = l;
            RangeDateSelector.this.m32518a(this.f18918Q, this.f18919R, this.f18920S);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo27134a() {
            RangeDateSelector.this.f18914P = null;
            RangeDateSelector.this.m32518a(this.f18918Q, this.f18919R, this.f18920S);
        }
    }

    /* renamed from: com.google.android.material.datepicker.RangeDateSelector$b */
    class C6800b extends C6806c {

        /* renamed from: Q */
        final /* synthetic */ TextInputLayout f18922Q;

        /* renamed from: R */
        final /* synthetic */ TextInputLayout f18923R;

        /* renamed from: S */
        final /* synthetic */ C6836m f18924S;

        C6800b(String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, C6836m mVar) {
            this.f18922Q = textInputLayout2;
            this.f18923R = textInputLayout3;
            this.f18924S = mVar;
            super(str, dateFormat, textInputLayout, calendarConstraints);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo27135a(@C0195i0 Long l) {
            RangeDateSelector.this.f18915Q = l;
            RangeDateSelector.this.m32518a(this.f18922Q, this.f18923R, this.f18924S);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo27134a() {
            RangeDateSelector.this.f18915Q = null;
            RangeDateSelector.this.m32518a(this.f18922Q, this.f18923R, this.f18924S);
        }
    }

    /* renamed from: com.google.android.material.datepicker.RangeDateSelector$c */
    static class C6801c implements Creator<RangeDateSelector> {
        C6801c() {
        }

        @C0193h0
        public RangeDateSelector createFromParcel(@C0193h0 Parcel parcel) {
            RangeDateSelector rangeDateSelector = new RangeDateSelector();
            rangeDateSelector.f18912N = (Long) parcel.readValue(Long.class.getClassLoader());
            rangeDateSelector.f18913O = (Long) parcel.readValue(Long.class.getClassLoader());
            return rangeDateSelector;
        }

        @C0193h0
        public RangeDateSelector[] newArray(int i) {
            return new RangeDateSelector[i];
        }
    }

    /* renamed from: a */
    private boolean m32519a(long j, long j2) {
        return j <= j2;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public int mo27099e() {
        return C5582R.string.mtrl_picker_range_header_title;
    }

    /* renamed from: f */
    public boolean mo27100f() {
        Long l = this.f18912N;
        return (l == null || this.f18913O == null || !m32519a(l.longValue(), this.f18913O.longValue())) ? false : true;
    }

    @C0193h0
    /* renamed from: g */
    public Collection<Long> mo27101g() {
        ArrayList arrayList = new ArrayList();
        Long l = this.f18912N;
        if (l != null) {
            arrayList.add(l);
        }
        Long l2 = this.f18913O;
        if (l2 != null) {
            arrayList.add(l2);
        }
        return arrayList;
    }

    public void writeToParcel(@C0193h0 Parcel parcel, int i) {
        parcel.writeValue(this.f18912N);
        parcel.writeValue(this.f18913O);
    }

    /* renamed from: b */
    public int mo27097b(@C0193h0 Context context) {
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        return C6951b.m33329b(context, Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels) > resources.getDimensionPixelSize(C5582R.dimen.mtrl_calendar_maximum_default_fullscreen_minor_axis) ? C5582R.attr.materialCalendarTheme : C5582R.attr.materialCalendarFullscreenTheme, C6822g.class.getCanonicalName());
    }

    @C0193h0
    /* renamed from: d */
    public Collection<C0938f<Long, Long>> mo27098d() {
        if (this.f18912N == null || this.f18913O == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C0938f(this.f18912N, this.f18913O));
        return arrayList;
    }

    @C0193h0
    /* renamed from: h */
    public C0938f<Long, Long> m32535h() {
        return new C0938f<>(this.f18912N, this.f18913O);
    }

    /* renamed from: a */
    public void mo27095a(long j) {
        Long l = this.f18912N;
        if (l == null) {
            this.f18912N = Long.valueOf(j);
        } else if (this.f18913O != null || !m32519a(l.longValue(), j)) {
            this.f18913O = null;
            this.f18912N = Long.valueOf(j);
        } else {
            this.f18913O = Long.valueOf(j);
        }
    }

    /* renamed from: a */
    public void mo27096a(@C0193h0 C0938f<Long, Long> fVar) {
        Long l;
        F f = fVar.f4243a;
        if (!(f == null || fVar.f4244b == null)) {
            C0944i.m5339a(m32519a(((Long) f).longValue(), ((Long) fVar.f4244b).longValue()));
        }
        F f2 = fVar.f4243a;
        Long l2 = null;
        if (f2 == null) {
            l = null;
        } else {
            l = Long.valueOf(C6840p.m32679a(((Long) f2).longValue()));
        }
        this.f18912N = l;
        S s = fVar.f4244b;
        if (s != null) {
            l2 = Long.valueOf(C6840p.m32679a(((Long) s).longValue()));
        }
        this.f18913O = l2;
    }

    /* renamed from: b */
    private void m32521b(@C0193h0 TextInputLayout textInputLayout, @C0193h0 TextInputLayout textInputLayout2) {
        textInputLayout.setError(this.f18916a);
        textInputLayout2.setError(C3868i.f12248b);
    }

    @C0193h0
    /* renamed from: a */
    public String mo27094a(@C0193h0 Context context) {
        Resources resources = context.getResources();
        if (this.f18912N == null && this.f18913O == null) {
            return resources.getString(C5582R.string.mtrl_picker_range_header_unselected);
        }
        Long l = this.f18913O;
        if (l == null) {
            return resources.getString(C5582R.string.mtrl_picker_range_header_only_start_selected, new Object[]{C6807d.m32566a(this.f18912N.longValue())});
        }
        Long l2 = this.f18912N;
        if (l2 == null) {
            return resources.getString(C5582R.string.mtrl_picker_range_header_only_end_selected, new Object[]{C6807d.m32566a(l.longValue())});
        }
        C0938f a = C6807d.m32564a(l2, l);
        return resources.getString(C5582R.string.mtrl_picker_range_header_selected, new Object[]{a.f4243a, a.f4244b});
    }

    /* renamed from: a */
    public View mo27093a(@C0193h0 LayoutInflater layoutInflater, @C0195i0 ViewGroup viewGroup, @C0195i0 Bundle bundle, CalendarConstraints calendarConstraints, @C0193h0 C6836m<C0938f<Long, Long>> mVar) {
        View inflate = layoutInflater.inflate(C5582R.layout.mtrl_picker_text_input_date_range, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) inflate.findViewById(C5582R.C5586id.mtrl_picker_text_input_range_start);
        TextInputLayout textInputLayout2 = (TextInputLayout) inflate.findViewById(C5582R.C5586id.mtrl_picker_text_input_range_end);
        EditText editText = textInputLayout.getEditText();
        EditText editText2 = textInputLayout2.getEditText();
        if (C6900g.m33159a()) {
            editText.setInputType(17);
            editText2.setInputType(17);
        }
        this.f18916a = inflate.getResources().getString(C5582R.string.mtrl_picker_invalid_range);
        SimpleDateFormat d = C6840p.m32695d();
        Long l = this.f18912N;
        if (l != null) {
            editText.setText(d.format(l));
            this.f18914P = this.f18912N;
        }
        Long l2 = this.f18913O;
        if (l2 != null) {
            editText2.setText(d.format(l2));
            this.f18915Q = this.f18913O;
        }
        String a = C6840p.m32682a(inflate.getResources(), d);
        SimpleDateFormat simpleDateFormat = d;
        CalendarConstraints calendarConstraints2 = calendarConstraints;
        TextInputLayout textInputLayout3 = textInputLayout;
        TextInputLayout textInputLayout4 = textInputLayout2;
        C6799a aVar = r0;
        C6836m<C0938f<Long, Long>> mVar2 = mVar;
        C6799a aVar2 = new C6799a(a, simpleDateFormat, textInputLayout, calendarConstraints2, textInputLayout3, textInputLayout4, mVar2);
        editText.addTextChangedListener(aVar);
        C6800b bVar = new C6800b(a, simpleDateFormat, textInputLayout2, calendarConstraints2, textInputLayout3, textInputLayout4, mVar2);
        editText2.addTextChangedListener(bVar);
        C6936w.m33303g(editText);
        return inflate;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m32518a(@C0193h0 TextInputLayout textInputLayout, @C0193h0 TextInputLayout textInputLayout2, @C0193h0 C6836m<C0938f<Long, Long>> mVar) {
        Long l = this.f18914P;
        if (l == null || this.f18915Q == null) {
            m32517a(textInputLayout, textInputLayout2);
            return;
        }
        if (m32519a(l.longValue(), this.f18915Q.longValue())) {
            this.f18912N = this.f18914P;
            this.f18913O = this.f18915Q;
            mVar.mo27184a(m32535h());
        } else {
            m32521b(textInputLayout, textInputLayout2);
        }
    }

    /* renamed from: a */
    private void m32517a(@C0193h0 TextInputLayout textInputLayout, @C0193h0 TextInputLayout textInputLayout2) {
        if (textInputLayout.getError() != null && this.f18916a.contentEquals(textInputLayout.getError())) {
            textInputLayout.setError(null);
        }
        if (textInputLayout2.getError() != null) {
            if (C3868i.f12248b.contentEquals(textInputLayout2.getError())) {
                textInputLayout2.setError(null);
            }
        }
    }
}
