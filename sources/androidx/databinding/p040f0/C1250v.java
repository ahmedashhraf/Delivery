package androidx.databinding.p040f0;

import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.databinding.C1179d;
import androidx.databinding.C1286o;
import androidx.databinding.C1287p;
import androidx.databinding.C1288q;

@C0207n0({C0208a.LIBRARY})
@C1288q({@C1287p(attribute = "android:checkedButton", method = "getCheckedRadioButtonId", type = RadioGroup.class)})
/* renamed from: androidx.databinding.f0.v */
/* compiled from: RadioGroupBindingAdapter */
public class C1250v {

    /* renamed from: androidx.databinding.f0.v$a */
    /* compiled from: RadioGroupBindingAdapter */
    static class C1251a implements OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ OnCheckedChangeListener f5123a;

        /* renamed from: b */
        final /* synthetic */ C1286o f5124b;

        C1251a(OnCheckedChangeListener onCheckedChangeListener, C1286o oVar) {
            this.f5123a = onCheckedChangeListener;
            this.f5124b = oVar;
        }

        public void onCheckedChanged(RadioGroup radioGroup, int i) {
            OnCheckedChangeListener onCheckedChangeListener = this.f5123a;
            if (onCheckedChangeListener != null) {
                onCheckedChangeListener.onCheckedChanged(radioGroup, i);
            }
            this.f5124b.mo5680a();
        }
    }

    @C1179d({"android:checkedButton"})
    /* renamed from: a */
    public static void m6831a(RadioGroup radioGroup, int i) {
        if (i != radioGroup.getCheckedRadioButtonId()) {
            radioGroup.check(i);
        }
    }

    @C1179d(requireAll = false, value = {"android:onCheckedChanged", "android:checkedButtonAttrChanged"})
    /* renamed from: a */
    public static void m6832a(RadioGroup radioGroup, OnCheckedChangeListener onCheckedChangeListener, C1286o oVar) {
        if (oVar == null) {
            radioGroup.setOnCheckedChangeListener(onCheckedChangeListener);
        } else {
            radioGroup.setOnCheckedChangeListener(new C1251a(onCheckedChangeListener, oVar));
        }
    }
}
