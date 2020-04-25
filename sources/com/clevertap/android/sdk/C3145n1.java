package com.clevertap.android.sdk;

/* renamed from: com.clevertap.android.sdk.n1 */
/* compiled from: PushType */
public enum C3145n1 {
    FCM("fcm"),
    GCM("gcm");
    
    private final String type;

    private C3145n1(String str) {
        this.type = str;
    }

    /* renamed from: b */
    static C3145n1 m15069b(String str) {
        if ("fcm".equals(str)) {
            return FCM;
        }
        if ("gcm".equals(str)) {
            return GCM;
        }
        return null;
    }

    public String toString() {
        return this.type;
    }
}
