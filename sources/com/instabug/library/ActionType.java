package com.instabug.library;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface ActionType {
    public static final int ADD_COMMENT_TO_FEATURE = 8;
    public static final int ALL_ACTIONS = 1;
    public static final int REPORT_BUG = 2;
    public static final int REQUEST_NEW_FEATURE = 4;
}
