package defpackage;

/* renamed from: asce */
public final class asce extends anxl implements anzf {
    public static final asce d;
    private static volatile anzq f;
    public int a;
    public ashy b;
    public String c = "";
    private byte e = (byte) 2;

    private asce() {
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
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001Љ\u0000\u0002\b\u0001", new Object[]{"a", "b", "c"});
            case 3:
                return new asce();
            case 4:
                return new asch();
            case 5:
                return d;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (asce.class) {
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
        asce asce = new asce();
        d = asce;
        anxl.registerDefaultInstance(asce.class, asce);
    }
}
