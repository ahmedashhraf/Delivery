package androidx.databinding.p040f0;

import android.util.SparseBooleanArray;
import android.widget.TableLayout;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.databinding.C1179d;
import java.util.regex.Pattern;

@C0207n0({C0208a.LIBRARY})
/* renamed from: androidx.databinding.f0.e0 */
/* compiled from: TableLayoutBindingAdapter */
public class C1201e0 {

    /* renamed from: a */
    private static Pattern f5079a = Pattern.compile("\\s*,\\s*");

    /* renamed from: b */
    private static final int f5080b = 20;

    @C1179d({"android:collapseColumns"})
    /* renamed from: a */
    public static void m6745a(TableLayout tableLayout, CharSequence charSequence) {
        SparseBooleanArray a = m6744a(charSequence);
        for (int i = 0; i < 20; i++) {
            boolean z = a.get(i, false);
            if (z != tableLayout.isColumnCollapsed(i)) {
                tableLayout.setColumnCollapsed(i, z);
            }
        }
    }

    @C1179d({"android:shrinkColumns"})
    /* renamed from: b */
    public static void m6746b(TableLayout tableLayout, CharSequence charSequence) {
        if (charSequence == null || charSequence.length() <= 0 || charSequence.charAt(0) != '*') {
            tableLayout.setShrinkAllColumns(false);
            SparseBooleanArray a = m6744a(charSequence);
            int size = a.size();
            for (int i = 0; i < size; i++) {
                int keyAt = a.keyAt(i);
                boolean valueAt = a.valueAt(i);
                if (valueAt) {
                    tableLayout.setColumnShrinkable(keyAt, valueAt);
                }
            }
            return;
        }
        tableLayout.setShrinkAllColumns(true);
    }

    @C1179d({"android:stretchColumns"})
    /* renamed from: c */
    public static void m6747c(TableLayout tableLayout, CharSequence charSequence) {
        if (charSequence == null || charSequence.length() <= 0 || charSequence.charAt(0) != '*') {
            tableLayout.setStretchAllColumns(false);
            SparseBooleanArray a = m6744a(charSequence);
            int size = a.size();
            for (int i = 0; i < size; i++) {
                int keyAt = a.keyAt(i);
                boolean valueAt = a.valueAt(i);
                if (valueAt) {
                    tableLayout.setColumnStretchable(keyAt, valueAt);
                }
            }
            return;
        }
        tableLayout.setStretchAllColumns(true);
    }

    /* renamed from: a */
    private static SparseBooleanArray m6744a(CharSequence charSequence) {
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        if (charSequence == null) {
            return sparseBooleanArray;
        }
        for (String parseInt : f5079a.split(charSequence)) {
            try {
                int parseInt2 = Integer.parseInt(parseInt);
                if (parseInt2 >= 0) {
                    sparseBooleanArray.put(parseInt2, true);
                }
            } catch (NumberFormatException unused) {
            }
        }
        return sparseBooleanArray;
    }
}
