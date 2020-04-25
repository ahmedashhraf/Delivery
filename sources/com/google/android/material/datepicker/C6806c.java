package com.google.android.material.datepicker;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import com.google.android.material.C5582R;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

/* renamed from: com.google.android.material.datepicker.c */
/* compiled from: DateFormatTextWatcher */
abstract class C6806c implements TextWatcher {
    @C0193h0

    /* renamed from: N */
    private final TextInputLayout f18943N;

    /* renamed from: O */
    private final CalendarConstraints f18944O;

    /* renamed from: P */
    private final String f18945P;

    /* renamed from: a */
    private final String f18946a;

    /* renamed from: b */
    private final DateFormat f18947b;

    C6806c(String str, DateFormat dateFormat, @C0193h0 TextInputLayout textInputLayout, CalendarConstraints calendarConstraints) {
        this.f18946a = str;
        this.f18947b = dateFormat;
        this.f18943N = textInputLayout;
        this.f18944O = calendarConstraints;
        this.f18945P = textInputLayout.getContext().getString(C5582R.string.mtrl_picker_out_of_range);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo27134a() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo27135a(@C0195i0 Long l);

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(@C0193h0 CharSequence charSequence, int i, int i2, int i3) {
        if (TextUtils.isEmpty(charSequence)) {
            this.f18943N.setError(null);
            mo27135a(null);
            return;
        }
        try {
            Date parse = this.f18947b.parse(charSequence.toString());
            this.f18943N.setError(null);
            long time = parse.getTime();
            if (!this.f18944O.mo27074a().mo27085b(time) || !this.f18944O.mo27077c(time)) {
                this.f18943N.setError(String.format(this.f18945P, new Object[]{C6807d.m32566a(time)}));
                mo27134a();
            } else {
                mo27135a(Long.valueOf(parse.getTime()));
            }
        } catch (ParseException unused) {
            String string = this.f18943N.getContext().getString(C5582R.string.mtrl_picker_invalid_format);
            String format = String.format(this.f18943N.getContext().getString(C5582R.string.mtrl_picker_invalid_format_use), new Object[]{this.f18946a});
            String format2 = String.format(this.f18943N.getContext().getString(C5582R.string.mtrl_picker_invalid_format_example), new Object[]{this.f18947b.format(new Date(C6840p.m32699f().getTimeInMillis()))});
            TextInputLayout textInputLayout = this.f18943N;
            StringBuilder sb = new StringBuilder();
            sb.append(string);
            String str = "\n";
            sb.append(str);
            sb.append(format);
            sb.append(str);
            sb.append(format2);
            textInputLayout.setError(sb.toString());
            mo27134a();
        }
    }
}
