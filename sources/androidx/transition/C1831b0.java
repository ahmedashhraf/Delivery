package androidx.transition;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0183c0;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;

/* renamed from: androidx.transition.b0 */
/* compiled from: Scene */
public class C1831b0 {

    /* renamed from: a */
    private Context f7114a;

    /* renamed from: b */
    private int f7115b = -1;

    /* renamed from: c */
    private ViewGroup f7116c;

    /* renamed from: d */
    private View f7117d;

    /* renamed from: e */
    private Runnable f7118e;

    /* renamed from: f */
    private Runnable f7119f;

    public C1831b0(@C0193h0 ViewGroup viewGroup) {
        this.f7116c = viewGroup;
    }

    @C0193h0
    /* renamed from: a */
    public static C1831b0 m9814a(@C0193h0 ViewGroup viewGroup, @C0183c0 int i, @C0193h0 Context context) {
        SparseArray sparseArray = (SparseArray) viewGroup.getTag(C1822R.C1825id.transition_scene_layoutid_cache);
        if (sparseArray == null) {
            sparseArray = new SparseArray();
            viewGroup.setTag(C1822R.C1825id.transition_scene_layoutid_cache, sparseArray);
        }
        C1831b0 b0Var = (C1831b0) sparseArray.get(i);
        if (b0Var != null) {
            return b0Var;
        }
        C1831b0 b0Var2 = new C1831b0(viewGroup, i, context);
        sparseArray.put(i, b0Var2);
        return b0Var2;
    }

    /* renamed from: b */
    public void mo8247b() {
        if (m9813a(this.f7116c) == this) {
            Runnable runnable = this.f7119f;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    @C0193h0
    /* renamed from: c */
    public ViewGroup mo8249c() {
        return this.f7116c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public boolean mo8250d() {
        return this.f7115b > 0;
    }

    private C1831b0(ViewGroup viewGroup, int i, Context context) {
        this.f7114a = context;
        this.f7116c = viewGroup;
        this.f7115b = i;
    }

    /* renamed from: b */
    public void mo8248b(@C0195i0 Runnable runnable) {
        this.f7119f = runnable;
    }

    /* renamed from: a */
    public void mo8245a() {
        if (this.f7115b > 0 || this.f7117d != null) {
            mo8249c().removeAllViews();
            if (this.f7115b > 0) {
                LayoutInflater.from(this.f7114a).inflate(this.f7115b, this.f7116c);
            } else {
                this.f7116c.addView(this.f7117d);
            }
        }
        Runnable runnable = this.f7118e;
        if (runnable != null) {
            runnable.run();
        }
        m9815a(this.f7116c, this);
    }

    public C1831b0(@C0193h0 ViewGroup viewGroup, @C0193h0 View view) {
        this.f7116c = viewGroup;
        this.f7117d = view;
    }

    /* renamed from: a */
    static void m9815a(@C0193h0 ViewGroup viewGroup, @C0195i0 C1831b0 b0Var) {
        viewGroup.setTag(C1822R.C1825id.transition_current_scene, b0Var);
    }

    @C0195i0
    /* renamed from: a */
    public static C1831b0 m9813a(@C0193h0 ViewGroup viewGroup) {
        return (C1831b0) viewGroup.getTag(C1822R.C1825id.transition_current_scene);
    }

    /* renamed from: a */
    public void mo8246a(@C0195i0 Runnable runnable) {
        this.f7118e = runnable;
    }
}
