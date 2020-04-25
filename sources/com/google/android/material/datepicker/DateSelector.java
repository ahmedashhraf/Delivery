package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.C0214q0;
import androidx.annotation.C0216r0;
import androidx.core.p033k.C0938f;
import java.util.Collection;

@C0207n0({C0208a.LIBRARY_GROUP})
public interface DateSelector<S> extends Parcelable {
    @C0193h0
    /* renamed from: a */
    View mo27093a(@C0193h0 LayoutInflater layoutInflater, @C0195i0 ViewGroup viewGroup, @C0195i0 Bundle bundle, @C0193h0 CalendarConstraints calendarConstraints, @C0193h0 C6836m<S> mVar);

    @C0193h0
    /* renamed from: a */
    String mo27094a(Context context);

    /* renamed from: a */
    void mo27095a(long j);

    /* renamed from: a */
    void mo27096a(@C0193h0 S s);

    @C0216r0
    /* renamed from: b */
    int mo27097b(Context context);

    @C0193h0
    /* renamed from: d */
    Collection<C0938f<Long, Long>> mo27098d();

    @C0214q0
    /* renamed from: e */
    int mo27099e();

    /* renamed from: f */
    boolean mo27100f();

    @C0193h0
    /* renamed from: g */
    Collection<Long> mo27101g();

    @C0195i0
    /* renamed from: h */
    S mo27102h();
}
