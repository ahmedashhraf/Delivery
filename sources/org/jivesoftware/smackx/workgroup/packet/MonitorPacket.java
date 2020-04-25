package org.jivesoftware.smackx.workgroup.packet;

import java.io.IOException;
import org.jivesoftware.smack.packet.C15617IQ;
import org.jivesoftware.smack.packet.C15617IQ.IQChildElementXmlStringBuilder;
import org.jivesoftware.smack.provider.IQProvider;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class MonitorPacket extends C15617IQ {
    public static final String ELEMENT_NAME = "monitor";
    public static final String NAMESPACE = "http://jivesoftware.com/protocol/workgroup";
    private boolean isMonitor;
    private String sessionID;

    public static class InternalProvider extends IQProvider<MonitorPacket> {
        public MonitorPacket parse(XmlPullParser xmlPullParser, int i) throws XmlPullParserException, IOException {
            MonitorPacket monitorPacket = new MonitorPacket();
            boolean z = false;
            while (!z) {
                int next = xmlPullParser.next();
                if (next == 2) {
                    if ("isMonitor".equals(xmlPullParser.getName())) {
                        if ("false".equalsIgnoreCase(xmlPullParser.nextText())) {
                            monitorPacket.setMonitor(false);
                        } else {
                            monitorPacket.setMonitor(true);
                        }
                    }
                }
                if (next == 3) {
                    if (MonitorPacket.ELEMENT_NAME.equals(xmlPullParser.getName())) {
                        z = true;
                    }
                }
            }
            return monitorPacket;
        }
    }

    public MonitorPacket() {
        super(ELEMENT_NAME, "http://jivesoftware.com/protocol/workgroup");
    }

    /* access modifiers changed from: protected */
    public IQChildElementXmlStringBuilder getIQChildElementBuilder(IQChildElementXmlStringBuilder iQChildElementXmlStringBuilder) {
        iQChildElementXmlStringBuilder.rightAngleBracket();
        if (this.sessionID != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("<makeOwner sessionID=\"");
            sb.append(this.sessionID);
            sb.append("\"></makeOwner>");
            iQChildElementXmlStringBuilder.append((CharSequence) sb.toString());
        }
        return iQChildElementXmlStringBuilder;
    }

    public String getSessionID() {
        return this.sessionID;
    }

    public boolean isMonitor() {
        return this.isMonitor;
    }

    public void setMonitor(boolean z) {
        this.isMonitor = z;
    }

    public void setSessionID(String str) {
        this.sessionID = str;
    }
}
