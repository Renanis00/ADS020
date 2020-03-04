
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "MeuServlet", urlPatterns = "/meuservlet")
public class MeuServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession sessao = req.getSession();
        
        if(sessao.getAttribute("nome") == null
               || sessao.getAttribute("nome").toString().isEmpty()){
            sessao.setAttribute("nome", "Jose");
        }else{
            sessao.setAttribute("nome", "Maria");
    }
        
        System.out.println("Executou doGet()... com" + sessao.getAttribute("nome"));
        
        String nome = req.getParameter("nome");
        
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<body>");
        if(nome != null && !nome.isEmpty()){
            out.println("<h1>Olá " + nome + "!</h1>");
        }else{
            out.println("<h1>Olá mundo!</h1>");
        }
        out.println("<h1>Olá mundo!</h1>");
        out.println("</body>");
        out.println("</html>");
        
            
    }
    

    @Override
    public void init() throws ServletException {
        System.out.println("Executou o init...");
    }

    @Override
    public void destroy() {
        System.out.println("Executou o Destroy...");
    }
    
    
}
