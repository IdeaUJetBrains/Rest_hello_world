import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces

// The Java class will be hosted at the URI path "/helloworld"
@Path("/helloworld")
class HelloWorld {

    @org.intellij.lang.annotations.Language("HTML", prefix = "<body><b>1", suffix = "2</b></body>")
    val val1 = "Hello World kt"

    // language="HTML" prefix="<b>" suffix=</b>
    val val2 = "testkt"

    val clichedMessage: String
        @GET
        @Produces("text/html")
        get() {
            return val1 + "\n" + val2
        }
}