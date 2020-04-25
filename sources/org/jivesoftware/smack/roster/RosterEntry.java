package org.jivesoftware.smack.roster;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jivesoftware.smack.Manager;
import org.jivesoftware.smack.SmackException.NoResponseException;
import org.jivesoftware.smack.SmackException.NotConnectedException;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPException.XMPPErrorException;
import org.jivesoftware.smack.packet.C15617IQ.Type;
import org.jivesoftware.smack.roster.packet.RosterPacket;
import org.jivesoftware.smack.roster.packet.RosterPacket.Item;
import org.jivesoftware.smack.roster.packet.RosterPacket.ItemStatus;
import org.jivesoftware.smack.roster.packet.RosterPacket.ItemType;

public final class RosterEntry extends Manager {
    private String name;
    private final Roster roster;
    private ItemStatus status;
    private ItemType type;
    private final String user;

    RosterEntry(String str, String str2, ItemType itemType, ItemStatus itemStatus, Roster roster2, XMPPConnection xMPPConnection) {
        super(xMPPConnection);
        this.user = str;
        this.name = str2;
        this.type = itemType;
        this.status = itemStatus;
        this.roster = roster2;
    }

    static Item toRosterItem(RosterEntry rosterEntry) {
        return toRosterItem(rosterEntry, rosterEntry.getName());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof RosterEntry)) {
            return false;
        }
        return this.user.equals(((RosterEntry) obj).getUser());
    }

    public boolean equalsDeep(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RosterEntry.class != obj.getClass()) {
            return false;
        }
        RosterEntry rosterEntry = (RosterEntry) obj;
        String str = this.name;
        if (str == null) {
            if (rosterEntry.name != null) {
                return false;
            }
        } else if (!str.equals(rosterEntry.name)) {
            return false;
        }
        ItemStatus itemStatus = this.status;
        if (itemStatus == null) {
            if (rosterEntry.status != null) {
                return false;
            }
        } else if (!itemStatus.equals(rosterEntry.status)) {
            return false;
        }
        ItemType itemType = this.type;
        if (itemType == null) {
            if (rosterEntry.type != null) {
                return false;
            }
        } else if (!itemType.equals(rosterEntry.type)) {
            return false;
        }
        String str2 = this.user;
        if (str2 == null) {
            if (rosterEntry.user != null) {
                return false;
            }
        } else if (!str2.equals(rosterEntry.user)) {
            return false;
        }
        return true;
    }

    public List<RosterGroup> getGroups() {
        ArrayList arrayList = new ArrayList();
        for (RosterGroup rosterGroup : this.roster.getGroups()) {
            if (rosterGroup.contains(this)) {
                arrayList.add(rosterGroup);
            }
        }
        return arrayList;
    }

    public String getName() {
        return this.name;
    }

    public ItemStatus getStatus() {
        return this.status;
    }

    public ItemType getType() {
        return this.type;
    }

    public String getUser() {
        return this.user;
    }

    public int hashCode() {
        String str = this.user;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public synchronized void setName(String str) throws NotConnectedException, NoResponseException, XMPPErrorException {
        if (str != null) {
            if (str.equals(this.name)) {
                return;
            }
        }
        RosterPacket rosterPacket = new RosterPacket();
        rosterPacket.setType(Type.set);
        rosterPacket.addRosterItem(toRosterItem(this, str));
        connection().createPacketCollectorAndSend(rosterPacket).nextResultOrThrow();
        this.name = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.name;
        if (str != null) {
            sb.append(str);
            sb.append(": ");
        }
        sb.append(this.user);
        List groups = getGroups();
        if (!groups.isEmpty()) {
            sb.append(" [");
            Iterator it = groups.iterator();
            sb.append(((RosterGroup) it.next()).getName());
            while (it.hasNext()) {
                sb.append(", ");
                sb.append(((RosterGroup) it.next()).getName());
            }
            sb.append("]");
        }
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    public void updateState(String str, ItemType itemType, ItemStatus itemStatus) {
        this.name = str;
        this.type = itemType;
        this.status = itemStatus;
    }

    private static Item toRosterItem(RosterEntry rosterEntry, String str) {
        Item item = new Item(rosterEntry.getUser(), str);
        item.setItemType(rosterEntry.getType());
        item.setItemStatus(rosterEntry.getStatus());
        for (RosterGroup name2 : rosterEntry.getGroups()) {
            item.addGroupName(name2.getName());
        }
        return item;
    }
}
