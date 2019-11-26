package defpackage;

import java.nio.ByteBuffer;

/* renamed from: rie */
abstract class rie {
    rie() {
    }

    public abstract int a(CharSequence charSequence, byte[] bArr, int i, int i2);

    public abstract int a(byte[] bArr, int i, int i2);

    public abstract void a(CharSequence charSequence, ByteBuffer byteBuffer);

    /* Access modifiers changed, original: final */
    public final boolean b(byte[] bArr, int i, int i2) {
        return a(bArr, i, i2) == 0;
    }

    static void b(CharSequence charSequence, ByteBuffer byteBuffer) {
        char charAt;
        int max;
        char charAt2;
        StringBuilder stringBuilder;
        int length = charSequence.length();
        int position = byteBuffer.position();
        int i = 0;
        while (i < length) {
            try {
                charAt = charSequence.charAt(i);
                if (charAt >= 128) {
                    break;
                }
                byteBuffer.put(position + i, (byte) charAt);
                i++;
            } catch (IndexOutOfBoundsException unused) {
                length = byteBuffer.position();
                max = Math.max(i, (position - byteBuffer.position()) + 1);
                charAt2 = charSequence.charAt(i);
                stringBuilder = new StringBuilder(37);
                stringBuilder.append("Failed writing ");
                stringBuilder.append(charAt2);
                stringBuilder.append(" at index ");
                stringBuilder.append(length + max);
                throw new ArrayIndexOutOfBoundsException(stringBuilder.toString());
            }
        }
        if (i != length) {
            position += i;
            while (i < length) {
                charAt = charSequence.charAt(i);
                int i2;
                if (charAt < 128) {
                    byteBuffer.put(position, (byte) charAt);
                } else if (charAt < 2048) {
                    i2 = position + 1;
                    try {
                        byteBuffer.put(position, (byte) ((charAt >>> 6) | 192));
                        byteBuffer.put(i2, (byte) ((charAt & 63) | 128));
                        position = i2;
                    } catch (IndexOutOfBoundsException unused2) {
                        position = i2;
                        length = byteBuffer.position();
                        max = Math.max(i, (position - byteBuffer.position()) + 1);
                        charAt2 = charSequence.charAt(i);
                        stringBuilder = new StringBuilder(37);
                        stringBuilder.append("Failed writing ");
                        stringBuilder.append(charAt2);
                        stringBuilder.append(" at index ");
                        stringBuilder.append(length + max);
                        throw new ArrayIndexOutOfBoundsException(stringBuilder.toString());
                    }
                } else if (charAt >= 55296 && charAt <= 57343) {
                    i2 = i + 1;
                    if (i2 != length) {
                        try {
                            char charAt3 = charSequence.charAt(i2);
                            if (Character.isSurrogatePair(charAt, charAt3)) {
                                i = Character.toCodePoint(charAt, charAt3);
                                int i3 = position + 1;
                                try {
                                    byteBuffer.put(position, (byte) ((i >>> 18) | 240));
                                    position = i3 + 1;
                                    byteBuffer.put(i3, (byte) (((i >>> 12) & 63) | 128));
                                    i3 = position + 1;
                                    byteBuffer.put(position, (byte) (((i >>> 6) & 63) | 128));
                                    byteBuffer.put(i3, (byte) ((i & 63) | 128));
                                    position = i3;
                                    i = i2;
                                } catch (IndexOutOfBoundsException unused3) {
                                    position = i3;
                                    i = i2;
                                    length = byteBuffer.position();
                                    max = Math.max(i, (position - byteBuffer.position()) + 1);
                                    charAt2 = charSequence.charAt(i);
                                    stringBuilder = new StringBuilder(37);
                                    stringBuilder.append("Failed writing ");
                                    stringBuilder.append(charAt2);
                                    stringBuilder.append(" at index ");
                                    stringBuilder.append(length + max);
                                    throw new ArrayIndexOutOfBoundsException(stringBuilder.toString());
                                }
                            }
                            i = i2;
                        } catch (IndexOutOfBoundsException unused4) {
                            i = i2;
                            length = byteBuffer.position();
                            max = Math.max(i, (position - byteBuffer.position()) + 1);
                            charAt2 = charSequence.charAt(i);
                            stringBuilder = new StringBuilder(37);
                            stringBuilder.append("Failed writing ");
                            stringBuilder.append(charAt2);
                            stringBuilder.append(" at index ");
                            stringBuilder.append(length + max);
                            throw new ArrayIndexOutOfBoundsException(stringBuilder.toString());
                        }
                    }
                    throw new rig(i, length);
                } else {
                    i2 = position + 1;
                    byteBuffer.put(position, (byte) ((charAt >>> 12) | 224));
                    position = i2 + 1;
                    byteBuffer.put(i2, (byte) (((charAt >>> 6) & 63) | 128));
                    byteBuffer.put(position, (byte) ((charAt & 63) | 128));
                }
                i++;
                position++;
            }
            byteBuffer.position(position);
            return;
        }
        byteBuffer.position(position + i);
    }
}
