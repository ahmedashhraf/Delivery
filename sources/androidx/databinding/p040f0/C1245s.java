package androidx.databinding.p040f0;

import android.widget.NumberPicker;
import android.widget.NumberPicker.OnValueChangeListener;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.databinding.C1179d;
import androidx.databinding.C1267g;
import androidx.databinding.C1268h;
import androidx.databinding.C1286o;
import androidx.databinding.C1287p;
import androidx.databinding.C1288q;

@C0207n0({C0208a.LIBRARY})
@C1268h({@C1267g(attribute = "android:format", method = "setFormatter", type = NumberPicker.class), @C1267g(attribute = "android:onScrollStateChange", method = "setOnScrollListener", type = NumberPicker.class)})
@C1288q({@C1287p(attribute = "android:value", type = NumberPicker.class)})
/* renamed from: androidx.databinding.f0.s */
/* compiled from: NumberPickerBindingAdapter */
public class C1245s {

    /* renamed from: androidx.databinding.f0.s$a */
    /* compiled from: NumberPickerBindingAdapter */
    static class C1246a implements OnValueChangeListener {

        /* renamed from: a */
        final /* synthetic */ OnValueChangeListener f5113a;

        /* renamed from: b */
        final /* synthetic */ C1286o f5114b;

        C1246a(OnValueChangeListener onValueChangeListener, C1286o oVar) {
            this.f5113a = onValueChangeListener;
            this.f5114b = oVar;
        }

        public void onValueChange(NumberPicker numberPicker, int i, int i2) {
            OnValueChangeListener onValueChangeListener = this.f5113a;
            if (onValueChangeListener != null) {
                onValueChangeListener.onValueChange(numberPicker, i, i2);
            }
            this.f5114b.mo5680a();
        }
    }

    @C1179d({"android:value"})
    /* renamed from: a */
    public static void m6822a(NumberPicker numberPicker, int i) {
        if (numberPicker.getValue() != i) {
            numberPicker.setValue(i);
        }
    }

    @C1179d(requireAll = false, value = {"android:onValueChange", "android:valueAttrChanged"})
    /* renamed from: a */
    public static void m6823a(NumberPicker numberPicker, OnValueChangeListener onValueChangeListener, C1286o oVar) {
        if (oVar == null) {
            numberPicker.setOnValueChangedListener(onValueChangeListener);
        } else {
            numberPicker.setOnValueChangedListener(new C1246a(onValueChangeListener, oVar));
        }
    }
}
