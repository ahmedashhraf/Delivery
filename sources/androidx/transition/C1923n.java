package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0193h0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.fragment.app.C1419q;
import androidx.transition.C1880f0.C1886f;
import androidx.transition.C1880f0.C1888h;
import java.util.ArrayList;
import java.util.List;

@SuppressLint({"RestrictedApi"})
@C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.transition.n */
/* compiled from: FragmentTransitionSupport */
public class C1923n extends C1419q {

    /* renamed from: androidx.transition.n$a */
    /* compiled from: FragmentTransitionSupport */
    class C1924a extends C1886f {

        /* renamed from: a */
        final /* synthetic */ Rect f7406a;

        C1924a(Rect rect) {
            this.f7406a = rect;
        }

        /* renamed from: a */
        public Rect mo8378a(@C0193h0 C1880f0 f0Var) {
            return this.f7406a;
        }
    }

    /* renamed from: androidx.transition.n$b */
    /* compiled from: FragmentTransitionSupport */
    class C1925b implements C1888h {

        /* renamed from: a */
        final /* synthetic */ View f7408a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f7409b;

        C1925b(View view, ArrayList arrayList) {
            this.f7408a = view;
            this.f7409b = arrayList;
        }

        /* renamed from: a */
        public void mo8312a(@C0193h0 C1880f0 f0Var) {
        }

        /* renamed from: b */
        public void mo8301b(@C0193h0 C1880f0 f0Var) {
        }

        /* renamed from: c */
        public void mo8302c(@C0193h0 C1880f0 f0Var) {
            f0Var.mo8342b((C1888h) this);
            this.f7408a.setVisibility(8);
            int size = this.f7409b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f7409b.get(i)).setVisibility(0);
            }
        }

        /* renamed from: d */
        public void mo8303d(@C0193h0 C1880f0 f0Var) {
        }

        /* renamed from: e */
        public void mo8304e(@C0193h0 C1880f0 f0Var) {
        }
    }

    /* renamed from: androidx.transition.n$c */
    /* compiled from: FragmentTransitionSupport */
    class C1926c extends C1897h0 {

        /* renamed from: a */
        final /* synthetic */ Object f7411a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f7412b;

        /* renamed from: c */
        final /* synthetic */ Object f7413c;

        /* renamed from: d */
        final /* synthetic */ ArrayList f7414d;

        /* renamed from: e */
        final /* synthetic */ Object f7415e;

        /* renamed from: f */
        final /* synthetic */ ArrayList f7416f;

        C1926c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f7411a = obj;
            this.f7412b = arrayList;
            this.f7413c = obj2;
            this.f7414d = arrayList2;
            this.f7415e = obj3;
            this.f7416f = arrayList3;
        }

        /* renamed from: a */
        public void mo8312a(@C0193h0 C1880f0 f0Var) {
            Object obj = this.f7411a;
            if (obj != null) {
                C1923n.this.mo6424a(obj, this.f7412b, null);
            }
            Object obj2 = this.f7413c;
            if (obj2 != null) {
                C1923n.this.mo6424a(obj2, this.f7414d, null);
            }
            Object obj3 = this.f7415e;
            if (obj3 != null) {
                C1923n.this.mo6424a(obj3, this.f7416f, null);
            }
        }

        /* renamed from: c */
        public void mo8302c(@C0193h0 C1880f0 f0Var) {
            f0Var.mo8342b((C1888h) this);
        }
    }

    /* renamed from: androidx.transition.n$d */
    /* compiled from: FragmentTransitionSupport */
    class C1927d extends C1886f {

        /* renamed from: a */
        final /* synthetic */ Rect f7418a;

        C1927d(Rect rect) {
            this.f7418a = rect;
        }

        /* renamed from: a */
        public Rect mo8378a(@C0193h0 C1880f0 f0Var) {
            Rect rect = this.f7418a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f7418a;
        }
    }

    /* renamed from: a */
    public boolean mo6425a(Object obj) {
        return obj instanceof C1880f0;
    }

    /* renamed from: b */
    public Object mo6426b(Object obj) {
        if (obj != null) {
            return ((C1880f0) obj).clone();
        }
        return null;
    }

    /* renamed from: c */
    public Object mo6431c(Object obj) {
        if (obj == null) {
            return null;
        }
        C1913k0 k0Var = new C1913k0();
        k0Var.mo8424a((C1880f0) obj);
        return k0Var;
    }

    /* renamed from: a */
    public void mo6423a(Object obj, ArrayList<View> arrayList) {
        C1880f0 f0Var = (C1880f0) obj;
        if (f0Var != null) {
            int i = 0;
            if (f0Var instanceof C1913k0) {
                C1913k0 k0Var = (C1913k0) f0Var;
                int s = k0Var.mo8427s();
                while (i < s) {
                    mo6423a((Object) k0Var.mo8310c(i), arrayList);
                    i++;
                }
            } else if (!m10167a(f0Var) && C1419q.m7592a(f0Var.mo8371n())) {
                int size = arrayList.size();
                while (i < size) {
                    f0Var.mo8322a((View) arrayList.get(i));
                    i++;
                }
            }
        }
    }

    /* renamed from: b */
    public void mo6429b(Object obj, View view, ArrayList<View> arrayList) {
        C1913k0 k0Var = (C1913k0) obj;
        List n = k0Var.mo8371n();
        n.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C1419q.m7591a(n, (View) arrayList.get(i));
        }
        n.add(view);
        arrayList.add(view);
        mo6423a((Object) k0Var, arrayList);
    }

    /* renamed from: c */
    public void mo6432c(Object obj, View view) {
        if (view != null) {
            C1880f0 f0Var = (C1880f0) obj;
            Rect rect = new Rect();
            mo6446a(view, rect);
            f0Var.mo8333a((C1886f) new C1924a(rect));
        }
    }

    /* renamed from: b */
    public Object mo6427b(Object obj, Object obj2, Object obj3) {
        C1913k0 k0Var = new C1913k0();
        if (obj != null) {
            k0Var.mo8424a((C1880f0) obj);
        }
        if (obj2 != null) {
            k0Var.mo8424a((C1880f0) obj2);
        }
        if (obj3 != null) {
            k0Var.mo8424a((C1880f0) obj3);
        }
        return k0Var;
    }

    /* renamed from: a */
    private static boolean m10167a(C1880f0 f0Var) {
        return !C1419q.m7592a(f0Var.mo8368k()) || !C1419q.m7592a(f0Var.mo8369l()) || !C1419q.m7592a(f0Var.mo8370m());
    }

    /* renamed from: b */
    public void mo6430b(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        C1913k0 k0Var = (C1913k0) obj;
        if (k0Var != null) {
            k0Var.mo8371n().clear();
            k0Var.mo8371n().addAll(arrayList2);
            mo6424a((Object) k0Var, arrayList, arrayList2);
        }
    }

    /* renamed from: a */
    public void mo6421a(Object obj, View view, ArrayList<View> arrayList) {
        ((C1880f0) obj).mo8324a((C1888h) new C1925b(view, arrayList));
    }

    /* renamed from: a */
    public Object mo6417a(Object obj, Object obj2, Object obj3) {
        C1880f0 f0Var = (C1880f0) obj;
        C1880f0 f0Var2 = (C1880f0) obj2;
        C1880f0 f0Var3 = (C1880f0) obj3;
        if (f0Var != null && f0Var2 != null) {
            f0Var = new C1913k0().mo8424a(f0Var).mo8424a(f0Var2).mo8426d(1);
        } else if (f0Var == null) {
            f0Var = f0Var2 != null ? f0Var2 : null;
        }
        if (f0Var3 == null) {
            return f0Var;
        }
        C1913k0 k0Var = new C1913k0();
        if (f0Var != null) {
            k0Var.mo8424a(f0Var);
        }
        k0Var.mo8424a(f0Var3);
        return k0Var;
    }

    /* renamed from: b */
    public void mo6428b(Object obj, View view) {
        if (obj != null) {
            ((C1880f0) obj).mo8359d(view);
        }
    }

    /* renamed from: a */
    public void mo6418a(ViewGroup viewGroup, Object obj) {
        C1906i0.m10073a(viewGroup, (C1880f0) obj);
    }

    /* renamed from: a */
    public void mo6422a(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        C1880f0 f0Var = (C1880f0) obj;
        C1926c cVar = new C1926c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3);
        f0Var.mo8324a((C1888h) cVar);
    }

    /* renamed from: a */
    public void mo6424a(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        int i;
        C1880f0 f0Var = (C1880f0) obj;
        int i2 = 0;
        if (f0Var instanceof C1913k0) {
            C1913k0 k0Var = (C1913k0) f0Var;
            int s = k0Var.mo8427s();
            while (i2 < s) {
                mo6424a((Object) k0Var.mo8310c(i2), arrayList, arrayList2);
                i2++;
            }
        } else if (!m10167a(f0Var)) {
            List n = f0Var.mo8371n();
            if (n.size() == arrayList.size() && n.containsAll(arrayList)) {
                if (arrayList2 == null) {
                    i = 0;
                } else {
                    i = arrayList2.size();
                }
                while (i2 < i) {
                    f0Var.mo8322a((View) arrayList2.get(i2));
                    i2++;
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    f0Var.mo8359d((View) arrayList.get(size));
                }
            }
        }
    }

    /* renamed from: a */
    public void mo6420a(Object obj, View view) {
        if (obj != null) {
            ((C1880f0) obj).mo8322a(view);
        }
    }

    /* renamed from: a */
    public void mo6419a(Object obj, Rect rect) {
        if (obj != null) {
            ((C1880f0) obj).mo8333a((C1886f) new C1927d(rect));
        }
    }
}
