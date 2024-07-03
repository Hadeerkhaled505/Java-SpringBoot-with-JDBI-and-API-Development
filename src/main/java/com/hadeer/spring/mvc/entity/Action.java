package com.hadeer.spring.mvc.entity;

public class Action {
	    private int id;
	    private String actionName;
	    private String dateOfCreation;
	    private String createdBy;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getActionName() {
			return actionName;
		}
		public void setActionName(String actionName) {
			this.actionName = actionName;
		}
		public String getDateOfCreation() {
			return dateOfCreation;
		}
		public void setDateOfCreation(String dateOfCreation) {
			this.dateOfCreation = dateOfCreation;
		}
		public String getCreatedBy() {
			return createdBy;
		}
		public void setCreatedBy(String createdBy) {
			this.createdBy = createdBy;
		}
	    
	    

}
