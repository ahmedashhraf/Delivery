package com.instabug.library.bugreporting.model;

import com.instabug.library.model.BaseReport;

public class Bug extends BaseReport {

    public enum Type {
        BUG("bug"),
        FEEDBACK("feedback"),
        NOT_AVAILABLE("not-available");
        
        private final String name;

        static {
            boolean[] $jacocoInit;
            $jacocoInit[4] = true;
        }

        private Type(String str) {
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
}
