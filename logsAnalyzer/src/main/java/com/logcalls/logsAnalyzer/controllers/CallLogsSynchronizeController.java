package com.logcalls.logsAnalyzer.controllers;

import com.logcalls.logsAnalyzer.model.CallLogs;
import com.logcalls.logsAnalyzer.service.CallLogService;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

@Configuration
@RestController
public class CallLogsSynchronizeController {

    @Autowired
    private CallLogService callLogService;

    public CallLogs callLogs = new CallLogs();

    @GetMapping("/retrieve")
    public List<CallLogs> retrieve() throws JSONException {
        File folder = new File("D:\\PhoneRecord");
        List<File> filesList = new ArrayList<File>();
        for (File fileEntry : folder.listFiles()) {
            if (fileEntry.isFile() && fileEntry != null) {
                filesList.add(fileEntry);

                //get the separated file values
                String fileName = fileEntry.getName();
                String path = fileEntry.getPath();
                getFileParameters(fileName,path);
                for(int i=0;i<filesList.size();i++)
                {
                    callLogService.add(callLogs);
                }
            }
        }
        return ;
    }

    private CallLogs getFileParameters(String file, String path) {
        if (!file.isEmpty() && file != null) {
            String filename = file.split(".")[0];
            //String extension = file.split(".")[1];

            String first = filename.split("-")[0];
            String second = filename.split("-")[1];

            if (!first.equals("") && first.matches("^[a-zA-Z]*$")) {
                callLogs.setName(first);
            } else if (!first.equals("") && Character.isDigit(first.charAt(0))) {
                callLogs.setPhoneNumber(first);
            }
            callLogs.setTimeStamp(second);
            callLogs.setRecordingPath(path);

        }
        return callLogs;
    }
}

