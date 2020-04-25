package org.jivesoftware.smackx.commands.provider;

import java.io.IOException;
import org.jivesoftware.smack.SmackException;
import org.jivesoftware.smack.provider.ExtensionElementProvider;
import org.jivesoftware.smack.provider.IQProvider;
import org.jivesoftware.smack.util.PacketParserUtils;
import org.jivesoftware.smackx.commands.AdHocCommand.Action;
import org.jivesoftware.smackx.commands.AdHocCommand.SpecificErrorCondition;
import org.jivesoftware.smackx.commands.AdHocCommand.Status;
import org.jivesoftware.smackx.commands.AdHocCommandNote;
import org.jivesoftware.smackx.commands.AdHocCommandNote.Type;
import org.jivesoftware.smackx.commands.packet.AdHocCommandData;
import org.jivesoftware.smackx.commands.packet.AdHocCommandData.SpecificError;
import org.jivesoftware.smackx.xdata.packet.DataForm;
import org.jivesoftware.smackx.xdata.provider.DataFormProvider;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p205i.p471b.p472a.p473a.p474c.p478j.p484d.C14030b;

public class AdHocCommandDataProvider extends IQProvider<AdHocCommandData> {

    public static class BadActionError extends ExtensionElementProvider<SpecificError> {
        public SpecificError parse(XmlPullParser xmlPullParser, int i) {
            return new SpecificError(SpecificErrorCondition.badAction);
        }
    }

    public static class BadLocaleError extends ExtensionElementProvider<SpecificError> {
        public SpecificError parse(XmlPullParser xmlPullParser, int i) {
            return new SpecificError(SpecificErrorCondition.badLocale);
        }
    }

    public static class BadPayloadError extends ExtensionElementProvider<SpecificError> {
        public SpecificError parse(XmlPullParser xmlPullParser, int i) {
            return new SpecificError(SpecificErrorCondition.badPayload);
        }
    }

    public static class BadSessionIDError extends ExtensionElementProvider<SpecificError> {
        public SpecificError parse(XmlPullParser xmlPullParser, int i) {
            return new SpecificError(SpecificErrorCondition.badSessionid);
        }
    }

    public static class MalformedActionError extends ExtensionElementProvider<SpecificError> {
        public SpecificError parse(XmlPullParser xmlPullParser, int i) {
            return new SpecificError(SpecificErrorCondition.malformedAction);
        }
    }

    public static class SessionExpiredError extends ExtensionElementProvider<SpecificError> {
        public SpecificError parse(XmlPullParser xmlPullParser, int i) {
            return new SpecificError(SpecificErrorCondition.sessionExpired);
        }
    }

    public AdHocCommandData parse(XmlPullParser xmlPullParser, int i) throws XmlPullParserException, IOException, SmackException {
        AdHocCommandData adHocCommandData = new AdHocCommandData();
        DataFormProvider dataFormProvider = new DataFormProvider();
        String str = "";
        adHocCommandData.setSessionID(xmlPullParser.getAttributeValue(str, C14030b.f41235j));
        adHocCommandData.setNode(xmlPullParser.getAttributeValue(str, "node"));
        String attributeValue = xmlPullParser.getAttributeValue(str, "status");
        if (Status.executing.toString().equalsIgnoreCase(attributeValue)) {
            adHocCommandData.setStatus(Status.executing);
        } else if (Status.completed.toString().equalsIgnoreCase(attributeValue)) {
            adHocCommandData.setStatus(Status.completed);
        } else if (Status.canceled.toString().equalsIgnoreCase(attributeValue)) {
            adHocCommandData.setStatus(Status.canceled);
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(str, "action");
        if (attributeValue2 != null) {
            Action valueOf = Action.valueOf(attributeValue2);
            if (valueOf == null || valueOf.equals(Action.unknown)) {
                adHocCommandData.setAction(Action.unknown);
            } else {
                adHocCommandData.setAction(valueOf);
            }
        }
        boolean z = false;
        while (!z) {
            int next = xmlPullParser.next();
            String name = xmlPullParser.getName();
            String namespace = xmlPullParser.getNamespace();
            if (next == 2) {
                if (xmlPullParser.getName().equals("actions")) {
                    String attributeValue3 = xmlPullParser.getAttributeValue(str, "execute");
                    if (attributeValue3 != null) {
                        adHocCommandData.setExecuteAction(Action.valueOf(attributeValue3));
                    }
                } else if (xmlPullParser.getName().equals("next")) {
                    adHocCommandData.addAction(Action.next);
                } else if (xmlPullParser.getName().equals("complete")) {
                    adHocCommandData.addAction(Action.complete);
                } else if (xmlPullParser.getName().equals("prev")) {
                    adHocCommandData.addAction(Action.prev);
                } else if (name.equals("x") && namespace.equals("jabber:x:data")) {
                    adHocCommandData.setForm((DataForm) dataFormProvider.parse(xmlPullParser));
                } else if (xmlPullParser.getName().equals("note")) {
                    adHocCommandData.addNote(new AdHocCommandNote(Type.valueOf(xmlPullParser.getAttributeValue(str, "type")), xmlPullParser.nextText()));
                } else if (xmlPullParser.getName().equals("error")) {
                    adHocCommandData.setError(PacketParserUtils.parseError(xmlPullParser));
                }
            } else if (next == 3 && xmlPullParser.getName().equals(AdHocCommandData.ELEMENT)) {
                z = true;
            }
        }
        return adHocCommandData;
    }
}
