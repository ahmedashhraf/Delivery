package p212io.fabric.sdk.android.p493p.p495b;

/* renamed from: io.fabric.sdk.android.p.b.m */
/* compiled from: DeliveryMechanism */
public enum C14256m {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);
    
    public static final String BETA_APP_PACKAGE_NAME = "io.crash.air";

    /* renamed from: id */
    private final int f42056id;

    private C14256m(int i) {
        this.f42056id = i;
    }

    /* renamed from: b */
    public static C14256m m61859b(String str) {
        if (BETA_APP_PACKAGE_NAME.equals(str)) {
            return TEST_DISTRIBUTION;
        }
        if (str != null) {
            return APP_STORE;
        }
        return DEVELOPER;
    }

    /* renamed from: d */
    public int mo45149d() {
        return this.f42056id;
    }

    public String toString() {
        return Integer.toString(this.f42056id);
    }
}
