package androidx.fragment.app;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.C0635a;
import androidx.core.app.C0815z;
import androidx.core.p034l.C0962e0;
import androidx.core.p034l.C1055y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.fragment.app.o */
/* compiled from: FragmentTransition */
class C1408o {

    /* renamed from: a */
    private static final int[] f5578a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    /* renamed from: b */
    private static final C1419q f5579b = (VERSION.SDK_INT >= 21 ? new C1414p() : null);

    /* renamed from: c */
    private static final C1419q f5580c = m7547a();

    /* renamed from: androidx.fragment.app.o$a */
    /* compiled from: FragmentTransition */
    static class C1409a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ArrayList f5581a;

        C1409a(ArrayList arrayList) {
            this.f5581a = arrayList;
        }

        public void run() {
            C1408o.m7564a(this.f5581a, 4);
        }
    }

    /* renamed from: androidx.fragment.app.o$b */
    /* compiled from: FragmentTransition */
    static class C1410b implements Runnable {

        /* renamed from: N */
        final /* synthetic */ View f5582N;

        /* renamed from: O */
        final /* synthetic */ Fragment f5583O;

        /* renamed from: P */
        final /* synthetic */ ArrayList f5584P;

        /* renamed from: Q */
        final /* synthetic */ ArrayList f5585Q;

        /* renamed from: R */
        final /* synthetic */ ArrayList f5586R;

        /* renamed from: S */
        final /* synthetic */ Object f5587S;

        /* renamed from: a */
        final /* synthetic */ Object f5588a;

        /* renamed from: b */
        final /* synthetic */ C1419q f5589b;

        C1410b(Object obj, C1419q qVar, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
            this.f5588a = obj;
            this.f5589b = qVar;
            this.f5582N = view;
            this.f5583O = fragment;
            this.f5584P = arrayList;
            this.f5585Q = arrayList2;
            this.f5586R = arrayList3;
            this.f5587S = obj2;
        }

        public void run() {
            Object obj = this.f5588a;
            if (obj != null) {
                this.f5589b.mo6428b(obj, this.f5582N);
                this.f5585Q.addAll(C1408o.m7554a(this.f5589b, this.f5588a, this.f5583O, this.f5584P, this.f5582N));
            }
            if (this.f5586R != null) {
                if (this.f5587S != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.f5582N);
                    this.f5589b.mo6424a(this.f5587S, this.f5586R, arrayList);
                }
                this.f5586R.clear();
                this.f5586R.add(this.f5582N);
            }
        }
    }

    /* renamed from: androidx.fragment.app.o$c */
    /* compiled from: FragmentTransition */
    static class C1411c implements Runnable {

        /* renamed from: N */
        final /* synthetic */ boolean f5590N;

        /* renamed from: O */
        final /* synthetic */ C0635a f5591O;

        /* renamed from: P */
        final /* synthetic */ View f5592P;

        /* renamed from: Q */
        final /* synthetic */ C1419q f5593Q;

        /* renamed from: R */
        final /* synthetic */ Rect f5594R;

        /* renamed from: a */
        final /* synthetic */ Fragment f5595a;

        /* renamed from: b */
        final /* synthetic */ Fragment f5596b;

        C1411c(Fragment fragment, Fragment fragment2, boolean z, C0635a aVar, View view, C1419q qVar, Rect rect) {
            this.f5595a = fragment;
            this.f5596b = fragment2;
            this.f5590N = z;
            this.f5591O = aVar;
            this.f5592P = view;
            this.f5593Q = qVar;
            this.f5594R = rect;
        }

        public void run() {
            C1408o.m7556a(this.f5595a, this.f5596b, this.f5590N, this.f5591O, false);
            View view = this.f5592P;
            if (view != null) {
                this.f5593Q.mo6446a(view, this.f5594R);
            }
        }
    }

    /* renamed from: androidx.fragment.app.o$d */
    /* compiled from: FragmentTransition */
    static class C1412d implements Runnable {

        /* renamed from: N */
        final /* synthetic */ Object f5597N;

        /* renamed from: O */
        final /* synthetic */ C1413e f5598O;

        /* renamed from: P */
        final /* synthetic */ ArrayList f5599P;

        /* renamed from: Q */
        final /* synthetic */ View f5600Q;

        /* renamed from: R */
        final /* synthetic */ Fragment f5601R;

        /* renamed from: S */
        final /* synthetic */ Fragment f5602S;

        /* renamed from: T */
        final /* synthetic */ boolean f5603T;

        /* renamed from: U */
        final /* synthetic */ ArrayList f5604U;

        /* renamed from: V */
        final /* synthetic */ Object f5605V;

        /* renamed from: W */
        final /* synthetic */ Rect f5606W;

        /* renamed from: a */
        final /* synthetic */ C1419q f5607a;

        /* renamed from: b */
        final /* synthetic */ C0635a f5608b;

        C1412d(C1419q qVar, C0635a aVar, Object obj, C1413e eVar, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
            this.f5607a = qVar;
            this.f5608b = aVar;
            this.f5597N = obj;
            this.f5598O = eVar;
            this.f5599P = arrayList;
            this.f5600Q = view;
            this.f5601R = fragment;
            this.f5602S = fragment2;
            this.f5603T = z;
            this.f5604U = arrayList2;
            this.f5605V = obj2;
            this.f5606W = rect;
        }

        public void run() {
            C0635a a = C1408o.m7545a(this.f5607a, this.f5608b, this.f5597N, this.f5598O);
            if (a != null) {
                this.f5599P.addAll(a.values());
                this.f5599P.add(this.f5600Q);
            }
            C1408o.m7556a(this.f5601R, this.f5602S, this.f5603T, a, false);
            Object obj = this.f5597N;
            if (obj != null) {
                this.f5607a.mo6430b(obj, this.f5604U, this.f5599P);
                View a2 = C1408o.m7543a(a, this.f5598O, this.f5605V, this.f5603T);
                if (a2 != null) {
                    this.f5607a.mo6446a(a2, this.f5606W);
                }
            }
        }
    }

    /* renamed from: androidx.fragment.app.o$e */
    /* compiled from: FragmentTransition */
    static class C1413e {

        /* renamed from: a */
        public Fragment f5609a;

        /* renamed from: b */
        public boolean f5610b;

        /* renamed from: c */
        public C1373a f5611c;

        /* renamed from: d */
        public Fragment f5612d;

        /* renamed from: e */
        public boolean f5613e;

        /* renamed from: f */
        public C1373a f5614f;

        C1413e() {
        }
    }

    private C1408o() {
    }

    /* renamed from: a */
    private static C1419q m7547a() {
        try {
            return (C1419q) Class.forName("androidx.transition.n").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static void m7571b(C1386i iVar, int i, C1413e eVar, View view, C0635a<String, String> aVar) {
        Object obj;
        C1386i iVar2 = iVar;
        C1413e eVar2 = eVar;
        View view2 = view;
        ViewGroup viewGroup = iVar2.f5455d0.mo6051a() ? (ViewGroup) iVar2.f5455d0.mo6050a(i) : null;
        if (viewGroup != null) {
            Fragment fragment = eVar2.f5609a;
            Fragment fragment2 = eVar2.f5612d;
            C1419q a = m7548a(fragment2, fragment);
            if (a != null) {
                boolean z = eVar2.f5610b;
                boolean z2 = eVar2.f5613e;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                Object a2 = m7551a(a, fragment, z);
                Object b = m7569b(a, fragment2, z2);
                Object obj2 = a2;
                ViewGroup viewGroup2 = viewGroup;
                ArrayList arrayList3 = arrayList2;
                Object b2 = m7568b(a, viewGroup, view, aVar, eVar, arrayList2, arrayList, a2, b);
                Object obj3 = obj2;
                if (obj3 == null && b2 == null) {
                    obj = b;
                    if (obj == null) {
                        return;
                    }
                } else {
                    obj = b;
                }
                ArrayList a3 = m7554a(a, obj, fragment2, arrayList3, view2);
                ArrayList a4 = m7554a(a, obj3, fragment, arrayList, view2);
                m7564a(a4, 4);
                Fragment fragment3 = fragment;
                ArrayList arrayList4 = a3;
                Object a5 = m7552a(a, obj3, obj, b2, fragment3, z);
                if (a5 != null) {
                    m7562a(a, obj, fragment2, arrayList4);
                    ArrayList a6 = a.mo6445a(arrayList);
                    a.mo6422a(a5, obj3, a4, obj, arrayList4, b2, arrayList);
                    ViewGroup viewGroup3 = viewGroup2;
                    a.mo6418a(viewGroup3, a5);
                    a.mo6447a(viewGroup3, arrayList3, arrayList, a6, aVar);
                    m7564a(a4, 0);
                    a.mo6430b(b2, arrayList3, arrayList);
                }
            }
        }
    }

    /* renamed from: a */
    static void m7560a(C1386i iVar, ArrayList<C1373a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, boolean z) {
        if (iVar.f5453b0 >= 1) {
            SparseArray sparseArray = new SparseArray();
            for (int i3 = i; i3 < i2; i3++) {
                C1373a aVar = (C1373a) arrayList.get(i3);
                if (((Boolean) arrayList2.get(i3)).booleanValue()) {
                    m7570b(aVar, sparseArray, z);
                } else {
                    m7557a(aVar, sparseArray, z);
                }
            }
            if (sparseArray.size() != 0) {
                View view = new View(iVar.f5454c0.mo6218c());
                int size = sparseArray.size();
                for (int i4 = 0; i4 < size; i4++) {
                    int keyAt = sparseArray.keyAt(i4);
                    C0635a a = m7544a(keyAt, arrayList, arrayList2, i, i2);
                    C1413e eVar = (C1413e) sparseArray.valueAt(i4);
                    if (z) {
                        m7571b(iVar, keyAt, eVar, view, a);
                    } else {
                        m7559a(iVar, keyAt, eVar, view, a);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static C0635a<String, String> m7544a(int i, ArrayList<C1373a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        ArrayList<String> arrayList3;
        ArrayList arrayList4;
        C0635a<String, String> aVar = new C0635a<>();
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            C1373a aVar2 = (C1373a) arrayList.get(i4);
            if (aVar2.mo6102f(i)) {
                boolean booleanValue = ((Boolean) arrayList2.get(i4)).booleanValue();
                ArrayList<String> arrayList5 = aVar2.f5566o;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    if (booleanValue) {
                        arrayList3 = aVar2.f5566o;
                        arrayList4 = aVar2.f5567p;
                    } else {
                        ArrayList arrayList6 = aVar2.f5566o;
                        arrayList3 = aVar2.f5567p;
                        arrayList4 = arrayList6;
                    }
                    for (int i5 = 0; i5 < size; i5++) {
                        String str = (String) arrayList4.get(i5);
                        String str2 = (String) arrayList3.get(i5);
                        String str3 = (String) aVar.remove(str2);
                        if (str3 != null) {
                            aVar.put(str, str3);
                        } else {
                            aVar.put(str, str2);
                        }
                    }
                }
            }
        }
        return aVar;
    }

    /* renamed from: b */
    private static Object m7569b(C1419q qVar, Fragment fragment, boolean z) {
        Object obj;
        if (fragment == null) {
            return null;
        }
        if (z) {
            obj = fragment.getReturnTransition();
        } else {
            obj = fragment.getExitTransition();
        }
        return qVar.mo6426b(obj);
    }

    /* renamed from: b */
    private static Object m7568b(C1419q qVar, ViewGroup viewGroup, View view, C0635a<String, String> aVar, C1413e eVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        Object obj4;
        Rect rect;
        View view2;
        C1419q qVar2 = qVar;
        View view3 = view;
        C0635a<String, String> aVar2 = aVar;
        C1413e eVar2 = eVar;
        ArrayList<View> arrayList3 = arrayList;
        ArrayList<View> arrayList4 = arrayList2;
        Object obj5 = obj;
        Fragment fragment = eVar2.f5609a;
        Fragment fragment2 = eVar2.f5612d;
        if (fragment != null) {
            fragment.requireView().setVisibility(0);
        }
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = eVar2.f5610b;
        if (aVar.isEmpty()) {
            obj3 = null;
        } else {
            obj3 = m7550a(qVar, fragment, fragment2, z);
        }
        C0635a b = m7567b(qVar, aVar2, obj3, eVar2);
        C0635a a = m7545a(qVar, aVar2, obj3, eVar2);
        if (aVar.isEmpty()) {
            if (b != null) {
                b.clear();
            }
            if (a != null) {
                a.clear();
            }
            obj4 = null;
        } else {
            m7565a(arrayList3, b, (Collection<String>) aVar.keySet());
            m7565a(arrayList4, a, aVar.values());
            obj4 = obj3;
        }
        if (obj5 == null && obj2 == null && obj4 == null) {
            return null;
        }
        m7556a(fragment, fragment2, z, b, true);
        if (obj4 != null) {
            arrayList4.add(view3);
            qVar.mo6429b(obj4, view3, arrayList3);
            m7563a(qVar, obj4, obj2, b, eVar2.f5613e, eVar2.f5614f);
            Rect rect2 = new Rect();
            View a2 = m7543a(a, eVar2, obj5, z);
            if (a2 != null) {
                qVar.mo6419a(obj5, rect2);
            }
            rect = rect2;
            view2 = a2;
        } else {
            view2 = null;
            rect = null;
        }
        C1411c cVar = new C1411c(fragment, fragment2, z, a, view2, qVar, rect);
        C1055y.m6136a(viewGroup, cVar);
        return obj4;
    }

    /* renamed from: a */
    private static void m7562a(C1419q qVar, Object obj, Fragment fragment, ArrayList<View> arrayList) {
        if (fragment != null && obj != null && fragment.mAdded && fragment.mHidden && fragment.mHiddenChanged) {
            fragment.setHideReplaced(true);
            qVar.mo6421a(obj, fragment.getView(), arrayList);
            C1055y.m6136a(fragment.mContainer, new C1409a(arrayList));
        }
    }

    /* renamed from: a */
    private static void m7559a(C1386i iVar, int i, C1413e eVar, View view, C0635a<String, String> aVar) {
        Object obj;
        C1386i iVar2 = iVar;
        C1413e eVar2 = eVar;
        View view2 = view;
        C0635a<String, String> aVar2 = aVar;
        ViewGroup viewGroup = iVar2.f5455d0.mo6051a() ? (ViewGroup) iVar2.f5455d0.mo6050a(i) : null;
        if (viewGroup != null) {
            Fragment fragment = eVar2.f5609a;
            Fragment fragment2 = eVar2.f5612d;
            C1419q a = m7548a(fragment2, fragment);
            if (a != null) {
                boolean z = eVar2.f5610b;
                boolean z2 = eVar2.f5613e;
                Object a2 = m7551a(a, fragment, z);
                Object b = m7569b(a, fragment2, z2);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = arrayList;
                Object obj2 = b;
                Object obj3 = a2;
                C1419q qVar = a;
                Object a3 = m7549a(a, viewGroup, view, aVar, eVar, arrayList, arrayList2, a2, obj2);
                Object obj4 = obj3;
                if (obj4 == null && a3 == null) {
                    obj = obj2;
                    if (obj == null) {
                        return;
                    }
                } else {
                    obj = obj2;
                }
                ArrayList a4 = m7554a(qVar, obj, fragment2, arrayList3, view2);
                Object obj5 = (a4 == null || a4.isEmpty()) ? null : obj;
                qVar.mo6420a(obj4, view2);
                Object a5 = m7552a(qVar, obj4, obj5, a3, fragment, eVar2.f5610b);
                if (a5 != null) {
                    ArrayList arrayList4 = new ArrayList();
                    C1419q qVar2 = qVar;
                    qVar2.mo6422a(a5, obj4, arrayList4, obj5, a4, a3, arrayList2);
                    m7561a(qVar2, viewGroup, fragment, view, arrayList2, obj4, arrayList4, obj5, a4);
                    ArrayList arrayList5 = arrayList2;
                    qVar.mo6448a((View) viewGroup, arrayList5, (Map<String, String>) aVar2);
                    qVar.mo6418a(viewGroup, a5);
                    qVar.mo6449a(viewGroup, arrayList5, (Map<String, String>) aVar2);
                }
            }
        }
    }

    /* renamed from: b */
    private static C0635a<String, View> m7567b(C1419q qVar, C0635a<String, String> aVar, Object obj, C1413e eVar) {
        C0815z zVar;
        ArrayList<String> arrayList;
        if (aVar.isEmpty() || obj == null) {
            aVar.clear();
            return null;
        }
        Fragment fragment = eVar.f5612d;
        C0635a<String, View> aVar2 = new C0635a<>();
        qVar.mo6451a((Map<String, View>) aVar2, fragment.requireView());
        C1373a aVar3 = eVar.f5614f;
        if (eVar.f5613e) {
            zVar = fragment.getEnterTransitionCallback();
            arrayList = aVar3.f5567p;
        } else {
            zVar = fragment.getExitTransitionCallback();
            arrayList = aVar3.f5566o;
        }
        aVar2.mo3210c(arrayList);
        if (zVar != null) {
            zVar.mo4460a((List<String>) arrayList, (Map<String, View>) aVar2);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = (String) arrayList.get(size);
                View view = (View) aVar2.get(str);
                if (view == null) {
                    aVar.remove(str);
                } else if (!str.equals(C0962e0.m5415S(view))) {
                    aVar.put(C0962e0.m5415S(view), (String) aVar.remove(str));
                }
            }
        } else {
            aVar.mo3210c(aVar2.keySet());
        }
        return aVar2;
    }

    /* renamed from: a */
    private static void m7561a(C1419q qVar, ViewGroup viewGroup, Fragment fragment, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        C1410b bVar = new C1410b(obj, qVar, view, fragment, arrayList, arrayList2, arrayList3, obj2);
        ViewGroup viewGroup2 = viewGroup;
        C1055y.m6136a(viewGroup, bVar);
    }

    /* renamed from: a */
    private static C1419q m7548a(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object exitTransition = fragment.getExitTransition();
            if (exitTransition != null) {
                arrayList.add(exitTransition);
            }
            Object returnTransition = fragment.getReturnTransition();
            if (returnTransition != null) {
                arrayList.add(returnTransition);
            }
            Object sharedElementReturnTransition = fragment.getSharedElementReturnTransition();
            if (sharedElementReturnTransition != null) {
                arrayList.add(sharedElementReturnTransition);
            }
        }
        if (fragment2 != null) {
            Object enterTransition = fragment2.getEnterTransition();
            if (enterTransition != null) {
                arrayList.add(enterTransition);
            }
            Object reenterTransition = fragment2.getReenterTransition();
            if (reenterTransition != null) {
                arrayList.add(reenterTransition);
            }
            Object sharedElementEnterTransition = fragment2.getSharedElementEnterTransition();
            if (sharedElementEnterTransition != null) {
                arrayList.add(sharedElementEnterTransition);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        C1419q qVar = f5579b;
        if (qVar != null && m7566a(qVar, (List<Object>) arrayList)) {
            return f5579b;
        }
        C1419q qVar2 = f5580c;
        if (qVar2 != null && m7566a(qVar2, (List<Object>) arrayList)) {
            return f5580c;
        }
        if (f5579b == null && f5580c == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    /* renamed from: b */
    public static void m7570b(C1373a aVar, SparseArray<C1413e> sparseArray, boolean z) {
        if (aVar.f5410K.f5455d0.mo6051a()) {
            for (int size = aVar.f5552a.size() - 1; size >= 0; size--) {
                m7558a(aVar, (C1407a) aVar.f5552a.get(size), sparseArray, true, z);
            }
        }
    }

    /* renamed from: b */
    static boolean m7572b() {
        return (f5579b == null && f5580c == null) ? false : true;
    }

    /* renamed from: a */
    private static boolean m7566a(C1419q qVar, List<Object> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!qVar.mo6425a(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static Object m7550a(C1419q qVar, Fragment fragment, Fragment fragment2, boolean z) {
        Object obj;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        if (z) {
            obj = fragment2.getSharedElementReturnTransition();
        } else {
            obj = fragment.getSharedElementEnterTransition();
        }
        return qVar.mo6431c(qVar.mo6426b(obj));
    }

    /* renamed from: a */
    private static Object m7551a(C1419q qVar, Fragment fragment, boolean z) {
        Object obj;
        if (fragment == null) {
            return null;
        }
        if (z) {
            obj = fragment.getReenterTransition();
        } else {
            obj = fragment.getEnterTransition();
        }
        return qVar.mo6426b(obj);
    }

    /* renamed from: a */
    private static void m7565a(ArrayList<View> arrayList, C0635a<String, View> aVar, Collection<String> collection) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View view = (View) aVar.mo3367d(size);
            if (collection.contains(C0962e0.m5415S(view))) {
                arrayList.add(view);
            }
        }
    }

    /* renamed from: a */
    private static Object m7549a(C1419q qVar, ViewGroup viewGroup, View view, C0635a<String, String> aVar, C1413e eVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        C0635a<String, String> aVar2;
        Object obj3;
        Object obj4;
        Rect rect;
        C1419q qVar2 = qVar;
        C1413e eVar2 = eVar;
        ArrayList<View> arrayList3 = arrayList;
        Object obj5 = obj;
        Fragment fragment = eVar2.f5609a;
        Fragment fragment2 = eVar2.f5612d;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = eVar2.f5610b;
        if (aVar.isEmpty()) {
            aVar2 = aVar;
            obj3 = null;
        } else {
            obj3 = m7550a(qVar2, fragment, fragment2, z);
            aVar2 = aVar;
        }
        C0635a b = m7567b(qVar2, aVar2, obj3, eVar2);
        if (aVar.isEmpty()) {
            obj4 = null;
        } else {
            arrayList3.addAll(b.values());
            obj4 = obj3;
        }
        if (obj5 == null && obj2 == null && obj4 == null) {
            return null;
        }
        m7556a(fragment, fragment2, z, b, true);
        if (obj4 != null) {
            rect = new Rect();
            qVar2.mo6429b(obj4, view, arrayList3);
            m7563a(qVar, obj4, obj2, b, eVar2.f5613e, eVar2.f5614f);
            if (obj5 != null) {
                qVar2.mo6419a(obj5, rect);
            }
        } else {
            rect = null;
        }
        C1412d dVar = r0;
        C1412d dVar2 = new C1412d(qVar, aVar, obj4, eVar, arrayList2, view, fragment, fragment2, z, arrayList, obj, rect);
        C1055y.m6136a(viewGroup, dVar);
        return obj4;
    }

    /* renamed from: a */
    static C0635a<String, View> m7545a(C1419q qVar, C0635a<String, String> aVar, Object obj, C1413e eVar) {
        C0815z zVar;
        ArrayList<String> arrayList;
        Fragment fragment = eVar.f5609a;
        View view = fragment.getView();
        if (aVar.isEmpty() || obj == null || view == null) {
            aVar.clear();
            return null;
        }
        C0635a<String, View> aVar2 = new C0635a<>();
        qVar.mo6451a((Map<String, View>) aVar2, view);
        C1373a aVar3 = eVar.f5611c;
        if (eVar.f5610b) {
            zVar = fragment.getExitTransitionCallback();
            arrayList = aVar3.f5566o;
        } else {
            zVar = fragment.getEnterTransitionCallback();
            arrayList = aVar3.f5567p;
        }
        if (arrayList != null) {
            aVar2.mo3210c(arrayList);
            aVar2.mo3210c(aVar.values());
        }
        if (zVar != null) {
            zVar.mo4460a((List<String>) arrayList, (Map<String, View>) aVar2);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = (String) arrayList.get(size);
                View view2 = (View) aVar2.get(str);
                if (view2 == null) {
                    String a = m7553a(aVar, str);
                    if (a != null) {
                        aVar.remove(a);
                    }
                } else if (!str.equals(C0962e0.m5415S(view2))) {
                    String a2 = m7553a(aVar, str);
                    if (a2 != null) {
                        aVar.put(a2, C0962e0.m5415S(view2));
                    }
                }
            }
        } else {
            m7555a(aVar, aVar2);
        }
        return aVar2;
    }

    /* renamed from: a */
    private static String m7553a(C0635a<String, String> aVar, String str) {
        int size = aVar.size();
        for (int i = 0; i < size; i++) {
            if (str.equals(aVar.mo3367d(i))) {
                return (String) aVar.mo3361b(i);
            }
        }
        return null;
    }

    /* renamed from: a */
    static View m7543a(C0635a<String, View> aVar, C1413e eVar, Object obj, boolean z) {
        String str;
        C1373a aVar2 = eVar.f5611c;
        if (!(obj == null || aVar == null)) {
            ArrayList<String> arrayList = aVar2.f5566o;
            if (arrayList != null && !arrayList.isEmpty()) {
                if (z) {
                    str = (String) aVar2.f5566o.get(0);
                } else {
                    str = (String) aVar2.f5567p.get(0);
                }
                return (View) aVar.get(str);
            }
        }
        return null;
    }

    /* renamed from: a */
    private static void m7563a(C1419q qVar, Object obj, Object obj2, C0635a<String, View> aVar, boolean z, C1373a aVar2) {
        String str;
        ArrayList<String> arrayList = aVar2.f5566o;
        if (arrayList != null && !arrayList.isEmpty()) {
            if (z) {
                str = (String) aVar2.f5567p.get(0);
            } else {
                str = (String) aVar2.f5566o.get(0);
            }
            View view = (View) aVar.get(str);
            qVar.mo6432c(obj, view);
            if (obj2 != null) {
                qVar.mo6432c(obj2, view);
            }
        }
    }

    /* renamed from: a */
    private static void m7555a(C0635a<String, String> aVar, C0635a<String, View> aVar2) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            if (!aVar2.containsKey((String) aVar.mo3367d(size))) {
                aVar.mo3363c(size);
            }
        }
    }

    /* renamed from: a */
    static void m7556a(Fragment fragment, Fragment fragment2, boolean z, C0635a<String, View> aVar, boolean z2) {
        C0815z zVar;
        int i;
        if (z) {
            zVar = fragment2.getEnterTransitionCallback();
        } else {
            zVar = fragment.getEnterTransitionCallback();
        }
        if (zVar != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (aVar == null) {
                i = 0;
            } else {
                i = aVar.size();
            }
            for (int i2 = 0; i2 < i; i2++) {
                arrayList2.add(aVar.mo3361b(i2));
                arrayList.add(aVar.mo3367d(i2));
            }
            if (z2) {
                zVar.mo4461b(arrayList2, arrayList, null);
            } else {
                zVar.mo4459a((List<String>) arrayList2, (List<View>) arrayList, null);
            }
        }
    }

    /* renamed from: a */
    static ArrayList<View> m7554a(C1419q qVar, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View view2 = fragment.getView();
        if (view2 != null) {
            qVar.mo6450a(arrayList2, view2);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        qVar.mo6423a(obj, arrayList2);
        return arrayList2;
    }

    /* renamed from: a */
    static void m7564a(ArrayList<View> arrayList, int i) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((View) arrayList.get(size)).setVisibility(i);
            }
        }
    }

    /* renamed from: a */
    private static Object m7552a(C1419q qVar, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z) {
        boolean z2 = (obj == null || obj2 == null || fragment == null) ? true : z ? fragment.getAllowReturnTransitionOverlap() : fragment.getAllowEnterTransitionOverlap();
        if (z2) {
            return qVar.mo6427b(obj2, obj, obj3);
        }
        return qVar.mo6417a(obj2, obj, obj3);
    }

    /* renamed from: a */
    public static void m7557a(C1373a aVar, SparseArray<C1413e> sparseArray, boolean z) {
        int size = aVar.f5552a.size();
        for (int i = 0; i < size; i++) {
            m7558a(aVar, (C1407a) aVar.f5552a.get(i), sparseArray, false, z);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0041, code lost:
        if (r10.mAdded != false) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0074, code lost:
        if (r10.mPostponedAlpha >= 0.0f) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0076, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0080, code lost:
        if (r10.mHidden == false) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0092, code lost:
        if (r10.mHidden == false) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0094, code lost:
        r1 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00a2  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m7558a(androidx.fragment.app.C1373a r16, androidx.fragment.app.C1406n.C1407a r17, android.util.SparseArray<androidx.fragment.app.C1408o.C1413e> r18, boolean r19, boolean r20) {
        /*
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            androidx.fragment.app.Fragment r10 = r1.f5571b
            if (r10 != 0) goto L_0x000d
            return
        L_0x000d:
            int r11 = r10.mContainerId
            if (r11 != 0) goto L_0x0012
            return
        L_0x0012:
            if (r3 == 0) goto L_0x001b
            int[] r4 = f5578a
            int r1 = r1.f5570a
            r1 = r4[r1]
            goto L_0x001d
        L_0x001b:
            int r1 = r1.f5570a
        L_0x001d:
            r4 = 0
            r5 = 1
            if (r1 == r5) goto L_0x0087
            r6 = 3
            if (r1 == r6) goto L_0x005f
            r6 = 4
            if (r1 == r6) goto L_0x0047
            r6 = 5
            if (r1 == r6) goto L_0x0035
            r6 = 6
            if (r1 == r6) goto L_0x005f
            r6 = 7
            if (r1 == r6) goto L_0x0087
            r1 = 0
        L_0x0031:
            r12 = 0
            r13 = 0
            goto L_0x009a
        L_0x0035:
            if (r20 == 0) goto L_0x0044
            boolean r1 = r10.mHiddenChanged
            if (r1 == 0) goto L_0x0096
            boolean r1 = r10.mHidden
            if (r1 != 0) goto L_0x0096
            boolean r1 = r10.mAdded
            if (r1 == 0) goto L_0x0096
            goto L_0x0094
        L_0x0044:
            boolean r1 = r10.mHidden
            goto L_0x0097
        L_0x0047:
            if (r20 == 0) goto L_0x0056
            boolean r1 = r10.mHiddenChanged
            if (r1 == 0) goto L_0x0078
            boolean r1 = r10.mAdded
            if (r1 == 0) goto L_0x0078
            boolean r1 = r10.mHidden
            if (r1 == 0) goto L_0x0078
        L_0x0055:
            goto L_0x0076
        L_0x0056:
            boolean r1 = r10.mAdded
            if (r1 == 0) goto L_0x0078
            boolean r1 = r10.mHidden
            if (r1 != 0) goto L_0x0078
            goto L_0x0055
        L_0x005f:
            if (r20 == 0) goto L_0x007a
            boolean r1 = r10.mAdded
            if (r1 != 0) goto L_0x0078
            android.view.View r1 = r10.mView
            if (r1 == 0) goto L_0x0078
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L_0x0078
            float r1 = r10.mPostponedAlpha
            r6 = 0
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 < 0) goto L_0x0078
        L_0x0076:
            r1 = 1
            goto L_0x0083
        L_0x0078:
            r1 = 0
            goto L_0x0083
        L_0x007a:
            boolean r1 = r10.mAdded
            if (r1 == 0) goto L_0x0078
            boolean r1 = r10.mHidden
            if (r1 != 0) goto L_0x0078
            goto L_0x0076
        L_0x0083:
            r13 = r1
            r1 = 0
            r12 = 1
            goto L_0x009a
        L_0x0087:
            if (r20 == 0) goto L_0x008c
            boolean r1 = r10.mIsNewlyAdded
            goto L_0x0097
        L_0x008c:
            boolean r1 = r10.mAdded
            if (r1 != 0) goto L_0x0096
            boolean r1 = r10.mHidden
            if (r1 != 0) goto L_0x0096
        L_0x0094:
            r1 = 1
            goto L_0x0097
        L_0x0096:
            r1 = 0
        L_0x0097:
            r4 = r1
            r1 = 1
            goto L_0x0031
        L_0x009a:
            java.lang.Object r6 = r2.get(r11)
            androidx.fragment.app.o$e r6 = (androidx.fragment.app.C1408o.C1413e) r6
            if (r4 == 0) goto L_0x00ac
            androidx.fragment.app.o$e r6 = m7546a(r6, r2, r11)
            r6.f5609a = r10
            r6.f5610b = r3
            r6.f5611c = r0
        L_0x00ac:
            r14 = r6
            r15 = 0
            if (r20 != 0) goto L_0x00d3
            if (r1 == 0) goto L_0x00d3
            if (r14 == 0) goto L_0x00ba
            androidx.fragment.app.Fragment r1 = r14.f5612d
            if (r1 != r10) goto L_0x00ba
            r14.f5612d = r15
        L_0x00ba:
            androidx.fragment.app.i r4 = r0.f5410K
            int r1 = r10.mState
            if (r1 >= r5) goto L_0x00d3
            int r1 = r4.f5453b0
            if (r1 < r5) goto L_0x00d3
            boolean r1 = r0.f5568q
            if (r1 != 0) goto L_0x00d3
            r4.mo6319k(r10)
            r6 = 1
            r7 = 0
            r8 = 0
            r9 = 0
            r5 = r10
            r4.mo6277a(r5, r6, r7, r8, r9)
        L_0x00d3:
            if (r13 == 0) goto L_0x00e5
            if (r14 == 0) goto L_0x00db
            androidx.fragment.app.Fragment r1 = r14.f5612d
            if (r1 != 0) goto L_0x00e5
        L_0x00db:
            androidx.fragment.app.o$e r14 = m7546a(r14, r2, r11)
            r14.f5612d = r10
            r14.f5613e = r3
            r14.f5614f = r0
        L_0x00e5:
            if (r20 != 0) goto L_0x00f1
            if (r12 == 0) goto L_0x00f1
            if (r14 == 0) goto L_0x00f1
            androidx.fragment.app.Fragment r0 = r14.f5609a
            if (r0 != r10) goto L_0x00f1
            r14.f5609a = r15
        L_0x00f1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C1408o.m7558a(androidx.fragment.app.a, androidx.fragment.app.n$a, android.util.SparseArray, boolean, boolean):void");
    }

    /* renamed from: a */
    private static C1413e m7546a(C1413e eVar, SparseArray<C1413e> sparseArray, int i) {
        if (eVar != null) {
            return eVar;
        }
        C1413e eVar2 = new C1413e();
        sparseArray.put(i, eVar2);
        return eVar2;
    }
}
