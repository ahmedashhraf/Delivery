package com.instabug.library;

import androidx.annotation.C0193h0;
import java.util.HashMap;
import java.util.Map.Entry;
import p205i.p471b.p472a.p473a.p474c.C13938g;

@Deprecated
public class IBGCustomTextPlaceHolder {
    private static transient /* synthetic */ boolean[] $jacocoData;
    private HashMap<Key, String> placeHoldersMap = new HashMap<>();

    @Deprecated
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
        VIDEO_PLAYER_TITLE;

        static {
            boolean[] $jacocoInit;
            $jacocoInit[7] = true;
        }
    }

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-346033227888286879L, "com/instabug/library/IBGCustomTextPlaceHolder", 11);
        $jacocoData = a;
        return a;
    }

    public IBGCustomTextPlaceHolder() {
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

    /* access modifiers changed from: protected */
    public HashMap<com.instabug.library.InstabugCustomTextPlaceHolder.Key, String> getConvertedHashMap() {
        boolean[] $jacocoInit = $jacocoInit();
        HashMap<com.instabug.library.InstabugCustomTextPlaceHolder.Key, String> hashMap = new HashMap<>();
        $jacocoInit[6] = true;
        $jacocoInit[7] = true;
        for (Entry entry : this.placeHoldersMap.entrySet()) {
            $jacocoInit[8] = true;
            hashMap.put(com.instabug.library.InstabugCustomTextPlaceHolder.Key.valueOf(((Key) entry.getKey()).name()), entry.getValue());
            $jacocoInit[9] = true;
        }
        $jacocoInit[10] = true;
        return hashMap;
    }

    public void set(Key key, @C0193h0 String str) {
        boolean[] $jacocoInit = $jacocoInit();
        this.placeHoldersMap.put(key, str);
        $jacocoInit[2] = true;
    }
}
