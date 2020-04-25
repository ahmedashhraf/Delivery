package androidx.appcompat.app;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import androidx.appcompat.app.C0279a.C0284e;

/* renamed from: androidx.appcompat.app.i */
/* compiled from: NavItemSelectedListener */
class C0302i implements OnItemSelectedListener {

    /* renamed from: a */
    private final C0284e f905a;

    public C0302i(C0284e eVar) {
        this.f905a = eVar;
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        C0284e eVar = this.f905a;
        if (eVar != null) {
            eVar.mo993a(i, j);
        }
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
