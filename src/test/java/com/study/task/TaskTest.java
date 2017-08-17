package com.study.task;

import com.study.commons.test.AbstractSpringTestRunner;
import org.junit.Test;

import javax.inject.Inject;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

/**
 * Created by zbl on 2017/8/17.
 */
public class TaskTest extends AbstractSpringTestRunner {
    @Inject
    private SchedulingUtils schedulingUtils;
    @Test
    public void add() throws InterruptedException {
        System.out.println("test");
//        TestTask testTask = new TestTask();
//        Calendar instance = Calendar.getInstance();
//        instance.set(Calendar.SECOND, 2);
//        testTask.setStartTime(instance.getTime());
//        schedulingUtils.addTimedTaskSchedule(testTask);
//        TimeUnit.SECONDS.sleep(5);
    }
}
