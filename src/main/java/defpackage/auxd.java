package defpackage;

/* renamed from: auxd */
public final class auxd extends anxl implements anzf {
    public static final auxd c;
    private static volatile anzq e;
    public int a;
    public arml b;
    private byte d = (byte) 2;

    private auxd() {
        anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.d);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.d = b;
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001Љ\u0000", new Object[]{"a", "b"});
            case 3:
                return new auxd();
            case 4:
                return new auxg();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (auxd.class) {
                        obj3 = e;
                        if (obj3 == null) {
                            obj3 = new anxn(c);
                            e = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        auxd auxd = new auxd();
        c = auxd;
        anxl.registerDefaultInstance(auxd.class, auxd);
    }
}
