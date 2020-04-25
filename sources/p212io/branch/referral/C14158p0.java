package p212io.branch.referral;

import com.facebook.messenger.MessengerUtils;

/* renamed from: io.branch.referral.p0 */
/* compiled from: SharingHelper */
public class C14158p0 {

    /* renamed from: io.branch.referral.p0$a */
    /* compiled from: SharingHelper */
    public enum C14159a {
        FACEBOOK("com.facebook.katana"),
        FACEBOOK_MESSENGER(MessengerUtils.PACKAGE_NAME),
        TWITTER("com.twitter.android"),
        MESSAGE(".mms"),
        EMAIL("com.google.android.email"),
        FLICKR("com.yahoo.mobile.client.android.flickr"),
        GOOGLE_DOC("com.google.android.apps.docs"),
        WHATS_APP("com.whatsapp"),
        PINTEREST("com.pinterest"),
        HANGOUT("com.google.android.talk"),
        INSTAGRAM("com.instagram.android"),
        WECHAT("jom.tencent.mm"),
        SNAPCHAT("com.snapchat.android"),
        GMAIL("com.google.android.gm");
        
        private String name;

        private C14159a(String str) {
            this.name = "";
            this.name = str;
        }

        /* renamed from: d */
        public String mo44739d() {
            return this.name;
        }

        public String toString() {
            return this.name;
        }
    }
}
