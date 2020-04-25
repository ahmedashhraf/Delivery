package com.mrsool.bean;

import com.google.gson.p193w.C5860a;
import com.google.gson.p193w.C5862c;

public class SavedBookmarkedBean {
    @C5860a
    @C5862c("bookmark")
    private BookmarkPlaceBean bookmark;
    @C5860a
    @C5862c("code")
    private Integer code;
    @C5860a
    @C5862c("message")
    private String message;

    public BookmarkPlaceBean getBookmark() {
        return this.bookmark;
    }

    public Integer getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }
}
