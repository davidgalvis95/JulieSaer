package Controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.microsoft.sqlserver.jdbc.SQLServerException;

import Implementation.LogIn_SignIn;

/**
 * Servlet implementation class logInController
 */
@WebServlet("/logInController")
public class logInController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    LogIn_SignIn validation;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public logInController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			validation= new LogIn_SignIn();
		
		} catch (SQLServerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String form=request.getParameter("action");
		Map<String, String[]> parameters=request.getParameterMap();
		
		switch(form) {
		case "logIn":
			try {
				System.out.println(validation);
				boolean respuesta=validation.Login(parameters);
				if(respuesta) {
					response.sendRedirect("./logIn.jsp");
				}
				else {
					response.sendRedirect("./logIn.jsp");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			break;
		case "logInEmploy":
			try {
				
				boolean respuesta=validation.LoginEmploy(parameters);
				if(respuesta) {
					
				}
				else {
					response.sendRedirect("./logInEmploy.jsp");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case "singIn":
try {
				
				boolean respuesta=validation.SignUp(parameters);
				if(!respuesta) {
					System.out.println("No exitoso");
				}
				else {
					response.sendRedirect("./Welcome.jsp");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		}
		doGet(request, response);
	}

}
