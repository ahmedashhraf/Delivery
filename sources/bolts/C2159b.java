package bolts;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* renamed from: bolts.b */
/* compiled from: AppLink */
public class C2159b {

    /* renamed from: a */
    private Uri f8593a;

    /* renamed from: b */
    private List<C2160a> f8594b;

    /* renamed from: c */
    private Uri f8595c;

    /* renamed from: bolts.b$a */
    /* compiled from: AppLink */
    public static class C2160a {

        /* renamed from: a */
        private final Uri f8596a;

        /* renamed from: b */
        private final String f8597b;

        /* renamed from: c */
        private final String f8598c;

        /* renamed from: d */
        private final String f8599d;

        public C2160a(String str, String str2, Uri uri, String str3) {
            this.f8597b = str;
            this.f8598c = str2;
            this.f8596a = uri;
            this.f8599d = str3;
        }

        /* renamed from: a */
        public String mo9269a() {
            return this.f8599d;
        }

        /* renamed from: b */
        public String mo9270b() {
            return this.f8598c;
        }

        /* renamed from: c */
        public String mo9271c() {
            return this.f8597b;
        }

        /* renamed from: d */
        public Uri mo9272d() {
            return this.f8596a;
        }
    }

    public C2159b(Uri uri, List<C2160a> list, Uri uri2) {
        this.f8593a = uri;
        if (list == null) {
            list = Collections.emptyList();
        }
        this.f8594b = list;
        this.f8595c = uri2;
    }

    /* renamed from: a */
    public Uri mo9266a() {
        return this.f8593a;
    }

    /* renamed from: b */
    public List<C2160a> mo9267b() {
        return Collections.unmodifiableList(this.f8594b);
    }

    /* renamed from: c */
    public Uri mo9268c() {
        return this.f8595c;
    }
}
