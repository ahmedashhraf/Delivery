package org.jivesoftware.smackx.pubsub;

import java.util.Locale;
import org.jivesoftware.smackx.pubsub.packet.PubSubNamespace;
import p212io.branch.referral.C6009d;

public enum PubSubElementType {
    CREATE("create", PubSubNamespace.BASIC),
    DELETE(r3, PubSubNamespace.OWNER),
    DELETE_EVENT(r3, PubSubNamespace.EVENT),
    CONFIGURE(r3, PubSubNamespace.BASIC),
    CONFIGURE_OWNER(r3, PubSubNamespace.OWNER),
    CONFIGURATION("configuration", PubSubNamespace.EVENT),
    OPTIONS("options", PubSubNamespace.BASIC),
    DEFAULT(C6009d.f17209I, PubSubNamespace.OWNER),
    ITEMS(r10, PubSubNamespace.BASIC),
    ITEMS_EVENT(r10, PubSubNamespace.EVENT),
    ITEM(r10, PubSubNamespace.BASIC),
    ITEM_EVENT(r10, PubSubNamespace.EVENT),
    PUBLISH("publish", PubSubNamespace.BASIC),
    PUBLISH_OPTIONS("publish-options", PubSubNamespace.BASIC),
    PURGE_OWNER("purge", PubSubNamespace.OWNER),
    PURGE_EVENT("purge", PubSubNamespace.EVENT),
    RETRACT("retract", PubSubNamespace.BASIC),
    AFFILIATIONS("affiliations", PubSubNamespace.BASIC),
    SUBSCRIBE("subscribe", PubSubNamespace.BASIC),
    SUBSCRIPTION("subscription", PubSubNamespace.BASIC),
    SUBSCRIPTIONS("subscriptions", PubSubNamespace.BASIC),
    UNSUBSCRIBE("unsubscribe", PubSubNamespace.BASIC);
    
    private String eName;
    private PubSubNamespace nSpace;

    private PubSubElementType(String str, PubSubNamespace pubSubNamespace) {
        this.eName = str;
        this.nSpace = pubSubNamespace;
    }

    public static PubSubElementType valueOfFromElemName(String str, String str2) {
        String str3;
        int lastIndexOf = str2.lastIndexOf(35);
        if (lastIndexOf == -1) {
            str3 = null;
        } else {
            str3 = str2.substring(lastIndexOf + 1);
        }
        if (str3 == null) {
            return valueOf(str.toUpperCase(Locale.US).replace('-', '_'));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('_');
        sb.append(str3);
        return valueOf(sb.toString().toUpperCase(Locale.US));
    }

    public String getElementName() {
        return this.eName;
    }

    public PubSubNamespace getNamespace() {
        return this.nSpace;
    }
}
