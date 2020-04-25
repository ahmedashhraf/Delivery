package androidx.transition;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnPreDrawListener;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.collection.C0635a;
import androidx.core.p034l.C0962e0;
import androidx.transition.C1880f0.C1888h;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: androidx.transition.i0 */
/* compiled from: TransitionManager */
public class C1906i0 {

    /* renamed from: c */
    private static final String f7358c = "TransitionManager";

    /* renamed from: d */
    private static C1880f0 f7359d = new C1833c();

    /* renamed from: e */
    private static ThreadLocal<WeakReference<C0635a<ViewGroup, ArrayList<C1880f0>>>> f7360e = new ThreadLocal<>();

    /* renamed from: f */
    static ArrayList<ViewGroup> f7361f = new ArrayList<>();

    /* renamed from: a */
    private C0635a<C1831b0, C1880f0> f7362a = new C0635a<>();

    /* renamed from: b */
    private C0635a<C1831b0, C0635a<C1831b0, C1880f0>> f7363b = new C0635a<>();

    /* renamed from: androidx.transition.i0$a */
    /* compiled from: TransitionManager */
    private static class C1907a implements OnPreDrawListener, OnAttachStateChangeListener {

        /* renamed from: a */
        C1880f0 f7364a;

        /* renamed from: b */
        ViewGroup f7365b;

        /* renamed from: androidx.transition.i0$a$a */
        /* compiled from: TransitionManager */
        class C1908a extends C1897h0 {

            /* renamed from: a */
            final /* synthetic */ C0635a f7366a;

            C1908a(C0635a aVar) {
                this.f7366a = aVar;
            }

            /* renamed from: c */
            public void mo8302c(@C0193h0 C1880f0 f0Var) {
                ((ArrayList) this.f7366a.get(C1907a.this.f7365b)).remove(f0Var);
                f0Var.mo8342b((C1888h) this);
            }
        }

        C1907a(C1880f0 f0Var, ViewGroup viewGroup) {
            this.f7364a = f0Var;
            this.f7365b = viewGroup;
        }

        /* renamed from: a */
        private void m10084a() {
            this.f7365b.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f7365b.removeOnAttachStateChangeListener(this);
        }

        public boolean onPreDraw() {
            m10084a();
            if (!C1906i0.f7361f.remove(this.f7365b)) {
                return true;
            }
            C0635a a = C1906i0.m10071a();
            ArrayList arrayList = (ArrayList) a.get(this.f7365b);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList();
                a.put(this.f7365b, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f7364a);
            this.f7364a.mo8324a((C1888h) new C1908a(a));
            this.f7364a.mo8332a(this.f7365b, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((C1880f0) it.next()).mo8362e(this.f7365b);
                }
            }
            this.f7364a.mo8347b(this.f7365b);
            return true;
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            m10084a();
            C1906i0.f7361f.remove(this.f7365b);
            ArrayList arrayList = (ArrayList) C1906i0.m10071a().get(this.f7365b);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C1880f0) it.next()).mo8362e(this.f7365b);
                }
            }
            this.f7364a.mo8336a(true);
        }
    }

    /* renamed from: b */
    private C1880f0 m10074b(C1831b0 b0Var) {
        ViewGroup c = b0Var.mo8249c();
        if (c != null) {
            C1831b0 a = C1831b0.m9813a(c);
            if (a != null) {
                C0635a aVar = (C0635a) this.f7363b.get(b0Var);
                if (aVar != null) {
                    C1880f0 f0Var = (C1880f0) aVar.get(a);
                    if (f0Var != null) {
                        return f0Var;
                    }
                }
            }
        }
        C1880f0 f0Var2 = (C1880f0) this.f7362a.get(b0Var);
        if (f0Var2 == null) {
            f0Var2 = f7359d;
        }
        return f0Var2;
    }

    /* renamed from: c */
    private static void m10078c(ViewGroup viewGroup, C1880f0 f0Var) {
        ArrayList arrayList = (ArrayList) m10071a().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C1880f0) it.next()).mo8355c((View) viewGroup);
            }
        }
        if (f0Var != null) {
            f0Var.mo8332a(viewGroup, true);
        }
        C1831b0 a = C1831b0.m9813a(viewGroup);
        if (a != null) {
            a.mo8247b();
        }
    }

    /* renamed from: a */
    public void mo8419a(@C0193h0 C1831b0 b0Var, @C0195i0 C1880f0 f0Var) {
        this.f7362a.put(b0Var, f0Var);
    }

    /* renamed from: a */
    public void mo8418a(@C0193h0 C1831b0 b0Var, @C0193h0 C1831b0 b0Var2, @C0195i0 C1880f0 f0Var) {
        C0635a aVar = (C0635a) this.f7363b.get(b0Var2);
        if (aVar == null) {
            aVar = new C0635a();
            this.f7363b.put(b0Var2, aVar);
        }
        aVar.put(b0Var, f0Var);
    }

    /* renamed from: a */
    static C0635a<ViewGroup, ArrayList<C1880f0>> m10071a() {
        WeakReference weakReference = (WeakReference) f7360e.get();
        if (weakReference != null) {
            C0635a<ViewGroup, ArrayList<C1880f0>> aVar = (C0635a) weakReference.get();
            if (aVar != null) {
                return aVar;
            }
        }
        C0635a<ViewGroup, ArrayList<C1880f0>> aVar2 = new C0635a<>();
        f7360e.set(new WeakReference(aVar2));
        return aVar2;
    }

    /* renamed from: b */
    private static void m10077b(C1831b0 b0Var, C1880f0 f0Var) {
        ViewGroup c = b0Var.mo8249c();
        if (!f7361f.contains(c)) {
            C1831b0 a = C1831b0.m9813a(c);
            if (f0Var == null) {
                if (a != null) {
                    a.mo8247b();
                }
                b0Var.mo8245a();
                return;
            }
            f7361f.add(c);
            C1880f0 clone = f0Var.clone();
            clone.mo8352c(c);
            if (a != null && a.mo8250d()) {
                clone.mo8349b(true);
            }
            m10078c(c, clone);
            b0Var.mo8245a();
            m10076b(c, clone);
        }
    }

    /* renamed from: c */
    public static void m10079c(@C0193h0 C1831b0 b0Var) {
        m10077b(b0Var, f7359d);
    }

    /* renamed from: c */
    public static void m10080c(@C0193h0 C1831b0 b0Var, @C0195i0 C1880f0 f0Var) {
        m10077b(b0Var, f0Var);
    }

    /* renamed from: a */
    public void mo8417a(@C0193h0 C1831b0 b0Var) {
        m10077b(b0Var, m10074b(b0Var));
    }

    /* renamed from: a */
    public static void m10072a(@C0193h0 ViewGroup viewGroup) {
        m10073a(viewGroup, (C1880f0) null);
    }

    /* renamed from: a */
    public static void m10073a(@C0193h0 ViewGroup viewGroup, @C0195i0 C1880f0 f0Var) {
        if (!f7361f.contains(viewGroup) && C0962e0.m5540n0(viewGroup)) {
            f7361f.add(viewGroup);
            if (f0Var == null) {
                f0Var = f7359d;
            }
            C1880f0 clone = f0Var.clone();
            m10078c(viewGroup, clone);
            C1831b0.m9815a(viewGroup, null);
            m10076b(viewGroup, clone);
        }
    }

    /* renamed from: b */
    private static void m10076b(ViewGroup viewGroup, C1880f0 f0Var) {
        if (f0Var != null && viewGroup != null) {
            C1907a aVar = new C1907a(f0Var, viewGroup);
            viewGroup.addOnAttachStateChangeListener(aVar);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
        }
    }

    /* renamed from: b */
    public static void m10075b(ViewGroup viewGroup) {
        f7361f.remove(viewGroup);
        ArrayList arrayList = (ArrayList) m10071a().get(viewGroup);
        if (arrayList != null && !arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                ((C1880f0) arrayList2.get(size)).mo8330a(viewGroup);
            }
        }
    }
}
