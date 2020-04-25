package org.jivesoftware.smackx.workgroup.ext.macros;

import java.io.IOException;
import java.io.StringReader;
import org.jivesoftware.smack.packet.C15617IQ;
import org.jivesoftware.smack.packet.C15617IQ.IQChildElementXmlStringBuilder;
import org.jivesoftware.smack.provider.IQProvider;
import org.jivesoftware.smack.util.StringUtils;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

public class Macros extends C15617IQ {
    public static final String ELEMENT_NAME = "macros";
    public static final String NAMESPACE = "http://jivesoftware.com/protocol/workgroup";
    private boolean personal;
    private MacroGroup personalMacroGroup;
    private MacroGroup rootGroup;

    public static class InternalProvider extends IQProvider<Macros> {
        public Macro parseMacro(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
            Macro macro = new Macro();
            boolean z = false;
            while (!z) {
                int next = xmlPullParser.next();
                if (next == 2) {
                    if (xmlPullParser.getName().equals("title")) {
                        xmlPullParser.next();
                        macro.setTitle(xmlPullParser.getText());
                    } else if (xmlPullParser.getName().equals("description")) {
                        macro.setDescription(xmlPullParser.nextText());
                    } else if (xmlPullParser.getName().equals("response")) {
                        macro.setResponse(xmlPullParser.nextText());
                    } else if (xmlPullParser.getName().equals("type")) {
                        macro.setType(Integer.valueOf(xmlPullParser.nextText()).intValue());
                    }
                } else if (next == 3 && xmlPullParser.getName().equals("macro")) {
                    z = true;
                }
            }
            return macro;
        }

        public MacroGroup parseMacroGroup(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
            MacroGroup macroGroup = new MacroGroup();
            boolean z = false;
            while (!z) {
                int next = xmlPullParser.next();
                String str = "macrogroup";
                if (next == 2) {
                    if (xmlPullParser.getName().equals(str)) {
                        macroGroup.addMacroGroup(parseMacroGroup(xmlPullParser));
                    }
                    if (xmlPullParser.getName().equals("title")) {
                        macroGroup.setTitle(xmlPullParser.nextText());
                    }
                    if (xmlPullParser.getName().equals("macro")) {
                        macroGroup.addMacro(parseMacro(xmlPullParser));
                    }
                } else if (next == 3 && xmlPullParser.getName().equals(str)) {
                    z = true;
                }
            }
            return macroGroup;
        }

        public MacroGroup parseMacroGroups(String str) throws XmlPullParserException, IOException {
            XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
            newPullParser.setInput(new StringReader(str));
            int eventType = newPullParser.getEventType();
            MacroGroup macroGroup = null;
            while (eventType != 1) {
                eventType = newPullParser.next();
                if (eventType == 2 && newPullParser.getName().equals("macrogroup")) {
                    macroGroup = parseMacroGroup(newPullParser);
                }
            }
            return macroGroup;
        }

        public Macros parse(XmlPullParser xmlPullParser, int i) throws XmlPullParserException, IOException {
            Macros macros = new Macros();
            boolean z = false;
            while (!z) {
                int next = xmlPullParser.next();
                if (next == 2) {
                    if (xmlPullParser.getName().equals("model")) {
                        macros.setRootGroup(parseMacroGroups(xmlPullParser.nextText()));
                    }
                } else if (next == 3 && xmlPullParser.getName().equals(Macros.ELEMENT_NAME)) {
                    z = true;
                }
            }
            return macros;
        }
    }

    public Macros() {
        super(ELEMENT_NAME, "http://jivesoftware.com/protocol/workgroup");
    }

    /* access modifiers changed from: protected */
    public IQChildElementXmlStringBuilder getIQChildElementBuilder(IQChildElementXmlStringBuilder iQChildElementXmlStringBuilder) {
        iQChildElementXmlStringBuilder.rightAngleBracket();
        if (isPersonal()) {
            iQChildElementXmlStringBuilder.append((CharSequence) "<personal>true</personal>");
        }
        if (getPersonalMacroGroup() != null) {
            iQChildElementXmlStringBuilder.append((CharSequence) "<personalMacro>");
            iQChildElementXmlStringBuilder.append(StringUtils.escapeForXML(getPersonalMacroGroup().toXML()));
            iQChildElementXmlStringBuilder.append((CharSequence) "</personalMacro>");
        }
        return iQChildElementXmlStringBuilder;
    }

    public MacroGroup getPersonalMacroGroup() {
        return this.personalMacroGroup;
    }

    public MacroGroup getRootGroup() {
        return this.rootGroup;
    }

    public boolean isPersonal() {
        return this.personal;
    }

    public void setPersonal(boolean z) {
        this.personal = z;
    }

    public void setPersonalMacroGroup(MacroGroup macroGroup) {
        this.personalMacroGroup = macroGroup;
    }

    public void setRootGroup(MacroGroup macroGroup) {
        this.rootGroup = macroGroup;
    }
}
