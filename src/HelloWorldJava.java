import org.intellij.lang.annotations.Language;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

// The Java class will be hosted at the URI path "/helloworldjava"
@Path("/helloworldjava")
public class HelloWorldJava {

    @org.intellij.lang.annotations.Language(value = "HTML",prefix = "<body><b>1", suffix = "2</b></body>")
    String val1 = "Hello World java";

    // language="HTML" prefix="<b>" suffix=</b>
    String val2 = "test java";

    @GET
    @Produces("text/html")
    public String foo10() {
        return val1 + "\n" + val2;
    }

    @GET
    @Produces("text/html")
    @Path("/1")
    public String foo11() {
        return "test usual injection";
    }
}