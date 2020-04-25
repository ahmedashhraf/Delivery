package com.facebook.login;

import android.net.Uri;
import androidx.annotation.C0195i0;
import com.facebook.login.LoginClient.Request;
import java.util.Collection;

public class DeviceLoginManager extends LoginManager {
    private static volatile DeviceLoginManager instance;
    @C0195i0
    private String deviceAuthTargetUserId;
    private Uri deviceRedirectUri;

    public static DeviceLoginManager getInstance() {
        if (instance == null) {
            synchronized (DeviceLoginManager.class) {
                if (instance == null) {
                    instance = new DeviceLoginManager();
                }
            }
        }
        return instance;
    }

    /* access modifiers changed from: protected */
    public Request createLoginRequest(Collection<String> collection) {
        Request createLoginRequest = super.createLoginRequest(collection);
        Uri deviceRedirectUri2 = getDeviceRedirectUri();
        if (deviceRedirectUri2 != null) {
            createLoginRequest.setDeviceRedirectUriString(deviceRedirectUri2.toString());
        }
        String deviceAuthTargetUserId2 = getDeviceAuthTargetUserId();
        if (deviceAuthTargetUserId2 != null) {
            createLoginRequest.setDeviceAuthTargetUserId(deviceAuthTargetUserId2);
        }
        return createLoginRequest;
    }

    @C0195i0
    public String getDeviceAuthTargetUserId() {
        return this.deviceAuthTargetUserId;
    }

    public Uri getDeviceRedirectUri() {
        return this.deviceRedirectUri;
    }

    public void setDeviceAuthTargetUserId(@C0195i0 String str) {
        this.deviceAuthTargetUserId = str;
    }

    public void setDeviceRedirectUri(Uri uri) {
        this.deviceRedirectUri = uri;
    }
}
