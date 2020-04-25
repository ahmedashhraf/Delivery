package org.jcodec.codecs.h264.decode.aso;

public class FlatMBlockMapper implements Mapper {
    private int firstMBAddr;
    private int frameWidthInMbs;

    public FlatMBlockMapper(int i, int i2) {
        this.frameWidthInMbs = i;
        this.firstMBAddr = i2;
    }

    public int getAddress(int i) {
        return this.firstMBAddr + i;
    }

    public int getMbX(int i) {
        return getAddress(i) % this.frameWidthInMbs;
    }

    public int getMbY(int i) {
        return getAddress(i) / this.frameWidthInMbs;
    }

    public boolean leftAvailable(int i) {
        int i2 = i + this.firstMBAddr;
        if ((i2 % this.frameWidthInMbs == 0) || i2 <= this.firstMBAddr) {
            return false;
        }
        return true;
    }

    public boolean topAvailable(int i) {
        int i2 = this.firstMBAddr;
        return (i + i2) - this.frameWidthInMbs >= i2;
    }

    public boolean topLeftAvailable(int i) {
        int i2 = i + this.firstMBAddr;
        if ((i2 % this.frameWidthInMbs == 0) || (i2 - this.frameWidthInMbs) - 1 < this.firstMBAddr) {
            return false;
        }
        return true;
    }

    public boolean topRightAvailable(int i) {
        int i2 = i + this.firstMBAddr;
        if (((i2 + 1) % this.frameWidthInMbs == 0) || (i2 - this.frameWidthInMbs) + 1 < this.firstMBAddr) {
            return false;
        }
        return true;
    }
}
