package ponder09;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@WebServlet(name = "CreateDiscussionPost", urlPatterns = {"/CreateDiscussionPost"})
public class CreateDiscussionPost extends HttpServlet {
     
  
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException 
    {

        String date = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        String username = "testing";
        String topic = request.getParameter("txtTopic");
        String content = request.getParameter("txtContent");

        DiscussionPost newdp = new DiscussionPost(date, username, topic, content);
      
        List<DiscussionPost> dis = new ArrayList();
        dis.add(newdp);
        //DiscussionPostDataHandler dis = new DiscussionPostDataHandler();
        
        
        
        request.setAttribute("discussions", dis);
        request.getRequestDispatcher("viewPosts.jsp").forward(request, response);


    }

}
