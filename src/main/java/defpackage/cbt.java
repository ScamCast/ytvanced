package defpackage;

import java.io.InputStream;

/* renamed from: cbt */
final class cbt implements cbu {
    public final InputStream a;

    cbt(InputStream inputStream) {
        this.a = inputStream;
    }

    public final int a() {
        return ((this.a.read() << 8) & 65280) | (this.a.read() & 255);
    }

    public final short b() {
        return (short) (this.a.read() & 255);
    }

    public final long a(long j) {
        if (j < 0) {
            return 0;
        }
        long j2 = j;
        while (j2 > 0) {
            long skip = this.a.skip(j2);
            if (skip <= 0) {
                if (this.a.read() == -1) {
                    break;
                }
                j2--;
            } else {
                j2 -= skip;
            }
        }
        return j - j2;
    }

    public final int c() {
        return this.a.read();
    }
}
