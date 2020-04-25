package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.core.p033k.C0938f;
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
public class SingleDateSelector implements DateSelector<Long> {
    public static final Creator<SingleDateSelector> CREATOR = new C6803b();
    /* access modifiers changed from: private */
    @C0195i0

    /* renamed from: a */
    public Long f18926a;

    /* renamed from: com.google.android.material.datepicker.SingleDateSelector$a */
    class C6802a extends C6806c {

        /* renamed from: Q */
        final /* synthetic */ C6836m f18927Q;

        C6802a(String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, C6836m mVar) {
            this.f18927Q = mVar;
            super(str, dateFormat, textInputLayout, calendarConstraints);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo27135a(@C0195i0 Long l) {
            if (l == null) {
                SingleDateSelector.this.m32541a();
            } else {
                SingleDateSelector.this.mo27095a(l.longValue());
            }
            this.f18927Q.mo27184a(SingleDateSelector.this.m32554h());
        }
    }

    /* renamed from: com.google.android.material.datepicker.SingleDateSelector$b */
    static class C6803b implements Creator<SingleDateSelector> {
        C6803b() {
        }

        @C0193h0
        public SingleDateSelector createFromParcel(@C0193h0 Parcel parcel) {
            SingleDateSelector singleDateSelector = new SingleDateSelector();
            singleDateSelector.f18926a = (Long) parcel.readValue(Long.class.getClassLoader());
            return singleDateSelector;
        }

        @C0193h0
        public SingleDateSelector[] newArray(int i) {
            return new SingleDateSelector[i];
        }
    }

    /* renamed from: b */
    public int mo27097b(Context context) {
        return C6951b.m33329b(context, C5582R.attr.materialCalendarTheme, C6822g.class.getCanonicalName());
    }

    @C0193h0
    /* renamed from: d */
    public Collection<C0938f<Long, Long>> mo27098d() {
        return new ArrayList();
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public int mo27099e() {
        return C5582R.string.mtrl_picker_date_header_title;
    }

    /* renamed from: f */
    public boolean mo27100f() {
        return this.f18926a != null;
    }

    @C0193h0
    /* renamed from: g */
    public Collection<Long> mo27101g() {
        ArrayList arrayList = new ArrayList();
        Long l = this.f18926a;
        if (l != null) {
            arrayList.add(l);
        }
        return arrayList;
    }

    public void writeToParcel(@C0193h0 Parcel parcel, int i) {
        parcel.writeValue(this.f18926a);
    }

    @C0195i0
    /* renamed from: h */
    public Long m32554h() {
        return this.f18926a;
    }

    /* renamed from: a */
    public void mo27095a(long j) {
        this.f18926a = Long.valueOf(j);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m32541a() {
        this.f18926a = null;
    }

    /* renamed from: a */
    public void mo27096a(@C0195i0 Long l) {
        this.f18926a = l == null ? null : Long.valueOf(C6840p.m32679a(l.longValue()));
    }

    /* renamed from: a */
    public View mo27093a(@C0193h0 LayoutInflater layoutInflater, @C0195i0 ViewGroup viewGroup, @C0195i0 Bundle bundle, CalendarConstraints calendarConstraints, @C0193h0 C6836m<Long> mVar) {
        View inflate = layoutInflater.inflate(C5582R.layout.mtrl_picker_text_input_date, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) inflate.findViewById(C5582R.C5586id.mtrl_picker_text_input_date);
        EditText editText = textInputLayout.getEditText();
        if (C6900g.m33159a()) {
            editText.setInputType(17);
        }
        SimpleDateFormat d = C6840p.m32695d();
        String a = C6840p.m32682a(inflate.getResources(), d);
        Long l = this.f18926a;
        if (l != null) {
            editText.setText(d.format(l));
        }
        C6802a aVar = new C6802a(a, d, textInputLayout, calendarConstraints, mVar);
        editText.addTextChangedListener(aVar);
        C6936w.m33303g(editText);
        return inflate;
    }

    @C0193h0
    /* renamed from: a */
    public String mo27094a(@C0193h0 Context context) {
        Resources resources = context.getResources();
        Long l = this.f18926a;
        if (l == null) {
            return resources.getString(C5582R.string.mtrl_picker_date_header_unselected);
        }
        String d = C6807d.m32573d(l.longValue());
        return resources.getString(C5582R.string.mtrl_picker_date_header_selected, new Object[]{d});
    }
}
