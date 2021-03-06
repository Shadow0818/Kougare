package com.shuang.common;

public class GlobalConstants {
	
	public static final String AllSQLQuery = "All_SQL_QUERY";
	public static final String JSON_TYPE = "application/vnd.fnma-v1+json";
	
	
	public static final class CustomerConstants {
		
		public static final String Cust_User_Id = "USER_ID";
		public static final String Cust_First_Name = "FIRST_NAME";
		public static final String Cust_Last_Name = "LAST_NAME";
		public static final String Cust_Phone = "CELL_PHONE";
		public static final String Email = "EMAIL";
		public static final String Password = "PASSCODE";
		public static final String Comment = "COMMENTS";
		public static final String Address = "ADDRESS";
		public static final String County = "COUNTY";
		public static final String States = "STATES";
		public static final String Country = "COUNTRY";
		public static final String Zip_Code = "ZIP_CODE";
		
	}
	
	public final static class AccessCode {
		private static String Kougare_Home = "/kougarehome";
		private static String ResumeAccess = "/myProfile";
		/**
		 * @return the kougarehome
		 */
		public final static String getKougarehome() {
			return Kougare_Home;
		}
		/**
		 * @param kougarehome the kougarehome to set
		 */
		public final void setKougarehome(String kougarehome) {
			this.Kougare_Home = kougarehome;
		}
		/**
		 * @return the resumeAccess
		 */
		public final static String getResumeAccess() {
			return ResumeAccess;
		}
		/**
		 * @param resumeAccess the resumeAccess to set
		 */
		public final void setResumeAccess(String resumeAccess) {
			ResumeAccess = resumeAccess;
		}
		
		
		
	}

}
