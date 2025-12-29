package com.user;

public class user {

		   private int id;
		    private String name;
		    private String course;
		    private String college;
		    private String phoneno;
		    private double fees;

		    
		    public user() {
		    }

		    
		    public user(int id, String name, String course, String college, String phoneno, double fees) {
		        this.id = id;
		        this.name = name;
		        this.course = course;
		        this.college = college;
		        this.phoneno = phoneno;
		        this.fees = fees;
		    }

		    public int getId() {
		        return id;
		    }
		    public void setId(int id) {
		        this.id = id;
		    }

		    public String getName() {
		        return name;
		    }
		    public void setName(String name) {
		        this.name = name;
		    }

		    public String getCourse() {
		        return course;
		    }
		    public void setCourse(String course) {
		        this.course = course;
		    }

		    public String getCollege() {
		        return college;
		    }
		    public void setCollege(String college) {
		        this.college = college;
		    }

		    public String getPhoneno() {
		        return phoneno;
		    }
		    public void setPhoneno(String phoneno) {
		        this.phoneno = phoneno;
		    }

		    public double getFees() {
		        return fees;
		    }
		    public void setFees(double fees) {
		        this.fees = fees;
		    }
		

}
