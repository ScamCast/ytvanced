package defpackage;

/* renamed from: aymi */
public final class aymi extends anxl implements anzf {
    public static final aymi b;
    private static volatile anzq d;
    public anyd a = anxl.emptyProtobufList();
    private byte c = (byte) 2;

    private aymi() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.c);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.c = b;
                return null;
            case 2:
                return anxl.newMessageInfo(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", axak.class});
            case 3:
                return new aymi();
            case 4:
                return new ayml();
            case 5:
                return b;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (aymi.class) {
                        obj3 = d;
                        if (obj3 == null) {
                            obj3 = new anxn(b);
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
        aymi aymi = new aymi();
        b = aymi;
        anxl.registerDefaultInstance(aymi.class, aymi);
    }
}
