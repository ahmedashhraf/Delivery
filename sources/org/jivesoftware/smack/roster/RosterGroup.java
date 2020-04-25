package org.jivesoftware.smack.roster;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.jivesoftware.smack.Manager;
import org.jivesoftware.smack.SmackException.NoResponseException;
import org.jivesoftware.smack.SmackException.NotConnectedException;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPException.XMPPErrorException;
import org.jivesoftware.smack.packet.C15617IQ.Type;
import org.jivesoftware.smack.roster.packet.RosterPacket;
import org.jivesoftware.smack.roster.packet.RosterPacket.Item;
import p205i.p486d.p487a.C14055b;

public class RosterGroup extends Manager {
    private final Set<RosterEntry> entries = new LinkedHashSet();
    private final String name;

    RosterGroup(String str, XMPPConnection xMPPConnection) {
        super(xMPPConnection);
        this.name = str;
    }

    public void addEntry(RosterEntry rosterEntry) throws NoResponseException, XMPPErrorException, NotConnectedException {
        synchronized (this.entries) {
            if (!this.entries.contains(rosterEntry)) {
                RosterPacket rosterPacket = new RosterPacket();
                rosterPacket.setType(Type.set);
                Item rosterItem = RosterEntry.toRosterItem(rosterEntry);
                rosterItem.addGroupName(getName());
                rosterPacket.addRosterItem(rosterItem);
                connection().createPacketCollectorAndSend(rosterPacket).nextResultOrThrow();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void addEntryLocal(RosterEntry rosterEntry) {
        synchronized (this.entries) {
            this.entries.remove(rosterEntry);
            this.entries.add(rosterEntry);
        }
    }

    public boolean contains(RosterEntry rosterEntry) {
        boolean contains;
        synchronized (this.entries) {
            contains = this.entries.contains(rosterEntry);
        }
        return contains;
    }

    public List<RosterEntry> getEntries() {
        ArrayList arrayList;
        synchronized (this.entries) {
            arrayList = new ArrayList(this.entries);
        }
        return arrayList;
    }

    public RosterEntry getEntry(String str) {
        if (str == null) {
            return null;
        }
        String lowerCase = C14055b.m60645e(str).toLowerCase(Locale.US);
        synchronized (this.entries) {
            for (RosterEntry rosterEntry : this.entries) {
                if (rosterEntry.getUser().equals(lowerCase)) {
                    return rosterEntry;
                }
            }
            return null;
        }
    }

    public int getEntryCount() {
        int size;
        synchronized (this.entries) {
            size = this.entries.size();
        }
        return size;
    }

    public String getName() {
        return this.name;
    }

    public void removeEntry(RosterEntry rosterEntry) throws NoResponseException, XMPPErrorException, NotConnectedException {
        synchronized (this.entries) {
            if (this.entries.contains(rosterEntry)) {
                RosterPacket rosterPacket = new RosterPacket();
                rosterPacket.setType(Type.set);
                Item rosterItem = RosterEntry.toRosterItem(rosterEntry);
                rosterItem.removeGroupName(getName());
                rosterPacket.addRosterItem(rosterItem);
                connection().createPacketCollectorAndSend(rosterPacket).nextResultOrThrow();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void removeEntryLocal(RosterEntry rosterEntry) {
        synchronized (this.entries) {
            if (this.entries.contains(rosterEntry)) {
                this.entries.remove(rosterEntry);
            }
        }
    }

    public void setName(String str) throws NotConnectedException, NoResponseException, XMPPErrorException {
        synchronized (this.entries) {
            for (RosterEntry rosterEntry : this.entries) {
                RosterPacket rosterPacket = new RosterPacket();
                rosterPacket.setType(Type.set);
                Item rosterItem = RosterEntry.toRosterItem(rosterEntry);
                rosterItem.removeGroupName(this.name);
                rosterItem.addGroupName(str);
                rosterPacket.addRosterItem(rosterItem);
                connection().createPacketCollectorAndSend(rosterPacket).nextResultOrThrow();
            }
        }
    }

    public boolean contains(String str) {
        return getEntry(str) != null;
    }
}
