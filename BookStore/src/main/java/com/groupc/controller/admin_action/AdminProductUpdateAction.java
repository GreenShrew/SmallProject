package com.groupc.controller.admin_action;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.groupc.controller.action.Action;
import com.groupc.dao.AdminDao;
import com.groupc.dto.AdminVO;
import com.groupc.dto.ProductVO;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

public class AdminProductUpdateAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "bs.do?cmd=adminProductList";
		
		HttpSession session = request.getSession();
		AdminVO avo = (AdminVO)session.getAttribute("loginAdmin");
		
		if(avo == null) {
			url = "bs.do?cmd=admin";
		}else {
			ProductVO pvo = new ProductVO();
			ServletContext context = session.getServletContext();
			String path = context.getRealPath("images/book");
			
			MultipartRequest multi = new MultipartRequest(request, path, 5 *1024 *1024, "UTF-8", new DefaultFileRenamePolicy());
			
			pvo.setBseq(Integer.parseInt(multi.getParameter("bseq")));
			pvo.setBname(multi.getParameter("bname"));
			pvo.setWriter(multi.getParameter("writer"));
			pvo.setByear(multi.getParameter("byear"));
			pvo.setKind(multi.getParameter("kind_radio"));
			pvo.setPrice(Integer.parseInt(multi.getParameter("price")));
			pvo.setPublisher(multi.getParameter("publisher"));
			pvo.setGenre(multi.getParameter("genre_radio"));
			pvo.setContent(multi.getParameter("content"));
			pvo.setUseyn(multi.getParameter("useyn"));
			pvo.setBestyn(multi.getParameter("bestyn"));
			if(multi.getFilesystemName("image") == null) {
				pvo.setImage(multi.getParameter("oldImage"));
			}else {
				pvo.setImage(multi.getFilesystemName("image"));
			}
			
			AdminDao adao = AdminDao.getInstance();
			adao.updateProduct(pvo);
			
			url = "bs.do?cmd=adminProductDetail&bseq=" + pvo.getBseq();
		}
		request.getRequestDispatcher(url).forward(request, response);
	}

}
