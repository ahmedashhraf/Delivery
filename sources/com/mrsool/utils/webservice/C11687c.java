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

/* renamed from: com.mrsool.utils.webservice.c */
/* compiled from: ApiHandlerNew */
public class C11687c {

    /* renamed from: A */
    public static final String f33650A = "https://forms.staging.mrsool.co/pay";

    /* renamed from: A0 */
    public static final String f33651A0 = "iUserId";

    /* renamed from: A1 */
    public static final String f33652A1 = "vType";

    /* renamed from: A2 */
    public static final String f33653A2 = "vSubPickupAddress";

    /* renamed from: B */
    public static final String f33654B = "https://forms.mrsool.co/pay";

    /* renamed from: B0 */
    public static final String f33655B0 = "user_id";

    /* renamed from: B1 */
    public static final String f33656B1 = "type";

    /* renamed from: B2 */
    public static final String f33657B2 = "vSubAddress";

    /* renamed from: C */
    public static final String f33658C = "ttqhxoqlbfhcmllrrxmkihbymvotgxjripeixmwoavullsilbzsjkgzmyrtbcomkumukumxwvhnkzqseiyhpeaxmukpuelaxnepvxzinzdsilmetsucnflwlduuzvotb";

    /* renamed from: C0 */
    public static final String f33659C0 = "bNotification";

    /* renamed from: C1 */
    public static final String f33660C1 = "reject_popup";

    /* renamed from: C2 */
    public static final String f33661C2 = "reason";

    /* renamed from: D */
    public static final String f33662D = "teymeydmkxyadalocjfbwhpfjfurvpcctypoafubrkzytzwkehofzsqmajgldtnblanqcnusrhsogztldvbterldhwfjjtknvrewynedvkagyguquxwihwexrvvarxfs";

    /* renamed from: D0 */
    public static final String f33663D0 = "name";

    /* renamed from: D1 */
    public static final String f33664D1 = "vSource";

    /* renamed from: D2 */
    public static final String f33665D2 = "action_type";

    /* renamed from: E */
    public static final String f33666E = "https://maps-api.staging.mrsool.co/v1/";

    /* renamed from: E0 */
    public static final String f33667E0 = "vAddress";

    /* renamed from: E1 */
    public static final String f33668E1 = "vCourier";

    /* renamed from: E2 */
    public static final String f33669E2 = "clatitude";

    /* renamed from: F */
    public static final String f33670F = "https://maps-api.mrsool.co/v1/";

    /* renamed from: F0 */
    public static final String f33671F0 = "vDataSource";

    /* renamed from: F1 */
    public static final String f33672F1 = "cancel_reason";

    /* renamed from: F2 */
    public static final String f33673F2 = "clongitude";

    /* renamed from: G */
    public static final String f33674G = "vDeviceToken";

    /* renamed from: G0 */
    public static final String f33675G0 = "txDescription";

    /* renamed from: G1 */
    public static final String f33676G1 = "courier_id";

    /* renamed from: G2 */
    public static final String f33677G2 = "image_type";

    /* renamed from: H */
    public static final String f33678H = "device_id";

    /* renamed from: H0 */
    public static final String f33679H0 = "vArea";

    /* renamed from: H1 */
    public static final String f33680H1 = "delivery_cost";

    /* renamed from: H2 */
    public static final String f33681H2 = "inline";

    /* renamed from: I */
    public static final String f33682I = "vPhone";

    /* renamed from: I0 */
    public static final String f33683I0 = "dtExpiryDateTime";

    /* renamed from: I1 */
    public static final String f33684I1 = "current_courier_id";

    /* renamed from: I2 */
    public static final String f33685I2 = "trigger_for";

    /* renamed from: J */
    public static final String f33686J = "vVerificationCode";

    /* renamed from: J0 */
    public static final String f33687J0 = "images";

    /* renamed from: J1 */
    public static final String f33688J1 = "new_offer_id";

    /* renamed from: J2 */
    public static final String f33689J2 = "manual_ids";

    /* renamed from: K */
    public static final String f33690K = "vDeviceVersion";

    /* renamed from: K0 */
    public static final String f33691K0 = "iBuyerId";

    /* renamed from: K1 */
    public static final String f33692K1 = "current_offer_id";

    /* renamed from: K2 */
    public static final String f33693K2 = "trigger_type";

    /* renamed from: L */
    public static final String f33694L = "vOSVersion";

    /* renamed from: L0 */
    public static final String f33695L0 = "vName";

    /* renamed from: L1 */
    public static final String f33696L1 = "cash_out_option_id";

    /* renamed from: L2 */
    public static final String f33697L2 = "manual_hash";

    /* renamed from: M */
    public static final String f33698M = "vAppVersion";

    /* renamed from: M0 */
    public static final String f33699M0 = "has_coupon";

    /* renamed from: M1 */
    public static final String f33700M1 = "is_active";

    /* renamed from: M2 */
    public static final String f33701M2 = "promotion_id";

    /* renamed from: N */
    public static final String f33702N = "vPlatform";

    /* renamed from: N0 */
    public static final String f33703N0 = "coupon_amount";

    /* renamed from: N1 */
    public static final String f33704N1 = "complaint[complainant_id]";

    /* renamed from: N2 */
    public static final String f33705N2 = "is_online";

    /* renamed from: O */
    public static final String f33706O = "vFacbookId";

    /* renamed from: O0 */
    public static final String f33707O0 = "user_coupon_id";

    /* renamed from: O1 */
    public static final String f33708O1 = "complaint[order_id]";

    /* renamed from: O2 */
    public static final String f33709O2 = "Upvote";

    /* renamed from: P */
    public static final String f33710P = "vEmail";

    /* renamed from: P0 */
    public static final String f33711P0 = "discount_type";

    /* renamed from: P1 */
    public static final String f33712P1 = "complaint[reason_id]";

    /* renamed from: P2 */
    public static final String f33713P2 = "Downvote";

    /* renamed from: Q */
    public static final String f33714Q = "vFullName";

    /* renamed from: Q0 */
    public static final String f33715Q0 = "vPhone";

    /* renamed from: Q1 */
    public static final String f33716Q1 = "complaint[comment]";

    /* renamed from: Q2 */
    public static final String f33717Q2 = "location_type";

    /* renamed from: R */
    public static final String f33718R = "vGoogleId";

    /* renamed from: R0 */
    public static final String f33719R0 = "order_type";

    /* renamed from: R1 */
    public static final String f33720R1 = "complaint[image1]";

    /* renamed from: R2 */
    public static final String f33721R2 = "search_term";

    /* renamed from: S */
    public static final String f33722S = "vEmail";

    /* renamed from: S0 */
    public static final String f33723S0 = "buyer_payment_option_id";

    /* renamed from: S1 */
    public static final String f33724S1 = "complaint[image2]";

    /* renamed from: S2 */
    public static final String f33725S2 = "coupon_number";

    /* renamed from: T */
    public static final String f33726T = "vFullName";

    /* renamed from: T0 */
    public static final String f33727T0 = "manual_branch_select";

    /* renamed from: T1 */
    public static final String f33728T1 = "complaint[image3]";

    /* renamed from: T2 */
    public static final String f33729T2 = "api_type";

    /* renamed from: U */
    public static final String f33730U = "vProfilePic";

    /* renamed from: U0 */
    public static final String f33731U0 = "menu_items";

    /* renamed from: U1 */
    public static final String f33732U1 = "complaint_number";

    /* renamed from: U2 */
    public static String f33733U2 = null;

    /* renamed from: V */
    public static final String f33734V = "id";

    /* renamed from: V0 */
    public static final String f33735V0 = "business_order";

    /* renamed from: V1 */
    public static final String f33736V1 = "complaint[id]";

    /* renamed from: V2 */
    public static String f33737V2 = null;

    /* renamed from: W */
    public static final String f33738W = "vLanguage";

    /* renamed from: W0 */
    public static final String f33739W0 = "business_account_id";

    /* renamed from: W1 */
    public static final String f33740W1 = "complaint[complainant_feedback]";

    /* renamed from: W2 */
    public static final String f33741W2 = "token";

    /* renamed from: X */
    public static final String f33742X = "language";

    /* renamed from: X0 */
    public static final String f33743X0 = "business_branch_id";

    /* renamed from: X1 */
    public static final String f33744X1 = "reject_reason";

    /* renamed from: X2 */
    public static final String f33745X2 = "latitude";

    /* renamed from: Y */
    public static final String f33746Y = "vAddress";

    /* renamed from: Y0 */
    public static final String f33747Y0 = "business_order_id";

    /* renamed from: Y1 */
    public static final String f33748Y1 = "offer_id";

    /* renamed from: Y2 */
    public static final String f33749Y2 = "longitude";

    /* renamed from: Z */
    public static final String f33750Z = "iAddress";

    /* renamed from: Z0 */
    public static final String f33751Z0 = "payment_type_code";

    /* renamed from: Z1 */
    public static final String f33752Z1 = "user_location_bookmark[location_name]";

    /* renamed from: Z2 */
    public static final String f33753Z2 = "channel_name";

    /* renamed from: a */
    private static final long f33754a = 90000;

    /* renamed from: a0 */
    public static final String f33755a0 = "iTermsVersion";

    /* renamed from: a1 */
    public static final String f33756a1 = "card_id";

    /* renamed from: a2 */
    public static final String f33757a2 = "user_location_bookmark[location_type]";

    /* renamed from: a3 */
    public static final String f33758a3 = "sponser";

    /* renamed from: b */
    private static final long f33759b = 10000;

    /* renamed from: b0 */
    public static final String f33760b0 = "last_active_at";

    /* renamed from: b1 */
    public static final String f33761b1 = "dbOrderCost";

    /* renamed from: b2 */
    public static final String f33762b2 = "user_location_bookmark[address]";

    /* renamed from: b3 */
    public static final String f33763b3 = "id_valid_till";

    /* renamed from: c */
    public static APIInterface f33764c = null;

    /* renamed from: c0 */
    public static final String f33765c0 = "latitude";

    /* renamed from: c1 */
    public static final String f33766c1 = "dbDeliveryCost";

    /* renamed from: c2 */
    public static final String f33767c2 = "user_location_bookmark[latitude]";

    /* renamed from: c3 */
    public static final String f33768c3 = "id_valid_till_display";

    /* renamed from: d */
    private static APIInterface f33769d = null;

    /* renamed from: d0 */
    public static final String f33770d0 = "longitude";

    /* renamed from: d1 */
    public static final String f33771d1 = "dbTotalCost";

    /* renamed from: d2 */
    public static final String f33772d2 = "user_location_bookmark[longitude]";

    /* renamed from: d3 */
    public static final String f33773d3 = "auth_token";

    /* renamed from: e */
    private static APIInterface f33774e = null;

    /* renamed from: e0 */
    public static final String f33775e0 = "vFullName";

    /* renamed from: e1 */
    public static final String f33776e1 = "with_messages";

    /* renamed from: e2 */
    public static final String f33777e2 = "user_location_bookmark[sub_address]";

    /* renamed from: e3 */
    public static final String f33778e3 = "current_user_id";

    /* renamed from: f */
    private static APIInterface f33779f = null;

    /* renamed from: f0 */
    public static final String f33780f0 = "vEmail";

    /* renamed from: f1 */
    public static final String f33781f1 = "current_user";

    /* renamed from: f2 */
    public static final String f33782f2 = "location_id";

    /* renamed from: f3 */
    public static final String f33783f3 = "module_name";

    /* renamed from: g */
    private static APIInterface f33784g = null;

    /* renamed from: g0 */
    public static final String f33785g0 = "page";

    /* renamed from: g1 */
    public static final String f33786g1 = "iCourierId";

    /* renamed from: g2 */
    public static final String f33787g2 = "vPickupAddress";

    /* renamed from: g3 */
    public static final String f33788g3 = "error_message";

    /* renamed from: h */
    public static final String f33789h = "http://api.staging.mrsool.co/v6/";

    /* renamed from: h0 */
    public static final String f33790h0 = "category_id";

    /* renamed from: h1 */
    public static final String f33791h1 = "iDeliveryCost";

    /* renamed from: h2 */
    public static final String f33792h2 = "platitude";

    /* renamed from: i */
    public static final String f33793i = "http://172.16.17.158:5000/api/v6/";

    /* renamed from: i0 */
    public static final String f33794i0 = "near";

    /* renamed from: i1 */
    public static final String f33795i1 = "dbDistanceFromMe";

    /* renamed from: i2 */
    public static final String f33796i2 = "plongitude";

    /* renamed from: j */
    public static final String f33797j = "http://172.16.17.110:5000/api/v6/";

    /* renamed from: j0 */
    public static final String f33798j0 = "app_sign";

    /* renamed from: j1 */
    public static final String f33799j1 = "current_latitude";

    /* renamed from: j2 */
    public static final String f33800j2 = "dlatitude";

    /* renamed from: k */
    public static final String f33801k = "http://172.16.17.70:3000/api/v6/";

    /* renamed from: k0 */
    public static final String f33802k0 = "inst_package_name";

    /* renamed from: k1 */
    public static final String f33803k1 = "current_longitude";

    /* renamed from: k2 */
    public static final String f33804k2 = "dlongitude";

    /* renamed from: l */
    public static final String f33805l = "http://172.16.17.59:3000/api/v6/";

    /* renamed from: l0 */
    public static final String f33806l0 = "user_lat";

    /* renamed from: l1 */
    public static final String f33807l1 = "new_version";

    /* renamed from: l2 */
    public static final String f33808l2 = "online";

    /* renamed from: m */
    public static final String f33809m = "http://172.16.17.4:3000/api/v6/";

    /* renamed from: m0 */
    public static final String f33810m0 = "user_long";

    /* renamed from: m1 */
    public static final String f33811m1 = "iRatedId";

    /* renamed from: m2 */
    public static final String f33812m2 = "iNotificationId";

    /* renamed from: n */
    public static final String f33813n = "https://api.mrsool.co/v6/";

    /* renamed from: n0 */
    public static final String f33814n0 = "service_name";

    /* renamed from: n1 */
    public static final String f33815n1 = "iRaterId";

    /* renamed from: n2 */
    public static final String f33816n2 = "notification_id";

    /* renamed from: o */
    public static final String f33817o = "https://business-api.staging.mrsool.co/v1/";

    /* renamed from: o0 */
    public static final String f33818o0 = "timestamp";

    /* renamed from: o1 */
    public static final String f33819o1 = "fRating";

    /* renamed from: o2 */
    public static final String f33820o2 = "vShopPic";

    /* renamed from: p */
    public static final String f33821p = "https://business-api.mrsool.co/v1/";

    /* renamed from: p0 */
    public static final String f33822p0 = "ll";

    /* renamed from: p1 */
    public static final String f33823p1 = "txReview";

    /* renamed from: p2 */
    public static final String f33824p2 = "vMessageId";

    /* renamed from: q */
    public static String f33825q = "https://api.mrsool.co/v6/";

    /* renamed from: q0 */
    public static final String f33826q0 = "local";

    /* renamed from: q1 */
    public static final String f33827q1 = "review";

    /* renamed from: q2 */
    public static final String f33828q2 = "active";

    /* renamed from: r */
    public static final String f33829r = "https://api.foursquare.com/";

    /* renamed from: r0 */
    public static final String f33830r0 = "client_id";

    /* renamed from: r1 */
    public static final String f33831r1 = "iOrderId";

    /* renamed from: r2 */
    public static final String f33832r2 = "nearby";

    /* renamed from: s */
    public static final String f33833s = "https://tracker.mrsool.co/stage/v1/";

    /* renamed from: s0 */
    public static final String f33834s0 = "client_secret";

    /* renamed from: s1 */
    public static final String f33835s1 = "iToUserId";

    /* renamed from: s2 */
    public static final String f33836s2 = "all";

    /* renamed from: t */
    public static final String f33837t = "https://tracker.mrsool.co/production/v1/";

    /* renamed from: t0 */
    public static final String f33838t0 = "v";

    /* renamed from: t1 */
    public static final String f33839t1 = "order_id";

    /* renamed from: t2 */
    public static final String f33840t2 = "rating";

    /* renamed from: u */
    public static final String f33841u = "https://tracker.mrsool.co/stage/v1/";

    /* renamed from: u0 */
    public static final String f33842u0 = "radius";

    /* renamed from: u1 */
    public static final String f33843u1 = "request_type";

    /* renamed from: u2 */
    public static final String f33844u2 = "rating_reason_ids";

    /* renamed from: v */
    public static final String f33845v = "https://tracker.mrsool.co/production/v1/";

    /* renamed from: v0 */
    public static final String f33846v0 = "limit";

    /* renamed from: v1 */
    public static final String f33847v1 = "vStatus";

    /* renamed from: v2 */
    public static final String f33848v2 = "announcement_id";

    /* renamed from: w */
    public static final String f33849w = "https://s.mrsool.co/terms.html";

    /* renamed from: w0 */
    public static final String f33850w0 = "near";

    /* renamed from: w1 */
    public static final String f33851w1 = "status";

    /* renamed from: w2 */
    public static final String f33852w2 = "vGender";

    /* renamed from: x */
    public static final String f33853x = "https://s.mrsool.co/privacy_policy.html";

    /* renamed from: x0 */
    public static final String f33854x0 = "query";

    /* renamed from: x1 */
    public static final String f33855x1 = "iFromUserId";

    /* renamed from: x2 */
    public static final String f33856x2 = "vBirthYear";

    /* renamed from: y */
    public static final String f33857y = "https://forms.staging.mrsool.co/signup";

    /* renamed from: y0 */
    public static final String f33858y0 = "vShopId";

    /* renamed from: y1 */
    public static final String f33859y1 = "iToUserId";

    /* renamed from: y2 */
    public static final String f33860y2 = "bAnnouncement";

    /* renamed from: z */
    public static final String f33861z = "https://forms.mrsool.co/signup";

    /* renamed from: z0 */
    public static final String f33862z0 = "shop_id";

    /* renamed from: z1 */
    public static final String f33863z1 = "txContent";

    /* renamed from: z2 */
    public static final String f33864z2 = "bNearbyOrder";

    /* renamed from: com.mrsool.utils.webservice.c$a */
    /* compiled from: ApiHandlerNew */
    static class C11688a implements C13870w {

        /* renamed from: a */
        final /* synthetic */ String f33865a;

        /* renamed from: b */
        final /* synthetic */ String f33866b;

        C11688a(String str, String str2) {
            this.f33865a = str;
            this.f33866b = str2;
        }

        /* renamed from: a */
        public C13823e0 mo23463a(C13871a aVar) throws IOException {
            C13813c0 request = aVar.request();
            String str = "auth_token";
            return aVar.mo43698a(request.mo43357f().mo43364a(request.mo43359h().mo43652j().mo43677b("current_user_id", this.f33865a).mo43677b(str, this.f33866b).mo43672a()).mo43371a());
        }
    }

    /* renamed from: com.mrsool.utils.webservice.c$b */
    /* compiled from: ApiHandlerNew */
    static class C11689b implements C13870w {
        C11689b() {
        }

        /* renamed from: a */
        public C13823e0 mo23463a(C13871a aVar) throws IOException {
            C13813c0 request = aVar.request();
            return aVar.mo43698a(request.mo43357f().mo43368a(request.mo43356e(), request.mo43349a()).mo43371a());
        }
    }

    /* renamed from: com.mrsool.utils.webservice.c$c */
    /* compiled from: ApiHandlerNew */
    static class C11690c implements C13870w {
        C11690c() {
        }

        /* renamed from: a */
        public C13823e0 mo23463a(C13871a aVar) throws IOException {
            C13813c0 request = aVar.request();
            return aVar.mo43698a(request.mo43357f().mo43369a("Authorization", C5887x.m25786E0() ? C11687c.f33658C : C11687c.f33662D).mo43368a(request.mo43356e(), request.mo43349a()).mo43371a());
        }
    }

    /* renamed from: com.mrsool.utils.webservice.c$d */
    /* compiled from: ApiHandlerNew */
    static class C11691d implements C13870w {
        C11691d() {
        }

        /* renamed from: a */
        public C13823e0 mo23463a(C13871a aVar) throws IOException {
            C13813c0 request = aVar.request();
            return aVar.mo43698a(request.mo43357f().mo43368a(request.mo43356e(), request.mo43349a()).mo43371a());
        }
    }

    /* renamed from: a */
    public static APIInterface m52645a(C5887x xVar) {
        String str = "";
        String f = xVar == null ? str : xVar.mo23468C().mo23459f("user_id");
        if (xVar != null) {
            str = xVar.mo23468C().mo23459f(C11644i.f33443w5);
        }
        if (f33764c != null) {
            String str2 = "getApiService object reused";
            if (f == null || str == null) {
                C5880q.m25753d(str2);
                return f33764c;
            } else if (!f.equalsIgnoreCase(f33733U2) || !str.equalsIgnoreCase(f33737V2)) {
                f33733U2 = f;
                f33737V2 = str;
            } else {
                C5880q.m25753d(str2);
                return f33764c;
            }
        }
        C5880q.m25753d("getApiService new object created");
        C13843a aVar = new C13843a();
        aVar.mo43513a(C13844a.NONE);
        C13876z a = new C13878b().mo43804d(f33754a, TimeUnit.MILLISECONDS).mo43793b(f33754a, TimeUnit.MILLISECONDS).mo43781a((C13870w) aVar).mo43791a();
        if (!(xVar == null || !xVar.mo23585b0() || f == null || str == null)) {
            try {
                a = new C13878b().mo43781a((C13870w) new C11688a(f, str)).mo43804d(f33754a, TimeUnit.MILLISECONDS).mo43793b(f33754a, TimeUnit.MILLISECONDS).mo43781a((C13870w) aVar).mo43791a();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        f33764c = (APIInterface) new Builder().baseUrl(f33825q).addConverterFactory(GsonConverterFactory.create()).client(a).build().create(APIInterface.class);
        return f33764c;
    }

    /* renamed from: b */
    public static APIInterface m52646b() {
        C13876z zVar;
        C13843a aVar = new C13843a();
        aVar.mo43513a(C13844a.NONE);
        try {
            zVar = new C13878b().mo43781a((C13870w) new C11691d()).mo43804d(f33754a, TimeUnit.MILLISECONDS).mo43793b(f33754a, TimeUnit.MILLISECONDS).mo43781a((C13870w) aVar).mo43791a();
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("ApiHandler getApiService Exception ");
            sb.append(e.toString());
            C5880q.m25753d(sb.toString());
            e.printStackTrace();
            zVar = null;
        }
        f33769d = (APIInterface) new Builder().baseUrl(f33825q.equalsIgnoreCase(f33789h) ? "https://tracker.mrsool.co/stage/v1/" : "https://tracker.mrsool.co/production/v1/").addConverterFactory(GsonConverterFactory.create()).client(zVar).build().create(APIInterface.class);
        return f33769d;
    }

    /* renamed from: c */
    public static APIInterface m52647c() {
        try {
            if (f33784g != null) {
                return f33784g;
            }
        } catch (Exception unused) {
        }
        C13843a aVar = new C13843a();
        aVar.mo43513a(C13844a.NONE);
        C13876z zVar = null;
        try {
            zVar = new C13878b().mo43781a((C13870w) new C11689b()).mo43804d(f33759b, TimeUnit.MILLISECONDS).mo43793b(f33759b, TimeUnit.MILLISECONDS).mo43781a((C13870w) aVar).mo43791a();
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("ApiHandler getApiService Exception ");
            sb.append(e.toString());
            C5880q.m25753d(sb.toString());
            e.printStackTrace();
        }
        f33784g = (APIInterface) new Builder().baseUrl(m52648d()).addConverterFactory(GsonConverterFactory.create()).client(zVar).build().create(APIInterface.class);
        return f33784g;
    }

    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m52648d() {
        /*
            java.lang.String r0 = f33825q
            int r1 = r0.hashCode()
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            switch(r1) {
                case -494696541: goto L_0x0041;
                case 70508035: goto L_0x0037;
                case 238601078: goto L_0x002d;
                case 560855385: goto L_0x0023;
                case 1263404427: goto L_0x0019;
                case 1491041695: goto L_0x000f;
                default: goto L_0x000e;
            }
        L_0x000e:
            goto L_0x004b
        L_0x000f:
            java.lang.String r1 = "http://172.16.17.158:5000/api/v6/"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x004b
            r0 = 2
            goto L_0x004c
        L_0x0019:
            java.lang.String r1 = "http://172.16.17.59:3000/api/v6/"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x004b
            r0 = 5
            goto L_0x004c
        L_0x0023:
            java.lang.String r1 = "https://api.mrsool.co/v6/"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x004b
            r0 = 1
            goto L_0x004c
        L_0x002d:
            java.lang.String r1 = "http://172.16.17.70:3000/api/v6/"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x004b
            r0 = 4
            goto L_0x004c
        L_0x0037:
            java.lang.String r1 = "http://api.staging.mrsool.co/v6/"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x004b
            r0 = 0
            goto L_0x004c
        L_0x0041:
            java.lang.String r1 = "http://172.16.17.110:5000/api/v6/"
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
            java.lang.String r0 = "http://172.16.17.59:3000/v1/"
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
        throw new UnsupportedOperationException("Method not decompiled: com.mrsool.utils.webservice.C11687c.m52648d():java.lang.String");
    }

    /* renamed from: a */
    public static APIInterface m52644a() {
        try {
            if (f33774e != null) {
                return f33774e;
            }
        } catch (Exception unused) {
        }
        C13843a aVar = new C13843a();
        aVar.mo43513a(C13844a.NONE);
        C13876z zVar = null;
        try {
            zVar = new C13878b().mo43781a((C13870w) new C11690c()).mo43804d(f33754a, TimeUnit.MILLISECONDS).mo43793b(f33754a, TimeUnit.MILLISECONDS).mo43781a((C13870w) aVar).mo43791a();
        } catch (Exception e) {
            e.printStackTrace();
        }
        f33774e = (APIInterface) new Builder().baseUrl(f33825q.equalsIgnoreCase(f33789h) ? f33817o : f33821p).addConverterFactory(GsonConverterFactory.create()).client(zVar).build().create(APIInterface.class);
        return f33774e;
    }
}
