package org.jivesoftware.smackx.disco.packet;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import org.apache.http.p549j0.C15430e;
import org.jivesoftware.smack.packet.C15617IQ;
import org.jivesoftware.smack.packet.C15617IQ.IQChildElementXmlStringBuilder;
import org.jivesoftware.smack.util.StringUtils;
import org.jivesoftware.smack.util.TypedCloneable;
import org.jivesoftware.smack.util.XmlStringBuilder;
import p205i.p486d.p487a.C14055b;

public class DiscoverInfo extends C15617IQ implements TypedCloneable<DiscoverInfo> {
    public static final String ELEMENT = "query";
    public static final String NAMESPACE = "http://jabber.org/protocol/disco#info";
    private boolean containsDuplicateFeatures;
    private final List<Feature> features = new LinkedList();
    private final Set<Feature> featuresSet = new HashSet();
    private final List<Identity> identities = new LinkedList();
    private final Set<String> identitiesSet = new HashSet();
    private String node;

    public static class Feature implements TypedCloneable<Feature> {
        private final String variable;

        public Feature(Feature feature) {
            this.variable = feature.variable;
        }

        public boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            if (obj.getClass() != Feature.class) {
                return false;
            }
            return this.variable.equals(((Feature) obj).variable);
        }

        public String getVar() {
            return this.variable;
        }

        public int hashCode() {
            return this.variable.hashCode();
        }

        public XmlStringBuilder toXML() {
            XmlStringBuilder xmlStringBuilder = new XmlStringBuilder();
            xmlStringBuilder.halfOpenElement("feature");
            xmlStringBuilder.attribute("var", this.variable);
            xmlStringBuilder.closeEmptyElement();
            return xmlStringBuilder;
        }

        public Feature clone() {
            return new Feature(this);
        }

        public Feature(String str) {
            this.variable = (String) StringUtils.requireNotNullOrEmpty(str, "variable cannot be null");
        }
    }

    public static class Identity implements Comparable<Identity>, TypedCloneable<Identity> {
        private final String category;
        private final String key;
        private final String lang;
        private final String name;
        private final String type;

        public Identity(Identity identity) {
            this.category = identity.category;
            this.type = identity.type;
            this.key = identity.type;
            this.name = identity.name;
            this.lang = identity.lang;
        }

        /* access modifiers changed from: private */
        public String getKey() {
            return this.key;
        }

        public boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            if (obj.getClass() != Identity.class) {
                return false;
            }
            Identity identity = (Identity) obj;
            if (!this.key.equals(identity.key)) {
                return false;
            }
            String str = identity.lang;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            String str3 = this.lang;
            if (str3 == null) {
                str3 = str2;
            }
            if (!str.equals(str3)) {
                return false;
            }
            String str4 = identity.name;
            if (str4 == null) {
                str4 = str2;
            }
            if (this.name != null) {
                str2 = identity.name;
            }
            return str2.equals(str4);
        }

        public String getCategory() {
            return this.category;
        }

        public String getLanguage() {
            return this.lang;
        }

        public String getName() {
            return this.name;
        }

        public String getType() {
            return this.type;
        }

        public int hashCode() {
            int hashCode = (this.key.hashCode() + 37) * 37;
            String str = this.lang;
            int i = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 37;
            String str2 = this.name;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode2 + i;
        }

        public boolean isOfCategoryAndType(String str, String str2) {
            return this.category.equals(str) && this.type.equals(str2);
        }

        public XmlStringBuilder toXML() {
            XmlStringBuilder xmlStringBuilder = new XmlStringBuilder();
            xmlStringBuilder.halfOpenElement(C15430e.f44592s);
            xmlStringBuilder.xmllangAttribute(this.lang);
            xmlStringBuilder.attribute("category", this.category);
            xmlStringBuilder.optAttribute("name", this.name);
            xmlStringBuilder.optAttribute("type", this.type);
            xmlStringBuilder.closeEmptyElement();
            return xmlStringBuilder;
        }

        public Identity clone() {
            return new Identity(this);
        }

        public int compareTo(Identity identity) {
            String str = identity.lang;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            String str3 = this.lang;
            if (str3 == null) {
                str3 = str2;
            }
            String str4 = identity.type;
            if (str4 == null) {
                str4 = str2;
            }
            String str5 = this.type;
            if (str5 != null) {
                str2 = str5;
            }
            if (!this.category.equals(identity.category)) {
                return this.category.compareTo(identity.category);
            }
            if (!str2.equals(str4)) {
                return str2.compareTo(str4);
            }
            if (str3.equals(str)) {
                return 0;
            }
            return str3.compareTo(str);
        }

        public Identity(String str, String str2) {
            this(str, str2, null, null);
        }

        public Identity(String str, String str2, String str3) {
            this(str, str3, str2, null);
        }

        public Identity(String str, String str2, String str3, String str4) {
            this.category = (String) StringUtils.requireNotNullOrEmpty(str, "category cannot be null");
            this.type = (String) StringUtils.requireNotNullOrEmpty(str2, "type cannot be null");
            this.key = C14055b.m60641b(str, str2);
            this.name = str3;
            this.lang = str4;
        }
    }

    public DiscoverInfo() {
        super("query", NAMESPACE);
    }

    public boolean addFeature(String str) {
        return addFeature(new Feature(str));
    }

    public void addFeatures(Collection<String> collection) {
        if (collection != null) {
            for (String addFeature : collection) {
                addFeature(addFeature);
            }
        }
    }

    public void addIdentities(Collection<Identity> collection) {
        if (collection != null) {
            for (Identity addIdentity : collection) {
                addIdentity(addIdentity);
            }
        }
    }

    public void addIdentity(Identity identity) {
        this.identities.add(identity);
        this.identitiesSet.add(identity.getKey());
    }

    public boolean containsDuplicateFeatures() {
        return this.containsDuplicateFeatures;
    }

    public boolean containsDuplicateIdentities() {
        LinkedList<Identity> linkedList = new LinkedList<>();
        for (Identity identity : this.identities) {
            for (Identity equals : linkedList) {
                if (identity.equals(equals)) {
                    return true;
                }
            }
            linkedList.add(identity);
        }
        return false;
    }

    public boolean containsFeature(String str) {
        return this.features.contains(new Feature(str));
    }

    public List<Feature> getFeatures() {
        return Collections.unmodifiableList(this.features);
    }

    /* access modifiers changed from: protected */
    public IQChildElementXmlStringBuilder getIQChildElementBuilder(IQChildElementXmlStringBuilder iQChildElementXmlStringBuilder) {
        iQChildElementXmlStringBuilder.optAttribute("node", getNode());
        iQChildElementXmlStringBuilder.rightAngleBracket();
        for (Identity xml : this.identities) {
            iQChildElementXmlStringBuilder.append(xml.toXML());
        }
        for (Feature xml2 : this.features) {
            iQChildElementXmlStringBuilder.append(xml2.toXML());
        }
        return iQChildElementXmlStringBuilder;
    }

    public List<Identity> getIdentities() {
        return Collections.unmodifiableList(this.identities);
    }

    public String getNode() {
        return this.node;
    }

    public boolean hasIdentity(String str, String str2) {
        return this.identitiesSet.contains(C14055b.m60641b(str, str2));
    }

    public void setNode(String str) {
        this.node = str;
    }

    public boolean addFeature(Feature feature) {
        this.features.add(feature);
        boolean add = this.featuresSet.add(feature);
        if (!add) {
            this.containsDuplicateFeatures = true;
        }
        return add;
    }

    public DiscoverInfo clone() {
        return new DiscoverInfo(this);
    }

    public List<Identity> getIdentities(String str, String str2) {
        ArrayList arrayList = new ArrayList(this.identities.size());
        for (Identity identity : this.identities) {
            if (identity.getCategory().equals(str) && identity.getType().equals(str2)) {
                arrayList.add(identity);
            }
        }
        return arrayList;
    }

    public DiscoverInfo(DiscoverInfo discoverInfo) {
        super((C15617IQ) discoverInfo);
        setNode(discoverInfo.getNode());
        for (Feature clone : discoverInfo.features) {
            addFeature(clone.clone());
        }
        for (Identity clone2 : discoverInfo.identities) {
            addIdentity(clone2.clone());
        }
    }
}
