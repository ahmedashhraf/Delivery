package androidx.core.p034l;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.RequiresApi;
import androidx.core.C0721R;
import androidx.core.p034l.p035o0.C1008a;
import androidx.core.p034l.p035o0.C1016d;
import androidx.core.p034l.p035o0.C1016d.C1017a;
import androidx.core.p034l.p035o0.C1021e;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.core.l.a */
/* compiled from: AccessibilityDelegateCompat */
public class C0947a {

    /* renamed from: c */
    private static final AccessibilityDelegate f4282c = new AccessibilityDelegate();

    /* renamed from: a */
    private final AccessibilityDelegate f4283a;

    /* renamed from: b */
    private final AccessibilityDelegate f4284b;

    /* renamed from: androidx.core.l.a$a */
    /* compiled from: AccessibilityDelegateCompat */
    static final class C0948a extends AccessibilityDelegate {

        /* renamed from: a */
        final C0947a f4285a;

        C0948a(C0947a aVar) {
            this.f4285a = aVar;
        }

        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f4285a.mo4751a(view, accessibilityEvent);
        }

        @RequiresApi(16)
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            C1021e a = this.f4285a.mo4747a(view);
            if (a != null) {
                return (AccessibilityNodeProvider) a.mo5056a();
            }
            return null;
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f4285a.mo4753b(view, accessibilityEvent);
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            C1016d a = C1016d.m5806a(accessibilityNodeInfo);
            a.mo5022r(C0962e0.m5556s0(view));
            a.mo5012m(C0962e0.m5510g0(view));
            a.mo4984f(C0962e0.m5522j(view));
            this.f4285a.mo4749a(view, a);
            a.mo4938a(accessibilityNodeInfo.getText(), view);
            List b = C0947a.m5352b(view);
            for (int i = 0; i < b.size(); i++) {
                a.mo4935a((C1017a) b.get(i));
            }
        }

        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f4285a.mo4754c(view, accessibilityEvent);
        }

        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f4285a.mo4752a(viewGroup, view, accessibilityEvent);
        }

        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.f4285a.mo4750a(view, i, bundle);
        }

        public void sendAccessibilityEvent(View view, int i) {
            this.f4285a.mo4748a(view, i);
        }

        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f4285a.mo4755d(view, accessibilityEvent);
        }
    }

    public C0947a() {
        this(f4282c);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public AccessibilityDelegate mo4746a() {
        return this.f4284b;
    }

    /* renamed from: b */
    public void mo4753b(View view, AccessibilityEvent accessibilityEvent) {
        this.f4283a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: c */
    public void mo4754c(View view, AccessibilityEvent accessibilityEvent) {
        this.f4283a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: d */
    public void mo4755d(View view, AccessibilityEvent accessibilityEvent) {
        this.f4283a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    public C0947a(AccessibilityDelegate accessibilityDelegate) {
        this.f4283a = accessibilityDelegate;
        this.f4284b = new C0948a(this);
    }

    /* renamed from: b */
    static List<C1017a> m5352b(View view) {
        List<C1017a> list = (List) view.getTag(C0721R.C0724id.tag_accessibility_actions);
        return list == null ? Collections.emptyList() : list;
    }

    /* renamed from: a */
    public void mo4748a(View view, int i) {
        this.f4283a.sendAccessibilityEvent(view, i);
    }

    /* renamed from: a */
    public boolean mo4751a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f4283a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: a */
    public void mo4749a(View view, C1016d dVar) {
        this.f4283a.onInitializeAccessibilityNodeInfo(view, dVar.mo4986f0());
    }

    /* renamed from: a */
    public boolean mo4752a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f4283a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* renamed from: a */
    public C1021e mo4747a(View view) {
        if (VERSION.SDK_INT >= 16) {
            AccessibilityNodeProvider accessibilityNodeProvider = this.f4283a.getAccessibilityNodeProvider(view);
            if (accessibilityNodeProvider != null) {
                return new C1021e(accessibilityNodeProvider);
            }
        }
        return null;
    }

    /* renamed from: a */
    public boolean mo4750a(View view, int i, Bundle bundle) {
        List b = m5352b(view);
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= b.size()) {
                break;
            }
            C1017a aVar = (C1017a) b.get(i2);
            if (aVar.mo5037a() == i) {
                z = aVar.mo5039a(view, bundle);
                break;
            }
            i2++;
        }
        if (!z && VERSION.SDK_INT >= 16) {
            z = this.f4283a.performAccessibilityAction(view, i, bundle);
        }
        return (z || i != C0721R.C0724id.accessibility_action_clickable_span) ? z : m5350a(bundle.getInt(C1008a.f4509O, -1), view);
    }

    /* renamed from: a */
    private boolean m5350a(int i, View view) {
        SparseArray sparseArray = (SparseArray) view.getTag(C0721R.C0724id.tag_accessibility_clickable_spans);
        if (sparseArray != null) {
            WeakReference weakReference = (WeakReference) sparseArray.get(i);
            if (weakReference != null) {
                ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
                if (m5351a(clickableSpan, view)) {
                    clickableSpan.onClick(view);
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    private boolean m5351a(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] j = C1016d.m5819j(view.createAccessibilityNodeInfo().getText());
            int i = 0;
            while (j != null && i < j.length) {
                if (clickableSpan.equals(j[i])) {
                    return true;
                }
                i++;
            }
        }
        return false;
    }
}
