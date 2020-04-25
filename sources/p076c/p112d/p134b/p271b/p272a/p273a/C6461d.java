package p076c.p112d.p134b.p271b.p272a.p273a;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: c.d.b.b.a.a.d */
/* compiled from: PeopleServiceScopes */
public class C6461d {

    /* renamed from: a */
    public static final String f18001a = "https://www.googleapis.com/auth/contacts";

    /* renamed from: b */
    public static final String f18002b = "https://www.googleapis.com/auth/contacts.readonly";

    /* renamed from: c */
    public static final String f18003c = "https://www.googleapis.com/auth/plus.login";

    /* renamed from: d */
    public static final String f18004d = "https://www.googleapis.com/auth/user.addresses.read";

    /* renamed from: e */
    public static final String f18005e = "https://www.googleapis.com/auth/user.birthday.read";

    /* renamed from: f */
    public static final String f18006f = "https://www.googleapis.com/auth/user.emails.read";

    /* renamed from: g */
    public static final String f18007g = "https://www.googleapis.com/auth/user.phonenumbers.read";

    /* renamed from: h */
    public static final String f18008h = "https://www.googleapis.com/auth/userinfo.email";

    /* renamed from: i */
    public static final String f18009i = "https://www.googleapis.com/auth/userinfo.profile";

    private C6461d() {
    }

    /* renamed from: a */
    public static Set<String> m30424a() {
        HashSet hashSet = new HashSet();
        hashSet.add(f18001a);
        hashSet.add(f18002b);
        hashSet.add("https://www.googleapis.com/auth/plus.login");
        hashSet.add(f18004d);
        hashSet.add(f18005e);
        hashSet.add(f18006f);
        hashSet.add(f18007g);
        hashSet.add(f18008h);
        hashSet.add(f18009i);
        return Collections.unmodifiableSet(hashSet);
    }
}
