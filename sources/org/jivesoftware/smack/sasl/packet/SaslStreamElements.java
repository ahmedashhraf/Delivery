package org.jivesoftware.smack.sasl.packet;

import java.util.Map;
import org.jivesoftware.smack.packet.AbstractError;
import org.jivesoftware.smack.packet.PlainStreamElement;
import org.jivesoftware.smack.sasl.SASLError;
import org.jivesoftware.smack.util.Objects;
import org.jivesoftware.smack.util.StringUtils;
import org.jivesoftware.smack.util.XmlStringBuilder;

public class SaslStreamElements {
    public static final String NAMESPACE = "urn:ietf:params:xml:ns:xmpp-sasl";

    public static class AuthMechanism implements PlainStreamElement {
        public static final String ELEMENT = "auth";
        private final String authenticationText;
        private final String mechanism;

        public AuthMechanism(String str, String str2) {
            this.mechanism = (String) Objects.requireNonNull(str, "SASL mechanism shouldn't be null.");
            this.authenticationText = (String) StringUtils.requireNotNullOrEmpty(str2, "SASL authenticationText must not be null or empty (RFC6120 6.4.2)");
        }

        public String getAuthenticationText() {
            return this.authenticationText;
        }

        public String getMechanism() {
            return this.mechanism;
        }

        public XmlStringBuilder toXML() {
            XmlStringBuilder xmlStringBuilder = new XmlStringBuilder();
            String str = ELEMENT;
            xmlStringBuilder.halfOpenElement(str).xmlnsAttribute("urn:ietf:params:xml:ns:xmpp-sasl").attribute("mechanism", this.mechanism).rightAngleBracket();
            xmlStringBuilder.optAppend((CharSequence) this.authenticationText);
            xmlStringBuilder.closeElement(str);
            return xmlStringBuilder;
        }
    }

    public static class Challenge implements PlainStreamElement {
        public static final String ELEMENT = "challenge";
        private final String data;

        public Challenge(String str) {
            this.data = StringUtils.returnIfNotEmptyTrimmed(str);
        }

        public XmlStringBuilder toXML() {
            XmlStringBuilder xmlStringBuilder = new XmlStringBuilder();
            String str = ELEMENT;
            XmlStringBuilder rightAngleBracket = xmlStringBuilder.halfOpenElement(str).xmlnsAttribute("urn:ietf:params:xml:ns:xmpp-sasl").rightAngleBracket();
            rightAngleBracket.optAppend((CharSequence) this.data);
            rightAngleBracket.closeElement(str);
            return rightAngleBracket;
        }
    }

    public static class Response implements PlainStreamElement {
        public static final String ELEMENT = "response";
        private final String authenticationText;

        public Response() {
            this.authenticationText = null;
        }

        public String getAuthenticationText() {
            return this.authenticationText;
        }

        public XmlStringBuilder toXML() {
            XmlStringBuilder xmlStringBuilder = new XmlStringBuilder();
            String str = "response";
            xmlStringBuilder.halfOpenElement(str).xmlnsAttribute("urn:ietf:params:xml:ns:xmpp-sasl").rightAngleBracket();
            xmlStringBuilder.optAppend((CharSequence) this.authenticationText);
            xmlStringBuilder.closeElement(str);
            return xmlStringBuilder;
        }

        public Response(String str) {
            this.authenticationText = StringUtils.returnIfNotEmptyTrimmed(str);
        }
    }

    public static class SASLFailure extends AbstractError implements PlainStreamElement {
        public static final String ELEMENT = "failure";
        private final SASLError saslError;
        private final String saslErrorString;

        public SASLFailure(String str) {
            this(str, null);
        }

        public SASLError getSASLError() {
            return this.saslError;
        }

        public String getSASLErrorString() {
            return this.saslErrorString;
        }

        public String toString() {
            return toXML().toString();
        }

        public SASLFailure(String str, Map<String, String> map) {
            super(map);
            SASLError fromString = SASLError.fromString(str);
            if (fromString == null) {
                this.saslError = SASLError.not_authorized;
            } else {
                this.saslError = fromString;
            }
            this.saslErrorString = str;
        }

        public XmlStringBuilder toXML() {
            XmlStringBuilder xmlStringBuilder = new XmlStringBuilder();
            String str = ELEMENT;
            xmlStringBuilder.halfOpenElement(str).xmlnsAttribute("urn:ietf:params:xml:ns:xmpp-sasl").rightAngleBracket();
            xmlStringBuilder.emptyElement(this.saslErrorString);
            addDescriptiveTextsAndExtensions(xmlStringBuilder);
            xmlStringBuilder.closeElement(str);
            return xmlStringBuilder;
        }
    }

    public static class Success implements PlainStreamElement {
        public static final String ELEMENT = "success";
        private final String data;

        public Success(String str) {
            this.data = StringUtils.returnIfNotEmptyTrimmed(str);
        }

        public String getData() {
            return this.data;
        }

        public XmlStringBuilder toXML() {
            XmlStringBuilder xmlStringBuilder = new XmlStringBuilder();
            String str = "success";
            xmlStringBuilder.halfOpenElement(str).xmlnsAttribute("urn:ietf:params:xml:ns:xmpp-sasl").rightAngleBracket();
            xmlStringBuilder.optAppend((CharSequence) this.data);
            xmlStringBuilder.closeElement(str);
            return xmlStringBuilder;
        }
    }
}
