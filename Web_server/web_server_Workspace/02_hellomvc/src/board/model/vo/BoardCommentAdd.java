package board.model.vo;

import java.sql.Date;

/**
 * 댓글 추가 게시물 댓글 보여주기 기능 
 * @author rlwi4
 *
 */
public class BoardCommentAdd  extends Board {
	private int CommentAdd;

	public BoardCommentAdd() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BoardCommentAdd(int no, String title, String writer, String content, Date regDate, int readCount,
			Attachment attach) {
		super(no, title, writer, content, regDate, readCount, attach);
		// TODO Auto-generated constructor stub
	}

	public BoardCommentAdd(int commentAdd) {
		super();
		CommentAdd = commentAdd;
	}

	public int getCommentAdd() {
		return CommentAdd;
	}

	public void setCommentAdd(int commentAdd) {
		CommentAdd = commentAdd;
	}

	@Override
	public String toString() {
		return "BoardCommentAdd [CommentAdd=" + CommentAdd + "]";
	}

	
}
