package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import com.google.android.gms.auth.api.signin.internal.C3996a;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.C4420j;
import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.api.C4059a.C4063d.C4069f;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4399a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4392a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4393b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4394c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4398g;
import com.google.android.gms.common.util.C4476d0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@C4392a(creator = "GoogleSignInOptionsCreator")
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public class GoogleSignInOptions extends AbstractSafeParcelable implements C4069f, ReflectedParcelable {
    public static final Creator<GoogleSignInOptions> CREATOR = new C4022j();
    @C4476d0

    /* renamed from: W */
    public static final Scope f12623W = new Scope(C4420j.f13552a);
    @C4476d0

    /* renamed from: X */
    public static final Scope f12624X = new Scope("email");
    @C4476d0

    /* renamed from: Y */
    public static final Scope f12625Y = new Scope(C4420j.f13554c);
    @C4476d0

    /* renamed from: Z */
    public static final Scope f12626Z = new Scope(C4420j.f13558g);
    @C4476d0

    /* renamed from: a0 */
    public static final Scope f12627a0 = new Scope(C4420j.f13557f);

    /* renamed from: b0 */
    public static final GoogleSignInOptions f12628b0 = new C3983a().mo17481c().mo17483d().mo17478a();

    /* renamed from: c0 */
    public static final GoogleSignInOptions f12629c0 = new C3983a().mo17475a(f12626Z, new Scope[0]).mo17478a();

    /* renamed from: d0 */
    private static Comparator<Scope> f12630d0 = new C3994i();
    /* access modifiers changed from: private */
    @C4394c(getter = "getAccount", mo18384id = 3)

    /* renamed from: N */
    public Account f12631N;
    /* access modifiers changed from: private */
    @C4394c(getter = "isIdTokenRequested", mo18384id = 4)

    /* renamed from: O */
    public boolean f12632O;
    /* access modifiers changed from: private */
    @C4394c(getter = "isServerAuthCodeRequested", mo18384id = 5)

    /* renamed from: P */
    public final boolean f12633P;
    /* access modifiers changed from: private */
    @C4394c(getter = "isForceCodeForRefreshToken", mo18384id = 6)

    /* renamed from: Q */
    public final boolean f12634Q;
    /* access modifiers changed from: private */
    @C4394c(getter = "getServerClientId", mo18384id = 7)

    /* renamed from: R */
    public String f12635R;
    /* access modifiers changed from: private */
    @C4394c(getter = "getHostedDomain", mo18384id = 8)

    /* renamed from: S */
    public String f12636S;
    /* access modifiers changed from: private */
    @C4394c(getter = "getExtensions", mo18384id = 9)

    /* renamed from: T */
    public ArrayList<GoogleSignInOptionsExtensionParcelable> f12637T;
    /* access modifiers changed from: private */
    @C4394c(getter = "getLogSessionId", mo18384id = 10)

    /* renamed from: U */
    public String f12638U;

    /* renamed from: V */
    private Map<Integer, GoogleSignInOptionsExtensionParcelable> f12639V;
    @C4398g(mo18390id = 1)

    /* renamed from: a */
    private final int f12640a;
    /* access modifiers changed from: private */
    @C4394c(getter = "getScopes", mo18384id = 2)

    /* renamed from: b */
    public final ArrayList<Scope> f12641b;

    /* renamed from: com.google.android.gms.auth.api.signin.GoogleSignInOptions$a */
    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public static final class C3983a {

        /* renamed from: a */
        private Set<Scope> f12642a = new HashSet();

        /* renamed from: b */
        private boolean f12643b;

        /* renamed from: c */
        private boolean f12644c;

        /* renamed from: d */
        private boolean f12645d;

        /* renamed from: e */
        private String f12646e;

        /* renamed from: f */
        private Account f12647f;

        /* renamed from: g */
        private String f12648g;

        /* renamed from: h */
        private Map<Integer, GoogleSignInOptionsExtensionParcelable> f12649h = new HashMap();

        /* renamed from: i */
        private String f12650i;

        public C3983a() {
        }

        /* renamed from: f */
        private final String m17318f(String str) {
            C4300a0.m18630b(str);
            String str2 = this.f12646e;
            C4300a0.m18628a(str2 == null || str2.equals(str), (Object) "two different server client ids provided");
            return str;
        }

        /* renamed from: a */
        public final C3983a mo17475a(Scope scope, Scope... scopeArr) {
            this.f12642a.add(scope);
            this.f12642a.addAll(Arrays.asList(scopeArr));
            return this;
        }

        /* renamed from: b */
        public final C3983a mo17479b() {
            this.f12642a.add(GoogleSignInOptions.f12624X);
            return this;
        }

        /* renamed from: c */
        public final C3983a mo17481c() {
            this.f12642a.add(GoogleSignInOptions.f12625Y);
            return this;
        }

        /* renamed from: d */
        public final C3983a mo17483d() {
            this.f12642a.add(GoogleSignInOptions.f12623W);
            return this;
        }

        @C4056a
        /* renamed from: e */
        public final C3983a mo17485e(String str) {
            this.f12650i = str;
            return this;
        }

        /* renamed from: b */
        public final C3983a mo17480b(String str) {
            return mo17477a(str, false);
        }

        /* renamed from: c */
        public final C3983a mo17482c(String str) {
            this.f12647f = new Account(C4300a0.m18630b(str), "com.google");
            return this;
        }

        /* renamed from: d */
        public final C3983a mo17484d(String str) {
            this.f12648g = C4300a0.m18630b(str);
            return this;
        }

        /* renamed from: a */
        public final C3983a mo17476a(String str) {
            this.f12645d = true;
            this.f12646e = m17318f(str);
            return this;
        }

        public C3983a(@C0193h0 GoogleSignInOptions googleSignInOptions) {
            C4300a0.m18620a(googleSignInOptions);
            this.f12642a = new HashSet(googleSignInOptions.f12641b);
            this.f12643b = googleSignInOptions.f12633P;
            this.f12644c = googleSignInOptions.f12634Q;
            this.f12645d = googleSignInOptions.f12632O;
            this.f12646e = googleSignInOptions.f12635R;
            this.f12647f = googleSignInOptions.f12631N;
            this.f12648g = googleSignInOptions.f12636S;
            this.f12649h = GoogleSignInOptions.m17297a((List<GoogleSignInOptionsExtensionParcelable>) googleSignInOptions.f12637T);
            this.f12650i = googleSignInOptions.f12638U;
        }

        /* renamed from: a */
        public final C3983a mo17477a(String str, boolean z) {
            this.f12643b = true;
            this.f12646e = m17318f(str);
            this.f12644c = z;
            return this;
        }

        /* renamed from: a */
        public final C3983a mo17474a(C3989d dVar) {
            if (!this.f12649h.containsKey(Integer.valueOf(dVar.mo17500b()))) {
                if (dVar.mo17501c() != null) {
                    this.f12642a.addAll(dVar.mo17501c());
                }
                this.f12649h.put(Integer.valueOf(dVar.mo17500b()), new GoogleSignInOptionsExtensionParcelable(dVar));
                return this;
            }
            throw new IllegalStateException("Only one extension per type may be added");
        }

        /* renamed from: a */
        public final GoogleSignInOptions mo17478a() {
            if (this.f12642a.contains(GoogleSignInOptions.f12627a0) && this.f12642a.contains(GoogleSignInOptions.f12626Z)) {
                this.f12642a.remove(GoogleSignInOptions.f12626Z);
            }
            if (this.f12645d && (this.f12647f == null || !this.f12642a.isEmpty())) {
                mo17481c();
            }
            GoogleSignInOptions googleSignInOptions = new GoogleSignInOptions(3, new ArrayList(this.f12642a), this.f12647f, this.f12645d, this.f12643b, this.f12644c, this.f12646e, this.f12648g, this.f12649h, this.f12650i, null);
            return googleSignInOptions;
        }
    }

    @C4393b
    GoogleSignInOptions(@C4396e(mo18387id = 1) int i, @C4396e(mo18387id = 2) ArrayList<Scope> arrayList, @C4396e(mo18387id = 3) Account account, @C4396e(mo18387id = 4) boolean z, @C4396e(mo18387id = 5) boolean z2, @C4396e(mo18387id = 6) boolean z3, @C4396e(mo18387id = 7) String str, @C4396e(mo18387id = 8) String str2, @C4396e(mo18387id = 9) ArrayList<GoogleSignInOptionsExtensionParcelable> arrayList2, @C4396e(mo18387id = 10) String str3) {
        this(i, arrayList, account, z, z2, z3, str, str2, m17297a((List<GoogleSignInOptionsExtensionParcelable>) arrayList2), str3);
    }

    /* renamed from: W */
    private final JSONObject m17295W() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Collections.sort(this.f12641b, f12630d0);
            ArrayList<Scope> arrayList = this.f12641b;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                jSONArray.put(((Scope) obj).mo17606N());
            }
            jSONObject.put("scopes", jSONArray);
            if (this.f12631N != null) {
                jSONObject.put("accountName", this.f12631N.name);
            }
            jSONObject.put("idTokenRequested", this.f12632O);
            jSONObject.put("forceCodeForRefreshToken", this.f12634Q);
            jSONObject.put("serverAuthRequested", this.f12633P);
            if (!TextUtils.isEmpty(this.f12635R)) {
                jSONObject.put("serverClientId", this.f12635R);
            }
            if (!TextUtils.isEmpty(this.f12636S)) {
                jSONObject.put("hostedDomain", this.f12636S);
            }
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static Map<Integer, GoogleSignInOptionsExtensionParcelable> m17297a(@C0195i0 List<GoogleSignInOptionsExtensionParcelable> list) {
        HashMap hashMap = new HashMap();
        if (list == null) {
            return hashMap;
        }
        for (GoogleSignInOptionsExtensionParcelable googleSignInOptionsExtensionParcelable : list) {
            hashMap.put(Integer.valueOf(googleSignInOptionsExtensionParcelable.mo17509N()), googleSignInOptionsExtensionParcelable);
        }
        return hashMap;
    }

    @C0195i0
    /* renamed from: c */
    public static GoogleSignInOptions m17300c(@C0195i0 String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        String optString = jSONObject.optString("accountName", null);
        GoogleSignInOptions googleSignInOptions = new GoogleSignInOptions(3, new ArrayList<>(hashSet), !TextUtils.isEmpty(optString) ? new Account(optString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.optString("serverClientId", null), jSONObject.optString("hostedDomain", null), (Map<Integer, GoogleSignInOptionsExtensionParcelable>) new HashMap<Integer,GoogleSignInOptionsExtensionParcelable>(), (String) null);
        return googleSignInOptions;
    }

    @C4056a
    /* renamed from: N */
    public ArrayList<GoogleSignInOptionsExtensionParcelable> mo17461N() {
        return this.f12637T;
    }

    @C4056a
    @C0195i0
    /* renamed from: O */
    public String mo17462O() {
        return this.f12638U;
    }

    /* renamed from: P */
    public Scope[] mo17463P() {
        ArrayList<Scope> arrayList = this.f12641b;
        return (Scope[]) arrayList.toArray(new Scope[arrayList.size()]);
    }

    @C4056a
    /* renamed from: Q */
    public ArrayList<Scope> mo17464Q() {
        return new ArrayList<>(this.f12641b);
    }

    @C4056a
    /* renamed from: R */
    public String mo17465R() {
        return this.f12635R;
    }

    @C4056a
    /* renamed from: S */
    public boolean mo17466S() {
        return this.f12634Q;
    }

    @C4056a
    /* renamed from: T */
    public boolean mo17467T() {
        return this.f12632O;
    }

    @C4056a
    /* renamed from: U */
    public boolean mo17468U() {
        return this.f12633P;
    }

    /* renamed from: V */
    public final String mo17469V() {
        return m17295W().toString();
    }

    @C4056a
    /* renamed from: e */
    public Account mo17470e() {
        return this.f12631N;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004a, code lost:
        if (r3.f12631N.equals(r4.mo17470e()) != false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0069, code lost:
        if (r3.f12635R.equals(r4.mo17465R()) != false) goto L_0x006b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r4 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r4     // Catch:{ ClassCastException -> 0x0091 }
            java.util.ArrayList<com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable> r1 = r3.f12637T     // Catch:{ ClassCastException -> 0x0091 }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x0091 }
            if (r1 > 0) goto L_0x0091
            java.util.ArrayList<com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable> r1 = r4.f12637T     // Catch:{ ClassCastException -> 0x0091 }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x0091 }
            if (r1 <= 0) goto L_0x0018
            goto L_0x0091
        L_0x0018:
            java.util.ArrayList<com.google.android.gms.common.api.Scope> r1 = r3.f12641b     // Catch:{ ClassCastException -> 0x0091 }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x0091 }
            java.util.ArrayList r2 = r4.mo17464Q()     // Catch:{ ClassCastException -> 0x0091 }
            int r2 = r2.size()     // Catch:{ ClassCastException -> 0x0091 }
            if (r1 != r2) goto L_0x0091
            java.util.ArrayList<com.google.android.gms.common.api.Scope> r1 = r3.f12641b     // Catch:{ ClassCastException -> 0x0091 }
            java.util.ArrayList r2 = r4.mo17464Q()     // Catch:{ ClassCastException -> 0x0091 }
            boolean r1 = r1.containsAll(r2)     // Catch:{ ClassCastException -> 0x0091 }
            if (r1 != 0) goto L_0x0035
            goto L_0x0091
        L_0x0035:
            android.accounts.Account r1 = r3.f12631N     // Catch:{ ClassCastException -> 0x0091 }
            if (r1 != 0) goto L_0x0040
            android.accounts.Account r1 = r4.mo17470e()     // Catch:{ ClassCastException -> 0x0091 }
            if (r1 != 0) goto L_0x0091
            goto L_0x004c
        L_0x0040:
            android.accounts.Account r1 = r3.f12631N     // Catch:{ ClassCastException -> 0x0091 }
            android.accounts.Account r2 = r4.mo17470e()     // Catch:{ ClassCastException -> 0x0091 }
            boolean r1 = r1.equals(r2)     // Catch:{ ClassCastException -> 0x0091 }
            if (r1 == 0) goto L_0x0091
        L_0x004c:
            java.lang.String r1 = r3.f12635R     // Catch:{ ClassCastException -> 0x0091 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ ClassCastException -> 0x0091 }
            if (r1 == 0) goto L_0x005f
            java.lang.String r1 = r4.mo17465R()     // Catch:{ ClassCastException -> 0x0091 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ ClassCastException -> 0x0091 }
            if (r1 == 0) goto L_0x0091
            goto L_0x006b
        L_0x005f:
            java.lang.String r1 = r3.f12635R     // Catch:{ ClassCastException -> 0x0091 }
            java.lang.String r2 = r4.mo17465R()     // Catch:{ ClassCastException -> 0x0091 }
            boolean r1 = r1.equals(r2)     // Catch:{ ClassCastException -> 0x0091 }
            if (r1 == 0) goto L_0x0091
        L_0x006b:
            boolean r1 = r3.f12634Q     // Catch:{ ClassCastException -> 0x0091 }
            boolean r2 = r4.mo17466S()     // Catch:{ ClassCastException -> 0x0091 }
            if (r1 != r2) goto L_0x0091
            boolean r1 = r3.f12632O     // Catch:{ ClassCastException -> 0x0091 }
            boolean r2 = r4.mo17467T()     // Catch:{ ClassCastException -> 0x0091 }
            if (r1 != r2) goto L_0x0091
            boolean r1 = r3.f12633P     // Catch:{ ClassCastException -> 0x0091 }
            boolean r2 = r4.mo17468U()     // Catch:{ ClassCastException -> 0x0091 }
            if (r1 != r2) goto L_0x0091
            java.lang.String r1 = r3.f12638U     // Catch:{ ClassCastException -> 0x0091 }
            java.lang.String r4 = r4.mo17462O()     // Catch:{ ClassCastException -> 0x0091 }
            boolean r4 = android.text.TextUtils.equals(r1, r4)     // Catch:{ ClassCastException -> 0x0091 }
            if (r4 == 0) goto L_0x0091
            r4 = 1
            return r4
        L_0x0091:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList<Scope> arrayList2 = this.f12641b;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            arrayList.add(((Scope) obj).mo17606N());
        }
        Collections.sort(arrayList);
        return new C3996a().mo17517a((Object) arrayList).mo17517a((Object) this.f12631N).mo17517a((Object) this.f12635R).mo17518a(this.f12634Q).mo17518a(this.f12632O).mo17518a(this.f12633P).mo17517a((Object) this.f12638U).mo17516a();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m18964a(parcel, 1, this.f12640a);
        C4399a.m19017j(parcel, 2, mo17464Q(), false);
        C4399a.m18969a(parcel, 3, (Parcelable) mo17470e(), i, false);
        C4399a.m18984a(parcel, 4, mo17467T());
        C4399a.m18984a(parcel, 5, mo17468U());
        C4399a.m18984a(parcel, 6, mo17466S());
        C4399a.m18979a(parcel, 7, mo17465R(), false);
        C4399a.m18979a(parcel, 8, this.f12636S, false);
        C4399a.m19017j(parcel, 9, mo17461N(), false);
        C4399a.m18979a(parcel, 10, mo17462O(), false);
        C4399a.m18959a(parcel, a);
    }

    private GoogleSignInOptions(int i, ArrayList<Scope> arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map<Integer, GoogleSignInOptionsExtensionParcelable> map, String str3) {
        this.f12640a = i;
        this.f12641b = arrayList;
        this.f12631N = account;
        this.f12632O = z;
        this.f12633P = z2;
        this.f12634Q = z3;
        this.f12635R = str;
        this.f12636S = str2;
        this.f12637T = new ArrayList<>(map.values());
        this.f12639V = map;
        this.f12638U = str3;
    }

    /* synthetic */ GoogleSignInOptions(int i, ArrayList arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map map, String str3, C3994i iVar) {
        this(3, arrayList, account, z, z2, z3, str, str2, map, str3);
    }
}
