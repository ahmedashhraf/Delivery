package com.crashlytics.android.core;

public class UserMetaData {
    public static final UserMetaData EMPTY = new UserMetaData();
    public final String email;

    /* renamed from: id */
    public final String f11755id;
    public final String name;

    public UserMetaData() {
        this(null, null, null);
    }

    public boolean isEmpty() {
        return this.f11755id == null && this.name == null && this.email == null;
    }

    public UserMetaData(String str, String str2, String str3) {
        this.f11755id = str;
        this.name = str2;
        this.email = str3;
    }
}
