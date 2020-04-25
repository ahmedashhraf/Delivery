package com.google.firebase.messaging;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0237z;
import androidx.collection.C0635a;
import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4399a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4392a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4393b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4394c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4397f;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;
import java.util.Map.Entry;
import org.jivesoftware.smackx.privacy.packet.PrivacyItem;

@C4392a(creator = "RemoteMessageCreator")
@C4397f({1})
/* compiled from: com.google.firebase:firebase-messaging@@20.0.0 */
public final class RemoteMessage extends AbstractSafeParcelable {
    public static final Creator<RemoteMessage> CREATOR = new C8757o();

    /* renamed from: O */
    public static final int f22909O = 0;

    /* renamed from: P */
    public static final int f22910P = 1;

    /* renamed from: Q */
    public static final int f22911Q = 2;

    /* renamed from: N */
    private C8742c f22912N;
    @C4394c(mo18384id = 2)

    /* renamed from: a */
    Bundle f22913a;

    /* renamed from: b */
    private Map<String, String> f22914b;

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.firebase.messaging.RemoteMessage$b */
    /* compiled from: com.google.firebase:firebase-messaging@@20.0.0 */
    public @interface C5857b {
    }

    /* renamed from: com.google.firebase.messaging.RemoteMessage$a */
    /* compiled from: com.google.firebase:firebase-messaging@@20.0.0 */
    public static class C8741a {

        /* renamed from: a */
        private final Bundle f22915a = new Bundle();

        /* renamed from: b */
        private final Map<String, String> f22916b = new C0635a();

        public C8741a(@C0193h0 String str) {
            if (TextUtils.isEmpty(str)) {
                String str2 = "Invalid to: ";
                String valueOf = String.valueOf(str);
                throw new IllegalArgumentException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            }
            this.f22915a.putString("google.to", str);
        }

        @C0193h0
        /* renamed from: a */
        public RemoteMessage mo32213a() {
            Bundle bundle = new Bundle();
            for (Entry entry : this.f22916b.entrySet()) {
                bundle.putString((String) entry.getKey(), (String) entry.getValue());
            }
            bundle.putAll(this.f22915a);
            this.f22915a.remove(PrivacyItem.SUBSCRIPTION_FROM);
            return new RemoteMessage(bundle);
        }

        @C0193h0
        /* renamed from: b */
        public C8741a mo32214b() {
            this.f22916b.clear();
            return this;
        }

        @C0193h0
        /* renamed from: c */
        public C8741a mo32216c(@C0195i0 String str) {
            this.f22915a.putString("message_type", str);
            return this;
        }

        @C0193h0
        /* renamed from: b */
        public C8741a mo32215b(@C0193h0 String str) {
            this.f22915a.putString("google.message_id", str);
            return this;
        }

        @C0193h0
        /* renamed from: a */
        public C8741a mo32211a(@C0193h0 String str, @C0195i0 String str2) {
            this.f22916b.put(str, str2);
            return this;
        }

        @C0193h0
        /* renamed from: a */
        public C8741a mo32212a(@C0193h0 Map<String, String> map) {
            this.f22916b.clear();
            this.f22916b.putAll(map);
            return this;
        }

        @C0193h0
        /* renamed from: a */
        public C8741a mo32209a(@C0237z(from = 0, mo691to = 86400) int i) {
            this.f22915a.putString("google.ttl", String.valueOf(i));
            return this;
        }

        @C0193h0
        /* renamed from: a */
        public C8741a mo32210a(@C0195i0 String str) {
            this.f22915a.putString("collapse_key", str);
            return this;
        }
    }

    /* renamed from: com.google.firebase.messaging.RemoteMessage$c */
    /* compiled from: com.google.firebase:firebase-messaging@@20.0.0 */
    public static class C8742c {

        /* renamed from: a */
        private final String f22917a;

        /* renamed from: b */
        private final String f22918b;

        /* renamed from: c */
        private final String[] f22919c;

        /* renamed from: d */
        private final String f22920d;

        /* renamed from: e */
        private final String f22921e;

        /* renamed from: f */
        private final String[] f22922f;

        /* renamed from: g */
        private final String f22923g;

        /* renamed from: h */
        private final String f22924h;

        /* renamed from: i */
        private final String f22925i;

        /* renamed from: j */
        private final String f22926j;

        /* renamed from: k */
        private final String f22927k;

        /* renamed from: l */
        private final String f22928l;

        /* renamed from: m */
        private final String f22929m;

        /* renamed from: n */
        private final Uri f22930n;

        /* renamed from: o */
        private final String f22931o;

        /* renamed from: p */
        private final Integer f22932p;

        /* renamed from: q */
        private final Integer f22933q;

        /* renamed from: r */
        private final Integer f22934r;

        /* renamed from: s */
        private final int[] f22935s;

        /* renamed from: t */
        private final Long f22936t;

        /* renamed from: u */
        private final boolean f22937u;

        /* renamed from: v */
        private final boolean f22938v;

        /* renamed from: w */
        private final boolean f22939w;

        /* renamed from: x */
        private final boolean f22940x;

        /* renamed from: y */
        private final boolean f22941y;

        /* renamed from: z */
        private final long[] f22942z;

        private C8742c(C8755m mVar) {
            String str = "gcm.n.title";
            this.f22917a = mVar.mo32264a(str);
            this.f22918b = mVar.mo32272e(str);
            this.f22919c = m40974a(mVar, str);
            String str2 = "gcm.n.body";
            this.f22920d = mVar.mo32264a(str2);
            this.f22921e = mVar.mo32272e(str2);
            this.f22922f = m40974a(mVar, str2);
            this.f22923g = mVar.mo32264a("gcm.n.icon");
            this.f22925i = mVar.mo32265b();
            this.f22926j = mVar.mo32264a("gcm.n.tag");
            this.f22927k = mVar.mo32264a("gcm.n.color");
            this.f22928l = mVar.mo32264a("gcm.n.click_action");
            this.f22929m = mVar.mo32264a("gcm.n.android_channel_id");
            this.f22930n = mVar.mo32262a();
            this.f22924h = mVar.mo32264a("gcm.n.image");
            this.f22931o = mVar.mo32264a("gcm.n.ticker");
            this.f22932p = mVar.mo32267c("gcm.n.notification_priority");
            this.f22933q = mVar.mo32267c("gcm.n.visibility");
            this.f22934r = mVar.mo32267c("gcm.n.notification_count");
            this.f22937u = mVar.mo32266b("gcm.n.sticky");
            this.f22938v = mVar.mo32266b("gcm.n.local_only");
            this.f22939w = mVar.mo32266b("gcm.n.default_sound");
            this.f22940x = mVar.mo32266b("gcm.n.default_vibrate_timings");
            this.f22941y = mVar.mo32266b("gcm.n.default_light_settings");
            this.f22936t = mVar.mo32269d("gcm.n.event_time");
            this.f22935s = mVar.mo32270d();
            this.f22942z = mVar.mo32268c();
        }

        /* renamed from: a */
        private static String[] m40974a(C8755m mVar, String str) {
            Object[] f = mVar.mo32274f(str);
            if (f == null) {
                return null;
            }
            String[] strArr = new String[f.length];
            for (int i = 0; i < f.length; i++) {
                strArr[i] = String.valueOf(f[i]);
            }
            return strArr;
        }

        @C0195i0
        /* renamed from: b */
        public String[] mo32218b() {
            return this.f22922f;
        }

        @C0195i0
        /* renamed from: c */
        public String mo32219c() {
            return this.f22921e;
        }

        @C0195i0
        /* renamed from: d */
        public String mo32220d() {
            return this.f22929m;
        }

        @C0195i0
        /* renamed from: e */
        public String mo32221e() {
            return this.f22928l;
        }

        @C0195i0
        /* renamed from: f */
        public String mo32222f() {
            return this.f22927k;
        }

        /* renamed from: g */
        public boolean mo32223g() {
            return this.f22941y;
        }

        /* renamed from: h */
        public boolean mo32224h() {
            return this.f22939w;
        }

        /* renamed from: i */
        public boolean mo32225i() {
            return this.f22940x;
        }

        @C0195i0
        /* renamed from: j */
        public Long mo32226j() {
            return this.f22936t;
        }

        @C0195i0
        /* renamed from: k */
        public String mo32227k() {
            return this.f22923g;
        }

        @C0195i0
        /* renamed from: l */
        public Uri mo32228l() {
            String str = this.f22924h;
            if (str != null) {
                return Uri.parse(str);
            }
            return null;
        }

        @C0195i0
        /* renamed from: m */
        public int[] mo32229m() {
            return this.f22935s;
        }

        @C0195i0
        /* renamed from: n */
        public Uri mo32230n() {
            return this.f22930n;
        }

        /* renamed from: o */
        public boolean mo32231o() {
            return this.f22938v;
        }

        @C0195i0
        /* renamed from: p */
        public Integer mo32232p() {
            return this.f22934r;
        }

        @C0195i0
        /* renamed from: q */
        public Integer mo32233q() {
            return this.f22932p;
        }

        @C0195i0
        /* renamed from: r */
        public String mo32234r() {
            return this.f22925i;
        }

        /* renamed from: s */
        public boolean mo32235s() {
            return this.f22937u;
        }

        @C0195i0
        /* renamed from: t */
        public String mo32236t() {
            return this.f22926j;
        }

        @C0195i0
        /* renamed from: u */
        public String mo32237u() {
            return this.f22931o;
        }

        @C0195i0
        /* renamed from: v */
        public String mo32238v() {
            return this.f22917a;
        }

        @C0195i0
        /* renamed from: w */
        public String[] mo32239w() {
            return this.f22919c;
        }

        @C0195i0
        /* renamed from: x */
        public String mo32240x() {
            return this.f22918b;
        }

        @C0195i0
        /* renamed from: y */
        public long[] mo32241y() {
            return this.f22942z;
        }

        @C0195i0
        /* renamed from: z */
        public Integer mo32242z() {
            return this.f22933q;
        }

        @C0195i0
        /* renamed from: a */
        public String mo32217a() {
            return this.f22920d;
        }
    }

    @C4393b
    public RemoteMessage(@C4396e(mo18387id = 2) Bundle bundle) {
        this.f22913a = bundle;
    }

    /* renamed from: c */
    private static int m40953c(String str) {
        if ("high".equals(str)) {
            return 1;
        }
        return "normal".equals(str) ? 2 : 0;
    }

    @C0195i0
    /* renamed from: N */
    public final String mo32196N() {
        return this.f22913a.getString("collapse_key");
    }

    @C0193h0
    /* renamed from: O */
    public final Map<String, String> mo32197O() {
        if (this.f22914b == null) {
            Bundle bundle = this.f22913a;
            C0635a aVar = new C0635a();
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals(PrivacyItem.SUBSCRIPTION_FROM) && !str.equals("message_type") && !str.equals("collapse_key")) {
                        aVar.put(str, str2);
                    }
                }
            }
            this.f22914b = aVar;
        }
        return this.f22914b;
    }

    @C0195i0
    /* renamed from: P */
    public final String mo32198P() {
        return this.f22913a.getString(PrivacyItem.SUBSCRIPTION_FROM);
    }

    @C0195i0
    /* renamed from: Q */
    public final String mo32199Q() {
        String string = this.f22913a.getString("google.message_id");
        return string == null ? this.f22913a.getString("message_id") : string;
    }

    @C0195i0
    /* renamed from: R */
    public final String mo32200R() {
        return this.f22913a.getString("message_type");
    }

    @C0195i0
    /* renamed from: S */
    public final C8742c mo32201S() {
        if (this.f22912N == null && C8755m.m41037a(this.f22913a)) {
            this.f22912N = new C8742c(new C8755m(this.f22913a));
        }
        return this.f22912N;
    }

    /* renamed from: T */
    public final int mo32202T() {
        String string = this.f22913a.getString("google.original_priority");
        if (string == null) {
            string = this.f22913a.getString("google.priority");
        }
        return m40953c(string);
    }

    /* renamed from: U */
    public final int mo32203U() {
        String string = this.f22913a.getString("google.delivered_priority");
        if (string == null) {
            if ("1".equals(this.f22913a.getString("google.priority_reduced"))) {
                return 2;
            }
            string = this.f22913a.getString("google.priority");
        }
        return m40953c(string);
    }

    /* renamed from: V */
    public final long mo32204V() {
        Object obj = this.f22913a.get("google.sent_time");
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        if (obj instanceof String) {
            try {
                return Long.parseLong((String) obj);
            } catch (NumberFormatException unused) {
                String valueOf = String.valueOf(obj);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
                sb.append("Invalid sent time: ");
                sb.append(valueOf);
                sb.toString();
            }
        }
        return 0;
    }

    @C0195i0
    /* renamed from: W */
    public final String mo32205W() {
        return this.f22913a.getString("google.to");
    }

    /* renamed from: X */
    public final int mo32206X() {
        Object obj = this.f22913a.get("google.ttl");
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj instanceof String) {
            try {
                return Integer.parseInt((String) obj);
            } catch (NumberFormatException unused) {
                String valueOf = String.valueOf(obj);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
                sb.append("Invalid TTL: ");
                sb.append(valueOf);
                sb.toString();
            }
        }
        return 0;
    }

    @C4056a
    /* renamed from: Y */
    public final Intent mo32207Y() {
        Intent intent = new Intent();
        intent.putExtras(this.f22913a);
        return intent;
    }

    public final void writeToParcel(@C0193h0 Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m18966a(parcel, 2, this.f22913a, false);
        C4399a.m18959a(parcel, a);
    }
}
