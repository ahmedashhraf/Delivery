package org.jivesoftware.smackx.bookmarks;

import com.facebook.internal.ServerProtocol;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jivesoftware.smack.util.XmlStringBuilder;
import org.jivesoftware.smackx.iqprivate.packet.PrivateData;
import org.jivesoftware.smackx.iqprivate.provider.PrivateDataProvider;
import org.jivesoftware.smackx.nick.packet.Nick;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class Bookmarks implements PrivateData {
    public static final String ELEMENT = "storage";
    public static final String NAMESPACE = "storage:bookmarks";
    private List<BookmarkedConference> bookmarkedConferences = new ArrayList();
    private List<BookmarkedURL> bookmarkedURLS = new ArrayList();

    public static class Provider implements PrivateDataProvider {
        public PrivateData parsePrivateData(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
            Bookmarks bookmarks = new Bookmarks();
            boolean z = false;
            while (!z) {
                int next = xmlPullParser.next();
                if (next == 2) {
                    if ("url".equals(xmlPullParser.getName())) {
                        BookmarkedURL access$000 = Bookmarks.getURLStorage(xmlPullParser);
                        if (access$000 != null) {
                            bookmarks.addBookmarkedURL(access$000);
                        }
                    }
                }
                if (next == 2) {
                    if ("conference".equals(xmlPullParser.getName())) {
                        bookmarks.addBookmarkedConference(Bookmarks.getConferenceStorage(xmlPullParser));
                    }
                }
                if (next == 3) {
                    if (Bookmarks.ELEMENT.equals(xmlPullParser.getName())) {
                        z = true;
                    }
                }
            }
            return bookmarks;
        }
    }

    /* access modifiers changed from: private */
    public static BookmarkedConference getConferenceStorage(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String str = "";
        String attributeValue = xmlPullParser.getAttributeValue(str, "name");
        String attributeValue2 = xmlPullParser.getAttributeValue(str, "autojoin");
        BookmarkedConference bookmarkedConference = new BookmarkedConference(xmlPullParser.getAttributeValue(str, "jid"));
        bookmarkedConference.setName(attributeValue);
        bookmarkedConference.setAutoJoin(Boolean.valueOf(attributeValue2).booleanValue());
        boolean z = false;
        while (!z) {
            int next = xmlPullParser.next();
            if (next == 2) {
                if (Nick.ELEMENT_NAME.equals(xmlPullParser.getName())) {
                    bookmarkedConference.setNickname(xmlPullParser.nextText());
                }
            }
            if (next == 2) {
                if ("password".equals(xmlPullParser.getName())) {
                    bookmarkedConference.setPassword(xmlPullParser.nextText());
                }
            }
            if (next == 2) {
                if ("shared_bookmark".equals(xmlPullParser.getName())) {
                    bookmarkedConference.setShared(true);
                }
            }
            if (next == 3) {
                if ("conference".equals(xmlPullParser.getName())) {
                    z = true;
                }
            }
        }
        return bookmarkedConference;
    }

    /* access modifiers changed from: private */
    public static BookmarkedURL getURLStorage(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        String str = "";
        String attributeValue = xmlPullParser.getAttributeValue(str, "name");
        String str2 = "url";
        String attributeValue2 = xmlPullParser.getAttributeValue(str, str2);
        String attributeValue3 = xmlPullParser.getAttributeValue(str, "rss");
        boolean z = false;
        BookmarkedURL bookmarkedURL = new BookmarkedURL(attributeValue2, attributeValue, attributeValue3 != null && ServerProtocol.DIALOG_RETURN_SCOPES_TRUE.equals(attributeValue3));
        while (!z) {
            int next = xmlPullParser.next();
            if (next == 2) {
                if ("shared_bookmark".equals(xmlPullParser.getName())) {
                    bookmarkedURL.setShared(true);
                }
            }
            if (next == 3 && str2.equals(xmlPullParser.getName())) {
                z = true;
            }
        }
        return bookmarkedURL;
    }

    public void addBookmarkedConference(BookmarkedConference bookmarkedConference) {
        this.bookmarkedConferences.add(bookmarkedConference);
    }

    public void addBookmarkedURL(BookmarkedURL bookmarkedURL) {
        this.bookmarkedURLS.add(bookmarkedURL);
    }

    public void clearBookmarkedConferences() {
        this.bookmarkedConferences.clear();
    }

    public void clearBookmarkedURLS() {
        this.bookmarkedURLS.clear();
    }

    public List<BookmarkedConference> getBookmarkedConferences() {
        return this.bookmarkedConferences;
    }

    public List<BookmarkedURL> getBookmarkedURLS() {
        return this.bookmarkedURLS;
    }

    public String getElementName() {
        return ELEMENT;
    }

    public String getNamespace() {
        return NAMESPACE;
    }

    public void removeBookmarkedConference(BookmarkedConference bookmarkedConference) {
        this.bookmarkedConferences.remove(bookmarkedConference);
    }

    public void removeBookmarkedURL(BookmarkedURL bookmarkedURL) {
        this.bookmarkedURLS.remove(bookmarkedURL);
    }

    public XmlStringBuilder toXML() {
        String str;
        XmlStringBuilder xmlStringBuilder = new XmlStringBuilder();
        String str2 = ELEMENT;
        xmlStringBuilder.halfOpenElement(str2).xmlnsAttribute(NAMESPACE).rightAngleBracket();
        Iterator it = getBookmarkedURLS().iterator();
        while (true) {
            str = "name";
            if (!it.hasNext()) {
                break;
            }
            BookmarkedURL bookmarkedURL = (BookmarkedURL) it.next();
            if (!bookmarkedURL.isShared()) {
                String str3 = "url";
                xmlStringBuilder.halfOpenElement(str3).attribute(str, bookmarkedURL.getName()).attribute(str3, bookmarkedURL.getURL());
                xmlStringBuilder.condAttribute(bookmarkedURL.isRss(), "rss", ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
                xmlStringBuilder.closeEmptyElement();
            }
        }
        for (BookmarkedConference bookmarkedConference : getBookmarkedConferences()) {
            if (!bookmarkedConference.isShared()) {
                String str4 = "conference";
                xmlStringBuilder.halfOpenElement(str4);
                xmlStringBuilder.attribute(str, bookmarkedConference.getName());
                xmlStringBuilder.attribute("autojoin", Boolean.toString(bookmarkedConference.isAutoJoin()));
                xmlStringBuilder.attribute("jid", bookmarkedConference.getJid());
                xmlStringBuilder.rightAngleBracket();
                xmlStringBuilder.optElement(Nick.ELEMENT_NAME, bookmarkedConference.getNickname());
                xmlStringBuilder.optElement("password", bookmarkedConference.getPassword());
                xmlStringBuilder.closeElement(str4);
            }
        }
        xmlStringBuilder.closeElement(str2);
        return xmlStringBuilder;
    }
}
