package admin.creply;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import creply.model.service.CreplyService;
import creply.model.vo.Creply;

/**
 * Servlet implementation class CreplyDeleteServlet
 */
@WebServlet("/adcrdelete.ad")
public class CreplyDeleteServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreplyDeleteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        int creplyNum = Integer.parseInt(request.getParameter("crnum"));
        int cboardNum = Integer.parseInt(request.getParameter("cnum"));
        int depth = Integer.parseInt(request.getParameter("depth"));

        CreplyService crservice = new CreplyService();
        int result = crservice.deleteCreply(creplyNum, depth);

        if (result > 0) {
            response.sendRedirect("/anavada/adcdetail.ad?cnum=" + cboardNum);
        } else {
            response.setContentType("text/html; charset=UTF-8");
            PrintWriter writer = response.getWriter();
            writer.println(
                "<script>alert('댓글 삭제 실패.');location.href='/anavada/cdetail?cnum=" +
                cboardNum + "';</script>"
            );
            writer.close();
        }
    }

    /**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}
