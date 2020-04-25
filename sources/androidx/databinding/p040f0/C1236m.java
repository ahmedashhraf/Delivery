package androidx.databinding.p040f0;

import android.widget.DatePicker;
import android.widget.DatePicker.OnDateChangedListener;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.databinding.C1179d;
import androidx.databinding.C1286o;
import androidx.databinding.C1287p;
import androidx.databinding.C1288q;
import androidx.databinding.library.baseAdapters.C1277R;

@C0207n0({C0208a.LIBRARY})
@C1288q({@C1287p(attribute = "android:year", type = DatePicker.class), @C1287p(attribute = "android:month", type = DatePicker.class), @C1287p(attribute = "android:day", method = "getDayOfMonth", type = DatePicker.class)})
/* renamed from: androidx.databinding.f0.m */
/* compiled from: DatePickerBindingAdapter */
public class C1236m {

    /* renamed from: androidx.databinding.f0.m$b */
    /* compiled from: DatePickerBindingAdapter */
    private static class C1238b implements OnDateChangedListener {

        /* renamed from: N */
        C1286o f5108N;

        /* renamed from: O */
        C1286o f5109O;

        /* renamed from: a */
        OnDateChangedListener f5110a;

        /* renamed from: b */
        C1286o f5111b;

        private C1238b() {
        }

        /* renamed from: a */
        public void mo5635a(OnDateChangedListener onDateChangedListener, C1286o oVar, C1286o oVar2, C1286o oVar3) {
            this.f5110a = onDateChangedListener;
            this.f5111b = oVar;
            this.f5108N = oVar2;
            this.f5109O = oVar3;
        }

        public void onDateChanged(DatePicker datePicker, int i, int i2, int i3) {
            OnDateChangedListener onDateChangedListener = this.f5110a;
            if (onDateChangedListener != null) {
                onDateChangedListener.onDateChanged(datePicker, i, i2, i3);
            }
            C1286o oVar = this.f5111b;
            if (oVar != null) {
                oVar.mo5680a();
            }
            C1286o oVar2 = this.f5108N;
            if (oVar2 != null) {
                oVar2.mo5680a();
            }
            C1286o oVar3 = this.f5109O;
            if (oVar3 != null) {
                oVar3.mo5680a();
            }
        }
    }

    @C1179d(requireAll = false, value = {"android:year", "android:month", "android:day", "android:onDateChanged", "android:yearAttrChanged", "android:monthAttrChanged", "android:dayAttrChanged"})
    /* renamed from: a */
    public static void m6815a(DatePicker datePicker, int i, int i2, int i3, OnDateChangedListener onDateChangedListener, C1286o oVar, C1286o oVar2, C1286o oVar3) {
        if (i == 0) {
            i = datePicker.getYear();
        }
        if (i3 == 0) {
            i3 = datePicker.getDayOfMonth();
        }
        if (oVar == null && oVar2 == null && oVar3 == null) {
            datePicker.init(i, i2, i3, onDateChangedListener);
            return;
        }
        C1238b bVar = (C1238b) C1244r.m6820a(datePicker, C1277R.C1278id.onDateChanged);
        if (bVar == null) {
            bVar = new C1238b();
            C1244r.m6821a(datePicker, bVar, C1277R.C1278id.onDateChanged);
        }
        bVar.mo5635a(onDateChangedListener, oVar, oVar2, oVar3);
        datePicker.init(i, i2, i3, bVar);
    }
}
