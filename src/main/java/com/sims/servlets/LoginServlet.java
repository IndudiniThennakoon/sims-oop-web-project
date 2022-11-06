package com.sims.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sims.models.User;
import com.sims.services.AuthService;
import com.sims.services.ValidationService;
import com.sims.services.interfaces.AuthServiceInterface;
import com.sims.utils.Validations;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet(asyncSupported = true, urlPatterns = { "/LoginServlet" })
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		// Validate email and password
		List<String> errors = ValidationService.loginValidator(email, password);

        // If errors found from loginValidator then redirect back to login with errors
		if (errors != null && !errors.isEmpty()) {
			request.setAttribute("email", email);
			request.setAttribute("password", password);
			request.setAttribute("errors", errors);
			request.getRequestDispatcher("login").forward(request, response);
	        return;
		}
		
		try {
		   // Validate and get user by email and password
			AuthServiceInterface authService = new AuthService();
			List<User> user = authService.userLoginByEmail(email, password);
			String userType = user.get(0).getUserType();
			
			// If user not found then redirect back to login with errors
			if (Validations.isUserHasNulls(user) || user == null || user.isEmpty()) {
				errors.add( "The Username or Password is incorrect..!" );
				request.setAttribute("errors", errors);
				request.getRequestDispatcher("login").forward(request, response);
			}
			
			// Creating a session
			HttpSession session = request.getSession();
			
			// If user found set user details to session attribute
			session.setAttribute("user", user);

            // Redirect to dashboard by user type
			if (userType == null) {
	            response.sendRedirect(request.getContextPath() + "dashboard");
	            return;
			} 
			else {
               response.sendRedirect(request.getContextPath() + userType + "/dashboard");
               return;
            }
			
		} 
		catch (IOException e1) {
	        e1.printStackTrace();
	    } 
		catch (Exception e2) {
	        e2.printStackTrace();
	    }
		
//		RequestDispatcher dispatch = request.getRequestDispatcher("dashboard"); 
//		dispatch.forward(request, response);
		
	}// End of doPost()

}


