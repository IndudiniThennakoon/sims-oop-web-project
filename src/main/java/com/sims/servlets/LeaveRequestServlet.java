package com.sims.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sims.models.LeaveRequest;
import com.sims.services.LeaveRequestService;
import com.sims.services.interfaces.LeaveRequestInterface;

/**
 * Servlet implementation class LeaveRequest
 */
@WebServlet("/teacher/leave-requests")
public class LeaveRequestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LeaveRequestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
	    log("===================LOG doGet START============================"); 
	   
	    LeaveRequestInterface LeaveReqService = new LeaveRequestService();
        ArrayList<LeaveRequest> LeaveRequestList = LeaveReqService.all();
        
        request.setAttribute("LeaveRequestList", LeaveRequestList);
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/resources/views/teacher/manage-leave-request.jsp");
        dispatcher.forward(request, response);

        log("====================LOG doGet END============================="); 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    log("===================LOG doPost START============================"); 
        
        List<String> errors = new ArrayList<>();
         
        try {
           LeaveRequest RequestLeave = new LeaveRequest();
           
           RequestLeave.setUser_id(1); // TODO: Get logged in user after login implemented
           RequestLeave.setDate(request.getParameter("date"));
           RequestLeave.setDays_count(request.getParameter("days_count"));
           RequestLeave.setReason(request.getParameter("reason"));
           RequestLeave.setStatus("pending"); 

           LeaveRequestInterface RequestLeaveService = new LeaveRequestService();
            
           boolean create_response = RequestLeaveService.create(RequestLeave);
           
           if(create_response) { 
              request.getSession().setAttribute("leaveRequest", RequestLeave);
              request.getSession().setAttribute("success", "Your request has been recorded successfully.!"); 
           }else {
              throw new Exception("Create Failed.!");
           }
          
         } catch (Exception e) {
            
            log("====================LOG doPost Exception============================="); 
            log("Exception: " + e.getMessage()); 
            log("====================END LOG doPost Exception============================="); 
            
            errors.add("Something went wrong! Please try again.!");
//            request.setAttribute("errors", errors);
            request.getSession().setAttribute("errors", errors);
         } finally {
            log("======================REDIRECTING============================="); 
             
            response.sendRedirect(request.getContextPath() + "leave-requests/add");
            
//            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/resources/views/teacher/request-leave.jsp");
//            dispatcher.forward(request, response);
         }
       
        
        log("====================LOG doPost END============================="); 
	}

}
