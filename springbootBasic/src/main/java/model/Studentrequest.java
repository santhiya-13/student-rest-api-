package model;

public class Studentrequest {
	    public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;	}
		public void setName(String name) {
			this.name = name;
		}
		public String getCourse() {
			return course;
		}
		public void setCourse(String course) {
			this.course = course;
		}
		public String getDept() {
			return dept;
		}
		public void setDept(String dept) {
			this.dept = dept;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public int getPhoneno() {
			return phoneno;
		}
		public void setPhoneno(int phoneno) {
			this.phoneno = phoneno;
		}
		private int id;
		private String name;
		private String course;
		private String dept;
		private String city;
		private int phoneno;
		
		
		public Studentrequest() {
			
		}
		public Studentrequest(int id,String name,String course,String dept,String city,int phoneno) {
			
			this.id=id;
			this.name=name;
			this.course=course;
			this.dept=dept;
			this.city=city;
			this.phoneno=phoneno;
		}
	}