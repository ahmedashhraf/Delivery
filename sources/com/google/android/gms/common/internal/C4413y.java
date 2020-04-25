package com.google.android.gms.common.internal;

import androidx.annotation.C0195i0;
import com.google.android.gms.common.annotation.C4056a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@C4056a
/* renamed from: com.google.android.gms.common.internal.y */
public final class C4413y {

    @C4056a
    /* renamed from: com.google.android.gms.common.internal.y$a */
    public static final class C4414a {

        /* renamed from: a */
        private final List<String> f13541a;

        /* renamed from: b */
        private final Object f13542b;

        private C4414a(Object obj) {
            this.f13542b = C4300a0.m18620a(obj);
            this.f13541a = new ArrayList();
        }

        @C4056a
        /* renamed from: a */
        public final C4414a mo18403a(String str, @C0195i0 Object obj) {
            List<String> list = this.f13541a;
            String str2 = (String) C4300a0.m18620a(str);
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(valueOf).length());
            sb.append(str2);
            sb.append("=");
            sb.append(valueOf);
            list.add(sb.toString());
            return this;
        }

        @C4056a
        public final String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.f13542b.getClass().getSimpleName());
            sb.append('{');
            int size = this.f13541a.size();
            for (int i = 0; i < size; i++) {
                sb.append((String) this.f13541a.get(i));
                if (i < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    private C4413y() {
        throw new AssertionError("Uninstantiable");
    }

    @C4056a
    /* renamed from: a */
    public static boolean m19053a(@C0195i0 Object obj, @C0195i0 Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    @C4056a
    /* renamed from: a */
    public static int m19051a(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    @C4056a
    /* renamed from: a */
    public static C4414a m19052a(Object obj) {
        return new C4414a(obj);
    }
}
