package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: ccx */
final class ccx implements bsn {
    private final ByteBuffer a = ByteBuffer.allocate(4);

    ccx() {
    }

    public final /* synthetic */ void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        Integer num = (Integer) obj;
        if (num != null) {
            messageDigest.update(bArr);
            synchronized (this.a) {
                this.a.position(0);
                messageDigest.update(this.a.putInt(num.intValue()).array());
            }
        }
    }
}
