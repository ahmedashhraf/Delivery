package org.jivesoftware.smack.packet;

import java.util.Locale;
import org.apache.commons.logging.C15096h;
import org.jivesoftware.smack.packet.p556id.StanzaIdUtil;
import org.jivesoftware.smack.util.Objects;
import org.jivesoftware.smack.util.TypedCloneable;
import org.jivesoftware.smack.util.XmlStringBuilder;

public final class Presence extends Stanza implements TypedCloneable<Presence> {
    public static final String ELEMENT = "presence";
    private Mode mode = null;
    private int priority = Integer.MIN_VALUE;
    private String status = null;
    private Type type = Type.available;

    public enum Mode {
        chat,
        available,
        away,
        xa,
        dnd;

        public static Mode fromString(String str) {
            return valueOf(str.toLowerCase(Locale.US));
        }
    }

    public enum Type {
        available,
        unavailable,
        subscribe,
        subscribed,
        unsubscribe,
        unsubscribed,
        error,
        probe;

        public static Type fromString(String str) {
            return valueOf(str.toLowerCase(Locale.US));
        }
    }

    public Presence(Type type2) {
        setType(type2);
    }

    public Presence cloneWithNewId() {
        Presence clone = clone();
        clone.setStanzaId(StanzaIdUtil.newStanzaId());
        return clone;
    }

    public Mode getMode() {
        Mode mode2 = this.mode;
        return mode2 == null ? Mode.available : mode2;
    }

    public int getPriority() {
        return this.priority;
    }

    public String getStatus() {
        return this.status;
    }

    public Type getType() {
        return this.type;
    }

    public boolean isAvailable() {
        return this.type == Type.available;
    }

    public boolean isAway() {
        if (this.type == Type.available) {
            Mode mode2 = this.mode;
            if (mode2 == Mode.away || mode2 == Mode.xa || mode2 == Mode.dnd) {
                return true;
            }
        }
        return false;
    }

    public void setMode(Mode mode2) {
        this.mode = mode2;
    }

    public void setPriority(int i) {
        if (i < -128 || i > 128) {
            StringBuilder sb = new StringBuilder();
            sb.append("Priority value ");
            sb.append(i);
            sb.append(" is not valid. Valid range is -128 through 128.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.priority = i;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public void setType(Type type2) {
        this.type = (Type) Objects.requireNonNull(type2, "Type cannot be null");
    }

    public Presence clone() {
        return new Presence(this);
    }

    public XmlStringBuilder toXML() {
        XmlStringBuilder xmlStringBuilder = new XmlStringBuilder();
        String str = ELEMENT;
        xmlStringBuilder.halfOpenElement(str);
        addCommonAttributes(xmlStringBuilder);
        Type type2 = this.type;
        if (type2 != Type.available) {
            xmlStringBuilder.attribute("type", (Enum<?>) type2);
        }
        xmlStringBuilder.rightAngleBracket();
        xmlStringBuilder.optElement("status", this.status);
        int i = this.priority;
        if (i != Integer.MIN_VALUE) {
            xmlStringBuilder.element(C15096h.f43873a, Integer.toString(i));
        }
        Mode mode2 = this.mode;
        if (!(mode2 == null || mode2 == Mode.available)) {
            xmlStringBuilder.element("show", (Enum<?>) mode2);
        }
        xmlStringBuilder.append(getExtensionsXML());
        appendErrorIfExists(xmlStringBuilder);
        xmlStringBuilder.closeElement(str);
        return xmlStringBuilder;
    }

    public Presence(Type type2, String str, int i, Mode mode2) {
        setType(type2);
        setStatus(str);
        setPriority(i);
        setMode(mode2);
    }

    public Presence(Presence presence) {
        super((Stanza) presence);
        this.type = presence.type;
        this.status = presence.status;
        this.priority = presence.priority;
        this.mode = presence.mode;
    }
}
