package org.jivesoftware.smackx.muc;

import org.jivesoftware.smack.packet.Presence;
import org.jivesoftware.smackx.muc.packet.MUCItem;
import org.jivesoftware.smackx.muc.packet.MUCUser;
import p205i.p486d.p487a.C14055b;

public class Occupant {
    private final MUCAffiliation affiliation;
    private final String jid;
    private final String nick;
    private final MUCRole role;

    Occupant(MUCItem mUCItem) {
        this.jid = mUCItem.getJid();
        this.affiliation = mUCItem.getAffiliation();
        this.role = mUCItem.getRole();
        this.nick = mUCItem.getNick();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Occupant)) {
            return false;
        }
        return this.jid.equals(((Occupant) obj).jid);
    }

    public MUCAffiliation getAffiliation() {
        return this.affiliation;
    }

    public String getJid() {
        return this.jid;
    }

    public String getNick() {
        return this.nick;
    }

    public MUCRole getRole() {
        return this.role;
    }

    public int hashCode() {
        int hashCode = ((((this.affiliation.hashCode() * 17) + this.role.hashCode()) * 17) + this.jid.hashCode()) * 17;
        String str = this.nick;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    Occupant(Presence presence) {
        MUCItem item = ((MUCUser) presence.getExtension("x", MUCUser.NAMESPACE)).getItem();
        this.jid = item.getJid();
        this.affiliation = item.getAffiliation();
        this.role = item.getRole();
        this.nick = C14055b.m60648h(presence.getFrom());
    }
}
