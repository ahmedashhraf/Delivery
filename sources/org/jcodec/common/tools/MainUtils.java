package org.jcodec.common.tools;

import com.facebook.internal.ServerProtocol;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jcodec.common.StringUtils;

public class MainUtils {
    private static final String JCODEC_LOG_SINK_COLOR = "jcodec.colorPrint";
    private static Pattern flagPattern = Pattern.compile("^--([^=]+)=(.*)$");
    public static boolean isColorSupported = (System.console() != null || Boolean.parseBoolean(System.getProperty(JCODEC_LOG_SINK_COLOR)));

    public enum ANSIColor {
        BLACK,
        RED,
        GREEN,
        BROWN,
        BLUE,
        MAGENTA,
        CYAN,
        GREY
    }

    public static class Cmd {
        public String[] args;
        public Map<String, String> flags;

        public Cmd(Map<String, String> map, String[] strArr) {
            this.flags = map;
            this.args = strArr;
        }

        public int argsLength() {
            return this.args.length;
        }

        public String getArg(int i) {
            String[] strArr = this.args;
            if (i < strArr.length) {
                return strArr[i];
            }
            return null;
        }

        public Boolean getBooleanFlag(String str, Boolean bool) {
            return this.flags.containsKey(str) ? new Boolean((String) this.flags.get(str)) : bool;
        }

        public Double getDoubleFlag(String str, Long l) {
            return Double.valueOf(this.flags.containsKey(str) ? new Double((String) this.flags.get(str)).doubleValue() : (double) l.longValue());
        }

        public Integer getIntegerFlag(String str, Integer num) {
            return this.flags.containsKey(str) ? new Integer((String) this.flags.get(str)) : num;
        }

        public Long getLongFlag(String str, Long l) {
            return this.flags.containsKey(str) ? new Long((String) this.flags.get(str)) : l;
        }

        public int[] getMultiIntegerFlag(String str, int[] iArr) {
            if (!this.flags.containsKey(str)) {
                return iArr;
            }
            String[] split = StringUtils.split((String) this.flags.get(str), ",");
            int[] iArr2 = new int[split.length];
            for (int i = 0; i < split.length; i++) {
                iArr2[i] = Integer.parseInt(split[i]);
            }
            return iArr2;
        }

        public String getStringFlag(String str, String str2) {
            return this.flags.containsKey(str) ? (String) this.flags.get(str) : str2;
        }

        public Boolean getBooleanFlag(String str) {
            return getBooleanFlag(str, null);
        }

        public Double getDoubleFlag(String str) {
            return getDoubleFlag(str, null);
        }

        public Integer getIntegerFlag(String str) {
            return getIntegerFlag(str, null);
        }

        public Long getLongFlag(String str) {
            return getLongFlag(str, null);
        }

        public String getStringFlag(String str) {
            return getStringFlag(str, null);
        }

        public int[] getMultiIntegerFlag(String str) {
            return getMultiIntegerFlag(str, new int[0]);
        }
    }

    public static String bold(String str) {
        if (!isColorSupported) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\u001b[1m");
        sb.append(str);
        sb.append("\u001b[0m");
        return sb.toString();
    }

    public static String color(String str, ANSIColor aNSIColor) {
        if (!isColorSupported) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\u001b[");
        sb.append((aNSIColor.ordinal() & 7) + 30);
        sb.append("m");
        sb.append(str);
        sb.append("\u001b[0m");
        return sb.toString();
    }

    public static String colorString(String str, String str2) {
        if (!isColorSupported) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\u001b[");
        sb.append(str2);
        sb.append("m");
        sb.append(str);
        sb.append("\u001b[0m");
        return sb.toString();
    }

    public static Cmd parseArguments(String[] strArr) {
        HashMap hashMap = new HashMap();
        int i = 0;
        while (i < strArr.length) {
            if (!strArr[i].startsWith("--")) {
                if (!strArr[i].startsWith("-")) {
                    break;
                }
                i++;
                hashMap.put(strArr[i].substring(1), strArr[i]);
            } else {
                Matcher matcher = flagPattern.matcher(strArr[i]);
                if (matcher.matches()) {
                    hashMap.put(matcher.group(1), matcher.group(2));
                } else {
                    hashMap.put(strArr[i].substring(2), ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
                }
            }
            i++;
        }
        return new Cmd(hashMap, (String[]) Arrays.copyOfRange(strArr, i, strArr.length));
    }

    public static void printHelp(Map<String, String> map, String... strArr) {
        System.out.print(bold("Syntax:"));
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (Entry entry : map.entrySet()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(" [");
            StringBuilder sb4 = new StringBuilder();
            String str = "--";
            sb4.append(str);
            sb4.append((String) entry.getKey());
            sb4.append("=<value>");
            sb3.append(bold(color(sb4.toString(), ANSIColor.MAGENTA)));
            sb3.append("]");
            sb.append(sb3.toString());
            StringBuilder sb5 = new StringBuilder();
            sb5.append("\t");
            StringBuilder sb6 = new StringBuilder();
            sb6.append(str);
            sb6.append((String) entry.getKey());
            sb5.append(bold(color(sb6.toString(), ANSIColor.MAGENTA)));
            sb5.append("\t\t");
            sb5.append((String) entry.getValue());
            sb5.append("\n");
            sb2.append(sb5.toString());
        }
        for (String str2 : strArr) {
            StringBuilder sb7 = new StringBuilder();
            sb7.append(" <");
            sb7.append(str2);
            sb7.append(">");
            sb.append(bold(sb7.toString()));
        }
        System.out.println(sb);
        System.out.println(bold("Where:"));
        System.out.println(sb2);
    }

    public static String color(String str, ANSIColor aNSIColor, boolean z) {
        if (!isColorSupported) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\u001b[");
        sb.append((aNSIColor.ordinal() & 7) + 30);
        sb.append(";");
        sb.append(z ? 1 : 2);
        sb.append("m");
        sb.append(str);
        sb.append("\u001b[0m");
        return sb.toString();
    }

    public static String color(String str, ANSIColor aNSIColor, ANSIColor aNSIColor2) {
        if (!isColorSupported) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\u001b[");
        sb.append((aNSIColor.ordinal() & 7) + 30);
        sb.append(";");
        sb.append((aNSIColor2.ordinal() & 7) + 40);
        sb.append(";1m");
        sb.append(str);
        sb.append("\u001b[0m");
        return sb.toString();
    }

    public static String color(String str, ANSIColor aNSIColor, ANSIColor aNSIColor2, boolean z) {
        if (!isColorSupported) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\u001b[");
        sb.append((aNSIColor.ordinal() & 7) + 30);
        String str2 = ";";
        sb.append(str2);
        sb.append((aNSIColor2.ordinal() & 7) + 40);
        sb.append(str2);
        sb.append(z ? 1 : 2);
        sb.append("m");
        sb.append(str);
        sb.append("\u001b[0m");
        return sb.toString();
    }
}
