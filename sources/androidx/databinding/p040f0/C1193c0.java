package androidx.databinding.p040f0;

import android.widget.TabHost;
import android.widget.TabHost.OnTabChangeListener;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.databinding.C1179d;
import androidx.databinding.C1285n;
import androidx.databinding.C1286o;

@C0207n0({C0208a.LIBRARY})
/* renamed from: androidx.databinding.f0.c0 */
/* compiled from: TabHostBindingAdapter */
public class C1193c0 {

    /* renamed from: androidx.databinding.f0.c0$a */
    /* compiled from: TabHostBindingAdapter */
    static class C1194a implements OnTabChangeListener {

        /* renamed from: a */
        final /* synthetic */ OnTabChangeListener f5074a;

        /* renamed from: b */
        final /* synthetic */ C1286o f5075b;

        C1194a(OnTabChangeListener onTabChangeListener, C1286o oVar) {
            this.f5074a = onTabChangeListener;
            this.f5075b = oVar;
        }

        public void onTabChanged(String str) {
            OnTabChangeListener onTabChangeListener = this.f5074a;
            if (onTabChangeListener != null) {
                onTabChangeListener.onTabChanged(str);
            }
            this.f5075b.mo5680a();
        }
    }

    @C1285n(attribute = "android:currentTab")
    /* renamed from: a */
    public static int m6734a(TabHost tabHost) {
        return tabHost.getCurrentTab();
    }

    @C1285n(attribute = "android:currentTab")
    /* renamed from: b */
    public static String m6738b(TabHost tabHost) {
        return tabHost.getCurrentTabTag();
    }

    @C1179d({"android:currentTab"})
    /* renamed from: a */
    public static void m6735a(TabHost tabHost, int i) {
        if (tabHost.getCurrentTab() != i) {
            tabHost.setCurrentTab(i);
        }
    }

    @C1179d({"android:currentTab"})
    /* renamed from: a */
    public static void m6737a(TabHost tabHost, String str) {
        if (tabHost.getCurrentTabTag() != str) {
            tabHost.setCurrentTabByTag(str);
        }
    }

    @C1179d(requireAll = false, value = {"android:onTabChanged", "android:currentTabAttrChanged"})
    /* renamed from: a */
    public static void m6736a(TabHost tabHost, OnTabChangeListener onTabChangeListener, C1286o oVar) {
        if (oVar == null) {
            tabHost.setOnTabChangedListener(onTabChangeListener);
        } else {
            tabHost.setOnTabChangedListener(new C1194a(onTabChangeListener, oVar));
        }
    }
}
