package defpackage;

/* renamed from: arff */
public final class arff extends anxl implements anzf {
    public static final arff e;
    private static volatile anzq g;
    public int a;
    public String b = "";
    public arfd c;
    public arfb d;
    private byte f = (byte) 2;

    private arff() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.f = b;
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001\b\u0000\u0002Љ\u0002\u0003Љ\u0003", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new arff();
            case 4:
                return new arfe();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (arff.class) {
                        obj3 = g;
                        if (obj3 == null) {
                            obj3 = new anxn(e);
                            g = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        arff arff = new arff();
        e = arff;
        anxl.registerDefaultInstance(arff.class, arff);
    }
}