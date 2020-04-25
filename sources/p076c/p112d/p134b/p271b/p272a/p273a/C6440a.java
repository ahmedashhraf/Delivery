package p076c.p112d.p134b.p271b.p272a.p273a;

import com.google.api.client.http.C7253a0;
import com.google.api.client.http.C7304t;
import com.google.api.client.http.C7305u;
import com.google.api.client.http.C7308w;
import com.google.api.client.http.C7309x;
import java.io.IOException;
import java.util.List;
import java.util.regex.Pattern;
import p076c.p112d.p134b.p135a.p136d.C6290d;
import p076c.p112d.p134b.p135a.p143g.C2768v;
import p076c.p112d.p134b.p135a.p143g.C6381h0;
import p076c.p112d.p134b.p135a.p235c.C6192a;
import p076c.p112d.p134b.p135a.p235c.p248j.C6251b;
import p076c.p112d.p134b.p135a.p235c.p248j.C6254d;
import p076c.p112d.p134b.p135a.p235c.p248j.p249e.C6255a;
import p076c.p112d.p134b.p135a.p235c.p248j.p249e.C6255a.C6256a;
import p076c.p112d.p134b.p271b.p272a.p273a.p274e.C6463a0;
import p076c.p112d.p134b.p271b.p272a.p273a.p274e.C6465b0;
import p076c.p112d.p134b.p271b.p272a.p273a.p274e.C6466c;
import p076c.p112d.p134b.p271b.p272a.p273a.p274e.C6474g;
import p076c.p112d.p134b.p271b.p272a.p273a.p274e.C6475g0;
import p076c.p112d.p134b.p271b.p272a.p273a.p274e.C6484l;
import p076c.p112d.p134b.p271b.p272a.p273a.p274e.C6492p;
import p076c.p112d.p134b.p271b.p272a.p273a.p274e.C6500t;
import p076c.p112d.p134b.p271b.p272a.p273a.p274e.C6503u0;
import p076c.p112d.p134b.p271b.p272a.p273a.p274e.C6506w;
import p076c.p112d.p134b.p271b.p272a.p273a.p274e.C6508x;

/* renamed from: c.d.b.b.a.a.a */
/* compiled from: PeopleService */
public class C6440a extends C6255a {

    /* renamed from: k */
    public static final String f17917k = "https://people.googleapis.com/";

    /* renamed from: l */
    public static final String f17918l = "";

    /* renamed from: m */
    public static final String f17919m = "batch";

    /* renamed from: n */
    public static final String f17920n = "https://people.googleapis.com/";

    /* renamed from: c.d.b.b.a.a.a$a */
    /* compiled from: PeopleService */
    public static final class C6441a extends C6256a {
        public C6441a(C7253a0 a0Var, C6290d dVar, C7308w wVar) {
            super(a0Var, dVar, "https://people.googleapis.com/", "", wVar, false);
            mo25427b(C6440a.f17919m);
        }

        /* renamed from: d */
        public C6441a m29894d(String str) {
            return (C6441a) super.mo25433d(str);
        }

        /* renamed from: b */
        public C6441a m29884b(String str) {
            return (C6441a) super.mo25427b(str);
        }

        /* renamed from: b */
        public C6441a m29885b(boolean z) {
            return (C6441a) super.mo25428b(z);
        }

        /* renamed from: c */
        public C6441a m29890c(String str) {
            return (C6441a) super.mo25430c(str);
        }

        /* renamed from: c */
        public C6441a m29891c(boolean z) {
            return (C6441a) super.mo25431c(z);
        }

        /* renamed from: a */
        public C6440a m29880a() {
            return new C6440a(this);
        }

        /* renamed from: a */
        public C6441a m29877a(C7308w wVar) {
            return (C6441a) super.mo25423a(wVar);
        }

        /* renamed from: a */
        public C6441a m29878a(String str) {
            return (C6441a) super.mo25424a(str);
        }

        /* renamed from: a */
        public C6441a m29879a(boolean z) {
            return (C6441a) super.mo25425a(z);
        }

        /* renamed from: a */
        public C6441a mo25891a(C6460c cVar) {
            return (C6441a) super.mo25422a((C6254d) cVar);
        }

        /* renamed from: a */
        public C6441a m29875a(C6254d dVar) {
            return (C6441a) super.mo25422a(dVar);
        }
    }

    /* renamed from: c.d.b.b.a.a.a$b */
    /* compiled from: PeopleService */
    public class C6442b {

        /* renamed from: c.d.b.b.a.a.a$b$a */
        /* compiled from: PeopleService */
        public class C6443a extends C6459b<C6466c> {

            /* renamed from: r0 */
            private static final String f17922r0 = "v1/contactGroups:batchGet";
            @C2768v

            /* renamed from: o0 */
            private Integer f17923o0;
            @C2768v

            /* renamed from: p0 */
            private List<String> f17924p0;

            protected C6443a() {
                super(C6440a.this, "GET", f17922r0, null, C6466c.class);
            }

            /* renamed from: P */
            public Integer mo25899P() {
                return this.f17923o0;
            }

            /* renamed from: Q */
            public List<String> mo25900Q() {
                return this.f17924p0;
            }

            /* renamed from: l */
            public C7309x mo25457l() throws IOException {
                return super.mo25457l();
            }

            /* renamed from: c */
            public C6443a m29920c(String str) {
                return (C6443a) super.mo25907c(str);
            }

            /* renamed from: d */
            public C6443a m29922d(String str) {
                return (C6443a) super.mo25908d(str);
            }

            /* renamed from: e */
            public C6443a m29924e(String str) {
                return (C6443a) super.mo25909e(str);
            }

            /* renamed from: f */
            public C7305u mo25452f() throws IOException {
                return super.mo25452f();
            }

            /* renamed from: g */
            public C6443a m29929g(String str) {
                return (C6443a) super.mo25911g(str);
            }

            /* renamed from: h */
            public C6443a m29931h(String str) {
                return (C6443a) super.mo25912h(str);
            }

            /* renamed from: i */
            public C6443a m29933i(String str) {
                return (C6443a) super.mo25913i(str);
            }

            /* renamed from: j */
            public C6443a m29935j(String str) {
                return (C6443a) super.mo25914j(str);
            }

            /* renamed from: k */
            public C6443a m29937k(String str) {
                return (C6443a) super.mo25915k(str);
            }

            /* renamed from: a */
            public C6443a m29909a(String str) {
                return (C6443a) super.mo25903a(str);
            }

            /* renamed from: f */
            public C6443a m29926f(String str) {
                return (C6443a) super.mo25910f(str);
            }

            /* renamed from: a */
            public C6443a m29908a(Boolean bool) {
                return (C6443a) super.mo25901a(bool);
            }

            /* renamed from: a */
            public C6443a mo25902a(Integer num) {
                this.f17923o0 = num;
                return this;
            }

            /* renamed from: a */
            public C6443a mo25904a(List<String> list) {
                this.f17924p0 = list;
                return this;
            }

            /* renamed from: b */
            public C6443a m29917b(String str) {
                return (C6443a) super.mo25906b(str);
            }

            /* renamed from: b */
            public C6443a m29916b(Boolean bool) {
                return (C6443a) super.mo25905b(bool);
            }

            /* renamed from: b */
            public C6443a m29915b(String str, Object obj) {
                return (C6443a) super.m30406b(str, obj);
            }
        }

        /* renamed from: c.d.b.b.a.a.a$b$b */
        /* compiled from: PeopleService */
        public class C6444b extends C6459b<C6474g> {

            /* renamed from: p0 */
            private static final String f17926p0 = "v1/contactGroups";

            protected C6444b(C6484l lVar) {
                super(C6440a.this, "POST", f17926p0, lVar, C6474g.class);
            }

            /* renamed from: c */
            public C6444b m29953c(String str) {
                return (C6444b) super.mo25907c(str);
            }

            /* renamed from: d */
            public C6444b m29955d(String str) {
                return (C6444b) super.mo25908d(str);
            }

            /* renamed from: e */
            public C6444b m29957e(String str) {
                return (C6444b) super.mo25909e(str);
            }

            /* renamed from: f */
            public C6444b m29959f(String str) {
                return (C6444b) super.mo25910f(str);
            }

            /* renamed from: g */
            public C6444b m29961g(String str) {
                return (C6444b) super.mo25911g(str);
            }

            /* renamed from: h */
            public C6444b m29963h(String str) {
                return (C6444b) super.mo25912h(str);
            }

            /* renamed from: i */
            public C6444b m29965i(String str) {
                return (C6444b) super.mo25913i(str);
            }

            /* renamed from: j */
            public C6444b m29967j(String str) {
                return (C6444b) super.mo25914j(str);
            }

            /* renamed from: k */
            public C6444b m29969k(String str) {
                return (C6444b) super.mo25915k(str);
            }

            /* renamed from: a */
            public C6444b m29942a(String str) {
                return (C6444b) super.mo25903a(str);
            }

            /* renamed from: a */
            public C6444b m29941a(Boolean bool) {
                return (C6444b) super.mo25901a(bool);
            }

            /* renamed from: b */
            public C6444b m29950b(String str) {
                return (C6444b) super.mo25906b(str);
            }

            /* renamed from: b */
            public C6444b m29949b(Boolean bool) {
                return (C6444b) super.mo25905b(bool);
            }

            /* renamed from: b */
            public C6444b m29948b(String str, Object obj) {
                return (C6444b) super.m30406b(str, obj);
            }
        }

        /* renamed from: c.d.b.b.a.a.a$b$c */
        /* compiled from: PeopleService */
        public class C6445c extends C6459b<C6492p> {

            /* renamed from: s0 */
            private static final String f17928s0 = "v1/{+resourceName}";

            /* renamed from: o0 */
            private final Pattern f17929o0 = Pattern.compile("^contactGroups/[^/]+$");
            @C2768v

            /* renamed from: p0 */
            private String f17930p0;
            @C2768v

            /* renamed from: q0 */
            private Boolean f17931q0;

            protected C6445c(String str) {
                super(C6440a.this, "DELETE", f17928s0, null, C6492p.class);
                this.f17930p0 = (String) C6381h0.m29664a(str, (Object) "Required parameter resourceName must be specified.");
                if (!C6440a.this.mo25420i()) {
                    C6381h0.m29667a(this.f17929o0.matcher(str).matches(), (Object) "Parameter resourceName must conform to the pattern ^contactGroups/[^/]+$");
                }
            }

            /* renamed from: P */
            public Boolean mo25916P() {
                return this.f17931q0;
            }

            /* renamed from: Q */
            public String mo25917Q() {
                return this.f17930p0;
            }

            /* renamed from: l */
            public C6445c mo25919l(String str) {
                if (!C6440a.this.mo25420i()) {
                    C6381h0.m29667a(this.f17929o0.matcher(str).matches(), (Object) "Parameter resourceName must conform to the pattern ^contactGroups/[^/]+$");
                }
                this.f17930p0 = str;
                return this;
            }

            /* renamed from: c */
            public C6445c m29987c(String str) {
                return (C6445c) super.mo25907c(str);
            }

            /* renamed from: d */
            public C6445c m29989d(String str) {
                return (C6445c) super.mo25908d(str);
            }

            /* renamed from: e */
            public C6445c m29991e(String str) {
                return (C6445c) super.mo25909e(str);
            }

            /* renamed from: f */
            public C6445c m29993f(String str) {
                return (C6445c) super.mo25910f(str);
            }

            /* renamed from: g */
            public C6445c m29995g(String str) {
                return (C6445c) super.mo25911g(str);
            }

            /* renamed from: h */
            public C6445c m29997h(String str) {
                return (C6445c) super.mo25912h(str);
            }

            /* renamed from: i */
            public C6445c m29999i(String str) {
                return (C6445c) super.mo25913i(str);
            }

            /* renamed from: j */
            public C6445c m30001j(String str) {
                return (C6445c) super.mo25914j(str);
            }

            /* renamed from: k */
            public C6445c m30003k(String str) {
                return (C6445c) super.mo25915k(str);
            }

            /* renamed from: a */
            public C6445c m29975a(String str) {
                return (C6445c) super.mo25903a(str);
            }

            /* renamed from: c */
            public C6445c mo25918c(Boolean bool) {
                this.f17931q0 = bool;
                return this;
            }

            /* renamed from: a */
            public C6445c m29974a(Boolean bool) {
                return (C6445c) super.mo25901a(bool);
            }

            /* renamed from: b */
            public C6445c m29983b(String str) {
                return (C6445c) super.mo25906b(str);
            }

            /* renamed from: b */
            public C6445c m29982b(Boolean bool) {
                return (C6445c) super.mo25905b(bool);
            }

            /* renamed from: b */
            public C6445c m29981b(String str, Object obj) {
                return (C6445c) super.m30406b(str, obj);
            }
        }

        /* renamed from: c.d.b.b.a.a.a$b$d */
        /* compiled from: PeopleService */
        public class C6446d extends C6459b<C6474g> {

            /* renamed from: s0 */
            private static final String f17933s0 = "v1/{+resourceName}";

            /* renamed from: o0 */
            private final Pattern f17934o0 = Pattern.compile("^contactGroups/[^/]+$");
            @C2768v

            /* renamed from: p0 */
            private String f17935p0;
            @C2768v

            /* renamed from: q0 */
            private Integer f17936q0;

            protected C6446d(String str) {
                super(C6440a.this, "GET", f17933s0, null, C6474g.class);
                this.f17935p0 = (String) C6381h0.m29664a(str, (Object) "Required parameter resourceName must be specified.");
                if (!C6440a.this.mo25420i()) {
                    C6381h0.m29667a(this.f17934o0.matcher(str).matches(), (Object) "Parameter resourceName must conform to the pattern ^contactGroups/[^/]+$");
                }
            }

            /* renamed from: P */
            public Integer mo25920P() {
                return this.f17936q0;
            }

            /* renamed from: Q */
            public String mo25921Q() {
                return this.f17935p0;
            }

            /* renamed from: l */
            public C7309x mo25457l() throws IOException {
                return super.mo25457l();
            }

            /* renamed from: c */
            public C6446d m30022c(String str) {
                return (C6446d) super.mo25907c(str);
            }

            /* renamed from: d */
            public C6446d m30024d(String str) {
                return (C6446d) super.mo25908d(str);
            }

            /* renamed from: e */
            public C6446d m30026e(String str) {
                return (C6446d) super.mo25909e(str);
            }

            /* renamed from: f */
            public C7305u mo25452f() throws IOException {
                return super.mo25452f();
            }

            /* renamed from: g */
            public C6446d m30031g(String str) {
                return (C6446d) super.mo25911g(str);
            }

            /* renamed from: h */
            public C6446d m30033h(String str) {
                return (C6446d) super.mo25912h(str);
            }

            /* renamed from: i */
            public C6446d m30035i(String str) {
                return (C6446d) super.mo25913i(str);
            }

            /* renamed from: j */
            public C6446d m30037j(String str) {
                return (C6446d) super.mo25914j(str);
            }

            /* renamed from: k */
            public C6446d m30039k(String str) {
                return (C6446d) super.mo25915k(str);
            }

            /* renamed from: l */
            public C6446d mo25923l(String str) {
                if (!C6440a.this.mo25420i()) {
                    C6381h0.m29667a(this.f17934o0.matcher(str).matches(), (Object) "Parameter resourceName must conform to the pattern ^contactGroups/[^/]+$");
                }
                this.f17935p0 = str;
                return this;
            }

            /* renamed from: a */
            public C6446d m30011a(String str) {
                return (C6446d) super.mo25903a(str);
            }

            /* renamed from: f */
            public C6446d m30028f(String str) {
                return (C6446d) super.mo25910f(str);
            }

            /* renamed from: a */
            public C6446d m30010a(Boolean bool) {
                return (C6446d) super.mo25901a(bool);
            }

            /* renamed from: a */
            public C6446d mo25922a(Integer num) {
                this.f17936q0 = num;
                return this;
            }

            /* renamed from: b */
            public C6446d m30019b(String str) {
                return (C6446d) super.mo25906b(str);
            }

            /* renamed from: b */
            public C6446d m30018b(Boolean bool) {
                return (C6446d) super.mo25905b(bool);
            }

            /* renamed from: b */
            public C6446d m30017b(String str, Object obj) {
                return (C6446d) super.m30406b(str, obj);
            }
        }

        /* renamed from: c.d.b.b.a.a.a$b$e */
        /* compiled from: PeopleService */
        public class C6447e extends C6459b<C6508x> {

            /* renamed from: s0 */
            private static final String f17938s0 = "v1/contactGroups";
            @C2768v

            /* renamed from: o0 */
            private String f17939o0;
            @C2768v

            /* renamed from: p0 */
            private String f17940p0;
            @C2768v

            /* renamed from: q0 */
            private Integer f17941q0;

            protected C6447e() {
                super(C6440a.this, "GET", f17938s0, null, C6508x.class);
            }

            /* renamed from: P */
            public Integer mo25924P() {
                return this.f17941q0;
            }

            /* renamed from: Q */
            public String mo25925Q() {
                return this.f17940p0;
            }

            /* renamed from: R */
            public String mo25926R() {
                return this.f17939o0;
            }

            /* renamed from: l */
            public C7309x mo25457l() throws IOException {
                return super.mo25457l();
            }

            /* renamed from: m */
            public C6447e mo25929m(String str) {
                this.f17939o0 = str;
                return this;
            }

            /* renamed from: c */
            public C6447e m30060c(String str) {
                return (C6447e) super.mo25907c(str);
            }

            /* renamed from: d */
            public C6447e m30062d(String str) {
                return (C6447e) super.mo25908d(str);
            }

            /* renamed from: e */
            public C6447e m30064e(String str) {
                return (C6447e) super.mo25909e(str);
            }

            /* renamed from: f */
            public C7305u mo25452f() throws IOException {
                return super.mo25452f();
            }

            /* renamed from: g */
            public C6447e m30069g(String str) {
                return (C6447e) super.mo25911g(str);
            }

            /* renamed from: h */
            public C6447e m30071h(String str) {
                return (C6447e) super.mo25912h(str);
            }

            /* renamed from: i */
            public C6447e m30073i(String str) {
                return (C6447e) super.mo25913i(str);
            }

            /* renamed from: j */
            public C6447e m30075j(String str) {
                return (C6447e) super.mo25914j(str);
            }

            /* renamed from: k */
            public C6447e m30077k(String str) {
                return (C6447e) super.mo25915k(str);
            }

            /* renamed from: l */
            public C6447e mo25928l(String str) {
                this.f17940p0 = str;
                return this;
            }

            /* renamed from: a */
            public C6447e m30049a(String str) {
                return (C6447e) super.mo25903a(str);
            }

            /* renamed from: f */
            public C6447e m30066f(String str) {
                return (C6447e) super.mo25910f(str);
            }

            /* renamed from: a */
            public C6447e m30048a(Boolean bool) {
                return (C6447e) super.mo25901a(bool);
            }

            /* renamed from: a */
            public C6447e mo25927a(Integer num) {
                this.f17941q0 = num;
                return this;
            }

            /* renamed from: b */
            public C6447e m30057b(String str) {
                return (C6447e) super.mo25906b(str);
            }

            /* renamed from: b */
            public C6447e m30056b(Boolean bool) {
                return (C6447e) super.mo25905b(bool);
            }

            /* renamed from: b */
            public C6447e m30055b(String str, Object obj) {
                return (C6447e) super.m30406b(str, obj);
            }
        }

        /* renamed from: c.d.b.b.a.a.a$b$f */
        /* compiled from: PeopleService */
        public class C6448f {

            /* renamed from: c.d.b.b.a.a.a$b$f$a */
            /* compiled from: PeopleService */
            public class C6449a extends C6459b<C6465b0> {

                /* renamed from: r0 */
                private static final String f17944r0 = "v1/{+resourceName}/members:modify";

                /* renamed from: o0 */
                private final Pattern f17945o0 = Pattern.compile("^contactGroups/[^/]+$");
                @C2768v

                /* renamed from: p0 */
                private String f17946p0;

                protected C6449a(String str, C6463a0 a0Var) {
                    super(C6440a.this, "POST", f17944r0, a0Var, C6465b0.class);
                    this.f17946p0 = (String) C6381h0.m29664a(str, (Object) "Required parameter resourceName must be specified.");
                    if (!C6440a.this.mo25420i()) {
                        C6381h0.m29667a(this.f17945o0.matcher(str).matches(), (Object) "Parameter resourceName must conform to the pattern ^contactGroups/[^/]+$");
                    }
                }

                /* renamed from: P */
                public String mo25931P() {
                    return this.f17946p0;
                }

                /* renamed from: l */
                public C6449a mo25932l(String str) {
                    if (!C6440a.this.mo25420i()) {
                        C6381h0.m29667a(this.f17945o0.matcher(str).matches(), (Object) "Parameter resourceName must conform to the pattern ^contactGroups/[^/]+$");
                    }
                    this.f17946p0 = str;
                    return this;
                }

                /* renamed from: c */
                public C6449a m30097c(String str) {
                    return (C6449a) super.mo25907c(str);
                }

                /* renamed from: d */
                public C6449a m30099d(String str) {
                    return (C6449a) super.mo25908d(str);
                }

                /* renamed from: e */
                public C6449a m30101e(String str) {
                    return (C6449a) super.mo25909e(str);
                }

                /* renamed from: f */
                public C6449a m30103f(String str) {
                    return (C6449a) super.mo25910f(str);
                }

                /* renamed from: g */
                public C6449a m30105g(String str) {
                    return (C6449a) super.mo25911g(str);
                }

                /* renamed from: h */
                public C6449a m30107h(String str) {
                    return (C6449a) super.mo25912h(str);
                }

                /* renamed from: i */
                public C6449a m30109i(String str) {
                    return (C6449a) super.mo25913i(str);
                }

                /* renamed from: j */
                public C6449a m30111j(String str) {
                    return (C6449a) super.mo25914j(str);
                }

                /* renamed from: k */
                public C6449a m30113k(String str) {
                    return (C6449a) super.mo25915k(str);
                }

                /* renamed from: a */
                public C6449a m30086a(String str) {
                    return (C6449a) super.mo25903a(str);
                }

                /* renamed from: a */
                public C6449a m30085a(Boolean bool) {
                    return (C6449a) super.mo25901a(bool);
                }

                /* renamed from: b */
                public C6449a m30094b(String str) {
                    return (C6449a) super.mo25906b(str);
                }

                /* renamed from: b */
                public C6449a m30093b(Boolean bool) {
                    return (C6449a) super.mo25905b(bool);
                }

                /* renamed from: b */
                public C6449a m30092b(String str, Object obj) {
                    return (C6449a) super.m30406b(str, obj);
                }
            }

            public C6448f() {
            }

            /* renamed from: a */
            public C6449a mo25930a(String str, C6463a0 a0Var) throws IOException {
                C6449a aVar = new C6449a(str, a0Var);
                C6440a.this.mo25412a(aVar);
                return aVar;
            }
        }

        /* renamed from: c.d.b.b.a.a.a$b$g */
        /* compiled from: PeopleService */
        public class C6450g extends C6459b<C6474g> {

            /* renamed from: r0 */
            private static final String f17948r0 = "v1/{+resourceName}";

            /* renamed from: o0 */
            private final Pattern f17949o0 = Pattern.compile("^contactGroups/[^/]+$");
            @C2768v

            /* renamed from: p0 */
            private String f17950p0;

            protected C6450g(String str, C6503u0 u0Var) {
                super(C6440a.this, "PUT", f17948r0, u0Var, C6474g.class);
                this.f17950p0 = (String) C6381h0.m29664a(str, (Object) "Required parameter resourceName must be specified.");
                if (!C6440a.this.mo25420i()) {
                    C6381h0.m29667a(this.f17949o0.matcher(str).matches(), (Object) "Parameter resourceName must conform to the pattern ^contactGroups/[^/]+$");
                }
            }

            /* renamed from: P */
            public String mo25933P() {
                return this.f17950p0;
            }

            /* renamed from: l */
            public C6450g mo25934l(String str) {
                if (!C6440a.this.mo25420i()) {
                    C6381h0.m29667a(this.f17949o0.matcher(str).matches(), (Object) "Parameter resourceName must conform to the pattern ^contactGroups/[^/]+$");
                }
                this.f17950p0 = str;
                return this;
            }

            /* renamed from: c */
            public C6450g m30130c(String str) {
                return (C6450g) super.mo25907c(str);
            }

            /* renamed from: d */
            public C6450g m30132d(String str) {
                return (C6450g) super.mo25908d(str);
            }

            /* renamed from: e */
            public C6450g m30134e(String str) {
                return (C6450g) super.mo25909e(str);
            }

            /* renamed from: f */
            public C6450g m30136f(String str) {
                return (C6450g) super.mo25910f(str);
            }

            /* renamed from: g */
            public C6450g m30138g(String str) {
                return (C6450g) super.mo25911g(str);
            }

            /* renamed from: h */
            public C6450g m30140h(String str) {
                return (C6450g) super.mo25912h(str);
            }

            /* renamed from: i */
            public C6450g m30142i(String str) {
                return (C6450g) super.mo25913i(str);
            }

            /* renamed from: j */
            public C6450g m30144j(String str) {
                return (C6450g) super.mo25914j(str);
            }

            /* renamed from: k */
            public C6450g m30146k(String str) {
                return (C6450g) super.mo25915k(str);
            }

            /* renamed from: a */
            public C6450g m30119a(String str) {
                return (C6450g) super.mo25903a(str);
            }

            /* renamed from: a */
            public C6450g m30118a(Boolean bool) {
                return (C6450g) super.mo25901a(bool);
            }

            /* renamed from: b */
            public C6450g m30127b(String str) {
                return (C6450g) super.mo25906b(str);
            }

            /* renamed from: b */
            public C6450g m30126b(Boolean bool) {
                return (C6450g) super.mo25905b(bool);
            }

            /* renamed from: b */
            public C6450g m30125b(String str, Object obj) {
                return (C6450g) super.m30406b(str, obj);
            }
        }

        public C6442b() {
        }

        /* renamed from: a */
        public C6443a mo25892a() throws IOException {
            C6443a aVar = new C6443a();
            C6440a.this.mo25412a(aVar);
            return aVar;
        }

        /* renamed from: b */
        public C6446d mo25896b(String str) throws IOException {
            C6446d dVar = new C6446d(str);
            C6440a.this.mo25412a(dVar);
            return dVar;
        }

        /* renamed from: c */
        public C6448f mo25898c() {
            return new C6448f();
        }

        /* renamed from: a */
        public C6444b mo25893a(C6484l lVar) throws IOException {
            C6444b bVar = new C6444b(lVar);
            C6440a.this.mo25412a(bVar);
            return bVar;
        }

        /* renamed from: b */
        public C6447e mo25897b() throws IOException {
            C6447e eVar = new C6447e();
            C6440a.this.mo25412a(eVar);
            return eVar;
        }

        /* renamed from: a */
        public C6445c mo25894a(String str) throws IOException {
            C6445c cVar = new C6445c(str);
            C6440a.this.mo25412a(cVar);
            return cVar;
        }

        /* renamed from: a */
        public C6450g mo25895a(String str, C6503u0 u0Var) throws IOException {
            C6450g gVar = new C6450g(str, u0Var);
            C6440a.this.mo25412a(gVar);
            return gVar;
        }
    }

    /* renamed from: c.d.b.b.a.a.a$c */
    /* compiled from: PeopleService */
    public class C6451c {

        /* renamed from: c.d.b.b.a.a.a$c$a */
        /* compiled from: PeopleService */
        public class C6452a {

            /* renamed from: c.d.b.b.a.a.a$c$a$a */
            /* compiled from: PeopleService */
            public class C6453a extends C6459b<C6506w> {

                /* renamed from: y0 */
                private static final String f17954y0 = "v1/{+resourceName}/connections";

                /* renamed from: o0 */
                private final Pattern f17955o0 = Pattern.compile("^people/[^/]+$");
                @C2768v

                /* renamed from: p0 */
                private String f17956p0;
                @C2768v

                /* renamed from: q0 */
                private String f17957q0;
                @C2768v

                /* renamed from: r0 */
                private Boolean f17958r0;
                @C2768v

                /* renamed from: s0 */
                private String f17959s0;
                @C2768v

                /* renamed from: t0 */
                private Integer f17960t0;
                @C2768v("requestMask.includeField")

                /* renamed from: u0 */
                private String f17961u0;
                @C2768v

                /* renamed from: v0 */
                private String f17962v0;
                @C2768v

                /* renamed from: w0 */
                private String f17963w0;

                protected C6453a(String str) {
                    super(C6440a.this, "GET", f17954y0, null, C6506w.class);
                    this.f17956p0 = (String) C6381h0.m29664a(str, (Object) "Required parameter resourceName must be specified.");
                    if (!C6440a.this.mo25420i()) {
                        C6381h0.m29667a(this.f17955o0.matcher(str).matches(), (Object) "Parameter resourceName must conform to the pattern ^people/[^/]+$");
                    }
                }

                /* renamed from: P */
                public Integer mo25942P() {
                    return this.f17960t0;
                }

                /* renamed from: Q */
                public String mo25943Q() {
                    return this.f17959s0;
                }

                /* renamed from: R */
                public String mo25944R() {
                    return this.f17963w0;
                }

                /* renamed from: S */
                public String mo25945S() {
                    return this.f17961u0;
                }

                /* renamed from: T */
                public Boolean mo25946T() {
                    return this.f17958r0;
                }

                /* renamed from: U */
                public String mo25947U() {
                    return this.f17956p0;
                }

                /* renamed from: V */
                public String mo25948V() {
                    return this.f17957q0;
                }

                /* renamed from: W */
                public String mo25949W() {
                    return this.f17962v0;
                }

                /* renamed from: l */
                public C7309x mo25457l() throws IOException {
                    return super.mo25457l();
                }

                /* renamed from: m */
                public C6453a mo25953m(String str) {
                    this.f17963w0 = str;
                    return this;
                }

                /* renamed from: n */
                public C6453a mo25954n(String str) {
                    this.f17961u0 = str;
                    return this;
                }

                /* renamed from: o */
                public C6453a mo25955o(String str) {
                    if (!C6440a.this.mo25420i()) {
                        C6381h0.m29667a(this.f17955o0.matcher(str).matches(), (Object) "Parameter resourceName must conform to the pattern ^people/[^/]+$");
                    }
                    this.f17956p0 = str;
                    return this;
                }

                /* renamed from: p */
                public C6453a mo25956p(String str) {
                    this.f17957q0 = str;
                    return this;
                }

                /* renamed from: q */
                public C6453a mo25957q(String str) {
                    this.f17962v0 = str;
                    return this;
                }

                /* renamed from: c */
                public C6453a m30179c(String str) {
                    return (C6453a) super.mo25907c(str);
                }

                /* renamed from: d */
                public C6453a m30181d(String str) {
                    return (C6453a) super.mo25908d(str);
                }

                /* renamed from: e */
                public C6453a m30183e(String str) {
                    return (C6453a) super.mo25909e(str);
                }

                /* renamed from: f */
                public C7305u mo25452f() throws IOException {
                    return super.mo25452f();
                }

                /* renamed from: g */
                public C6453a m30188g(String str) {
                    return (C6453a) super.mo25911g(str);
                }

                /* renamed from: h */
                public C6453a m30190h(String str) {
                    return (C6453a) super.mo25912h(str);
                }

                /* renamed from: i */
                public C6453a m30192i(String str) {
                    return (C6453a) super.mo25913i(str);
                }

                /* renamed from: j */
                public C6453a m30194j(String str) {
                    return (C6453a) super.mo25914j(str);
                }

                /* renamed from: k */
                public C6453a m30196k(String str) {
                    return (C6453a) super.mo25915k(str);
                }

                /* renamed from: l */
                public C6453a mo25952l(String str) {
                    this.f17959s0 = str;
                    return this;
                }

                /* renamed from: a */
                public C6453a m30167a(String str) {
                    return (C6453a) super.mo25903a(str);
                }

                /* renamed from: c */
                public C6453a mo25951c(Boolean bool) {
                    this.f17958r0 = bool;
                    return this;
                }

                /* renamed from: f */
                public C6453a m30185f(String str) {
                    return (C6453a) super.mo25910f(str);
                }

                /* renamed from: a */
                public C6453a m30166a(Boolean bool) {
                    return (C6453a) super.mo25901a(bool);
                }

                /* renamed from: a */
                public C6453a mo25950a(Integer num) {
                    this.f17960t0 = num;
                    return this;
                }

                /* renamed from: b */
                public C6453a m30175b(String str) {
                    return (C6453a) super.mo25906b(str);
                }

                /* renamed from: b */
                public C6453a m30174b(Boolean bool) {
                    return (C6453a) super.mo25905b(bool);
                }

                /* renamed from: b */
                public C6453a m30173b(String str, Object obj) {
                    return (C6453a) super.m30406b(str, obj);
                }
            }

            public C6452a() {
            }

            /* renamed from: a */
            public C6453a mo25941a(String str) throws IOException {
                C6453a aVar = new C6453a(str);
                C6440a.this.mo25412a(aVar);
                return aVar;
            }
        }

        /* renamed from: c.d.b.b.a.a.a$c$b */
        /* compiled from: PeopleService */
        public class C6454b extends C6459b<C6475g0> {

            /* renamed from: q0 */
            private static final String f17965q0 = "v1/people:createContact";
            @C2768v

            /* renamed from: o0 */
            private String f17966o0;

            protected C6454b(C6475g0 g0Var) {
                super(C6440a.this, "POST", f17965q0, g0Var, C6475g0.class);
            }

            /* renamed from: P */
            public String mo25958P() {
                return this.f17966o0;
            }

            /* renamed from: l */
            public C6454b mo25959l(String str) {
                this.f17966o0 = str;
                return this;
            }

            /* renamed from: c */
            public C6454b m30219c(String str) {
                return (C6454b) super.mo25907c(str);
            }

            /* renamed from: d */
            public C6454b m30221d(String str) {
                return (C6454b) super.mo25908d(str);
            }

            /* renamed from: e */
            public C6454b m30223e(String str) {
                return (C6454b) super.mo25909e(str);
            }

            /* renamed from: f */
            public C6454b m30225f(String str) {
                return (C6454b) super.mo25910f(str);
            }

            /* renamed from: g */
            public C6454b m30227g(String str) {
                return (C6454b) super.mo25911g(str);
            }

            /* renamed from: h */
            public C6454b m30229h(String str) {
                return (C6454b) super.mo25912h(str);
            }

            /* renamed from: i */
            public C6454b m30231i(String str) {
                return (C6454b) super.mo25913i(str);
            }

            /* renamed from: j */
            public C6454b m30233j(String str) {
                return (C6454b) super.mo25914j(str);
            }

            /* renamed from: k */
            public C6454b m30235k(String str) {
                return (C6454b) super.mo25915k(str);
            }

            /* renamed from: a */
            public C6454b m30208a(String str) {
                return (C6454b) super.mo25903a(str);
            }

            /* renamed from: a */
            public C6454b m30207a(Boolean bool) {
                return (C6454b) super.mo25901a(bool);
            }

            /* renamed from: b */
            public C6454b m30216b(String str) {
                return (C6454b) super.mo25906b(str);
            }

            /* renamed from: b */
            public C6454b m30215b(Boolean bool) {
                return (C6454b) super.mo25905b(bool);
            }

            /* renamed from: b */
            public C6454b m30214b(String str, Object obj) {
                return (C6454b) super.m30406b(str, obj);
            }
        }

        /* renamed from: c.d.b.b.a.a.a$c$c */
        /* compiled from: PeopleService */
        public class C6455c extends C6459b<C6492p> {

            /* renamed from: r0 */
            private static final String f17968r0 = "v1/{+resourceName}:deleteContact";

            /* renamed from: o0 */
            private final Pattern f17969o0 = Pattern.compile("^people/[^/]+$");
            @C2768v

            /* renamed from: p0 */
            private String f17970p0;

            protected C6455c(String str) {
                super(C6440a.this, "DELETE", f17968r0, null, C6492p.class);
                this.f17970p0 = (String) C6381h0.m29664a(str, (Object) "Required parameter resourceName must be specified.");
                if (!C6440a.this.mo25420i()) {
                    C6381h0.m29667a(this.f17969o0.matcher(str).matches(), (Object) "Parameter resourceName must conform to the pattern ^people/[^/]+$");
                }
            }

            /* renamed from: P */
            public String mo25960P() {
                return this.f17970p0;
            }

            /* renamed from: l */
            public C6455c mo25961l(String str) {
                if (!C6440a.this.mo25420i()) {
                    C6381h0.m29667a(this.f17969o0.matcher(str).matches(), (Object) "Parameter resourceName must conform to the pattern ^people/[^/]+$");
                }
                this.f17970p0 = str;
                return this;
            }

            /* renamed from: c */
            public C6455c m30252c(String str) {
                return (C6455c) super.mo25907c(str);
            }

            /* renamed from: d */
            public C6455c m30254d(String str) {
                return (C6455c) super.mo25908d(str);
            }

            /* renamed from: e */
            public C6455c m30256e(String str) {
                return (C6455c) super.mo25909e(str);
            }

            /* renamed from: f */
            public C6455c m30258f(String str) {
                return (C6455c) super.mo25910f(str);
            }

            /* renamed from: g */
            public C6455c m30260g(String str) {
                return (C6455c) super.mo25911g(str);
            }

            /* renamed from: h */
            public C6455c m30262h(String str) {
                return (C6455c) super.mo25912h(str);
            }

            /* renamed from: i */
            public C6455c m30264i(String str) {
                return (C6455c) super.mo25913i(str);
            }

            /* renamed from: j */
            public C6455c m30266j(String str) {
                return (C6455c) super.mo25914j(str);
            }

            /* renamed from: k */
            public C6455c m30268k(String str) {
                return (C6455c) super.mo25915k(str);
            }

            /* renamed from: a */
            public C6455c m30241a(String str) {
                return (C6455c) super.mo25903a(str);
            }

            /* renamed from: a */
            public C6455c m30240a(Boolean bool) {
                return (C6455c) super.mo25901a(bool);
            }

            /* renamed from: b */
            public C6455c m30249b(String str) {
                return (C6455c) super.mo25906b(str);
            }

            /* renamed from: b */
            public C6455c m30248b(Boolean bool) {
                return (C6455c) super.mo25905b(bool);
            }

            /* renamed from: b */
            public C6455c m30247b(String str, Object obj) {
                return (C6455c) super.m30406b(str, obj);
            }
        }

        /* renamed from: c.d.b.b.a.a.a$c$d */
        /* compiled from: PeopleService */
        public class C6456d extends C6459b<C6475g0> {

            /* renamed from: t0 */
            private static final String f17972t0 = "v1/{+resourceName}";

            /* renamed from: o0 */
            private final Pattern f17973o0 = Pattern.compile("^people/[^/]+$");
            @C2768v

            /* renamed from: p0 */
            private String f17974p0;
            @C2768v

            /* renamed from: q0 */
            private String f17975q0;
            @C2768v("requestMask.includeField")

            /* renamed from: r0 */
            private String f17976r0;

            protected C6456d(String str) {
                super(C6440a.this, "GET", f17972t0, null, C6475g0.class);
                this.f17974p0 = (String) C6381h0.m29664a(str, (Object) "Required parameter resourceName must be specified.");
                if (!C6440a.this.mo25420i()) {
                    C6381h0.m29667a(this.f17973o0.matcher(str).matches(), (Object) "Parameter resourceName must conform to the pattern ^people/[^/]+$");
                }
            }

            /* renamed from: P */
            public String mo25962P() {
                return this.f17975q0;
            }

            /* renamed from: Q */
            public String mo25963Q() {
                return this.f17976r0;
            }

            /* renamed from: R */
            public String mo25964R() {
                return this.f17974p0;
            }

            /* renamed from: l */
            public C7309x mo25457l() throws IOException {
                return super.mo25457l();
            }

            /* renamed from: m */
            public C6456d mo25966m(String str) {
                this.f17976r0 = str;
                return this;
            }

            /* renamed from: n */
            public C6456d mo25967n(String str) {
                if (!C6440a.this.mo25420i()) {
                    C6381h0.m29667a(this.f17973o0.matcher(str).matches(), (Object) "Parameter resourceName must conform to the pattern ^people/[^/]+$");
                }
                this.f17974p0 = str;
                return this;
            }

            /* renamed from: c */
            public C6456d m30287c(String str) {
                return (C6456d) super.mo25907c(str);
            }

            /* renamed from: d */
            public C6456d m30289d(String str) {
                return (C6456d) super.mo25908d(str);
            }

            /* renamed from: e */
            public C6456d m30291e(String str) {
                return (C6456d) super.mo25909e(str);
            }

            /* renamed from: f */
            public C7305u mo25452f() throws IOException {
                return super.mo25452f();
            }

            /* renamed from: g */
            public C6456d m30296g(String str) {
                return (C6456d) super.mo25911g(str);
            }

            /* renamed from: h */
            public C6456d m30298h(String str) {
                return (C6456d) super.mo25912h(str);
            }

            /* renamed from: i */
            public C6456d m30300i(String str) {
                return (C6456d) super.mo25913i(str);
            }

            /* renamed from: j */
            public C6456d m30302j(String str) {
                return (C6456d) super.mo25914j(str);
            }

            /* renamed from: k */
            public C6456d m30304k(String str) {
                return (C6456d) super.mo25915k(str);
            }

            /* renamed from: l */
            public C6456d mo25965l(String str) {
                this.f17975q0 = str;
                return this;
            }

            /* renamed from: a */
            public C6456d m30276a(String str) {
                return (C6456d) super.mo25903a(str);
            }

            /* renamed from: f */
            public C6456d m30293f(String str) {
                return (C6456d) super.mo25910f(str);
            }

            /* renamed from: a */
            public C6456d m30275a(Boolean bool) {
                return (C6456d) super.mo25901a(bool);
            }

            /* renamed from: b */
            public C6456d m30284b(String str) {
                return (C6456d) super.mo25906b(str);
            }

            /* renamed from: b */
            public C6456d m30283b(Boolean bool) {
                return (C6456d) super.mo25905b(bool);
            }

            /* renamed from: b */
            public C6456d m30282b(String str, Object obj) {
                return (C6456d) super.m30406b(str, obj);
            }
        }

        /* renamed from: c.d.b.b.a.a.a$c$e */
        /* compiled from: PeopleService */
        public class C6457e extends C6459b<C6500t> {

            /* renamed from: s0 */
            private static final String f17978s0 = "v1/people:batchGet";
            @C2768v("requestMask.includeField")

            /* renamed from: o0 */
            private String f17979o0;
            @C2768v

            /* renamed from: p0 */
            private List<String> f17980p0;
            @C2768v

            /* renamed from: q0 */
            private String f17981q0;

            protected C6457e() {
                super(C6440a.this, "GET", f17978s0, null, C6500t.class);
            }

            /* renamed from: P */
            public String mo25968P() {
                return this.f17981q0;
            }

            /* renamed from: Q */
            public String mo25969Q() {
                return this.f17979o0;
            }

            /* renamed from: R */
            public List<String> mo25970R() {
                return this.f17980p0;
            }

            /* renamed from: l */
            public C7309x mo25457l() throws IOException {
                return super.mo25457l();
            }

            /* renamed from: m */
            public C6457e mo25973m(String str) {
                this.f17979o0 = str;
                return this;
            }

            /* renamed from: c */
            public C6457e m30327c(String str) {
                return (C6457e) super.mo25907c(str);
            }

            /* renamed from: d */
            public C6457e m30329d(String str) {
                return (C6457e) super.mo25908d(str);
            }

            /* renamed from: e */
            public C6457e m30331e(String str) {
                return (C6457e) super.mo25909e(str);
            }

            /* renamed from: f */
            public C7305u mo25452f() throws IOException {
                return super.mo25452f();
            }

            /* renamed from: g */
            public C6457e m30336g(String str) {
                return (C6457e) super.mo25911g(str);
            }

            /* renamed from: h */
            public C6457e m30338h(String str) {
                return (C6457e) super.mo25912h(str);
            }

            /* renamed from: i */
            public C6457e m30340i(String str) {
                return (C6457e) super.mo25913i(str);
            }

            /* renamed from: j */
            public C6457e m30342j(String str) {
                return (C6457e) super.mo25914j(str);
            }

            /* renamed from: k */
            public C6457e m30344k(String str) {
                return (C6457e) super.mo25915k(str);
            }

            /* renamed from: l */
            public C6457e mo25972l(String str) {
                this.f17981q0 = str;
                return this;
            }

            /* renamed from: a */
            public C6457e m30316a(String str) {
                return (C6457e) super.mo25903a(str);
            }

            /* renamed from: f */
            public C6457e m30333f(String str) {
                return (C6457e) super.mo25910f(str);
            }

            /* renamed from: a */
            public C6457e m30315a(Boolean bool) {
                return (C6457e) super.mo25901a(bool);
            }

            /* renamed from: a */
            public C6457e mo25971a(List<String> list) {
                this.f17980p0 = list;
                return this;
            }

            /* renamed from: b */
            public C6457e m30324b(String str) {
                return (C6457e) super.mo25906b(str);
            }

            /* renamed from: b */
            public C6457e m30323b(Boolean bool) {
                return (C6457e) super.mo25905b(bool);
            }

            /* renamed from: b */
            public C6457e m30322b(String str, Object obj) {
                return (C6457e) super.m30406b(str, obj);
            }
        }

        /* renamed from: c.d.b.b.a.a.a$c$f */
        /* compiled from: PeopleService */
        public class C6458f extends C6459b<C6475g0> {

            /* renamed from: s0 */
            private static final String f17983s0 = "v1/{+resourceName}:updateContact";

            /* renamed from: o0 */
            private final Pattern f17984o0 = Pattern.compile("^people/[^/]+$");
            @C2768v

            /* renamed from: p0 */
            private String f17985p0;
            @C2768v

            /* renamed from: q0 */
            private String f17986q0;

            protected C6458f(String str, C6475g0 g0Var) {
                super(C6440a.this, C7304t.f20670f, f17983s0, g0Var, C6475g0.class);
                this.f17985p0 = (String) C6381h0.m29664a(str, (Object) "Required parameter resourceName must be specified.");
                if (!C6440a.this.mo25420i()) {
                    C6381h0.m29667a(this.f17984o0.matcher(str).matches(), (Object) "Parameter resourceName must conform to the pattern ^people/[^/]+$");
                }
            }

            /* renamed from: P */
            public String mo25974P() {
                return this.f17985p0;
            }

            /* renamed from: Q */
            public String mo25975Q() {
                return this.f17986q0;
            }

            /* renamed from: l */
            public C6458f mo25976l(String str) {
                if (!C6440a.this.mo25420i()) {
                    C6381h0.m29667a(this.f17984o0.matcher(str).matches(), (Object) "Parameter resourceName must conform to the pattern ^people/[^/]+$");
                }
                this.f17985p0 = str;
                return this;
            }

            /* renamed from: m */
            public C6458f mo25977m(String str) {
                this.f17986q0 = str;
                return this;
            }

            /* renamed from: c */
            public C6458f m30364c(String str) {
                return (C6458f) super.mo25907c(str);
            }

            /* renamed from: d */
            public C6458f m30366d(String str) {
                return (C6458f) super.mo25908d(str);
            }

            /* renamed from: e */
            public C6458f m30368e(String str) {
                return (C6458f) super.mo25909e(str);
            }

            /* renamed from: f */
            public C6458f m30370f(String str) {
                return (C6458f) super.mo25910f(str);
            }

            /* renamed from: g */
            public C6458f m30372g(String str) {
                return (C6458f) super.mo25911g(str);
            }

            /* renamed from: h */
            public C6458f m30374h(String str) {
                return (C6458f) super.mo25912h(str);
            }

            /* renamed from: i */
            public C6458f m30376i(String str) {
                return (C6458f) super.mo25913i(str);
            }

            /* renamed from: j */
            public C6458f m30378j(String str) {
                return (C6458f) super.mo25914j(str);
            }

            /* renamed from: k */
            public C6458f m30380k(String str) {
                return (C6458f) super.mo25915k(str);
            }

            /* renamed from: a */
            public C6458f m30353a(String str) {
                return (C6458f) super.mo25903a(str);
            }

            /* renamed from: a */
            public C6458f m30352a(Boolean bool) {
                return (C6458f) super.mo25901a(bool);
            }

            /* renamed from: b */
            public C6458f m30361b(String str) {
                return (C6458f) super.mo25906b(str);
            }

            /* renamed from: b */
            public C6458f m30360b(Boolean bool) {
                return (C6458f) super.mo25905b(bool);
            }

            /* renamed from: b */
            public C6458f m30359b(String str, Object obj) {
                return (C6458f) super.m30406b(str, obj);
            }
        }

        public C6451c() {
        }

        /* renamed from: a */
        public C6454b mo25936a(C6475g0 g0Var) throws IOException {
            C6454b bVar = new C6454b(g0Var);
            C6440a.this.mo25412a(bVar);
            return bVar;
        }

        /* renamed from: b */
        public C6456d mo25939b(String str) throws IOException {
            C6456d dVar = new C6456d(str);
            C6440a.this.mo25412a(dVar);
            return dVar;
        }

        /* renamed from: a */
        public C6455c mo25937a(String str) throws IOException {
            C6455c cVar = new C6455c(str);
            C6440a.this.mo25412a(cVar);
            return cVar;
        }

        /* renamed from: b */
        public C6457e mo25940b() throws IOException {
            C6457e eVar = new C6457e();
            C6440a.this.mo25412a(eVar);
            return eVar;
        }

        /* renamed from: a */
        public C6458f mo25938a(String str, C6475g0 g0Var) throws IOException {
            C6458f fVar = new C6458f(str, g0Var);
            C6440a.this.mo25412a(fVar);
            return fVar;
        }

        /* renamed from: a */
        public C6452a mo25935a() {
            return new C6452a();
        }
    }

    static {
        C6381h0.m29671b(C6192a.f17430a.intValue() == 1 && C6192a.f17431b.intValue() >= 15, "You are currently running with version %s of google-api-client. You need at least version 1.15 of google-api-client to run version 1.23.0 of the People API library.", C6192a.f17433d);
    }

    public C6440a(C7253a0 a0Var, C6290d dVar, C7308w wVar) {
        this(new C6441a(a0Var, dVar, wVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo25412a(C6251b<?> bVar) throws IOException {
        super.mo25412a(bVar);
    }

    /* renamed from: l */
    public C6442b mo25889l() {
        return new C6442b();
    }

    /* renamed from: m */
    public C6451c mo25890m() {
        return new C6451c();
    }

    C6440a(C6441a aVar) {
        super(aVar);
    }
}
