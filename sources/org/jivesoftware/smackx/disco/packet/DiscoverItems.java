package org.jivesoftware.smackx.disco.packet;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import org.jivesoftware.smack.packet.C15617IQ;
import org.jivesoftware.smack.packet.C15617IQ.IQChildElementXmlStringBuilder;
import org.jivesoftware.smack.util.XmlStringBuilder;

public class DiscoverItems extends C15617IQ {
    public static final String ELEMENT = "query";
    public static final String NAMESPACE = "http://jabber.org/protocol/disco#items";
    private final List<Item> items = new LinkedList();
    private String node;

    public static class Item {
        public static final String REMOVE_ACTION = "remove";
        public static final String UPDATE_ACTION = "update";
        private String action;
        private String entityID;
        private String name;
        private String node;

        public Item(String str) {
            this.entityID = str;
        }

        public String getAction() {
            return this.action;
        }

        public String getEntityID() {
            return this.entityID;
        }

        public String getName() {
            return this.name;
        }

        public String getNode() {
            return this.node;
        }

        public void setAction(String str) {
            this.action = str;
        }

        public void setName(String str) {
            this.name = str;
        }

        public void setNode(String str) {
            this.node = str;
        }

        public XmlStringBuilder toXML() {
            XmlStringBuilder xmlStringBuilder = new XmlStringBuilder();
            xmlStringBuilder.halfOpenElement("item");
            xmlStringBuilder.attribute("jid", this.entityID);
            xmlStringBuilder.optAttribute("name", this.name);
            xmlStringBuilder.optAttribute("node", this.node);
            xmlStringBuilder.optAttribute("action", this.action);
            xmlStringBuilder.closeEmptyElement();
            return xmlStringBuilder;
        }
    }

    public DiscoverItems() {
        super("query", NAMESPACE);
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void addItems(Collection<Item> collection) {
        if (collection != null) {
            for (Item addItem : collection) {
                addItem(addItem);
            }
        }
    }

    /* access modifiers changed from: protected */
    public IQChildElementXmlStringBuilder getIQChildElementBuilder(IQChildElementXmlStringBuilder iQChildElementXmlStringBuilder) {
        iQChildElementXmlStringBuilder.optAttribute("node", getNode());
        iQChildElementXmlStringBuilder.rightAngleBracket();
        for (Item xml : this.items) {
            iQChildElementXmlStringBuilder.append(xml.toXML());
        }
        return iQChildElementXmlStringBuilder;
    }

    public List<Item> getItems() {
        return Collections.unmodifiableList(this.items);
    }

    public String getNode() {
        return this.node;
    }

    public void setNode(String str) {
        this.node = str;
    }
}
