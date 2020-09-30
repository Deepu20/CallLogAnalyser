package com.logcalls.logsAnalyzer.repository;

import com.logcalls.logsAnalyzer.model.CallLogs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CallLogRepository extends JpaRepository <CallLogs,Integer>{

}
