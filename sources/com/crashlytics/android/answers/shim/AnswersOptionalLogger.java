package com.crashlytics.android.answers.shim;

public class AnswersOptionalLogger {
    private static final String TAG = "AnswersOptionalLogger";
    private static final KitEventLogger logger;

    static {
        KitEventLogger kitEventLogger;
        try {
            kitEventLogger = AnswersKitEventLogger.create();
        } catch (IllegalStateException | NoClassDefFoundError unused) {
            kitEventLogger = null;
        }
        if (kitEventLogger == null) {
            kitEventLogger = NoopKitEventLogger.create();
        }
        logger = kitEventLogger;
    }

    public static KitEventLogger get() {
        return logger;
    }
}
