package com.study.task;

import org.springframework.context.ApplicationContext;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by zbl on 2017/6/20.
 */
public abstract class TimedTask extends Task {
    private static final long serialVersionUID = -4922057980444575090L;
    private Date startTime;

    public abstract String getJobName();

    public abstract String getJobGroup();

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }
}
