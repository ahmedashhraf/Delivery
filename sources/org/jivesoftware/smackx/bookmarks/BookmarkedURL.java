package org.jivesoftware.smackx.bookmarks;

public class BookmarkedURL implements SharedBookmark {
    private final String URL;
    private boolean isRss;
    private boolean isShared;
    private String name;

    protected BookmarkedURL(String str) {
        this.URL = str;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BookmarkedURL)) {
            return false;
        }
        return ((BookmarkedURL) obj).getURL().equalsIgnoreCase(this.URL);
    }

    public String getName() {
        return this.name;
    }

    public String getURL() {
        return this.URL;
    }

    public boolean isRss() {
        return this.isRss;
    }

    public boolean isShared() {
        return this.isShared;
    }

    /* access modifiers changed from: protected */
    public void setName(String str) {
        this.name = str;
    }

    /* access modifiers changed from: protected */
    public void setRss(boolean z) {
        this.isRss = z;
    }

    /* access modifiers changed from: protected */
    public void setShared(boolean z) {
        this.isShared = z;
    }

    protected BookmarkedURL(String str, String str2, boolean z) {
        this.URL = str;
        this.name = str2;
        this.isRss = z;
    }
}
