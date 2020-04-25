package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.core.p034l.C0947a;
import androidx.core.p034l.C0962e0;
import androidx.core.p034l.p035o0.C1016d;
import androidx.core.p034l.p035o0.C1021e;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: androidx.recyclerview.widget.y */
/* compiled from: RecyclerViewAccessibilityDelegate */
public class C1780y extends C0947a {

    /* renamed from: d */
    final RecyclerView f6917d;

    /* renamed from: e */
    private final C1781a f6918e;

    /* renamed from: androidx.recyclerview.widget.y$a */
    /* compiled from: RecyclerViewAccessibilityDelegate */
    public static class C1781a extends C0947a {

        /* renamed from: d */
        final C1780y f6919d;

        /* renamed from: e */
        private Map<View, C0947a> f6920e = new WeakHashMap();

        public C1781a(@C0193h0 C1780y yVar) {
            this.f6919d = yVar;
        }

        /* renamed from: a */
        public void mo4749a(View view, C1016d dVar) {
            if (this.f6919d.mo8030c() || this.f6919d.f6917d.getLayoutManager() == null) {
                super.mo4749a(view, dVar);
                return;
            }
            this.f6919d.f6917d.getLayoutManager().mo7412a(view, dVar);
            C0947a aVar = (C0947a) this.f6920e.get(view);
            if (aVar != null) {
                aVar.mo4749a(view, dVar);
            } else {
                super.mo4749a(view, dVar);
            }
        }

        /* renamed from: b */
        public void mo4753b(@C0193h0 View view, @C0193h0 AccessibilityEvent accessibilityEvent) {
            C0947a aVar = (C0947a) this.f6920e.get(view);
            if (aVar != null) {
                aVar.mo4753b(view, accessibilityEvent);
            } else {
                super.mo4753b(view, accessibilityEvent);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public C0947a mo8031c(View view) {
            return (C0947a) this.f6920e.remove(view);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo8032d(View view) {
            C0947a f = C0962e0.m5500f(view);
            if (f != null && f != this) {
                this.f6920e.put(view, f);
            }
        }

        /* renamed from: c */
        public void mo4754c(@C0193h0 View view, @C0193h0 AccessibilityEvent accessibilityEvent) {
            C0947a aVar = (C0947a) this.f6920e.get(view);
            if (aVar != null) {
                aVar.mo4754c(view, accessibilityEvent);
            } else {
                super.mo4754c(view, accessibilityEvent);
            }
        }

        /* renamed from: d */
        public void mo4755d(@C0193h0 View view, @C0193h0 AccessibilityEvent accessibilityEvent) {
            C0947a aVar = (C0947a) this.f6920e.get(view);
            if (aVar != null) {
                aVar.mo4755d(view, accessibilityEvent);
            } else {
                super.mo4755d(view, accessibilityEvent);
            }
        }

        /* renamed from: a */
        public boolean mo4750a(View view, int i, Bundle bundle) {
            if (this.f6919d.mo8030c() || this.f6919d.f6917d.getLayoutManager() == null) {
                return super.mo4750a(view, i, bundle);
            }
            C0947a aVar = (C0947a) this.f6920e.get(view);
            if (aVar != null) {
                if (aVar.mo4750a(view, i, bundle)) {
                    return true;
                }
            } else if (super.mo4750a(view, i, bundle)) {
                return true;
            }
            return this.f6919d.f6917d.getLayoutManager().mo7429a(view, i, bundle);
        }

        /* renamed from: a */
        public void mo4748a(@C0193h0 View view, int i) {
            C0947a aVar = (C0947a) this.f6920e.get(view);
            if (aVar != null) {
                aVar.mo4748a(view, i);
            } else {
                super.mo4748a(view, i);
            }
        }

        /* renamed from: a */
        public boolean mo4751a(@C0193h0 View view, @C0193h0 AccessibilityEvent accessibilityEvent) {
            C0947a aVar = (C0947a) this.f6920e.get(view);
            if (aVar != null) {
                return aVar.mo4751a(view, accessibilityEvent);
            }
            return super.mo4751a(view, accessibilityEvent);
        }

        /* renamed from: a */
        public boolean mo4752a(@C0193h0 ViewGroup viewGroup, @C0193h0 View view, @C0193h0 AccessibilityEvent accessibilityEvent) {
            C0947a aVar = (C0947a) this.f6920e.get(viewGroup);
            if (aVar != null) {
                return aVar.mo4752a(viewGroup, view, accessibilityEvent);
            }
            return super.mo4752a(viewGroup, view, accessibilityEvent);
        }

        @C0195i0
        /* renamed from: a */
        public C1021e mo4747a(@C0193h0 View view) {
            C0947a aVar = (C0947a) this.f6920e.get(view);
            if (aVar != null) {
                return aVar.mo4747a(view);
            }
            return super.mo4747a(view);
        }
    }

    public C1780y(@C0193h0 RecyclerView recyclerView) {
        this.f6917d = recyclerView;
        C0947a b = mo8029b();
        if (b == null || !(b instanceof C1781a)) {
            this.f6918e = new C1781a(this);
        } else {
            this.f6918e = (C1781a) b;
        }
    }

    /* renamed from: a */
    public boolean mo4750a(View view, int i, Bundle bundle) {
        if (super.mo4750a(view, i, bundle)) {
            return true;
        }
        if (mo8030c() || this.f6917d.getLayoutManager() == null) {
            return false;
        }
        return this.f6917d.getLayoutManager().mo7427a(i, bundle);
    }

    /* renamed from: b */
    public void mo4753b(View view, AccessibilityEvent accessibilityEvent) {
        super.mo4753b(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !mo8030c()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().mo6980a(accessibilityEvent);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo8030c() {
        return this.f6917d.hasPendingAdapterUpdates();
    }

    /* renamed from: a */
    public void mo4749a(View view, C1016d dVar) {
        super.mo4749a(view, dVar);
        if (!mo8030c() && this.f6917d.getLayoutManager() != null) {
            this.f6917d.getLayoutManager().mo7415a(dVar);
        }
    }

    @C0193h0
    /* renamed from: b */
    public C0947a mo8029b() {
        return this.f6918e;
    }
}
