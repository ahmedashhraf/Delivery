package androidx.core.app;

import android.app.Person;
import android.app.Person.Builder;
import android.os.Bundle;
import android.os.PersistableBundle;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.RequiresApi;
import androidx.core.graphics.drawable.IconCompat;

/* renamed from: androidx.core.app.v */
/* compiled from: Person */
public class C0805v {

    /* renamed from: g */
    private static final String f3838g = "name";

    /* renamed from: h */
    private static final String f3839h = "icon";

    /* renamed from: i */
    private static final String f3840i = "uri";

    /* renamed from: j */
    private static final String f3841j = "key";

    /* renamed from: k */
    private static final String f3842k = "isBot";

    /* renamed from: l */
    private static final String f3843l = "isImportant";
    @C0195i0

    /* renamed from: a */
    CharSequence f3844a;
    @C0195i0

    /* renamed from: b */
    IconCompat f3845b;
    @C0195i0

    /* renamed from: c */
    String f3846c;
    @C0195i0

    /* renamed from: d */
    String f3847d;

    /* renamed from: e */
    boolean f3848e;

    /* renamed from: f */
    boolean f3849f;

    /* renamed from: androidx.core.app.v$a */
    /* compiled from: Person */
    public static class C0806a {
        @C0195i0

        /* renamed from: a */
        CharSequence f3850a;
        @C0195i0

        /* renamed from: b */
        IconCompat f3851b;
        @C0195i0

        /* renamed from: c */
        String f3852c;
        @C0195i0

        /* renamed from: d */
        String f3853d;

        /* renamed from: e */
        boolean f3854e;

        /* renamed from: f */
        boolean f3855f;

        public C0806a() {
        }

        @C0193h0
        /* renamed from: a */
        public C0806a mo4396a(@C0195i0 CharSequence charSequence) {
            this.f3850a = charSequence;
            return this;
        }

        @C0193h0
        /* renamed from: b */
        public C0806a mo4400b(@C0195i0 String str) {
            this.f3852c = str;
            return this;
        }

        C0806a(C0805v vVar) {
            this.f3850a = vVar.f3844a;
            this.f3851b = vVar.f3845b;
            this.f3852c = vVar.f3846c;
            this.f3853d = vVar.f3847d;
            this.f3854e = vVar.f3848e;
            this.f3855f = vVar.f3849f;
        }

        @C0193h0
        /* renamed from: a */
        public C0806a mo4395a(@C0195i0 IconCompat iconCompat) {
            this.f3851b = iconCompat;
            return this;
        }

        @C0193h0
        /* renamed from: b */
        public C0806a mo4401b(boolean z) {
            this.f3855f = z;
            return this;
        }

        @C0193h0
        /* renamed from: a */
        public C0806a mo4397a(@C0195i0 String str) {
            this.f3853d = str;
            return this;
        }

        @C0193h0
        /* renamed from: a */
        public C0806a mo4398a(boolean z) {
            this.f3854e = z;
            return this;
        }

        @C0193h0
        /* renamed from: a */
        public C0805v mo4399a() {
            return new C0805v(this);
        }
    }

    C0805v(C0806a aVar) {
        this.f3844a = aVar.f3850a;
        this.f3845b = aVar.f3851b;
        this.f3846c = aVar.f3852c;
        this.f3847d = aVar.f3853d;
        this.f3848e = aVar.f3854e;
        this.f3849f = aVar.f3855f;
    }

    @C0193h0
    /* renamed from: a */
    public static C0805v m4676a(@C0193h0 Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("icon");
        return new C0806a().mo4396a(bundle.getCharSequence("name")).mo4395a(bundle2 != null ? IconCompat.m5119a(bundle2) : null).mo4400b(bundle.getString("uri")).mo4397a(bundle.getString(f3841j)).mo4398a(bundle.getBoolean(f3842k)).mo4401b(bundle.getBoolean(f3843l)).mo4399a();
    }

    @C0195i0
    /* renamed from: b */
    public String mo4386b() {
        return this.f3847d;
    }

    @C0195i0
    /* renamed from: c */
    public CharSequence mo4387c() {
        return this.f3844a;
    }

    @C0195i0
    /* renamed from: d */
    public String mo4388d() {
        return this.f3846c;
    }

    /* renamed from: e */
    public boolean mo4389e() {
        return this.f3848e;
    }

    /* renamed from: f */
    public boolean mo4390f() {
        return this.f3849f;
    }

    @RequiresApi(28)
    @C0193h0
    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: g */
    public Person mo4391g() {
        return new Builder().setName(mo4387c()).setIcon(mo4385a() != null ? mo4385a().mo4587n() : null).setUri(mo4388d()).setKey(mo4386b()).setBot(mo4389e()).setImportant(mo4390f()).build();
    }

    @C0193h0
    /* renamed from: h */
    public C0806a mo4392h() {
        return new C0806a(this);
    }

    @C0193h0
    /* renamed from: i */
    public Bundle mo4393i() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("name", this.f3844a);
        IconCompat iconCompat = this.f3845b;
        bundle.putBundle("icon", iconCompat != null ? iconCompat.mo4573a() : null);
        bundle.putString("uri", this.f3846c);
        bundle.putString(f3841j, this.f3847d);
        bundle.putBoolean(f3842k, this.f3848e);
        bundle.putBoolean(f3843l, this.f3849f);
        return bundle;
    }

    @RequiresApi(22)
    @C0193h0
    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: j */
    public PersistableBundle mo4394j() {
        PersistableBundle persistableBundle = new PersistableBundle();
        CharSequence charSequence = this.f3844a;
        persistableBundle.putString("name", charSequence != null ? charSequence.toString() : null);
        persistableBundle.putString("uri", this.f3846c);
        persistableBundle.putString(f3841j, this.f3847d);
        persistableBundle.putBoolean(f3842k, this.f3848e);
        persistableBundle.putBoolean(f3843l, this.f3849f);
        return persistableBundle;
    }

    @RequiresApi(22)
    @C0193h0
    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: a */
    public static C0805v m4677a(@C0193h0 PersistableBundle persistableBundle) {
        return new C0806a().mo4396a((CharSequence) persistableBundle.getString("name")).mo4400b(persistableBundle.getString("uri")).mo4397a(persistableBundle.getString(f3841j)).mo4398a(persistableBundle.getBoolean(f3842k)).mo4401b(persistableBundle.getBoolean(f3843l)).mo4399a();
    }

    @RequiresApi(28)
    @C0193h0
    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: a */
    public static C0805v m4675a(@C0193h0 Person person) {
        return new C0806a().mo4396a(person.getName()).mo4395a(person.getIcon() != null ? IconCompat.m5117a(person.getIcon()) : null).mo4400b(person.getUri()).mo4397a(person.getKey()).mo4398a(person.isBot()).mo4401b(person.isImportant()).mo4399a();
    }

    @C0195i0
    /* renamed from: a */
    public IconCompat mo4385a() {
        return this.f3845b;
    }
}
