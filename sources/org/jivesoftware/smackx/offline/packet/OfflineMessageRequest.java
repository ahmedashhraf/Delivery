package org.jivesoftware.smackx.offline.packet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.jivesoftware.smack.packet.C15617IQ;
import org.jivesoftware.smack.packet.C15617IQ.IQChildElementXmlStringBuilder;
import org.jivesoftware.smack.provider.IQProvider;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class OfflineMessageRequest extends C15617IQ {
    public static final String ELEMENT = "offline";
    public static final String NAMESPACE = "http://jabber.org/protocol/offline";
    private boolean fetch = false;
    private List<Item> items = new ArrayList();
    private boolean purge = false;

    public static class Item {
        private String action;
        private String jid;
        private String node;

        public Item(String str) {
            this.node = str;
        }

        public String getAction() {
            return this.action;
        }

        public String getJid() {
            return this.jid;
        }

        public String getNode() {
            return this.node;
        }

        public void setAction(String str) {
            this.action = str;
        }

        public void setJid(String str) {
            this.jid = str;
        }

        public String toXML() {
            StringBuilder sb = new StringBuilder();
            sb.append("<item");
            String str = "\"";
            if (getAction() != null) {
                sb.append(" action=\"");
                sb.append(getAction());
                sb.append(str);
            }
            if (getJid() != null) {
                sb.append(" jid=\"");
                sb.append(getJid());
                sb.append(str);
            }
            if (getNode() != null) {
                sb.append(" node=\"");
                sb.append(getNode());
                sb.append(str);
            }
            sb.append("/>");
            return sb.toString();
        }
    }

    public static class Provider extends IQProvider<OfflineMessageRequest> {
        private Item parseItem(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
            String str = "";
            Item item = new Item(xmlPullParser.getAttributeValue(str, "node"));
            item.setAction(xmlPullParser.getAttributeValue(str, "action"));
            item.setJid(xmlPullParser.getAttributeValue(str, "jid"));
            boolean z = false;
            while (!z) {
                if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals("item")) {
                    z = true;
                }
            }
            return item;
        }

        public OfflineMessageRequest parse(XmlPullParser xmlPullParser, int i) throws XmlPullParserException, IOException {
            OfflineMessageRequest offlineMessageRequest = new OfflineMessageRequest();
            boolean z = false;
            while (!z) {
                int next = xmlPullParser.next();
                if (next == 2) {
                    if (xmlPullParser.getName().equals("item")) {
                        offlineMessageRequest.addItem(parseItem(xmlPullParser));
                    } else if (xmlPullParser.getName().equals("purge")) {
                        offlineMessageRequest.setPurge(true);
                    } else if (xmlPullParser.getName().equals("fetch")) {
                        offlineMessageRequest.setFetch(true);
                    }
                } else if (next == 3 && xmlPullParser.getName().equals("offline")) {
                    z = true;
                }
            }
            return offlineMessageRequest;
        }
    }

    public OfflineMessageRequest() {
        super("offline", NAMESPACE);
    }

    public void addItem(Item item) {
        synchronized (this.items) {
            this.items.add(item);
        }
    }

    /* access modifiers changed from: protected */
    public IQChildElementXmlStringBuilder getIQChildElementBuilder(IQChildElementXmlStringBuilder iQChildElementXmlStringBuilder) {
        iQChildElementXmlStringBuilder.rightAngleBracket();
        synchronized (this.items) {
            for (int i = 0; i < this.items.size(); i++) {
                iQChildElementXmlStringBuilder.append((CharSequence) ((Item) this.items.get(i)).toXML());
            }
        }
        if (this.purge) {
            iQChildElementXmlStringBuilder.append((CharSequence) "<purge/>");
        }
        if (this.fetch) {
            iQChildElementXmlStringBuilder.append((CharSequence) "<fetch/>");
        }
        return iQChildElementXmlStringBuilder;
    }

    public List<Item> getItems() {
        List<Item> unmodifiableList;
        synchronized (this.items) {
            unmodifiableList = Collections.unmodifiableList(new ArrayList(this.items));
        }
        return unmodifiableList;
    }

    public boolean isFetch() {
        return this.fetch;
    }

    public boolean isPurge() {
        return this.purge;
    }

    public void setFetch(boolean z) {
        this.fetch = z;
    }

    public void setPurge(boolean z) {
        this.purge = z;
    }
}
