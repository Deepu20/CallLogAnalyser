package com.logcalls.logsAnalyzer.service;

import com.logcalls.logsAnalyzer.repository.CallLogRepository;
import com.logcalls.logsAnalyzer.model.CallLogs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class CallLogService {
    @Autowired
    CallLogRepository callLogRepository;

    public void add(CallLogs callLogs){
        callLogRepository.save(toEntity(callLogs));
    }

    private CallLogs toEntity(CallLogs callLogs) {
        CallLogs callLogs1 = new CallLogs();
        callLogs1.setName(callLogs.getName());
        callLogs1.setPhoneNumber(callLogs.getPhoneNumber());
        callLogs1.setRecordingPath(callLogs.getRecordingPath());
        callLogs1.setTimeStamp(callLogs.getTimeStamp());
        return callLogs;
    }
}
