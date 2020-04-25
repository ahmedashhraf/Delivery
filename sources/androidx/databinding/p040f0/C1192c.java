package androidx.databinding.p040f0;

import android.widget.AbsSpinner;
import android.widget.ArrayAdapter;
import android.widget.SpinnerAdapter;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.databinding.C1179d;
import java.util.List;

@C0207n0({C0208a.LIBRARY})
/* renamed from: androidx.databinding.f0.c */
/* compiled from: AbsSpinnerBindingAdapter */
public class C1192c {
    @C1179d({"android:entries"})
    /* renamed from: a */
    public static <T extends CharSequence> void m6733a(AbsSpinner absSpinner, T[] tArr) {
        if (tArr != null) {
            SpinnerAdapter adapter = absSpinner.getAdapter();
            boolean z = true;
            if (adapter != null && adapter.getCount() == tArr.length) {
                int i = 0;
                while (true) {
                    if (i >= tArr.length) {
                        z = false;
                        break;
                    } else if (!tArr[i].equals(adapter.getItem(i))) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            if (z) {
                ArrayAdapter arrayAdapter = new ArrayAdapter(absSpinner.getContext(), 17367048, tArr);
                arrayAdapter.setDropDownViewResource(17367049);
                absSpinner.setAdapter(arrayAdapter);
                return;
            }
            return;
        }
        absSpinner.setAdapter(null);
    }

    @C1179d({"android:entries"})
    /* renamed from: a */
    public static <T> void m6732a(AbsSpinner absSpinner, List<T> list) {
        if (list != null) {
            SpinnerAdapter adapter = absSpinner.getAdapter();
            if (adapter instanceof C1247t) {
                ((C1247t) adapter).mo5639a(list);
                return;
            }
            C1247t tVar = new C1247t(absSpinner.getContext(), list, 17367048, 17367049, 0);
            absSpinner.setAdapter(tVar);
            return;
        }
        absSpinner.setAdapter(null);
    }
}
