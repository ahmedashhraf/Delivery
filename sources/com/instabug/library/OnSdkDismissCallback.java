package com.instabug.library;

import com.facebook.internal.FacebookRequestErrorClassification;

public interface OnSdkDismissCallback {

    public enum DismissType {
        SUBMIT,
        CANCEL,
        ADD_ATTACHMENT;

        static {
            boolean[] $jacocoInit;
            $jacocoInit[5] = true;
        }
    }

    public enum ReportType {
        BUG("bug"),
        FEEDBACK("feedback"),
        OTHER(FacebookRequestErrorClassification.KEY_OTHER);
        
        private final String name;

        static {
            boolean[] $jacocoInit;
            $jacocoInit[4] = true;
        }

        private ReportType(String str) {
            boolean[] $jacocoInit = $jacocoInit();
            this.name = str;
            $jacocoInit[2] = true;
        }

        public String toString() {
            boolean[] $jacocoInit = $jacocoInit();
            String str = this.name;
            $jacocoInit[3] = true;
            return str;
        }
    }

    void call(DismissType dismissType, ReportType reportType);
}
