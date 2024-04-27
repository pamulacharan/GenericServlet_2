import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class GenericServlet_2 extends GenericServlet {
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        // Get print writer.
        PrintWriter pw = response.getWriter();
        // Get enumeration of parameter names.
        Enumeration<String> e = request.getParameterNames();
        // Display parameter names and values.
        while (e.hasMoreElements()) {
            String pname = e.nextElement();
            pw.print(pname + " = ");
            String pvalue = request.getParameter(pname);
            pw.println(pvalue);
            
        }
        pw.println(" ");
        pw.println("hi this is Ex2! in GenericServlet Method 2");
        pw.close();
    }
}
