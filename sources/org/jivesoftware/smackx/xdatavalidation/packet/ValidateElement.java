package org.jivesoftware.smackx.xdatavalidation.packet;

import org.jivesoftware.smack.packet.Element;
import org.jivesoftware.smack.packet.ExtensionElement;
import org.jivesoftware.smack.packet.NamedElement;
import org.jivesoftware.smack.util.NumberUtil;
import org.jivesoftware.smack.util.StringUtils;
import org.jivesoftware.smack.util.XmlStringBuilder;
import org.jivesoftware.smackx.xdata.FormField;
import org.jivesoftware.smackx.xdata.FormField.Type;
import org.jivesoftware.smackx.xdatavalidation.ValidationConsistencyException;

public abstract class ValidateElement implements ExtensionElement {
    public static final String DATATYPE_XS_STRING = "xs:string";
    public static final String ELEMENT = "validate";
    public static final String NAMESPACE = "http://jabber.org/protocol/xdata-validate";
    private final String datatype;
    private ListRange listRange;

    /* renamed from: org.jivesoftware.smackx.xdatavalidation.packet.ValidateElement$1 */
    static /* synthetic */ class C157461 {
        static final /* synthetic */ int[] $SwitchMap$org$jivesoftware$smackx$xdata$FormField$Type = new int[Type.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                org.jivesoftware.smackx.xdata.FormField$Type[] r0 = org.jivesoftware.smackx.xdata.FormField.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$org$jivesoftware$smackx$xdata$FormField$Type = r0
                int[] r0 = $SwitchMap$org$jivesoftware$smackx$xdata$FormField$Type     // Catch:{ NoSuchFieldError -> 0x0014 }
                org.jivesoftware.smackx.xdata.FormField$Type r1 = org.jivesoftware.smackx.xdata.FormField.Type.hidden     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = $SwitchMap$org$jivesoftware$smackx$xdata$FormField$Type     // Catch:{ NoSuchFieldError -> 0x001f }
                org.jivesoftware.smackx.xdata.FormField$Type r1 = org.jivesoftware.smackx.xdata.FormField.Type.jid_multi     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = $SwitchMap$org$jivesoftware$smackx$xdata$FormField$Type     // Catch:{ NoSuchFieldError -> 0x002a }
                org.jivesoftware.smackx.xdata.FormField$Type r1 = org.jivesoftware.smackx.xdata.FormField.Type.jid_single     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = $SwitchMap$org$jivesoftware$smackx$xdata$FormField$Type     // Catch:{ NoSuchFieldError -> 0x0035 }
                org.jivesoftware.smackx.xdata.FormField$Type r1 = org.jivesoftware.smackx.xdata.FormField.Type.list_multi     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = $SwitchMap$org$jivesoftware$smackx$xdata$FormField$Type     // Catch:{ NoSuchFieldError -> 0x0040 }
                org.jivesoftware.smackx.xdata.FormField$Type r1 = org.jivesoftware.smackx.xdata.FormField.Type.text_multi     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smackx.xdatavalidation.packet.ValidateElement.C157461.<clinit>():void");
        }
    }

    public static class BasicValidateElement extends ValidateElement {
        public static final String METHOD = "basic";

        public BasicValidateElement(String str) {
            super(str, null);
        }

        /* access modifiers changed from: protected */
        public void appendXML(XmlStringBuilder xmlStringBuilder) {
            xmlStringBuilder.emptyElement(METHOD);
        }

        public void checkConsistency(FormField formField) {
            checkListRangeConsistency(formField);
            if (formField.getType() != null) {
                int i = C157461.$SwitchMap$org$jivesoftware$smackx$xdata$FormField$Type[formField.getType().ordinal()];
                if (i == 1 || i == 2 || i == 3) {
                    throw new ValidationConsistencyException(String.format("Field type '%1$s' is not consistent with validation method '%2$s'.", new Object[]{formField.getType(), METHOD}));
                }
            }
        }

        public /* bridge */ /* synthetic */ CharSequence toXML() {
            return ValidateElement.super.toXML();
        }
    }

    public static class ListRange implements NamedElement {
        public static final String ELEMENT = "list-range";
        private final Long max;
        private final Long min;

        public ListRange(Long l, Long l2) {
            if (l != null) {
                NumberUtil.checkIfInUInt32Range(l.longValue());
            }
            if (l2 != null) {
                NumberUtil.checkIfInUInt32Range(l2.longValue());
            }
            if (l2 == null && l == null) {
                throw new IllegalArgumentException("Either min or max must be given");
            }
            this.min = l;
            this.max = l2;
        }

        public String getElementName() {
            return ELEMENT;
        }

        public Long getMax() {
            return this.max;
        }

        public Long getMin() {
            return this.min;
        }

        public XmlStringBuilder toXML() {
            XmlStringBuilder xmlStringBuilder = new XmlStringBuilder((NamedElement) this);
            xmlStringBuilder.optLongAttribute("min", getMin());
            xmlStringBuilder.optLongAttribute("max", getMax());
            xmlStringBuilder.closeEmptyElement();
            return xmlStringBuilder;
        }
    }

    public static class OpenValidateElement extends ValidateElement {
        public static final String METHOD = "open";

        public OpenValidateElement(String str) {
            super(str, null);
        }

        /* access modifiers changed from: protected */
        public void appendXML(XmlStringBuilder xmlStringBuilder) {
            xmlStringBuilder.emptyElement("open");
        }

        public void checkConsistency(FormField formField) {
            checkListRangeConsistency(formField);
            if (formField.getType() != null && C157461.$SwitchMap$org$jivesoftware$smackx$xdata$FormField$Type[formField.getType().ordinal()] == 1) {
                throw new ValidationConsistencyException(String.format("Field type '%1$s' is not consistent with validation method '%2$s'.", new Object[]{formField.getType(), "open"}));
            }
        }

        public /* bridge */ /* synthetic */ CharSequence toXML() {
            return ValidateElement.super.toXML();
        }
    }

    public static class RangeValidateElement extends ValidateElement {
        public static final String METHOD = "range";
        private final String max;
        private final String min;

        public RangeValidateElement(String str, String str2, String str3) {
            super(str, null);
            this.min = str2;
            this.max = str3;
        }

        /* access modifiers changed from: protected */
        public void appendXML(XmlStringBuilder xmlStringBuilder) {
            xmlStringBuilder.halfOpenElement(METHOD);
            xmlStringBuilder.optAttribute("min", getMin());
            xmlStringBuilder.optAttribute("max", getMax());
            xmlStringBuilder.closeEmptyElement();
        }

        public void checkConsistency(FormField formField) {
            String str = METHOD;
            checkNonMultiConsistency(formField, str);
            if (getDatatype().equals(ValidateElement.DATATYPE_XS_STRING)) {
                throw new ValidationConsistencyException(String.format("Field data type '%1$s' is not consistent with validation method '%2$s'.", new Object[]{getDatatype(), str}));
            }
        }

        public String getMax() {
            return this.max;
        }

        public String getMin() {
            return this.min;
        }

        public /* bridge */ /* synthetic */ CharSequence toXML() {
            return ValidateElement.super.toXML();
        }
    }

    public static class RegexValidateElement extends ValidateElement {
        public static final String METHOD = "regex";
        private final String regex;

        public RegexValidateElement(String str, String str2) {
            super(str, null);
            this.regex = str2;
        }

        /* access modifiers changed from: protected */
        public void appendXML(XmlStringBuilder xmlStringBuilder) {
            xmlStringBuilder.element(METHOD, getRegex());
        }

        public void checkConsistency(FormField formField) {
            checkNonMultiConsistency(formField, METHOD);
        }

        public String getRegex() {
            return this.regex;
        }

        public /* bridge */ /* synthetic */ CharSequence toXML() {
            return ValidateElement.super.toXML();
        }
    }

    /* synthetic */ ValidateElement(String str, C157461 r2) {
        this(str);
    }

    /* access modifiers changed from: protected */
    public abstract void appendXML(XmlStringBuilder xmlStringBuilder);

    public abstract void checkConsistency(FormField formField);

    /* access modifiers changed from: protected */
    public void checkListRangeConsistency(FormField formField) {
        ListRange listRange2 = getListRange();
        if (listRange2 != null) {
            Long max = listRange2.getMax();
            Long min = listRange2.getMin();
            if ((max != null || min != null) && formField.getType() != Type.list_multi) {
                throw new ValidationConsistencyException("Field type is not of type 'list-multi' while a 'list-range' is defined.");
            }
        }
    }

    /* access modifiers changed from: protected */
    public void checkNonMultiConsistency(FormField formField, String str) {
        checkListRangeConsistency(formField);
        if (formField.getType() != null) {
            int i = C157461.$SwitchMap$org$jivesoftware$smackx$xdata$FormField$Type[formField.getType().ordinal()];
            if (i == 1 || i == 2 || i == 4 || i == 5) {
                throw new ValidationConsistencyException(String.format("Field type '%1$s' is not consistent with validation method '%2$s'.", new Object[]{formField.getType(), str}));
            }
        }
    }

    public String getDatatype() {
        String str = this.datatype;
        return str != null ? str : DATATYPE_XS_STRING;
    }

    public String getElementName() {
        return ELEMENT;
    }

    public ListRange getListRange() {
        return this.listRange;
    }

    public String getNamespace() {
        return NAMESPACE;
    }

    public void setListRange(ListRange listRange2) {
        this.listRange = listRange2;
    }

    private ValidateElement(String str) {
        if (!StringUtils.isNotEmpty(str)) {
            str = null;
        }
        this.datatype = str;
    }

    public XmlStringBuilder toXML() {
        XmlStringBuilder xmlStringBuilder = new XmlStringBuilder((ExtensionElement) this);
        xmlStringBuilder.optAttribute("datatype", this.datatype);
        xmlStringBuilder.rightAngleBracket();
        appendXML(xmlStringBuilder);
        xmlStringBuilder.optAppend((Element) getListRange());
        xmlStringBuilder.closeElement((NamedElement) this);
        return xmlStringBuilder;
    }
}
