package defpackage;

/* renamed from: atmi */
public final class atmi extends anxl implements anzf {
    public static final atmi c;
    private static volatile anzq d;
    public int a;
    public avxw b;

    private atmi() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001㸠㸠\u0001\u0000\u0000\u0000㸠\t\u0000", new Object[]{"a", "b"});
            case 3:
                return new atmi();
            case 4:
                return new atmh();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (atmi.class) {
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
        atmi atmi = new atmi();
        c = atmi;
        anxl.registerDefaultInstance(atmi.class, atmi);
    }
}
