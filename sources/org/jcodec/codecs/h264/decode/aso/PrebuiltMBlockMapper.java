package org.jcodec.codecs.h264.decode.aso;

public class PrebuiltMBlockMapper implements Mapper {
    private int firstMBInSlice;
    private int groupId;
    private int indexOfFirstMb;
    private MBToSliceGroupMap map;
    private int picWidthInMbs;

    public PrebuiltMBlockMapper(MBToSliceGroupMap mBToSliceGroupMap, int i, int i2) {
        this.map = mBToSliceGroupMap;
        this.firstMBInSlice = i;
        this.groupId = mBToSliceGroupMap.getGroups()[i];
        this.picWidthInMbs = i2;
        this.indexOfFirstMb = mBToSliceGroupMap.getIndices()[i];
    }

    public int getAddress(int i) {
        return this.map.getInverse()[this.groupId][i + this.indexOfFirstMb];
    }

    public int getMbX(int i) {
        return getAddress(i) % this.picWidthInMbs;
    }

    public int getMbY(int i) {
        return getAddress(i) / this.picWidthInMbs;
    }

    public boolean leftAvailable(int i) {
        int i2 = this.map.getInverse()[this.groupId][i + this.indexOfFirstMb];
        int i3 = i2 - 1;
        return i3 >= this.firstMBInSlice && i2 % this.picWidthInMbs != 0 && this.map.getGroups()[i3] == this.groupId;
    }

    public boolean topAvailable(int i) {
        int i2 = this.map.getInverse()[this.groupId][i + this.indexOfFirstMb] - this.picWidthInMbs;
        return i2 >= this.firstMBInSlice && this.map.getGroups()[i2] == this.groupId;
    }

    public boolean topLeftAvailable(int i) {
        int i2 = this.map.getInverse()[this.groupId][i + this.indexOfFirstMb];
        int i3 = this.picWidthInMbs;
        int i4 = (i2 - i3) - 1;
        if (i4 < this.firstMBInSlice || i2 % i3 == 0 || this.map.getGroups()[i4] != this.groupId) {
            return false;
        }
        return true;
    }

    public boolean topRightAvailable(int i) {
        int i2 = this.map.getInverse()[this.groupId][i + this.indexOfFirstMb];
        int i3 = this.picWidthInMbs;
        int i4 = (i2 - i3) + 1;
        if (i4 < this.firstMBInSlice || (i2 + 1) % i3 == 0 || this.map.getGroups()[i4] != this.groupId) {
            return false;
        }
        return true;
    }
}
