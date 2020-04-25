package com.mrsool.utils.p421c;

import android.content.Context;
import android.text.TextUtils;
import com.amplitude.api.C2855a;
import com.fasterxml.jackson.core.p162w.C3868i;
import com.google.firebase.analytics.FirebaseAnalytics.C5854b;
import com.mrsool.utils.C11644i;
import com.mrsool.utils.C5880q;
import com.mrsool.utils.C5887x;
import com.mrsool.utils.p421c.C11602b.C11603a;
import com.mrsool.utils.p421c.C11602b.C11604b;
import com.mrsool.utils.p421c.C11602b.C11605c;
import com.mrsool.utils.p421c.C11602b.C11606d;
import com.mrsool.utils.p421c.C11602b.C11607e;
import com.mrsool.utils.p421c.C11602b.C11608f;
import com.mrsool.utils.p421c.C11602b.C11609g;
import com.mrsool.utils.p421c.C11602b.C11610h;
import com.mrsool.utils.p421c.C11602b.C11611i;
import com.mrsool.utils.p421c.C11602b.C11612j;
import com.mrsool.utils.p421c.C11602b.C11613k;
import java.util.Calendar;
import org.json.JSONException;
import org.json.JSONObject;
import p076c.p112d.p148d.p279f.C6610c;

/* renamed from: com.mrsool.utils.c.a */
/* compiled from: AmplitudeEvents */
public enum C11598a implements C11602b {
    INSTANCE;
    
    public boolean isSetUserProperties;

    /* renamed from: com.mrsool.utils.c.a$a */
    /* compiled from: AmplitudeEvents */
    public enum C11599a {
        private static final /* synthetic */ C11599a[] $VALUES = null;
        public static final C11599a COURIERTAB = null;
        public static final C11599a SERVICEWAITINGORDERTAB = null;
        private String value;

        static {
            COURIERTAB = new C11599a("COURIERTAB", 0, "courier tab");
            SERVICEWAITINGORDERTAB = new C11599a("SERVICEWAITINGORDERTAB", 1, "service waiting order tab");
            $VALUES = new C11599a[]{COURIERTAB, SERVICEWAITINGORDERTAB};
        }

        private C11599a(String str, int i, String str2) {
            this.value = str2;
        }

        public static C11599a valueOf(String str) {
            return (C11599a) Enum.valueOf(C11599a.class, str);
        }

        public static C11599a[] values() {
            return (C11599a[]) $VALUES.clone();
        }

        /* renamed from: d */
        public String mo39842d() {
            return this.value;
        }
    }

    /* renamed from: com.mrsool.utils.c.a$b */
    /* compiled from: AmplitudeEvents */
    public enum C11600b {
        private static final /* synthetic */ C11600b[] $VALUES = null;
        public static final C11600b DefaultOrder = null;
        public static final C11600b ItemListOrder = null;
        public static final C11600b MenuOrder = null;
        private String value;

        static {
            DefaultOrder = new C11600b("DefaultOrder", 0, "default order");
            ItemListOrder = new C11600b("ItemListOrder", 1, "itemlist order");
            MenuOrder = new C11600b("MenuOrder", 2, "menu order");
            $VALUES = new C11600b[]{DefaultOrder, ItemListOrder, MenuOrder};
        }

        private C11600b(String str, int i, String str2) {
            this.value = str2;
        }

        public static C11600b valueOf(String str) {
            return (C11600b) Enum.valueOf(C11600b.class, str);
        }

        public static C11600b[] values() {
            return (C11600b[]) $VALUES.clone();
        }

        /* renamed from: d */
        public String mo39843d() {
            return this.value;
        }
    }

    /* renamed from: com.mrsool.utils.c.a$c */
    /* compiled from: AmplitudeEvents */
    public enum C11601c {
        private static final /* synthetic */ C11601c[] $VALUES = null;
        public static final C11601c Cash = null;
        private String value;

        static {
            String str = "Cash";
            Cash = new C11601c(str, 0, str);
            $VALUES = new C11601c[]{Cash};
        }

        private C11601c(String str, int i, String str2) {
            this.value = str2;
        }

        public static C11601c valueOf(String str) {
            return (C11601c) Enum.valueOf(C11601c.class, str);
        }

        public static C11601c[] values() {
            return (C11601c[]) $VALUES.clone();
        }

        /* renamed from: d */
        public String mo39844d() {
            return this.value;
        }
    }

    /* renamed from: a */
    private void m52261a(String str, JSONObject jSONObject) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("AMPLITUDE EVENT :");
            sb.append(str);
            sb.append(" ||  VALUE :");
            sb.append(jSONObject.toString(4));
            C5880q.m25751b(sb.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C2855a.m13438e().mo11208a(str, jSONObject);
    }

    /* renamed from: f */
    public static C11598a m52263f() {
        return INSTANCE;
    }

    /* renamed from: g */
    private void m52264g(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("AMPLITUDE EVENT :");
        sb.append(str);
        C5880q.m25751b(sb.toString());
        C2855a.m13438e().mo11221b(str);
    }

    /* renamed from: b */
    public void mo39831b(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, double d, boolean z, double d2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("shop id", str);
            jSONObject.put("name AR", str2);
            jSONObject.put("name EN", str3);
            jSONObject.put("type", str4);
            jSONObject.put("category", str5);
            jSONObject.put("subcategory", str6);
            jSONObject.put("google tag", str7);
            jSONObject.put("list rank", i);
            jSONObject.put("shop distance", d);
            jSONObject.put("has discount", z);
            jSONObject.put("discount percent", d2);
        } catch (JSONException unused) {
        }
        m52261a(C11603a.f32847b, jSONObject);
    }

    /* renamed from: c */
    public void mo39834c(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C5854b.f16906M, str);
        } catch (JSONException unused) {
        }
        m52261a(C11612j.f32874b, jSONObject);
    }

    /* renamed from: d */
    public void mo39837d() {
        m52264g(C11612j.f32873a);
    }

    /* renamed from: e */
    public void mo39839e() {
        C2855a.m13438e().mo11221b("Test event from Android");
    }

    /* renamed from: d */
    public void mo39838d(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("shop id", str);
        } catch (JSONException unused) {
        }
        m52261a(C11613k.f32880c, jSONObject);
    }

    /* renamed from: e */
    public void mo39840e(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("shop id", str);
        } catch (JSONException unused) {
        }
        m52261a(C11613k.f32879b, jSONObject);
    }

    /* renamed from: f */
    public String mo39841f(String str) {
        String str2 = "";
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        int parseInt = Integer.parseInt(str);
        try {
            Calendar instance = Calendar.getInstance();
            Calendar instance2 = Calendar.getInstance();
            instance.set(1, parseInt);
            int i = instance2.get(1) - instance.get(1);
            if (instance2.get(6) < instance.get(6)) {
                i--;
            }
            str2 = new Integer(i).toString();
        } catch (Exception unused) {
        }
        return str2;
    }

    /* renamed from: a */
    public void mo39818a(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mobile number", str);
            jSONObject.put("country code", str2);
            jSONObject.put("error", str3);
        } catch (JSONException unused) {
        }
        m52261a(C11611i.f32871a, jSONObject);
    }

    /* renamed from: c */
    public void mo39835c(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("current location", str);
            jSONObject.put("new location", str2);
        } catch (JSONException unused) {
        }
        m52261a(C11612j.f32875c, jSONObject);
    }

    /* renamed from: c */
    public void mo39836c(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, double d, boolean z, double d2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("shop id", str);
            jSONObject.put("name AR", str2);
            jSONObject.put("name EN", str3);
            jSONObject.put("type", str4);
            jSONObject.put("category", str5);
            jSONObject.put("subcategory", str6);
            jSONObject.put("google tag", str7);
            jSONObject.put("result rank", i);
            jSONObject.put("shop distance", d);
            jSONObject.put("has discount", z);
            jSONObject.put("discount percent", d2);
        } catch (JSONException unused) {
        }
        m52261a(C11612j.f32877e, jSONObject);
    }

    /* renamed from: a */
    public void mo39809a(int i, String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("time to input", i);
            jSONObject.put("mobile number", str);
            jSONObject.put("country code", str2);
            jSONObject.put("error", str3);
        } catch (JSONException unused) {
        }
        m52261a(C11611i.f32872b, jSONObject);
    }

    /* renamed from: b */
    public void mo39830b(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("order id", str);
            jSONObject.put("shop id", str2);
        } catch (JSONException unused) {
        }
        m52261a(C11608f.f32861a, jSONObject);
    }

    /* renamed from: a */
    public void mo39808a(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("all result count", i);
            jSONObject.put("services result count", i2);
            jSONObject.put("M4B result count", i3);
            jSONObject.put("shop result count", i4);
        } catch (JSONException unused) {
        }
        m52261a(C11612j.f32876d, jSONObject);
    }

    /* renamed from: b */
    public void mo39829b(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("shop id", str);
        } catch (JSONException unused) {
        }
        m52261a(C11606d.f32857b, jSONObject);
    }

    /* renamed from: a */
    public void mo39812a(String str, int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", str);
            jSONObject.put("list rank", i);
        } catch (JSONException unused) {
        }
        m52261a(C11603a.f32846a, jSONObject);
    }

    /* renamed from: b */
    public void mo39832b(boolean z, int i, double d, boolean z2, boolean z3, double d2, String str) {
        m52262a(C11604b.f32850b, z, i, d, z2, z3, d2, str);
    }

    /* renamed from: c */
    public void mo39833c(double d, boolean z, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("rating", d);
            jSONObject.put("rating description provided", z);
            jSONObject.put("shop id", str);
            jSONObject.put("order id", str2);
        } catch (JSONException unused) {
        }
        m52261a(C11605c.f32854d, jSONObject);
    }

    /* renamed from: b */
    public void mo39828b(double d, boolean z, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("rating", d);
            jSONObject.put("order id", str);
            jSONObject.put("rating description provided", z);
            jSONObject.put("shop id", str2);
        } catch (JSONException unused) {
        }
        m52261a(C11605c.f32853c, jSONObject);
    }

    /* renamed from: a */
    public void mo39820a(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, double d, boolean z, double d2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("shop id", str);
            jSONObject.put("name AR", str2);
            jSONObject.put("name EN", str3);
            jSONObject.put("type", str4);
            jSONObject.put("category", str5);
            jSONObject.put("subcategory", str6);
            jSONObject.put("google tag", str7);
            jSONObject.put("promotion rank", i);
            jSONObject.put("shop distance", d);
            jSONObject.put("has discount", z);
            jSONObject.put("discount percent", d2);
        } catch (JSONException unused) {
        }
        m52261a(C11603a.f32848c, jSONObject);
    }

    /* renamed from: a */
    public void mo39819a(String str, String str2, String str3, String str4, String str5, String str6, String str7, double d, boolean z, double d2, String str8) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("shop id", str);
            jSONObject.put("name AR", str2);
            jSONObject.put("name EN", str3);
            jSONObject.put("type", str4);
            jSONObject.put("category", str5);
            jSONObject.put("subcategory", str6);
            jSONObject.put("google tag", str7);
            jSONObject.put("shop distance", d);
            jSONObject.put("has discount", z);
            jSONObject.put("discount percent", d2);
            jSONObject.put("attribution", str8);
        } catch (JSONException unused) {
        }
        m52261a(C11609g.f32866a, jSONObject);
    }

    /* renamed from: a */
    public void mo39813a(String str, int i, int i2, boolean z, double d, double d2, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("source", str);
            jSONObject.put("rank", i);
            jSONObject.put("pending orders count", i2);
            jSONObject.put("has active order", z);
            jSONObject.put("distance to pickup", d);
            jSONObject.put("distance to dropoff", d2);
            jSONObject.put("order id", str2);
            jSONObject.put("shop id", str3);
        } catch (JSONException unused) {
        }
        m52261a(C11607e.f32858a, jSONObject);
    }

    /* renamed from: a */
    public void mo39804a(double d, String str, double d2, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("amount", d);
            jSONObject.put("order id", str);
            jSONObject.put("amount varaince from minimum", d2);
            jSONObject.put("shop id", str2);
        } catch (JSONException unused) {
        }
        m52261a(C11607e.f32859b, jSONObject);
    }

    /* renamed from: a */
    public void mo39821a(String str, boolean z, double d, double d2, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("order id", str);
            jSONObject.put("has active order", z);
            jSONObject.put("distance to pickup", d);
            jSONObject.put("distance to dropoff", d2);
            jSONObject.put("shop id", str2);
        } catch (JSONException unused) {
        }
        m52261a(C11607e.f32860c, jSONObject);
    }

    /* renamed from: a */
    public void mo39803a(double d, double d2, String str, String str2, double d3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("delivery fees", d);
            jSONObject.put("cost of goods", d2);
            jSONObject.put("order id", str);
            jSONObject.put("shop id", str2);
            jSONObject.put("total", d3);
        } catch (JSONException unused) {
        }
        m52261a(C11608f.f32862b, jSONObject);
    }

    /* renamed from: a */
    public void mo39806a(double d, String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("order duration", d);
            jSONObject.put("order id", str2);
            jSONObject.put("shop id", str3);
            jSONObject.put("error", str);
        } catch (JSONException unused) {
        }
        m52261a(C11608f.f32863c, jSONObject);
    }

    /* renamed from: a */
    public void mo39825a(JSONObject jSONObject) {
        m52261a(C11608f.f32864d, jSONObject);
    }

    /* renamed from: a */
    public void mo39807a(double d, boolean z, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("rating", d);
            jSONObject.put("rating description provided", z);
            jSONObject.put("order id", str);
            jSONObject.put("shop id", str2);
        } catch (JSONException unused) {
        }
        m52261a(C11608f.f32865e, jSONObject);
    }

    /* renamed from: a */
    public void mo39817a(String str, String str2, int i, int i2, int i3, double d, boolean z, boolean z2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", str);
            jSONObject.put("category", str2);
            jSONObject.put("rank inside category", i);
            jSONObject.put("category rank in menu", i2);
            jSONObject.put(C5854b.f16894A, i3);
            jSONObject.put(C5854b.f16944z, d);
            jSONObject.put("has addon", z);
            jSONObject.put("has variance", z2);
            jSONObject.put("shop id", str3);
        } catch (JSONException unused) {
        }
        m52261a(C11606d.f32856a, jSONObject);
    }

    /* renamed from: a */
    public void mo39811a(String str, double d, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("reviews count", str);
            jSONObject.put("average rating", d);
            jSONObject.put("shop id", str2);
        } catch (JSONException unused) {
        }
        m52261a(C11613k.f32878a, jSONObject);
    }

    /* renamed from: a */
    public void mo39814a(String str, int i, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C5854b.f16906M, str);
            jSONObject.put("result count", i);
            jSONObject.put("shop id", str2);
        } catch (JSONException unused) {
        }
        m52261a(C11613k.f32881d, jSONObject);
    }

    /* renamed from: a */
    public void mo39822a(String str, boolean z, double d, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", str);
            jSONObject.put("has discount", z);
            if (z) {
                jSONObject.put("discount amount", d);
            }
            jSONObject.put("shop id", str2);
        } catch (JSONException unused) {
        }
        m52261a(C11610h.f32867a, jSONObject);
    }

    /* renamed from: a */
    public void mo39823a(String str, boolean z, boolean z2, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("text description", str);
            jSONObject.put("image attached", z);
            jSONObject.put("has coupon", z2);
            jSONObject.put("payment method", str2);
            jSONObject.put("shop id", str3);
        } catch (JSONException unused) {
        }
        m52261a(C11610h.f32868b, jSONObject);
    }

    /* renamed from: a */
    public void mo39827a(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("pickup location changed", z);
            jSONObject.put("pickup location clicked", z2);
            jSONObject.put("dropoff location changed", z3);
            jSONObject.put("dropoff location clicked", z4);
            jSONObject.put("delivery window changed", z5);
            jSONObject.put("delivery window selected", str);
            jSONObject.put("shop id", str2);
        } catch (JSONException unused) {
        }
        m52261a(C11610h.f32869c, jSONObject);
    }

    /* renamed from: a */
    public void mo39824a(String str, boolean z, boolean z2, String str2, String str3, boolean z3, double d, String str4, String str5, String str6, int i, double d2, String str7) {
        int i2 = i;
        double d3 = d2;
        JSONObject jSONObject = new JSONObject();
        String str8 = str;
        try {
            jSONObject.put("text description", str);
            boolean z4 = z;
            jSONObject.put("image attached", z);
            boolean z5 = z2;
            jSONObject.put("has coupon", z2);
            String str9 = str2;
            jSONObject.put("payment method", str2);
            String str10 = str3;
            jSONObject.put("type", str3);
            boolean z6 = z3;
            jSONObject.put("has discount", z3);
            double d4 = d;
            jSONObject.put("discount amount", d);
            jSONObject.put("pickup location", str4);
            jSONObject.put("dropoff location", str5);
            jSONObject.put("delivery window selected", str6);
            if (i2 > 0) {
                jSONObject.put("cart items quantity", i2);
            }
            if (d3 > 0.0d) {
                jSONObject.put("cart items price total", d3);
            }
            jSONObject.put("shop id", str7);
        } catch (JSONException unused) {
        }
        m52261a(C11610h.f32870d, jSONObject);
    }

    /* renamed from: a */
    private void m52262a(String str, boolean z, int i, double d, boolean z2, boolean z3, double d2, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("is first offer", z);
            jSONObject.put("offers submitted count", i);
            jSONObject.put("amount variance from minimum", d);
            jSONObject.put("is minimum", z2);
            jSONObject.put("courier accept digital payment", z3);
            jSONObject.put("amount", d2);
            jSONObject.put("order id", str2);
        } catch (JSONException unused) {
        }
        m52261a(str, jSONObject);
    }

    /* renamed from: a */
    public void mo39826a(boolean z, int i, double d, boolean z2, boolean z3, double d2, String str) {
        m52262a(C11604b.f32849a, z, i, d, z2, z3, d2, str);
    }

    /* renamed from: a */
    public void mo39816a(String str, String str2, double d, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("order status ", str);
            jSONObject.put("order id", str2);
            jSONObject.put("order duration", d);
            jSONObject.put("shop id", str3);
        } catch (JSONException unused) {
        }
        m52261a(C11605c.f32851a, jSONObject);
    }

    /* renamed from: a */
    public void mo39815a(String str, int i, String str2, double d, String str3, String str4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("order status", str);
            jSONObject.put("courier chat messages count", i);
            jSONObject.put("order id", str2);
            jSONObject.put("order duration", d);
            jSONObject.put("cancel reason", str3);
            jSONObject.put("shop id", str4);
        } catch (JSONException unused) {
        }
        m52261a(C11605c.f32852b, jSONObject);
    }

    /* renamed from: a */
    public void mo39805a(double d, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("voice note length", d);
            jSONObject.put("order id", str);
            jSONObject.put("shop id", str2);
        } catch (JSONException unused) {
        }
        m52261a(C11605c.f32855e, jSONObject);
    }

    /* renamed from: a */
    public void mo39810a(Context context) {
        String str = C3868i.f12248b;
        new C5887x(context);
        JSONObject jSONObject = new JSONObject();
        try {
            C2855a.m13438e().mo11246f(C11644i.f33072D6.getUser().getIUserId());
            jSONObject.put("User ID", C11644i.f33072D6.getUser().getIUserId());
            jSONObject.put("Name", C11644i.f33072D6.getUser().getVFullName());
            jSONObject.put("Email", C11644i.f33072D6.getUser().getVEmail());
            jSONObject.put("Email Verified", C11644i.f33072D6.getUser().isEmailVerified());
            jSONObject.put("Mobile Number", C11644i.f33072D6.getUser().getVPhone());
            jSONObject.put("Mobile Number Verified", true);
            jSONObject.put("Country Code", C11644i.f33072D6.getUser().getCountryCode());
            jSONObject.put("Gender", C11644i.f33072D6.getUser().getvGender());
            jSONObject.put(C6610c.f18394P, mo39841f(C11644i.f33072D6.getUser().getvBirthYear()));
            jSONObject.put("Is courier", C11644i.f33072D6.getUser().getIs_courier());
            jSONObject.put("Total Orders Placed", C11644i.f33072D6.getUser().getiTotalOrderPlaced());
            jSONObject.put("Total Orders Delivered", C11644i.f33072D6.getUser().getITotalOrderDelivered());
            jSONObject.put("Nationality", C11644i.f33072D6.getUser().getNationality());
            jSONObject.put("Year of Birth", C11644i.f33072D6.getUser().getvBirthYear());
            jSONObject.put("Associated Users Count", C11644i.f33072D6.getUser().getAssociatedUsers());
            StringBuilder sb = new StringBuilder();
            sb.append(C11644i.f33072D6.getUser().getFAccountBalance());
            sb.append(str);
            sb.append(C11644i.f33072D6.getUser().getCurrency());
            jSONObject.put("Current Account Balance", sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(C11644i.f33072D6.getUser().getFTotalDeliveryRevenue());
            sb2.append(str);
            sb2.append(C11644i.f33072D6.getUser().getCurrency());
            jSONObject.put("Total Delivery Revenue", sb2.toString());
            jSONObject.put("Average Rating as Buyer", C11644i.f33072D6.getUser().getAverageRatingBuyer());
            jSONObject.put("Average Rating as Courier", C11644i.f33072D6.getUser().getAverageRatingCourier());
            jSONObject.put("Courier Notification Enabled", C11644i.f33072D6.getUser().getbNotification());
            jSONObject.put("Is Blocked", C11644i.f33072D6.getUser().isBlocked());
            StringBuilder sb3 = new StringBuilder();
            sb3.append(C11644i.f33072D6.getUser().getTotalMmtPaidToMrsool());
            sb3.append(str);
            sb3.append(C11644i.f33072D6.getUser().getCurrency());
            jSONObject.put("Total Amount Paid to Mrsool", sb3.toString());
            StringBuilder sb4 = new StringBuilder();
            sb4.append(C11644i.f33072D6.getUser().getfTotalBillsPaid());
            sb4.append(str);
            sb4.append(C11644i.f33072D6.getUser().getCurrency());
            jSONObject.put("Total Bills Paid As Buyer", sb4.toString());
            jSONObject.put("Count of Service Reviews", C11644i.f33072D6.getUser().getServiceReviewsCount());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C2855a.m13438e().mo11213a(jSONObject);
        this.isSetUserProperties = true;
    }
}
