package org.jivesoftware.smackx.xdata;

import com.google.android.gms.plus.C5493f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.jivesoftware.smack.packet.NamedElement;
import org.jivesoftware.smack.util.XmlStringBuilder;
import org.jivesoftware.smackx.xdatavalidation.packet.ValidateElement;

public class FormField implements NamedElement {
    public static final String ELEMENT = "field";
    public static final String FORM_TYPE = "FORM_TYPE";
    private String description;
    private String label;
    private final List<Option> options;
    private boolean required;
    private Type type;
    private ValidateElement validateElement;
    private final List<String> values;
    private final String variable;

    /* renamed from: org.jivesoftware.smackx.xdata.FormField$1 */
    static /* synthetic */ class C157421 {
        static final /* synthetic */ int[] $SwitchMap$org$jivesoftware$smackx$xdata$FormField$Type = new int[Type.values().length];

        static {
            try {
                $SwitchMap$org$jivesoftware$smackx$xdata$FormField$Type[Type.bool.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public static class Option implements NamedElement {
        public static final String ELEMENT = "option";
        private String label;
        private final String value;

        public Option(String str) {
            this.value = str;
        }

        public boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            if (obj.getClass() != Option.class) {
                return false;
            }
            Option option = (Option) obj;
            if (!this.value.equals(option.value)) {
                return false;
            }
            String str = this.label;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            String str3 = option.label;
            if (str3 == null) {
                str3 = str2;
            }
            return str.equals(str3);
        }

        public String getElementName() {
            return ELEMENT;
        }

        public String getLabel() {
            return this.label;
        }

        public String getValue() {
            return this.value;
        }

        public int hashCode() {
            int hashCode = (this.value.hashCode() + 37) * 37;
            String str = this.label;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return getLabel();
        }

        public XmlStringBuilder toXML() {
            XmlStringBuilder xmlStringBuilder = new XmlStringBuilder((NamedElement) this);
            xmlStringBuilder.optAttribute(C5493f.f15781i, getLabel());
            xmlStringBuilder.rightAngleBracket();
            xmlStringBuilder.element("value", getValue());
            xmlStringBuilder.closeElement((NamedElement) this);
            return xmlStringBuilder;
        }

        public Option(String str, String str2) {
            this.label = str;
            this.value = str2;
        }
    }

    public enum Type {
        bool,
        fixed,
        hidden,
        jid_multi,
        jid_single,
        list_multi,
        list_single,
        text_multi,
        text_private,
        text_single;

        public static Type fromString(String str) {
            if (str == null) {
                return null;
            }
            char c = 65535;
            if (str.hashCode() == 64711720 && str.equals("boolean")) {
                c = 0;
            }
            if (c != 0) {
                return valueOf(str.replace('-', '_'));
            }
            return bool;
        }

        public String toString() {
            return C157421.$SwitchMap$org$jivesoftware$smackx$xdata$FormField$Type[ordinal()] != 1 ? name().replace('_', '-') : "boolean";
        }
    }

    public FormField(String str) {
        this.required = false;
        this.options = new ArrayList();
        this.values = new ArrayList();
        this.variable = str;
    }

    public void addOption(Option option) {
        synchronized (this.options) {
            this.options.add(option);
        }
    }

    public void addValue(String str) {
        synchronized (this.values) {
            this.values.add(str);
        }
    }

    public void addValues(List<String> list) {
        synchronized (this.values) {
            this.values.addAll(list);
        }
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FormField)) {
            return false;
        }
        return toXML().equals(((FormField) obj).toXML());
    }

    public String getDescription() {
        return this.description;
    }

    public String getElementName() {
        return ELEMENT;
    }

    public String getLabel() {
        return this.label;
    }

    public List<Option> getOptions() {
        List<Option> unmodifiableList;
        synchronized (this.options) {
            unmodifiableList = Collections.unmodifiableList(new ArrayList(this.options));
        }
        return unmodifiableList;
    }

    public Type getType() {
        return this.type;
    }

    public ValidateElement getValidateElement() {
        return this.validateElement;
    }

    public List<String> getValues() {
        List<String> unmodifiableList;
        synchronized (this.values) {
            unmodifiableList = Collections.unmodifiableList(new ArrayList(this.values));
        }
        return unmodifiableList;
    }

    public String getVariable() {
        return this.variable;
    }

    public int hashCode() {
        return toXML().hashCode();
    }

    public boolean isRequired() {
        return this.required;
    }

    /* access modifiers changed from: protected */
    public void resetValues() {
        synchronized (this.values) {
            this.values.removeAll(new ArrayList(this.values));
        }
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setLabel(String str) {
        this.label = str;
    }

    public void setRequired(boolean z) {
        this.required = z;
    }

    public void setType(Type type2) {
        if (type2 != Type.fixed) {
            this.type = type2;
            return;
        }
        throw new IllegalArgumentException("Can not set type to fixed, use FormField constructor without arguments instead.");
    }

    public void setValidateElement(ValidateElement validateElement2) {
        validateElement2.checkConsistency(this);
        this.validateElement = validateElement2;
    }

    public XmlStringBuilder toXML() {
        XmlStringBuilder xmlStringBuilder = new XmlStringBuilder((NamedElement) this);
        xmlStringBuilder.optAttribute(C5493f.f15781i, getLabel());
        xmlStringBuilder.optAttribute("var", getVariable());
        xmlStringBuilder.optAttribute("type", (Enum<?>) getType());
        xmlStringBuilder.rightAngleBracket();
        xmlStringBuilder.optElement("desc", getDescription());
        xmlStringBuilder.condEmptyElement(isRequired(), "required");
        for (String element : getValues()) {
            xmlStringBuilder.element("value", element);
        }
        for (Option xml : getOptions()) {
            xmlStringBuilder.append(xml.toXML());
        }
        xmlStringBuilder.optElement(this.validateElement);
        xmlStringBuilder.closeElement((NamedElement) this);
        return xmlStringBuilder;
    }

    public FormField() {
        this(null);
        this.type = Type.fixed;
    }
}
