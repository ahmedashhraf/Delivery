package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import androidx.annotation.C0193h0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

@C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.widget.q0 */
/* compiled from: TintContextWrapper */
public class C0543q0 extends ContextWrapper {

    /* renamed from: c */
    private static final Object f2174c = new Object();

    /* renamed from: d */
    private static ArrayList<WeakReference<C0543q0>> f2175d;

    /* renamed from: a */
    private final Resources f2176a;

    /* renamed from: b */
    private final Theme f2177b;

    private C0543q0(@C0193h0 Context context) {
        super(context);
        if (C0565y0.m3091b()) {
            this.f2176a = new C0565y0(this, context.getResources());
            this.f2177b = this.f2176a.newTheme();
            this.f2177b.setTo(context.getTheme());
            return;
        }
        this.f2176a = new C0547s0(this, context.getResources());
        this.f2177b = null;
    }

    /* renamed from: a */
    private static boolean m2894a(@C0193h0 Context context) {
        if ((context instanceof C0543q0) || (context.getResources() instanceof C0547s0) || (context.getResources() instanceof C0565y0)) {
            return false;
        }
        if (VERSION.SDK_INT < 21 || C0565y0.m3091b()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static Context m2895b(@C0193h0 Context context) {
        if (!m2894a(context)) {
            return context;
        }
        synchronized (f2174c) {
            if (f2175d == null) {
                f2175d = new ArrayList<>();
            } else {
                for (int size = f2175d.size() - 1; size >= 0; size--) {
                    WeakReference weakReference = (WeakReference) f2175d.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        f2175d.remove(size);
                    }
                }
                for (int size2 = f2175d.size() - 1; size2 >= 0; size2--) {
                    WeakReference weakReference2 = (WeakReference) f2175d.get(size2);
                    C0543q0 q0Var = weakReference2 != null ? (C0543q0) weakReference2.get() : null;
                    if (q0Var != null && q0Var.getBaseContext() == context) {
                        return q0Var;
                    }
                }
            }
            C0543q0 q0Var2 = new C0543q0(context);
            f2175d.add(new WeakReference(q0Var2));
            return q0Var2;
        }
    }

    public AssetManager getAssets() {
        return this.f2176a.getAssets();
    }

    public Resources getResources() {
        return this.f2176a;
    }

    public Theme getTheme() {
        Theme theme = this.f2177b;
        return theme == null ? super.getTheme() : theme;
    }

    public void setTheme(int i) {
        Theme theme = this.f2177b;
        if (theme == null) {
            super.setTheme(i);
        } else {
            theme.applyStyle(i, true);
        }
    }
}
