package androidx.databinding.library.baseAdapters;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.C1271j;
import androidx.databinding.C1273l;
import androidx.databinding.ViewDataBinding;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: androidx.databinding.library.baseAdapters.c */
/* compiled from: DataBinderMapperImpl */
public class C1281c extends C1271j {

    /* renamed from: a */
    private static final SparseIntArray f5157a = new SparseIntArray(0);

    /* renamed from: androidx.databinding.library.baseAdapters.c$a */
    /* compiled from: DataBinderMapperImpl */
    private static class C1282a {

        /* renamed from: a */
        static final SparseArray<String> f5158a = new SparseArray<>(2);

        static {
            f5158a.put(0, "_all");
        }

        private C1282a() {
        }
    }

    /* renamed from: androidx.databinding.library.baseAdapters.c$b */
    /* compiled from: DataBinderMapperImpl */
    private static class C1283b {

        /* renamed from: a */
        static final HashMap<String, Integer> f5159a = new HashMap<>(0);

        private C1283b() {
        }
    }

    /* renamed from: a */
    public ViewDataBinding mo5674a(C1273l lVar, View view, int i) {
        if (f5157a.get(i) <= 0 || view.getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    /* renamed from: a */
    public ViewDataBinding mo5675a(C1273l lVar, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || f5157a.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    /* renamed from: a */
    public int mo5673a(String str) {
        int i = 0;
        if (str == null) {
            return 0;
        }
        Integer num = (Integer) C1283b.f5159a.get(str);
        if (num != null) {
            i = num.intValue();
        }
        return i;
    }

    /* renamed from: a */
    public String mo5676a(int i) {
        return (String) C1282a.f5158a.get(i);
    }

    /* renamed from: a */
    public List<C1271j> mo5677a() {
        return new ArrayList(0);
    }
}
