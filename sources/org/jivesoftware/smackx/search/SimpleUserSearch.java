package org.jivesoftware.smackx.search;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jivesoftware.smack.packet.C15617IQ;
import org.jivesoftware.smack.packet.C15617IQ.IQChildElementXmlStringBuilder;
import org.jivesoftware.smackx.search.ReportedData.Column;
import org.jivesoftware.smackx.search.ReportedData.Field;
import org.jivesoftware.smackx.search.ReportedData.Row;
import org.jivesoftware.smackx.xdata.Form;
import org.jivesoftware.smackx.xdata.FormField;
import org.jivesoftware.smackx.xdata.FormField.Type;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

class SimpleUserSearch extends C15617IQ {
    public static final String ELEMENT = "query";
    public static final String NAMESPACE = "jabber:iq:search";
    private ReportedData data;
    private Form form;

    public SimpleUserSearch() {
        super("query", "jabber:iq:search");
    }

    private String getItemsToSearch() {
        StringBuilder sb = new StringBuilder();
        if (this.form == null) {
            this.form = Form.getFormFrom(this);
        }
        Form form2 = this.form;
        if (form2 == null) {
            return "";
        }
        for (FormField formField : form2.getFields()) {
            String variable = formField.getVariable();
            String singleValue = getSingleValue(formField);
            if (singleValue.trim().length() > 0) {
                sb.append("<");
                sb.append(variable);
                String str = ">";
                sb.append(str);
                sb.append(singleValue);
                sb.append("</");
                sb.append(variable);
                sb.append(str);
            }
        }
        return sb.toString();
    }

    private static String getSingleValue(FormField formField) {
        List values = formField.getValues();
        if (values.isEmpty()) {
            return "";
        }
        return (String) values.get(0);
    }

    /* access modifiers changed from: protected */
    public IQChildElementXmlStringBuilder getIQChildElementBuilder(IQChildElementXmlStringBuilder iQChildElementXmlStringBuilder) {
        iQChildElementXmlStringBuilder.rightAngleBracket();
        iQChildElementXmlStringBuilder.append((CharSequence) getItemsToSearch());
        return iQChildElementXmlStringBuilder;
    }

    public ReportedData getReportedData() {
        return this.data;
    }

    /* access modifiers changed from: protected */
    public void parseItems(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        ReportedData reportedData = new ReportedData();
        String str = "jid";
        reportedData.addColumn(new Column("JID", str, Type.text_single));
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        while (!z) {
            if (xmlPullParser.getAttributeCount() > 0) {
                String attributeValue = xmlPullParser.getAttributeValue("", str);
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(attributeValue);
                arrayList.add(new Field(str, arrayList2));
            }
            int next = xmlPullParser.next();
            boolean z2 = true;
            String str2 = "item";
            if (next == 2 && xmlPullParser.getName().equals(str2)) {
                arrayList = new ArrayList();
            } else if (next == 3 && xmlPullParser.getName().equals(str2)) {
                reportedData.addRow(new Row(arrayList));
            } else if (next == 2) {
                String name = xmlPullParser.getName();
                String nextText = xmlPullParser.nextText();
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(nextText);
                arrayList.add(new Field(name, arrayList3));
                Iterator it = reportedData.getColumns().iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((Column) it.next()).getVariable().equals(name)) {
                            break;
                        }
                    } else {
                        z2 = false;
                        break;
                    }
                }
                if (!z2) {
                    reportedData.addColumn(new Column(name, name, Type.text_single));
                }
            } else if (next == 3 && xmlPullParser.getName().equals("query")) {
                z = true;
            }
        }
        this.data = reportedData;
    }

    public void setForm(Form form2) {
        this.form = form2;
    }
}
