package defpackage;

import java.util.Arrays;

/* renamed from: nwo */
public final class nwo {
    public int a;
    private long[] b = new long[32];

    public final void a(long j) {
        int i = this.a;
        long[] jArr = this.b;
        if (i == jArr.length) {
            this.b = Arrays.copyOf(jArr, i + i);
        }
        long[] jArr2 = this.b;
        int i2 = this.a;
        this.a = i2 + 1;
        jArr2[i2] = j;
    }

    public final long a(int i) {
        if (i >= 0 && i < this.a) {
            return this.b[i];
        }
        int i2 = this.a;
        StringBuilder stringBuilder = new StringBuilder(45);
        stringBuilder.append("Invalid size ");
        stringBuilder.append(i);
        stringBuilder.append(", size is ");
        stringBuilder.append(i2);
        throw new IndexOutOfBoundsException(stringBuilder.toString());
    }
}
