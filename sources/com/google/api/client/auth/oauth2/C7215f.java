package com.google.api.client.auth.oauth2;

import com.google.api.client.auth.oauth2.C7222j.C7223a;
import com.google.api.client.http.C7270h0;
import com.google.api.client.http.C7299q;
import com.google.api.client.http.C7305u;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import p076c.p112d.p134b.p135a.p143g.C6381h0;
import p076c.p112d.p134b.p135a.p143g.C6398n;

/* renamed from: com.google.api.client.auth.oauth2.f */
/* compiled from: BearerToken */
public class C7215f {

    /* renamed from: a */
    static final String f20394a = "access_token";

    /* renamed from: b */
    static final Pattern f20395b = Pattern.compile("\\s*error\\s*=\\s*\"?invalid_token\"?");

    /* renamed from: com.google.api.client.auth.oauth2.f$a */
    /* compiled from: BearerToken */
    static final class C7216a implements C7223a {

        /* renamed from: a */
        static final String f20396a = "Bearer ";

        C7216a() {
        }

        /* renamed from: a */
        public void mo28688a(C7305u uVar, String str) throws IOException {
            C7299q i = uVar.mo29111i();
            String valueOf = String.valueOf(str);
            int length = valueOf.length();
            String str2 = f20396a;
            i.mo29020f(length != 0 ? str2.concat(valueOf) : new String(str2));
        }

        /* renamed from: a */
        public String mo28687a(C7305u uVar) {
            List<String> j = uVar.mo29111i().mo29029j();
            if (j != null) {
                for (String str : j) {
                    if (str.startsWith(f20396a)) {
                        return str.substring(7);
                    }
                }
            }
            return null;
        }
    }

    /* renamed from: com.google.api.client.auth.oauth2.f$b */
    /* compiled from: BearerToken */
    static final class C7217b implements C7223a {
        C7217b() {
        }

        /* renamed from: b */
        private static Map<String, Object> m34662b(C7305u uVar) {
            return C6398n.m29725d(C7270h0.m35092a(uVar).mo28921f());
        }

        /* renamed from: a */
        public void mo28688a(C7305u uVar, String str) throws IOException {
            C6381h0.m29667a(!"GET".equals(uVar.mo29117o()), (Object) "HTTP GET method is not supported");
            m34662b(uVar).put("access_token", str);
        }

        /* renamed from: a */
        public String mo28687a(C7305u uVar) {
            Object obj = m34662b(uVar).get("access_token");
            if (obj == null) {
                return null;
            }
            return obj.toString();
        }
    }

    /* renamed from: com.google.api.client.auth.oauth2.f$c */
    /* compiled from: BearerToken */
    static final class C7218c implements C7223a {
        C7218c() {
        }

        /* renamed from: a */
        public void mo28688a(C7305u uVar, String str) throws IOException {
            uVar.mo29126x().mo25098b("access_token", (Object) str);
        }

        /* renamed from: a */
        public String mo28687a(C7305u uVar) {
            Object obj = uVar.mo29126x().get("access_token");
            if (obj == null) {
                return null;
            }
            return obj.toString();
        }
    }

    /* renamed from: a */
    public static C7223a m34657a() {
        return new C7216a();
    }

    /* renamed from: b */
    public static C7223a m34658b() {
        return new C7217b();
    }

    /* renamed from: c */
    public static C7223a m34659c() {
        return new C7218c();
    }
}
