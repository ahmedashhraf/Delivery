package org.jivesoftware.smack.util.dns;

public class SRVRecord extends HostAddress implements Comparable<SRVRecord> {
    private int priority;
    private int weight;

    public SRVRecord(String str, int i, int i2, int i3) {
        super(str, i);
        if (i3 < 0 || i3 > 65535) {
            StringBuilder sb = new StringBuilder();
            sb.append("DNS SRV records weight must be a 16-bit unsiged integer (i.e. between 0-65535. Weight was: ");
            sb.append(i3);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 < 0 || i2 > 65535) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("DNS SRV records priority must be a 16-bit unsiged integer (i.e. between 0-65535. Priority was: ");
            sb2.append(i2);
            throw new IllegalArgumentException(sb2.toString());
        } else {
            this.priority = i2;
            this.weight = i3;
        }
    }

    public int getPriority() {
        return this.priority;
    }

    public int getWeight() {
        return this.weight;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" prio:");
        sb.append(this.priority);
        sb.append(":w:");
        sb.append(this.weight);
        return sb.toString();
    }

    public int compareTo(SRVRecord sRVRecord) {
        int i = sRVRecord.priority - this.priority;
        return i == 0 ? this.weight - sRVRecord.weight : i;
    }
}
