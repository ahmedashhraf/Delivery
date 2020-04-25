package org.jivesoftware.smackx.xdata.packet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import org.jivesoftware.smack.packet.Element;
import org.jivesoftware.smack.packet.ExtensionElement;
import org.jivesoftware.smack.packet.NamedElement;
import org.jivesoftware.smack.packet.Stanza;
import org.jivesoftware.smack.util.XmlStringBuilder;
import org.jivesoftware.smackx.xdata.FormField;

public class DataForm implements ExtensionElement {
    public static final String ELEMENT = "x";
    public static final String NAMESPACE = "jabber:x:data";
    private final List<Element> extensionElements = new ArrayList();
    private final List<FormField> fields = new ArrayList();
    private List<String> instructions = new ArrayList();
    private final List<Item> items = new ArrayList();
    private ReportedData reportedData;
    private String title;
    private Type type;

    public static class Item {
        public static final String ELEMENT = "item";
        private List<FormField> fields = new ArrayList();

        public Item(List<FormField> list) {
            this.fields = list;
        }

        public List<FormField> getFields() {
            return Collections.unmodifiableList(new ArrayList(this.fields));
        }

        public CharSequence toXML() {
            XmlStringBuilder xmlStringBuilder = new XmlStringBuilder();
            String str = "item";
            xmlStringBuilder.openElement(str);
            for (FormField xml : getFields()) {
                xmlStringBuilder.append(xml.toXML());
            }
            xmlStringBuilder.closeElement(str);
            return xmlStringBuilder;
        }
    }

    public static class ReportedData {
        public static final String ELEMENT = "reported";
        private List<FormField> fields = new ArrayList();

        public ReportedData(List<FormField> list) {
            this.fields = list;
        }

        public List<FormField> getFields() {
            return Collections.unmodifiableList(new ArrayList(this.fields));
        }

        public CharSequence toXML() {
            XmlStringBuilder xmlStringBuilder = new XmlStringBuilder();
            String str = ELEMENT;
            xmlStringBuilder.openElement(str);
            for (FormField xml : getFields()) {
                xmlStringBuilder.append(xml.toXML());
            }
            xmlStringBuilder.closeElement(str);
            return xmlStringBuilder;
        }
    }

    public enum Type {
        form,
        submit,
        cancel,
        result;

        public static Type fromString(String str) {
            return valueOf(str.toLowerCase(Locale.US));
        }
    }

    public DataForm(Type type2) {
        this.type = type2;
    }

    public static DataForm from(Stanza stanza) {
        return (DataForm) stanza.getExtension("x", "jabber:x:data");
    }

    public void addExtensionElement(Element element) {
        this.extensionElements.add(element);
    }

    public void addField(FormField formField) {
        String variable = formField.getVariable();
        if (variable == null || getField(variable) == null) {
            synchronized (this.fields) {
                this.fields.add(formField);
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("This data form already contains a form field with the variable name '");
        sb.append(variable);
        sb.append("'");
        throw new IllegalArgumentException(sb.toString());
    }

    public void addInstruction(String str) {
        synchronized (this.instructions) {
            this.instructions.add(str);
        }
    }

    public void addItem(Item item) {
        synchronized (this.items) {
            this.items.add(item);
        }
    }

    public String getElementName() {
        return "x";
    }

    public List<Element> getExtensionElements() {
        return Collections.unmodifiableList(this.extensionElements);
    }

    public FormField getField(String str) {
        synchronized (this.fields) {
            for (FormField formField : this.fields) {
                if (str.equals(formField.getVariable())) {
                    return formField;
                }
            }
            return null;
        }
    }

    public List<FormField> getFields() {
        List<FormField> unmodifiableList;
        synchronized (this.fields) {
            unmodifiableList = Collections.unmodifiableList(new ArrayList(this.fields));
        }
        return unmodifiableList;
    }

    public FormField getHiddenFormTypeField() {
        FormField field = getField(FormField.FORM_TYPE);
        if (field == null || field.getType() != org.jivesoftware.smackx.xdata.FormField.Type.hidden) {
            return null;
        }
        return field;
    }

    public List<String> getInstructions() {
        List<String> unmodifiableList;
        synchronized (this.instructions) {
            unmodifiableList = Collections.unmodifiableList(new ArrayList(this.instructions));
        }
        return unmodifiableList;
    }

    public List<Item> getItems() {
        List<Item> unmodifiableList;
        synchronized (this.items) {
            unmodifiableList = Collections.unmodifiableList(new ArrayList(this.items));
        }
        return unmodifiableList;
    }

    public String getNamespace() {
        return "jabber:x:data";
    }

    public ReportedData getReportedData() {
        return this.reportedData;
    }

    public String getTitle() {
        return this.title;
    }

    public Type getType() {
        return this.type;
    }

    public boolean hasHiddenFormTypeField() {
        return getHiddenFormTypeField() != null;
    }

    public void setInstructions(List<String> list) {
        this.instructions = list;
    }

    public void setReportedData(ReportedData reportedData2) {
        this.reportedData = reportedData2;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public XmlStringBuilder toXML() {
        XmlStringBuilder xmlStringBuilder = new XmlStringBuilder((ExtensionElement) this);
        xmlStringBuilder.attribute("type", (Enum<?>) getType());
        xmlStringBuilder.rightAngleBracket();
        xmlStringBuilder.optElement("title", getTitle());
        for (String element : getInstructions()) {
            xmlStringBuilder.element("instructions", element);
        }
        if (getReportedData() != null) {
            xmlStringBuilder.append(getReportedData().toXML());
        }
        for (Item xml : getItems()) {
            xmlStringBuilder.append(xml.toXML());
        }
        for (FormField xml2 : getFields()) {
            xmlStringBuilder.append(xml2.toXML());
        }
        for (Element xml3 : this.extensionElements) {
            xmlStringBuilder.append(xml3.toXML());
        }
        xmlStringBuilder.closeElement((NamedElement) this);
        return xmlStringBuilder;
    }
}
