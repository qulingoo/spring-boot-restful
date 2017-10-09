package hello;

import javax.jws.WebService;

@WebService(targetNamespace="http://hello/",endpointInterface = "hello.UserService")
public class UserServiceImpl  implements UserService{

	@Override
	public String getName(String userId) {
		return "12";
	}

	@Override
	public User getUser(String userId) {
		return new User();
	}

}
