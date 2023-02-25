package per.itachi.java.common.io.joint.monitor;

import java.io.File;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.monitor.FileAlterationListenerAdaptor;
import org.apache.commons.io.monitor.FileAlterationObserver;

@Slf4j
public class CommonFileMonitor extends FileAlterationListenerAdaptor {

    @Override
    public void onStart(FileAlterationObserver observer) {
        super.onStart(observer); // no ops in this method
        log.info("onStart, observer={}", observer);
    }

    @Override
    public void onDirectoryCreate(File directory) {
        super.onDirectoryCreate(directory); // no ops in this method
        log.info("onDirectoryCreate, directory={}", directory);
    }

    @Override
    public void onDirectoryChange(File directory) {
        super.onDirectoryChange(directory); // no ops in this method
        log.info("onDirectoryChange, directory={}", directory);
    }

    @Override
    public void onDirectoryDelete(File directory) {
        super.onDirectoryDelete(directory); // no ops in this method
        log.info("onDirectoryDelete, directory={}", directory);
    }

    @Override
    public void onFileCreate(File file) {
        super.onFileCreate(file); // no ops in this method
        log.info("onFileCreate, file={}", file);
    }

    @Override
    public void onFileChange(File file) {
        super.onFileChange(file); // no ops in this method
        log.info("onFileChange, file={}", file);
    }

    @Override
    public void onFileDelete(File file) {
        super.onFileDelete(file); // no ops in this method
        log.info("onFileDelete, file={}", file);
    }

    @Override
    public void onStop(FileAlterationObserver observer) {
        super.onStop(observer); // no ops in this method
        log.info("onStop, observer={}", observer);
    }
}
