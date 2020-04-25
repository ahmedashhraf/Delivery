package com.google.android.gms.common.stats;

import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@C4056a
public abstract class StatsEvent extends AbstractSafeParcelable implements ReflectedParcelable {

    @C4056a
    /* renamed from: com.google.android.gms.common.stats.StatsEvent$a */
    public interface C4461a {
        @C4056a

        /* renamed from: a */
        public static final int f13670a = 7;
        @C4056a

        /* renamed from: b */
        public static final int f13671b = 8;
    }

    /* renamed from: N */
    public abstract int mo18544N();

    /* renamed from: O */
    public abstract long mo18545O();

    /* renamed from: P */
    public abstract long mo18546P();

    /* renamed from: Q */
    public abstract String mo18547Q();

    public String toString() {
        long O = mo18545O();
        int N = mo18544N();
        long P = mo18546P();
        String Q = mo18547Q();
        StringBuilder sb = new StringBuilder(String.valueOf(Q).length() + 53);
        sb.append(O);
        String str = "\t";
        sb.append(str);
        sb.append(N);
        sb.append(str);
        sb.append(P);
        sb.append(Q);
        return sb.toString();
    }
}
