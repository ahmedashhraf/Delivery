package androidx.databinding.p040f0;

import android.widget.CalendarView;
import android.widget.CalendarView.OnDateChangeListener;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.databinding.C1179d;
import androidx.databinding.C1286o;
import androidx.databinding.C1287p;
import androidx.databinding.C1288q;

@C0207n0({C0208a.LIBRARY})
@C1288q({@C1287p(attribute = "android:date", type = CalendarView.class)})
/* renamed from: androidx.databinding.f0.g */
/* compiled from: CalendarViewBindingAdapter */
public class C1211g {

    /* renamed from: androidx.databinding.f0.g$a */
    /* compiled from: CalendarViewBindingAdapter */
    static class C1212a implements OnDateChangeListener {

        /* renamed from: a */
        final /* synthetic */ OnDateChangeListener f5091a;

        /* renamed from: b */
        final /* synthetic */ C1286o f5092b;

        C1212a(OnDateChangeListener onDateChangeListener, C1286o oVar) {
            this.f5091a = onDateChangeListener;
            this.f5092b = oVar;
        }

        public void onSelectedDayChange(CalendarView calendarView, int i, int i2, int i3) {
            OnDateChangeListener onDateChangeListener = this.f5091a;
            if (onDateChangeListener != null) {
                onDateChangeListener.onSelectedDayChange(calendarView, i, i2, i3);
            }
            this.f5092b.mo5680a();
        }
    }

    @C1179d({"android:date"})
    /* renamed from: a */
    public static void m6779a(CalendarView calendarView, long j) {
        if (calendarView.getDate() != j) {
            calendarView.setDate(j);
        }
    }

    @C1179d(requireAll = false, value = {"android:onSelectedDayChange", "android:dateAttrChanged"})
    /* renamed from: a */
    public static void m6780a(CalendarView calendarView, OnDateChangeListener onDateChangeListener, C1286o oVar) {
        if (oVar == null) {
            calendarView.setOnDateChangeListener(onDateChangeListener);
        } else {
            calendarView.setOnDateChangeListener(new C1212a(onDateChangeListener, oVar));
        }
    }
}
