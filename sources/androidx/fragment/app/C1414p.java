package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.Transition.EpicenterCallback;
import android.transition.Transition.TransitionListener;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.List;

@RequiresApi(21)
/* renamed from: androidx.fragment.app.p */
/* compiled from: FragmentTransitionCompat21 */
class C1414p extends C1419q {

    /* renamed from: androidx.fragment.app.p$a */
    /* compiled from: FragmentTransitionCompat21 */
    class C1415a extends EpicenterCallback {

        /* renamed from: a */
        final /* synthetic */ Rect f5615a;

        C1415a(Rect rect) {
            this.f5615a = rect;
        }

        public Rect onGetEpicenter(Transition transition) {
            return this.f5615a;
        }
    }

    /* renamed from: androidx.fragment.app.p$b */
    /* compiled from: FragmentTransitionCompat21 */
    class C1416b implements TransitionListener {

        /* renamed from: a */
        final /* synthetic */ View f5617a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f5618b;

        C1416b(View view, ArrayList arrayList) {
            this.f5617a = view;
            this.f5618b = arrayList;
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
            this.f5617a.setVisibility(8);
            int size = this.f5618b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f5618b.get(i)).setVisibility(0);
            }
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
        }
    }

    /* renamed from: androidx.fragment.app.p$c */
    /* compiled from: FragmentTransitionCompat21 */
    class C1417c implements TransitionListener {

        /* renamed from: a */
        final /* synthetic */ Object f5620a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f5621b;

        /* renamed from: c */
        final /* synthetic */ Object f5622c;

        /* renamed from: d */
        final /* synthetic */ ArrayList f5623d;

        /* renamed from: e */
        final /* synthetic */ Object f5624e;

        /* renamed from: f */
        final /* synthetic */ ArrayList f5625f;

        C1417c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f5620a = obj;
            this.f5621b = arrayList;
            this.f5622c = obj2;
            this.f5623d = arrayList2;
            this.f5624e = obj3;
            this.f5625f = arrayList3;
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
            Object obj = this.f5620a;
            if (obj != null) {
                C1414p.this.mo6424a(obj, this.f5621b, null);
            }
            Object obj2 = this.f5622c;
            if (obj2 != null) {
                C1414p.this.mo6424a(obj2, this.f5623d, null);
            }
            Object obj3 = this.f5624e;
            if (obj3 != null) {
                C1414p.this.mo6424a(obj3, this.f5625f, null);
            }
        }
    }

    /* renamed from: androidx.fragment.app.p$d */
    /* compiled from: FragmentTransitionCompat21 */
    class C1418d extends EpicenterCallback {

        /* renamed from: a */
        final /* synthetic */ Rect f5627a;

        C1418d(Rect rect) {
            this.f5627a = rect;
        }

        public Rect onGetEpicenter(Transition transition) {
            Rect rect = this.f5627a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f5627a;
        }
    }

    C1414p() {
    }

    /* renamed from: a */
    public boolean mo6425a(Object obj) {
        return obj instanceof Transition;
    }

    /* renamed from: b */
    public Object mo6426b(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    /* renamed from: c */
    public Object mo6431c(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    /* renamed from: a */
    public void mo6423a(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition != null) {
            int i = 0;
            if (transition instanceof TransitionSet) {
                TransitionSet transitionSet = (TransitionSet) transition;
                int transitionCount = transitionSet.getTransitionCount();
                while (i < transitionCount) {
                    mo6423a((Object) transitionSet.getTransitionAt(i), arrayList);
                    i++;
                }
            } else if (!m7573a(transition) && C1419q.m7592a(transition.getTargets())) {
                int size = arrayList.size();
                while (i < size) {
                    transition.addTarget((View) arrayList.get(i));
                    i++;
                }
            }
        }
    }

    /* renamed from: b */
    public void mo6429b(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C1419q.m7591a(targets, (View) arrayList.get(i));
        }
        targets.add(view);
        arrayList.add(view);
        mo6423a((Object) transitionSet, arrayList);
    }

    /* renamed from: c */
    public void mo6432c(Object obj, View view) {
        if (view != null) {
            Transition transition = (Transition) obj;
            Rect rect = new Rect();
            mo6446a(view, rect);
            transition.setEpicenterCallback(new C1415a(rect));
        }
    }

    /* renamed from: b */
    public Object mo6427b(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    /* renamed from: a */
    private static boolean m7573a(Transition transition) {
        return !C1419q.m7592a(transition.getTargetIds()) || !C1419q.m7592a(transition.getTargetNames()) || !C1419q.m7592a(transition.getTargetTypes());
    }

    /* renamed from: b */
    public void mo6430b(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            mo6424a((Object) transitionSet, arrayList, arrayList2);
        }
    }

    /* renamed from: a */
    public void mo6421a(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new C1416b(view, arrayList));
    }

    /* renamed from: a */
    public Object mo6417a(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            transition = new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
        } else if (transition == null) {
            transition = transition2 != null ? transition2 : null;
        }
        if (transition3 == null) {
            return transition;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (transition != null) {
            transitionSet.addTransition(transition);
        }
        transitionSet.addTransition(transition3);
        return transitionSet;
    }

    /* renamed from: b */
    public void mo6428b(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).removeTarget(view);
        }
    }

    /* renamed from: a */
    public void mo6418a(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    /* renamed from: a */
    public void mo6422a(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        Transition transition = (Transition) obj;
        C1417c cVar = new C1417c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3);
        transition.addListener(cVar);
    }

    /* renamed from: a */
    public void mo6424a(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        int i;
        Transition transition = (Transition) obj;
        int i2 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i2 < transitionCount) {
                mo6424a((Object) transitionSet.getTransitionAt(i2), arrayList, arrayList2);
                i2++;
            }
        } else if (!m7573a(transition)) {
            List targets = transition.getTargets();
            if (targets != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
                if (arrayList2 == null) {
                    i = 0;
                } else {
                    i = arrayList2.size();
                }
                while (i2 < i) {
                    transition.addTarget((View) arrayList2.get(i2));
                    i2++;
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    transition.removeTarget((View) arrayList.get(size));
                }
            }
        }
    }

    /* renamed from: a */
    public void mo6420a(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    /* renamed from: a */
    public void mo6419a(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new C1418d(rect));
        }
    }
}
