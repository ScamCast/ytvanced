package defpackage;

/* renamed from: aslu */
public final class aslu extends anxl implements anzf {
    public static final aslu d;
    private static volatile anzq f;
    public int a;
    public asic b;
    public anyd c = anxl.emptyProtobufList();
    private byte e = (byte) 2;

    private aslu() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.e = b;
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001Љ\u0000\u0002\u001b", new Object[]{"a", "b", "c", aslw.class});
            case 3:
                return new aslu();
            case 4:
                return new aslx();
            case 5:
                return d;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (aslu.class) {
                        obj3 = f;
                        if (obj3 == null) {
                            obj3 = new anxn(d);
                            f = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aslu aslu = new aslu();
        d = aslu;
        anxl.registerDefaultInstance(aslu.class, aslu);
    }
}
