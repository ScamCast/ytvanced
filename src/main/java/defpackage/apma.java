package defpackage;

/* renamed from: apma */
public final class apma extends anxl implements anzf {
    public static final apma d;
    private static volatile anzq f;
    public int a;
    public apxu b;
    public arml c;
    private byte e = (byte) 2;

    private apma() {
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
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0002\u0001Љ\u0000\u0003Љ\u0002", new Object[]{"a", "b", "c"});
            case 3:
                return new apma();
            case 4:
                return new apmd();
            case 5:
                return d;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (apma.class) {
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
        apma apma = new apma();
        d = apma;
        anxl.registerDefaultInstance(apma.class, apma);
    }
}
