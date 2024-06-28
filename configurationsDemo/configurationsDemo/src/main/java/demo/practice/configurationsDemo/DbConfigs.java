package demo.practice.configurationsDemo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

//to pull a group of configurations at one place 

@Configuration
@ConfigurationProperties("db")
public class DbConfigs {

	private String connection;
	private String host;
	public String getConnection() {
		return connection;
	}
	public void setConnection(String connection) {
		this.connection = connection;
	}
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	
	
}
