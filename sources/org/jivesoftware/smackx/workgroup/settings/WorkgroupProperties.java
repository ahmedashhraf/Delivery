package org.jivesoftware.smackx.workgroup.settings;

import java.io.IOException;
import org.jivesoftware.smack.packet.C15617IQ;
import org.jivesoftware.smack.packet.C15617IQ.IQChildElementXmlStringBuilder;
import org.jivesoftware.smack.provider.IQProvider;
import org.jivesoftware.smackx.workgroup.util.ModelUtil;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class WorkgroupProperties extends C15617IQ {
    public static final String ELEMENT_NAME = "workgroup-properties";
    public static final String NAMESPACE = "http://jivesoftware.com/protocol/workgroup";
    private boolean authRequired;
    private String email;
    private String fullName;
    private String jid;

    public static class InternalProvider extends IQProvider<WorkgroupProperties> {
        public WorkgroupProperties parse(XmlPullParser xmlPullParser, int i) throws XmlPullParserException, IOException {
            WorkgroupProperties workgroupProperties = new WorkgroupProperties();
            boolean z = false;
            while (!z) {
                int next = xmlPullParser.next();
                if (next == 2) {
                    if ("authRequired".equals(xmlPullParser.getName())) {
                        workgroupProperties.setAuthRequired(new Boolean(xmlPullParser.nextText()).booleanValue());
                    }
                }
                if (next == 2) {
                    if ("email".equals(xmlPullParser.getName())) {
                        workgroupProperties.setEmail(xmlPullParser.nextText());
                    }
                }
                if (next == 2) {
                    if ("name".equals(xmlPullParser.getName())) {
                        workgroupProperties.setFullName(xmlPullParser.nextText());
                    }
                }
                if (next == 3) {
                    if (WorkgroupProperties.ELEMENT_NAME.equals(xmlPullParser.getName())) {
                        z = true;
                    }
                }
            }
            return workgroupProperties;
        }
    }

    public WorkgroupProperties() {
        super(ELEMENT_NAME, "http://jivesoftware.com/protocol/workgroup");
    }

    public String getEmail() {
        return this.email;
    }

    public String getFullName() {
        return this.fullName;
    }

    /* access modifiers changed from: protected */
    public IQChildElementXmlStringBuilder getIQChildElementBuilder(IQChildElementXmlStringBuilder iQChildElementXmlStringBuilder) {
        if (ModelUtil.hasLength(getJid())) {
            StringBuilder sb = new StringBuilder();
            sb.append("jid=\"");
            sb.append(getJid());
            sb.append("\" ");
            iQChildElementXmlStringBuilder.append((CharSequence) sb.toString());
        }
        iQChildElementXmlStringBuilder.setEmptyElement();
        return iQChildElementXmlStringBuilder;
    }

    public String getJid() {
        return this.jid;
    }

    public boolean isAuthRequired() {
        return this.authRequired;
    }

    public void setAuthRequired(boolean z) {
        this.authRequired = z;
    }

    public void setEmail(String str) {
        this.email = str;
    }

    public void setFullName(String str) {
        this.fullName = str;
    }

    public void setJid(String str) {
        this.jid = str;
    }
}
