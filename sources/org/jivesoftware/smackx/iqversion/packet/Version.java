package org.jivesoftware.smackx.iqversion.packet;

import com.instabug.library.model.State;
import org.jivesoftware.smack.packet.C15617IQ;
import org.jivesoftware.smack.packet.C15617IQ.IQChildElementXmlStringBuilder;
import org.jivesoftware.smack.packet.C15617IQ.Type;
import org.jivesoftware.smack.packet.Stanza;
import org.jivesoftware.smack.util.StringUtils;

public class Version extends C15617IQ {
    public static final String ELEMENT = "query";
    public static final String NAMESPACE = "jabber:iq:version";
    private final String name;

    /* renamed from: os */
    private String f44999os;
    private final String version;

    public Version() {
        super("query", NAMESPACE);
        this.name = null;
        this.version = null;
        setType(Type.get);
    }

    public static Version createResultFor(Stanza stanza, Version version2) {
        Version version3 = new Version(version2);
        version3.setStanzaId(stanza.getStanzaId());
        version3.setTo(stanza.getFrom());
        return version3;
    }

    /* access modifiers changed from: protected */
    public IQChildElementXmlStringBuilder getIQChildElementBuilder(IQChildElementXmlStringBuilder iQChildElementXmlStringBuilder) {
        iQChildElementXmlStringBuilder.rightAngleBracket();
        iQChildElementXmlStringBuilder.optElement("name", this.name);
        iQChildElementXmlStringBuilder.optElement("version", this.version);
        iQChildElementXmlStringBuilder.optElement(State.KEY_OS, this.f44999os);
        return iQChildElementXmlStringBuilder;
    }

    public String getName() {
        return this.name;
    }

    public String getOs() {
        return this.f44999os;
    }

    public String getVersion() {
        return this.version;
    }

    public void setOs(String str) {
        this.f44999os = str;
    }

    public Version(String str) {
        this();
        setTo(str);
    }

    public Version(String str, String str2) {
        this(str, str2, null);
    }

    public Version(String str, String str2, String str3) {
        super("query", NAMESPACE);
        setType(Type.result);
        this.name = (String) StringUtils.requireNotNullOrEmpty(str, "name must not be null");
        this.version = (String) StringUtils.requireNotNullOrEmpty(str2, "version must not be null");
        this.f44999os = str3;
    }

    public Version(Version version2) {
        this(version2.name, version2.version, version2.f44999os);
    }
}
