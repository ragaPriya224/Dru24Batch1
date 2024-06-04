package com.druCare.druDemoSpring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Bsnl implements NetConnection{

	@Override
	public void connect() {
		System.out.println("bsnl is connected");
		
	}

}
