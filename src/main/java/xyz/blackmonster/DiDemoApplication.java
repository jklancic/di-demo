package xyz.blackmonster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import xyz.blackmonster.controllers.ConstructorInjectedController;
import xyz.blackmonster.controllers.MyController;
import xyz.blackmonster.controllers.PropertyInjectedController;
import xyz.blackmonster.controllers.SetterInjectedController;
import xyz.blackmonster.fake.FakeDataSource;
import xyz.blackmonster.fake.FakeJmsBroker;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

		MyController controller = (MyController) ctx.getBean("myController");

		FakeDataSource fakeDataSource = (FakeDataSource) ctx.getBean(FakeDataSource.class);
		
		System.out.println(fakeDataSource.getUsername());

		FakeJmsBroker fakeJmsBroker = (FakeJmsBroker) ctx.getBean(FakeJmsBroker.class);
		
		System.out.println(fakeJmsBroker.getUsername());
	}
}
