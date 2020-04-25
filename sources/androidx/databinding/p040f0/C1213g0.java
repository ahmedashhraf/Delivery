package androidx.databinding.p040f0;

import android.os.Build.VERSION;
import android.widget.TimePicker;
import android.widget.TimePicker.OnTimeChangedListener;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.databinding.C1179d;
import androidx.databinding.C1285n;
import androidx.databinding.C1286o;

@C0207n0({C0208a.LIBRARY})
/* renamed from: androidx.databinding.f0.g0 */
/* compiled from: TimePickerBindingAdapter */
public class C1213g0 {

    /* renamed from: androidx.databinding.f0.g0$a */
    /* compiled from: TimePickerBindingAdapter */
    static class C1214a implements OnTimeChangedListener {

        /* renamed from: N */
        final /* synthetic */ C1286o f5093N;

        /* renamed from: a */
        final /* synthetic */ OnTimeChangedListener f5094a;

        /* renamed from: b */
        final /* synthetic */ C1286o f5095b;

        C1214a(OnTimeChangedListener onTimeChangedListener, C1286o oVar, C1286o oVar2) {
            this.f5094a = onTimeChangedListener;
            this.f5095b = oVar;
            this.f5093N = oVar2;
        }

        public void onTimeChanged(TimePicker timePicker, int i, int i2) {
            OnTimeChangedListener onTimeChangedListener = this.f5094a;
            if (onTimeChangedListener != null) {
                onTimeChangedListener.onTimeChanged(timePicker, i, i2);
            }
            C1286o oVar = this.f5095b;
            if (oVar != null) {
                oVar.mo5680a();
            }
            C1286o oVar2 = this.f5093N;
            if (oVar2 != null) {
                oVar2.mo5680a();
            }
        }
    }

    @C1179d({"android:hour"})
    /* renamed from: a */
    public static void m6782a(TimePicker timePicker, int i) {
        if (VERSION.SDK_INT >= 23) {
            if (timePicker.getHour() != i) {
                timePicker.setHour(i);
            }
        } else if (timePicker.getCurrentHour().intValue() != i) {
            timePicker.setCurrentHour(Integer.valueOf(i));
        }
    }

    @C1179d({"android:minute"})
    /* renamed from: b */
    public static void m6785b(TimePicker timePicker, int i) {
        if (VERSION.SDK_INT >= 23) {
            if (timePicker.getMinute() != i) {
                timePicker.setMinute(i);
            }
        } else if (timePicker.getCurrentMinute().intValue() != i) {
            timePicker.setCurrentHour(Integer.valueOf(i));
        }
    }

    @C1285n(attribute = "android:hour")
    /* renamed from: a */
    public static int m6781a(TimePicker timePicker) {
        if (VERSION.SDK_INT >= 23) {
            return timePicker.getHour();
        }
        Integer currentHour = timePicker.getCurrentHour();
        if (currentHour == null) {
            return 0;
        }
        return currentHour.intValue();
    }

    @C1285n(attribute = "android:minute")
    /* renamed from: b */
    public static int m6784b(TimePicker timePicker) {
        if (VERSION.SDK_INT >= 23) {
            return timePicker.getMinute();
        }
        Integer currentMinute = timePicker.getCurrentMinute();
        if (currentMinute == null) {
            return 0;
        }
        return currentMinute.intValue();
    }

    @C1179d(requireAll = false, value = {"android:onTimeChanged", "android:hourAttrChanged", "android:minuteAttrChanged"})
    /* renamed from: a */
    public static void m6783a(TimePicker timePicker, OnTimeChangedListener onTimeChangedListener, C1286o oVar, C1286o oVar2) {
        if (oVar == null && oVar2 == null) {
            timePicker.setOnTimeChangedListener(onTimeChangedListener);
        } else {
            timePicker.setOnTimeChangedListener(new C1214a(onTimeChangedListener, oVar, oVar2));
        }
    }
}
