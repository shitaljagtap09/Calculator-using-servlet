

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalculateServlet
 */
@WebServlet("/CalculateServlet")
public class CalculateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	     PrintWriter out = response.getWriter();
         String n1 = request.getParameter("txt1");
         String n2 = request.getParameter("txt2");
         String op = request.getParameter("op"); 
        
         
         if(op.equals("Addition")){
              out.println("<h1>Addition = <h1>"+(Integer.parseInt(n1) + Integer.parseInt(n2)));
         }
         else if(op.equals("Subtraction")){
              out.println("<h1>Subtraction = <h1>"+(Integer.parseInt(n1) - Integer.parseInt(n2)));
         }
         else if(op.equals("multiplication")){
              out.println("<h1>Multiplication= <h1>"+Integer.parseInt(n1) * Integer.parseInt(n2));
         }
         else{
             out.println("<h1>Division = <h1>"+Integer.parseInt(n1) / Integer.parseInt(n2));
         }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
