package com.crashlytics.android.core;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.concurrent.CountDownLatch;
import p212io.fabric.sdk.android.p493p.p498e.C14321p;

class CrashPromptDialog {
    private final Builder dialog;
    private final OptInLatch latch;

    interface AlwaysSendCallback {
        void sendUserReportsWithoutPrompting(boolean z);
    }

    private static class OptInLatch {
        private final CountDownLatch latch;
        private boolean send;

        private OptInLatch() {
            this.send = false;
            this.latch = new CountDownLatch(1);
        }

        /* access modifiers changed from: 0000 */
        public void await() {
            try {
                this.latch.await();
            } catch (InterruptedException unused) {
            }
        }

        /* access modifiers changed from: 0000 */
        public boolean getOptIn() {
            return this.send;
        }

        /* access modifiers changed from: 0000 */
        public void setOptIn(boolean z) {
            this.send = z;
            this.latch.countDown();
        }
    }

    private CrashPromptDialog(Builder builder, OptInLatch optInLatch) {
        this.latch = optInLatch;
        this.dialog = builder;
    }

    public static CrashPromptDialog create(Activity activity, C14321p pVar, final AlwaysSendCallback alwaysSendCallback) {
        final OptInLatch optInLatch = new OptInLatch();
        DialogStringResolver dialogStringResolver = new DialogStringResolver(activity, pVar);
        Builder builder = new Builder(activity);
        ScrollView createDialogView = createDialogView(activity, dialogStringResolver.getMessage());
        builder.setView(createDialogView).setTitle(dialogStringResolver.getTitle()).setCancelable(false).setNeutralButton(dialogStringResolver.getSendButtonTitle(), new OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                optInLatch.setOptIn(true);
                dialogInterface.dismiss();
            }
        });
        if (pVar.f42249d) {
            builder.setNegativeButton(dialogStringResolver.getCancelButtonTitle(), new OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    optInLatch.setOptIn(false);
                    dialogInterface.dismiss();
                }
            });
        }
        if (pVar.f42251f) {
            builder.setPositiveButton(dialogStringResolver.getAlwaysSendButtonTitle(), new OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    alwaysSendCallback.sendUserReportsWithoutPrompting(true);
                    optInLatch.setOptIn(true);
                    dialogInterface.dismiss();
                }
            });
        }
        return new CrashPromptDialog(builder, optInLatch);
    }

    private static ScrollView createDialogView(Activity activity, String str) {
        float f = activity.getResources().getDisplayMetrics().density;
        int dipsToPixels = dipsToPixels(f, 5);
        TextView textView = new TextView(activity);
        textView.setAutoLinkMask(15);
        textView.setText(str);
        textView.setTextAppearance(activity, 16973892);
        textView.setPadding(dipsToPixels, dipsToPixels, dipsToPixels, dipsToPixels);
        textView.setFocusable(false);
        ScrollView scrollView = new ScrollView(activity);
        scrollView.setPadding(dipsToPixels(f, 14), dipsToPixels(f, 2), dipsToPixels(f, 10), dipsToPixels(f, 12));
        scrollView.addView(textView);
        return scrollView;
    }

    private static int dipsToPixels(float f, int i) {
        return (int) (f * ((float) i));
    }

    public void await() {
        this.latch.await();
    }

    public boolean getOptIn() {
        return this.latch.getOptIn();
    }

    public void show() {
        this.dialog.show();
    }
}
