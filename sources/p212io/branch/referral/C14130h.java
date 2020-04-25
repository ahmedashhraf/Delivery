package p212io.branch.referral;

/* renamed from: io.branch.referral.h */
/* compiled from: BranchError */
public class C14130h {

    /* renamed from: c */
    public static final int f41548c = -101;

    /* renamed from: d */
    public static final int f41549d = -102;

    /* renamed from: e */
    public static final int f41550e = -103;

    /* renamed from: f */
    public static final int f41551f = -104;

    /* renamed from: g */
    public static final int f41552g = -105;

    /* renamed from: h */
    public static final int f41553h = -106;

    /* renamed from: i */
    public static final int f41554i = -107;

    /* renamed from: j */
    public static final int f41555j = -108;

    /* renamed from: k */
    public static final int f41556k = -109;

    /* renamed from: l */
    public static final int f41557l = -110;

    /* renamed from: m */
    public static final int f41558m = -111;

    /* renamed from: n */
    public static final int f41559n = -112;

    /* renamed from: o */
    public static final int f41560o = -113;

    /* renamed from: p */
    public static final int f41561p = -114;

    /* renamed from: q */
    public static final int f41562q = -115;

    /* renamed from: r */
    public static final int f41563r = -116;

    /* renamed from: s */
    public static final int f41564s = -117;

    /* renamed from: a */
    String f41565a = "";

    /* renamed from: b */
    int f41566b = f41560o;

    public C14130h(String str, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(m61102a(i));
        this.f41565a = sb.toString();
    }

    /* renamed from: a */
    public int mo44645a() {
        return this.f41566b;
    }

    /* renamed from: b */
    public String mo44646b() {
        return this.f41565a;
    }

    public String toString() {
        return mo44646b();
    }

    /* renamed from: a */
    private String m61102a(int i) {
        if (i == -113) {
            this.f41566b = f41560o;
            return " Branch API Error: poor network connectivity. Please try again later.";
        } else if (i == -114) {
            this.f41566b = f41561p;
            return " Branch API Error: Please enter your branch_key in your project's manifest file first.";
        } else if (i == -104) {
            this.f41566b = f41551f;
            return " Did you forget to call init? Make sure you init the session before making Branch calls.";
        } else if (i == -101) {
            this.f41566b = f41548c;
            return " Unable to initialize Branch. Check network connectivity or that your branch key is valid.";
        } else if (i == -102) {
            this.f41566b = f41549d;
            return " Please add 'android.permission.INTERNET' in your applications manifest file.";
        } else if (i == -105) {
            this.f41566b = f41552g;
            return " Unable to create a URL with that alias. If you want to reuse the alias, make sure to submit the same properties for all arguments and that the user is the same owner.";
        } else if (i == -106) {
            this.f41566b = f41553h;
            return " That Branch referral code is already in use.";
        } else if (i == -107) {
            this.f41566b = f41554i;
            return " Unable to redeem rewards. Please make sure you have credits available to redeem.";
        } else if (i == -108) {
            this.f41566b = f41555j;
            return "BranchApp class can be used only with API level 14 or above. Please make sure your minimum API level supported is 14. If you wish to use API level below 14 consider calling getInstance(Context) instead.";
        } else if (i == -109) {
            this.f41566b = f41556k;
            return "Branch instance is not created. Make  sure your Application class is an instance of BranchLikedApp.";
        } else if (i == -110) {
            this.f41566b = f41557l;
            return " Unable create share options. Couldn't find applications on device to share the link.";
        } else if (i == -111) {
            this.f41566b = f41558m;
            return " Request to Branch server timed out. Please check your internet connectivity";
        } else if (i == -117) {
            this.f41566b = f41564s;
            return " Tracking is disabled. Requested operation cannot be completed when tracking is disabled";
        } else if (i >= 500 || i == -112) {
            this.f41566b = f41559n;
            return " Unable to reach the Branch servers, please try again shortly.";
        } else if (i == 409 || i == -115) {
            this.f41566b = f41562q;
            return " A resource with this identifier already exists.";
        } else if (i >= 400 || i == -116) {
            this.f41566b = f41563r;
            return " The request was invalid.";
        } else {
            this.f41566b = f41560o;
            return " Check network connectivity and that you properly initialized.";
        }
    }
}
