package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.annotation.C0193h0;
import androidx.core.p034l.C0962e0;
import androidx.recyclerview.widget.RecyclerView.C1635d0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.h */
/* compiled from: DefaultItemAnimator */
public class C1712h extends C1677a0 {

    /* renamed from: A */
    private static TimeInterpolator f6586A = null;

    /* renamed from: z */
    private static final boolean f6587z = false;

    /* renamed from: o */
    private ArrayList<C1635d0> f6588o = new ArrayList<>();

    /* renamed from: p */
    private ArrayList<C1635d0> f6589p = new ArrayList<>();

    /* renamed from: q */
    private ArrayList<C1722j> f6590q = new ArrayList<>();

    /* renamed from: r */
    private ArrayList<C1721i> f6591r = new ArrayList<>();

    /* renamed from: s */
    ArrayList<ArrayList<C1635d0>> f6592s = new ArrayList<>();

    /* renamed from: t */
    ArrayList<ArrayList<C1722j>> f6593t = new ArrayList<>();

    /* renamed from: u */
    ArrayList<ArrayList<C1721i>> f6594u = new ArrayList<>();

    /* renamed from: v */
    ArrayList<C1635d0> f6595v = new ArrayList<>();

    /* renamed from: w */
    ArrayList<C1635d0> f6596w = new ArrayList<>();

    /* renamed from: x */
    ArrayList<C1635d0> f6597x = new ArrayList<>();

    /* renamed from: y */
    ArrayList<C1635d0> f6598y = new ArrayList<>();

    /* renamed from: androidx.recyclerview.widget.h$a */
    /* compiled from: DefaultItemAnimator */
    class C1713a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ArrayList f6599a;

        C1713a(ArrayList arrayList) {
            this.f6599a = arrayList;
        }

        public void run() {
            Iterator it = this.f6599a.iterator();
            while (it.hasNext()) {
                C1722j jVar = (C1722j) it.next();
                C1712h.this.mo7842b(jVar.f6633a, jVar.f6634b, jVar.f6635c, jVar.f6636d, jVar.f6637e);
            }
            this.f6599a.clear();
            C1712h.this.f6593t.remove(this.f6599a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.h$b */
    /* compiled from: DefaultItemAnimator */
    class C1714b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ArrayList f6601a;

        C1714b(ArrayList arrayList) {
            this.f6601a = arrayList;
        }

        public void run() {
            Iterator it = this.f6601a.iterator();
            while (it.hasNext()) {
                C1712h.this.mo7840a((C1721i) it.next());
            }
            this.f6601a.clear();
            C1712h.this.f6594u.remove(this.f6601a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.h$c */
    /* compiled from: DefaultItemAnimator */
    class C1715c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ArrayList f6603a;

        C1715c(ArrayList arrayList) {
            this.f6603a = arrayList;
        }

        public void run() {
            Iterator it = this.f6603a.iterator();
            while (it.hasNext()) {
                C1712h.this.mo7844v((C1635d0) it.next());
            }
            this.f6603a.clear();
            C1712h.this.f6592s.remove(this.f6603a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.h$d */
    /* compiled from: DefaultItemAnimator */
    class C1716d extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C1635d0 f6605a;

        /* renamed from: b */
        final /* synthetic */ ViewPropertyAnimator f6606b;

        /* renamed from: c */
        final /* synthetic */ View f6607c;

        C1716d(C1635d0 d0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f6605a = d0Var;
            this.f6606b = viewPropertyAnimator;
            this.f6607c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f6606b.setListener(null);
            this.f6607c.setAlpha(1.0f);
            C1712h.this.mo7710n(this.f6605a);
            C1712h.this.f6597x.remove(this.f6605a);
            C1712h.this.mo7843k();
        }

        public void onAnimationStart(Animator animator) {
            C1712h.this.mo7711o(this.f6605a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.h$e */
    /* compiled from: DefaultItemAnimator */
    class C1717e extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C1635d0 f6609a;

        /* renamed from: b */
        final /* synthetic */ View f6610b;

        /* renamed from: c */
        final /* synthetic */ ViewPropertyAnimator f6611c;

        C1717e(C1635d0 d0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f6609a = d0Var;
            this.f6610b = view;
            this.f6611c = viewPropertyAnimator;
        }

        public void onAnimationCancel(Animator animator) {
            this.f6610b.setAlpha(1.0f);
        }

        public void onAnimationEnd(Animator animator) {
            this.f6611c.setListener(null);
            C1712h.this.mo7705j(this.f6609a);
            C1712h.this.f6595v.remove(this.f6609a);
            C1712h.this.mo7843k();
        }

        public void onAnimationStart(Animator animator) {
            C1712h.this.mo7707k(this.f6609a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.h$f */
    /* compiled from: DefaultItemAnimator */
    class C1718f extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C1635d0 f6613a;

        /* renamed from: b */
        final /* synthetic */ int f6614b;

        /* renamed from: c */
        final /* synthetic */ View f6615c;

        /* renamed from: d */
        final /* synthetic */ int f6616d;

        /* renamed from: e */
        final /* synthetic */ ViewPropertyAnimator f6617e;

        C1718f(C1635d0 d0Var, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
            this.f6613a = d0Var;
            this.f6614b = i;
            this.f6615c = view;
            this.f6616d = i2;
            this.f6617e = viewPropertyAnimator;
        }

        public void onAnimationCancel(Animator animator) {
            if (this.f6614b != 0) {
                this.f6615c.setTranslationX(0.0f);
            }
            if (this.f6616d != 0) {
                this.f6615c.setTranslationY(0.0f);
            }
        }

        public void onAnimationEnd(Animator animator) {
            this.f6617e.setListener(null);
            C1712h.this.mo7708l(this.f6613a);
            C1712h.this.f6596w.remove(this.f6613a);
            C1712h.this.mo7843k();
        }

        public void onAnimationStart(Animator animator) {
            C1712h.this.mo7709m(this.f6613a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.h$g */
    /* compiled from: DefaultItemAnimator */
    class C1719g extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C1721i f6619a;

        /* renamed from: b */
        final /* synthetic */ ViewPropertyAnimator f6620b;

        /* renamed from: c */
        final /* synthetic */ View f6621c;

        C1719g(C1721i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f6619a = iVar;
            this.f6620b = viewPropertyAnimator;
            this.f6621c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f6620b.setListener(null);
            this.f6621c.setAlpha(1.0f);
            this.f6621c.setTranslationX(0.0f);
            this.f6621c.setTranslationY(0.0f);
            C1712h.this.mo7696a(this.f6619a.f6627a, true);
            C1712h.this.f6598y.remove(this.f6619a.f6627a);
            C1712h.this.mo7843k();
        }

        public void onAnimationStart(Animator animator) {
            C1712h.this.mo7700b(this.f6619a.f6627a, true);
        }
    }

    /* renamed from: androidx.recyclerview.widget.h$h */
    /* compiled from: DefaultItemAnimator */
    class C1720h extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C1721i f6623a;

        /* renamed from: b */
        final /* synthetic */ ViewPropertyAnimator f6624b;

        /* renamed from: c */
        final /* synthetic */ View f6625c;

        C1720h(C1721i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f6623a = iVar;
            this.f6624b = viewPropertyAnimator;
            this.f6625c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f6624b.setListener(null);
            this.f6625c.setAlpha(1.0f);
            this.f6625c.setTranslationX(0.0f);
            this.f6625c.setTranslationY(0.0f);
            C1712h.this.mo7696a(this.f6623a.f6628b, false);
            C1712h.this.f6598y.remove(this.f6623a.f6628b);
            C1712h.this.mo7843k();
        }

        public void onAnimationStart(Animator animator) {
            C1712h.this.mo7700b(this.f6623a.f6628b, false);
        }
    }

    /* renamed from: androidx.recyclerview.widget.h$i */
    /* compiled from: DefaultItemAnimator */
    private static class C1721i {

        /* renamed from: a */
        public C1635d0 f6627a;

        /* renamed from: b */
        public C1635d0 f6628b;

        /* renamed from: c */
        public int f6629c;

        /* renamed from: d */
        public int f6630d;

        /* renamed from: e */
        public int f6631e;

        /* renamed from: f */
        public int f6632f;

        private C1721i(C1635d0 d0Var, C1635d0 d0Var2) {
            this.f6627a = d0Var;
            this.f6628b = d0Var2;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ChangeInfo{oldHolder=");
            sb.append(this.f6627a);
            sb.append(", newHolder=");
            sb.append(this.f6628b);
            sb.append(", fromX=");
            sb.append(this.f6629c);
            sb.append(", fromY=");
            sb.append(this.f6630d);
            sb.append(", toX=");
            sb.append(this.f6631e);
            sb.append(", toY=");
            sb.append(this.f6632f);
            sb.append('}');
            return sb.toString();
        }

        C1721i(C1635d0 d0Var, C1635d0 d0Var2, int i, int i2, int i3, int i4) {
            this(d0Var, d0Var2);
            this.f6629c = i;
            this.f6630d = i2;
            this.f6631e = i3;
            this.f6632f = i4;
        }
    }

    /* renamed from: androidx.recyclerview.widget.h$j */
    /* compiled from: DefaultItemAnimator */
    private static class C1722j {

        /* renamed from: a */
        public C1635d0 f6633a;

        /* renamed from: b */
        public int f6634b;

        /* renamed from: c */
        public int f6635c;

        /* renamed from: d */
        public int f6636d;

        /* renamed from: e */
        public int f6637e;

        C1722j(C1635d0 d0Var, int i, int i2, int i3, int i4) {
            this.f6633a = d0Var;
            this.f6634b = i;
            this.f6635c = i2;
            this.f6636d = i3;
            this.f6637e = i4;
        }
    }

    /* renamed from: w */
    private void m9283w(C1635d0 d0Var) {
        View view = d0Var.f6294a;
        ViewPropertyAnimator animate = view.animate();
        this.f6597x.add(d0Var);
        animate.setDuration(mo7382f()).alpha(0.0f).setListener(new C1716d(d0Var, animate, view)).start();
    }

    /* renamed from: x */
    private void m9284x(C1635d0 d0Var) {
        if (f6586A == null) {
            f6586A = new ValueAnimator().getInterpolator();
        }
        d0Var.f6294a.animate().setInterpolator(f6586A);
        mo7379d(d0Var);
    }

    /* renamed from: a */
    public boolean mo7698a(C1635d0 d0Var, int i, int i2, int i3, int i4) {
        View view = d0Var.f6294a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) d0Var.f6294a.getTranslationY());
        m9284x(d0Var);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            mo7708l(d0Var);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX((float) (-i5));
        }
        if (i6 != 0) {
            view.setTranslationY((float) (-i6));
        }
        ArrayList<C1722j> arrayList = this.f6590q;
        C1722j jVar = new C1722j(d0Var, translationX, translationY, i3, i4);
        arrayList.add(jVar);
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo7842b(C1635d0 d0Var, int i, int i2, int i3, int i4) {
        View view = d0Var.f6294a;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (i5 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i6 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.f6596w.add(d0Var);
        ViewPropertyAnimator duration = animate.setDuration(mo7380e());
        C1718f fVar = new C1718f(d0Var, i5, view, i6, animate);
        duration.setListener(fVar).start();
    }

    /* renamed from: d */
    public void mo7379d(C1635d0 d0Var) {
        View view = d0Var.f6294a;
        view.animate().cancel();
        int size = this.f6590q.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((C1722j) this.f6590q.get(size)).f6633a == d0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                mo7708l(d0Var);
                this.f6590q.remove(size);
            }
        }
        m9280a((List<C1721i>) this.f6591r, d0Var);
        if (this.f6588o.remove(d0Var)) {
            view.setAlpha(1.0f);
            mo7710n(d0Var);
        }
        if (this.f6589p.remove(d0Var)) {
            view.setAlpha(1.0f);
            mo7705j(d0Var);
        }
        for (int size2 = this.f6594u.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = (ArrayList) this.f6594u.get(size2);
            m9280a((List<C1721i>) arrayList, d0Var);
            if (arrayList.isEmpty()) {
                this.f6594u.remove(size2);
            }
        }
        for (int size3 = this.f6593t.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = (ArrayList) this.f6593t.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((C1722j) arrayList2.get(size4)).f6633a == d0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    mo7708l(d0Var);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f6593t.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f6592s.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = (ArrayList) this.f6592s.get(size5);
            if (arrayList3.remove(d0Var)) {
                view.setAlpha(1.0f);
                mo7705j(d0Var);
                if (arrayList3.isEmpty()) {
                    this.f6592s.remove(size5);
                }
            }
        }
        this.f6597x.remove(d0Var);
        this.f6595v.remove(d0Var);
        this.f6598y.remove(d0Var);
        this.f6596w.remove(d0Var);
        mo7843k();
    }

    /* renamed from: g */
    public boolean mo7384g() {
        return !this.f6589p.isEmpty() || !this.f6591r.isEmpty() || !this.f6590q.isEmpty() || !this.f6588o.isEmpty() || !this.f6596w.isEmpty() || !this.f6597x.isEmpty() || !this.f6595v.isEmpty() || !this.f6598y.isEmpty() || !this.f6593t.isEmpty() || !this.f6592s.isEmpty() || !this.f6594u.isEmpty();
    }

    /* renamed from: h */
    public boolean mo7703h(C1635d0 d0Var) {
        m9284x(d0Var);
        d0Var.f6294a.setAlpha(0.0f);
        this.f6589p.add(d0Var);
        return true;
    }

    /* renamed from: i */
    public void mo7386i() {
        boolean z = !this.f6588o.isEmpty();
        boolean z2 = !this.f6590q.isEmpty();
        boolean z3 = !this.f6591r.isEmpty();
        boolean z4 = !this.f6589p.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator it = this.f6588o.iterator();
            while (it.hasNext()) {
                m9283w((C1635d0) it.next());
            }
            this.f6588o.clear();
            if (z2) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.f6590q);
                this.f6593t.add(arrayList);
                this.f6590q.clear();
                C1713a aVar = new C1713a(arrayList);
                if (z) {
                    C0962e0.m5452a(((C1722j) arrayList.get(0)).f6633a.f6294a, (Runnable) aVar, mo7382f());
                } else {
                    aVar.run();
                }
            }
            if (z3) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.f6591r);
                this.f6594u.add(arrayList2);
                this.f6591r.clear();
                C1714b bVar = new C1714b(arrayList2);
                if (z) {
                    C0962e0.m5452a(((C1721i) arrayList2.get(0)).f6627a.f6294a, (Runnable) bVar, mo7382f());
                } else {
                    bVar.run();
                }
            }
            if (z4) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(this.f6589p);
                this.f6592s.add(arrayList3);
                this.f6589p.clear();
                C1715c cVar = new C1715c(arrayList3);
                if (z || z2 || z3) {
                    long j = 0;
                    long f = z ? mo7382f() : 0;
                    long e = z2 ? mo7380e() : 0;
                    if (z3) {
                        j = mo7377d();
                    }
                    C0962e0.m5452a(((C1635d0) arrayList3.get(0)).f6294a, (Runnable) cVar, f + Math.max(e, j));
                } else {
                    cVar.run();
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public void mo7843k() {
        if (!mo7384g()) {
            mo7361a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: v */
    public void mo7844v(C1635d0 d0Var) {
        View view = d0Var.f6294a;
        ViewPropertyAnimator animate = view.animate();
        this.f6595v.add(d0Var);
        animate.alpha(1.0f).setDuration(mo7373c()).setListener(new C1717e(d0Var, view, animate)).start();
    }

    /* renamed from: b */
    private void m9282b(C1721i iVar) {
        C1635d0 d0Var = iVar.f6627a;
        if (d0Var != null) {
            m9281a(iVar, d0Var);
        }
        C1635d0 d0Var2 = iVar.f6628b;
        if (d0Var2 != null) {
            m9281a(iVar, d0Var2);
        }
    }

    /* renamed from: a */
    public boolean mo7699a(C1635d0 d0Var, C1635d0 d0Var2, int i, int i2, int i3, int i4) {
        if (d0Var == d0Var2) {
            return mo7698a(d0Var, i, i2, i3, i4);
        }
        float translationX = d0Var.f6294a.getTranslationX();
        float translationY = d0Var.f6294a.getTranslationY();
        float alpha = d0Var.f6294a.getAlpha();
        m9284x(d0Var);
        int i5 = (int) (((float) (i3 - i)) - translationX);
        int i6 = (int) (((float) (i4 - i2)) - translationY);
        d0Var.f6294a.setTranslationX(translationX);
        d0Var.f6294a.setTranslationY(translationY);
        d0Var.f6294a.setAlpha(alpha);
        if (d0Var2 != null) {
            m9284x(d0Var2);
            d0Var2.f6294a.setTranslationX((float) (-i5));
            d0Var2.f6294a.setTranslationY((float) (-i6));
            d0Var2.f6294a.setAlpha(0.0f);
        }
        ArrayList<C1721i> arrayList = this.f6591r;
        C1721i iVar = new C1721i(d0Var, d0Var2, i, i2, i3, i4);
        arrayList.add(iVar);
        return true;
    }

    /* renamed from: b */
    public void mo7369b() {
        int size = this.f6590q.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C1722j jVar = (C1722j) this.f6590q.get(size);
            View view = jVar.f6633a.f6294a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            mo7708l(jVar.f6633a);
            this.f6590q.remove(size);
        }
        for (int size2 = this.f6588o.size() - 1; size2 >= 0; size2--) {
            mo7710n((C1635d0) this.f6588o.get(size2));
            this.f6588o.remove(size2);
        }
        int size3 = this.f6589p.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            C1635d0 d0Var = (C1635d0) this.f6589p.get(size3);
            d0Var.f6294a.setAlpha(1.0f);
            mo7705j(d0Var);
            this.f6589p.remove(size3);
        }
        for (int size4 = this.f6591r.size() - 1; size4 >= 0; size4--) {
            m9282b((C1721i) this.f6591r.get(size4));
        }
        this.f6591r.clear();
        if (mo7384g()) {
            for (int size5 = this.f6593t.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = (ArrayList) this.f6593t.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    C1722j jVar2 = (C1722j) arrayList.get(size6);
                    View view2 = jVar2.f6633a.f6294a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    mo7708l(jVar2.f6633a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f6593t.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f6592s.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = (ArrayList) this.f6592s.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    C1635d0 d0Var2 = (C1635d0) arrayList2.get(size8);
                    d0Var2.f6294a.setAlpha(1.0f);
                    mo7705j(d0Var2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f6592s.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f6594u.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = (ArrayList) this.f6594u.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    m9282b((C1721i) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f6594u.remove(arrayList3);
                    }
                }
            }
            mo7841a((List<C1635d0>) this.f6597x);
            mo7841a((List<C1635d0>) this.f6596w);
            mo7841a((List<C1635d0>) this.f6595v);
            mo7841a((List<C1635d0>) this.f6598y);
            mo7361a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo7840a(C1721i iVar) {
        View view;
        C1635d0 d0Var = iVar.f6627a;
        View view2 = null;
        if (d0Var == null) {
            view = null;
        } else {
            view = d0Var.f6294a;
        }
        C1635d0 d0Var2 = iVar.f6628b;
        if (d0Var2 != null) {
            view2 = d0Var2.f6294a;
        }
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(mo7377d());
            this.f6598y.add(iVar.f6627a);
            duration.translationX((float) (iVar.f6631e - iVar.f6629c));
            duration.translationY((float) (iVar.f6632f - iVar.f6630d));
            duration.alpha(0.0f).setListener(new C1719g(iVar, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator animate = view2.animate();
            this.f6598y.add(iVar.f6628b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(mo7377d()).alpha(1.0f).setListener(new C1720h(iVar, animate, view2)).start();
        }
    }

    /* renamed from: i */
    public boolean mo7704i(C1635d0 d0Var) {
        m9284x(d0Var);
        this.f6588o.add(d0Var);
        return true;
    }

    /* renamed from: a */
    private void m9280a(List<C1721i> list, C1635d0 d0Var) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C1721i iVar = (C1721i) list.get(size);
            if (m9281a(iVar, d0Var) && iVar.f6627a == null && iVar.f6628b == null) {
                list.remove(iVar);
            }
        }
    }

    /* renamed from: a */
    private boolean m9281a(C1721i iVar, C1635d0 d0Var) {
        boolean z = false;
        if (iVar.f6628b == d0Var) {
            iVar.f6628b = null;
        } else if (iVar.f6627a != d0Var) {
            return false;
        } else {
            iVar.f6627a = null;
            z = true;
        }
        d0Var.f6294a.setAlpha(1.0f);
        d0Var.f6294a.setTranslationX(0.0f);
        d0Var.f6294a.setTranslationY(0.0f);
        mo7696a(d0Var, z);
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo7841a(List<C1635d0> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            ((C1635d0) list.get(size)).f6294a.animate().cancel();
        }
    }

    /* renamed from: a */
    public boolean mo7367a(@C0193h0 C1635d0 d0Var, @C0193h0 List<Object> list) {
        return !list.isEmpty() || super.mo7367a(d0Var, list);
    }
}
