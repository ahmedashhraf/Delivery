package org.jivesoftware.smackx.p558si.packet;

import com.facebook.common.util.UriUtil;
import com.google.android.gms.common.C4420j;
import java.util.Date;
import org.jivesoftware.smack.packet.C15617IQ;
import org.jivesoftware.smack.packet.C15617IQ.IQChildElementXmlStringBuilder;
import org.jivesoftware.smack.packet.C15617IQ.Type;
import org.jivesoftware.smack.packet.ExtensionElement;
import org.jivesoftware.smack.util.StringUtils;
import org.jivesoftware.smackx.filetransfer.FileTransferNegotiator;
import org.jivesoftware.smackx.xdata.packet.DataForm;
import p205i.p486d.p487a.C14051a;

/* renamed from: org.jivesoftware.smackx.si.packet.StreamInitiation */
public class StreamInitiation extends C15617IQ {
    public static final String ELEMENT = "si";
    public static final String NAMESPACE = "http://jabber.org/protocol/si";
    private Feature featureNegotiation;
    private File file;

    /* renamed from: id */
    private String f45016id;
    private String mimeType;

    /* renamed from: org.jivesoftware.smackx.si.packet.StreamInitiation$1 */
    static /* synthetic */ class C157271 {
        static final /* synthetic */ int[] $SwitchMap$org$jivesoftware$smack$packet$IQ$Type = new int[Type.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                org.jivesoftware.smack.packet.IQ$Type[] r0 = org.jivesoftware.smack.packet.C15617IQ.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$org$jivesoftware$smack$packet$IQ$Type = r0
                int[] r0 = $SwitchMap$org$jivesoftware$smack$packet$IQ$Type     // Catch:{ NoSuchFieldError -> 0x0014 }
                org.jivesoftware.smack.packet.IQ$Type r1 = org.jivesoftware.smack.packet.C15617IQ.Type.set     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = $SwitchMap$org$jivesoftware$smack$packet$IQ$Type     // Catch:{ NoSuchFieldError -> 0x001f }
                org.jivesoftware.smack.packet.IQ$Type r1 = org.jivesoftware.smack.packet.C15617IQ.Type.result     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smackx.p558si.packet.StreamInitiation.C157271.<clinit>():void");
        }
    }

    /* renamed from: org.jivesoftware.smackx.si.packet.StreamInitiation$Feature */
    public class Feature implements ExtensionElement {
        private final DataForm data;

        public Feature(DataForm dataForm) {
            this.data = dataForm;
        }

        public DataForm getData() {
            return this.data;
        }

        public String getElementName() {
            return "feature";
        }

        public String getNamespace() {
            return "http://jabber.org/protocol/feature-neg";
        }

        public String toXML() {
            StringBuilder sb = new StringBuilder();
            sb.append("<feature xmlns=\"http://jabber.org/protocol/feature-neg\">");
            sb.append(this.data.toXML());
            sb.append("</feature>");
            return sb.toString();
        }
    }

    /* renamed from: org.jivesoftware.smackx.si.packet.StreamInitiation$File */
    public static class File implements ExtensionElement {
        private Date date;
        private String desc;
        private String hash;
        private boolean isRanged;
        private final String name;
        private final long size;

        public File(String str, long j) {
            if (str != null) {
                this.name = str;
                this.size = j;
                return;
            }
            throw new NullPointerException("name cannot be null");
        }

        public Date getDate() {
            return this.date;
        }

        public String getDesc() {
            return this.desc;
        }

        public String getElementName() {
            return UriUtil.LOCAL_FILE_SCHEME;
        }

        public String getHash() {
            return this.hash;
        }

        public String getName() {
            return this.name;
        }

        public String getNamespace() {
            return FileTransferNegotiator.SI_PROFILE_FILE_TRANSFER_NAMESPACE;
        }

        public long getSize() {
            return this.size;
        }

        public boolean isRanged() {
            return this.isRanged;
        }

        public void setDate(Date date2) {
            this.date = date2;
        }

        public void setDesc(String str) {
            this.desc = str;
        }

        public void setHash(String str) {
            this.hash = str;
        }

        public void setRanged(boolean z) {
            this.isRanged = z;
        }

        public String toXML() {
            StringBuilder sb = new StringBuilder();
            sb.append("<");
            sb.append(getElementName());
            sb.append(" xmlns=\"");
            sb.append(getNamespace());
            String str = "\" ";
            sb.append(str);
            if (getName() != null) {
                sb.append("name=\"");
                sb.append(StringUtils.escapeForXML(getName()));
                sb.append(str);
            }
            if (getSize() > 0) {
                sb.append("size=\"");
                sb.append(getSize());
                sb.append(str);
            }
            if (getDate() != null) {
                sb.append("date=\"");
                sb.append(C14051a.m60622a(this.date));
                sb.append(str);
            }
            if (getHash() != null) {
                sb.append("hash=\"");
                sb.append(getHash());
                sb.append(str);
            }
            String str2 = this.desc;
            if ((str2 == null || str2.length() <= 0) && !this.isRanged) {
                sb.append("/>");
            } else {
                String str3 = ">";
                sb.append(str3);
                if (getDesc() != null && this.desc.length() > 0) {
                    sb.append("<desc>");
                    sb.append(StringUtils.escapeForXML(getDesc()));
                    sb.append("</desc>");
                }
                if (isRanged()) {
                    sb.append("<range/>");
                }
                sb.append("</");
                sb.append(getElementName());
                sb.append(str3);
            }
            return sb.toString();
        }
    }

    public StreamInitiation() {
        super(ELEMENT, "http://jabber.org/protocol/si");
    }

    public DataForm getFeatureNegotiationForm() {
        return this.featureNegotiation.getData();
    }

    public File getFile() {
        return this.file;
    }

    /* access modifiers changed from: protected */
    public IQChildElementXmlStringBuilder getIQChildElementBuilder(IQChildElementXmlStringBuilder iQChildElementXmlStringBuilder) {
        int i = C157271.$SwitchMap$org$jivesoftware$smack$packet$IQ$Type[getType().ordinal()];
        if (i == 1) {
            iQChildElementXmlStringBuilder.optAttribute("id", getSessionID());
            iQChildElementXmlStringBuilder.optAttribute("mime-type", getMimeType());
            iQChildElementXmlStringBuilder.attribute(C4420j.f13552a, FileTransferNegotiator.SI_PROFILE_FILE_TRANSFER_NAMESPACE);
            iQChildElementXmlStringBuilder.rightAngleBracket();
            iQChildElementXmlStringBuilder.optAppend((CharSequence) this.file.toXML());
        } else if (i == 2) {
            iQChildElementXmlStringBuilder.rightAngleBracket();
        } else {
            throw new IllegalArgumentException("IQ Type not understood");
        }
        Feature feature = this.featureNegotiation;
        if (feature != null) {
            iQChildElementXmlStringBuilder.append((CharSequence) feature.toXML());
        }
        return iQChildElementXmlStringBuilder;
    }

    public String getMimeType() {
        return this.mimeType;
    }

    public String getSessionID() {
        return this.f45016id;
    }

    public void setFeatureNegotiationForm(DataForm dataForm) {
        this.featureNegotiation = new Feature(dataForm);
    }

    public void setFile(File file2) {
        this.file = file2;
    }

    public void setMimeType(String str) {
        this.mimeType = str;
    }

    public void setSessionID(String str) {
        this.f45016id = str;
    }
}
