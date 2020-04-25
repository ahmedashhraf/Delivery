package androidx.databinding.p040f0;

import android.annotation.TargetApi;
import android.os.Build.VERSION;
import android.widget.SearchView;
import android.widget.SearchView.OnQueryTextListener;
import android.widget.SearchView.OnSuggestionListener;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.databinding.C1179d;
import androidx.databinding.C1267g;
import androidx.databinding.C1268h;

@C0207n0({C0208a.LIBRARY})
@C1268h({@C1267g(attribute = "android:onQueryTextFocusChange", method = "setOnQueryTextFocusChangeListener", type = SearchView.class), @C1267g(attribute = "android:onSearchClick", method = "setOnSearchClickListener", type = SearchView.class), @C1267g(attribute = "android:onClose", method = "setOnCloseListener", type = SearchView.class)})
/* renamed from: androidx.databinding.f0.x */
/* compiled from: SearchViewBindingAdapter */
public class C1254x {

    /* renamed from: androidx.databinding.f0.x$a */
    /* compiled from: SearchViewBindingAdapter */
    static class C1255a implements OnQueryTextListener {

        /* renamed from: a */
        final /* synthetic */ C1258d f5127a;

        /* renamed from: b */
        final /* synthetic */ C1257c f5128b;

        C1255a(C1258d dVar, C1257c cVar) {
            this.f5127a = dVar;
            this.f5128b = cVar;
        }

        public boolean onQueryTextChange(String str) {
            C1257c cVar = this.f5128b;
            if (cVar != null) {
                return cVar.onQueryTextChange(str);
            }
            return false;
        }

        public boolean onQueryTextSubmit(String str) {
            C1258d dVar = this.f5127a;
            if (dVar != null) {
                return dVar.onQueryTextSubmit(str);
            }
            return false;
        }
    }

    /* renamed from: androidx.databinding.f0.x$b */
    /* compiled from: SearchViewBindingAdapter */
    static class C1256b implements OnSuggestionListener {

        /* renamed from: a */
        final /* synthetic */ C1260f f5129a;

        /* renamed from: b */
        final /* synthetic */ C1259e f5130b;

        C1256b(C1260f fVar, C1259e eVar) {
            this.f5129a = fVar;
            this.f5130b = eVar;
        }

        public boolean onSuggestionClick(int i) {
            C1259e eVar = this.f5130b;
            if (eVar != null) {
                return eVar.onSuggestionClick(i);
            }
            return false;
        }

        public boolean onSuggestionSelect(int i) {
            C1260f fVar = this.f5129a;
            if (fVar != null) {
                return fVar.onSuggestionSelect(i);
            }
            return false;
        }
    }

    @TargetApi(11)
    /* renamed from: androidx.databinding.f0.x$c */
    /* compiled from: SearchViewBindingAdapter */
    public interface C1257c {
        boolean onQueryTextChange(String str);
    }

    @TargetApi(11)
    /* renamed from: androidx.databinding.f0.x$d */
    /* compiled from: SearchViewBindingAdapter */
    public interface C1258d {
        boolean onQueryTextSubmit(String str);
    }

    @TargetApi(11)
    /* renamed from: androidx.databinding.f0.x$e */
    /* compiled from: SearchViewBindingAdapter */
    public interface C1259e {
        boolean onSuggestionClick(int i);
    }

    @TargetApi(11)
    /* renamed from: androidx.databinding.f0.x$f */
    /* compiled from: SearchViewBindingAdapter */
    public interface C1260f {
        boolean onSuggestionSelect(int i);
    }

    @C1179d(requireAll = false, value = {"android:onQueryTextSubmit", "android:onQueryTextChange"})
    /* renamed from: a */
    public static void m6835a(SearchView searchView, C1258d dVar, C1257c cVar) {
        if (VERSION.SDK_INT < 11) {
            return;
        }
        if (dVar == null && cVar == null) {
            searchView.setOnQueryTextListener(null);
        } else {
            searchView.setOnQueryTextListener(new C1255a(dVar, cVar));
        }
    }

    @C1179d(requireAll = false, value = {"android:onSuggestionSelect", "android:onSuggestionClick"})
    /* renamed from: a */
    public static void m6836a(SearchView searchView, C1260f fVar, C1259e eVar) {
        if (VERSION.SDK_INT < 11) {
            return;
        }
        if (fVar == null && eVar == null) {
            searchView.setOnSuggestionListener(null);
        } else {
            searchView.setOnSuggestionListener(new C1256b(fVar, eVar));
        }
    }
}
