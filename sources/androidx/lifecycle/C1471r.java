package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.lifecycle.Lifecycle.C1441a;

@C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.lifecycle.r */
/* compiled from: ReportFragment */
public class C1471r extends Fragment {

    /* renamed from: b */
    private static final String f5726b = "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag";

    /* renamed from: a */
    private C1472a f5727a;

    /* renamed from: androidx.lifecycle.r$a */
    /* compiled from: ReportFragment */
    interface C1472a {
        /* renamed from: a */
        void mo6530a();

        void onResume();

        void onStart();
    }

    /* renamed from: a */
    static C1471r m7725a(Activity activity) {
        return (C1471r) activity.getFragmentManager().findFragmentByTag(f5726b);
    }

    /* renamed from: b */
    public static void m7727b(Activity activity) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        String str = f5726b;
        if (fragmentManager.findFragmentByTag(str) == null) {
            fragmentManager.beginTransaction().add(new C1471r(), str).commit();
            fragmentManager.executePendingTransactions();
        }
    }

    /* renamed from: c */
    private void m7729c(C1472a aVar) {
        if (aVar != null) {
            aVar.onResume();
        }
    }

    /* renamed from: d */
    private void m7730d(C1472a aVar) {
        if (aVar != null) {
            aVar.onStart();
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m7728b(this.f5727a);
        m7726a(C1441a.ON_CREATE);
    }

    public void onDestroy() {
        super.onDestroy();
        m7726a(C1441a.ON_DESTROY);
        this.f5727a = null;
    }

    public void onPause() {
        super.onPause();
        m7726a(C1441a.ON_PAUSE);
    }

    public void onResume() {
        super.onResume();
        m7729c(this.f5727a);
        m7726a(C1441a.ON_RESUME);
    }

    public void onStart() {
        super.onStart();
        m7730d(this.f5727a);
        m7726a(C1441a.ON_START);
    }

    public void onStop() {
        super.onStop();
        m7726a(C1441a.ON_STOP);
    }

    /* renamed from: a */
    private void m7726a(C1441a aVar) {
        Activity activity = getActivity();
        if (activity instanceof C1463k) {
            ((C1463k) activity).getLifecycle().mo6513a(aVar);
            return;
        }
        if (activity instanceof C1459i) {
            Lifecycle lifecycle = ((C1459i) activity).getLifecycle();
            if (lifecycle instanceof C1460j) {
                ((C1460j) lifecycle).mo6513a(aVar);
            }
        }
    }

    /* renamed from: b */
    private void m7728b(C1472a aVar) {
        if (aVar != null) {
            aVar.mo6530a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6523a(C1472a aVar) {
        this.f5727a = aVar;
    }
}
