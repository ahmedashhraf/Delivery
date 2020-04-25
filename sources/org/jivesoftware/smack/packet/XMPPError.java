package org.jivesoftware.smack.packet;

import com.mrsool.utils.C11644i;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import org.jivesoftware.smack.util.StringUtils;
import org.jivesoftware.smack.util.XmlStringBuilder;

public class XMPPError extends AbstractError {
    private static final Map<Condition, Type> CONDITION_TO_TYPE = new HashMap();
    public static final String ERROR = "error";
    private static final Logger LOGGER = Logger.getLogger(XMPPError.class.getName());
    public static final String NAMESPACE = "urn:ietf:params:xml:ns:xmpp-stanzas";
    private final Condition condition;
    private final String conditionText;
    private final String errorGenerator;
    private final Type type;

    /* renamed from: org.jivesoftware.smack.packet.XMPPError$1 */
    static /* synthetic */ class C156221 {
        static final /* synthetic */ int[] $SwitchMap$org$jivesoftware$smack$packet$XMPPError$Condition = new int[Condition.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                org.jivesoftware.smack.packet.XMPPError$Condition[] r0 = org.jivesoftware.smack.packet.XMPPError.Condition.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$org$jivesoftware$smack$packet$XMPPError$Condition = r0
                int[] r0 = $SwitchMap$org$jivesoftware$smack$packet$XMPPError$Condition     // Catch:{ NoSuchFieldError -> 0x0014 }
                org.jivesoftware.smack.packet.XMPPError$Condition r1 = org.jivesoftware.smack.packet.XMPPError.Condition.gone     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = $SwitchMap$org$jivesoftware$smack$packet$XMPPError$Condition     // Catch:{ NoSuchFieldError -> 0x001f }
                org.jivesoftware.smack.packet.XMPPError$Condition r1 = org.jivesoftware.smack.packet.XMPPError.Condition.redirect     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smack.packet.XMPPError.C156221.<clinit>():void");
        }
    }

    public enum Condition {
        bad_request,
        conflict,
        feature_not_implemented,
        forbidden,
        gone,
        internal_server_error,
        item_not_found,
        jid_malformed,
        not_acceptable,
        not_allowed,
        not_authorized,
        policy_violation,
        recipient_unavailable,
        redirect,
        registration_required,
        remote_server_not_found,
        remote_server_timeout,
        resource_constraint,
        service_unavailable,
        subscription_required,
        undefined_condition,
        unexpected_request;

        public static Condition fromString(String str) {
            if ("xml-not-well-formed".equals(str)) {
                str = "not-well-formed";
            }
            String replace = str.replace('-', '_');
            try {
                return valueOf(replace);
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Could not transform string '");
                sb.append(replace);
                sb.append("' to XMPPErrorCondition");
                throw new IllegalStateException(sb.toString(), e);
            }
        }

        public String toString() {
            return name().replace('_', '-');
        }
    }

    public enum Type {
        WAIT,
        CANCEL,
        MODIFY,
        AUTH,
        CONTINUE;

        public static Type fromString(String str) {
            return valueOf(str.toUpperCase());
        }

        public String toString() {
            return name().toLowerCase();
        }
    }

    static {
        CONDITION_TO_TYPE.put(Condition.bad_request, Type.MODIFY);
        CONDITION_TO_TYPE.put(Condition.conflict, Type.CANCEL);
        CONDITION_TO_TYPE.put(Condition.feature_not_implemented, Type.CANCEL);
        CONDITION_TO_TYPE.put(Condition.forbidden, Type.AUTH);
        CONDITION_TO_TYPE.put(Condition.gone, Type.CANCEL);
        CONDITION_TO_TYPE.put(Condition.internal_server_error, Type.CANCEL);
        CONDITION_TO_TYPE.put(Condition.item_not_found, Type.CANCEL);
        CONDITION_TO_TYPE.put(Condition.jid_malformed, Type.MODIFY);
        CONDITION_TO_TYPE.put(Condition.not_acceptable, Type.MODIFY);
        CONDITION_TO_TYPE.put(Condition.not_allowed, Type.CANCEL);
        CONDITION_TO_TYPE.put(Condition.not_authorized, Type.AUTH);
        CONDITION_TO_TYPE.put(Condition.policy_violation, Type.MODIFY);
        CONDITION_TO_TYPE.put(Condition.recipient_unavailable, Type.WAIT);
        CONDITION_TO_TYPE.put(Condition.redirect, Type.MODIFY);
        CONDITION_TO_TYPE.put(Condition.registration_required, Type.AUTH);
        CONDITION_TO_TYPE.put(Condition.remote_server_not_found, Type.CANCEL);
        CONDITION_TO_TYPE.put(Condition.remote_server_timeout, Type.WAIT);
        CONDITION_TO_TYPE.put(Condition.resource_constraint, Type.WAIT);
        CONDITION_TO_TYPE.put(Condition.service_unavailable, Type.WAIT);
        CONDITION_TO_TYPE.put(Condition.subscription_required, Type.WAIT);
        CONDITION_TO_TYPE.put(Condition.unexpected_request, Type.MODIFY);
    }

    public XMPPError(Condition condition2) {
        this(condition2, null, null, null, null, null);
    }

    public static XMPPError from(Condition condition2, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(C11644i.f33183R5, str);
        XMPPError xMPPError = new XMPPError(condition2, null, null, null, hashMap, null);
        return xMPPError;
    }

    public Condition getCondition() {
        return this.condition;
    }

    public String getConditionText() {
        return this.conditionText;
    }

    public String getErrorGenerator() {
        return this.errorGenerator;
    }

    public Type getType() {
        return this.type;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("XMPPError: ");
        sb.append(this.condition.toString());
        sb.append(" - ");
        sb.append(this.type.toString());
        if (this.errorGenerator != null) {
            sb.append(". Generated by ");
            sb.append(this.errorGenerator);
        }
        return sb.toString();
    }

    public XmlStringBuilder toXML() {
        XmlStringBuilder xmlStringBuilder = new XmlStringBuilder();
        String str = "error";
        xmlStringBuilder.halfOpenElement(str);
        xmlStringBuilder.attribute("type", this.type.toString());
        xmlStringBuilder.optAttribute("by", this.errorGenerator);
        xmlStringBuilder.rightAngleBracket();
        xmlStringBuilder.halfOpenElement(this.condition.toString());
        xmlStringBuilder.xmlnsAttribute(NAMESPACE);
        if (this.conditionText != null) {
            xmlStringBuilder.rightAngleBracket();
            xmlStringBuilder.escape(this.conditionText);
            xmlStringBuilder.closeElement(this.condition.toString());
        } else {
            xmlStringBuilder.closeEmptyElement();
        }
        addDescriptiveTextsAndExtensions(xmlStringBuilder);
        xmlStringBuilder.closeElement(str);
        return xmlStringBuilder;
    }

    public XMPPError(Condition condition2, ExtensionElement extensionElement) {
        Condition condition3 = condition2;
        this(condition3, null, null, null, null, Arrays.asList(new ExtensionElement[]{extensionElement}));
    }

    public XMPPError(Condition condition2, String str, String str2, Type type2, Map<String, String> map, List<ExtensionElement> list) {
        super(map, NAMESPACE, list);
        this.condition = condition2;
        if (StringUtils.isNullOrEmpty(str)) {
            str = null;
        }
        if (str != null) {
            int i = C156221.$SwitchMap$org$jivesoftware$smack$packet$XMPPError$Condition[condition2.ordinal()];
            if (!(i == 1 || i == 2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Condition text can only be set with condtion types 'gone' and 'redirect', not ");
                sb.append(condition2);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        this.conditionText = str;
        this.errorGenerator = str2;
        if (type2 == null) {
            Type type3 = (Type) CONDITION_TO_TYPE.get(condition2);
            if (type3 == null) {
                Logger logger = LOGGER;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Could not determine type for condition: ");
                sb2.append(condition2);
                logger.warning(sb2.toString());
                type3 = Type.CANCEL;
            }
            this.type = type3;
            return;
        }
        this.type = type2;
    }
}
