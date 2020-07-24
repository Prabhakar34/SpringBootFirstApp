package com.app.runner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class SpringBootRunnerWithInputData implements CommandLineRunner {

	@Value("${my.info.product.id}")  
	private int prodId;  
	@Value("${my.info.product.code}") 
	private String prodCode;  
	@Value("${my.info.product.model-version}")  
	private double modelver;  
	@Value("${my.info.product.release_dtl_enable}")  
	private boolean isDetEnable;  
	@Value("${my.info.product.start-key}")  
	private char startKey; 
	 
    //Constructor methods          
	//Setters and Getters method  
	//toString method
	@Override 
	public String toString() {  
		return "SpringBootRunnerWithInputData [prodId=" + prodId + ", prodCode=" + prodCode + ", modelver=" + modelver+ ", isDetEnable=" + isDetEnable + ",  startKey=" + startKey + "]";  
		}  
	//Overridden run method  
	public void run(String... args) throws Exception {  
		System.out.println(this);   
		//System.out.println(this.toString()); 
	}
}
