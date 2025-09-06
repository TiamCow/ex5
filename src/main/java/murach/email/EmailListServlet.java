package murach.email;

import java.io.IOException;
import java.time.LocalDate;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;

import murach.business.User;
import murach.data.UserDB;

public class EmailListServlet extends HttpServlet {

    private static final Logger logger = Logger.getLogger(EmailListServlet.class.getName());

    @Override
    protected void doPost(HttpServletRequest request, 
                          HttpServletResponse response) 
                          throws ServletException, IOException {

        String url = "/index.jsp";

        String action = request.getParameter("action");
        if (action == null) action = "join";

        logger.info("login = " + action);

        if (action.equals("join")) {
            url = "/index.jsp"; 
        } else if (action.equals("add")) {                
            // Lấy dữ liệu từ form
            String firstName = request.getParameter("firstName");
            String lastName  = request.getParameter("lastName");
            String email     = request.getParameter("email");
            String dob       = request.getParameter("dob");
            String hearAbout = request.getParameter("hearAbout");
            String offers    = request.getParameter("offers");
            String emailOffers = request.getParameter("emailOffers");
            String contact   = request.getParameter("contact");

            // Tạo User object
            User user = new User(firstName, lastName, email, dob, hearAbout, offers, emailOffers, contact);

            // Lưu vào DB nếu cần
            UserDB.insert(user);

            // Lấy hoặc tạo danh sách user trong session
            HttpSession session = request.getSession();
            List<User> userList = (List<User>) session.getAttribute("userList");
            if (userList == null) userList = new ArrayList<>();
            userList.add(user);
            session.setAttribute("userList", userList);

            // Gửi sang JSP
            request.setAttribute("user", user);
            request.setAttribute("currentDate", LocalDate.now());
            request.setAttribute("currentYear", Year.now().getValue());

            url = "/thanks.jsp";   
        }

        getServletContext().getRequestDispatcher(url).forward(request, response);
    }    

    @Override
    protected void doGet(HttpServletRequest request, 
                         HttpServletResponse response) 
                         throws ServletException, IOException {
        doPost(request, response);
    }    
}
