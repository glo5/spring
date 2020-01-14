package net.gondr.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;

import net.gondr.domain.UserVO;

public class AuthInterceptor implements HandlerInterceptor{
	//prehandle
	//posthandle
	//afterCompletion
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		HttpSession session =request.getSession();
		if(session != null) {
			UserVO userVO = (UserVO)session.getAttribute("user");
			if(userVO != null) {
				return true;
			}
		}
		
		//여기가 실패했을 경우
		response.sendRedirect("/user/login");
		return false;
	}
	
}
