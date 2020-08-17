package inquiry.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.notice.answer.model.service.AnswerService;
import admin.notice.answer.model.vo.Answer;
import inquiry.model.service.InquiryService;
import inquiry.model.vo.Inquiry;

/**
 * Servlet implementation class InquiryDetailServlet
 */
@WebServlet("/imdetail.ss")
public class InquiryMyDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InquiryMyDetailServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Inquiry inquiry = new InquiryService().selectOne(Integer.parseInt(request.getParameter("no")));
		
		int currentPage = 1;
		if(request.getParameter("page") != null)
			currentPage = Integer.parseInt(request.getParameter("page"));
		
		Answer answer = null;
		if(inquiry.getIqAnswer().equals("Y"))
			answer = new AnswerService().selectOne(inquiry.getIqNo());
		
		if(inquiry != null) {
			RequestDispatcher view = request.getRequestDispatcher("views/inquiry/myinquiry_view.jsp");
			request.setAttribute("inquiry", inquiry);
			request.setAttribute("page", currentPage);
			request.setAttribute("answer", answer);
			view.forward(request, response);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
