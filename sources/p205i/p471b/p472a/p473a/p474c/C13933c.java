package p205i.p471b.p472a.p473a.p474c;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: i.b.a.a.c.c */
/* compiled from: ConfigLoader */
final class C13933c {

    /* renamed from: a */
    private static final String f40454a = "jacoco-agent.";

    /* renamed from: b */
    private static final Pattern f40455b = Pattern.compile("\\$\\{([^\\}]+)\\}");

    private C13933c() {
    }

    /* renamed from: a */
    static Properties m59875a(String str, Properties properties) {
        Properties properties2 = new Properties();
        m59877b(str, properties2);
        m59876a(properties, properties2);
        m59878b(properties2, properties);
        return properties2;
    }

    /* renamed from: b */
    private static void m59877b(String str, Properties properties) {
        InputStream resourceAsStream = C13938g.class.getResourceAsStream(str);
        if (resourceAsStream != null) {
            try {
                properties.load(resourceAsStream);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: b */
    private static void m59878b(Properties properties, Properties properties2) {
        for (Entry entry : properties.entrySet()) {
            String str = (String) entry.getValue();
            StringBuilder sb = new StringBuilder();
            Matcher matcher = f40455b.matcher(str);
            int i = 0;
            while (matcher.find()) {
                sb.append(str.substring(i, matcher.start()));
                String property = properties2.getProperty(matcher.group(1));
                if (property == null) {
                    property = matcher.group(0);
                }
                sb.append(property);
                i = matcher.end();
            }
            sb.append(str.substring(i));
            entry.setValue(sb.toString());
        }
    }

    /* renamed from: a */
    private static void m59876a(Properties properties, Properties properties2) {
        for (Entry entry : properties.entrySet()) {
            String obj = entry.getKey().toString();
            if (obj.startsWith(f40454a)) {
                properties2.put(obj.substring(13), entry.getValue());
            }
        }
    }
}
