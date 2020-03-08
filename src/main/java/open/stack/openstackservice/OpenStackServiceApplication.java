package open.stack.openstackservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class OpenStackServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenStackServiceApplication.class, args);
	}

}
