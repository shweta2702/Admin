package com.cg.main.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.NotNull;

	@Entity
	@Table(name="admin_table")
	
	public class Admin implements Serializable{
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		/**
		 * all the required variables for the admin class functionality are declared below
		 */
		@Id
		@GeneratedValue
		int adminId;
		@NotEmpty(message = "Admin name cant be empty")
		@NotNull(message = "User Name should not be null, please provide a value")
		@Pattern(regexp = "^[A-Za-z]\\w{5, 29}$", message = "Username should be in capitals")
		String adminName;
		@NotEmpty(message = "Admin password cant be empty")
		@NotNull(message = "Password should not be null. please provide a value")
	    @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$",message = "Please Use Strong Password!!!")
		String adminPassword;
		
		/**
		 * default or no argument constructor declaration
		 */
		public Admin() {
		}

		/**
		 * parameterized constructor declaration
		 * @param adminName
		 * @param adminPassword
		 */
		public Admin(String adminName, String adminPassword) {
			super();
			this.adminName = adminName;
			this.adminPassword = adminPassword;
		}

		/**
		 * parameterized constructor declaration
		 * @param adminId
		 * @param adminName
		 * @param adminPassword
		 */
		public Admin(int adminId, String adminName, String adminPassword) {
			super();
			this.adminId = adminId;
			this.adminName = adminName;
			this.adminPassword = adminPassword;
		}

		/**
		 * Getter and Setter for Admin id
		 * @return
		 * @param adminId
		 */
		public int getAdminId() {
			return adminId;
		}
		public void setAdminId(int adminId) {
			this.adminId = adminId;
		}

		/**
		 * Getter and Setter for admin name
		 * @return
		 * @param adminname
		 */
		public String getAdminName() {
			return adminName;
		}
		public void setAdminName(String adminName) {
			this.adminName = adminName;
		}

		/**
		 * Getter and Setter for admin password
		 * @return
		 * @param adminPassword
		 */
		public String getAdminPassword() {
			return adminPassword;
		}
		public void setAdminPassword(String adminPassword) {
			this.adminPassword = adminPassword;
		}

		/**
		 * toString() declaration
		 */
		@Override
		public String toString() {
			return "Admin [adminId=" + adminId + ", adminName=" + adminName + ", adminPassword=" + adminPassword + "]";
		}
		
		
		
}
