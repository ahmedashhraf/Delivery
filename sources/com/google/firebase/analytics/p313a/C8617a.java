package com.google.firebase.analytics.p313a;

import android.os.Bundle;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0210o0;
import androidx.annotation.C0226w0;
import com.google.android.gms.common.annotation.C4056a;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.firebase.analytics.a.a */
public interface C8617a {

    @C4056a
    /* renamed from: com.google.firebase.analytics.a.a$a */
    public interface C8618a {
        @C4056a
        /* renamed from: a */
        void mo31974a();

        @C4056a
        /* renamed from: a */
        void mo31975a(Set<String> set);

        @C4056a
        /* renamed from: b */
        void mo31976b();
    }

    @C4056a
    /* renamed from: com.google.firebase.analytics.a.a$b */
    public interface C8619b {
        @C4056a
        /* renamed from: a */
        void mo31977a(int i, @C0195i0 Bundle bundle);
    }

    @C4056a
    /* renamed from: com.google.firebase.analytics.a.a$c */
    public static class C8620c {
        @C4056a

        /* renamed from: a */
        public String f22622a;
        @C4056a

        /* renamed from: b */
        public String f22623b;
        @C4056a

        /* renamed from: c */
        public Object f22624c;
        @C4056a

        /* renamed from: d */
        public String f22625d;
        @C4056a

        /* renamed from: e */
        public long f22626e;
        @C4056a

        /* renamed from: f */
        public String f22627f;
        @C4056a

        /* renamed from: g */
        public Bundle f22628g;
        @C4056a

        /* renamed from: h */
        public String f22629h;
        @C4056a

        /* renamed from: i */
        public Bundle f22630i;
        @C4056a

        /* renamed from: j */
        public long f22631j;
        @C4056a

        /* renamed from: k */
        public String f22632k;
        @C4056a

        /* renamed from: l */
        public Bundle f22633l;
        @C4056a

        /* renamed from: m */
        public long f22634m;
        @C4056a

        /* renamed from: n */
        public boolean f22635n;
        @C4056a

        /* renamed from: o */
        public long f22636o;
    }

    @C4056a
    @C0226w0
    /* renamed from: a */
    int mo31966a(@C0193h0 @C0210o0(min = 1) String str);

    @C4056a
    /* renamed from: a */
    C8618a mo31967a(String str, C8619b bVar);

    @C4056a
    @C0226w0
    /* renamed from: a */
    List<C8620c> mo31968a(@C0193h0 String str, @C0210o0(max = 23, min = 1) @C0195i0 String str2);

    @C4056a
    @C0226w0
    /* renamed from: a */
    Map<String, Object> mo31969a(boolean z);

    @C4056a
    /* renamed from: a */
    void mo31970a(@C0193h0 C8620c cVar);

    @C4056a
    /* renamed from: a */
    void mo31971a(@C0193h0 String str, @C0193h0 String str2, Object obj);

    @C4056a
    void clearConditionalUserProperty(@C0193h0 @C0210o0(max = 24, min = 1) String str, @C0195i0 String str2, @C0195i0 Bundle bundle);

    @C4056a
    void logEvent(@C0193h0 String str, @C0193h0 String str2, Bundle bundle);
}
