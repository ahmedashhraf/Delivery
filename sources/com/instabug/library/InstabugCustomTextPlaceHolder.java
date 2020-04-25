package com.instabug.library;

import androidx.annotation.C0193h0;
import java.util.HashMap;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class InstabugCustomTextPlaceHolder {
    private static transient /* synthetic */ boolean[] $jacocoData;
    private HashMap<Key, String> placeHoldersMap = new HashMap<>();

    public enum Key {
        SHAKE_HINT,
        SWIPE_HINT,
        INVALID_EMAIL_MESSAGE,
        INVALID_COMMENT_MESSAGE,
        INVOCATION_HEADER,
        START_CHATS,
        REPORT_BUG,
        REPORT_FEEDBACK,
        EMAIL_FIELD_HINT,
        COMMENT_FIELD_HINT_FOR_BUG_REPORT,
        COMMENT_FIELD_HINT_FOR_FEEDBACK,
        ADD_VOICE_MESSAGE,
        ADD_IMAGE_FROM_GALLERY,
        ADD_EXTRA_SCREENSHOT,
        CONVERSATIONS_LIST_TITLE,
        AUDIO_RECORDING_PERMISSION_DENIED,
        CONVERSATION_TEXT_FIELD_HINT,
        BUG_REPORT_HEADER,
        FEEDBACK_REPORT_HEADER,
        VOICE_MESSAGE_PRESS_AND_HOLD_TO_RECORD,
        VOICE_MESSAGE_RELEASE_TO_ATTACH,
        REPORT_SUCCESSFULLY_SENT,
        SUCCESS_DIALOG_HEADER,
        ADD_VIDEO,
        VIDEO_PLAYER_TITLE,
        FEATURES_REQUEST,
        FEATURES_REQUEST_ADD_FEATURE_TOAST,
        FEATURES_REQUEST_ADD_FEATURE_THANKS_MESSAGE,
        SURVEYS_WELCOME_SCREEN_TITLE,
        SURVEYS_WELCOME_SCREEN_SUBTITLE,
        SURVEYS_WELCOME_SCREEN_BUTTON,
        BETA_WELCOME_MESSAGE_WELCOME_STEP_TITLE,
        BETA_WELCOME_MESSAGE_WELCOME_STEP_CONTENT,
        BETA_WELCOME_MESSAGE_HOW_TO_REPORT_STEP_TITLE,
        BETA_WELCOME_MESSAGE_HOW_TO_REPORT_STEP_CONTENT,
        BETA_WELCOME_MESSAGE_FINISH_STEP_TITLE,
        BETA_WELCOME_MESSAGE_FINISH_STEP_CONTENT,
        LIVE_WELCOME_MESSAGE_TITLE,
        LIVE_WELCOME_MESSAGE_CONTENT;

        static {
            boolean[] $jacocoInit;
            $jacocoInit[16] = true;
        }
    }

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(4606679688618309460L, "com/instabug/library/InstabugCustomTextPlaceHolder", 7);
        $jacocoData = a;
        return a;
    }

    public InstabugCustomTextPlaceHolder() {
        boolean[] $jacocoInit = $jacocoInit();
        $jacocoInit[0] = true;
        $jacocoInit[1] = true;
    }

    public String get(Key key) {
        boolean[] $jacocoInit = $jacocoInit();
        if (this.placeHoldersMap.containsKey(key)) {
            $jacocoInit[3] = true;
            String str = (String) this.placeHoldersMap.get(key);
            $jacocoInit[4] = true;
            return str;
        }
        $jacocoInit[5] = true;
        return null;
    }

    public void set(Key key, @C0193h0 String str) {
        boolean[] $jacocoInit = $jacocoInit();
        this.placeHoldersMap.put(key, str);
        $jacocoInit[2] = true;
    }

    public void setPlaceHoldersMap(HashMap<Key, String> hashMap) {
        boolean[] $jacocoInit = $jacocoInit();
        this.placeHoldersMap = hashMap;
        $jacocoInit[6] = true;
    }
}
