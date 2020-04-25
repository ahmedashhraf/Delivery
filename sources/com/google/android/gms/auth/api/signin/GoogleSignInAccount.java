package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import com.google.android.gms.common.annotation.C4056a;
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
import com.google.android.gms.common.util.C4484g;
import com.google.android.gms.common.util.C4492k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@C4392a(creator = "GoogleSignInAccountCreator")
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<GoogleSignInAccount> CREATOR = new C3993h();
    @C4476d0

    /* renamed from: Y */
    private static C4484g f12609Y = C4492k.m19370e();
    @C4394c(getter = "getIdToken", mo18384id = 3)

    /* renamed from: N */
    private String f12610N;
    @C4394c(getter = "getEmail", mo18384id = 4)

    /* renamed from: O */
    private String f12611O;
    @C4394c(getter = "getDisplayName", mo18384id = 5)

    /* renamed from: P */
    private String f12612P;
    @C4394c(getter = "getPhotoUrl", mo18384id = 6)

    /* renamed from: Q */
    private Uri f12613Q;
    @C4394c(getter = "getServerAuthCode", mo18384id = 7)

    /* renamed from: R */
    private String f12614R;
    @C4394c(getter = "getExpirationTimeSecs", mo18384id = 8)

    /* renamed from: S */
    private long f12615S;
    @C4394c(getter = "getObfuscatedIdentifier", mo18384id = 9)

    /* renamed from: T */
    private String f12616T;
    @C4394c(mo18384id = 10)

    /* renamed from: U */
    private List<Scope> f12617U;
    @C4394c(getter = "getGivenName", mo18384id = 11)

    /* renamed from: V */
    private String f12618V;
    @C4394c(getter = "getFamilyName", mo18384id = 12)

    /* renamed from: W */
    private String f12619W;

    /* renamed from: X */
    private Set<Scope> f12620X = new HashSet();
    @C4398g(mo18390id = 1)

    /* renamed from: a */
    private final int f12621a;
    @C4394c(getter = "getId", mo18384id = 2)

    /* renamed from: b */
    private String f12622b;

    @C4393b
    GoogleSignInAccount(@C4396e(mo18387id = 1) int i, @C4396e(mo18387id = 2) String str, @C4396e(mo18387id = 3) String str2, @C4396e(mo18387id = 4) String str3, @C4396e(mo18387id = 5) String str4, @C4396e(mo18387id = 6) Uri uri, @C4396e(mo18387id = 7) String str5, @C4396e(mo18387id = 8) long j, @C4396e(mo18387id = 9) String str6, @C4396e(mo18387id = 10) List<Scope> list, @C4396e(mo18387id = 11) String str7, @C4396e(mo18387id = 12) String str8) {
        this.f12621a = i;
        this.f12622b = str;
        this.f12610N = str2;
        this.f12611O = str3;
        this.f12612P = str4;
        this.f12613Q = uri;
        this.f12614R = str5;
        this.f12615S = j;
        this.f12616T = str6;
        this.f12617U = list;
        this.f12618V = str7;
        this.f12619W = str8;
    }

    /* renamed from: a */
    private static GoogleSignInAccount m17276a(@C0195i0 String str, @C0195i0 String str2, @C0195i0 String str3, @C0195i0 String str4, @C0195i0 String str5, @C0195i0 String str6, @C0195i0 Uri uri, @C0195i0 Long l, @C0193h0 String str7, @C0193h0 Set<Scope> set) {
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, str, str2, str3, str4, uri, null, (l == null ? Long.valueOf(f12609Y.mo18569a() / 1000) : l).longValue(), C4300a0.m18630b(str7), new ArrayList((Collection) C4300a0.m18620a(set)), str5, str6);
        return googleSignInAccount;
    }

    @C4056a
    /* renamed from: a0 */
    public static GoogleSignInAccount m17277a0() {
        Account account = new Account("<<default account>>", "com.google");
        return m17276a(null, null, account.name, null, null, null, null, Long.valueOf(0), account.name, new HashSet());
    }

    /* renamed from: b0 */
    private final JSONObject m17278b0() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (mo17448S() != null) {
                jSONObject.put("id", mo17448S());
            }
            if (mo17449T() != null) {
                jSONObject.put("tokenId", mo17449T());
            }
            if (mo17444O() != null) {
                jSONObject.put("email", mo17444O());
            }
            if (mo17443N() != null) {
                jSONObject.put("displayName", mo17443N());
            }
            if (mo17446Q() != null) {
                jSONObject.put("givenName", mo17446Q());
            }
            if (mo17445P() != null) {
                jSONObject.put("familyName", mo17445P());
            }
            if (mo17450U() != null) {
                jSONObject.put("photoUrl", mo17450U().toString());
            }
            if (mo17452W() != null) {
                jSONObject.put("serverAuthCode", mo17452W());
            }
            jSONObject.put("expirationTime", this.f12615S);
            jSONObject.put("obfuscatedIdentifier", this.f12616T);
            JSONArray jSONArray = new JSONArray();
            Scope[] scopeArr = (Scope[]) this.f12617U.toArray(new Scope[this.f12617U.size()]);
            Arrays.sort(scopeArr, C3992g.f12669a);
            for (Scope N : scopeArr) {
                jSONArray.put(N.mo17606N());
            }
            jSONObject.put("grantedScopes", jSONArray);
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    @C0195i0
    /* renamed from: c */
    public static GoogleSignInAccount m17279c(@C0195i0 String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl", null);
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        GoogleSignInAccount a = m17276a(jSONObject.optString("id"), jSONObject.optString("tokenId", null), jSONObject.optString("email", null), jSONObject.optString("displayName", null), jSONObject.optString("givenName", null), jSONObject.optString("familyName", null), parse, Long.valueOf(parseLong), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        a.f12614R = jSONObject.optString("serverAuthCode", null);
        return a;
    }

    @C0195i0
    /* renamed from: N */
    public String mo17443N() {
        return this.f12612P;
    }

    @C0195i0
    /* renamed from: O */
    public String mo17444O() {
        return this.f12611O;
    }

    @C0195i0
    /* renamed from: P */
    public String mo17445P() {
        return this.f12619W;
    }

    @C0195i0
    /* renamed from: Q */
    public String mo17446Q() {
        return this.f12618V;
    }

    @C0193h0
    /* renamed from: R */
    public Set<Scope> mo17447R() {
        return new HashSet(this.f12617U);
    }

    @C0195i0
    /* renamed from: S */
    public String mo17448S() {
        return this.f12622b;
    }

    @C0195i0
    /* renamed from: T */
    public String mo17449T() {
        return this.f12610N;
    }

    @C0195i0
    /* renamed from: U */
    public Uri mo17450U() {
        return this.f12613Q;
    }

    @C0193h0
    @C4056a
    /* renamed from: V */
    public Set<Scope> mo17451V() {
        HashSet hashSet = new HashSet(this.f12617U);
        hashSet.addAll(this.f12620X);
        return hashSet;
    }

    @C0195i0
    /* renamed from: W */
    public String mo17452W() {
        return this.f12614R;
    }

    @C4056a
    /* renamed from: X */
    public boolean mo17453X() {
        return f12609Y.mo18569a() / 1000 >= this.f12615S - 300;
    }

    @C0193h0
    /* renamed from: Y */
    public final String mo17454Y() {
        return this.f12616T;
    }

    /* renamed from: Z */
    public final String mo17455Z() {
        JSONObject b0 = m17278b0();
        b0.remove("serverAuthCode");
        return b0.toString();
    }

    @C0195i0
    /* renamed from: e */
    public Account mo17457e() {
        String str = this.f12611O;
        if (str == null) {
            return null;
        }
        return new Account(str, "com.google");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.f12616T.equals(this.f12616T) && googleSignInAccount.mo17451V().equals(mo17451V());
    }

    public int hashCode() {
        return ((this.f12616T.hashCode() + 527) * 31) + mo17451V().hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m18964a(parcel, 1, this.f12621a);
        C4399a.m18979a(parcel, 2, mo17448S(), false);
        C4399a.m18979a(parcel, 3, mo17449T(), false);
        C4399a.m18979a(parcel, 4, mo17444O(), false);
        C4399a.m18979a(parcel, 5, mo17443N(), false);
        C4399a.m18969a(parcel, 6, (Parcelable) mo17450U(), i, false);
        C4399a.m18979a(parcel, 7, mo17452W(), false);
        C4399a.m18965a(parcel, 8, this.f12615S);
        C4399a.m18979a(parcel, 9, this.f12616T, false);
        C4399a.m19017j(parcel, 10, this.f12617U, false);
        C4399a.m18979a(parcel, 11, mo17446Q(), false);
        C4399a.m18979a(parcel, 12, mo17445P(), false);
        C4399a.m18959a(parcel, a);
    }

    @C4056a
    /* renamed from: a */
    public GoogleSignInAccount mo17456a(Scope... scopeArr) {
        if (scopeArr != null) {
            Collections.addAll(this.f12620X, scopeArr);
        }
        return this;
    }
}
