package com.facebook.share.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.internal.CallbackManagerImpl.RequestCodeOffset;
import com.facebook.internal.FacebookDialogBase;
import com.facebook.share.C3673R;
import com.facebook.share.Sharer.Result;
import com.facebook.share.model.ShareContent;

public final class SendButton extends ShareButtonBase {
    public SendButton(Context context) {
        super(context, null, 0, AnalyticsEvents.EVENT_SEND_BUTTON_CREATE, AnalyticsEvents.EVENT_SEND_BUTTON_DID_TAP);
    }

    /* access modifiers changed from: protected */
    public int getDefaultRequestCode() {
        return RequestCodeOffset.Message.toRequestCode();
    }

    /* access modifiers changed from: protected */
    public int getDefaultStyleResource() {
        return C3673R.style.com_facebook_button_send;
    }

    /* access modifiers changed from: protected */
    public FacebookDialogBase<ShareContent, Result> getDialog() {
        if (getFragment() != null) {
            return new MessageDialog(getFragment(), getRequestCode());
        }
        if (getNativeFragment() != null) {
            return new MessageDialog(getNativeFragment(), getRequestCode());
        }
        return new MessageDialog(getActivity(), getRequestCode());
    }

    public SendButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, AnalyticsEvents.EVENT_SEND_BUTTON_CREATE, AnalyticsEvents.EVENT_SEND_BUTTON_DID_TAP);
    }

    public SendButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, AnalyticsEvents.EVENT_SEND_BUTTON_CREATE, AnalyticsEvents.EVENT_SEND_BUTTON_DID_TAP);
    }
}
