package com.study.task;

import com.study.task.TimedTask;
import org.springframework.context.ApplicationContext;

/**
 * Created by zbl on 2017/6/20.
 */
public class TestTask extends TimedTask{
    private static final long serialVersionUID = 2534578336318827874L;

    @Override
    public String getJobName() {
        return "testJobName";
    }

    @Override
    public String getJobGroup() {
        return "testJobGroup";
    }

    @Override
    public void executeTask(ApplicationContext context) {
        System.out.println("do testTask over!!!");
    }
}
