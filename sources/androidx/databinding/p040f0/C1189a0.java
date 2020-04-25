package androidx.databinding.p040f0;

import android.annotation.TargetApi;
import android.widget.Switch;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.databinding.C1179d;
import androidx.databinding.C1267g;
import androidx.databinding.C1268h;

@TargetApi(14)
@C0207n0({C0208a.LIBRARY})
@C1268h({@C1267g(attribute = "android:thumb", method = "setThumbDrawable", type = Switch.class), @C1267g(attribute = "android:track", method = "setTrackDrawable", type = Switch.class)})
/* renamed from: androidx.databinding.f0.a0 */
/* compiled from: SwitchBindingAdapter */
public class C1189a0 {
    @C1179d({"android:switchTextAppearance"})
    /* renamed from: a */
    public static void m6730a(Switch switchR, int i) {
        switchR.setSwitchTextAppearance(null, i);
    }
}
