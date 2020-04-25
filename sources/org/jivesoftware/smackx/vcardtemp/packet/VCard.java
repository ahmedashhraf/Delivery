package org.jivesoftware.smackx.vcardtemp.packet;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jivesoftware.smack.SmackException.NoResponseException;
import org.jivesoftware.smack.SmackException.NotConnectedException;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPException.XMPPErrorException;
import org.jivesoftware.smack.packet.C15617IQ;
import org.jivesoftware.smack.packet.C15617IQ.IQChildElementXmlStringBuilder;
import org.jivesoftware.smack.util.StringUtils;
import org.jivesoftware.smack.util.stringencoder.Base64;
import org.jivesoftware.smackx.vcardtemp.VCardManager;

public class VCard extends C15617IQ {
    private static final String DEFAULT_MIME_TYPE = "image/jpeg";
    public static final String ELEMENT = "vCard";
    private static final Logger LOGGER = Logger.getLogger(VCard.class.getName());
    public static final String NAMESPACE = "vcard-temp";
    private String emailHome;
    private String emailWork;
    private String firstName;
    private Map<String, String> homeAddr = new HashMap();
    private Map<String, String> homePhones = new HashMap();
    private String lastName;
    private String middleName;
    private String organization;
    private String organizationUnit;
    private Map<String, String> otherSimpleFields = new HashMap();
    private Map<String, String> otherUnescapableFields = new HashMap();
    private String photoBinval;
    private String photoMimeType;
    private String prefix;
    private String suffix;
    private Map<String, String> workAddr = new HashMap();
    private Map<String, String> workPhones = new HashMap();

    public VCard() {
        super("vCard", "vcard-temp");
    }

    private void copyFieldsFrom(VCard vCard) {
        Field[] declaredFields;
        Class<VCard> cls = VCard.class;
        for (Field field : cls.getDeclaredFields()) {
            if (field.getDeclaringClass() == cls && !Modifier.isFinal(field.getModifiers())) {
                try {
                    field.setAccessible(true);
                    field.set(this, field.get(vCard));
                } catch (IllegalAccessException e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("This cannot happen:");
                    sb.append(field);
                    throw new RuntimeException(sb.toString(), e);
                }
            }
        }
    }

    public static byte[] getBytes(URL url) throws IOException {
        File file = new File(url.getPath());
        if (file.exists()) {
            return getFileBytes(file);
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static byte[] getFileBytes(java.io.File r4) throws java.io.IOException {
        /*
            r0 = 0
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch:{ all -> 0x0027 }
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x0027 }
            r2.<init>(r4)     // Catch:{ all -> 0x0027 }
            r1.<init>(r2)     // Catch:{ all -> 0x0027 }
            long r2 = r4.length()     // Catch:{ all -> 0x0025 }
            int r4 = (int) r2     // Catch:{ all -> 0x0025 }
            byte[] r4 = new byte[r4]     // Catch:{ all -> 0x0025 }
            int r0 = r1.read(r4)     // Catch:{ all -> 0x0025 }
            int r2 = r4.length     // Catch:{ all -> 0x0025 }
            if (r0 != r2) goto L_0x001d
            r1.close()
            return r4
        L_0x001d:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x0025 }
            java.lang.String r0 = "Entire file not read"
            r4.<init>(r0)     // Catch:{ all -> 0x0025 }
            throw r4     // Catch:{ all -> 0x0025 }
        L_0x0025:
            r4 = move-exception
            goto L_0x0029
        L_0x0027:
            r4 = move-exception
            r1 = r0
        L_0x0029:
            if (r1 == 0) goto L_0x002e
            r1.close()
        L_0x002e:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smackx.vcardtemp.packet.VCard.getFileBytes(java.io.File):byte[]");
    }

    private boolean hasContent() {
        return hasNameField() || hasOrganizationFields() || this.emailHome != null || this.emailWork != null || this.otherSimpleFields.size() > 0 || this.otherUnescapableFields.size() > 0 || this.homeAddr.size() > 0 || this.homePhones.size() > 0 || this.workAddr.size() > 0 || this.workPhones.size() > 0 || this.photoBinval != null;
    }

    private boolean hasNameField() {
        return (this.firstName == null && this.lastName == null && this.middleName == null && this.prefix == null && this.suffix == null) ? false : true;
    }

    private boolean hasOrganizationFields() {
        return (this.organization == null && this.organizationUnit == null) ? false : true;
    }

    private void updateFN() {
        StringBuilder sb = new StringBuilder();
        String str = this.firstName;
        if (str != null) {
            sb.append(StringUtils.escapeForXML(str));
            sb.append(' ');
        }
        String str2 = this.middleName;
        if (str2 != null) {
            sb.append(StringUtils.escapeForXML(str2));
            sb.append(' ');
        }
        String str3 = this.lastName;
        if (str3 != null) {
            sb.append(StringUtils.escapeForXML(str3));
        }
        setField("FN", sb.toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || VCard.class != obj.getClass()) {
            return false;
        }
        VCard vCard = (VCard) obj;
        String str = this.emailHome;
        if (str == null ? vCard.emailHome != null : !str.equals(vCard.emailHome)) {
            return false;
        }
        String str2 = this.emailWork;
        if (str2 == null ? vCard.emailWork != null : !str2.equals(vCard.emailWork)) {
            return false;
        }
        String str3 = this.firstName;
        if (str3 == null ? vCard.firstName != null : !str3.equals(vCard.firstName)) {
            return false;
        }
        if (!this.homeAddr.equals(vCard.homeAddr) || !this.homePhones.equals(vCard.homePhones)) {
            return false;
        }
        String str4 = this.lastName;
        if (str4 == null ? vCard.lastName != null : !str4.equals(vCard.lastName)) {
            return false;
        }
        String str5 = this.middleName;
        if (str5 == null ? vCard.middleName != null : !str5.equals(vCard.middleName)) {
            return false;
        }
        String str6 = this.organization;
        if (str6 == null ? vCard.organization != null : !str6.equals(vCard.organization)) {
            return false;
        }
        String str7 = this.organizationUnit;
        if (str7 == null ? vCard.organizationUnit != null : !str7.equals(vCard.organizationUnit)) {
            return false;
        }
        if (!this.otherSimpleFields.equals(vCard.otherSimpleFields) || !this.workAddr.equals(vCard.workAddr)) {
            return false;
        }
        String str8 = this.photoBinval;
        if (str8 == null ? vCard.photoBinval == null : str8.equals(vCard.photoBinval)) {
            return this.workPhones.equals(vCard.workPhones);
        }
        return false;
    }

    public String getAddressFieldHome(String str) {
        return (String) this.homeAddr.get(str);
    }

    public String getAddressFieldWork(String str) {
        return (String) this.workAddr.get(str);
    }

    public byte[] getAvatar() {
        String str = this.photoBinval;
        if (str == null) {
            return null;
        }
        return Base64.decode(str);
    }

    public String getAvatarHash() {
        byte[] avatar = getAvatar();
        if (avatar == null) {
            return null;
        }
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-1");
            instance.update(avatar);
            return StringUtils.encodeHex(instance.digest());
        } catch (NoSuchAlgorithmException e) {
            LOGGER.log(Level.SEVERE, "Failed to get message digest", e);
            return null;
        }
    }

    public String getAvatarMimeType() {
        return this.photoMimeType;
    }

    public String getEmailHome() {
        return this.emailHome;
    }

    public String getEmailWork() {
        return this.emailWork;
    }

    public String getField(String str) {
        return (String) this.otherSimpleFields.get(str);
    }

    public String getFirstName() {
        return this.firstName;
    }

    /* access modifiers changed from: protected */
    public IQChildElementXmlStringBuilder getIQChildElementBuilder(IQChildElementXmlStringBuilder iQChildElementXmlStringBuilder) {
        String str;
        String str2;
        if (!hasContent()) {
            iQChildElementXmlStringBuilder.setEmptyElement();
            return iQChildElementXmlStringBuilder;
        }
        iQChildElementXmlStringBuilder.rightAngleBracket();
        if (hasNameField()) {
            String str3 = "N";
            iQChildElementXmlStringBuilder.openElement(str3);
            iQChildElementXmlStringBuilder.optElement("FAMILY", this.lastName);
            iQChildElementXmlStringBuilder.optElement("GIVEN", this.firstName);
            iQChildElementXmlStringBuilder.optElement("MIDDLE", this.middleName);
            iQChildElementXmlStringBuilder.optElement("PREFIX", this.prefix);
            iQChildElementXmlStringBuilder.optElement("SUFFIX", this.suffix);
            iQChildElementXmlStringBuilder.closeElement(str3);
        }
        if (hasOrganizationFields()) {
            String str4 = "ORG";
            iQChildElementXmlStringBuilder.openElement(str4);
            iQChildElementXmlStringBuilder.optElement("ORGNAME", this.organization);
            iQChildElementXmlStringBuilder.optElement("ORGUNIT", this.organizationUnit);
            iQChildElementXmlStringBuilder.closeElement(str4);
        }
        for (Entry entry : this.otherSimpleFields.entrySet()) {
            iQChildElementXmlStringBuilder.optElement((String) entry.getKey(), (String) entry.getValue());
        }
        for (Entry entry2 : this.otherUnescapableFields.entrySet()) {
            String str5 = (String) entry2.getValue();
            if (str5 != null) {
                iQChildElementXmlStringBuilder.openElement((String) entry2.getKey());
                iQChildElementXmlStringBuilder.append((CharSequence) str5);
                iQChildElementXmlStringBuilder.closeElement((String) entry2.getKey());
            }
        }
        if (this.photoBinval != null) {
            String str6 = "PHOTO";
            iQChildElementXmlStringBuilder.openElement(str6);
            iQChildElementXmlStringBuilder.escapedElement("BINVAL", this.photoBinval);
            iQChildElementXmlStringBuilder.element("TYPE", this.photoMimeType);
            iQChildElementXmlStringBuilder.closeElement(str6);
        }
        String str7 = "USERID";
        String str8 = "PREF";
        String str9 = "INTERNET";
        String str10 = "WORK";
        String str11 = "EMAIL";
        if (this.emailWork != null) {
            iQChildElementXmlStringBuilder.openElement(str11);
            iQChildElementXmlStringBuilder.emptyElement(str10);
            iQChildElementXmlStringBuilder.emptyElement(str9);
            iQChildElementXmlStringBuilder.emptyElement(str8);
            iQChildElementXmlStringBuilder.element(str7, this.emailWork);
            iQChildElementXmlStringBuilder.closeElement(str11);
        }
        String str12 = "HOME";
        if (this.emailHome != null) {
            iQChildElementXmlStringBuilder.openElement(str11);
            iQChildElementXmlStringBuilder.emptyElement(str12);
            iQChildElementXmlStringBuilder.emptyElement(str9);
            iQChildElementXmlStringBuilder.emptyElement(str8);
            iQChildElementXmlStringBuilder.element(str7, this.emailHome);
            iQChildElementXmlStringBuilder.closeElement(str11);
        }
        Iterator it = this.workPhones.entrySet().iterator();
        while (true) {
            str = "NUMBER";
            str2 = "TEL";
            if (!it.hasNext()) {
                break;
            }
            Entry entry3 = (Entry) it.next();
            String str13 = (String) entry3.getValue();
            if (str13 != null) {
                iQChildElementXmlStringBuilder.openElement(str2);
                iQChildElementXmlStringBuilder.emptyElement(str10);
                iQChildElementXmlStringBuilder.emptyElement((String) entry3.getKey());
                iQChildElementXmlStringBuilder.element(str, str13);
                iQChildElementXmlStringBuilder.closeElement(str2);
            }
        }
        for (Entry entry4 : this.homePhones.entrySet()) {
            String str14 = (String) entry4.getValue();
            if (str14 != null) {
                iQChildElementXmlStringBuilder.openElement(str2);
                iQChildElementXmlStringBuilder.emptyElement(str12);
                iQChildElementXmlStringBuilder.emptyElement((String) entry4.getKey());
                iQChildElementXmlStringBuilder.element(str, str14);
                iQChildElementXmlStringBuilder.closeElement(str2);
            }
        }
        String str15 = "ADR";
        if (!this.workAddr.isEmpty()) {
            iQChildElementXmlStringBuilder.openElement(str15);
            iQChildElementXmlStringBuilder.emptyElement(str10);
            for (Entry entry5 : this.workAddr.entrySet()) {
                String str16 = (String) entry5.getValue();
                if (str16 != null) {
                    iQChildElementXmlStringBuilder.element((String) entry5.getKey(), str16);
                }
            }
            iQChildElementXmlStringBuilder.closeElement(str15);
        }
        if (!this.homeAddr.isEmpty()) {
            iQChildElementXmlStringBuilder.openElement(str15);
            iQChildElementXmlStringBuilder.emptyElement(str12);
            for (Entry entry6 : this.homeAddr.entrySet()) {
                String str17 = (String) entry6.getValue();
                if (str17 != null) {
                    iQChildElementXmlStringBuilder.element((String) entry6.getKey(), str17);
                }
            }
            iQChildElementXmlStringBuilder.closeElement(str15);
        }
        return iQChildElementXmlStringBuilder;
    }

    public String getJabberId() {
        return (String) this.otherSimpleFields.get("JABBERID");
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getMiddleName() {
        return this.middleName;
    }

    public String getNickName() {
        return (String) this.otherSimpleFields.get("NICKNAME");
    }

    public String getOrganization() {
        return this.organization;
    }

    public String getOrganizationUnit() {
        return this.organizationUnit;
    }

    public String getPhoneHome(String str) {
        return (String) this.homePhones.get(str);
    }

    public String getPhoneWork(String str) {
        return (String) this.workPhones.get(str);
    }

    public String getPrefix() {
        return this.prefix;
    }

    public String getSuffix() {
        return this.suffix;
    }

    public int hashCode() {
        int hashCode = ((((((this.homePhones.hashCode() * 29) + this.workPhones.hashCode()) * 29) + this.homeAddr.hashCode()) * 29) + this.workAddr.hashCode()) * 29;
        String str = this.firstName;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 29;
        String str2 = this.lastName;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 29;
        String str3 = this.middleName;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 29;
        String str4 = this.emailHome;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 29;
        String str5 = this.emailWork;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 29;
        String str6 = this.organization;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 29;
        String str7 = this.organizationUnit;
        int hashCode8 = (((hashCode7 + (str7 != null ? str7.hashCode() : 0)) * 29) + this.otherSimpleFields.hashCode()) * 29;
        String str8 = this.photoBinval;
        if (str8 != null) {
            i = str8.hashCode();
        }
        return hashCode8 + i;
    }

    @Deprecated
    public void load(XMPPConnection xMPPConnection) throws NoResponseException, XMPPErrorException, NotConnectedException {
        load(xMPPConnection, null);
    }

    public void removeAvatar() {
        this.photoBinval = null;
        this.photoMimeType = null;
    }

    @Deprecated
    public void save(XMPPConnection xMPPConnection) throws NoResponseException, XMPPErrorException, NotConnectedException {
        VCardManager.getInstanceFor(xMPPConnection).saveVCard(this);
    }

    public void setAddressFieldHome(String str, String str2) {
        this.homeAddr.put(str, str2);
    }

    public void setAddressFieldWork(String str, String str2) {
        this.workAddr.put(str, str2);
    }

    public void setAvatar(URL url) {
        byte[] bArr = new byte[0];
        try {
            bArr = getBytes(url);
        } catch (IOException e) {
            Logger logger = LOGGER;
            Level level = Level.SEVERE;
            StringBuilder sb = new StringBuilder();
            sb.append("Error getting bytes from URL: ");
            sb.append(url);
            logger.log(level, sb.toString(), e);
        }
        setAvatar(bArr);
    }

    public void setEmailHome(String str) {
        this.emailHome = str;
    }

    public void setEmailWork(String str) {
        this.emailWork = str;
    }

    @Deprecated
    public void setEncodedImage(String str) {
        setAvatar(str, DEFAULT_MIME_TYPE);
    }

    public void setField(String str, String str2) {
        setField(str, str2, false);
    }

    public void setFirstName(String str) {
        this.firstName = str;
        updateFN();
    }

    public void setJabberId(String str) {
        this.otherSimpleFields.put("JABBERID", str);
    }

    public void setLastName(String str) {
        this.lastName = str;
        updateFN();
    }

    public void setMiddleName(String str) {
        this.middleName = str;
        updateFN();
    }

    public void setNickName(String str) {
        this.otherSimpleFields.put("NICKNAME", str);
    }

    public void setOrganization(String str) {
        this.organization = str;
    }

    public void setOrganizationUnit(String str) {
        this.organizationUnit = str;
    }

    public void setPhoneHome(String str, String str2) {
        this.homePhones.put(str, str2);
    }

    public void setPhoneWork(String str, String str2) {
        this.workPhones.put(str, str2);
    }

    public void setPrefix(String str) {
        this.prefix = str;
        updateFN();
    }

    public void setSuffix(String str) {
        this.suffix = str;
        updateFN();
    }

    @Deprecated
    public void load(XMPPConnection xMPPConnection, String str) throws NoResponseException, XMPPErrorException, NotConnectedException {
        copyFieldsFrom(VCardManager.getInstanceFor(xMPPConnection).loadVCard(str));
    }

    public void setField(String str, String str2, boolean z) {
        if (!z) {
            this.otherSimpleFields.put(str, str2);
        } else {
            this.otherUnescapableFields.put(str, str2);
        }
    }

    public void setAvatar(byte[] bArr) {
        setAvatar(bArr, DEFAULT_MIME_TYPE);
    }

    public void setAvatar(byte[] bArr, String str) {
        if (bArr == null) {
            removeAvatar();
        } else {
            setAvatar(Base64.encodeToString(bArr), str);
        }
    }

    public void setAvatar(String str, String str2) {
        this.photoBinval = str;
        this.photoMimeType = str2;
    }
}
