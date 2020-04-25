package org.jivesoftware.smackx.amp.provider;

import java.util.logging.Logger;
import org.jivesoftware.smack.provider.ExtensionElementProvider;
import org.jivesoftware.smackx.amp.AMPDeliverCondition;
import org.jivesoftware.smackx.amp.AMPDeliverCondition.Value;
import org.jivesoftware.smackx.amp.AMPExpireAtCondition;
import org.jivesoftware.smackx.amp.AMPMatchResourceCondition;
import org.jivesoftware.smackx.amp.packet.AMPExtension;
import org.jivesoftware.smackx.amp.packet.AMPExtension.Condition;

public class AMPExtensionProvider extends ExtensionElementProvider<AMPExtension> {
    private static final Logger LOGGER = Logger.getLogger(AMPExtensionProvider.class.getName());

    private Condition createCondition(String str, String str2) {
        if (str == null || str2 == null) {
            LOGGER.severe("Can't create rule condition from null name and/or value");
            return null;
        } else if (AMPDeliverCondition.NAME.equals(str)) {
            try {
                return new AMPDeliverCondition(Value.valueOf(str2));
            } catch (IllegalArgumentException unused) {
                Logger logger = LOGGER;
                StringBuilder sb = new StringBuilder();
                sb.append("Found invalid rule delivery condition value ");
                sb.append(str2);
                logger.severe(sb.toString());
                return null;
            }
        } else if (AMPExpireAtCondition.NAME.equals(str)) {
            return new AMPExpireAtCondition(str2);
        } else {
            if (AMPMatchResourceCondition.NAME.equals(str)) {
                try {
                    return new AMPMatchResourceCondition(AMPMatchResourceCondition.Value.valueOf(str2));
                } catch (IllegalArgumentException unused2) {
                    Logger logger2 = LOGGER;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Found invalid rule match-resource condition value ");
                    sb2.append(str2);
                    logger2.severe(sb2.toString());
                    return null;
                }
            } else {
                Logger logger3 = LOGGER;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Found unknown rule condition name ");
                sb3.append(str);
                logger3.severe(sb3.toString());
                return null;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x003e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.jivesoftware.smackx.amp.packet.AMPExtension parse(org.xmlpull.v1.XmlPullParser r8, int r9) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r7 = this;
            r9 = 0
            java.lang.String r0 = "from"
            java.lang.String r0 = r8.getAttributeValue(r9, r0)
            java.lang.String r1 = "to"
            java.lang.String r1 = r8.getAttributeValue(r9, r1)
            java.lang.String r2 = "status"
            java.lang.String r2 = r8.getAttributeValue(r9, r2)
            if (r2 == 0) goto L_0x0030
            org.jivesoftware.smackx.amp.packet.AMPExtension$Status r2 = org.jivesoftware.smackx.amp.packet.AMPExtension.Status.valueOf(r2)     // Catch:{ IllegalArgumentException -> 0x001a }
            goto L_0x0031
        L_0x001a:
            java.util.logging.Logger r3 = LOGGER
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Found invalid amp status "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r3.severe(r2)
        L_0x0030:
            r2 = r9
        L_0x0031:
            org.jivesoftware.smackx.amp.packet.AMPExtension r3 = new org.jivesoftware.smackx.amp.packet.AMPExtension
            r3.<init>(r0, r1, r2)
            java.lang.String r0 = "per-hop"
            java.lang.String r0 = r8.getAttributeValue(r9, r0)
            if (r0 == 0) goto L_0x0045
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            r3.setPerHop(r0)
        L_0x0045:
            r0 = 0
        L_0x0046:
            if (r0 != 0) goto L_0x00b6
            int r1 = r8.next()
            r2 = 2
            if (r1 != r2) goto L_0x00a5
            java.lang.String r1 = r8.getName()
            java.lang.String r2 = "rule"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0046
            java.lang.String r1 = "action"
            java.lang.String r1 = r8.getAttributeValue(r9, r1)
            java.lang.String r2 = "condition"
            java.lang.String r2 = r8.getAttributeValue(r9, r2)
            java.lang.String r4 = "value"
            java.lang.String r4 = r8.getAttributeValue(r9, r4)
            org.jivesoftware.smackx.amp.packet.AMPExtension$Condition r2 = r7.createCondition(r2, r4)
            if (r1 == 0) goto L_0x008e
            org.jivesoftware.smackx.amp.packet.AMPExtension$Action r1 = org.jivesoftware.smackx.amp.packet.AMPExtension.Action.valueOf(r1)     // Catch:{ IllegalArgumentException -> 0x0078 }
            goto L_0x008f
        L_0x0078:
            java.util.logging.Logger r4 = LOGGER
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Found invalid rule action value "
            r5.append(r6)
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            r4.severe(r1)
        L_0x008e:
            r1 = r9
        L_0x008f:
            if (r1 == 0) goto L_0x009d
            if (r2 != 0) goto L_0x0094
            goto L_0x009d
        L_0x0094:
            org.jivesoftware.smackx.amp.packet.AMPExtension$Rule r4 = new org.jivesoftware.smackx.amp.packet.AMPExtension$Rule
            r4.<init>(r1, r2)
            r3.addRule(r4)
            goto L_0x0046
        L_0x009d:
            java.util.logging.Logger r1 = LOGGER
            java.lang.String r2 = "Rule is skipped because either it's action or it's condition is invalid"
            r1.severe(r2)
            goto L_0x0046
        L_0x00a5:
            r2 = 3
            if (r1 != r2) goto L_0x0046
            java.lang.String r1 = r8.getName()
            java.lang.String r2 = "amp"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0046
            r0 = 1
            goto L_0x0046
        L_0x00b6:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smackx.amp.provider.AMPExtensionProvider.parse(org.xmlpull.v1.XmlPullParser, int):org.jivesoftware.smackx.amp.packet.AMPExtension");
    }
}
