package servlet;

import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.itextpdf.io.IOException;

import util.GeraPDFUtil;

public class GeraPDF extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public GeraPDF() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			response.getWriter().append("Served at: ").append(request.getContextPath());
		} catch (java.io.IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		HttpSession session = request.getSession();
		GeraPDFUtil geradorPdf = new GeraPDFUtil();

		String[] stringConstutor = new String[7];
		stringConstutor[0] = request.getParameter("nomeEmpresa");
		stringConstutor[1] = request.getParameter("cnpjEmpresa");
		stringConstutor[2] = request.getParameter("enderecoEmpresa");
		stringConstutor[3] = request.getParameter("nomeFuncionario");
		stringConstutor[4] = request.getParameter("ctpsFuncionario");
		stringConstutor[5] = request.getParameter("serieCtpsFuncionario");
		stringConstutor[6] = request.getParameter("dataAbandono");
		try {
			GeraPDFUtil.geraPDF(stringConstutor);

		} catch (java.io.IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("FIM");

		try {
			response.sendRedirect("resposta.jsp");
		} catch (java.io.IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
