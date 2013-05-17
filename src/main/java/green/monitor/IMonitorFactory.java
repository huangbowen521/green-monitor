package green.monitor;

import javax.xml.bind.JAXBException;
import java.util.Map;

public interface IMonitorFactory {

    Map<String, Monitor> getRunner();

    Monitoring getMonitoring() throws JAXBException;

    MonitorResult run(String id) throws Exception;

    Map<String, MonitorResult> runAll() throws Exception;
}
