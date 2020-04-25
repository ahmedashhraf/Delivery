package androidx.core.p034l.p035o0;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.annotation.C0195i0;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.core.l.o0.e */
/* compiled from: AccessibilityNodeProviderCompat */
public class C1021e {

    /* renamed from: b */
    public static final int f4647b = -1;

    /* renamed from: a */
    private final Object f4648a;

    @RequiresApi(16)
    /* renamed from: androidx.core.l.o0.e$a */
    /* compiled from: AccessibilityNodeProviderCompat */
    static class C1022a extends AccessibilityNodeProvider {

        /* renamed from: a */
        final C1021e f4649a;

        C1022a(C1021e eVar) {
            this.f4649a = eVar;
        }

        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            C1016d a = this.f4649a.mo5055a(i);
            if (a == null) {
                return null;
            }
            return a.mo4986f0();
        }

        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            List a = this.f4649a.mo5057a(str, i);
            if (a == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = a.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(((C1016d) a.get(i2)).mo4986f0());
            }
            return arrayList;
        }

        public boolean performAction(int i, int i2, Bundle bundle) {
            return this.f4649a.mo5058a(i, i2, bundle);
        }
    }

    @RequiresApi(19)
    /* renamed from: androidx.core.l.o0.e$b */
    /* compiled from: AccessibilityNodeProviderCompat */
    static class C1023b extends C1022a {
        C1023b(C1021e eVar) {
            super(eVar);
        }

        public AccessibilityNodeInfo findFocus(int i) {
            C1016d b = this.f4649a.mo5059b(i);
            if (b == null) {
                return null;
            }
            return b.mo4986f0();
        }
    }

    public C1021e() {
        int i = VERSION.SDK_INT;
        if (i >= 19) {
            this.f4648a = new C1023b(this);
        } else if (i >= 16) {
            this.f4648a = new C1022a(this);
        } else {
            this.f4648a = null;
        }
    }

    @C0195i0
    /* renamed from: a */
    public C1016d mo5055a(int i) {
        return null;
    }

    /* renamed from: a */
    public Object mo5056a() {
        return this.f4648a;
    }

    @C0195i0
    /* renamed from: a */
    public List<C1016d> mo5057a(String str, int i) {
        return null;
    }

    /* renamed from: a */
    public boolean mo5058a(int i, int i2, Bundle bundle) {
        return false;
    }

    @C0195i0
    /* renamed from: b */
    public C1016d mo5059b(int i) {
        return null;
    }

    public C1021e(Object obj) {
        this.f4648a = obj;
    }
}
