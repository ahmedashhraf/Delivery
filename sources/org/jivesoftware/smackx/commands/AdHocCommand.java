package org.jivesoftware.smackx.commands;

import java.util.List;
import org.jivesoftware.smack.SmackException.NoResponseException;
import org.jivesoftware.smack.SmackException.NotConnectedException;
import org.jivesoftware.smack.XMPPException.XMPPErrorException;
import org.jivesoftware.smack.packet.XMPPError;
import org.jivesoftware.smackx.commands.packet.AdHocCommandData;
import org.jivesoftware.smackx.xdata.Form;

public abstract class AdHocCommand {
    private AdHocCommandData data = new AdHocCommandData();

    public enum Action {
        execute,
        cancel,
        prev,
        next,
        complete,
        unknown
    }

    public enum SpecificErrorCondition {
        badAction("bad-action"),
        malformedAction("malformed-action"),
        badLocale("bad-locale"),
        badPayload("bad-payload"),
        badSessionid("bad-sessionid"),
        sessionExpired("session-expired");
        
        private String value;

        private SpecificErrorCondition(String str) {
            this.value = str;
        }

        public String toString() {
            return this.value;
        }
    }

    public enum Status {
        executing,
        completed,
        canceled
    }

    public static SpecificErrorCondition getSpecificErrorCondition(XMPPError xMPPError) {
        SpecificErrorCondition[] values;
        for (SpecificErrorCondition specificErrorCondition : SpecificErrorCondition.values()) {
            if (xMPPError.getExtension(specificErrorCondition.toString(), "http://jabber.org/protocol/commands") != null) {
                return specificErrorCondition;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void addActionAvailable(Action action) {
        this.data.addAction(action);
    }

    /* access modifiers changed from: protected */
    public void addNote(AdHocCommandNote adHocCommandNote) {
        this.data.addNote(adHocCommandNote);
    }

    public abstract void cancel() throws NoResponseException, XMPPErrorException, NotConnectedException;

    public abstract void complete(Form form) throws NoResponseException, XMPPErrorException, NotConnectedException;

    public abstract void execute() throws NoResponseException, XMPPErrorException, NotConnectedException;

    /* access modifiers changed from: protected */
    public List<Action> getActions() {
        return this.data.getActions();
    }

    /* access modifiers changed from: 0000 */
    public AdHocCommandData getData() {
        return this.data;
    }

    /* access modifiers changed from: protected */
    public Action getExecuteAction() {
        return this.data.getExecuteAction();
    }

    public Form getForm() {
        if (this.data.getForm() == null) {
            return null;
        }
        return new Form(this.data.getForm());
    }

    public String getName() {
        return this.data.getName();
    }

    public String getNode() {
        return this.data.getNode();
    }

    public List<AdHocCommandNote> getNotes() {
        return this.data.getNotes();
    }

    public abstract String getOwnerJID();

    public String getRaw() {
        return this.data.getChildElementXML().toString();
    }

    public Status getStatus() {
        return this.data.getStatus();
    }

    /* access modifiers changed from: protected */
    public boolean isValidAction(Action action) {
        return getActions().contains(action) || Action.cancel.equals(action);
    }

    public abstract void next(Form form) throws NoResponseException, XMPPErrorException, NotConnectedException;

    public abstract void prev() throws NoResponseException, XMPPErrorException, NotConnectedException;

    /* access modifiers changed from: 0000 */
    public void setData(AdHocCommandData adHocCommandData) {
        this.data = adHocCommandData;
    }

    /* access modifiers changed from: protected */
    public void setExecuteAction(Action action) {
        this.data.setExecuteAction(action);
    }

    /* access modifiers changed from: protected */
    public void setForm(Form form) {
        this.data.setForm(form.getDataFormToSend());
    }

    public void setName(String str) {
        this.data.setName(str);
    }

    public void setNode(String str) {
        this.data.setNode(str);
    }
}
