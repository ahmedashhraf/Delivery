package com.google.android.material.datepicker;

import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import com.google.android.material.C5582R;
import java.util.Calendar;
import java.util.Locale;

/* renamed from: com.google.android.material.datepicker.e */
/* compiled from: DaysOfWeekAdapter */
class C6808e extends BaseAdapter {

    /* renamed from: O */
    private static final int f18948O = 4;

    /* renamed from: P */
    private static final int f18949P = (VERSION.SDK_INT >= 26 ? 4 : 1);

    /* renamed from: N */
    private final int f18950N = this.f18951a.getFirstDayOfWeek();
    @C0193h0

    /* renamed from: a */
    private final Calendar f18951a = C6840p.m32703h();

    /* renamed from: b */
    private final int f18952b = this.f18951a.getMaximum(7);

    /* renamed from: a */
    private int m32576a(int i) {
        int i2 = i + this.f18950N;
        int i3 = this.f18952b;
        return i2 > i3 ? i2 - i3 : i2;
    }

    public int getCount() {
        return this.f18952b;
    }

    public long getItemId(int i) {
        return 0;
    }

    @SuppressLint({"WrongConstant"})
    @C0195i0
    public View getView(int i, @C0195i0 View view, @C0193h0 ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(C5582R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        this.f18951a.set(7, m32576a(i));
        textView.setText(this.f18951a.getDisplayName(7, f18949P, Locale.getDefault()));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(C5582R.string.mtrl_picker_day_of_week_column_header), new Object[]{this.f18951a.getDisplayName(7, 2, Locale.getDefault())}));
        return textView;
    }

    @C0195i0
    public Integer getItem(int i) {
        if (i >= this.f18952b) {
            return null;
        }
        return Integer.valueOf(m32576a(i));
    }
}
