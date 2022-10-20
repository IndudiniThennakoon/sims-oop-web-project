package com.sims.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		
		List<String> errors = ValidationService.loginValidator(email, password);
		
		if (errors != null && !errors.isEmpty()) {
			request.setAttribute("email", email);
			request.setAttribute("password", password);
			request.setAttribute("errors", errors);
			request.getRequestDispatcher("login").forward(request, response);
		}
		
		try {
			AuthServiceInterface authService = new AuthService();
			List<User> userDetails = authService.userLoginByEmail(email, password);
			
			if (Validations.isUserHasNulls(userDetails) || userDetails == null || userDetails.isEmpty()) {
				errors.add( "The Username or Password is incorrect..!" );
				request.setAttribute("errors", errors);
				request.getRequestDispatcher("login").forward(request, response);
			}
			//redirect - setAttribute
			request.getSession().setAttribute("userDetails", userDetails);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		//redirect
		response.sendRedirect(request.getContextPath() + "dashboard");
		return;
		
//		RequestDispatcher dispatch = request.getRequestDispatcher("dashboard"); 
//		dispatch.forward(request, response);
	}

}


