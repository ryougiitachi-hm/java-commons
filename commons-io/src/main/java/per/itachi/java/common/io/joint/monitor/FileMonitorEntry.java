package per.itachi.java.common.io.joint.monitor;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.monitor.FileAlterationMonitor;
import org.apache.commons.io.monitor.FileAlterationObserver;

/**
 * less easy-to-use than jdk WatchService.
 * */
@Slf4j
public class FileMonitorEntry {

    public static void main(String[] args) {
        String strPathRegistered = args[0];
        FileAlterationObserver observer = new FileAlterationObserver(strPathRegistered);
        observer.addListener(new CommonFileMonitor());
        log.info("Start listening to the directory {}, observer={}", strPathRegistered, observer);
        try {
            FileAlterationMonitor monitor = new FileAlterationMonitor(); // 10000ms by default, namely 10s
            monitor.addObserver(observer);
            monitor.start();
        }
        catch (Exception e) {
            log.error("", e);
        }
    }

}
