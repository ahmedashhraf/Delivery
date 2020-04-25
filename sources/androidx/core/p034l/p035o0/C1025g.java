package androidx.core.p034l.p035o0;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;

/* renamed from: androidx.core.l.o0.g */
/* compiled from: AccessibilityViewCommand */
public interface C1025g {

    /* renamed from: androidx.core.l.o0.g$a */
    /* compiled from: AccessibilityViewCommand */
    public static abstract class C1026a {

        /* renamed from: b */
        private static final Bundle f4651b = new Bundle();

        /* renamed from: a */
        Bundle f4652a;

        @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
        /* renamed from: a */
        public void mo5112a(Bundle bundle) {
            this.f4652a = bundle;
        }
    }

    /* renamed from: androidx.core.l.o0.g$b */
    /* compiled from: AccessibilityViewCommand */
    public static final class C1027b extends C1026a {
        /* renamed from: a */
        public boolean mo5113a() {
            return this.f4652a.getBoolean(C1016d.f4556P);
        }

        /* renamed from: b */
        public int mo5114b() {
            return this.f4652a.getInt(C1016d.f4554N);
        }
    }

    /* renamed from: androidx.core.l.o0.g$c */
    /* compiled from: AccessibilityViewCommand */
    public static final class C1028c extends C1026a {
        /* renamed from: a */
        public String mo5115a() {
            return this.f4652a.getString(C1016d.f4555O);
        }
    }

    /* renamed from: androidx.core.l.o0.g$d */
    /* compiled from: AccessibilityViewCommand */
    public static final class C1029d extends C1026a {
        /* renamed from: a */
        public int mo5116a() {
            return this.f4652a.getInt(C1016d.f4563W);
        }

        /* renamed from: b */
        public int mo5117b() {
            return this.f4652a.getInt(C1016d.f4564X);
        }
    }

    /* renamed from: androidx.core.l.o0.g$e */
    /* compiled from: AccessibilityViewCommand */
    public static final class C1030e extends C1026a {
        /* renamed from: a */
        public int mo5118a() {
            return this.f4652a.getInt(C1016d.f4561U);
        }

        /* renamed from: b */
        public int mo5119b() {
            return this.f4652a.getInt(C1016d.f4560T);
        }
    }

    /* renamed from: androidx.core.l.o0.g$f */
    /* compiled from: AccessibilityViewCommand */
    public static final class C1031f extends C1026a {
        /* renamed from: a */
        public float mo5120a() {
            return this.f4652a.getFloat(C1016d.f4562V);
        }
    }

    /* renamed from: androidx.core.l.o0.g$g */
    /* compiled from: AccessibilityViewCommand */
    public static final class C1032g extends C1026a {
        /* renamed from: a */
        public int mo5121a() {
            return this.f4652a.getInt(C1016d.f4558R);
        }

        /* renamed from: b */
        public int mo5122b() {
            return this.f4652a.getInt(C1016d.f4557Q);
        }
    }

    /* renamed from: androidx.core.l.o0.g$h */
    /* compiled from: AccessibilityViewCommand */
    public static final class C1033h extends C1026a {
        /* renamed from: a */
        public CharSequence mo5123a() {
            return this.f4652a.getCharSequence(C1016d.f4559S);
        }
    }

    /* renamed from: a */
    boolean mo5111a(@C0193h0 View view, @C0195i0 C1026a aVar);
}
