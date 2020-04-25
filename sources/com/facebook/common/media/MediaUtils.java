package com.facebook.common.media;

import android.webkit.MimeTypeMap;
import com.facebook.common.internal.ImmutableMap;
import java.util.Locale;
import java.util.Map;
import p201f.p202a.C5952h;

public class MediaUtils {
    public static final Map<String, String> ADDITIONAL_ALLOWED_MIME_TYPES = ImmutableMap.m15726of("mkv", "video/x-matroska", "glb", "model/gltf-binary");

    @C5952h
    private static String extractExtension(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf < 0 || lastIndexOf == str.length() - 1) {
            return null;
        }
        return str.substring(lastIndexOf + 1);
    }

    @C5952h
    public static String extractMime(String str) {
        String extractExtension = extractExtension(str);
        if (extractExtension == null) {
            return null;
        }
        String lowerCase = extractExtension.toLowerCase(Locale.US);
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase);
        if (mimeTypeFromExtension == null) {
            mimeTypeFromExtension = (String) ADDITIONAL_ALLOWED_MIME_TYPES.get(lowerCase);
        }
        return mimeTypeFromExtension;
    }

    public static boolean isNonNativeSupportedMimeType(String str) {
        return ADDITIONAL_ALLOWED_MIME_TYPES.containsValue(str);
    }

    public static boolean isPhoto(@C5952h String str) {
        return str != null && str.startsWith("image/");
    }

    public static boolean isThreeD(@C5952h String str) {
        return str != null && str.equals("model/gltf-binary");
    }

    public static boolean isVideo(@C5952h String str) {
        return str != null && str.startsWith("video/");
    }
}
