package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: ram */
final class ram extends rbl {
    ram(byte[] bArr, int i) {
        super(bArr, i);
    }

    /* Access modifiers changed, original: final */
    public final int a() {
        return 12;
    }

    /* Access modifiers changed, original: final */
    public final ByteBuffer a(byte[] bArr, int i) {
        int[] iArr = new int[16];
        System.arraycopy(rbl.a, 0, iArr, 0, a.length);
        int[] a = rbl.a(ByteBuffer.wrap(this.b.a()));
        int i2 = 4;
        System.arraycopy(a, 0, iArr, 4, a.length);
        iArr[12] = i;
        System.arraycopy(rbl.a(ByteBuffer.wrap(bArr)), 0, iArr, 13, 3);
        int[] iArr2 = (int[]) iArr.clone();
        int i3 = 0;
        while (i3 < 10) {
            ram.a(iArr2, 0, i2, 8, 12);
            ram.a(iArr2, 1, 5, 9, 13);
            ram.a(iArr2, 2, 6, 10, 14);
            ram.a(iArr2, 3, 7, 11, 15);
            ram.a(iArr2, 0, 5, 10, 15);
            ram.a(iArr2, 1, 6, 11, 12);
            ram.a(iArr2, 2, 7, 8, 13);
            ram.a(iArr2, 3, 4, 9, 14);
            i3++;
            i2 = 4;
        }
        for (int i4 = 0; i4 < 16; i4++) {
            iArr[i4] = iArr[i4] + iArr2[i4];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(iArr, 0, 16);
        return order;
    }

    private static void a(int[] iArr, int i, int i2, int i3, int i4) {
        int i5 = iArr[i] + iArr[i2];
        iArr[i] = i5;
        i5 = rbl.a(i5 ^ iArr[i4], 16);
        iArr[i4] = i5;
        int i6 = iArr[i3] + i5;
        iArr[i3] = i6;
        i5 = rbl.a(iArr[i2] ^ i6, 12);
        iArr[i2] = i5;
        i6 = iArr[i] + i5;
        iArr[i] = i6;
        i = rbl.a(iArr[i4] ^ i6, 8);
        iArr[i4] = i;
        i4 = iArr[i3] + i;
        iArr[i3] = i4;
        iArr[i2] = rbl.a(iArr[i2] ^ i4, 7);
    }
}
