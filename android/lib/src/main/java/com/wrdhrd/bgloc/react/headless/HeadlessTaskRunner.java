package com.wrdhrd.bgloc.react.headless;

import android.content.Intent;

import com.wrdhrd.bgloc.headless.Task;
import com.wrdhrd.bgloc.headless.AbstractTaskRunner;

public class HeadlessTaskRunner extends AbstractTaskRunner {
    @Override
    public void runTask(Task task) {
        Intent service = new Intent(mContext, HeadlessService.class);
        service.putExtras(task.getBundle());
        mContext.startService(service);
    }
}
