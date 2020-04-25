package org.jivesoftware.smackx.commands.packet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jivesoftware.smack.packet.C15617IQ;
import org.jivesoftware.smack.packet.C15617IQ.IQChildElementXmlStringBuilder;
import org.jivesoftware.smack.packet.C15617IQ.Type;
import org.jivesoftware.smack.packet.ExtensionElement;
import org.jivesoftware.smackx.commands.AdHocCommand.Action;
import org.jivesoftware.smackx.commands.AdHocCommand.SpecificErrorCondition;
import org.jivesoftware.smackx.commands.AdHocCommand.Status;
import org.jivesoftware.smackx.commands.AdHocCommandNote;
import org.jivesoftware.smackx.xdata.packet.DataForm;
import p205i.p471b.p472a.p473a.p474c.p478j.p484d.C14030b;

public class AdHocCommandData extends C15617IQ {
    public static final String ELEMENT = "command";
    public static final String NAMESPACE = "http://jabber.org/protocol/commands";
    private Action action;
    private ArrayList<Action> actions = new ArrayList<>();
    private Action executeAction;
    private DataForm form;

    /* renamed from: id */
    private String f44998id;
    private String name;
    private String node;
    private List<AdHocCommandNote> notes = new ArrayList();
    private String sessionID;
    private Status status;

    public static class SpecificError implements ExtensionElement {
        public static final String namespace = "http://jabber.org/protocol/commands";
        public SpecificErrorCondition condition;

        public SpecificError(SpecificErrorCondition specificErrorCondition) {
            this.condition = specificErrorCondition;
        }

        public SpecificErrorCondition getCondition() {
            return this.condition;
        }

        public String getElementName() {
            return this.condition.toString();
        }

        public String getNamespace() {
            return "http://jabber.org/protocol/commands";
        }

        public String toXML() {
            StringBuilder sb = new StringBuilder();
            sb.append("<");
            sb.append(getElementName());
            sb.append(" xmlns=\"");
            sb.append(getNamespace());
            sb.append("\"/>");
            return sb.toString();
        }
    }

    public AdHocCommandData() {
        super(ELEMENT, "http://jabber.org/protocol/commands");
    }

    public void addAction(Action action2) {
        this.actions.add(action2);
    }

    public void addNote(AdHocCommandNote adHocCommandNote) {
        this.notes.add(adHocCommandNote);
    }

    public Action getAction() {
        return this.action;
    }

    public List<Action> getActions() {
        return this.actions;
    }

    public Action getExecuteAction() {
        return this.executeAction;
    }

    public DataForm getForm() {
        return this.form;
    }

    /* access modifiers changed from: protected */
    public IQChildElementXmlStringBuilder getIQChildElementBuilder(IQChildElementXmlStringBuilder iQChildElementXmlStringBuilder) {
        iQChildElementXmlStringBuilder.attribute("node", this.node);
        iQChildElementXmlStringBuilder.optAttribute(C14030b.f41235j, this.sessionID);
        iQChildElementXmlStringBuilder.optAttribute("status", (Enum<?>) this.status);
        iQChildElementXmlStringBuilder.optAttribute("action", (Enum<?>) this.action);
        iQChildElementXmlStringBuilder.rightAngleBracket();
        if (getType() == Type.result) {
            String str = "actions";
            iQChildElementXmlStringBuilder.halfOpenElement(str);
            iQChildElementXmlStringBuilder.optAttribute("execute", (Enum<?>) this.executeAction);
            if (this.actions.size() == 0) {
                iQChildElementXmlStringBuilder.closeEmptyElement();
            } else {
                iQChildElementXmlStringBuilder.rightAngleBracket();
                Iterator it = this.actions.iterator();
                while (it.hasNext()) {
                    iQChildElementXmlStringBuilder.emptyElement((Enum<?>) (Action) it.next());
                }
                iQChildElementXmlStringBuilder.closeElement(str);
            }
        }
        DataForm dataForm = this.form;
        if (dataForm != null) {
            iQChildElementXmlStringBuilder.append(dataForm.toXML());
        }
        for (AdHocCommandNote adHocCommandNote : this.notes) {
            String str2 = "note";
            iQChildElementXmlStringBuilder.halfOpenElement(str2).attribute("type", adHocCommandNote.getType().toString()).rightAngleBracket();
            iQChildElementXmlStringBuilder.append((CharSequence) adHocCommandNote.getValue());
            iQChildElementXmlStringBuilder.closeElement(str2);
        }
        return iQChildElementXmlStringBuilder;
    }

    public String getId() {
        return this.f44998id;
    }

    public String getName() {
        return this.name;
    }

    public String getNode() {
        return this.node;
    }

    public List<AdHocCommandNote> getNotes() {
        return this.notes;
    }

    public String getSessionID() {
        return this.sessionID;
    }

    public Status getStatus() {
        return this.status;
    }

    public void remveNote(AdHocCommandNote adHocCommandNote) {
        this.notes.remove(adHocCommandNote);
    }

    public void setAction(Action action2) {
        this.action = action2;
    }

    public void setExecuteAction(Action action2) {
        this.executeAction = action2;
    }

    public void setForm(DataForm dataForm) {
        this.form = dataForm;
    }

    public void setId(String str) {
        this.f44998id = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setNode(String str) {
        this.node = str;
    }

    public void setSessionID(String str) {
        this.sessionID = str;
    }

    public void setStatus(Status status2) {
        this.status = status2;
    }
}
