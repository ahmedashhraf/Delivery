package org.jivesoftware.smack.packet;

import java.util.List;
import java.util.Map;
import org.jivesoftware.smack.util.StringUtils;
import org.jivesoftware.smack.util.XmlStringBuilder;

public class StreamError extends AbstractError implements PlainStreamElement {
    public static final String ELEMENT = "stream:error";
    public static final String NAMESPACE = "urn:ietf:params:xml:ns:xmpp-streams";
    private final Condition condition;
    private final String conditionText;

    /* renamed from: org.jivesoftware.smack.packet.StreamError$1 */
    static /* synthetic */ class C156201 {
        static final /* synthetic */ int[] $SwitchMap$org$jivesoftware$smack$packet$StreamError$Condition = new int[Condition.values().length];

        static {
            try {
                $SwitchMap$org$jivesoftware$smack$packet$StreamError$Condition[Condition.see_other_host.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public enum Condition {
        bad_format,
        bad_namespace_prefix,
        conflict,
        connection_timeout,
        host_gone,
        host_unknown,
        improper_addressing,
        internal_server_error,
        invalid_from,
        invalid_namespace,
        invalid_xml,
        not_authorized,
        not_well_formed,
        policy_violation,
        remote_connection_failed,
        reset,
        resource_constraint,
        restricted_xml,
        see_other_host,
        system_shutdown,
        undeficed_condition,
        unsupported_encoding,
        unsupported_feature,
        unsupported_stanza_type,
        unsupported_version;

        public static Condition fromString(String str) {
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

    public StreamError(Condition condition2, String str, Map<String, String> map, List<ExtensionElement> list) {
        super(map, list);
        if (StringUtils.isNullOrEmpty(str)) {
            str = null;
        }
        if (str == null || C156201.$SwitchMap$org$jivesoftware$smack$packet$StreamError$Condition[condition2.ordinal()] == 1) {
            this.condition = condition2;
            this.conditionText = str;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("The given condition '");
        sb.append(condition2);
        sb.append("' can not contain a conditionText");
        throw new IllegalArgumentException(sb.toString());
    }

    public Condition getCondition() {
        return this.condition;
    }

    public String getConditionText() {
        return this.conditionText;
    }

    public String toString() {
        return toXML().toString();
    }

    public XmlStringBuilder toXML() {
        XmlStringBuilder xmlStringBuilder = new XmlStringBuilder();
        String str = ELEMENT;
        xmlStringBuilder.openElement(str);
        xmlStringBuilder.halfOpenElement(this.condition.toString()).xmlnsAttribute(NAMESPACE).closeEmptyElement();
        addDescriptiveTextsAndExtensions(xmlStringBuilder);
        xmlStringBuilder.closeElement(str);
        return xmlStringBuilder;
    }
}
