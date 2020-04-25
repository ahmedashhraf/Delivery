package org.jivesoftware.smackx.pubsub.provider;

import org.jivesoftware.smack.provider.ExtensionElementProvider;
import org.jivesoftware.smackx.pubsub.Subscription;

public class SubscriptionProvider extends ExtensionElementProvider<Subscription> {
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005b A[LOOP:1: B:15:0x0055->B:17:0x005b, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0064  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.jivesoftware.smackx.pubsub.Subscription parse(org.xmlpull.v1.XmlPullParser r11, int r12) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r10 = this;
            r12 = 0
            java.lang.String r0 = "jid"
            java.lang.String r2 = r11.getAttributeValue(r12, r0)
            java.lang.String r0 = "node"
            java.lang.String r3 = r11.getAttributeValue(r12, r0)
            java.lang.String r0 = "subid"
            java.lang.String r4 = r11.getAttributeValue(r12, r0)
            java.lang.String r0 = "subscription"
            java.lang.String r0 = r11.getAttributeValue(r12, r0)
            int r1 = r11.next()
            r5 = 3
            r6 = 2
            r7 = 0
            if (r1 != r6) goto L_0x0054
            java.lang.String r1 = r11.getName()
            java.lang.String r8 = "subscribe-options"
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L_0x0054
            int r1 = r11.next()
            if (r1 != r6) goto L_0x0041
            java.lang.String r6 = r11.getName()
            java.lang.String r9 = "required"
            boolean r6 = r6.equals(r9)
            if (r6 == 0) goto L_0x0041
            r7 = 1
        L_0x0041:
            if (r1 == r5) goto L_0x0052
            java.lang.String r1 = r11.getName()
            boolean r1 = r1.equals(r8)
            if (r1 != 0) goto L_0x0052
            int r1 = r11.next()
            goto L_0x0041
        L_0x0052:
            r6 = r7
            goto L_0x0055
        L_0x0054:
            r6 = 0
        L_0x0055:
            int r1 = r11.getEventType()
            if (r1 == r5) goto L_0x005f
            r11.next()
            goto L_0x0055
        L_0x005f:
            org.jivesoftware.smackx.pubsub.Subscription r11 = new org.jivesoftware.smackx.pubsub.Subscription
            if (r0 != 0) goto L_0x0064
            goto L_0x0068
        L_0x0064:
            org.jivesoftware.smackx.pubsub.Subscription$State r12 = org.jivesoftware.smackx.pubsub.Subscription.State.valueOf(r0)
        L_0x0068:
            r5 = r12
            r1 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smackx.pubsub.provider.SubscriptionProvider.parse(org.xmlpull.v1.XmlPullParser, int):org.jivesoftware.smackx.pubsub.Subscription");
    }
}
