package org.jivesoftware.smackx.privacy;

import java.util.List;
import org.jivesoftware.smackx.privacy.packet.PrivacyItem;

public class PrivacyList {
    private final boolean isActiveList;
    private final boolean isDefaultList;
    private final List<PrivacyItem> items;
    private final String listName;

    protected PrivacyList(boolean z, boolean z2, String str, List<PrivacyItem> list) {
        this.isActiveList = z;
        this.isDefaultList = z2;
        this.listName = str;
        this.items = list;
    }

    public List<PrivacyItem> getItems() {
        return this.items;
    }

    public String getName() {
        return this.listName;
    }

    public boolean isActiveList() {
        return this.isActiveList;
    }

    public boolean isDefaultList() {
        return this.isDefaultList;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Privacy List: ");
        sb.append(this.listName);
        sb.append("(active:");
        sb.append(this.isActiveList);
        sb.append(", default:");
        sb.append(this.isDefaultList);
        sb.append(")");
        return sb.toString();
    }
}
