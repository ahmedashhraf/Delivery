package org.jivesoftware.smackx.pubsub;

import java.util.Collections;
import java.util.List;

public class AffiliationsExtension extends NodeExtension {
    protected List<Affiliation> items = Collections.emptyList();

    public AffiliationsExtension() {
        super(PubSubElementType.AFFILIATIONS);
    }

    public List<Affiliation> getAffiliations() {
        return this.items;
    }

    public CharSequence toXML() {
        List<Affiliation> list = this.items;
        if (list == null || list.size() == 0) {
            return super.toXML();
        }
        StringBuilder sb = new StringBuilder("<");
        sb.append(getElementName());
        String str = ">";
        sb.append(str);
        for (Affiliation xml : this.items) {
            sb.append(xml.toXML());
        }
        sb.append("</");
        sb.append(getElementName());
        sb.append(str);
        return sb.toString();
    }

    public AffiliationsExtension(List<Affiliation> list) {
        super(PubSubElementType.AFFILIATIONS);
        this.items = list;
    }
}
