package com.facebook.login.widget;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint.FontMetrics;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import androidx.appcompat.p006a.p007a.C0242a;
import com.facebook.AccessToken;
import com.facebook.AccessTokenTracker;
import com.facebook.CallbackManager;
import com.facebook.FacebookButtonBase;
import com.facebook.FacebookCallback;
import com.facebook.FacebookSdk;
import com.facebook.Profile;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.common.C3425R;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.internal.CallbackManagerImpl.RequestCodeOffset;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.LoginAuthorizationType;
import com.facebook.internal.ServerProtocol;
import com.facebook.internal.Utility;
import com.facebook.login.C3624R;
import com.facebook.login.DefaultAudience;
import com.facebook.login.LoginBehavior;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.ToolTipPopup.Style;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class LoginButton extends FacebookButtonBase {
    private static final String TAG = LoginButton.class.getName();
    private AccessTokenTracker accessTokenTracker;
    /* access modifiers changed from: private */
    public boolean confirmLogout;
    /* access modifiers changed from: private */
    public String loginLogoutEventName = AnalyticsEvents.EVENT_LOGIN_VIEW_USAGE;
    private LoginManager loginManager;
    private String loginText;
    private String logoutText;
    /* access modifiers changed from: private */
    public LoginButtonProperties properties = new LoginButtonProperties();
    private boolean toolTipChecked;
    private long toolTipDisplayTime = ToolTipPopup.DEFAULT_POPUP_DISPLAY_TIME;
    private ToolTipMode toolTipMode;
    private ToolTipPopup toolTipPopup;
    private Style toolTipStyle = Style.BLUE;

    /* renamed from: com.facebook.login.widget.LoginButton$3 */
    static /* synthetic */ class C36343 {
        static final /* synthetic */ int[] $SwitchMap$com$facebook$login$widget$LoginButton$ToolTipMode = new int[ToolTipMode.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                com.facebook.login.widget.LoginButton$ToolTipMode[] r0 = com.facebook.login.widget.LoginButton.ToolTipMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$facebook$login$widget$LoginButton$ToolTipMode = r0
                int[] r0 = $SwitchMap$com$facebook$login$widget$LoginButton$ToolTipMode     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.facebook.login.widget.LoginButton$ToolTipMode r1 = com.facebook.login.widget.LoginButton.ToolTipMode.AUTOMATIC     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = $SwitchMap$com$facebook$login$widget$LoginButton$ToolTipMode     // Catch:{ NoSuchFieldError -> 0x001f }
                com.facebook.login.widget.LoginButton$ToolTipMode r1 = com.facebook.login.widget.LoginButton.ToolTipMode.DISPLAY_ALWAYS     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = $SwitchMap$com$facebook$login$widget$LoginButton$ToolTipMode     // Catch:{ NoSuchFieldError -> 0x002a }
                com.facebook.login.widget.LoginButton$ToolTipMode r1 = com.facebook.login.widget.LoginButton.ToolTipMode.NEVER_DISPLAY     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.widget.LoginButton.C36343.<clinit>():void");
        }
    }

    static class LoginButtonProperties {
        private String authType = ServerProtocol.DIALOG_REREQUEST_AUTH_TYPE;
        /* access modifiers changed from: private */
        public LoginAuthorizationType authorizationType = null;
        private DefaultAudience defaultAudience = DefaultAudience.FRIENDS;
        private LoginBehavior loginBehavior = LoginBehavior.NATIVE_WITH_FALLBACK;
        /* access modifiers changed from: private */
        public List<String> permissions = Collections.emptyList();

        LoginButtonProperties() {
        }

        public void clearPermissions() {
            this.permissions = null;
            this.authorizationType = null;
        }

        public String getAuthType() {
            return this.authType;
        }

        public DefaultAudience getDefaultAudience() {
            return this.defaultAudience;
        }

        public LoginBehavior getLoginBehavior() {
            return this.loginBehavior;
        }

        /* access modifiers changed from: 0000 */
        public List<String> getPermissions() {
            return this.permissions;
        }

        public void setAuthType(String str) {
            this.authType = str;
        }

        public void setDefaultAudience(DefaultAudience defaultAudience2) {
            this.defaultAudience = defaultAudience2;
        }

        public void setLoginBehavior(LoginBehavior loginBehavior2) {
            this.loginBehavior = loginBehavior2;
        }

        public void setPublishPermissions(List<String> list) {
            if (LoginAuthorizationType.READ.equals(this.authorizationType)) {
                throw new UnsupportedOperationException("Cannot call setPublishPermissions after setReadPermissions has been called.");
            } else if (!Utility.isNullOrEmpty((Collection<T>) list)) {
                this.permissions = list;
                this.authorizationType = LoginAuthorizationType.PUBLISH;
            } else {
                throw new IllegalArgumentException("Permissions for publish actions cannot be null or empty.");
            }
        }

        public void setReadPermissions(List<String> list) {
            if (!LoginAuthorizationType.PUBLISH.equals(this.authorizationType)) {
                this.permissions = list;
                this.authorizationType = LoginAuthorizationType.READ;
                return;
            }
            throw new UnsupportedOperationException("Cannot call setReadPermissions after setPublishPermissions has been called.");
        }
    }

    protected class LoginClickListener implements OnClickListener {
        protected LoginClickListener() {
        }

        /* access modifiers changed from: protected */
        public LoginManager getLoginManager() {
            LoginManager instance = LoginManager.getInstance();
            instance.setDefaultAudience(LoginButton.this.getDefaultAudience());
            instance.setLoginBehavior(LoginButton.this.getLoginBehavior());
            instance.setAuthType(LoginButton.this.getAuthType());
            return instance;
        }

        public void onClick(View view) {
            LoginButton.this.callExternalOnClickListener(view);
            AccessToken currentAccessToken = AccessToken.getCurrentAccessToken();
            if (AccessToken.isCurrentAccessTokenActive()) {
                performLogout(LoginButton.this.getContext());
            } else {
                performLogin();
            }
            AppEventsLogger newLogger = AppEventsLogger.newLogger(LoginButton.this.getContext());
            Bundle bundle = new Bundle();
            bundle.putInt("logging_in", currentAccessToken != null ? 0 : 1);
            bundle.putInt("access_token_expired", AccessToken.isCurrentAccessTokenActive() ? 1 : 0);
            newLogger.logSdkEvent(LoginButton.this.loginLogoutEventName, null, bundle);
        }

        /* access modifiers changed from: protected */
        public void performLogin() {
            LoginManager loginManager = getLoginManager();
            if (LoginAuthorizationType.PUBLISH.equals(LoginButton.this.properties.authorizationType)) {
                if (LoginButton.this.getFragment() != null) {
                    loginManager.logInWithPublishPermissions(LoginButton.this.getFragment(), (Collection<String>) LoginButton.this.properties.permissions);
                } else if (LoginButton.this.getNativeFragment() != null) {
                    loginManager.logInWithPublishPermissions(LoginButton.this.getNativeFragment(), (Collection<String>) LoginButton.this.properties.permissions);
                } else {
                    loginManager.logInWithPublishPermissions(LoginButton.this.getActivity(), (Collection<String>) LoginButton.this.properties.permissions);
                }
            } else if (LoginButton.this.getFragment() != null) {
                loginManager.logInWithReadPermissions(LoginButton.this.getFragment(), (Collection<String>) LoginButton.this.properties.permissions);
            } else if (LoginButton.this.getNativeFragment() != null) {
                loginManager.logInWithReadPermissions(LoginButton.this.getNativeFragment(), (Collection<String>) LoginButton.this.properties.permissions);
            } else {
                loginManager.logInWithReadPermissions(LoginButton.this.getActivity(), (Collection<String>) LoginButton.this.properties.permissions);
            }
        }

        /* access modifiers changed from: protected */
        public void performLogout(Context context) {
            String str;
            final LoginManager loginManager = getLoginManager();
            if (LoginButton.this.confirmLogout) {
                String string = LoginButton.this.getResources().getString(C3624R.string.com_facebook_loginview_log_out_action);
                String string2 = LoginButton.this.getResources().getString(C3624R.string.com_facebook_loginview_cancel_action);
                Profile currentProfile = Profile.getCurrentProfile();
                if (currentProfile == null || currentProfile.getName() == null) {
                    str = LoginButton.this.getResources().getString(C3624R.string.com_facebook_loginview_logged_in_using_facebook);
                } else {
                    str = String.format(LoginButton.this.getResources().getString(C3624R.string.com_facebook_loginview_logged_in_as), new Object[]{currentProfile.getName()});
                }
                Builder builder = new Builder(context);
                builder.setMessage(str).setCancelable(true).setPositiveButton(string, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                        loginManager.logOut();
                    }
                }).setNegativeButton(string2, null);
                builder.create().show();
                return;
            }
            loginManager.logOut();
        }
    }

    public enum ToolTipMode {
        AUTOMATIC(AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_AUTOMATIC, 0),
        DISPLAY_ALWAYS("display_always", 1),
        NEVER_DISPLAY("never_display", 2);
        
        public static ToolTipMode DEFAULT;
        private int intValue;
        private String stringValue;

        static {
            ToolTipMode toolTipMode;
            DEFAULT = toolTipMode;
        }

        private ToolTipMode(String str, int i) {
            this.stringValue = str;
            this.intValue = i;
        }

        public static ToolTipMode fromInt(int i) {
            ToolTipMode[] values;
            for (ToolTipMode toolTipMode : values()) {
                if (toolTipMode.getValue() == i) {
                    return toolTipMode;
                }
            }
            return null;
        }

        public int getValue() {
            return this.intValue;
        }

        public String toString() {
            return this.stringValue;
        }
    }

    public LoginButton(Context context) {
        super(context, null, 0, 0, AnalyticsEvents.EVENT_LOGIN_BUTTON_CREATE, AnalyticsEvents.EVENT_LOGIN_BUTTON_DID_TAP);
    }

    private void checkToolTipSettings() {
        int i = C36343.$SwitchMap$com$facebook$login$widget$LoginButton$ToolTipMode[this.toolTipMode.ordinal()];
        if (i == 1) {
            final String metadataApplicationId = Utility.getMetadataApplicationId(getContext());
            FacebookSdk.getExecutor().execute(new Runnable() {
                public void run() {
                    final FetchedAppSettings queryAppSettings = FetchedAppSettingsManager.queryAppSettings(metadataApplicationId, false);
                    LoginButton.this.getActivity().runOnUiThread(new Runnable() {
                        public void run() {
                            LoginButton.this.showToolTipPerSettings(queryAppSettings);
                        }
                    });
                }
            });
        } else if (i == 2) {
            displayToolTip(getResources().getString(C3624R.string.com_facebook_tooltip_default));
        }
    }

    private void displayToolTip(String str) {
        this.toolTipPopup = new ToolTipPopup(str, this);
        this.toolTipPopup.setStyle(this.toolTipStyle);
        this.toolTipPopup.setNuxDisplayTime(this.toolTipDisplayTime);
        this.toolTipPopup.show();
    }

    private int measureButtonWidth(String str) {
        return getCompoundPaddingLeft() + getCompoundDrawablePadding() + measureTextWidth(str) + getCompoundPaddingRight();
    }

    private void parseLoginButtonAttributes(Context context, AttributeSet attributeSet, int i, int i2) {
        this.toolTipMode = ToolTipMode.DEFAULT;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C3624R.styleable.com_facebook_login_view, i, i2);
        try {
            this.confirmLogout = obtainStyledAttributes.getBoolean(C3624R.styleable.com_facebook_login_view_com_facebook_confirm_logout, true);
            this.loginText = obtainStyledAttributes.getString(C3624R.styleable.com_facebook_login_view_com_facebook_login_text);
            this.logoutText = obtainStyledAttributes.getString(C3624R.styleable.com_facebook_login_view_com_facebook_logout_text);
            this.toolTipMode = ToolTipMode.fromInt(obtainStyledAttributes.getInt(C3624R.styleable.com_facebook_login_view_com_facebook_tooltip_mode, ToolTipMode.DEFAULT.getValue()));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* access modifiers changed from: private */
    public void setButtonText() {
        Resources resources = getResources();
        if (isInEditMode() || !AccessToken.isCurrentAccessTokenActive()) {
            String str = this.loginText;
            if (str != null) {
                setText(str);
                return;
            }
            String string = resources.getString(C3624R.string.com_facebook_loginview_log_in_button_continue);
            int width = getWidth();
            if (width != 0 && measureButtonWidth(string) > width) {
                string = resources.getString(C3624R.string.com_facebook_loginview_log_in_button);
            }
            setText(string);
            return;
        }
        String str2 = this.logoutText;
        if (str2 == null) {
            str2 = resources.getString(C3624R.string.com_facebook_loginview_log_out_button);
        }
        setText(str2);
    }

    /* access modifiers changed from: private */
    public void showToolTipPerSettings(FetchedAppSettings fetchedAppSettings) {
        if (fetchedAppSettings != null && fetchedAppSettings.getNuxEnabled() && getVisibility() == 0) {
            displayToolTip(fetchedAppSettings.getNuxContent());
        }
    }

    public void clearPermissions() {
        this.properties.clearPermissions();
    }

    /* access modifiers changed from: protected */
    public void configureButton(Context context, AttributeSet attributeSet, int i, int i2) {
        super.configureButton(context, attributeSet, i, i2);
        setInternalOnClickListener(getNewLoginClickListener());
        parseLoginButtonAttributes(context, attributeSet, i, i2);
        if (isInEditMode()) {
            setBackgroundColor(getResources().getColor(C3425R.C3426color.com_facebook_blue));
            this.loginText = "Continue with Facebook";
        } else {
            this.accessTokenTracker = new AccessTokenTracker() {
                /* access modifiers changed from: protected */
                public void onCurrentAccessTokenChanged(AccessToken accessToken, AccessToken accessToken2) {
                    LoginButton.this.setButtonText();
                }
            };
        }
        setButtonText();
        setCompoundDrawablesWithIntrinsicBounds(C0242a.m1109c(getContext(), C3624R.C3626drawable.com_facebook_button_login_logo), null, null, null);
    }

    public void dismissToolTip() {
        ToolTipPopup toolTipPopup2 = this.toolTipPopup;
        if (toolTipPopup2 != null) {
            toolTipPopup2.dismiss();
            this.toolTipPopup = null;
        }
    }

    public String getAuthType() {
        return this.properties.getAuthType();
    }

    public DefaultAudience getDefaultAudience() {
        return this.properties.getDefaultAudience();
    }

    /* access modifiers changed from: protected */
    public int getDefaultRequestCode() {
        return RequestCodeOffset.Login.toRequestCode();
    }

    /* access modifiers changed from: protected */
    public int getDefaultStyleResource() {
        return C3624R.style.com_facebook_loginview_default_style;
    }

    public LoginBehavior getLoginBehavior() {
        return this.properties.getLoginBehavior();
    }

    /* access modifiers changed from: 0000 */
    public LoginManager getLoginManager() {
        if (this.loginManager == null) {
            this.loginManager = LoginManager.getInstance();
        }
        return this.loginManager;
    }

    /* access modifiers changed from: protected */
    public LoginClickListener getNewLoginClickListener() {
        return new LoginClickListener();
    }

    /* access modifiers changed from: 0000 */
    public List<String> getPermissions() {
        return this.properties.getPermissions();
    }

    public long getToolTipDisplayTime() {
        return this.toolTipDisplayTime;
    }

    public ToolTipMode getToolTipMode() {
        return this.toolTipMode;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        AccessTokenTracker accessTokenTracker2 = this.accessTokenTracker;
        if (accessTokenTracker2 != null && !accessTokenTracker2.isTracking()) {
            this.accessTokenTracker.startTracking();
            setButtonText();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AccessTokenTracker accessTokenTracker2 = this.accessTokenTracker;
        if (accessTokenTracker2 != null) {
            accessTokenTracker2.stopTracking();
        }
        dismissToolTip();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.toolTipChecked && !isInEditMode()) {
            this.toolTipChecked = true;
            checkToolTipSettings();
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        setButtonText();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        FontMetrics fontMetrics = getPaint().getFontMetrics();
        int compoundPaddingTop = getCompoundPaddingTop() + ((int) Math.ceil((double) (Math.abs(fontMetrics.top) + Math.abs(fontMetrics.bottom)))) + getCompoundPaddingBottom();
        Resources resources = getResources();
        String str = this.loginText;
        if (str == null) {
            str = resources.getString(C3624R.string.com_facebook_loginview_log_in_button_continue);
            int measureButtonWidth = measureButtonWidth(str);
            if (Button.resolveSize(measureButtonWidth, i) < measureButtonWidth) {
                str = resources.getString(C3624R.string.com_facebook_loginview_log_in_button);
            }
        }
        int measureButtonWidth2 = measureButtonWidth(str);
        String str2 = this.logoutText;
        if (str2 == null) {
            str2 = resources.getString(C3624R.string.com_facebook_loginview_log_out_button);
        }
        setMeasuredDimension(Button.resolveSize(Math.max(measureButtonWidth2, measureButtonWidth(str2)), i), compoundPaddingTop);
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i != 0) {
            dismissToolTip();
        }
    }

    public void registerCallback(CallbackManager callbackManager, FacebookCallback<LoginResult> facebookCallback) {
        getLoginManager().registerCallback(callbackManager, facebookCallback);
    }

    public void setAuthType(String str) {
        this.properties.setAuthType(str);
    }

    public void setDefaultAudience(DefaultAudience defaultAudience) {
        this.properties.setDefaultAudience(defaultAudience);
    }

    public void setLoginBehavior(LoginBehavior loginBehavior) {
        this.properties.setLoginBehavior(loginBehavior);
    }

    /* access modifiers changed from: 0000 */
    public void setLoginManager(LoginManager loginManager2) {
        this.loginManager = loginManager2;
    }

    /* access modifiers changed from: 0000 */
    public void setProperties(LoginButtonProperties loginButtonProperties) {
        this.properties = loginButtonProperties;
    }

    public void setPublishPermissions(List<String> list) {
        this.properties.setPublishPermissions(list);
    }

    public void setReadPermissions(List<String> list) {
        this.properties.setReadPermissions(list);
    }

    public void setToolTipDisplayTime(long j) {
        this.toolTipDisplayTime = j;
    }

    public void setToolTipMode(ToolTipMode toolTipMode2) {
        this.toolTipMode = toolTipMode2;
    }

    public void setToolTipStyle(Style style) {
        this.toolTipStyle = style;
    }

    public void unregisterCallback(CallbackManager callbackManager) {
        getLoginManager().unregisterCallback(callbackManager);
    }

    public void setPublishPermissions(String... strArr) {
        this.properties.setPublishPermissions(Arrays.asList(strArr));
    }

    public void setReadPermissions(String... strArr) {
        this.properties.setReadPermissions(Arrays.asList(strArr));
    }

    public LoginButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0, AnalyticsEvents.EVENT_LOGIN_BUTTON_CREATE, AnalyticsEvents.EVENT_LOGIN_BUTTON_DID_TAP);
    }

    public LoginButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0, AnalyticsEvents.EVENT_LOGIN_BUTTON_CREATE, AnalyticsEvents.EVENT_LOGIN_BUTTON_DID_TAP);
    }
}
