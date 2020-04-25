package androidx.core.p034l;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory;
import android.view.LayoutInflater.Factory2;
import android.view.View;
import androidx.annotation.C0193h0;
import java.lang.reflect.Field;

/* renamed from: androidx.core.l.j */
/* compiled from: LayoutInflaterCompat */
public final class C0994j {

    /* renamed from: a */
    private static final String f4439a = "LayoutInflaterCompatHC";

    /* renamed from: b */
    private static Field f4440b;

    /* renamed from: c */
    private static boolean f4441c;

    /* renamed from: androidx.core.l.j$a */
    /* compiled from: LayoutInflaterCompat */
    static class C0995a implements Factory2 {

        /* renamed from: a */
        final C0997k f4442a;

        C0995a(C0997k kVar) {
            this.f4442a = kVar;
        }

        public View onCreateView(String str, Context context, AttributeSet attributeSet) {
            return this.f4442a.onCreateView(null, str, context, attributeSet);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(C0995a.class.getName());
            sb.append("{");
            sb.append(this.f4442a);
            sb.append("}");
            return sb.toString();
        }

        public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
            return this.f4442a.onCreateView(view, str, context, attributeSet);
        }
    }

    private C0994j() {
    }

    /* renamed from: a */
    private static void m5711a(LayoutInflater layoutInflater, Factory2 factory2) {
        String str = "; inflation may have unexpected results.";
        if (!f4441c) {
            try {
                f4440b = LayoutInflater.class.getDeclaredField("mFactory2");
                f4440b.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("forceSetFactory2 Could not find field 'mFactory2' on class ");
                sb.append(LayoutInflater.class.getName());
                sb.append(str);
                sb.toString();
            }
            f4441c = true;
        }
        Field field = f4440b;
        if (field != null) {
            try {
                field.set(layoutInflater, factory2);
            } catch (IllegalAccessException unused2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("forceSetFactory2 could not set the Factory2 on LayoutInflater ");
                sb2.append(layoutInflater);
                sb2.append(str);
                sb2.toString();
            }
        }
    }

    /* renamed from: b */
    public static void m5713b(@C0193h0 LayoutInflater layoutInflater, @C0193h0 Factory2 factory2) {
        layoutInflater.setFactory2(factory2);
        if (VERSION.SDK_INT < 21) {
            Factory factory = layoutInflater.getFactory();
            if (factory instanceof Factory2) {
                m5711a(layoutInflater, (Factory2) factory);
            } else {
                m5711a(layoutInflater, factory2);
            }
        }
    }

    @Deprecated
    /* renamed from: a */
    public static void m5712a(@C0193h0 LayoutInflater layoutInflater, @C0193h0 C0997k kVar) {
        C0995a aVar = null;
        if (VERSION.SDK_INT >= 21) {
            if (kVar != null) {
                aVar = new C0995a(kVar);
            }
            layoutInflater.setFactory2(aVar);
            return;
        }
        if (kVar != null) {
            aVar = new C0995a(kVar);
        }
        layoutInflater.setFactory2(aVar);
        Factory factory = layoutInflater.getFactory();
        if (factory instanceof Factory2) {
            m5711a(layoutInflater, (Factory2) factory);
        } else {
            m5711a(layoutInflater, (Factory2) aVar);
        }
    }

    @Deprecated
    /* renamed from: a */
    public static C0997k m5710a(LayoutInflater layoutInflater) {
        Factory factory = layoutInflater.getFactory();
        if (factory instanceof C0995a) {
            return ((C0995a) factory).f4442a;
        }
        return null;
    }
}
