package androidx.databinding;

import android.view.View;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: androidx.databinding.u */
/* compiled from: MergedDataBinderMapper */
public class C1295u extends C1271j {

    /* renamed from: d */
    private static final String f5173d = "MergedDataBinderMapper";

    /* renamed from: a */
    private Set<Class<? extends C1271j>> f5174a = new HashSet();

    /* renamed from: b */
    private List<C1271j> f5175b = new CopyOnWriteArrayList();

    /* renamed from: c */
    private List<String> f5176c = new CopyOnWriteArrayList();

    /* renamed from: a */
    public void mo5696a(C1271j jVar) {
        if (this.f5174a.add(jVar.getClass())) {
            this.f5175b.add(jVar);
            for (C1271j a : jVar.mo5677a()) {
                mo5696a(a);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo5697b(String str) {
        List<String> list = this.f5176c;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".DataBinderMapperImpl");
        list.add(sb.toString());
    }

    /* renamed from: b */
    private boolean m6892b() {
        String str = "unable to add feature mapper for ";
        boolean z = false;
        for (String str2 : this.f5176c) {
            try {
                Class cls = Class.forName(str2);
                if (C1271j.class.isAssignableFrom(cls)) {
                    mo5696a((C1271j) cls.newInstance());
                    this.f5176c.remove(str2);
                    z = true;
                }
            } catch (ClassNotFoundException unused) {
            } catch (IllegalAccessException unused2) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(str2);
                sb.toString();
            } catch (InstantiationException unused3) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(str2);
                sb2.toString();
            }
        }
        return z;
    }

    /* renamed from: a */
    public ViewDataBinding mo5674a(C1273l lVar, View view, int i) {
        for (C1271j a : this.f5175b) {
            ViewDataBinding a2 = a.mo5674a(lVar, view, i);
            if (a2 != null) {
                return a2;
            }
        }
        if (m6892b()) {
            return mo5674a(lVar, view, i);
        }
        return null;
    }

    /* renamed from: a */
    public ViewDataBinding mo5675a(C1273l lVar, View[] viewArr, int i) {
        for (C1271j a : this.f5175b) {
            ViewDataBinding a2 = a.mo5675a(lVar, viewArr, i);
            if (a2 != null) {
                return a2;
            }
        }
        if (m6892b()) {
            return mo5675a(lVar, viewArr, i);
        }
        return null;
    }

    /* renamed from: a */
    public int mo5673a(String str) {
        for (C1271j a : this.f5175b) {
            int a2 = a.mo5673a(str);
            if (a2 != 0) {
                return a2;
            }
        }
        if (m6892b()) {
            return mo5673a(str);
        }
        return 0;
    }

    /* renamed from: a */
    public String mo5676a(int i) {
        for (C1271j a : this.f5175b) {
            String a2 = a.mo5676a(i);
            if (a2 != null) {
                return a2;
            }
        }
        if (m6892b()) {
            return mo5676a(i);
        }
        return null;
    }
}
