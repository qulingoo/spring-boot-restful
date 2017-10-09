import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;

public class Client {
	  public static void main(String args[]) throws Exception{
	        
	        JaxWsDynamicClientFactory dcf =JaxWsDynamicClientFactory.newInstance();
	        org.apache.cxf.endpoint.Client client =dcf.createClient("http://localhost:8081/spring-boot/test/user?wsdl");
	        Object[] objects=client.invoke("getUser","411001");
	        System.out.println("*****"+objects[0].toString());
	    }
}
