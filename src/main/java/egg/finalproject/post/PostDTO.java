package egg.finalproject.post;

import java.sql.Date;

public class PostDTO {
	
	   private int post_no;
	   private int type;
	   private String user_id;
	   private String user_nickname;
	   private int category_no;
	   private String title;
	   private String content;
	   private int product_no;
	   private int view_count;
	   private Date written_date;
	   private String reservation_time;

	public PostDTO() {}

	public PostDTO(int post_no, int type, String user_id, String user_nickname, int category_no, String title,
			String content, int product_no, int view_count, Date written_date, String reservation_time) {
		super();
		this.post_no = post_no;
		this.type = type;
		this.user_id = user_id;
		this.user_nickname = user_nickname;
		this.category_no = category_no;
		this.title = title;
		this.content = content;
		this.product_no = product_no;
		this.view_count = view_count;
		this.written_date = written_date;
		this.reservation_time = reservation_time;
	}

	public int getPost_no() {
		return post_no;
	}

	public void setPost_no(int post_no) {
		this.post_no = post_no;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUser_nickname() {
		return user_nickname;
	}

	public void setUser_nickname(String user_nickname) {
		this.user_nickname = user_nickname;
	}

	public int getCategory_no() {
		return category_no;
	}

	public void setCategory_no(int category_no) {
		this.category_no = category_no;
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

	public int getProduct_no() {
		return product_no;
	}

	public void setProduct_no(int product_no) {
		this.product_no = product_no;
	}

	public int getView_count() {
		return view_count;
	}

	public void setView_count(int view_count) {
		this.view_count = view_count;
	}

	public Date getWritten_date() {
		return written_date;
	}

	public void setWritten_date(Date written_date) {
		this.written_date = written_date;
	}

	public String getReservation_time() {
		return reservation_time;
	}

	public void setReservation_time(String reservation_time) {
		this.reservation_time = reservation_time;
	}
	
	public String toString() {
		return "post_no : "+post_no + " title : "+title;
	}
	
}
