package org.jcodec.common;

public class AudioFormat {
    public static AudioFormat MONO_44K_S16_BE;
    public static AudioFormat MONO_44K_S16_LE;
    public static AudioFormat MONO_44K_S24_BE;
    public static AudioFormat MONO_44K_S24_LE;
    public static AudioFormat MONO_48K_S16_BE;
    public static AudioFormat MONO_48K_S16_LE;
    public static AudioFormat MONO_48K_S24_BE;
    public static AudioFormat MONO_48K_S24_LE;
    public static AudioFormat STEREO_44K_S16_BE;
    public static AudioFormat STEREO_44K_S16_LE;
    public static AudioFormat STEREO_44K_S24_BE;
    public static AudioFormat STEREO_44K_S24_LE;
    public static AudioFormat STEREO_48K_S16_BE;
    public static AudioFormat STEREO_48K_S16_LE;
    public static AudioFormat STEREO_48K_S24_BE;
    public static AudioFormat STEREO_48K_S24_LE;
    private boolean bigEndian;
    private int channelCount;
    private int sampleRate;
    private int sampleSizeInBits;
    private boolean signed;

    static {
        AudioFormat audioFormat = new AudioFormat(48000, 16, 2, true, true);
        STEREO_48K_S16_BE = audioFormat;
        AudioFormat audioFormat2 = new AudioFormat(48000, 16, 2, true, false);
        STEREO_48K_S16_LE = audioFormat2;
        AudioFormat audioFormat3 = new AudioFormat(48000, 24, 2, true, true);
        STEREO_48K_S24_BE = audioFormat3;
        AudioFormat audioFormat4 = new AudioFormat(48000, 24, 2, true, false);
        STEREO_48K_S24_LE = audioFormat4;
        AudioFormat audioFormat5 = new AudioFormat(48000, 16, 1, true, true);
        MONO_48K_S16_BE = audioFormat5;
        AudioFormat audioFormat6 = new AudioFormat(48000, 16, 1, true, false);
        MONO_48K_S16_LE = audioFormat6;
        AudioFormat audioFormat7 = new AudioFormat(48000, 24, 1, true, true);
        MONO_48K_S24_BE = audioFormat7;
        AudioFormat audioFormat8 = new AudioFormat(48000, 24, 1, true, false);
        MONO_48K_S24_LE = audioFormat8;
        AudioFormat audioFormat9 = new AudioFormat(44100, 16, 2, true, true);
        STEREO_44K_S16_BE = audioFormat9;
        AudioFormat audioFormat10 = new AudioFormat(44100, 16, 2, true, false);
        STEREO_44K_S16_LE = audioFormat10;
        AudioFormat audioFormat11 = new AudioFormat(44100, 24, 2, true, true);
        STEREO_44K_S24_BE = audioFormat11;
        AudioFormat audioFormat12 = new AudioFormat(44100, 24, 2, true, false);
        STEREO_44K_S24_LE = audioFormat12;
        AudioFormat audioFormat13 = new AudioFormat(44100, 16, 1, true, true);
        MONO_44K_S16_BE = audioFormat13;
        AudioFormat audioFormat14 = new AudioFormat(44100, 16, 1, true, false);
        MONO_44K_S16_LE = audioFormat14;
        AudioFormat audioFormat15 = new AudioFormat(44100, 24, 1, true, true);
        MONO_44K_S24_BE = audioFormat15;
        AudioFormat audioFormat16 = new AudioFormat(44100, 24, 1, true, false);
        MONO_44K_S24_LE = audioFormat16;
    }

    public AudioFormat(int i, int i2, int i3, boolean z, boolean z2) {
        this.sampleRate = i;
        this.sampleSizeInBits = i2;
        this.channelCount = i3;
        this.signed = z;
        this.bigEndian = z2;
    }

    public static AudioFormat MONO_S16_BE(int i) {
        AudioFormat audioFormat = new AudioFormat(i, 16, 1, true, true);
        return audioFormat;
    }

    public static AudioFormat MONO_S16_LE(int i) {
        AudioFormat audioFormat = new AudioFormat(i, 16, 1, true, false);
        return audioFormat;
    }

    public static AudioFormat MONO_S24_BE(int i) {
        AudioFormat audioFormat = new AudioFormat(i, 24, 1, true, true);
        return audioFormat;
    }

    public static AudioFormat MONO_S24_LE(int i) {
        AudioFormat audioFormat = new AudioFormat(i, 24, 1, true, false);
        return audioFormat;
    }

    public static AudioFormat NCH_44K_S16_BE(int i) {
        AudioFormat audioFormat = new AudioFormat(44100, 16, i, true, true);
        return audioFormat;
    }

    public static AudioFormat NCH_44K_S16_LE(int i) {
        AudioFormat audioFormat = new AudioFormat(44100, 16, i, true, false);
        return audioFormat;
    }

    public static AudioFormat NCH_44K_S24_BE(int i) {
        AudioFormat audioFormat = new AudioFormat(44100, 24, i, true, true);
        return audioFormat;
    }

    public static AudioFormat NCH_44K_S24_LE(int i) {
        AudioFormat audioFormat = new AudioFormat(44100, 24, i, true, false);
        return audioFormat;
    }

    public static AudioFormat NCH_48K_S16_BE(int i) {
        AudioFormat audioFormat = new AudioFormat(48000, 16, i, true, true);
        return audioFormat;
    }

    public static AudioFormat NCH_48K_S16_LE(int i) {
        AudioFormat audioFormat = new AudioFormat(48000, 16, i, true, false);
        return audioFormat;
    }

    public static AudioFormat NCH_48K_S24_BE(int i) {
        AudioFormat audioFormat = new AudioFormat(48000, 24, i, true, true);
        return audioFormat;
    }

    public static AudioFormat NCH_48K_S24_LE(int i) {
        AudioFormat audioFormat = new AudioFormat(48000, 24, i, true, false);
        return audioFormat;
    }

    public static AudioFormat STEREO_S16_BE(int i) {
        AudioFormat audioFormat = new AudioFormat(i, 16, 2, true, true);
        return audioFormat;
    }

    public static AudioFormat STEREO_S16_LE(int i) {
        AudioFormat audioFormat = new AudioFormat(i, 16, 2, true, false);
        return audioFormat;
    }

    public static AudioFormat STEREO_S24_BE(int i) {
        AudioFormat audioFormat = new AudioFormat(i, 24, 2, true, true);
        return audioFormat;
    }

    public static AudioFormat STEREO_S24_LE(int i) {
        AudioFormat audioFormat = new AudioFormat(i, 24, 2, true, false);
        return audioFormat;
    }

    public int bytesToFrames(int i) {
        return i / ((this.channelCount * this.sampleSizeInBits) >> 3);
    }

    public int bytesToSamples(int i) {
        return i / (this.sampleSizeInBits >> 3);
    }

    public int framesToBytes(int i) {
        return i * ((this.channelCount * this.sampleSizeInBits) >> 3);
    }

    public int getChannels() {
        return this.channelCount;
    }

    public int getFrameRate() {
        return this.sampleRate;
    }

    public short getFrameSize() {
        return (short) ((this.sampleSizeInBits >> 3) * this.channelCount);
    }

    public int getSampleRate() {
        return this.sampleRate;
    }

    public int getSampleSizeInBits() {
        return this.sampleSizeInBits;
    }

    public boolean isBigEndian() {
        return this.bigEndian;
    }

    public boolean isSigned() {
        return this.signed;
    }

    public int samplesToBytes(int i) {
        return i * (this.sampleSizeInBits >> 3);
    }

    public AudioFormat(AudioFormat audioFormat, int i) {
        this(audioFormat);
        this.sampleRate = i;
    }

    public AudioFormat(AudioFormat audioFormat) {
        this(audioFormat.sampleRate, audioFormat.sampleSizeInBits, audioFormat.channelCount, audioFormat.signed, audioFormat.bigEndian);
    }
}
