package com.druCare.druDemoSpring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Airtel implements NetConnection{

	@Override
	public void connect() {
		System.out.println("airtel is connected");
		
	}

}
