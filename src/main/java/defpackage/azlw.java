package defpackage;

/* renamed from: azlw */
public final class azlw extends anxl implements anzf {
    public static final azlw c;
    private static volatile anzq d;
    public int a;
    public anvu b = anvu.a;

    private azlw() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n\u0000", new Object[]{"a", "b"});
            case 3:
                return new azlw();
            case 4:
                return new azlv();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (azlw.class) {
                        obj3 = d;
                        if (obj3 == null) {
                            obj3 = new anxn(c);
                            d = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        azlw azlw = new azlw();
        c = azlw;
        anxl.registerDefaultInstance(azlw.class, azlw);
    }
}
