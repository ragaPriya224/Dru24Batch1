package com.druCare.druDemoSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Home {
	
	@Autowired  //- toinject that dependency
	NetConnection a ;
	
	public void m1() {
		
//		 new Airtel(); //tight coupling
		a.connect();
		
	}

}
