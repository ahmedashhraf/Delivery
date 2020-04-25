package androidx.databinding.p040f0;

import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.databinding.C1179d;
import androidx.databinding.C1267g;
import androidx.databinding.C1268h;
import androidx.databinding.C1286o;
import androidx.databinding.C1287p;
import androidx.databinding.C1288q;

@C0207n0({C0208a.LIBRARY})
@C1268h({@C1267g(attribute = "android:onItemClick", method = "setOnItemClickListener", type = AdapterView.class), @C1267g(attribute = "android:onItemLongClick", method = "setOnItemLongClickListener", type = AdapterView.class)})
@C1288q({@C1287p(attribute = "android:selectedItemPosition", type = AdapterView.class), @C1287p(attribute = "android:selection", event = "android:selectedItemPositionAttrChanged", method = "getSelectedItemPosition", type = AdapterView.class)})
/* renamed from: androidx.databinding.f0.e */
/* compiled from: AdapterViewBindingAdapter */
public class C1197e {

    /* renamed from: androidx.databinding.f0.e$a */
    /* compiled from: AdapterViewBindingAdapter */
    public interface C1198a {
        void onItemSelected(AdapterView<?> adapterView, View view, int i, long j);
    }

    /* renamed from: androidx.databinding.f0.e$b */
    /* compiled from: AdapterViewBindingAdapter */
    public static class C1199b implements OnItemSelectedListener {

        /* renamed from: N */
        private final C1286o f5076N;

        /* renamed from: a */
        private final C1198a f5077a;

        /* renamed from: b */
        private final C1200c f5078b;

        public C1199b(C1198a aVar, C1200c cVar, C1286o oVar) {
            this.f5077a = aVar;
            this.f5078b = cVar;
            this.f5076N = oVar;
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            C1198a aVar = this.f5077a;
            if (aVar != null) {
                aVar.onItemSelected(adapterView, view, i, j);
            }
            C1286o oVar = this.f5076N;
            if (oVar != null) {
                oVar.mo5680a();
            }
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
            C1200c cVar = this.f5078b;
            if (cVar != null) {
                cVar.onNothingSelected(adapterView);
            }
            C1286o oVar = this.f5076N;
            if (oVar != null) {
                oVar.mo5680a();
            }
        }
    }

    /* renamed from: androidx.databinding.f0.e$c */
    /* compiled from: AdapterViewBindingAdapter */
    public interface C1200c {
        void onNothingSelected(AdapterView<?> adapterView);
    }

    @C1179d({"android:selectedItemPosition"})
    /* renamed from: a */
    public static void m6739a(AdapterView adapterView, int i) {
        if (adapterView.getSelectedItemPosition() != i) {
            adapterView.setSelection(i);
        }
    }

    @C1179d({"android:selection"})
    /* renamed from: b */
    public static void m6742b(AdapterView adapterView, int i) {
        m6739a(adapterView, i);
    }

    @C1179d({"android:selection", "android:adapter"})
    /* renamed from: b */
    public static void m6743b(AdapterView adapterView, int i, Adapter adapter) {
        m6740a(adapterView, i, adapter);
    }

    @C1179d({"android:selectedItemPosition", "android:adapter"})
    /* renamed from: a */
    public static void m6740a(AdapterView adapterView, int i, Adapter adapter) {
        if (adapter != adapterView.getAdapter()) {
            adapterView.setAdapter(adapter);
            adapterView.setSelection(i);
        } else if (adapterView.getSelectedItemPosition() != i) {
            adapterView.setSelection(i);
        }
    }

    @C1179d(requireAll = false, value = {"android:onItemSelected", "android:onNothingSelected", "android:selectedItemPositionAttrChanged"})
    /* renamed from: a */
    public static void m6741a(AdapterView adapterView, C1198a aVar, C1200c cVar, C1286o oVar) {
        if (aVar == null && cVar == null && oVar == null) {
            adapterView.setOnItemSelectedListener(null);
        } else {
            adapterView.setOnItemSelectedListener(new C1199b(aVar, cVar, oVar));
        }
    }
}
