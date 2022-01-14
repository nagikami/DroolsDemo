import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

@Slf4j
public class HelloWorldTest {
    @Test
    public void helloWorld() {
        KieServices kieServices = KieServices.Factory.get();
        KieContainer kieContainer = kieServices.newKieClasspathContainer();
        KieSession helloWorldSession = kieContainer.newKieSession("helloWorldSession");
        helloWorldSession.fireAllRules();
        helloWorldSession.dispose();
    }
}
