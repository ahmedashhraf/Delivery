package com.facebook.share.widget;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.facebook.FacebookCallback;
import com.facebook.internal.AppCall;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.CallbackManagerImpl.Callback;
import com.facebook.internal.CallbackManagerImpl.RequestCodeOffset;
import com.facebook.internal.DialogFeature;
import com.facebook.internal.DialogPresenter;
import com.facebook.internal.DialogPresenter.ParameterProvider;
import com.facebook.internal.FacebookDialogBase;
import com.facebook.internal.FragmentWrapper;
import com.facebook.share.internal.AppInviteDialogFeature;
import com.facebook.share.internal.ResultProcessor;
import com.facebook.share.internal.ShareConstants;
import com.facebook.share.internal.ShareInternalUtility;
import com.facebook.share.model.AppInviteContent;
import com.mrsool.utils.C11644i;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
public class AppInviteDialog extends FacebookDialogBase<AppInviteContent, Result> {
    private static final int DEFAULT_REQUEST_CODE = RequestCodeOffset.AppInvite.toRequestCode();
    private static final String TAG = "AppInviteDialog";

    private class NativeHandler extends ModeHandler {
        private NativeHandler() {
            super();
        }

        public boolean canShow(AppInviteContent appInviteContent, boolean z) {
            return false;
        }

        public AppCall createAppCall(final AppInviteContent appInviteContent) {
            AppCall createBaseAppCall = AppInviteDialog.this.createBaseAppCall();
            DialogPresenter.setupAppCallForNativeDialog(createBaseAppCall, new ParameterProvider() {
                public Bundle getLegacyParameters() {
                    return new Bundle();
                }

                public Bundle getParameters() {
                    return AppInviteDialog.createParameters(appInviteContent);
                }
            }, AppInviteDialog.getFeature());
            return createBaseAppCall;
        }
    }

    @Deprecated
    public static final class Result {
        private final Bundle bundle;

        public Result(Bundle bundle2) {
            this.bundle = bundle2;
        }

        public Bundle getData() {
            return this.bundle;
        }
    }

    private class WebFallbackHandler extends ModeHandler {
        private WebFallbackHandler() {
            super();
        }

        public boolean canShow(AppInviteContent appInviteContent, boolean z) {
            return false;
        }

        public AppCall createAppCall(AppInviteContent appInviteContent) {
            AppCall createBaseAppCall = AppInviteDialog.this.createBaseAppCall();
            DialogPresenter.setupAppCallForWebFallbackDialog(createBaseAppCall, AppInviteDialog.createParameters(appInviteContent), AppInviteDialog.getFeature());
            return createBaseAppCall;
        }
    }

    @Deprecated
    public AppInviteDialog(Activity activity) {
        super(activity, DEFAULT_REQUEST_CODE);
    }

    @Deprecated
    public static boolean canShow() {
        return false;
    }

    private static boolean canShowNativeDialog() {
        return false;
    }

    private static boolean canShowWebFallback() {
        return false;
    }

    /* access modifiers changed from: private */
    public static Bundle createParameters(AppInviteContent appInviteContent) {
        String str = ShareConstants.PROMO_TEXT;
        String str2 = ShareConstants.PROMO_CODE;
        Bundle bundle = new Bundle();
        bundle.putString(ShareConstants.APPLINK_URL, appInviteContent.getApplinkUrl());
        bundle.putString(ShareConstants.PREVIEW_IMAGE_URL, appInviteContent.getPreviewImageUrl());
        bundle.putString("destination", appInviteContent.getDestination().toString());
        String promotionCode = appInviteContent.getPromotionCode();
        if (promotionCode == null) {
            promotionCode = "";
        }
        String promotionText = appInviteContent.getPromotionText();
        if (!TextUtils.isEmpty(promotionText)) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(str2, promotionCode);
                jSONObject.put(str, promotionText);
                bundle.putString(ShareConstants.DEEPLINK_CONTEXT, jSONObject.toString());
                bundle.putString(str2, promotionCode);
                bundle.putString(str, promotionText);
            } catch (JSONException unused) {
            }
        }
        return bundle;
    }

    /* access modifiers changed from: private */
    public static DialogFeature getFeature() {
        return AppInviteDialogFeature.APP_INVITES_DIALOG;
    }

    /* access modifiers changed from: protected */
    public AppCall createBaseAppCall() {
        return new AppCall(getRequestCode());
    }

    /* access modifiers changed from: protected */
    public List<ModeHandler> getOrderedModeHandlers() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new NativeHandler());
        arrayList.add(new WebFallbackHandler());
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public void registerCallbackImpl(CallbackManagerImpl callbackManagerImpl, final FacebookCallback<Result> facebookCallback) {
        final ResultProcessor r3 = facebookCallback == null ? null : new ResultProcessor(facebookCallback) {
            public void onSuccess(AppCall appCall, Bundle bundle) {
                if (C11644i.f33298f3.equalsIgnoreCase(ShareInternalUtility.getNativeDialogCompletionGesture(bundle))) {
                    facebookCallback.onCancel();
                } else {
                    facebookCallback.onSuccess(new Result(bundle));
                }
            }
        };
        callbackManagerImpl.registerCallback(getRequestCode(), new Callback() {
            public boolean onActivityResult(int i, Intent intent) {
                return ShareInternalUtility.handleActivityResult(AppInviteDialog.this.getRequestCode(), i, intent, r3);
            }
        });
    }

    @Deprecated
    public void show(AppInviteContent appInviteContent) {
    }

    @Deprecated
    public AppInviteDialog(Fragment fragment) {
        this(new FragmentWrapper(fragment));
    }

    @Deprecated
    public static void show(Activity activity, AppInviteContent appInviteContent) {
        new AppInviteDialog(activity).show(appInviteContent);
    }

    @Deprecated
    public AppInviteDialog(android.app.Fragment fragment) {
        this(new FragmentWrapper(fragment));
    }

    private AppInviteDialog(FragmentWrapper fragmentWrapper) {
        super(fragmentWrapper, DEFAULT_REQUEST_CODE);
    }

    @Deprecated
    public static void show(Fragment fragment, AppInviteContent appInviteContent) {
        show(new FragmentWrapper(fragment), appInviteContent);
    }

    @Deprecated
    public static void show(android.app.Fragment fragment, AppInviteContent appInviteContent) {
        show(new FragmentWrapper(fragment), appInviteContent);
    }

    private static void show(FragmentWrapper fragmentWrapper, AppInviteContent appInviteContent) {
        new AppInviteDialog(fragmentWrapper).show(appInviteContent);
    }
}
