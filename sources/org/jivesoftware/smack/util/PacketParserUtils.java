package org.jivesoftware.smack.util;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.logging.C15096h;
import org.jivesoftware.smack.SmackException;
import org.jivesoftware.smack.compress.packet.Compress.Feature;
import org.jivesoftware.smack.packet.C15617IQ;
import org.jivesoftware.smack.packet.C15617IQ.Type;
import org.jivesoftware.smack.packet.DefaultExtensionElement;
import org.jivesoftware.smack.packet.EmptyResultIQ;
import org.jivesoftware.smack.packet.ErrorIQ;
import org.jivesoftware.smack.packet.ExtensionElement;
import org.jivesoftware.smack.packet.Mechanisms;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smack.packet.Presence;
import org.jivesoftware.smack.packet.Presence.Mode;
import org.jivesoftware.smack.packet.Session;
import org.jivesoftware.smack.packet.Stanza;
import org.jivesoftware.smack.packet.StartTls;
import org.jivesoftware.smack.packet.StreamError;
import org.jivesoftware.smack.packet.UnparsedIQ;
import org.jivesoftware.smack.packet.XMPPError;
import org.jivesoftware.smack.packet.XMPPError.Condition;
import org.jivesoftware.smack.provider.ExtensionElementProvider;
import org.jivesoftware.smack.provider.IQProvider;
import org.jivesoftware.smack.provider.ProviderManager;
import org.jivesoftware.smack.sasl.packet.SaslStreamElements.SASLFailure;
import org.jivesoftware.smackx.privacy.packet.PrivacyItem;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

public class PacketParserUtils {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String FEATURE_XML_ROUNDTRIP = "http://xmlpull.org/v1/doc/features.html#xml-roundtrip";
    private static final Logger LOGGER = Logger.getLogger(PacketParserUtils.class.getName());
    private static final XmlPullParserFactory XML_PULL_PARSER_FACTORY;
    public static final boolean XML_PULL_PARSER_SUPPORTS_ROUNDTRIP;

    /* renamed from: org.jivesoftware.smack.util.PacketParserUtils$1 */
    static /* synthetic */ class C156421 {
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
                org.jivesoftware.smack.packet.IQ$Type r1 = org.jivesoftware.smack.packet.C15617IQ.Type.error     // Catch:{ NoSuchFieldError -> 0x0014 }
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
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smack.util.PacketParserUtils.C156421.<clinit>():void");
        }
    }

    static {
        boolean z = false;
        try {
            XML_PULL_PARSER_FACTORY = XmlPullParserFactory.newInstance();
            try {
                XML_PULL_PARSER_FACTORY.newPullParser().setFeature(FEATURE_XML_ROUNDTRIP, true);
                z = true;
            } catch (XmlPullParserException e) {
                LOGGER.log(Level.FINEST, "XmlPullParser does not support XML_ROUNDTRIP", e);
            }
            XML_PULL_PARSER_SUPPORTS_ROUNDTRIP = z;
        } catch (XmlPullParserException e2) {
            throw new AssertionError(e2);
        }
    }

    public static void addExtensionElement(Stanza stanza, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException, SmackException {
        ParserUtils.assertAtStartTag(xmlPullParser);
        addExtensionElement(stanza, xmlPullParser, xmlPullParser.getName(), xmlPullParser.getNamespace());
    }

    @Deprecated
    public static void addPacketExtension(Stanza stanza, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException, SmackException {
        addExtensionElement(stanza, xmlPullParser);
    }

    private static String getLanguageAttribute(XmlPullParser xmlPullParser) {
        int i = 0;
        while (i < xmlPullParser.getAttributeCount()) {
            String attributeName = xmlPullParser.getAttributeName(i);
            if (!"xml:lang".equals(attributeName)) {
                if ("lang".equals(attributeName)) {
                    if ("xml".equals(xmlPullParser.getAttributePrefix(i))) {
                    }
                }
                i++;
            }
            return xmlPullParser.getAttributeValue(i);
        }
        return null;
    }

    public static XmlPullParser getParserFor(String str) throws XmlPullParserException, IOException {
        return getParserFor((Reader) new StringReader(str));
    }

    public static XmlPullParser newXmppParser() throws XmlPullParserException {
        XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
        newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
        if (XML_PULL_PARSER_SUPPORTS_ROUNDTRIP) {
            try {
                newPullParser.setFeature(FEATURE_XML_ROUNDTRIP, true);
            } catch (XmlPullParserException e) {
                LOGGER.log(Level.SEVERE, "XmlPullParser does not support XML_ROUNDTRIP, although it was first determined to be supported", e);
            }
        }
        return newPullParser;
    }

    public static Feature parseCompressionFeature(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        int depth = xmlPullParser.getDepth();
        LinkedList linkedList = new LinkedList();
        while (true) {
            int next = xmlPullParser.next();
            char c = 0;
            if (next == 2) {
                String name = xmlPullParser.getName();
                if (name.hashCode() != -1077554975 || !name.equals("method")) {
                    c = 65535;
                }
                if (c == 0) {
                    linkedList.add(xmlPullParser.nextText());
                }
            } else if (next != 3) {
                continue;
            } else {
                String name2 = xmlPullParser.getName();
                if (name2.hashCode() != 1431984486 || !name2.equals(Feature.ELEMENT)) {
                    c = 65535;
                }
                if (c == 0 && xmlPullParser.getDepth() == depth) {
                    return new Feature(linkedList);
                }
            }
        }
    }

    public static CharSequence parseContent(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (xmlPullParser.isEmptyElementTag()) {
            return "";
        }
        xmlPullParser.next();
        return parseContentDepth(xmlPullParser, xmlPullParser.getDepth(), false);
    }

    public static CharSequence parseContentDepth(XmlPullParser xmlPullParser, int i) throws XmlPullParserException, IOException {
        return parseContentDepth(xmlPullParser, i, false);
    }

    private static CharSequence parseContentDepthWithRoundtrip(XmlPullParser xmlPullParser, int i, boolean z) throws XmlPullParserException, IOException {
        StringBuilder sb = new StringBuilder();
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType != 2 || !xmlPullParser.isEmptyElementTag()) {
                CharSequence text = xmlPullParser.getText();
                if (eventType == 4) {
                    text = StringUtils.escapeForXML(text.toString());
                }
                sb.append(text);
            }
            if (eventType == 3 && xmlPullParser.getDepth() <= i) {
                return sb;
            }
            eventType = xmlPullParser.next();
        }
    }

    private static CharSequence parseContentDepthWithoutRoundtrip(XmlPullParser xmlPullParser, int i, boolean z) throws XmlPullParserException, IOException {
        XmlStringBuilder xmlStringBuilder = new XmlStringBuilder();
        int eventType = xmlPullParser.getEventType();
        String str = null;
        boolean z2 = false;
        while (true) {
            if (eventType == 2) {
                xmlStringBuilder.halfOpenElement(xmlPullParser.getName());
                if (str == null || z) {
                    String namespace = xmlPullParser.getNamespace();
                    if (StringUtils.isNotEmpty(namespace)) {
                        xmlStringBuilder.attribute("xmlns", namespace);
                        str = xmlPullParser.getName();
                    }
                }
                for (int i2 = 0; i2 < xmlPullParser.getAttributeCount(); i2++) {
                    xmlStringBuilder.attribute(xmlPullParser.getAttributeName(i2), xmlPullParser.getAttributeValue(i2));
                }
                if (xmlPullParser.isEmptyElementTag()) {
                    xmlStringBuilder.closeEmptyElement();
                    z2 = true;
                } else {
                    xmlStringBuilder.rightAngleBracket();
                }
            } else if (eventType == 3) {
                if (z2) {
                    z2 = false;
                } else {
                    xmlStringBuilder.closeElement(xmlPullParser.getName());
                }
                if (str != null && str.equals(xmlPullParser.getName())) {
                    str = null;
                }
                if (xmlPullParser.getDepth() <= i) {
                    return xmlStringBuilder;
                }
            } else if (eventType == 4) {
                xmlStringBuilder.escape(xmlPullParser.getText());
            }
            eventType = xmlPullParser.next();
        }
    }

    public static Map<String, String> parseDescriptiveTexts(XmlPullParser xmlPullParser, Map<String, String> map) throws XmlPullParserException, IOException {
        if (map == null) {
            map = new HashMap<>();
        }
        String str = (String) map.put(getLanguageAttribute(xmlPullParser), xmlPullParser.nextText());
        return map;
    }

    public static CharSequence parseElement(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        return parseElement(xmlPullParser, false);
    }

    public static String parseElementText(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String str = "";
        if (!xmlPullParser.isEmptyElementTag()) {
            int next = xmlPullParser.next();
            if (next == 4) {
                str = xmlPullParser.getText();
                if (xmlPullParser.next() != 3) {
                    throw new XmlPullParserException("Non-empty element tag contains child-elements, while Mixed Content (XML 3.2.2) is disallowed");
                }
            } else if (next == 3) {
                return str;
            } else {
                throw new XmlPullParserException("Non-empty element tag not followed by text, while Mixed Content (XML 3.2.2) is disallowed");
            }
        }
        return str;
    }

    public static XMPPError parseError(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException, SmackException {
        int depth = xmlPullParser.getDepth();
        ArrayList arrayList = new ArrayList();
        String str = "";
        XMPPError.Type fromString = XMPPError.Type.fromString(xmlPullParser.getAttributeValue(str, "type"));
        String attributeValue = xmlPullParser.getAttributeValue(str, "by");
        Condition condition = null;
        String str2 = null;
        Map map = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 2) {
                String name = xmlPullParser.getName();
                String namespace = xmlPullParser.getNamespace();
                char c = 0;
                if (((namespace.hashCode() == 888780199 && namespace.equals(XMPPError.NAMESPACE)) ? (char) 0 : 65535) != 0) {
                    addExtensionElement((Collection<ExtensionElement>) arrayList, xmlPullParser, name, namespace);
                } else {
                    if (name.hashCode() != 3556653 || !name.equals("text")) {
                        c = 65535;
                    }
                    if (c != 0) {
                        condition = Condition.fromString(name);
                        if (!xmlPullParser.isEmptyElementTag()) {
                            str2 = xmlPullParser.nextText();
                        }
                    } else {
                        map = parseDescriptiveTexts(xmlPullParser, map);
                    }
                }
            } else if (next == 3 && xmlPullParser.getDepth() == depth) {
                XMPPError xMPPError = new XMPPError(condition, str2, attributeValue, fromString, map, arrayList);
                return xMPPError;
            }
        }
    }

    public static ExtensionElement parseExtensionElement(String str, String str2, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException, SmackException {
        ParserUtils.assertAtStartTag(xmlPullParser);
        ExtensionElementProvider extensionProvider = ProviderManager.getExtensionProvider(str, str2);
        if (extensionProvider != null) {
            return (ExtensionElement) extensionProvider.parse(xmlPullParser);
        }
        int depth = xmlPullParser.getDepth();
        DefaultExtensionElement defaultExtensionElement = new DefaultExtensionElement(str, str2);
        while (true) {
            int next = xmlPullParser.next();
            if (next == 2) {
                String name = xmlPullParser.getName();
                if (xmlPullParser.isEmptyElementTag()) {
                    defaultExtensionElement.setValue(name, "");
                } else if (xmlPullParser.next() == 4) {
                    defaultExtensionElement.setValue(name, xmlPullParser.getText());
                }
            } else if (next == 3 && xmlPullParser.getDepth() == depth) {
                return defaultExtensionElement;
            }
        }
    }

    public static C15617IQ parseIQ(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException, SmackException {
        ParserUtils.assertAtStartTag(xmlPullParser);
        int depth = xmlPullParser.getDepth();
        String str = "";
        String attributeValue = xmlPullParser.getAttributeValue(str, "id");
        String attributeValue2 = xmlPullParser.getAttributeValue(str, "to");
        String attributeValue3 = xmlPullParser.getAttributeValue(str, PrivacyItem.SUBSCRIPTION_FROM);
        Type fromString = Type.fromString(xmlPullParser.getAttributeValue(str, "type"));
        C15617IQ iq = null;
        XMPPError xMPPError = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next != 2) {
                if (next == 3 && xmlPullParser.getDepth() == depth) {
                    break;
                }
            } else {
                String name = xmlPullParser.getName();
                String namespace = xmlPullParser.getNamespace();
                char c = 65535;
                if (name.hashCode() == 96784904 && name.equals("error")) {
                    c = 0;
                }
                if (c != 0) {
                    IQProvider iQProvider = ProviderManager.getIQProvider(name, namespace);
                    if (iQProvider != null) {
                        iq = (C15617IQ) iQProvider.parse(xmlPullParser);
                    } else {
                        iq = new UnparsedIQ(name, namespace, parseElement(xmlPullParser));
                    }
                } else {
                    xMPPError = parseError(xmlPullParser);
                }
            }
        }
        if (iq == null) {
            int i = C156421.$SwitchMap$org$jivesoftware$smack$packet$IQ$Type[fromString.ordinal()];
            if (i == 1) {
                iq = new ErrorIQ(xMPPError);
            } else if (i == 2) {
                iq = new EmptyResultIQ();
            }
        }
        iq.setStanzaId(attributeValue);
        iq.setTo(attributeValue2);
        iq.setFrom(attributeValue3);
        iq.setType(fromString);
        iq.setError(xMPPError);
        return iq;
    }

    public static Collection<String> parseMechanisms(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        while (!z) {
            int next = xmlPullParser.next();
            if (next == 2) {
                if (xmlPullParser.getName().equals("mechanism")) {
                    arrayList.add(xmlPullParser.nextText());
                }
            } else if (next == 3 && xmlPullParser.getName().equals(Mechanisms.ELEMENT)) {
                z = true;
            }
        }
        return arrayList;
    }

    public static Message parseMessage(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException, SmackException {
        ParserUtils.assertAtStartTag(xmlPullParser);
        int depth = xmlPullParser.getDepth();
        Message message = new Message();
        String str = "";
        message.setStanzaId(xmlPullParser.getAttributeValue(str, "id"));
        message.setTo(xmlPullParser.getAttributeValue(str, "to"));
        message.setFrom(xmlPullParser.getAttributeValue(str, PrivacyItem.SUBSCRIPTION_FROM));
        String attributeValue = xmlPullParser.getAttributeValue(str, "type");
        if (attributeValue != null) {
            message.setType(Message.Type.fromString(attributeValue));
        }
        String languageAttribute = getLanguageAttribute(xmlPullParser);
        if (languageAttribute == null || str.equals(languageAttribute.trim())) {
            languageAttribute = Stanza.getDefaultLanguage();
        } else {
            message.setLanguage(languageAttribute);
        }
        String str2 = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 2) {
                String name = xmlPullParser.getName();
                String namespace = xmlPullParser.getNamespace();
                char c = 65535;
                switch (name.hashCode()) {
                    case -1867885268:
                        if (name.equals("subject")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -874443254:
                        if (name.equals("thread")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 3029410:
                        if (name.equals("body")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 96784904:
                        if (name.equals("error")) {
                            c = 3;
                            break;
                        }
                        break;
                }
                if (c == 0) {
                    String languageAttribute2 = getLanguageAttribute(xmlPullParser);
                    if (languageAttribute2 == null) {
                        languageAttribute2 = languageAttribute;
                    }
                    String parseElementText = parseElementText(xmlPullParser);
                    if (message.getSubject(languageAttribute2) == null) {
                        message.addSubject(languageAttribute2, parseElementText);
                    }
                } else if (c == 1) {
                    String languageAttribute3 = getLanguageAttribute(xmlPullParser);
                    if (languageAttribute3 == null) {
                        languageAttribute3 = languageAttribute;
                    }
                    String parseElementText2 = parseElementText(xmlPullParser);
                    if (message.getBody(languageAttribute3) == null) {
                        message.addBody(languageAttribute3, parseElementText2);
                    }
                } else if (c != 2) {
                    if (c != 3) {
                        addExtensionElement((Stanza) message, xmlPullParser, name, namespace);
                    } else {
                        message.setError(parseError(xmlPullParser));
                    }
                } else if (str2 == null) {
                    str2 = xmlPullParser.nextText();
                }
            } else if (next == 3 && xmlPullParser.getDepth() == depth) {
                message.setThread(str2);
                return message;
            }
        }
    }

    @Deprecated
    public static ExtensionElement parsePacketExtension(String str, String str2, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException, SmackException {
        return parseExtensionElement(str, str2, xmlPullParser);
    }

    public static Presence parsePresence(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException, SmackException {
        ParserUtils.assertAtStartTag(xmlPullParser);
        int depth = xmlPullParser.getDepth();
        Presence.Type type = Presence.Type.available;
        String str = "";
        String attributeValue = xmlPullParser.getAttributeValue(str, "type");
        if (attributeValue != null && !attributeValue.equals(str)) {
            type = Presence.Type.fromString(attributeValue);
        }
        Presence presence = new Presence(type);
        presence.setTo(xmlPullParser.getAttributeValue(str, "to"));
        presence.setFrom(xmlPullParser.getAttributeValue(str, PrivacyItem.SUBSCRIPTION_FROM));
        presence.setStanzaId(xmlPullParser.getAttributeValue(str, "id"));
        String languageAttribute = getLanguageAttribute(xmlPullParser);
        if (languageAttribute != null && !str.equals(languageAttribute.trim())) {
            presence.setLanguage(languageAttribute);
        }
        while (true) {
            int next = xmlPullParser.next();
            if (next == 2) {
                String name = xmlPullParser.getName();
                String namespace = xmlPullParser.getNamespace();
                char c = 65535;
                switch (name.hashCode()) {
                    case -1165461084:
                        if (name.equals(C15096h.f43873a)) {
                            c = 1;
                            break;
                        }
                        break;
                    case -892481550:
                        if (name.equals("status")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 3529469:
                        if (name.equals("show")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 96784904:
                        if (name.equals("error")) {
                            c = 3;
                            break;
                        }
                        break;
                }
                if (c == 0) {
                    presence.setStatus(xmlPullParser.nextText());
                } else if (c == 1) {
                    presence.setPriority(Integer.parseInt(xmlPullParser.nextText()));
                } else if (c == 2) {
                    String nextText = xmlPullParser.nextText();
                    if (StringUtils.isNotEmpty(nextText)) {
                        presence.setMode(Mode.fromString(nextText));
                    } else {
                        Logger logger = LOGGER;
                        StringBuilder sb = new StringBuilder();
                        sb.append("Empty or null mode text in presence show element form ");
                        sb.append(presence.getFrom());
                        sb.append(" with id '");
                        sb.append(presence.getStanzaId());
                        sb.append("' which is invalid according to RFC6121 4.7.2.1");
                        logger.warning(sb.toString());
                    }
                } else if (c != 3) {
                    try {
                        addExtensionElement((Stanza) presence, xmlPullParser, name, namespace);
                    } catch (Exception e) {
                        Logger logger2 = LOGGER;
                        Level level = Level.WARNING;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Failed to parse extension packet in Presence packet. Attributes: from=");
                        sb2.append(presence.getFrom());
                        sb2.append(" id=");
                        sb2.append(presence.getStanzaId());
                        logger2.log(level, sb2.toString(), e);
                    }
                } else {
                    presence.setError(parseError(xmlPullParser));
                }
            } else if (next == 3 && xmlPullParser.getDepth() == depth) {
                return presence;
            }
        }
    }

    public static SASLFailure parseSASLFailure(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth();
        Map map = null;
        String str = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next != 2) {
                if (next == 3 && xmlPullParser.getDepth() == depth) {
                    return new SASLFailure(str, map);
                }
            } else if (xmlPullParser.getName().equals("text")) {
                map = parseDescriptiveTexts(xmlPullParser, map);
            } else {
                str = xmlPullParser.getName();
            }
        }
    }

    public static Session.Feature parseSessionFeature(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        boolean z;
        ParserUtils.assertAtStartTag(xmlPullParser);
        int depth = xmlPullParser.getDepth();
        if (!xmlPullParser.isEmptyElementTag()) {
            z = false;
            while (true) {
                int next = xmlPullParser.next();
                if (next != 2) {
                    if (next == 3 && xmlPullParser.getDepth() == depth) {
                        break;
                    }
                } else {
                    String name = xmlPullParser.getName();
                    char c = 65535;
                    if (name.hashCode() == -79017120 && name.equals(Session.Feature.OPTIONAL_ELEMENT)) {
                        c = 0;
                    }
                    if (c == 0) {
                        z = true;
                    }
                }
            }
        } else {
            z = false;
        }
        return new Session.Feature(z);
    }

    public static Stanza parseStanza(String str) throws XmlPullParserException, IOException, SmackException {
        return parseStanza(getParserFor(str));
    }

    public static StartTls parseStartTlsFeature(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth();
        boolean z = false;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 2) {
                String name = xmlPullParser.getName();
                char c = 65535;
                if (name.hashCode() == -393139297 && name.equals("required")) {
                    c = 0;
                }
                if (c == 0) {
                    z = true;
                }
            } else if (next == 3 && xmlPullParser.getDepth() == depth) {
                return new StartTls(z);
            }
        }
    }

    public static StreamError parseStreamError(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException, SmackException {
        int depth = xmlPullParser.getDepth();
        ArrayList arrayList = new ArrayList();
        StreamError.Condition condition = null;
        String str = null;
        Map map = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 2) {
                String name = xmlPullParser.getName();
                String namespace = xmlPullParser.getNamespace();
                char c = 0;
                if (((namespace.hashCode() == 904188284 && namespace.equals(StreamError.NAMESPACE)) ? (char) 0 : 65535) != 0) {
                    addExtensionElement((Collection<ExtensionElement>) arrayList, xmlPullParser, name, namespace);
                } else {
                    if (name.hashCode() != 3556653 || !name.equals("text")) {
                        c = 65535;
                    }
                    if (c != 0) {
                        condition = StreamError.Condition.fromString(name);
                        if (!xmlPullParser.isEmptyElementTag()) {
                            str = xmlPullParser.nextText();
                        }
                    } else {
                        map = parseDescriptiveTexts(xmlPullParser, map);
                    }
                }
            } else if (next == 3 && xmlPullParser.getDepth() == depth) {
                return new StreamError(condition, str, map, arrayList);
            }
        }
    }

    @Deprecated
    public static void addPacketExtension(Stanza stanza, XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException, SmackException {
        addExtensionElement(stanza, xmlPullParser, str, str2);
    }

    public static XmlPullParser getParserFor(Reader reader) throws XmlPullParserException, IOException {
        XmlPullParser newXmppParser = newXmppParser(reader);
        int eventType = newXmppParser.getEventType();
        while (eventType != 2) {
            if (eventType != 1) {
                eventType = newXmppParser.next();
            } else {
                throw new IllegalArgumentException("Document contains no start tag");
            }
        }
        return newXmppParser;
    }

    public static CharSequence parseContentDepth(XmlPullParser xmlPullParser, int i, boolean z) throws XmlPullParserException, IOException {
        if (xmlPullParser.getFeature(FEATURE_XML_ROUNDTRIP)) {
            return parseContentDepthWithRoundtrip(xmlPullParser, i, z);
        }
        return parseContentDepthWithoutRoundtrip(xmlPullParser, i, z);
    }

    public static CharSequence parseElement(XmlPullParser xmlPullParser, boolean z) throws XmlPullParserException, IOException {
        return parseContentDepth(xmlPullParser, xmlPullParser.getDepth(), z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0062  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.jivesoftware.smack.packet.Stanza parseStanza(org.xmlpull.v1.XmlPullParser r5) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException, org.jivesoftware.smack.SmackException {
        /*
            org.jivesoftware.smack.util.ParserUtils.assertAtStartTag(r5)
            java.lang.String r0 = r5.getName()
            int r1 = r0.hashCode()
            r2 = -1276666629(0xffffffffb3e79cfb, float:-1.078533E-7)
            r3 = 2
            r4 = 1
            if (r1 == r2) goto L_0x0030
            r2 = 3368(0xd28, float:4.72E-42)
            if (r1 == r2) goto L_0x0026
            r2 = 954925063(0x38eb0007, float:1.1205678E-4)
            if (r1 == r2) goto L_0x001c
            goto L_0x003a
        L_0x001c:
            java.lang.String r1 = "message"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x003a
            r1 = 0
            goto L_0x003b
        L_0x0026:
            java.lang.String r1 = "iq"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x003a
            r1 = 1
            goto L_0x003b
        L_0x0030:
            java.lang.String r1 = "presence"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x003a
            r1 = 2
            goto L_0x003b
        L_0x003a:
            r1 = -1
        L_0x003b:
            if (r1 == 0) goto L_0x0062
            if (r1 == r4) goto L_0x005d
            if (r1 != r3) goto L_0x0046
            org.jivesoftware.smack.packet.Presence r5 = parsePresence(r5)
            return r5
        L_0x0046:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Can only parse message, iq or presence, not "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r5.<init>(r0)
            throw r5
        L_0x005d:
            org.jivesoftware.smack.packet.IQ r5 = parseIQ(r5)
            return r5
        L_0x0062:
            org.jivesoftware.smack.packet.Message r5 = parseMessage(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smack.util.PacketParserUtils.parseStanza(org.xmlpull.v1.XmlPullParser):org.jivesoftware.smack.packet.Stanza");
    }

    public static void addExtensionElement(Stanza stanza, XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException, SmackException {
        stanza.addExtension(parseExtensionElement(str, str2, xmlPullParser));
    }

    @Deprecated
    public static void addPacketExtension(Collection<ExtensionElement> collection, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException, SmackException {
        addExtensionElement(collection, xmlPullParser, xmlPullParser.getName(), xmlPullParser.getNamespace());
    }

    @Deprecated
    public static void addPacketExtension(Collection<ExtensionElement> collection, XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException, SmackException {
        addExtensionElement(collection, xmlPullParser, str, str2);
    }

    public static void addExtensionElement(Collection<ExtensionElement> collection, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException, SmackException {
        addExtensionElement(collection, xmlPullParser, xmlPullParser.getName(), xmlPullParser.getNamespace());
    }

    public static void addExtensionElement(Collection<ExtensionElement> collection, XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException, SmackException {
        collection.add(parseExtensionElement(str, str2, xmlPullParser));
    }

    public static XmlPullParser getParserFor(String str, String str2) throws XmlPullParserException, IOException {
        XmlPullParser parserFor = getParserFor(str);
        while (true) {
            int eventType = parserFor.getEventType();
            String name = parserFor.getName();
            if (eventType == 2 && name.equals(str2)) {
                return parserFor;
            }
            if (eventType != 1) {
                parserFor.next();
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Could not find start tag '");
                sb.append(str2);
                sb.append("' in stanza: ");
                sb.append(str);
                throw new IllegalArgumentException(sb.toString());
            }
        }
    }

    public static XmlPullParser newXmppParser(Reader reader) throws XmlPullParserException {
        XmlPullParser newXmppParser = newXmppParser();
        newXmppParser.setInput(reader);
        return newXmppParser;
    }
}
