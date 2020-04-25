package androidx.databinding.p040f0;

import android.animation.LayoutTransition;
import android.annotation.TargetApi;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.OnHierarchyChangeListener;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.databinding.C1179d;
import androidx.databinding.C1267g;
import androidx.databinding.C1268h;

@C0207n0({C0208a.LIBRARY})
@C1268h({@C1267g(attribute = "android:alwaysDrawnWithCache", method = "setAlwaysDrawnWithCacheEnabled", type = ViewGroup.class), @C1267g(attribute = "android:animationCache", method = "setAnimationCacheEnabled", type = ViewGroup.class), @C1267g(attribute = "android:splitMotionEvents", method = "setMotionEventSplittingEnabled", type = ViewGroup.class)})
/* renamed from: androidx.databinding.f0.k0 */
/* compiled from: ViewGroupBindingAdapter */
public class C1226k0 {

    /* renamed from: androidx.databinding.f0.k0$a */
    /* compiled from: ViewGroupBindingAdapter */
    static class C1227a implements OnHierarchyChangeListener {

        /* renamed from: a */
        final /* synthetic */ C1232f f5103a;

        /* renamed from: b */
        final /* synthetic */ C1233g f5104b;

        C1227a(C1232f fVar, C1233g gVar) {
            this.f5103a = fVar;
            this.f5104b = gVar;
        }

        public void onChildViewAdded(View view, View view2) {
            C1232f fVar = this.f5103a;
            if (fVar != null) {
                fVar.onChildViewAdded(view, view2);
            }
        }

        public void onChildViewRemoved(View view, View view2) {
            C1233g gVar = this.f5104b;
            if (gVar != null) {
                gVar.onChildViewRemoved(view, view2);
            }
        }
    }

    /* renamed from: androidx.databinding.f0.k0$b */
    /* compiled from: ViewGroupBindingAdapter */
    static class C1228b implements AnimationListener {

        /* renamed from: N */
        final /* synthetic */ C1230d f5105N;

        /* renamed from: a */
        final /* synthetic */ C1231e f5106a;

        /* renamed from: b */
        final /* synthetic */ C1229c f5107b;

        C1228b(C1231e eVar, C1229c cVar, C1230d dVar) {
            this.f5106a = eVar;
            this.f5107b = cVar;
            this.f5105N = dVar;
        }

        public void onAnimationEnd(Animation animation) {
            C1229c cVar = this.f5107b;
            if (cVar != null) {
                cVar.onAnimationEnd(animation);
            }
        }

        public void onAnimationRepeat(Animation animation) {
            C1230d dVar = this.f5105N;
            if (dVar != null) {
                dVar.onAnimationRepeat(animation);
            }
        }

        public void onAnimationStart(Animation animation) {
            C1231e eVar = this.f5106a;
            if (eVar != null) {
                eVar.onAnimationStart(animation);
            }
        }
    }

    /* renamed from: androidx.databinding.f0.k0$c */
    /* compiled from: ViewGroupBindingAdapter */
    public interface C1229c {
        void onAnimationEnd(Animation animation);
    }

    /* renamed from: androidx.databinding.f0.k0$d */
    /* compiled from: ViewGroupBindingAdapter */
    public interface C1230d {
        void onAnimationRepeat(Animation animation);
    }

    /* renamed from: androidx.databinding.f0.k0$e */
    /* compiled from: ViewGroupBindingAdapter */
    public interface C1231e {
        void onAnimationStart(Animation animation);
    }

    /* renamed from: androidx.databinding.f0.k0$f */
    /* compiled from: ViewGroupBindingAdapter */
    public interface C1232f {
        void onChildViewAdded(View view, View view2);
    }

    /* renamed from: androidx.databinding.f0.k0$g */
    /* compiled from: ViewGroupBindingAdapter */
    public interface C1233g {
        void onChildViewRemoved(View view, View view2);
    }

    @TargetApi(11)
    @C1179d({"android:animateLayoutChanges"})
    /* renamed from: a */
    public static void m6811a(ViewGroup viewGroup, boolean z) {
        if (z) {
            viewGroup.setLayoutTransition(new LayoutTransition());
        } else {
            viewGroup.setLayoutTransition(null);
        }
    }

    @C1179d(requireAll = false, value = {"android:onChildViewAdded", "android:onChildViewRemoved"})
    /* renamed from: a */
    public static void m6810a(ViewGroup viewGroup, C1232f fVar, C1233g gVar) {
        if (fVar == null && gVar == null) {
            viewGroup.setOnHierarchyChangeListener(null);
        } else {
            viewGroup.setOnHierarchyChangeListener(new C1227a(fVar, gVar));
        }
    }

    @C1179d(requireAll = false, value = {"android:onAnimationStart", "android:onAnimationEnd", "android:onAnimationRepeat"})
    /* renamed from: a */
    public static void m6809a(ViewGroup viewGroup, C1231e eVar, C1229c cVar, C1230d dVar) {
        if (eVar == null && cVar == null && dVar == null) {
            viewGroup.setLayoutAnimationListener(null);
        } else {
            viewGroup.setLayoutAnimationListener(new C1228b(eVar, cVar, dVar));
        }
    }
}
