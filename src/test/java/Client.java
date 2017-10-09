import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import hello.UserService;

public class Client {
	  public static void main(String args[]) throws Exception{
	        
	        /*JaxWsDynamicClientFactory dcf =JaxWsDynamicClientFactory.newInstance();
	        org.apache.cxf.endpoint.Client client =dcf.createClient("http://localhost:8081/spring-boot/test/user?wsdl");
	        Object[] objects=client.invoke("getName","411001");
	        System.out.println("*****"+objects[0].toString());*/
	     
		  URL wsdlURL = new URL("http://localhost:8081/spring-boot/test/user?wsdl");
	        QName SERVICE_NAME = new QName("http://hello/", "UserServiceImplService");
	        Service service = Service.create(wsdlURL, SERVICE_NAME);
	        UserService client = service.getPort(UserService.class);
	        System.out.println(client.getName(""));
	        System.out.println(client.getUser(""));
	        
	    }
}
