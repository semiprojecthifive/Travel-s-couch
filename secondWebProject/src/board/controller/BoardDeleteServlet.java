package board.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.exception.BoardException;
import board.model.service.BoardService;
import board.model.vo.Board;

/**
 * Servlet implementation class BoardDeleteServlet
 */
@WebServlet("/bdelete")
public class BoardDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BoardDeleteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 게시글 삭제 처리용 컨트롤러
		int boardNum = Integer.parseInt(
				request.getParameter("bnum"));
		
		RequestDispatcher view = null;
		try {
			BoardService bservice = new BoardService();
			Board board = bservice.selectBoard(boardNum);
			
			if(bservice.deleteBoard(boardNum) > 0){
				//삭제 성공시, 첨부파일이 있을 경우
				//bupfiles 폴더에 해당 파일 삭제 처리함
				if(board.getBoardOriginalFileName() != null){
					String savePath = request.getSession()
						.getServletContext().getRealPath(
								"/bupfiles");
					File removeFile = new File(savePath + 
						"\\" + board.getBoardRenameFileName());
					removeFile.delete();
				}			
				
				response.sendRedirect("/second/blist");
			}else{
				view = request.getRequestDispatcher(
						"views/board/boardError.jsp");
				request.setAttribute("message", 
						boardNum + "번글 삭제 실패!");
				view.forward(request, response);
			}
			
		} catch (BoardException e) {
			view = request.getRequestDispatcher(
					"views/board/boardError.jsp");
			request.setAttribute("message", e.getMessage());
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
