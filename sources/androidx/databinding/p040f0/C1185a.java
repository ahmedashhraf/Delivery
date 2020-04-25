package androidx.databinding.p040f0;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.databinding.C1179d;
import androidx.databinding.C1267g;
import androidx.databinding.C1268h;

@C0207n0({C0208a.LIBRARY})
@C1268h({@C1267g(attribute = "android:listSelector", method = "setSelector", type = AbsListView.class), @C1267g(attribute = "android:scrollingCache", method = "setScrollingCacheEnabled", type = AbsListView.class), @C1267g(attribute = "android:smoothScrollbar", method = "setSmoothScrollbarEnabled", type = AbsListView.class), @C1267g(attribute = "android:onMovedToScrapHeap", method = "setRecyclerListener", type = AbsListView.class)})
/* renamed from: androidx.databinding.f0.a */
/* compiled from: AbsListViewBindingAdapter */
public class C1185a {

    /* renamed from: androidx.databinding.f0.a$a */
    /* compiled from: AbsListViewBindingAdapter */
    static class C1186a implements OnScrollListener {

        /* renamed from: a */
        final /* synthetic */ C1188c f5072a;

        /* renamed from: b */
        final /* synthetic */ C1187b f5073b;

        C1186a(C1188c cVar, C1187b bVar) {
            this.f5072a = cVar;
            this.f5073b = bVar;
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            C1187b bVar = this.f5073b;
            if (bVar != null) {
                bVar.onScroll(absListView, i, i2, i3);
            }
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            C1188c cVar = this.f5072a;
            if (cVar != null) {
                cVar.onScrollStateChanged(absListView, i);
            }
        }
    }

    /* renamed from: androidx.databinding.f0.a$b */
    /* compiled from: AbsListViewBindingAdapter */
    public interface C1187b {
        void onScroll(AbsListView absListView, int i, int i2, int i3);
    }

    /* renamed from: androidx.databinding.f0.a$c */
    /* compiled from: AbsListViewBindingAdapter */
    public interface C1188c {
        void onScrollStateChanged(AbsListView absListView, int i);
    }

    @C1179d(requireAll = false, value = {"android:onScroll", "android:onScrollStateChanged"})
    /* renamed from: a */
    public static void m6729a(AbsListView absListView, C1187b bVar, C1188c cVar) {
        absListView.setOnScrollListener(new C1186a(cVar, bVar));
    }
}
