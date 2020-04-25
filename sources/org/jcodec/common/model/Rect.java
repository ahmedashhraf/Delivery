package org.jcodec.common.model;

public class Rect {
    private int height;
    private int width;

    /* renamed from: x */
    private int f44829x;

    /* renamed from: y */
    private int f44830y;

    public Rect(int i, int i2, int i3, int i4) {
        this.f44829x = i;
        this.f44830y = i2;
        this.width = i3;
        this.height = i4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Rect.class != obj.getClass()) {
            return false;
        }
        Rect rect = (Rect) obj;
        return this.height == rect.height && this.width == rect.width && this.f44829x == rect.f44829x && this.f44830y == rect.f44830y;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public int getX() {
        return this.f44829x;
    }

    public int getY() {
        return this.f44830y;
    }

    public int hashCode() {
        return ((((((this.height + 31) * 31) + this.width) * 31) + this.f44829x) * 31) + this.f44830y;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rect [x=");
        sb.append(this.f44829x);
        sb.append(", y=");
        sb.append(this.f44830y);
        sb.append(", width=");
        sb.append(this.width);
        sb.append(", height=");
        sb.append(this.height);
        sb.append("]");
        return sb.toString();
    }
}
