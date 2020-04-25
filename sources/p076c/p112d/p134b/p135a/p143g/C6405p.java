package p076c.p112d.p134b.p135a.p143g;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: c.d.b.a.g.p */
/* compiled from: DateTime */
public final class C6405p implements Serializable {

    /* renamed from: O */
    private static final TimeZone f17842O = TimeZone.getTimeZone("GMT");

    /* renamed from: P */
    private static final Pattern f17843P = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})([Tt](\\d{2}):(\\d{2}):(\\d{2})(\\.\\d+)?)?([Zz]|([+-])(\\d{2}):(\\d{2}))?");
    private static final long serialVersionUID = 1;

    /* renamed from: N */
    private final int f17844N;

    /* renamed from: a */
    private final long f17845a;

    /* renamed from: b */
    private final boolean f17846b;

    public C6405p(Date date, TimeZone timeZone) {
        this(false, date.getTime(), timeZone == null ? null : Integer.valueOf(timeZone.getOffset(date.getTime()) / 60000));
    }

    /* renamed from: b */
    public static C6405p m29731b(String str) throws NumberFormatException {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        Matcher matcher = f17843P.matcher(str);
        if (!matcher.matches()) {
            String str2 = "Invalid date/time format: ";
            String valueOf = String.valueOf(str);
            throw new NumberFormatException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }
        int parseInt = Integer.parseInt(matcher.group(1));
        int parseInt2 = Integer.parseInt(matcher.group(2)) - 1;
        int parseInt3 = Integer.parseInt(matcher.group(3));
        boolean z2 = matcher.group(4) != null;
        String group = matcher.group(9);
        boolean z3 = group != null;
        Integer num = null;
        if (!z3 || z2) {
            if (z2) {
                int parseInt4 = Integer.parseInt(matcher.group(5));
                int parseInt5 = Integer.parseInt(matcher.group(6));
                int parseInt6 = Integer.parseInt(matcher.group(7));
                if (matcher.group(8) != null) {
                    double parseInt7 = (double) ((float) Integer.parseInt(matcher.group(8).substring(1)));
                    z = z2;
                    double pow = Math.pow(10.0d, (double) (matcher.group(8).substring(1).length() - 3));
                    Double.isNaN(parseInt7);
                    i = (int) (parseInt7 / pow);
                    i3 = parseInt5;
                    i2 = parseInt6;
                } else {
                    z = z2;
                    i3 = parseInt5;
                    i2 = parseInt6;
                    i = 0;
                }
                i4 = parseInt4;
            } else {
                z = z2;
                i4 = 0;
                i3 = 0;
                i2 = 0;
                i = 0;
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(f17842O);
            gregorianCalendar.set(parseInt, parseInt2, parseInt3, i4, i3, i2);
            gregorianCalendar.set(14, i);
            long timeInMillis = gregorianCalendar.getTimeInMillis();
            if (z && z3) {
                if (Character.toUpperCase(group.charAt(0)) == 'Z') {
                    i5 = 0;
                } else {
                    int parseInt8 = (Integer.parseInt(matcher.group(11)) * 60) + Integer.parseInt(matcher.group(12));
                    int i6 = matcher.group(10).charAt(0) == '-' ? -parseInt8 : parseInt8;
                    timeInMillis -= ((long) i6) * 60000;
                    i5 = i6;
                }
                num = Integer.valueOf(i5);
            }
            return new C6405p(!z, timeInMillis, num);
        }
        String str3 = "Invalid date/time format, cannot specify time zone shift without specifying time: ";
        String valueOf2 = String.valueOf(str);
        throw new NumberFormatException(valueOf2.length() != 0 ? str3.concat(valueOf2) : new String(str3));
    }

    /* renamed from: a */
    public int mo25797a() {
        return this.f17844N;
    }

    /* renamed from: d */
    public long mo25798d() {
        return this.f17845a;
    }

    /* renamed from: e */
    public boolean mo25799e() {
        return this.f17846b;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6405p)) {
            return false;
        }
        C6405p pVar = (C6405p) obj;
        if (!(this.f17846b == pVar.f17846b && this.f17845a == pVar.f17845a && this.f17844N == pVar.f17844N)) {
            z = false;
        }
        return z;
    }

    /* renamed from: f */
    public String mo25801f() {
        StringBuilder sb = new StringBuilder();
        GregorianCalendar gregorianCalendar = new GregorianCalendar(f17842O);
        gregorianCalendar.setTimeInMillis(this.f17845a + (((long) this.f17844N) * 60000));
        m29730a(sb, gregorianCalendar.get(1), 4);
        sb.append('-');
        m29730a(sb, gregorianCalendar.get(2) + 1, 2);
        sb.append('-');
        m29730a(sb, gregorianCalendar.get(5), 2);
        if (!this.f17846b) {
            sb.append('T');
            m29730a(sb, gregorianCalendar.get(11), 2);
            sb.append(':');
            m29730a(sb, gregorianCalendar.get(12), 2);
            sb.append(':');
            m29730a(sb, gregorianCalendar.get(13), 2);
            if (gregorianCalendar.isSet(14)) {
                sb.append('.');
                m29730a(sb, gregorianCalendar.get(14), 3);
            }
            int i = this.f17844N;
            if (i == 0) {
                sb.append('Z');
            } else {
                if (i > 0) {
                    sb.append('+');
                } else {
                    sb.append('-');
                    i = -i;
                }
                int i2 = i / 60;
                int i3 = i % 60;
                m29730a(sb, i2, 2);
                sb.append(':');
                m29730a(sb, i3, 2);
            }
        }
        return sb.toString();
    }

    public int hashCode() {
        long[] jArr = new long[3];
        jArr[0] = this.f17845a;
        jArr[1] = this.f17846b ? 1 : 0;
        jArr[2] = (long) this.f17844N;
        return Arrays.hashCode(jArr);
    }

    public String toString() {
        return mo25801f();
    }

    public C6405p(long j) {
        this(false, j, null);
    }

    /* renamed from: a */
    private static void m29730a(StringBuilder sb, int i, int i2) {
        if (i < 0) {
            sb.append('-');
            i = -i;
        }
        int i3 = i2;
        int i4 = i;
        while (i4 > 0) {
            i4 /= 10;
            i3--;
        }
        for (int i5 = 0; i5 < i3; i5++) {
            sb.append('0');
        }
        if (i != 0) {
            sb.append(i);
        }
    }

    public C6405p(Date date) {
        this(date.getTime());
    }

    public C6405p(long j, int i) {
        this(false, j, Integer.valueOf(i));
    }

    public C6405p(boolean z, long j, Integer num) {
        this.f17846b = z;
        this.f17845a = j;
        int i = z ? 0 : num == null ? TimeZone.getDefault().getOffset(j) / 60000 : num.intValue();
        this.f17844N = i;
    }

    public C6405p(String str) {
        C6405p b = m29731b(str);
        this.f17846b = b.f17846b;
        this.f17845a = b.f17845a;
        this.f17844N = b.f17844N;
    }
}
