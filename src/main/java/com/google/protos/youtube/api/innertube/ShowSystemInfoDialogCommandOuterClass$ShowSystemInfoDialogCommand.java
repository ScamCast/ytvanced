package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.arml;
import defpackage.axmu;

public final class ShowSystemInfoDialogCommandOuterClass$ShowSystemInfoDialogCommand extends anxl implements anzf {
    public static final ShowSystemInfoDialogCommandOuterClass$ShowSystemInfoDialogCommand c;
    private static volatile anzq e;
    public static final anxr showSystemInfoDialogCommand;
    public int a;
    public arml b;
    private byte d = (byte) 2;

    private ShowSystemInfoDialogCommandOuterClass$ShowSystemInfoDialogCommand() {
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
                return new ShowSystemInfoDialogCommandOuterClass$ShowSystemInfoDialogCommand();
            case 4:
                return new axmu();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (ShowSystemInfoDialogCommandOuterClass$ShowSystemInfoDialogCommand.class) {
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
        ShowSystemInfoDialogCommandOuterClass$ShowSystemInfoDialogCommand showSystemInfoDialogCommandOuterClass$ShowSystemInfoDialogCommand = new ShowSystemInfoDialogCommandOuterClass$ShowSystemInfoDialogCommand();
        c = showSystemInfoDialogCommandOuterClass$ShowSystemInfoDialogCommand;
        anxl.registerDefaultInstance(ShowSystemInfoDialogCommandOuterClass$ShowSystemInfoDialogCommand.class, showSystemInfoDialogCommandOuterClass$ShowSystemInfoDialogCommand);
        apxu apxu = apxu.d;
        ShowSystemInfoDialogCommandOuterClass$ShowSystemInfoDialogCommand showSystemInfoDialogCommandOuterClass$ShowSystemInfoDialogCommand2 = c;
        showSystemInfoDialogCommand = anxl.newSingularGeneratedExtension(apxu, showSystemInfoDialogCommandOuterClass$ShowSystemInfoDialogCommand2, showSystemInfoDialogCommandOuterClass$ShowSystemInfoDialogCommand2, null, 240199717, aobm.MESSAGE, ShowSystemInfoDialogCommandOuterClass$ShowSystemInfoDialogCommand.class);
    }
}
