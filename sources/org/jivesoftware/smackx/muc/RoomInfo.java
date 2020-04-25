package org.jivesoftware.smackx.muc;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jivesoftware.smackx.disco.packet.DiscoverInfo;
import org.jivesoftware.smackx.disco.packet.DiscoverInfo.Identity;
import org.jivesoftware.smackx.xdata.Form;
import org.jivesoftware.smackx.xdata.FormField;

public class RoomInfo {
    private static final Logger LOGGER = Logger.getLogger(RoomInfo.class.getName());
    private final List<String> contactJid;
    private final String description;
    private final Form form;
    private final String lang;
    private final String ldapgroup;
    private final URL logs;
    private final int maxhistoryfetch;
    private final boolean membersOnly;
    private final boolean moderated;
    private final String name;
    private final boolean nonanonymous;
    private final int occupantsCount;
    private final boolean passwordProtected;
    private final boolean persistent;
    private final String pubsub;
    private final String room;
    private final String subject;
    private final Boolean subjectmod;

    RoomInfo(DiscoverInfo discoverInfo) {
        String str;
        URL url;
        Boolean bool;
        String str2;
        String str3;
        List<String> list;
        int i;
        FormField field;
        this.room = discoverInfo.getFrom();
        this.membersOnly = discoverInfo.containsFeature("muc_membersonly");
        this.moderated = discoverInfo.containsFeature("muc_moderated");
        this.nonanonymous = discoverInfo.containsFeature("muc_nonanonymous");
        this.passwordProtected = discoverInfo.containsFeature("muc_passwordprotected");
        this.persistent = discoverInfo.containsFeature("muc_persistent");
        List identities = discoverInfo.getIdentities();
        String str4 = "";
        if (!identities.isEmpty()) {
            this.name = ((Identity) identities.get(0)).getName();
        } else {
            Logger logger = LOGGER;
            StringBuilder sb = new StringBuilder();
            sb.append("DiscoverInfo does not contain any Identity: ");
            sb.append(discoverInfo.toXML());
            logger.warning(sb.toString());
            this.name = str4;
        }
        this.form = Form.getFormFrom(discoverInfo);
        Form form2 = this.form;
        int i2 = -1;
        String str5 = null;
        if (form2 != null) {
            FormField field2 = form2.getField("muc#roominfo_description");
            str = (field2 == null || field2.getValues().isEmpty()) ? str4 : (String) field2.getValues().get(0);
            FormField field3 = this.form.getField("muc#roominfo_subject");
            if (field3 != null && !field3.getValues().isEmpty()) {
                str4 = (String) field3.getValues().get(0);
            }
            FormField field4 = this.form.getField("muc#roominfo_occupants");
            i = (field4 == null || field4.getValues().isEmpty()) ? -1 : Integer.parseInt((String) field4.getValues().get(0));
            FormField field5 = this.form.getField("muc#maxhistoryfetch");
            if (field5 != null && !field5.getValues().isEmpty()) {
                i2 = Integer.parseInt((String) field5.getValues().get(0));
            }
            FormField field6 = this.form.getField("muc#roominfo_contactjid");
            list = (field6 == null || field6.getValues().isEmpty()) ? null : field6.getValues();
            FormField field7 = this.form.getField("muc#roominfo_lang");
            str3 = (field7 == null || field7.getValues().isEmpty()) ? null : (String) field7.getValues().get(0);
            FormField field8 = this.form.getField("muc#roominfo_ldapgroup");
            str2 = (field8 == null || field8.getValues().isEmpty()) ? null : (String) field8.getValues().get(0);
            FormField field9 = this.form.getField("muc#roominfo_subjectmod");
            bool = (field9 == null || field9.getValues().isEmpty()) ? null : Boolean.valueOf((String) field9.getValues().get(0));
            FormField field10 = this.form.getField("muc#roominfo_logs");
            if (field10 != null && !field10.getValues().isEmpty()) {
                try {
                    url = new URL((String) field10.getValues().get(0));
                } catch (MalformedURLException e) {
                    LOGGER.log(Level.SEVERE, "Could not parse URL", e);
                }
                field = this.form.getField("muc#roominfo_pubsub");
                if (field != null && !field.getValues().isEmpty()) {
                    str5 = (String) field.getValues().get(0);
                }
            }
            url = null;
            field = this.form.getField("muc#roominfo_pubsub");
            str5 = (String) field.getValues().get(0);
        } else {
            list = null;
            str3 = null;
            str2 = null;
            bool = null;
            url = null;
            str = str4;
            i = -1;
        }
        this.description = str;
        this.subject = str4;
        this.occupantsCount = i;
        this.maxhistoryfetch = i2;
        this.contactJid = list;
        this.lang = str3;
        this.ldapgroup = str2;
        this.subjectmod = bool;
        this.logs = url;
        this.pubsub = str5;
    }

    public List<String> getContactJids() {
        return this.contactJid;
    }

    public String getDescription() {
        return this.description;
    }

    public Form getForm() {
        return this.form;
    }

    public String getLang() {
        return this.lang;
    }

    public String getLdapGroup() {
        return this.ldapgroup;
    }

    public URL getLogsUrl() {
        return this.logs;
    }

    public int getMaxHistoryFetch() {
        return this.maxhistoryfetch;
    }

    public String getName() {
        return this.name;
    }

    public int getOccupantsCount() {
        return this.occupantsCount;
    }

    public String getPubSub() {
        return this.pubsub;
    }

    public String getRoom() {
        return this.room;
    }

    public String getSubject() {
        return this.subject;
    }

    public boolean isMembersOnly() {
        return this.membersOnly;
    }

    public boolean isModerated() {
        return this.moderated;
    }

    public boolean isNonanonymous() {
        return this.nonanonymous;
    }

    public boolean isPasswordProtected() {
        return this.passwordProtected;
    }

    public boolean isPersistent() {
        return this.persistent;
    }

    public Boolean isSubjectModifiable() {
        return this.subjectmod;
    }
}
