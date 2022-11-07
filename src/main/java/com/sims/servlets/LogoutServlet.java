package com.sims.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LogoutServlet
 */
@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LogoutServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		log("=================== LOGOUT LOG: doGet START ============================");
		
        try {
           // Fetch session object
           HttpSession session = request.getSession(false);
           
           // If session is not null 
           if (session != null) {
              // Removes all session attributes bound to the session
               session.invalidate();
               log("==================== LOGOUT LOG: user logged out successfully =============================");
               
               response.sendRedirect(request.getContextPath() + "/login");
               return;
           }
        } 
        catch (Exception ex) {
           throw new ServletException(ex);
        }
        
        log("==================== LOGOUT LOG: doGet END =============================");
      
    }// End of doGet()

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
