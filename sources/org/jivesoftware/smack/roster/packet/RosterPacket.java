package org.jivesoftware.smack.roster.packet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.jivesoftware.smack.packet.C15617IQ;
import org.jivesoftware.smack.packet.C15617IQ.IQChildElementXmlStringBuilder;
import org.jivesoftware.smack.util.XmlStringBuilder;

public class RosterPacket extends C15617IQ {
    public static final String ELEMENT = "query";
    public static final String NAMESPACE = "jabber:iq:roster";
    private final List<Item> rosterItems = new ArrayList();
    private String rosterVersion;

    public static class Item {
        public static final String GROUP = "group";
        private final Set<String> groupNames = new CopyOnWriteArraySet();
        private ItemStatus itemStatus = null;
        private ItemType itemType = null;
        private String name;
        private String user;

        public Item(String str, String str2) {
            this.user = str.toLowerCase(Locale.US);
            this.name = str2;
        }

        public void addGroupName(String str) {
            this.groupNames.add(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || Item.class != obj.getClass()) {
                return false;
            }
            Item item = (Item) obj;
            Set<String> set = this.groupNames;
            if (set == null) {
                if (item.groupNames != null) {
                    return false;
                }
            } else if (!set.equals(item.groupNames)) {
                return false;
            }
            if (this.itemStatus != item.itemStatus || this.itemType != item.itemType) {
                return false;
            }
            String str = this.name;
            if (str == null) {
                if (item.name != null) {
                    return false;
                }
            } else if (!str.equals(item.name)) {
                return false;
            }
            String str2 = this.user;
            if (str2 == null) {
                if (item.user != null) {
                    return false;
                }
            } else if (!str2.equals(item.user)) {
                return false;
            }
            return true;
        }

        public Set<String> getGroupNames() {
            return Collections.unmodifiableSet(this.groupNames);
        }

        public ItemStatus getItemStatus() {
            return this.itemStatus;
        }

        public ItemType getItemType() {
            return this.itemType;
        }

        public String getName() {
            return this.name;
        }

        public String getUser() {
            return this.user;
        }

        public int hashCode() {
            Set<String> set = this.groupNames;
            int i = 0;
            int hashCode = ((set == null ? 0 : set.hashCode()) + 31) * 31;
            ItemStatus itemStatus2 = this.itemStatus;
            int hashCode2 = (hashCode + (itemStatus2 == null ? 0 : itemStatus2.hashCode())) * 31;
            ItemType itemType2 = this.itemType;
            int hashCode3 = (hashCode2 + (itemType2 == null ? 0 : itemType2.hashCode())) * 31;
            String str = this.name;
            int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.user;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode4 + i;
        }

        public void removeGroupName(String str) {
            this.groupNames.remove(str);
        }

        public void setItemStatus(ItemStatus itemStatus2) {
            this.itemStatus = itemStatus2;
        }

        public void setItemType(ItemType itemType2) {
            this.itemType = itemType2;
        }

        public void setName(String str) {
            this.name = str;
        }

        public XmlStringBuilder toXML() {
            XmlStringBuilder xmlStringBuilder = new XmlStringBuilder();
            String str = "item";
            xmlStringBuilder.halfOpenElement(str).attribute("jid", this.user);
            xmlStringBuilder.optAttribute("name", this.name);
            xmlStringBuilder.optAttribute("subscription", (Enum<?>) this.itemType);
            xmlStringBuilder.optAttribute("ask", (Enum<?>) this.itemStatus);
            xmlStringBuilder.rightAngleBracket();
            for (String str2 : this.groupNames) {
                String str3 = GROUP;
                xmlStringBuilder.openElement(str3).escape(str2).closeElement(str3);
            }
            xmlStringBuilder.closeElement(str);
            return xmlStringBuilder;
        }
    }

    public enum ItemStatus {
        subscribe,
        unsubscribe;
        
        public static final ItemStatus SUBSCRIPTION_PENDING = null;
        public static final ItemStatus UNSUBSCRIPTION_PENDING = null;

        static {
            ItemStatus itemStatus;
            ItemStatus itemStatus2;
            SUBSCRIPTION_PENDING = itemStatus;
            UNSUBSCRIPTION_PENDING = itemStatus2;
        }

        public static ItemStatus fromString(String str) {
            if (str == null) {
                return null;
            }
            try {
                return valueOf(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
    }

    public enum ItemType {
        none,
        to,
        from,
        both,
        remove
    }

    public RosterPacket() {
        super("query", NAMESPACE);
    }

    public void addRosterItem(Item item) {
        synchronized (this.rosterItems) {
            this.rosterItems.add(item);
        }
    }

    /* access modifiers changed from: protected */
    public IQChildElementXmlStringBuilder getIQChildElementBuilder(IQChildElementXmlStringBuilder iQChildElementXmlStringBuilder) {
        iQChildElementXmlStringBuilder.optAttribute(RosterVer.ELEMENT, this.rosterVersion);
        iQChildElementXmlStringBuilder.rightAngleBracket();
        synchronized (this.rosterItems) {
            for (Item xml : this.rosterItems) {
                iQChildElementXmlStringBuilder.append(xml.toXML());
            }
        }
        return iQChildElementXmlStringBuilder;
    }

    public int getRosterItemCount() {
        int size;
        synchronized (this.rosterItems) {
            size = this.rosterItems.size();
        }
        return size;
    }

    public List<Item> getRosterItems() {
        ArrayList arrayList;
        synchronized (this.rosterItems) {
            arrayList = new ArrayList(this.rosterItems);
        }
        return arrayList;
    }

    public String getVersion() {
        return this.rosterVersion;
    }

    public void setVersion(String str) {
        this.rosterVersion = str;
    }
}
