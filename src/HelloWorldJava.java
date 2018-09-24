import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

// The Java class will be hosted at the URI path "/helloworld"
@Path("/helloworldjava")
public class HelloWorldJava {
    // The Java method will process HTTP GET requests
    // The Java method will produce content identified by the MIME Media type "text/plain"
    // Return some cliched textual content

    @org.intellij.lang.annotations.Language(value = "HTML",prefix = "<body><b>1", suffix = "2</b></body>")
    String val1 = "Hello World java";

    // language="HTML" prefix="<b>" suffix=</b>
    String val2 = "test java";

    @GET
    @Produces("text/html")
    public String foo10() {
        return val1 + "\n" + val2;
    }
}