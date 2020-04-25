package com.mrsool.utils.webservice;

import com.mrsool.utils.C11644i;
import com.mrsool.utils.C5880q;
import com.mrsool.utils.C5887x;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import p468g.C13813c0;
import p468g.C13823e0;
import p468g.C13870w;
import p468g.C13870w.C13871a;
import p468g.C13876z;
import p468g.C13876z.C13878b;
import p468g.p469k0.C13843a;
import p468g.p469k0.C13843a.C13844a;
import retrofit2.Retrofit.Builder;
import retrofit2.converter.gson.GsonConverterFactory;

/* renamed from: com.mrsool.utils.webservice.b */
/* compiled from: ApiHandler */
public class C5882b {

    /* renamed from: A */
    public static final String f16973A = "vPhone";

    /* renamed from: A0 */
    public static final String f16974A0 = "txContent";

    /* renamed from: B */
    public static final String f16975B = "vDeviceVersion";

    /* renamed from: B0 */
    public static final String f16976B0 = "vType";

    /* renamed from: C */
    public static final String f16977C = "vOSVersion";

    /* renamed from: C0 */
    public static final String f16978C0 = "type";

    /* renamed from: D */
    public static final String f16979D = "vAppVersion";

    /* renamed from: D0 */
    public static final String f16980D0 = "reject_popup";

    /* renamed from: E */
    public static final String f16981E = "vPlatform";

    /* renamed from: E0 */
    public static final String f16982E0 = "vSource";

    /* renamed from: F */
    public static final String f16983F = "vFacbookId";

    /* renamed from: F0 */
    public static final String f16984F0 = "vCourier";

    /* renamed from: G */
    public static final String f16985G = "vEmail";

    /* renamed from: G0 */
    public static final String f16986G0 = "cancel_reason";

    /* renamed from: H */
    public static final String f16987H = "vFullName";

    /* renamed from: H0 */
    public static final String f16988H0 = "delivery_cost";

    /* renamed from: I */
    public static final String f16989I = "vGoogleId";

    /* renamed from: I0 */
    public static final String f16990I0 = "new_offer_id";

    /* renamed from: J */
    public static final String f16991J = "vEmail";

    /* renamed from: J0 */
    public static final String f16992J0 = "complaint[complainant_id]";

    /* renamed from: K */
    public static final String f16993K = "vFullName";

    /* renamed from: K0 */
    public static final String f16994K0 = "complaint[order_id]";

    /* renamed from: L */
    public static final String f16995L = "vProfilePic";

    /* renamed from: L0 */
    public static final String f16996L0 = "complaint[reason_id]";

    /* renamed from: M */
    public static final String f16997M = "id";

    /* renamed from: M0 */
    public static final String f16998M0 = "complaint[comment]";

    /* renamed from: N */
    public static final String f16999N = "vLanguage";

    /* renamed from: N0 */
    public static final String f17000N0 = "complaint[image1]";

    /* renamed from: O */
    public static final String f17001O = "language";

    /* renamed from: O0 */
    public static final String f17002O0 = "complaint[image2]";

    /* renamed from: P */
    public static final String f17003P = "vAddress";

    /* renamed from: P0 */
    public static final String f17004P0 = "complaint[image3]";

    /* renamed from: Q */
    public static final String f17005Q = "iAddress";

    /* renamed from: Q0 */
    public static final String f17006Q0 = "complaint_number";

    /* renamed from: R */
    public static final String f17007R = "iTermsVersion";

    /* renamed from: R0 */
    public static final String f17008R0 = "complaint[id]";

    /* renamed from: S */
    public static final String f17009S = "latitude";

    /* renamed from: S0 */
    public static final String f17010S0 = "complaint[complainant_feedback]";

    /* renamed from: T */
    public static final String f17011T = "longitude";

    /* renamed from: T0 */
    public static final String f17012T0 = "reject_reason";

    /* renamed from: U */
    public static final String f17013U = "app_sign";

    /* renamed from: U0 */
    public static final String f17014U0 = "offer_id";

    /* renamed from: V */
    public static final String f17015V = "inst_package_name";

    /* renamed from: V0 */
    public static final String f17016V0 = "online";

    /* renamed from: W */
    public static final String f17017W = "user_lat";

    /* renamed from: W0 */
    public static final String f17018W0 = "iNotificationId";

    /* renamed from: X */
    public static final String f17019X = "user_long";

    /* renamed from: X0 */
    public static final String f17020X0 = "notification_id";

    /* renamed from: Y */
    public static final String f17021Y = "vShopId";

    /* renamed from: Y0 */
    public static final String f17022Y0 = "vShopPic";

    /* renamed from: Z */
    public static final String f17023Z = "iUserId";

    /* renamed from: Z0 */
    public static final String f17024Z0 = "vMessageId";

    /* renamed from: a */
    private static final long f17025a = 90000;

    /* renamed from: a0 */
    public static final String f17026a0 = "user_id";

    /* renamed from: a1 */
    public static final String f17027a1 = "rating";

    /* renamed from: b */
    private static final long f17028b = 100000;

    /* renamed from: b0 */
    public static final String f17029b0 = "bNotification";

    /* renamed from: b1 */
    public static final String f17030b1 = "rating_reason_ids";

    /* renamed from: c */
    public static APIInterface f17031c = null;

    /* renamed from: c0 */
    public static final String f17032c0 = "vDataSource";

    /* renamed from: c1 */
    public static final String f17033c1 = "announcement_id";

    /* renamed from: d */
    private static APIInterface f17034d = null;

    /* renamed from: d0 */
    public static final String f17035d0 = "iBuyerId";

    /* renamed from: d1 */
    public static final String f17036d1 = "vGender";

    /* renamed from: e */
    private static APIInterface f17037e = null;

    /* renamed from: e0 */
    public static final String f17038e0 = "vName";

    /* renamed from: e1 */
    public static final String f17039e1 = "vBirthYear";

    /* renamed from: f */
    private static APIInterface f17040f = null;

    /* renamed from: f0 */
    public static final String f17041f0 = "vPhone";

    /* renamed from: f1 */
    public static final String f17042f1 = "bAnnouncement";

    /* renamed from: g */
    public static final String f17043g = "http://api.staging.mrsool.co/v5/";

    /* renamed from: g0 */
    public static final String f17044g0 = "dbOrderCost";

    /* renamed from: g1 */
    public static final String f17045g1 = "bNearbyOrder";

    /* renamed from: h */
    public static final String f17046h = "http://172.16.17.158:5000/api/v5/";

    /* renamed from: h0 */
    public static final String f17047h0 = "dbDeliveryCost";

    /* renamed from: h1 */
    public static final String f17048h1 = "reason";

    /* renamed from: i */
    public static final String f17049i = "http://172.16.17.110:5000/api/v5/";

    /* renamed from: i0 */
    public static final String f17050i0 = "dbTotalCost";

    /* renamed from: i1 */
    public static final String f17051i1 = "action_type";

    /* renamed from: j */
    public static final String f17052j = "http://172.16.17.70:3000/api/v5/";

    /* renamed from: j0 */
    public static final String f17053j0 = "with_messages";

    /* renamed from: j1 */
    public static final String f17054j1 = "clatitude";

    /* renamed from: k */
    public static final String f17055k = "http://172.16.17.4:3000/api/v5/";

    /* renamed from: k0 */
    public static final String f17056k0 = "current_user";

    /* renamed from: k1 */
    public static final String f17057k1 = "clongitude";

    /* renamed from: l */
    public static final String f17058l = "https://api.mrsool.co/v5/";

    /* renamed from: l0 */
    public static final String f17059l0 = "iCourierId";

    /* renamed from: l1 */
    public static final String f17060l1 = "image_type";

    /* renamed from: m */
    public static String f17061m = "https://api.mrsool.co/v5/";

    /* renamed from: m0 */
    public static final String f17062m0 = "current_latitude";

    /* renamed from: m1 */
    public static final String f17063m1 = "inline";

    /* renamed from: n */
    public static final String f17064n = "https://tracker.mrsool.co/stage/v1/";

    /* renamed from: n0 */
    public static final String f17065n0 = "current_longitude";

    /* renamed from: n1 */
    public static final String f17066n1 = "manual_ids";

    /* renamed from: o */
    public static final String f17067o = "https://tracker.mrsool.co/production/v1/";

    /* renamed from: o0 */
    public static final String f17068o0 = "new_version";

    /* renamed from: o1 */
    public static final String f17069o1 = "trigger_type";

    /* renamed from: p */
    public static final String f17070p = "https://tracker.mrsool.co/stage/v1/";

    /* renamed from: p0 */
    public static final String f17071p0 = "iRatedId";

    /* renamed from: p1 */
    public static final String f17072p1 = "manual_hash";

    /* renamed from: q */
    public static final String f17073q = "https://tracker.mrsool.co/production/v1/";

    /* renamed from: q0 */
    public static final String f17074q0 = "iRaterId";

    /* renamed from: q1 */
    public static final String f17075q1 = "buyer_payment_option_id";

    /* renamed from: r */
    public static final String f17076r = "https://s.mrsool.co/terms.html";

    /* renamed from: r0 */
    public static final String f17077r0 = "fRating";

    /* renamed from: r1 */
    public static final String f17078r1 = "api_type";

    /* renamed from: s */
    public static final String f17079s = "https://forms.staging.mrsool.co/signup";

    /* renamed from: s0 */
    public static final String f17080s0 = "txReview";

    /* renamed from: s1 */
    public static String f17081s1 = null;

    /* renamed from: t */
    public static final String f17082t = "https://forms.mrsool.co/signup";

    /* renamed from: t0 */
    public static final String f17083t0 = "iOrderId";

    /* renamed from: t1 */
    public static String f17084t1 = null;

    /* renamed from: u */
    public static final String f17085u = "https://forms.staging.mrsool.co/pay";

    /* renamed from: u0 */
    public static final String f17086u0 = "iToUserId";

    /* renamed from: u1 */
    public static final String f17087u1 = "token";

    /* renamed from: v */
    public static final String f17088v = "https://forms.mrsool.co/pay";

    /* renamed from: v0 */
    public static final String f17089v0 = "order_id";

    /* renamed from: v1 */
    public static final String f17090v1 = "latitude";

    /* renamed from: w */
    public static final String f17091w = "https://maps-api.staging.mrsool.co/v1/";

    /* renamed from: w0 */
    public static final String f17092w0 = "vStatus";

    /* renamed from: w1 */
    public static final String f17093w1 = "longitude";

    /* renamed from: x */
    public static final String f17094x = "https://maps-api.mrsool.co/v1/";

    /* renamed from: x0 */
    public static final String f17095x0 = "status";

    /* renamed from: x1 */
    public static final String f17096x1 = "channel_name";

    /* renamed from: y */
    public static final String f17097y = "vDeviceToken";

    /* renamed from: y0 */
    public static final String f17098y0 = "iFromUserId";

    /* renamed from: y1 */
    public static final String f17099y1 = "auth_token";

    /* renamed from: z */
    public static final String f17100z = "device_id";

    /* renamed from: z0 */
    public static final String f17101z0 = "iToUserId";

    /* renamed from: z1 */
    public static final String f17102z1 = "current_user_id";

    /* renamed from: com.mrsool.utils.webservice.b$a */
    /* compiled from: ApiHandler */
    static class C5883a implements C13870w {

        /* renamed from: a */
        final /* synthetic */ String f17103a;

        /* renamed from: b */
        final /* synthetic */ String f17104b;

        C5883a(String str, String str2) {
            this.f17103a = str;
            this.f17104b = str2;
        }

        /* renamed from: a */
        public C13823e0 mo23463a(C13871a aVar) throws IOException {
            C13813c0 request = aVar.request();
            String str = "auth_token";
            return aVar.mo43698a(request.mo43357f().mo43364a(request.mo43359h().mo43652j().mo43677b("current_user_id", this.f17103a).mo43677b(str, this.f17104b).mo43672a()).mo43371a());
        }
    }

    /* renamed from: com.mrsool.utils.webservice.b$b */
    /* compiled from: ApiHandler */
    static class C5884b implements C13870w {
        C5884b() {
        }

        /* renamed from: a */
        public C13823e0 mo23463a(C13871a aVar) throws IOException {
            C13813c0 request = aVar.request();
            return aVar.mo43698a(request.mo43357f().mo43368a(request.mo43356e(), request.mo43349a()).mo43371a());
        }
    }

    /* renamed from: com.mrsool.utils.webservice.b$c */
    /* compiled from: ApiHandler */
    static class C5885c implements C13870w {
        C5885c() {
        }

        /* renamed from: a */
        public C13823e0 mo23463a(C13871a aVar) throws IOException {
            C13813c0 request = aVar.request();
            return aVar.mo43698a(request.mo43357f().mo43368a(request.mo43356e(), request.mo43349a()).mo43371a());
        }
    }

    /* renamed from: com.mrsool.utils.webservice.b$d */
    /* compiled from: ApiHandler */
    static class C5886d implements C13870w {
        C5886d() {
        }

        /* renamed from: a */
        public C13823e0 mo23463a(C13871a aVar) throws IOException {
            C13813c0 request = aVar.request();
            return aVar.mo43698a(request.mo43357f().mo43368a(request.mo43356e(), request.mo43349a()).mo43371a());
        }
    }

    /* renamed from: a */
    public static APIInterface m25774a(C5887x xVar) {
        String str = "";
        String f = xVar == null ? str : xVar.mo23468C().mo23459f("user_id");
        if (xVar != null) {
            str = xVar.mo23468C().mo23459f(C11644i.f33443w5);
        }
        if (f17031c != null) {
            String str2 = "getApiService object reused";
            if (f == null || str == null) {
                C5880q.m25753d(str2);
                return f17031c;
            } else if (!f.equalsIgnoreCase(f17081s1) || !str.equalsIgnoreCase(f17084t1)) {
                f17081s1 = f;
                f17084t1 = str;
            } else {
                C5880q.m25753d(str2);
                return f17031c;
            }
        }
        C5880q.m25753d("getApiService new object created");
        C13843a aVar = new C13843a();
        aVar.mo43513a(C13844a.NONE);
        C13876z a = new C13878b().mo43804d(f17025a, TimeUnit.MILLISECONDS).mo43793b(f17025a, TimeUnit.MILLISECONDS).mo43781a((C13870w) aVar).mo43791a();
        if (!(xVar == null || !xVar.mo23585b0() || f == null || str == null)) {
            try {
                a = new C13878b().mo43781a((C13870w) new C5883a(f, str)).mo43804d(f17025a, TimeUnit.MILLISECONDS).mo43793b(f17025a, TimeUnit.MILLISECONDS).mo43781a((C13870w) aVar).mo43791a();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        f17031c = (APIInterface) new Builder().baseUrl(f17061m).addConverterFactory(GsonConverterFactory.create()).client(a).build().create(APIInterface.class);
        return f17031c;
    }

    /* renamed from: b */
    public static APIInterface m25775b() {
        try {
            if (f17037e != null) {
                return f17037e;
            }
        } catch (Exception unused) {
        }
        C13843a aVar = new C13843a();
        aVar.mo43513a(C13844a.NONE);
        C13876z zVar = null;
        try {
            zVar = new C13878b().mo43781a((C13870w) new C5884b()).mo43804d(f17028b, TimeUnit.MILLISECONDS).mo43793b(f17028b, TimeUnit.MILLISECONDS).mo43781a((C13870w) aVar).mo43791a();
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("ApiHandler getApiService Exception ");
            sb.append(e.toString());
            C5880q.m25753d(sb.toString());
            e.printStackTrace();
        }
        f17037e = (APIInterface) new Builder().baseUrl(C5887x.m25786E0() ? "https://tracker.mrsool.co/stage/v1/" : "https://tracker.mrsool.co/production/v1/").addConverterFactory(GsonConverterFactory.create()).client(zVar).build().create(APIInterface.class);
        return f17037e;
    }

    /* renamed from: c */
    public static APIInterface m25776c() {
        try {
            if (f17040f != null) {
                return f17040f;
            }
        } catch (Exception unused) {
        }
        C13843a aVar = new C13843a();
        aVar.mo43513a(C13844a.NONE);
        C13876z zVar = null;
        try {
            zVar = new C13878b().mo43781a((C13870w) new C5885c()).mo43804d(f17028b, TimeUnit.MILLISECONDS).mo43793b(f17028b, TimeUnit.MILLISECONDS).mo43781a((C13870w) aVar).mo43791a();
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("ApiHandler getApiService Exception ");
            sb.append(e.toString());
            C5880q.m25753d(sb.toString());
            e.printStackTrace();
        }
        f17040f = (APIInterface) new Builder().baseUrl(m25777d()).addConverterFactory(GsonConverterFactory.create()).client(zVar).build().create(APIInterface.class);
        return f17040f;
    }

    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m25777d() {
        /*
            java.lang.String r0 = f17061m
            int r1 = r0.hashCode()
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            switch(r1) {
                case -494696572: goto L_0x0041;
                case 70508004: goto L_0x0037;
                case 238601047: goto L_0x002d;
                case 549230050: goto L_0x0023;
                case 560855354: goto L_0x0019;
                case 1491041664: goto L_0x000f;
                default: goto L_0x000e;
            }
        L_0x000e:
            goto L_0x004b
        L_0x000f:
            java.lang.String r1 = "http://172.16.17.158:5000/api/v5/"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x004b
            r0 = 2
            goto L_0x004c
        L_0x0019:
            java.lang.String r1 = "https://api.mrsool.co/v5/"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x004b
            r0 = 1
            goto L_0x004c
        L_0x0023:
            java.lang.String r1 = "http://172.16.17.4:3000/api/v5/"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x004b
            r0 = 5
            goto L_0x004c
        L_0x002d:
            java.lang.String r1 = "http://172.16.17.70:3000/api/v5/"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x004b
            r0 = 4
            goto L_0x004c
        L_0x0037:
            java.lang.String r1 = "http://api.staging.mrsool.co/v5/"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x004b
            r0 = 0
            goto L_0x004c
        L_0x0041:
            java.lang.String r1 = "http://172.16.17.110:5000/api/v5/"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x004b
            r0 = 3
            goto L_0x004c
        L_0x004b:
            r0 = -1
        L_0x004c:
            if (r0 == 0) goto L_0x006a
            if (r0 == r6) goto L_0x0067
            if (r0 == r5) goto L_0x0064
            if (r0 == r4) goto L_0x0061
            if (r0 == r3) goto L_0x005e
            if (r0 == r2) goto L_0x005b
            java.lang.String r0 = ""
            goto L_0x006c
        L_0x005b:
            java.lang.String r0 = "http://172.16.17.4:3000/v1/"
            goto L_0x006c
        L_0x005e:
            java.lang.String r0 = "http://172.16.17.70:3000/v1/"
            goto L_0x006c
        L_0x0061:
            java.lang.String r0 = "http://172.16.17.110:5000/v1/"
            goto L_0x006c
        L_0x0064:
            java.lang.String r0 = "http://172.16.17.158:5000/v1/"
            goto L_0x006c
        L_0x0067:
            java.lang.String r0 = "https://maps-api.mrsool.co/v1/"
            goto L_0x006c
        L_0x006a:
            java.lang.String r0 = "https://maps-api.staging.mrsool.co/v1/"
        L_0x006c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mrsool.utils.webservice.C5882b.m25777d():java.lang.String");
    }

    /* renamed from: a */
    public static APIInterface m25773a() {
        C13876z zVar;
        C13843a aVar = new C13843a();
        aVar.mo43513a(C13844a.NONE);
        try {
            zVar = new C13878b().mo43781a((C13870w) new C5886d()).mo43804d(f17025a, TimeUnit.MILLISECONDS).mo43793b(f17025a, TimeUnit.MILLISECONDS).mo43781a((C13870w) aVar).mo43791a();
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("ApiHandler getApiService Exception ");
            sb.append(e.toString());
            C5880q.m25753d(sb.toString());
            e.printStackTrace();
            zVar = null;
        }
        f17034d = (APIInterface) new Builder().baseUrl(f17061m.equalsIgnoreCase(f17043g) ? "https://tracker.mrsool.co/stage/v1/" : "https://tracker.mrsool.co/production/v1/").addConverterFactory(GsonConverterFactory.create()).client(zVar).build().create(APIInterface.class);
        return f17034d;
    }
}
