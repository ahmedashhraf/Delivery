package org.jivesoftware.smack.util;

import java.util.Collection;
import kotlin.p217i1.C14662d0;
import org.jivesoftware.smack.packet.Element;
import org.jivesoftware.smack.packet.ExtensionElement;
import org.jivesoftware.smack.packet.NamedElement;

public class XmlStringBuilder implements Appendable, CharSequence {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String RIGHT_ANGLE_BRACKET = Character.toString(C14662d0.f42854e);

    /* renamed from: sb */
    private final LazyStringBuilder f44992sb;

    static {
        Class<XmlStringBuilder> cls = XmlStringBuilder.class;
    }

    public XmlStringBuilder() {
        this.f44992sb = new LazyStringBuilder();
    }

    public XmlStringBuilder attribute(String str, String str2) {
        this.f44992sb.append(' ').append((CharSequence) str).append((CharSequence) "='");
        escape(str2);
        this.f44992sb.append('\'');
        return this;
    }

    public char charAt(int i) {
        return this.f44992sb.charAt(i);
    }

    public XmlStringBuilder closeElement(String str) {
        this.f44992sb.append((CharSequence) "</").append((CharSequence) str);
        rightAngleBracket();
        return this;
    }

    public XmlStringBuilder closeEmptyElement() {
        this.f44992sb.append((CharSequence) "/>");
        return this;
    }

    public XmlStringBuilder condAttribute(boolean z, String str, String str2) {
        if (z) {
            attribute(str, str2);
        }
        return this;
    }

    public XmlStringBuilder condEmptyElement(boolean z, String str) {
        if (z) {
            emptyElement(str);
        }
        return this;
    }

    public XmlStringBuilder element(String str, String str2) {
        openElement(str);
        escape(str2);
        closeElement(str);
        return this;
    }

    public XmlStringBuilder emptyElement(Enum<?> enumR) {
        return emptyElement(enumR.name());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CharSequence)) {
            return false;
        }
        return toString().equals(((CharSequence) obj).toString());
    }

    public XmlStringBuilder escape(String str) {
        this.f44992sb.append(StringUtils.escapeForXML(str));
        return this;
    }

    public XmlStringBuilder escapedElement(String str, String str2) {
        openElement(str);
        append((CharSequence) str2);
        closeElement(str);
        return this;
    }

    public XmlStringBuilder halfOpenElement(String str) {
        this.f44992sb.append((char) C14662d0.f42853d).append((CharSequence) str);
        return this;
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public int length() {
        return this.f44992sb.length();
    }

    public XmlStringBuilder openElement(String str) {
        halfOpenElement(str).rightAngleBracket();
        return this;
    }

    public XmlStringBuilder optAppend(CharSequence charSequence) {
        if (charSequence != null) {
            append(charSequence);
        }
        return this;
    }

    public XmlStringBuilder optAttribute(String str, String str2) {
        if (str2 != null) {
            attribute(str, str2);
        }
        return this;
    }

    public XmlStringBuilder optBooleanAttribute(String str, boolean z) {
        if (z) {
            this.f44992sb.append(' ').append((CharSequence) str).append((CharSequence) "='true'");
        }
        return this;
    }

    public XmlStringBuilder optElement(String str, String str2) {
        if (str2 != null) {
            element(str, str2);
        }
        return this;
    }

    public XmlStringBuilder optIntAttribute(String str, int i) {
        if (i >= 0) {
            attribute(str, Integer.toString(i));
        }
        return this;
    }

    public XmlStringBuilder optIntElement(String str, int i) {
        if (i >= 0) {
            element(str, String.valueOf(i));
        }
        return this;
    }

    public XmlStringBuilder optLongAttribute(String str, Long l) {
        if (l != null && l.longValue() >= 0) {
            attribute(str, Long.toString(l.longValue()));
        }
        return this;
    }

    public XmlStringBuilder prelude(ExtensionElement extensionElement) {
        return prelude(extensionElement.getElementName(), extensionElement.getNamespace());
    }

    @Deprecated
    public XmlStringBuilder rightAngelBracket() {
        return rightAngleBracket();
    }

    public XmlStringBuilder rightAngleBracket() {
        this.f44992sb.append((CharSequence) RIGHT_ANGLE_BRACKET);
        return this;
    }

    public CharSequence subSequence(int i, int i2) {
        return this.f44992sb.subSequence(i, i2);
    }

    public String toString() {
        return this.f44992sb.toString();
    }

    public XmlStringBuilder xmllangAttribute(String str) {
        optAttribute("xml:lang", str);
        return this;
    }

    public XmlStringBuilder xmlnsAttribute(String str) {
        optAttribute("xmlns", str);
        return this;
    }

    public XmlStringBuilder emptyElement(String str) {
        halfOpenElement(str);
        return closeEmptyElement();
    }

    public XmlStringBuilder halfOpenElement(NamedElement namedElement) {
        return halfOpenElement(namedElement.getElementName());
    }

    public XmlStringBuilder optAppend(Element element) {
        if (element != null) {
            append(element.toXML());
        }
        return this;
    }

    public XmlStringBuilder optAttribute(String str, Enum<?> enumR) {
        if (enumR != null) {
            attribute(str, enumR.toString());
        }
        return this;
    }

    public XmlStringBuilder optElement(Element element) {
        if (element != null) {
            append(element.toXML());
        }
        return this;
    }

    public XmlStringBuilder prelude(String str, String str2) {
        halfOpenElement(str);
        xmlnsAttribute(str2);
        return this;
    }

    public XmlStringBuilder(ExtensionElement extensionElement) {
        this();
        prelude(extensionElement);
    }

    public XmlStringBuilder closeElement(NamedElement namedElement) {
        closeElement(namedElement.getElementName());
        return this;
    }

    public XmlStringBuilder optElement(String str, Enum<?> enumR) {
        if (enumR != null) {
            element(str, enumR);
        }
        return this;
    }

    public XmlStringBuilder append(XmlStringBuilder xmlStringBuilder) {
        this.f44992sb.append(xmlStringBuilder.f44992sb);
        return this;
    }

    public XmlStringBuilder attribute(String str, Enum<?> enumR) {
        attribute(str, enumR.name());
        return this;
    }

    public XmlStringBuilder element(String str, Enum<?> enumR) {
        element(str, enumR.name());
        return this;
    }

    public XmlStringBuilder(NamedElement namedElement) {
        this();
        halfOpenElement(namedElement.getElementName());
    }

    public XmlStringBuilder append(Collection<? extends Element> collection) {
        for (Element xml : collection) {
            append(xml.toXML());
        }
        return this;
    }

    public XmlStringBuilder attribute(String str, int i) {
        return attribute(str, String.valueOf(i));
    }

    public XmlStringBuilder element(Element element) {
        return append(element.toXML());
    }

    public XmlStringBuilder append(CharSequence charSequence) {
        this.f44992sb.append(charSequence);
        return this;
    }

    public XmlStringBuilder append(CharSequence charSequence, int i, int i2) {
        this.f44992sb.append(charSequence, i, i2);
        return this;
    }

    public XmlStringBuilder append(char c) {
        this.f44992sb.append(c);
        return this;
    }
}
