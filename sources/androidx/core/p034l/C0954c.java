package androidx.core.p034l;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.DisplayCutout;
import java.util.List;

/* renamed from: androidx.core.l.c */
/* compiled from: DisplayCutoutCompat */
public final class C0954c {

    /* renamed from: a */
    private final Object f4290a;

    public C0954c(Rect rect, List<Rect> list) {
        this(VERSION.SDK_INT >= 28 ? new DisplayCutout(rect, list) : null);
    }

    /* renamed from: a */
    public List<Rect> mo4775a() {
        if (VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.f4290a).getBoundingRects();
        }
        return null;
    }

    /* renamed from: b */
    public int mo4776b() {
        if (VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.f4290a).getSafeInsetBottom();
        }
        return 0;
    }

    /* renamed from: c */
    public int mo4777c() {
        if (VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.f4290a).getSafeInsetLeft();
        }
        return 0;
    }

    /* renamed from: d */
    public int mo4778d() {
        if (VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.f4290a).getSafeInsetRight();
        }
        return 0;
    }

    /* renamed from: e */
    public int mo4779e() {
        if (VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.f4290a).getSafeInsetTop();
        }
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C0954c.class != obj.getClass()) {
            return false;
        }
        C0954c cVar = (C0954c) obj;
        Object obj2 = this.f4290a;
        Object obj3 = cVar.f4290a;
        if (obj2 != null) {
            z = obj2.equals(obj3);
        } else if (obj3 != null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        Object obj = this.f4290a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DisplayCutoutCompat{");
        sb.append(this.f4290a);
        sb.append("}");
        return sb.toString();
    }

    private C0954c(Object obj) {
        this.f4290a = obj;
    }

    /* renamed from: a */
    static C0954c m5381a(Object obj) {
        if (obj == null) {
            return null;
        }
        return new C0954c(obj);
    }
}
