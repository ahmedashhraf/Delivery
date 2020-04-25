package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0193h0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.core.p034l.C0962e0;
import androidx.core.p034l.C0985g0;
import androidx.core.p034l.C1055y;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

@SuppressLint({"UnknownNullness"})
@C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.fragment.app.q */
/* compiled from: FragmentTransitionImpl */
public abstract class C1419q {

    /* renamed from: androidx.fragment.app.q$a */
    /* compiled from: FragmentTransitionImpl */
    class C1420a implements Runnable {

        /* renamed from: N */
        final /* synthetic */ ArrayList f5629N;

        /* renamed from: O */
        final /* synthetic */ ArrayList f5630O;

        /* renamed from: P */
        final /* synthetic */ ArrayList f5631P;

        /* renamed from: a */
        final /* synthetic */ int f5633a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f5634b;

        C1420a(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f5633a = i;
            this.f5634b = arrayList;
            this.f5629N = arrayList2;
            this.f5630O = arrayList3;
            this.f5631P = arrayList4;
        }

        public void run() {
            for (int i = 0; i < this.f5633a; i++) {
                C0962e0.m5453a((View) this.f5634b.get(i), (String) this.f5629N.get(i));
                C0962e0.m5453a((View) this.f5630O.get(i), (String) this.f5631P.get(i));
            }
        }
    }

    /* renamed from: androidx.fragment.app.q$b */
    /* compiled from: FragmentTransitionImpl */
    class C1421b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ArrayList f5636a;

        /* renamed from: b */
        final /* synthetic */ Map f5637b;

        C1421b(ArrayList arrayList, Map map) {
            this.f5636a = arrayList;
            this.f5637b = map;
        }

        public void run() {
            int size = this.f5636a.size();
            for (int i = 0; i < size; i++) {
                View view = (View) this.f5636a.get(i);
                String S = C0962e0.m5415S(view);
                if (S != null) {
                    C0962e0.m5453a(view, C1419q.m7590a(this.f5637b, S));
                }
            }
        }
    }

    /* renamed from: androidx.fragment.app.q$c */
    /* compiled from: FragmentTransitionImpl */
    class C1422c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ArrayList f5639a;

        /* renamed from: b */
        final /* synthetic */ Map f5640b;

        C1422c(ArrayList arrayList, Map map) {
            this.f5639a = arrayList;
            this.f5640b = map;
        }

        public void run() {
            int size = this.f5639a.size();
            for (int i = 0; i < size; i++) {
                View view = (View) this.f5639a.get(i);
                C0962e0.m5453a(view, (String) this.f5640b.get(C0962e0.m5415S(view)));
            }
        }
    }

    /* renamed from: a */
    public abstract Object mo6417a(Object obj, Object obj2, Object obj3);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6446a(View view, Rect rect) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect.set(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
    }

    /* renamed from: a */
    public abstract void mo6418a(ViewGroup viewGroup, Object obj);

    /* renamed from: a */
    public abstract void mo6419a(Object obj, Rect rect);

    /* renamed from: a */
    public abstract void mo6420a(Object obj, View view);

    /* renamed from: a */
    public abstract void mo6421a(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: a */
    public abstract void mo6422a(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    /* renamed from: a */
    public abstract void mo6423a(Object obj, ArrayList<View> arrayList);

    /* renamed from: a */
    public abstract void mo6424a(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: a */
    public abstract boolean mo6425a(Object obj);

    /* renamed from: b */
    public abstract Object mo6426b(Object obj);

    /* renamed from: b */
    public abstract Object mo6427b(Object obj, Object obj2, Object obj3);

    /* renamed from: b */
    public abstract void mo6428b(Object obj, View view);

    /* renamed from: b */
    public abstract void mo6429b(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: b */
    public abstract void mo6430b(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: c */
    public abstract Object mo6431c(Object obj);

    /* renamed from: c */
    public abstract void mo6432c(Object obj, View view);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public ArrayList<String> mo6445a(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = (View) arrayList.get(i);
            arrayList2.add(C0962e0.m5415S(view));
            C0962e0.m5453a(view, (String) null);
        }
        return arrayList2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6447a(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < size; i++) {
            View view2 = (View) arrayList.get(i);
            String S = C0962e0.m5415S(view2);
            arrayList4.add(S);
            if (S != null) {
                C0962e0.m5453a(view2, (String) null);
                String str = (String) map.get(S);
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    } else if (str.equals(arrayList3.get(i2))) {
                        C0962e0.m5453a((View) arrayList2.get(i2), S);
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        C1420a aVar = new C1420a(size, arrayList2, arrayList3, arrayList, arrayList4);
        C1055y.m6136a(view, aVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6450a(ArrayList<View> arrayList, View view) {
        if (view.getVisibility() != 0) {
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (C0985g0.m5646c(viewGroup)) {
                arrayList.add(viewGroup);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                mo6450a(arrayList, viewGroup.getChildAt(i));
            }
            return;
        }
        arrayList.add(view);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6451a(Map<String, View> map, @C0193h0 View view) {
        if (view.getVisibility() == 0) {
            String S = C0962e0.m5415S(view);
            if (S != null) {
                map.put(S, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    mo6451a(map, viewGroup.getChildAt(i));
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6448a(View view, ArrayList<View> arrayList, Map<String, String> map) {
        C1055y.m6136a(view, new C1421b(arrayList, map));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6449a(ViewGroup viewGroup, ArrayList<View> arrayList, Map<String, String> map) {
        C1055y.m6136a(viewGroup, new C1422c(arrayList, map));
    }

    /* renamed from: a */
    protected static void m7591a(List<View> list, View view) {
        int size = list.size();
        if (!m7593a(list, view, size)) {
            list.add(view);
            for (int i = size; i < list.size(); i++) {
                View view2 = (View) list.get(i);
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    int childCount = viewGroup.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = viewGroup.getChildAt(i2);
                        if (!m7593a(list, childAt, size)) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static boolean m7593a(List<View> list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    protected static boolean m7592a(List list) {
        return list == null || list.isEmpty();
    }

    /* renamed from: a */
    static String m7590a(Map<String, String> map, String str) {
        for (Entry entry : map.entrySet()) {
            if (str.equals(entry.getValue())) {
                return (String) entry.getKey();
            }
        }
        return null;
    }
}
