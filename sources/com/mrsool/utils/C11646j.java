package com.mrsool.utils;

import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.app.Dialog;
import android.os.Bundle;
import androidx.fragment.app.C1374b;
import java.util.Calendar;

/* renamed from: com.mrsool.utils.j */
/* compiled from: DatePickerDialogFragment */
public class C11646j extends C1374b {

    /* renamed from: N */
    private Calendar f33476N;

    /* renamed from: O */
    private Calendar f33477O;

    /* renamed from: a */
    private OnDateSetListener f33478a;

    /* renamed from: b */
    private Calendar f33479b;

    public C11646j(OnDateSetListener onDateSetListener, Calendar calendar, Calendar calendar2, Calendar calendar3) {
        this.f33478a = onDateSetListener;
        this.f33479b = calendar;
        this.f33476N = calendar2;
        this.f33477O = calendar3;
    }

    public Dialog onCreateDialog(Bundle bundle) {
        DatePickerDialog datePickerDialog = new DatePickerDialog(getActivity(), this.f33478a, this.f33479b.get(1), this.f33479b.get(2), this.f33479b.get(5));
        datePickerDialog.setCancelable(false);
        if (this.f33476N != null) {
            datePickerDialog.getDatePicker().setMaxDate(this.f33476N.getTimeInMillis());
        }
        if (this.f33477O != null) {
            datePickerDialog.getDatePicker().setMinDate(this.f33477O.getTimeInMillis());
        }
        return datePickerDialog;
    }
}
