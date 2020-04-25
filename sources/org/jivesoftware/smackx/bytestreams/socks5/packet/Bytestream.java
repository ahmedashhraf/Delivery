package org.jivesoftware.smackx.bytestreams.socks5.packet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.jivesoftware.smack.packet.C15617IQ;
import org.jivesoftware.smack.packet.C15617IQ.IQChildElementXmlStringBuilder;
import org.jivesoftware.smack.packet.C15617IQ.Type;
import org.jivesoftware.smack.packet.Element;
import org.jivesoftware.smack.packet.NamedElement;
import org.jivesoftware.smack.util.XmlStringBuilder;

public class Bytestream extends C15617IQ {
    public static final String ELEMENT = "query";
    public static final String NAMESPACE = "http://jabber.org/protocol/bytestreams";
    private Mode mode;
    private String sessionID;
    private final List<StreamHost> streamHosts;
    private Activate toActivate;
    private StreamHostUsed usedHost;

    /* renamed from: org.jivesoftware.smackx.bytestreams.socks5.packet.Bytestream$1 */
    static /* synthetic */ class C156581 {
        static final /* synthetic */ int[] $SwitchMap$org$jivesoftware$smack$packet$IQ$Type = new int[Type.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                org.jivesoftware.smack.packet.IQ$Type[] r0 = org.jivesoftware.smack.packet.C15617IQ.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$org$jivesoftware$smack$packet$IQ$Type = r0
                int[] r0 = $SwitchMap$org$jivesoftware$smack$packet$IQ$Type     // Catch:{ NoSuchFieldError -> 0x0014 }
                org.jivesoftware.smack.packet.IQ$Type r1 = org.jivesoftware.smack.packet.C15617IQ.Type.set     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = $SwitchMap$org$jivesoftware$smack$packet$IQ$Type     // Catch:{ NoSuchFieldError -> 0x001f }
                org.jivesoftware.smack.packet.IQ$Type r1 = org.jivesoftware.smack.packet.C15617IQ.Type.result     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = $SwitchMap$org$jivesoftware$smack$packet$IQ$Type     // Catch:{ NoSuchFieldError -> 0x002a }
                org.jivesoftware.smack.packet.IQ$Type r1 = org.jivesoftware.smack.packet.C15617IQ.Type.get     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smackx.bytestreams.socks5.packet.Bytestream.C156581.<clinit>():void");
        }
    }

    public static class Activate implements NamedElement {
        public static String ELEMENTNAME = "activate";
        private final String target;

        public Activate(String str) {
            this.target = str;
        }

        public String getElementName() {
            return ELEMENTNAME;
        }

        public String getTarget() {
            return this.target;
        }

        public XmlStringBuilder toXML() {
            XmlStringBuilder xmlStringBuilder = new XmlStringBuilder((NamedElement) this);
            xmlStringBuilder.rightAngleBracket();
            xmlStringBuilder.escape(getTarget());
            xmlStringBuilder.closeElement((NamedElement) this);
            return xmlStringBuilder;
        }
    }

    public enum Mode {
        tcp,
        udp;

        public static Mode fromName(String str) {
            try {
                return valueOf(str);
            } catch (Exception unused) {
                return tcp;
            }
        }
    }

    public static class StreamHost implements NamedElement {
        public static String ELEMENTNAME = "streamhost";
        private final String JID;
        private final String addy;
        private final int port;

        public StreamHost(String str, String str2) {
            this(str, str2, 0);
        }

        public String getAddress() {
            return this.addy;
        }

        public String getElementName() {
            return ELEMENTNAME;
        }

        public String getJID() {
            return this.JID;
        }

        public int getPort() {
            return this.port;
        }

        public StreamHost(String str, String str2, int i) {
            this.JID = str;
            this.addy = str2;
            this.port = i;
        }

        public XmlStringBuilder toXML() {
            XmlStringBuilder xmlStringBuilder = new XmlStringBuilder((NamedElement) this);
            xmlStringBuilder.attribute("jid", getJID());
            xmlStringBuilder.attribute("host", getAddress());
            if (getPort() != 0) {
                xmlStringBuilder.attribute("port", Integer.toString(getPort()));
            } else {
                xmlStringBuilder.attribute("zeroconf", "_jabber.bytestreams");
            }
            xmlStringBuilder.closeEmptyElement();
            return xmlStringBuilder;
        }
    }

    public static class StreamHostUsed implements NamedElement {
        public static String ELEMENTNAME = "streamhost-used";
        private final String JID;

        public StreamHostUsed(String str) {
            this.JID = str;
        }

        public String getElementName() {
            return ELEMENTNAME;
        }

        public String getJID() {
            return this.JID;
        }

        public XmlStringBuilder toXML() {
            XmlStringBuilder xmlStringBuilder = new XmlStringBuilder((NamedElement) this);
            xmlStringBuilder.attribute("jid", getJID());
            xmlStringBuilder.closeEmptyElement();
            return xmlStringBuilder;
        }
    }

    public Bytestream() {
        super("query", NAMESPACE);
        this.mode = Mode.tcp;
        this.streamHosts = new ArrayList();
    }

    public StreamHost addStreamHost(String str, String str2) {
        return addStreamHost(str, str2, 0);
    }

    public int countStreamHosts() {
        return this.streamHosts.size();
    }

    /* access modifiers changed from: protected */
    public IQChildElementXmlStringBuilder getIQChildElementBuilder(IQChildElementXmlStringBuilder iQChildElementXmlStringBuilder) {
        int i = C156581.$SwitchMap$org$jivesoftware$smack$packet$IQ$Type[getType().ordinal()];
        if (i == 1) {
            iQChildElementXmlStringBuilder.optAttribute("sid", getSessionID());
            iQChildElementXmlStringBuilder.optAttribute("mode", (Enum<?>) getMode());
            iQChildElementXmlStringBuilder.rightAngleBracket();
            if (getToActivate() == null) {
                for (StreamHost xml : getStreamHosts()) {
                    iQChildElementXmlStringBuilder.append(xml.toXML());
                }
            } else {
                iQChildElementXmlStringBuilder.append(getToActivate().toXML());
            }
        } else if (i == 2) {
            iQChildElementXmlStringBuilder.rightAngleBracket();
            iQChildElementXmlStringBuilder.optAppend((Element) getUsedHost());
            for (StreamHost xml2 : this.streamHosts) {
                iQChildElementXmlStringBuilder.append(xml2.toXML());
            }
        } else if (i == 3) {
            iQChildElementXmlStringBuilder.setEmptyElement();
        } else {
            throw new IllegalStateException();
        }
        return iQChildElementXmlStringBuilder;
    }

    public Mode getMode() {
        return this.mode;
    }

    public String getSessionID() {
        return this.sessionID;
    }

    public StreamHost getStreamHost(String str) {
        if (str == null) {
            return null;
        }
        for (StreamHost streamHost : this.streamHosts) {
            if (streamHost.getJID().equals(str)) {
                return streamHost;
            }
        }
        return null;
    }

    public List<StreamHost> getStreamHosts() {
        return Collections.unmodifiableList(this.streamHosts);
    }

    public Activate getToActivate() {
        return this.toActivate;
    }

    public StreamHostUsed getUsedHost() {
        return this.usedHost;
    }

    public void setMode(Mode mode2) {
        this.mode = mode2;
    }

    public void setSessionID(String str) {
        this.sessionID = str;
    }

    public void setToActivate(String str) {
        this.toActivate = new Activate(str);
    }

    public void setUsedHost(String str) {
        this.usedHost = new StreamHostUsed(str);
    }

    public StreamHost addStreamHost(String str, String str2, int i) {
        StreamHost streamHost = new StreamHost(str, str2, i);
        addStreamHost(streamHost);
        return streamHost;
    }

    public Bytestream(String str) {
        this();
        setSessionID(str);
    }

    public void addStreamHost(StreamHost streamHost) {
        this.streamHosts.add(streamHost);
    }
}
