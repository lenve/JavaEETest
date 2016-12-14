package org.sang;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * Created by sang on 16-12-14.
 */
@Service
public class AsyncTaskService {
    @Async
    public void executeAsyncTask(int i) {
        System.out.println("异步任务1：" + i+"；Thread.currentThread().getName():"+Thread.currentThread().getName());
    }

    @Async
    public void executeAsyncTask2(int i) {
        System.out.println("异步任务2：" + i+"；Thread.currentThread().getName():"+Thread.currentThread().getName());
    }
}
