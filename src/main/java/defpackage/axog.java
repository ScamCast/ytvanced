package defpackage;

/* renamed from: axog */
public final class axog extends anxl implements anzf {
    public static final axog a;
    public static final anxr b = anxl.newSingularGeneratedExtension(aolk.r, Boolean.valueOf(false), null, null, 120958174, aobm.BOOL, Boolean.class);
    private static volatile anzq c;

    private axog() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(a, "\u0001\u0000", null);
            case 3:
                return new axog();
            case 4:
                return new axof();
            case 5:
                return a;
            case 6:
                Object obj3 = c;
                if (obj3 == null) {
                    synchronized (axog.class) {
                        obj3 = c;
                        if (obj3 == null) {
                            obj3 = new anxn(a);
                            c = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        axog axog = new axog();
        a = axog;
        anxl.registerDefaultInstance(axog.class, axog);
    }
}