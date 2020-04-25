package org.jivesoftware.smack.filter;

import org.jivesoftware.smack.packet.C15617IQ;
import org.jivesoftware.smack.packet.C15617IQ.Type;
import org.jivesoftware.smack.util.Objects;

public class IQTypeFilter extends FlexibleStanzaTypeFilter<C15617IQ> {
    public static final StanzaFilter ERROR = new IQTypeFilter(Type.error);
    public static final StanzaFilter GET = new IQTypeFilter(Type.get);
    public static final StanzaFilter GET_OR_SET = new OrFilter(GET, SET);
    public static final StanzaFilter RESULT = new IQTypeFilter(Type.result);
    public static final StanzaFilter SET = new IQTypeFilter(Type.set);
    private final Type type;

    private IQTypeFilter(Type type2) {
        super(C15617IQ.class);
        this.type = (Type) Objects.requireNonNull(type2, "Type must not be null");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(IQTypeFilter.class.getSimpleName());
        sb.append(": type=");
        sb.append(this.type);
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public boolean acceptSpecific(C15617IQ iq) {
        return iq.getType() == this.type;
    }
}
