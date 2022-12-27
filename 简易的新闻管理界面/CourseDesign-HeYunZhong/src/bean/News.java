package bean;

import java.util.Date;

public class News {
	private int id;
	private String title;
	private String source;
	private String content;
	private Date date;
	
	

	public News() {
		super();
	}


	public News(int id, String title, String source, String content, Date date) {
		super();
		this.id = id;
		this.title = title;
		this.source = source;
		this.content = content;
		this.date = date;
	}


	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getSource() {
		return source;
	}



	public void setSource(String source) {
		this.source = source;
	}



	public String getContent() {
		return content;
	}



	public void setContent(String content) {
		this.content = content;
	}



	public Date getDate() {
		return date;
	}



	public void setDate(Date date) {
		this.date = date;
	}



	@Override
	public String toString() {
		return "News [id=" + id + ", title=" + title + ", source=" + source + ", content=" + content + ", date=" + date
				+ "]";
	}
	
	
	
}
