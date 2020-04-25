package org.jivesoftware.smackx.search;

import java.io.IOException;
import org.jivesoftware.smack.SmackException;
import org.jivesoftware.smack.SmackException.NoResponseException;
import org.jivesoftware.smack.SmackException.NotConnectedException;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPException.XMPPErrorException;
import org.jivesoftware.smack.packet.C15617IQ;
import org.jivesoftware.smack.packet.SimpleIQ;
import org.jivesoftware.smack.packet.Stanza;
import org.jivesoftware.smack.provider.IQProvider;
import org.jivesoftware.smack.util.PacketParserUtils;
import org.jivesoftware.smackx.nick.packet.Nick;
import org.jivesoftware.smackx.xdata.Form;
import org.jivesoftware.smackx.xdata.FormField;
import org.jivesoftware.smackx.xdata.packet.DataForm;
import org.jivesoftware.smackx.xdata.packet.DataForm.Type;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class UserSearch extends SimpleIQ {
    public static final String ELEMENT = "query";
    public static final String NAMESPACE = "jabber:iq:search";

    public static class Provider extends IQProvider<C15617IQ> {
        public C15617IQ parse(XmlPullParser xmlPullParser, int i) throws XmlPullParserException, IOException, SmackException {
            SimpleUserSearch simpleUserSearch = new SimpleUserSearch();
            UserSearch userSearch = null;
            boolean z = false;
            while (!z) {
                int next = xmlPullParser.next();
                if (next == 2 && xmlPullParser.getName().equals("instructions")) {
                    UserSearch.buildDataForm(simpleUserSearch, xmlPullParser.nextText(), xmlPullParser);
                    return simpleUserSearch;
                } else if (next == 2 && xmlPullParser.getName().equals("item")) {
                    simpleUserSearch.parseItems(xmlPullParser);
                    return simpleUserSearch;
                } else if (next == 2 && xmlPullParser.getNamespace().equals("jabber:x:data")) {
                    userSearch = new UserSearch();
                    PacketParserUtils.addExtensionElement((Stanza) userSearch, xmlPullParser);
                } else if (next == 3 && xmlPullParser.getName().equals("query")) {
                    z = true;
                }
            }
            return userSearch != null ? userSearch : simpleUserSearch;
        }
    }

    public UserSearch() {
        super("query", "jabber:iq:search");
    }

    /* access modifiers changed from: private */
    public static void buildDataForm(SimpleUserSearch simpleUserSearch, String str, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException, SmackException {
        String str2;
        DataForm dataForm = new DataForm(Type.form);
        dataForm.setTitle("User Search");
        dataForm.addInstruction(str);
        boolean z = false;
        while (true) {
            str2 = "jabber:x:data";
            if (z) {
                break;
            }
            int next = xmlPullParser.next();
            if (next != 2 || xmlPullParser.getNamespace().equals(str2)) {
                if (next == 3) {
                    if (!xmlPullParser.getName().equals("query")) {
                    }
                } else if (next == 2 && xmlPullParser.getNamespace().equals(str2)) {
                    PacketParserUtils.addExtensionElement((Stanza) simpleUserSearch, xmlPullParser);
                }
                z = true;
            } else {
                String name = xmlPullParser.getName();
                FormField formField = new FormField(name);
                if (name.equals("first")) {
                    formField.setLabel("First Name");
                } else if (name.equals("last")) {
                    formField.setLabel("Last Name");
                } else if (name.equals("email")) {
                    formField.setLabel("Email Address");
                } else if (name.equals(Nick.ELEMENT_NAME)) {
                    formField.setLabel("Nickname");
                }
                formField.setType(FormField.Type.text_single);
                dataForm.addField(formField);
            }
        }
        if (simpleUserSearch.getExtension("x", str2) == null) {
            simpleUserSearch.addExtension(dataForm);
        }
    }

    public Form getSearchForm(XMPPConnection xMPPConnection, String str) throws NoResponseException, XMPPErrorException, NotConnectedException {
        UserSearch userSearch = new UserSearch();
        userSearch.setType(C15617IQ.Type.get);
        userSearch.setTo(str);
        return Form.getFormFrom((C15617IQ) xMPPConnection.createPacketCollectorAndSend(userSearch).nextResultOrThrow());
    }

    public ReportedData sendSearchForm(XMPPConnection xMPPConnection, Form form, String str) throws NoResponseException, XMPPErrorException, NotConnectedException {
        UserSearch userSearch = new UserSearch();
        userSearch.setType(C15617IQ.Type.set);
        userSearch.setTo(str);
        userSearch.addExtension(form.getDataFormToSend());
        return ReportedData.getReportedDataFrom((C15617IQ) xMPPConnection.createPacketCollectorAndSend(userSearch).nextResultOrThrow());
    }

    public ReportedData sendSimpleSearchForm(XMPPConnection xMPPConnection, Form form, String str) throws NoResponseException, XMPPErrorException, NotConnectedException {
        SimpleUserSearch simpleUserSearch = new SimpleUserSearch();
        simpleUserSearch.setForm(form);
        simpleUserSearch.setType(C15617IQ.Type.set);
        simpleUserSearch.setTo(str);
        return ((SimpleUserSearch) xMPPConnection.createPacketCollectorAndSend(simpleUserSearch).nextResultOrThrow()).getReportedData();
    }
}
