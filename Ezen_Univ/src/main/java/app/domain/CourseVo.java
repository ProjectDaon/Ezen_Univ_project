package app.domain;

public class CourseVo extends CourseTimeVo {
	private int cidx;
	private int pidx;
	private int p_no;
	private String p_name;
	private String c_name;
	private int c_grade;
	private String c_major;
	private int c_score;
	private int c_totaltime;
	private String c_sep;
	private String c_times;
	
	public int getCidx() {
		return cidx;
	}
	public void setCidx(int cidx) {
		this.cidx = cidx;
	}
	public int getPidx() {
		return pidx;
	}
	public void setPidx(int pidx) {
		this.pidx = pidx;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public int getC_grade() {
		return c_grade;
	}
	public void setC_grade(int c_grade) {
		this.c_grade = c_grade;
	}
	public String getC_major() {
		return c_major;
	}
	public void setC_major(String c_major) {
		this.c_major = c_major;
	}
	public int getC_score() {
		return c_score;
	}
	public void setC_score(int c_score) {
		this.c_score = c_score;
	}
	public int getC_totaltime() {
		return c_totaltime;
	}
	public void setC_totaltime(int c_totaltime) {
		this.c_totaltime = c_totaltime;
	}
	public String getC_sep() {
		return c_sep;
	}
	public void setC_sep(String c_sep) {
		this.c_sep = c_sep;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public String getC_times() {
		return c_times;
	}
	public void setC_times(String c_times) {
		this.c_times = c_times;
	}
	public int getP_no() {
		return p_no;
	}
	public void setP_no(int p_no) {
		this.p_no = p_no;
	}

}
