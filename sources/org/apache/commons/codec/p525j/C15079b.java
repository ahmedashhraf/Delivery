package org.apache.commons.codec.p525j;

import org.apache.commons.codec.C15071f;
import org.apache.commons.codec.EncoderException;

/* renamed from: org.apache.commons.codec.j.b */
/* compiled from: Metaphone */
public class C15079b implements C15071f {

    /* renamed from: a */
    private String f43835a = "AEIOU";

    /* renamed from: b */
    private String f43836b = "EIY";

    /* renamed from: c */
    private String f43837c = "CSPTG";

    /* renamed from: d */
    private int f43838d = 4;

    /* renamed from: a */
    private boolean m66841a(int i, int i2) {
        return i2 + 1 == i;
    }

    /* renamed from: b */
    private boolean m66845b(StringBuffer stringBuffer, int i, char c) {
        if (i <= 0 || i >= stringBuffer.length() || stringBuffer.charAt(i - 1) != c) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public String mo46747a(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        if (str.length() == 1) {
            return str.toUpperCase();
        }
        char[] charArray = str.toUpperCase().toCharArray();
        StringBuffer stringBuffer = new StringBuffer(40);
        StringBuffer stringBuffer2 = new StringBuffer(10);
        int i = 0;
        char c = charArray[0];
        if (c != 'A') {
            if (c == 'G' || c == 'K' || c == 'P') {
                if (charArray[1] == 'N') {
                    stringBuffer.append(charArray, 1, charArray.length - 1);
                } else {
                    stringBuffer.append(charArray);
                }
            } else if (c != 'W') {
                if (c != 'X') {
                    stringBuffer.append(charArray);
                } else {
                    charArray[0] = 'S';
                    stringBuffer.append(charArray);
                }
            } else if (charArray[1] == 'R') {
                stringBuffer.append(charArray, 1, charArray.length - 1);
            } else if (charArray[1] == 'H') {
                stringBuffer.append(charArray, 1, charArray.length - 1);
                stringBuffer.setCharAt(0, 'W');
            } else {
                stringBuffer.append(charArray);
            }
        } else if (charArray[1] == 'E') {
            stringBuffer.append(charArray, 1, charArray.length - 1);
        } else {
            stringBuffer.append(charArray);
        }
        int length = stringBuffer.length();
        while (stringBuffer2.length() < mo46746a() && i < length) {
            char charAt = stringBuffer.charAt(i);
            if (charAt == 'C' || !m66845b(stringBuffer, i, charAt)) {
                switch (charAt) {
                    case 'A':
                    case 'E':
                    case 'I':
                    case 'O':
                    case 'U':
                        if (i == 0) {
                            stringBuffer2.append(charAt);
                            break;
                        }
                        break;
                    case 'B':
                        if (!m66845b(stringBuffer, i, 'M') || !m66841a(length, i)) {
                            stringBuffer2.append(charAt);
                            break;
                        }
                    case 'C':
                        if (!m66845b(stringBuffer, i, 'S') || m66841a(length, i) || this.f43836b.indexOf(stringBuffer.charAt(i + 1)) < 0) {
                            if (!m66844a(stringBuffer, i, "CIA")) {
                                if (m66841a(length, i) || this.f43836b.indexOf(stringBuffer.charAt(i + 1)) < 0) {
                                    if (!m66845b(stringBuffer, i, 'S') || !m66843a(stringBuffer, i, 'H')) {
                                        if (m66843a(stringBuffer, i, 'H')) {
                                            if (i == 0 && length >= 3 && m66842a(stringBuffer, 2)) {
                                                stringBuffer2.append('K');
                                                break;
                                            } else {
                                                stringBuffer2.append('X');
                                                break;
                                            }
                                        } else {
                                            stringBuffer2.append('K');
                                            break;
                                        }
                                    } else {
                                        stringBuffer2.append('K');
                                        break;
                                    }
                                } else {
                                    stringBuffer2.append('S');
                                    break;
                                }
                            } else {
                                stringBuffer2.append('X');
                                break;
                            }
                        }
                        break;
                    case 'D':
                        if (!m66841a(length, i + 1) && m66843a(stringBuffer, i, 'G')) {
                            int i2 = i + 2;
                            if (this.f43836b.indexOf(stringBuffer.charAt(i2)) >= 0) {
                                stringBuffer2.append('J');
                                i = i2;
                                break;
                            }
                        }
                        stringBuffer2.append('T');
                        break;
                    case 'F':
                    case 'J':
                    case 'L':
                    case 'M':
                    case 'N':
                    case 'R':
                        stringBuffer2.append(charAt);
                        break;
                    case 'G':
                        int i3 = i + 1;
                        if ((!m66841a(length, i3) || !m66843a(stringBuffer, i, 'H')) && ((m66841a(length, i3) || !m66843a(stringBuffer, i, 'H') || m66842a(stringBuffer, i + 2)) && (i <= 0 || (!m66844a(stringBuffer, i, "GN") && !m66844a(stringBuffer, i, "GNED"))))) {
                            boolean b = m66845b(stringBuffer, i, 'G');
                            if (!m66841a(length, i) && this.f43836b.indexOf(stringBuffer.charAt(i3)) >= 0 && !b) {
                                stringBuffer2.append('J');
                                break;
                            } else {
                                stringBuffer2.append('K');
                                break;
                            }
                        }
                        break;
                    case 'H':
                        if (!m66841a(length, i) && ((i <= 0 || this.f43837c.indexOf(stringBuffer.charAt(i - 1)) < 0) && m66842a(stringBuffer, i + 1))) {
                            stringBuffer2.append('H');
                            break;
                        }
                    case 'K':
                        if (i > 0) {
                            if (!m66845b(stringBuffer, i, 'C')) {
                                stringBuffer2.append(charAt);
                                break;
                            }
                        } else {
                            stringBuffer2.append(charAt);
                            break;
                        }
                        break;
                    case 'P':
                        if (!m66843a(stringBuffer, i, 'H')) {
                            stringBuffer2.append(charAt);
                            break;
                        } else {
                            stringBuffer2.append('F');
                            break;
                        }
                    case 'Q':
                        stringBuffer2.append('K');
                        break;
                    case 'S':
                        if (!m66844a(stringBuffer, i, "SH") && !m66844a(stringBuffer, i, "SIO") && !m66844a(stringBuffer, i, "SIA")) {
                            stringBuffer2.append('S');
                            break;
                        } else {
                            stringBuffer2.append('X');
                            break;
                        }
                    case 'T':
                        if (!m66844a(stringBuffer, i, "TIA") && !m66844a(stringBuffer, i, "TIO")) {
                            if (!m66844a(stringBuffer, i, "TCH")) {
                                if (!m66844a(stringBuffer, i, "TH")) {
                                    stringBuffer2.append('T');
                                    break;
                                } else {
                                    stringBuffer2.append('0');
                                    break;
                                }
                            }
                        } else {
                            stringBuffer2.append('X');
                            break;
                        }
                        break;
                    case 'V':
                        stringBuffer2.append('F');
                        break;
                    case 'W':
                    case 'Y':
                        if (!m66841a(length, i) && m66842a(stringBuffer, i + 1)) {
                            stringBuffer2.append(charAt);
                            break;
                        }
                    case 'X':
                        stringBuffer2.append('K');
                        stringBuffer2.append('S');
                        break;
                    case 'Z':
                        stringBuffer2.append('S');
                        break;
                }
                i++;
            } else {
                i++;
            }
            if (stringBuffer2.length() > mo46746a()) {
                stringBuffer2.setLength(mo46746a());
            }
        }
        return stringBuffer2.toString();
    }

    public String encode(String str) {
        return mo46747a(str);
    }

    /* renamed from: a */
    private boolean m66842a(StringBuffer stringBuffer, int i) {
        return this.f43835a.indexOf(stringBuffer.charAt(i)) >= 0;
    }

    /* renamed from: a */
    private boolean m66843a(StringBuffer stringBuffer, int i, char c) {
        if (i < 0 || i >= stringBuffer.length() - 1 || stringBuffer.charAt(i + 1) != c) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private boolean m66844a(StringBuffer stringBuffer, int i, String str) {
        if (i < 0 || (str.length() + i) - 1 >= stringBuffer.length()) {
            return false;
        }
        return stringBuffer.substring(i, str.length() + i).equals(str);
    }

    /* renamed from: a */
    public Object mo46723a(Object obj) throws EncoderException {
        if (obj instanceof String) {
            return mo46747a((String) obj);
        }
        throw new EncoderException("Parameter supplied to Metaphone encode is not of type java.lang.String");
    }

    /* renamed from: a */
    public boolean mo46749a(String str, String str2) {
        return mo46747a(str).equals(mo46747a(str2));
    }

    /* renamed from: a */
    public int mo46746a() {
        return this.f43838d;
    }

    /* renamed from: a */
    public void mo46748a(int i) {
        this.f43838d = i;
    }
}
