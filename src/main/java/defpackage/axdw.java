package defpackage;

/* renamed from: axdw */
public final class axdw extends anxl implements anzf {
    public static final axdw g;
    private static volatile anzq i;
    public int a;
    public arml b;
    public axak c;
    public arml d;
    public apxu e;
    public arml f;
    private byte h = (byte) 2;

    private axdw() {
        anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.h = b;
                return null;
            case 2:
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\t\u0005\u0000\u0000\u0005\u0001Љ\u0000\u0003Љ\u0002\u0004Љ\u0003\u0007Љ\u0004\tЉ\u0001", new Object[]{"a", "b", "d", "e", "f", "c"});
            case 3:
                return new axdw();
            case 4:
                return new axdz();
            case 5:
                return g;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (axdw.class) {
                        obj3 = i;
                        if (obj3 == null) {
                            obj3 = new anxn(g);
                            i = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        axdw axdw = new axdw();
        g = axdw;
        anxl.registerDefaultInstance(axdw.class, axdw);
    }
}
