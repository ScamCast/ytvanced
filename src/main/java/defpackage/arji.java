package defpackage;

/* renamed from: arji */
public final class arji extends anxl implements anzf {
    public static final arji f;
    private static volatile anzq h;
    public int a;
    public arml b;
    public arml c;
    public apxu d;
    public apxu e;
    private byte g = (byte) 2;

    private arji() {
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
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\b\u0004\u0000\u0000\u0004\u0001Љ\u0000\u0003Љ\u0005\u0006Љ\u0001\bЉ\u0004", new Object[]{"a", "b", "e", "c", "d"});
            case 3:
                return new arji();
            case 4:
                return new arjl();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (arji.class) {
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
        arji arji = new arji();
        f = arji;
        anxl.registerDefaultInstance(arji.class, arji);
    }
}
