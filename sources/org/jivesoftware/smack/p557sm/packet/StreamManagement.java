package org.jivesoftware.smack.p557sm.packet;

import com.facebook.internal.ServerProtocol;
import org.jivesoftware.smack.packet.ExtensionElement;
import org.jivesoftware.smack.packet.FullStreamElement;
import org.jivesoftware.smack.packet.XMPPError;
import org.jivesoftware.smack.packet.XMPPError.Condition;
import org.jivesoftware.smack.util.XmlStringBuilder;
import org.jivesoftware.smackx.xhtmlim.XHTMLText;

/* renamed from: org.jivesoftware.smack.sm.packet.StreamManagement */
public class StreamManagement {
    public static final String NAMESPACE = "urn:xmpp:sm:3";

    /* renamed from: org.jivesoftware.smack.sm.packet.StreamManagement$AbstractEnable */
    private static abstract class AbstractEnable extends FullStreamElement {
        protected int max;
        protected boolean resume;

        private AbstractEnable() {
            this.max = -1;
            this.resume = false;
        }

        public int getMaxResumptionTime() {
            return this.max;
        }

        public final String getNamespace() {
            return StreamManagement.NAMESPACE;
        }

        public boolean isResumeSet() {
            return this.resume;
        }

        /* access modifiers changed from: protected */
        public void maybeAddMaxAttributeTo(XmlStringBuilder xmlStringBuilder) {
            int i = this.max;
            if (i > 0) {
                xmlStringBuilder.attribute("max", Integer.toString(i));
            }
        }

        /* access modifiers changed from: protected */
        public void maybeAddResumeAttributeTo(XmlStringBuilder xmlStringBuilder) {
            if (this.resume) {
                xmlStringBuilder.attribute(Resume.ELEMENT, ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
            }
        }
    }

    /* renamed from: org.jivesoftware.smack.sm.packet.StreamManagement$AbstractResume */
    private static abstract class AbstractResume extends FullStreamElement {
        private final long handledCount;
        private final String previd;

        public AbstractResume(long j, String str) {
            this.handledCount = j;
            this.previd = str;
        }

        public long getHandledCount() {
            return this.handledCount;
        }

        public final String getNamespace() {
            return StreamManagement.NAMESPACE;
        }

        public String getPrevId() {
            return this.previd;
        }

        public final XmlStringBuilder toXML() {
            XmlStringBuilder xmlStringBuilder = new XmlStringBuilder((ExtensionElement) this);
            xmlStringBuilder.attribute(XHTMLText.f45021H, Long.toString(this.handledCount));
            xmlStringBuilder.attribute("previd", this.previd);
            xmlStringBuilder.closeEmptyElement();
            return xmlStringBuilder;
        }
    }

    /* renamed from: org.jivesoftware.smack.sm.packet.StreamManagement$AckAnswer */
    public static class AckAnswer extends FullStreamElement {
        public static final String ELEMENT = "a";
        private final long handledCount;

        public AckAnswer(long j) {
            this.handledCount = j;
        }

        public String getElementName() {
            return "a";
        }

        public long getHandledCount() {
            return this.handledCount;
        }

        public String getNamespace() {
            return StreamManagement.NAMESPACE;
        }

        public CharSequence toXML() {
            XmlStringBuilder xmlStringBuilder = new XmlStringBuilder((ExtensionElement) this);
            xmlStringBuilder.attribute(XHTMLText.f45021H, Long.toString(this.handledCount));
            xmlStringBuilder.closeEmptyElement();
            return xmlStringBuilder;
        }
    }

    /* renamed from: org.jivesoftware.smack.sm.packet.StreamManagement$AckRequest */
    public static class AckRequest extends FullStreamElement {
        public static final String ELEMENT = "r";
        public static final AckRequest INSTANCE = new AckRequest();

        private AckRequest() {
        }

        public String getElementName() {
            return ELEMENT;
        }

        public String getNamespace() {
            return StreamManagement.NAMESPACE;
        }

        public CharSequence toXML() {
            return "<r xmlns='urn:xmpp:sm:3'/>";
        }
    }

    /* renamed from: org.jivesoftware.smack.sm.packet.StreamManagement$Enable */
    public static class Enable extends AbstractEnable {
        public static final String ELEMENT = "enable";
        public static final Enable INSTANCE = new Enable();

        private Enable() {
            super();
        }

        public String getElementName() {
            return ELEMENT;
        }

        public /* bridge */ /* synthetic */ int getMaxResumptionTime() {
            return super.getMaxResumptionTime();
        }

        public /* bridge */ /* synthetic */ boolean isResumeSet() {
            return super.isResumeSet();
        }

        public CharSequence toXML() {
            XmlStringBuilder xmlStringBuilder = new XmlStringBuilder((ExtensionElement) this);
            maybeAddResumeAttributeTo(xmlStringBuilder);
            maybeAddMaxAttributeTo(xmlStringBuilder);
            xmlStringBuilder.closeEmptyElement();
            return xmlStringBuilder;
        }

        public Enable(boolean z) {
            super();
            this.resume = z;
        }

        public Enable(boolean z, int i) {
            this(z);
            this.max = i;
        }
    }

    /* renamed from: org.jivesoftware.smack.sm.packet.StreamManagement$Enabled */
    public static class Enabled extends AbstractEnable {
        public static final String ELEMENT = "enabled";

        /* renamed from: id */
        private final String f44990id;
        private final String location;

        public Enabled(String str, boolean z) {
            this(str, z, null, -1);
        }

        public String getElementName() {
            return ELEMENT;
        }

        public String getId() {
            return this.f44990id;
        }

        public String getLocation() {
            return this.location;
        }

        public /* bridge */ /* synthetic */ int getMaxResumptionTime() {
            return super.getMaxResumptionTime();
        }

        public /* bridge */ /* synthetic */ boolean isResumeSet() {
            return super.isResumeSet();
        }

        public CharSequence toXML() {
            XmlStringBuilder xmlStringBuilder = new XmlStringBuilder((ExtensionElement) this);
            xmlStringBuilder.optAttribute("id", this.f44990id);
            maybeAddResumeAttributeTo(xmlStringBuilder);
            xmlStringBuilder.optAttribute("location", this.location);
            maybeAddMaxAttributeTo(xmlStringBuilder);
            xmlStringBuilder.closeEmptyElement();
            return xmlStringBuilder;
        }

        public Enabled(String str, boolean z, String str2, int i) {
            super();
            this.f44990id = str;
            this.resume = z;
            this.location = str2;
            this.max = i;
        }
    }

    /* renamed from: org.jivesoftware.smack.sm.packet.StreamManagement$Failed */
    public static class Failed extends FullStreamElement {
        public static final String ELEMENT = "failed";
        private Condition condition;

        public Failed() {
        }

        public String getElementName() {
            return ELEMENT;
        }

        public String getNamespace() {
            return StreamManagement.NAMESPACE;
        }

        public Condition getXMPPErrorCondition() {
            return this.condition;
        }

        public CharSequence toXML() {
            XmlStringBuilder xmlStringBuilder = new XmlStringBuilder((ExtensionElement) this);
            if (this.condition != null) {
                xmlStringBuilder.rightAngleBracket();
                xmlStringBuilder.append((CharSequence) this.condition.toString());
                xmlStringBuilder.xmlnsAttribute(XMPPError.NAMESPACE);
                xmlStringBuilder.closeElement(ELEMENT);
            } else {
                xmlStringBuilder.closeEmptyElement();
            }
            return xmlStringBuilder;
        }

        public Failed(Condition condition2) {
            this.condition = condition2;
        }
    }

    /* renamed from: org.jivesoftware.smack.sm.packet.StreamManagement$Resume */
    public static class Resume extends AbstractResume {
        public static final String ELEMENT = "resume";

        public Resume(long j, String str) {
            super(j, str);
        }

        public String getElementName() {
            return ELEMENT;
        }

        public /* bridge */ /* synthetic */ long getHandledCount() {
            return super.getHandledCount();
        }

        public /* bridge */ /* synthetic */ String getPrevId() {
            return super.getPrevId();
        }
    }

    /* renamed from: org.jivesoftware.smack.sm.packet.StreamManagement$Resumed */
    public static class Resumed extends AbstractResume {
        public static final String ELEMENT = "resumed";

        public Resumed(long j, String str) {
            super(j, str);
        }

        public String getElementName() {
            return ELEMENT;
        }

        public /* bridge */ /* synthetic */ long getHandledCount() {
            return super.getHandledCount();
        }

        public /* bridge */ /* synthetic */ String getPrevId() {
            return super.getPrevId();
        }
    }

    /* renamed from: org.jivesoftware.smack.sm.packet.StreamManagement$StreamManagementFeature */
    public static class StreamManagementFeature implements ExtensionElement {
        public static final String ELEMENT = "sm";
        public static final StreamManagementFeature INSTANCE = new StreamManagementFeature();

        private StreamManagementFeature() {
        }

        public String getElementName() {
            return ELEMENT;
        }

        public String getNamespace() {
            return StreamManagement.NAMESPACE;
        }

        public CharSequence toXML() {
            XmlStringBuilder xmlStringBuilder = new XmlStringBuilder((ExtensionElement) this);
            xmlStringBuilder.closeEmptyElement();
            return xmlStringBuilder;
        }
    }
}
