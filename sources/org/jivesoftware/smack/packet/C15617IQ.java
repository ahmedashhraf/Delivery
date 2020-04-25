package org.jivesoftware.smack.packet;

import java.util.Locale;
import org.jivesoftware.smack.util.Objects;
import org.jivesoftware.smack.util.XmlStringBuilder;

/* renamed from: org.jivesoftware.smack.packet.IQ */
public abstract class C15617IQ extends Stanza {
    public static final String IQ_ELEMENT = "iq";
    public static final String QUERY_ELEMENT = "query";
    private final String childElementName;
    private final String childElementNamespace;
    private Type type;

    /* renamed from: org.jivesoftware.smack.packet.IQ$1 */
    static /* synthetic */ class C156181 {
        static final /* synthetic */ int[] $SwitchMap$org$jivesoftware$smack$packet$IQ$Type = new int[Type.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                org.jivesoftware.smack.packet.IQ$Type[] r0 = org.jivesoftware.smack.packet.C15617IQ.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$org$jivesoftware$smack$packet$IQ$Type = r0
                int[] r0 = $SwitchMap$org$jivesoftware$smack$packet$IQ$Type     // Catch:{ NoSuchFieldError -> 0x0014 }
                org.jivesoftware.smack.packet.IQ$Type r1 = org.jivesoftware.smack.packet.C15617IQ.Type.get     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = $SwitchMap$org$jivesoftware$smack$packet$IQ$Type     // Catch:{ NoSuchFieldError -> 0x001f }
                org.jivesoftware.smack.packet.IQ$Type r1 = org.jivesoftware.smack.packet.C15617IQ.Type.set     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smack.packet.C15617IQ.C156181.<clinit>():void");
        }
    }

    /* renamed from: org.jivesoftware.smack.packet.IQ$IQChildElementXmlStringBuilder */
    public static class IQChildElementXmlStringBuilder extends XmlStringBuilder {
        /* access modifiers changed from: private */
        public final String element;
        /* access modifiers changed from: private */
        public boolean isEmptyElement;

        /* synthetic */ IQChildElementXmlStringBuilder(C15617IQ iq, C156181 r2) {
            this(iq);
        }

        public void setEmptyElement() {
            this.isEmptyElement = true;
        }

        private IQChildElementXmlStringBuilder(C15617IQ iq) {
            this(iq.getChildElementName(), iq.getChildElementNamespace());
        }

        public IQChildElementXmlStringBuilder(ExtensionElement extensionElement) {
            this(extensionElement.getElementName(), extensionElement.getNamespace());
        }

        private IQChildElementXmlStringBuilder(String str, String str2) {
            prelude(str, str2);
            this.element = str;
        }
    }

    /* renamed from: org.jivesoftware.smack.packet.IQ$Type */
    public enum Type {
        get,
        set,
        result,
        error;

        public static Type fromString(String str) {
            return valueOf(str.toLowerCase(Locale.US));
        }
    }

    public C15617IQ(C15617IQ iq) {
        super((Stanza) iq);
        this.type = Type.get;
        this.type = iq.getType();
        this.childElementName = iq.childElementName;
        this.childElementNamespace = iq.childElementNamespace;
    }

    public static ErrorIQ createErrorResponse(C15617IQ iq, XMPPError xMPPError) {
        if (iq.getType() == Type.get || iq.getType() == Type.set) {
            ErrorIQ errorIQ = new ErrorIQ(xMPPError);
            errorIQ.setStanzaId(iq.getStanzaId());
            errorIQ.setFrom(iq.getTo());
            errorIQ.setTo(iq.getFrom());
            return errorIQ;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("IQ must be of type 'set' or 'get'. Original IQ: ");
        sb.append(iq.toXML());
        throw new IllegalArgumentException(sb.toString());
    }

    public static C15617IQ createResultIQ(C15617IQ iq) {
        return new EmptyResultIQ(iq);
    }

    public final String getChildElementName() {
        return this.childElementName;
    }

    public final String getChildElementNamespace() {
        return this.childElementNamespace;
    }

    public final XmlStringBuilder getChildElementXML() {
        XmlStringBuilder xmlStringBuilder = new XmlStringBuilder();
        if (this.type == Type.error) {
            appendErrorIfExists(xmlStringBuilder);
        } else if (this.childElementName != null) {
            IQChildElementXmlStringBuilder iQChildElementBuilder = getIQChildElementBuilder(new IQChildElementXmlStringBuilder(this, (C156181) null));
            if (iQChildElementBuilder != null) {
                xmlStringBuilder.append((XmlStringBuilder) iQChildElementBuilder);
                XmlStringBuilder extensionsXML = getExtensionsXML();
                if (iQChildElementBuilder.isEmptyElement) {
                    if (extensionsXML.length() == 0) {
                        xmlStringBuilder.closeEmptyElement();
                        return xmlStringBuilder;
                    }
                    xmlStringBuilder.rightAngleBracket();
                }
                xmlStringBuilder.append(extensionsXML);
                xmlStringBuilder.closeElement(iQChildElementBuilder.element);
            }
        }
        return xmlStringBuilder;
    }

    /* access modifiers changed from: protected */
    public abstract IQChildElementXmlStringBuilder getIQChildElementBuilder(IQChildElementXmlStringBuilder iQChildElementXmlStringBuilder);

    public Type getType() {
        return this.type;
    }

    public boolean isRequestIQ() {
        int i = C156181.$SwitchMap$org$jivesoftware$smack$packet$IQ$Type[this.type.ordinal()];
        return i == 1 || i == 2;
    }

    public void setType(Type type2) {
        this.type = (Type) Objects.requireNonNull(type2, "type must not be null");
    }

    public final XmlStringBuilder toXML() {
        XmlStringBuilder xmlStringBuilder = new XmlStringBuilder();
        String str = IQ_ELEMENT;
        xmlStringBuilder.halfOpenElement(str);
        addCommonAttributes(xmlStringBuilder);
        Type type2 = this.type;
        String str2 = "type";
        if (type2 == null) {
            xmlStringBuilder.attribute(str2, "get");
        } else {
            xmlStringBuilder.attribute(str2, type2.toString());
        }
        xmlStringBuilder.rightAngleBracket();
        xmlStringBuilder.append(getChildElementXML());
        xmlStringBuilder.closeElement(str);
        return xmlStringBuilder;
    }

    protected C15617IQ(String str) {
        this(str, null);
    }

    protected C15617IQ(String str, String str2) {
        this.type = Type.get;
        this.childElementName = str;
        this.childElementNamespace = str2;
    }
}
