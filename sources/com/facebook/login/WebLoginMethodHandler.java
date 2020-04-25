package com.facebook.login;

import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import com.facebook.AccessToken;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.FacebookServiceException;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.internal.ServerProtocol;
import com.facebook.internal.Utility;
import com.facebook.login.LoginClient.Request;
import com.facebook.login.LoginClient.Result;
import java.util.Collection;
import java.util.Locale;

abstract class WebLoginMethodHandler extends LoginMethodHandler {
    private static final String WEB_VIEW_AUTH_HANDLER_STORE = "com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY";
    private static final String WEB_VIEW_AUTH_HANDLER_TOKEN_KEY = "TOKEN";
    private String e2e;

    WebLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    private static final String getRedirectUri() {
        StringBuilder sb = new StringBuilder();
        sb.append("fb");
        sb.append(FacebookSdk.getApplicationId());
        sb.append("://authorize");
        return sb.toString();
    }

    private String loadCookieToken() {
        return this.loginClient.getActivity().getSharedPreferences(WEB_VIEW_AUTH_HANDLER_STORE, 0).getString("TOKEN", "");
    }

    private void saveCookieToken(String str) {
        this.loginClient.getActivity().getSharedPreferences(WEB_VIEW_AUTH_HANDLER_STORE, 0).edit().putString("TOKEN", str).apply();
    }

    /* access modifiers changed from: protected */
    public Bundle addExtraParameters(Bundle bundle, Request request) {
        bundle.putString(ServerProtocol.DIALOG_PARAM_REDIRECT_URI, getRedirectUri());
        bundle.putString("client_id", request.getApplicationId());
        bundle.putString("e2e", LoginClient.getE2E());
        bundle.putString(ServerProtocol.DIALOG_PARAM_RESPONSE_TYPE, ServerProtocol.DIALOG_RESPONSE_TYPE_TOKEN_AND_SIGNED_REQUEST);
        bundle.putString(ServerProtocol.DIALOG_PARAM_RETURN_SCOPES, ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
        bundle.putString(ServerProtocol.DIALOG_PARAM_AUTH_TYPE, request.getAuthType());
        if (getSSODevice() != null) {
            bundle.putString(ServerProtocol.DIALOG_PARAM_SSO_DEVICE, getSSODevice());
        }
        return bundle;
    }

    /* access modifiers changed from: protected */
    public Bundle getParameters(Request request) {
        Bundle bundle = new Bundle();
        if (!Utility.isNullOrEmpty((Collection<T>) request.getPermissions())) {
            String join = TextUtils.join(",", request.getPermissions());
            String str = "scope";
            bundle.putString(str, join);
            addLoggingExtra(str, join);
        }
        bundle.putString(ServerProtocol.DIALOG_PARAM_DEFAULT_AUDIENCE, request.getDefaultAudience().getNativeProtocolAudience());
        bundle.putString("state", getClientState(request.getAuthId()));
        AccessToken currentAccessToken = AccessToken.getCurrentAccessToken();
        String token = currentAccessToken != null ? currentAccessToken.getToken() : null;
        String str2 = "access_token";
        if (token == null || !token.equals(loadCookieToken())) {
            Utility.clearFacebookCookies(this.loginClient.getActivity());
            addLoggingExtra(str2, AppEventsConstants.EVENT_PARAM_VALUE_NO);
        } else {
            bundle.putString(str2, token);
            addLoggingExtra(str2, "1");
        }
        return bundle;
    }

    /* access modifiers changed from: protected */
    public String getSSODevice() {
        return null;
    }

    /* access modifiers changed from: 0000 */
    public abstract AccessTokenSource getTokenSource();

    /* access modifiers changed from: protected */
    public void onComplete(Request request, Bundle bundle, FacebookException facebookException) {
        Result result;
        String str;
        this.e2e = null;
        if (bundle != null) {
            String str2 = "e2e";
            if (bundle.containsKey(str2)) {
                this.e2e = bundle.getString(str2);
            }
            try {
                AccessToken createAccessTokenFromWebBundle = LoginMethodHandler.createAccessTokenFromWebBundle(request.getPermissions(), bundle, getTokenSource(), request.getApplicationId());
                result = Result.createTokenResult(this.loginClient.getPendingRequest(), createAccessTokenFromWebBundle);
                CookieSyncManager.createInstance(this.loginClient.getActivity()).sync();
                saveCookieToken(createAccessTokenFromWebBundle.getToken());
            } catch (FacebookException e) {
                result = Result.createErrorResult(this.loginClient.getPendingRequest(), null, e.getMessage());
            }
        } else if (facebookException instanceof FacebookOperationCanceledException) {
            result = Result.createCancelResult(this.loginClient.getPendingRequest(), "User canceled log in.");
        } else {
            this.e2e = null;
            String message = facebookException.getMessage();
            if (facebookException instanceof FacebookServiceException) {
                FacebookRequestError requestError = ((FacebookServiceException) facebookException).getRequestError();
                str = String.format(Locale.ROOT, "%d", new Object[]{Integer.valueOf(requestError.getErrorCode())});
                message = requestError.toString();
            } else {
                str = null;
            }
            result = Result.createErrorResult(this.loginClient.getPendingRequest(), null, message, str);
        }
        if (!Utility.isNullOrEmpty(this.e2e)) {
            logWebLoginCompleted(this.e2e);
        }
        this.loginClient.completeAndValidate(result);
    }

    WebLoginMethodHandler(Parcel parcel) {
        super(parcel);
    }
}
