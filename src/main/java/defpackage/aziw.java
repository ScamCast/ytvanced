package defpackage;

/* renamed from: aziw */
public final class aziw extends anxl implements anzf {
    public static final aziw f;
    private static volatile anzq h;
    public int a;
    public arml b;
    public anyd c = anxl.emptyProtobufList();
    public apxu d;
    public arml e;
    private byte g = (byte) 2;

    private aziw() {
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
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0001\u0004\u0001Љ\u0000\u0002Л\u0003Љ\u0001\u0006Љ\u0002", new Object[]{"a", "b", "c", aziu.class, "d", "e"});
            case 3:
                return new aziw();
            case 4:
                return new aziz();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (aziw.class) {
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
        aziw aziw = new aziw();
        f = aziw;
        anxl.registerDefaultInstance(aziw.class, aziw);
    }
}
