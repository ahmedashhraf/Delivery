package com.mrsool;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.C1271j;
import androidx.databinding.C1273l;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.library.baseAdapters.C1281c;
import com.mrsool.p417t.C11548b;
import com.mrsool.p417t.C11550d;
import com.mrsool.p417t.C11552f;
import com.mrsool.p417t.C11554h;
import com.mrsool.p417t.C11556j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.mrsool.l */
/* compiled from: DataBinderMapperImpl */
public class C10833l extends C1271j {

    /* renamed from: a */
    private static final int f29749a = 1;

    /* renamed from: b */
    private static final int f29750b = 2;

    /* renamed from: c */
    private static final int f29751c = 3;

    /* renamed from: d */
    private static final int f29752d = 4;

    /* renamed from: e */
    private static final int f29753e = 5;

    /* renamed from: f */
    private static final SparseIntArray f29754f = new SparseIntArray(5);

    /* renamed from: com.mrsool.l$a */
    /* compiled from: DataBinderMapperImpl */
    private static class C10834a {

        /* renamed from: a */
        static final SparseArray<String> f29755a = new SparseArray<>(3);

        static {
            f29755a.put(0, "_all");
            f29755a.put(1, "isPickup");
        }

        private C10834a() {
        }
    }

    /* renamed from: com.mrsool.l$b */
    /* compiled from: DataBinderMapperImpl */
    private static class C10835b {

        /* renamed from: a */
        static final HashMap<String, Integer> f29756a = new HashMap<>(5);

        static {
            f29756a.put("layout/custom_marker_branch_new_order_0", Integer.valueOf(C10232R.layout.custom_marker_branch_new_order));
            f29756a.put("layout/tooltip_card_cvv_expiry_0", Integer.valueOf(C10232R.layout.tooltip_card_cvv_expiry));
            f29756a.put("layout/view_tooltip_0", Integer.valueOf(C10232R.layout.view_tooltip));
            f29756a.put("layout/view_tooltip_up_end_arrow_0", Integer.valueOf(C10232R.layout.view_tooltip_up_end_arrow));
            f29756a.put("layout/view_tooltip_up_end_arrow1_0", Integer.valueOf(C10232R.layout.view_tooltip_up_end_arrow1));
        }

        private C10835b() {
        }
    }

    static {
        f29754f.put(C10232R.layout.custom_marker_branch_new_order, 1);
        f29754f.put(C10232R.layout.tooltip_card_cvv_expiry, 2);
        f29754f.put(C10232R.layout.view_tooltip, 3);
        f29754f.put(C10232R.layout.view_tooltip_up_end_arrow, 4);
        f29754f.put(C10232R.layout.view_tooltip_up_end_arrow1, 5);
    }

    /* renamed from: a */
    public ViewDataBinding mo5674a(C1273l lVar, View view, int i) {
        int i2 = f29754f.get(i);
        if (i2 > 0) {
            Object tag = view.getTag();
            if (tag == null) {
                throw new RuntimeException("view must have a tag");
            } else if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 == 5) {
                                if ("layout/view_tooltip_up_end_arrow1_0".equals(tag)) {
                                    return new C11554h(lVar, view);
                                }
                                StringBuilder sb = new StringBuilder();
                                sb.append("The tag for view_tooltip_up_end_arrow1 is invalid. Received: ");
                                sb.append(tag);
                                throw new IllegalArgumentException(sb.toString());
                            }
                        } else if ("layout/view_tooltip_up_end_arrow_0".equals(tag)) {
                            return new C11556j(lVar, view);
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("The tag for view_tooltip_up_end_arrow is invalid. Received: ");
                            sb2.append(tag);
                            throw new IllegalArgumentException(sb2.toString());
                        }
                    } else if ("layout/view_tooltip_0".equals(tag)) {
                        return new C11552f(lVar, view);
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("The tag for view_tooltip is invalid. Received: ");
                        sb3.append(tag);
                        throw new IllegalArgumentException(sb3.toString());
                    }
                } else if ("layout/tooltip_card_cvv_expiry_0".equals(tag)) {
                    return new C11550d(lVar, view);
                } else {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("The tag for tooltip_card_cvv_expiry is invalid. Received: ");
                    sb4.append(tag);
                    throw new IllegalArgumentException(sb4.toString());
                }
            } else if ("layout/custom_marker_branch_new_order_0".equals(tag)) {
                return new C11548b(lVar, view);
            } else {
                StringBuilder sb5 = new StringBuilder();
                sb5.append("The tag for custom_marker_branch_new_order is invalid. Received: ");
                sb5.append(tag);
                throw new IllegalArgumentException(sb5.toString());
            }
        }
        return null;
    }

    /* renamed from: a */
    public ViewDataBinding mo5675a(C1273l lVar, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || f29754f.get(i) <= 0 || viewArr[0].getTag() != null) {
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
        Integer num = (Integer) C10835b.f29756a.get(str);
        if (num != null) {
            i = num.intValue();
        }
        return i;
    }

    /* renamed from: a */
    public String mo5676a(int i) {
        return (String) C10834a.f29755a.get(i);
    }

    /* renamed from: a */
    public List<C1271j> mo5677a() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new C1281c());
        return arrayList;
    }
}
