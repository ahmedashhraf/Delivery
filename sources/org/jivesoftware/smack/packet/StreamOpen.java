package org.jivesoftware.smack.packet;

import com.mrsool.utils.C11644i;
import org.jivesoftware.smack.util.StringUtils;
import org.jivesoftware.smack.util.XmlStringBuilder;
import org.jivesoftware.smackx.privacy.packet.PrivacyItem;

public class StreamOpen extends FullStreamElement {
    public static final String CLIENT_NAMESPACE = "jabber:client";
    public static final String ELEMENT = "stream:stream";
    public static final String SERVER_NAMESPACE = "jabber:server";
    public static final String VERSION = "1.0";
    private final String contentNamespace;
    private final String from;

    /* renamed from: id */
    private final String f44980id;
    private final String lang;

    /* renamed from: to */
    private final String f44981to;

    /* renamed from: org.jivesoftware.smack.packet.StreamOpen$1 */
    static /* synthetic */ class C156211 {

        /* renamed from: $SwitchMap$org$jivesoftware$smack$packet$StreamOpen$StreamContentNamespace */
        static final /* synthetic */ int[] f44982x2ba30084 = new int[StreamContentNamespace.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                org.jivesoftware.smack.packet.StreamOpen$StreamContentNamespace[] r0 = org.jivesoftware.smack.packet.StreamOpen.StreamContentNamespace.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f44982x2ba30084 = r0
                int[] r0 = f44982x2ba30084     // Catch:{ NoSuchFieldError -> 0x0014 }
                org.jivesoftware.smack.packet.StreamOpen$StreamContentNamespace r1 = org.jivesoftware.smack.packet.StreamOpen.StreamContentNamespace.client     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f44982x2ba30084     // Catch:{ NoSuchFieldError -> 0x001f }
                org.jivesoftware.smack.packet.StreamOpen$StreamContentNamespace r1 = org.jivesoftware.smack.packet.StreamOpen.StreamContentNamespace.server     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smack.packet.StreamOpen.C156211.<clinit>():void");
        }
    }

    public enum StreamContentNamespace {
        client,
        server
    }

    public StreamOpen(CharSequence charSequence) {
        this(charSequence, null, null, null, StreamContentNamespace.client);
    }

    public String getElementName() {
        return ELEMENT;
    }

    public String getNamespace() {
        return this.contentNamespace;
    }

    public StreamOpen(CharSequence charSequence, CharSequence charSequence2, String str) {
        CharSequence charSequence3 = charSequence;
        CharSequence charSequence4 = charSequence2;
        String str2 = str;
        this(charSequence3, charSequence4, str2, C11644i.f33183R5, StreamContentNamespace.client);
    }

    public XmlStringBuilder toXML() {
        XmlStringBuilder xmlStringBuilder = new XmlStringBuilder((ExtensionElement) this);
        xmlStringBuilder.attribute("to", this.f44981to);
        xmlStringBuilder.attribute("xmlns:stream", "http://etherx.jabber.org/streams");
        xmlStringBuilder.attribute("version", "1.0");
        xmlStringBuilder.optAttribute(PrivacyItem.SUBSCRIPTION_FROM, this.from);
        xmlStringBuilder.optAttribute("id", this.f44980id);
        xmlStringBuilder.xmllangAttribute(this.lang);
        xmlStringBuilder.rightAngleBracket();
        return xmlStringBuilder;
    }

    public StreamOpen(CharSequence charSequence, CharSequence charSequence2, String str, String str2, StreamContentNamespace streamContentNamespace) {
        this.f44981to = StringUtils.maybeToString(charSequence);
        this.from = StringUtils.maybeToString(charSequence2);
        this.f44980id = str;
        this.lang = str2;
        int i = C156211.f44982x2ba30084[streamContentNamespace.ordinal()];
        if (i == 1) {
            this.contentNamespace = CLIENT_NAMESPACE;
        } else if (i == 2) {
            this.contentNamespace = SERVER_NAMESPACE;
        } else {
            throw new IllegalStateException();
        }
    }
}
