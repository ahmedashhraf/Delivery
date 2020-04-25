package org.jivesoftware.smackx.rsm.packet;

import com.google.firebase.analytics.FirebaseAnalytics.C5854b;
import org.jivesoftware.smack.packet.ExtensionElement;
import org.jivesoftware.smack.packet.NamedElement;
import org.jivesoftware.smack.packet.Stanza;
import org.jivesoftware.smack.util.XmlStringBuilder;

public class RSMSet implements ExtensionElement {
    public static final String ELEMENT = "set";
    public static final String NAMESPACE = "http://jabber.org/protocol/rsm";
    private final String after;
    private final String before;
    private final int count;
    private final int firstIndex;
    private final String firstString;
    private final int index;
    private final String last;
    private final int max;

    /* renamed from: org.jivesoftware.smackx.rsm.packet.RSMSet$1 */
    static /* synthetic */ class C157261 {

        /* renamed from: $SwitchMap$org$jivesoftware$smackx$rsm$packet$RSMSet$PageDirection */
        static final /* synthetic */ int[] f45015x47d3bd1a = new int[PageDirection.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                org.jivesoftware.smackx.rsm.packet.RSMSet$PageDirection[] r0 = org.jivesoftware.smackx.rsm.packet.RSMSet.PageDirection.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f45015x47d3bd1a = r0
                int[] r0 = f45015x47d3bd1a     // Catch:{ NoSuchFieldError -> 0x0014 }
                org.jivesoftware.smackx.rsm.packet.RSMSet$PageDirection r1 = org.jivesoftware.smackx.rsm.packet.RSMSet.PageDirection.before     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f45015x47d3bd1a     // Catch:{ NoSuchFieldError -> 0x001f }
                org.jivesoftware.smackx.rsm.packet.RSMSet$PageDirection r1 = org.jivesoftware.smackx.rsm.packet.RSMSet.PageDirection.after     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smackx.rsm.packet.RSMSet.C157261.<clinit>():void");
        }
    }

    public enum PageDirection {
        before,
        after
    }

    public RSMSet(int i) {
        this(i, -1);
    }

    public static RSMSet from(Stanza stanza) {
        return (RSMSet) stanza.getExtension(ELEMENT, NAMESPACE);
    }

    public static RSMSet newAfter(String str) {
        return new RSMSet(str, PageDirection.after);
    }

    public static RSMSet newBefore(String str) {
        return new RSMSet(str, PageDirection.before);
    }

    public String getAfter() {
        return this.after;
    }

    public String getBefore() {
        return this.before;
    }

    public int getCount() {
        return this.count;
    }

    public String getElementName() {
        return ELEMENT;
    }

    public String getFirst() {
        return this.firstString;
    }

    public int getFirstIndex() {
        return this.firstIndex;
    }

    public int getIndex() {
        return this.index;
    }

    public String getLast() {
        return this.last;
    }

    public int getMax() {
        return this.max;
    }

    public String getNamespace() {
        return NAMESPACE;
    }

    public RSMSet(int i, int i2) {
        this(null, null, -1, i2, null, i, null, -1);
    }

    public XmlStringBuilder toXML() {
        XmlStringBuilder xmlStringBuilder = new XmlStringBuilder((ExtensionElement) this);
        xmlStringBuilder.rightAngleBracket();
        xmlStringBuilder.optElement("after", this.after);
        xmlStringBuilder.optElement("before", this.before);
        xmlStringBuilder.optIntElement("count", this.count);
        String str = this.firstString;
        String str2 = C5854b.f16918Y;
        if (str != null) {
            String str3 = "first";
            xmlStringBuilder.halfOpenElement(str3);
            xmlStringBuilder.optIntAttribute(str2, this.firstIndex);
            xmlStringBuilder.rightAngleBracket();
            xmlStringBuilder.append((CharSequence) this.firstString);
            xmlStringBuilder.closeElement(str3);
        }
        xmlStringBuilder.optIntElement(str2, this.index);
        xmlStringBuilder.optElement("last", this.last);
        xmlStringBuilder.optIntElement("max", this.max);
        xmlStringBuilder.closeElement((NamedElement) this);
        return xmlStringBuilder;
    }

    public RSMSet(String str, PageDirection pageDirection) {
        this(-1, str, pageDirection);
    }

    public RSMSet(int i, String str, PageDirection pageDirection) {
        int i2 = C157261.f45015x47d3bd1a[pageDirection.ordinal()];
        if (i2 == 1) {
            this.before = str;
            this.after = null;
        } else if (i2 == 2) {
            this.before = null;
            this.after = str;
        } else {
            throw new AssertionError();
        }
        this.count = -1;
        this.index = -1;
        this.last = null;
        this.max = i;
        this.firstString = null;
        this.firstIndex = -1;
    }

    public RSMSet(String str, String str2, int i, int i2, String str3, int i3, String str4, int i4) {
        this.after = str;
        this.before = str2;
        this.count = i;
        this.index = i2;
        this.last = str3;
        this.max = i3;
        this.firstString = str4;
        this.firstIndex = i4;
    }
}
