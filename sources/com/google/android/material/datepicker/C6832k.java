package com.google.android.material.datepicker;

import android.content.Context;
import android.widget.BaseAdapter;
import androidx.annotation.C0195i0;

/* renamed from: com.google.android.material.datepicker.k */
/* compiled from: MonthAdapter */
class C6832k extends BaseAdapter {

    /* renamed from: P */
    static final int f19033P = C6840p.m32703h().getMaximum(4);

    /* renamed from: N */
    C6805b f19034N;

    /* renamed from: O */
    final CalendarConstraints f19035O;

    /* renamed from: a */
    final Month f19036a;

    /* renamed from: b */
    final DateSelector<?> f19037b;

    C6832k(Month month, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints) {
        this.f19036a = month;
        this.f19037b = dateSelector;
        this.f19035O = calendarConstraints;
    }

    /* renamed from: a */
    private void m32653a(Context context) {
        if (this.f19034N == null) {
            this.f19034N = new C6805b(context);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo27196b() {
        return (this.f19036a.mo27119b() + this.f19036a.f18908Q) - 1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo27198c(int i) {
        return (i + 1) % this.f19036a.f18907P == 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public int mo27199d(int i) {
        return (i - this.f19036a.mo27119b()) + 1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public boolean mo27200e(int i) {
        return i >= mo27194a() && i <= mo27196b();
    }

    public int getCount() {
        return this.f19036a.f18908Q + mo27194a();
    }

    public long getItemId(int i) {
        return (long) (i / this.f19036a.f18907P);
    }

    public boolean hasStableIds() {
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo27197b(int i) {
        return i % this.f19036a.f18907P == 0;
    }

    @C0195i0
    public Long getItem(int i) {
        if (i < this.f19036a.mo27119b() || i > mo27196b()) {
            return null;
        }
        return Long.valueOf(this.f19036a.mo27118a(mo27199d(i)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x006f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0070  */
    @androidx.annotation.C0193h0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.widget.TextView getView(int r6, @androidx.annotation.C0195i0 android.view.View r7, @androidx.annotation.C0193h0 android.view.ViewGroup r8) {
        /*
            r5 = this;
            android.content.Context r0 = r8.getContext()
            r5.m32653a(r0)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L_0x001e
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r0 = com.google.android.material.C5582R.layout.mtrl_calendar_day
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x001e:
            int r7 = r5.mo27194a()
            int r7 = r6 - r7
            r8 = 1
            if (r7 < 0) goto L_0x0061
            com.google.android.material.datepicker.Month r2 = r5.f19036a
            int r3 = r2.f18908Q
            if (r7 < r3) goto L_0x002e
            goto L_0x0061
        L_0x002e:
            int r7 = r7 + r8
            r0.setTag(r2)
            java.lang.String r2 = java.lang.String.valueOf(r7)
            r0.setText(r2)
            com.google.android.material.datepicker.Month r2 = r5.f19036a
            long r2 = r2.mo27118a(r7)
            com.google.android.material.datepicker.Month r7 = r5.f19036a
            int r7 = r7.f18906O
            com.google.android.material.datepicker.Month r4 = com.google.android.material.datepicker.Month.m32507k()
            int r4 = r4.f18906O
            if (r7 != r4) goto L_0x0053
            java.lang.String r7 = com.google.android.material.datepicker.C6807d.m32571c(r2)
            r0.setContentDescription(r7)
            goto L_0x005a
        L_0x0053:
            java.lang.String r7 = com.google.android.material.datepicker.C6807d.m32575e(r2)
            r0.setContentDescription(r7)
        L_0x005a:
            r0.setVisibility(r1)
            r0.setEnabled(r8)
            goto L_0x0069
        L_0x0061:
            r7 = 8
            r0.setVisibility(r7)
            r0.setEnabled(r1)
        L_0x0069:
            java.lang.Long r6 = r5.getItem(r6)
            if (r6 != 0) goto L_0x0070
            return r0
        L_0x0070:
            com.google.android.material.datepicker.CalendarConstraints r7 = r5.f19035O
            com.google.android.material.datepicker.CalendarConstraints$DateValidator r7 = r7.mo27074a()
            long r2 = r6.longValue()
            boolean r7 = r7.mo27085b(r2)
            if (r7 == 0) goto L_0x00d5
            r0.setEnabled(r8)
            com.google.android.material.datepicker.DateSelector<?> r7 = r5.f19037b
            java.util.Collection r7 = r7.mo27101g()
            java.util.Iterator r7 = r7.iterator()
        L_0x008d:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x00b5
            java.lang.Object r8 = r7.next()
            java.lang.Long r8 = (java.lang.Long) r8
            long r1 = r8.longValue()
            long r3 = r6.longValue()
            long r3 = com.google.android.material.datepicker.C6840p.m32679a(r3)
            long r1 = com.google.android.material.datepicker.C6840p.m32679a(r1)
            int r8 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r8 != 0) goto L_0x008d
            com.google.android.material.datepicker.b r6 = r5.f19034N
            com.google.android.material.datepicker.a r6 = r6.f18936b
            r6.mo27144a(r0)
            return r0
        L_0x00b5:
            java.util.Calendar r7 = com.google.android.material.datepicker.C6840p.m32699f()
            long r7 = r7.getTimeInMillis()
            long r1 = r6.longValue()
            int r6 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r6 != 0) goto L_0x00cd
            com.google.android.material.datepicker.b r6 = r5.f19034N
            com.google.android.material.datepicker.a r6 = r6.f18937c
            r6.mo27144a(r0)
            return r0
        L_0x00cd:
            com.google.android.material.datepicker.b r6 = r5.f19034N
            com.google.android.material.datepicker.a r6 = r6.f18935a
            r6.mo27144a(r0)
            return r0
        L_0x00d5:
            r0.setEnabled(r1)
            com.google.android.material.datepicker.b r6 = r5.f19034N
            com.google.android.material.datepicker.a r6 = r6.f18941g
            r6.mo27144a(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.C6832k.getView(int, android.view.View, android.view.ViewGroup):android.widget.TextView");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo27194a() {
        return this.f19036a.mo27119b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo27195a(int i) {
        return mo27194a() + (i - 1);
    }
}
