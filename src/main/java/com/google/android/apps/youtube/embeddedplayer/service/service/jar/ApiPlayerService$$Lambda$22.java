package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

final /* synthetic */ class ApiPlayerService$$Lambda$22 implements Runnable {
    private final ApiPlayerService a;
    private final boolean b;

    ApiPlayerService$$Lambda$22(ApiPlayerService apiPlayerService, boolean z) {
        this.a = apiPlayerService;
        this.b = z;
    }

    public final void run() {
        ApiPlayerService apiPlayerService = this.a;
        apiPlayerService.a.c(this.b);
    }
}
