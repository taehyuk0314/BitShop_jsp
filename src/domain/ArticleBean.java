package domain;

public class ArticleBean {
	private String seq,title,content,writer,regdate;

	public String getSeq() {
		return seq;
	}

	public void setSeq(String seq) {
		this.seq = seq;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	@Override
	public String toString() {
		return String.format("번호:%s\n"
				+ "제목:%s\n"
				+ "내용:%s\n"
				+ "작가:%s\n"
				+ "작성날짜:%s\n", seq,title,content,writer,regdate);
	}
	
}
