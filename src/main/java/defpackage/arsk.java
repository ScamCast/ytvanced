package defpackage;

/* renamed from: arsk */
public final class arsk extends anxl implements anzf {
    public static final arsk f;
    private static volatile anzq h;
    public int a;
    public arml b;
    public apxu c;
    public arml d;
    public arml e;
    private byte g = (byte) 2;

    private arsk() {
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.g = b;
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0003\u0007\u0004\u0000\u0000\u0004\u0003Љ\u0000\u0005Љ\u0002\u0006Љ\u0003\u0007Љ\u0004", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new arsk();
            case 4:
                return new arsn();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (arsk.class) {
                        obj3 = h;
                        if (obj3 == null) {
                            obj3 = new anxn(f);
                            h = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        arsk arsk = new arsk();
        f = arsk;
        anxl.registerDefaultInstance(arsk.class, arsk);
    }
}
