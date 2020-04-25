package org.jivesoftware.smackx.amp.packet;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jivesoftware.smack.packet.ExtensionElement;

public class AMPExtension implements ExtensionElement {
    public static final String ELEMENT = "amp";
    public static final String NAMESPACE = "http://jabber.org/protocol/amp";
    private final String from;
    private boolean perHop;
    private CopyOnWriteArrayList<Rule> rules;
    private final Status status;

    /* renamed from: to */
    private final String f44995to;

    public enum Action {
        alert,
        drop,
        error,
        notify;
        
        public static final String ATTRIBUTE_NAME = "action";
    }

    public interface Condition {
        public static final String ATTRIBUTE_NAME = "condition";

        String getName();

        String getValue();
    }

    public static class Rule {
        public static final String ELEMENT = "rule";
        private final Action action;
        private final Condition condition;

        public Rule(Action action2, Condition condition2) {
            if (action2 == null) {
                throw new NullPointerException("Can't create Rule with null action");
            } else if (condition2 != null) {
                this.action = action2;
                this.condition = condition2;
            } else {
                throw new NullPointerException("Can't create Rule with null condition");
            }
        }

        /* access modifiers changed from: private */
        public String toXML() {
            StringBuilder sb = new StringBuilder();
            sb.append("<rule action=\"");
            sb.append(this.action.toString());
            String str = "\" ";
            sb.append(str);
            sb.append(Condition.ATTRIBUTE_NAME);
            sb.append("=\"");
            sb.append(this.condition.getName());
            sb.append(str);
            sb.append("value=\"");
            sb.append(this.condition.getValue());
            sb.append("\"/>");
            return sb.toString();
        }

        public Action getAction() {
            return this.action;
        }

        public Condition getCondition() {
            return this.condition;
        }
    }

    public enum Status {
        alert,
        error,
        notify
    }

    public AMPExtension(String str, String str2, Status status2) {
        this.rules = new CopyOnWriteArrayList<>();
        this.perHop = false;
        this.from = str;
        this.f44995to = str2;
        this.status = status2;
    }

    public void addRule(Rule rule) {
        this.rules.add(rule);
    }

    public String getElementName() {
        return ELEMENT;
    }

    public String getFrom() {
        return this.from;
    }

    public String getNamespace() {
        return NAMESPACE;
    }

    public List<Rule> getRules() {
        return Collections.unmodifiableList(this.rules);
    }

    public int getRulesCount() {
        return this.rules.size();
    }

    public Status getStatus() {
        return this.status;
    }

    public String getTo() {
        return this.f44995to;
    }

    public synchronized boolean isPerHop() {
        return this.perHop;
    }

    public synchronized void setPerHop(boolean z) {
        this.perHop = z;
    }

    public String toXML() {
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        sb.append(getElementName());
        sb.append(" xmlns=\"");
        sb.append(getNamespace());
        String str = "\"";
        sb.append(str);
        if (this.status != null) {
            sb.append(" status=\"");
            sb.append(this.status.toString());
            sb.append(str);
        }
        if (this.f44995to != null) {
            sb.append(" to=\"");
            sb.append(this.f44995to);
            sb.append(str);
        }
        if (this.from != null) {
            sb.append(" from=\"");
            sb.append(this.from);
            sb.append(str);
        }
        if (this.perHop) {
            sb.append(" per-hop=\"true\"");
        }
        String str2 = ">";
        sb.append(str2);
        for (Rule access$000 : getRules()) {
            sb.append(access$000.toXML());
        }
        sb.append("</");
        sb.append(getElementName());
        sb.append(str2);
        return sb.toString();
    }

    public AMPExtension() {
        this.rules = new CopyOnWriteArrayList<>();
        this.perHop = false;
        this.from = null;
        this.f44995to = null;
        this.status = null;
    }
}
