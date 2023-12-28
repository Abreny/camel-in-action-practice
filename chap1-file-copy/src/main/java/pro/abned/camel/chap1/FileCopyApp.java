package pro.abned.camel.chap1;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

public class FileCopyApp {
    public static void main(String[] args) {
        try (CamelContext ctxt = new DefaultCamelContext()) {
            ctxt.addRoutes(new RouteBuilder() {
                @Override
                public void configure() throws Exception {
                    from("file:data/inbox?noop=true").to("file:data/outbox");
                }
            });
            ctxt.start();
            Thread.sleep(100000);
            ctxt.stop();
        } catch (Exception e) {
            System.out.println("DEFAULT_CONTEXT_ERROR: " + e.getMessage());
        }
    }
}
