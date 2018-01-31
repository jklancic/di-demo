package xyz.blackmonster.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import xyz.blackmonster.fake.FakeDataSource;
import xyz.blackmonster.fake.FakeJmsBroker;

@Configuration
public class PropertyConfig {
	
	@Value("${app.username}")
	String username;
	
	@Value("${app.password}")
	String password;
	
	@Value("${app.url}")
	String url;
	
	@Value("${app.jms.username}")
	String jmsUsername;

	@Value("${app.jms.password}")
	String jmsPassword;

	@Value("${app.jms.url}")
	String jmsUrl;
	
	@Bean
	public FakeDataSource fakeDataSource() {
		FakeDataSource fakeDataSource = new FakeDataSource();
		fakeDataSource.setUsername(username);
		fakeDataSource.setPassword(password);
		fakeDataSource.setUrl(url);
		
		return fakeDataSource;
	}
	
	@Bean
	public FakeJmsBroker fakeJmsBroker() {
		FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
		fakeJmsBroker.setUsername(jmsUsername);
		fakeJmsBroker.setPassword(jmsPassword);
		fakeJmsBroker.setUrl(jmsUrl);
		
		return fakeJmsBroker;
	}
}
