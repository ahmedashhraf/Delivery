package org.jivesoftware.smackx.xroster.packet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.jivesoftware.smack.packet.ExtensionElement;
import org.jivesoftware.smack.roster.Roster;
import org.jivesoftware.smack.roster.RosterEntry;
import org.jivesoftware.smack.roster.RosterGroup;
import org.jivesoftware.smackx.xroster.RemoteRosterEntry;
import org.jivesoftware.smackx.xroster.RosterExchangeManager;

public class RosterExchange implements ExtensionElement {
    private List<RemoteRosterEntry> remoteRosterEntries = new ArrayList();

    public RosterExchange() {
    }

    public void addRosterEntry(RosterEntry rosterEntry) {
        ArrayList arrayList = new ArrayList();
        for (RosterGroup name : rosterEntry.getGroups()) {
            arrayList.add(name.getName());
        }
        addRosterEntry(new RemoteRosterEntry(rosterEntry.getUser(), rosterEntry.getName(), (String[]) arrayList.toArray(new String[arrayList.size()])));
    }

    public String getElementName() {
        return "x";
    }

    public int getEntryCount() {
        return this.remoteRosterEntries.size();
    }

    public String getNamespace() {
        return RosterExchangeManager.NAMESPACE;
    }

    public Iterator<RemoteRosterEntry> getRosterEntries() {
        Iterator<RemoteRosterEntry> it;
        synchronized (this.remoteRosterEntries) {
            it = Collections.unmodifiableList(new ArrayList(this.remoteRosterEntries)).iterator();
        }
        return it;
    }

    public String toXML() {
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        sb.append(getElementName());
        sb.append(" xmlns=\"");
        sb.append(getNamespace());
        sb.append("\">");
        Iterator rosterEntries = getRosterEntries();
        while (rosterEntries.hasNext()) {
            sb.append(((RemoteRosterEntry) rosterEntries.next()).toXML());
        }
        sb.append("</");
        sb.append(getElementName());
        sb.append(">");
        return sb.toString();
    }

    public RosterExchange(Roster roster) {
        for (RosterEntry addRosterEntry : roster.getEntries()) {
            addRosterEntry(addRosterEntry);
        }
    }

    public void addRosterEntry(RemoteRosterEntry remoteRosterEntry) {
        synchronized (this.remoteRosterEntries) {
            this.remoteRosterEntries.add(remoteRosterEntry);
        }
    }
}
