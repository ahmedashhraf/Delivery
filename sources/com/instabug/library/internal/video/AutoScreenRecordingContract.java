package com.instabug.library.internal.video;

import android.net.Uri;
import androidx.annotation.C0195i0;

public interface AutoScreenRecordingContract {
    void clear();

    void delete();

    @C0195i0
    Uri getAutoScreenRecordingFileUri();

    boolean isEnabled();
}
