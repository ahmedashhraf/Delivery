package com.crashlytics.android.answers;

import android.app.Activity;
import java.util.Collections;
import java.util.Map;

final class SessionEvent {
    static final String ACTIVITY_KEY = "activity";
    static final String EXCEPTION_NAME_KEY = "exceptionName";
    static final String INSTALLED_AT_KEY = "installedAt";
    static final String SESSION_ID_KEY = "sessionId";
    public final Map<String, Object> customAttributes;
    public final String customType;
    public final Map<String, String> details;
    public final Map<String, Object> predefinedAttributes;
    public final String predefinedType;
    public final SessionEventMetadata sessionEventMetadata;
    private String stringRepresentation;
    public final long timestamp;
    public final Type type;

    static class Builder {
        Map<String, Object> customAttributes = null;
        String customType = null;
        Map<String, String> details = null;
        Map<String, Object> predefinedAttributes = null;
        String predefinedType = null;
        final long timestamp = System.currentTimeMillis();
        final Type type;

        public Builder(Type type2) {
            this.type = type2;
        }

        public SessionEvent build(SessionEventMetadata sessionEventMetadata) {
            SessionEvent sessionEvent = new SessionEvent(sessionEventMetadata, this.timestamp, this.type, this.details, this.customType, this.customAttributes, this.predefinedType, this.predefinedAttributes);
            return sessionEvent;
        }

        public Builder customAttributes(Map<String, Object> map) {
            this.customAttributes = map;
            return this;
        }

        public Builder customType(String str) {
            this.customType = str;
            return this;
        }

        public Builder details(Map<String, String> map) {
            this.details = map;
            return this;
        }

        public Builder predefinedAttributes(Map<String, Object> map) {
            this.predefinedAttributes = map;
            return this;
        }

        public Builder predefinedType(String str) {
            this.predefinedType = str;
            return this;
        }
    }

    enum Type {
        START,
        RESUME,
        PAUSE,
        STOP,
        CRASH,
        INSTALL,
        CUSTOM,
        PREDEFINED
    }

    public static Builder crashEventBuilder(String str) {
        return new Builder(Type.CRASH).details(Collections.singletonMap(SESSION_ID_KEY, str));
    }

    public static Builder customEventBuilder(CustomEvent customEvent) {
        return new Builder(Type.CUSTOM).customType(customEvent.getCustomType()).customAttributes(customEvent.getCustomAttributes());
    }

    public static Builder installEventBuilder(long j) {
        return new Builder(Type.INSTALL).details(Collections.singletonMap(INSTALLED_AT_KEY, String.valueOf(j)));
    }

    public static Builder lifecycleEventBuilder(Type type2, Activity activity) {
        return new Builder(type2).details(Collections.singletonMap(ACTIVITY_KEY, activity.getClass().getName()));
    }

    public static Builder predefinedEventBuilder(PredefinedEvent<?> predefinedEvent) {
        return new Builder(Type.PREDEFINED).predefinedType(predefinedEvent.getPredefinedType()).predefinedAttributes(predefinedEvent.getPredefinedAttributes()).customAttributes(predefinedEvent.getCustomAttributes());
    }

    public String toString() {
        if (this.stringRepresentation == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append(SessionEvent.class.getSimpleName());
            sb.append(": ");
            sb.append("timestamp=");
            sb.append(this.timestamp);
            sb.append(", type=");
            sb.append(this.type);
            sb.append(", details=");
            sb.append(this.details);
            sb.append(", customType=");
            sb.append(this.customType);
            sb.append(", customAttributes=");
            sb.append(this.customAttributes);
            sb.append(", predefinedType=");
            sb.append(this.predefinedType);
            sb.append(", predefinedAttributes=");
            sb.append(this.predefinedAttributes);
            sb.append(", metadata=[");
            sb.append(this.sessionEventMetadata);
            sb.append("]]");
            this.stringRepresentation = sb.toString();
        }
        return this.stringRepresentation;
    }

    private SessionEvent(SessionEventMetadata sessionEventMetadata2, long j, Type type2, Map<String, String> map, String str, Map<String, Object> map2, String str2, Map<String, Object> map3) {
        this.sessionEventMetadata = sessionEventMetadata2;
        this.timestamp = j;
        this.type = type2;
        this.details = map;
        this.customType = str;
        this.customAttributes = map2;
        this.predefinedType = str2;
        this.predefinedAttributes = map3;
    }

    public static Builder crashEventBuilder(String str, String str2) {
        return crashEventBuilder(str).customAttributes(Collections.singletonMap(EXCEPTION_NAME_KEY, str2));
    }
}
