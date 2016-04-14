/**
 *Exception
 *
 *@author	Christiaan Saaiman (u12059138)
 *@version	1.0
 *@since	2016-03-18
 */


package com.codinginfinity.research.publications;

 
 public class Exception extends Throwable{
	String reason;
	 
	public Exception(String reason){
		this.setReason(reason);
	}
	
	protected void setReason(String reason){
		this.reason = reason;
	}
	
	public String getReason(){
		return reason;
	}
 }