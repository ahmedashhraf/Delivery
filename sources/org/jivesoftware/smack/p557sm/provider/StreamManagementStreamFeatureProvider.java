package org.jivesoftware.smack.p557sm.provider;

import org.jivesoftware.smack.p557sm.packet.StreamManagement.StreamManagementFeature;
import org.jivesoftware.smack.provider.ExtensionElementProvider;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: org.jivesoftware.smack.sm.provider.StreamManagementStreamFeatureProvider */
public class StreamManagementStreamFeatureProvider extends ExtensionElementProvider<StreamManagementFeature> {
    public StreamManagementFeature parse(XmlPullParser xmlPullParser, int i) {
        return StreamManagementFeature.INSTANCE;
    }
}
