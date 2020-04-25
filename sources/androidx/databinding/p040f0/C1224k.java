package androidx.databinding.p040f0;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.databinding.C1179d;
import androidx.databinding.C1267g;
import androidx.databinding.C1268h;
import androidx.databinding.C1286o;
import androidx.databinding.C1287p;
import androidx.databinding.C1288q;

@C0207n0({C0208a.LIBRARY})
@C1268h({@C1267g(attribute = "android:buttonTint", method = "setButtonTintList", type = CompoundButton.class), @C1267g(attribute = "android:onCheckedChanged", method = "setOnCheckedChangeListener", type = CompoundButton.class)})
@C1288q({@C1287p(attribute = "android:checked", type = CompoundButton.class)})
/* renamed from: androidx.databinding.f0.k */
/* compiled from: CompoundButtonBindingAdapter */
public class C1224k {

    /* renamed from: androidx.databinding.f0.k$a */
    /* compiled from: CompoundButtonBindingAdapter */
    static class C1225a implements OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ OnCheckedChangeListener f5101a;

        /* renamed from: b */
        final /* synthetic */ C1286o f5102b;

        C1225a(OnCheckedChangeListener onCheckedChangeListener, C1286o oVar) {
            this.f5101a = onCheckedChangeListener;
            this.f5102b = oVar;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            OnCheckedChangeListener onCheckedChangeListener = this.f5101a;
            if (onCheckedChangeListener != null) {
                onCheckedChangeListener.onCheckedChanged(compoundButton, z);
            }
            this.f5102b.mo5680a();
        }
    }

    @C1179d({"android:checked"})
    /* renamed from: a */
    public static void m6808a(CompoundButton compoundButton, boolean z) {
        if (compoundButton.isChecked() != z) {
            compoundButton.setChecked(z);
        }
    }

    @C1179d(requireAll = false, value = {"android:onCheckedChanged", "android:checkedAttrChanged"})
    /* renamed from: a */
    public static void m6807a(CompoundButton compoundButton, OnCheckedChangeListener onCheckedChangeListener, C1286o oVar) {
        if (oVar == null) {
            compoundButton.setOnCheckedChangeListener(onCheckedChangeListener);
        } else {
            compoundButton.setOnCheckedChangeListener(new C1225a(onCheckedChangeListener, oVar));
        }
    }
}
