package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import java.util.Iterator;

@C0207n0({C0208a.LIBRARY_GROUP})
/* renamed from: com.google.android.material.datepicker.j */
/* compiled from: MaterialTextInputPicker */
public final class C6830j<S> extends C6837n<S> {

    /* renamed from: O */
    private static final String f19028O = "DATE_SELECTOR_KEY";

    /* renamed from: P */
    private static final String f19029P = "CALENDAR_CONSTRAINTS_KEY";
    @C0195i0

    /* renamed from: N */
    private CalendarConstraints f19030N;
    @C0195i0

    /* renamed from: b */
    private DateSelector<S> f19031b;

    /* renamed from: com.google.android.material.datepicker.j$a */
    /* compiled from: MaterialTextInputPicker */
    class C6831a implements C6836m<S> {
        C6831a() {
        }

        /* renamed from: a */
        public void mo27184a(S s) {
            Iterator it = C6830j.this.f19046a.iterator();
            while (it.hasNext()) {
                ((C6836m) it.next()).mo27184a(s);
            }
        }
    }

    @C0193h0
    /* renamed from: a */
    static <T> C6830j<T> m32650a(@C0193h0 DateSelector<T> dateSelector, @C0193h0 CalendarConstraints calendarConstraints) {
        C6830j<T> jVar = new C6830j<>();
        Bundle bundle = new Bundle();
        bundle.putParcelable(f19028O, dateSelector);
        bundle.putParcelable(f19029P, calendarConstraints);
        jVar.setArguments(bundle);
        return jVar;
    }

    public void onCreate(@C0195i0 Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f19031b = (DateSelector) bundle.getParcelable(f19028O);
        this.f19030N = (CalendarConstraints) bundle.getParcelable(f19029P);
    }

    @C0193h0
    public View onCreateView(@C0193h0 LayoutInflater layoutInflater, @C0195i0 ViewGroup viewGroup, @C0195i0 Bundle bundle) {
        return this.f19031b.mo27093a(layoutInflater, viewGroup, bundle, this.f19030N, new C6831a());
    }

    public void onSaveInstanceState(@C0193h0 Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable(f19028O, this.f19031b);
        bundle.putParcelable(f19029P, this.f19030N);
    }

    @C0193h0
    /* renamed from: x */
    public DateSelector<S> mo27160x() {
        DateSelector<S> dateSelector = this.f19031b;
        if (dateSelector != null) {
            return dateSelector;
        }
        throw new IllegalStateException("dateSelector should not be null. Use MaterialTextInputPicker#newInstance() to create this fragment with a DateSelector, and call this method after the fragment has been created.");
    }
}
