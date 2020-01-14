package net.gondr.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import net.gondr.domain.GondrVO;

public class GondrValidator implements Validator{
	@Override
	public boolean supports(Class<?> clazz) {
		return GondrVO.class.isAssignableFrom(clazz);
	}
	
	@Override
	public void validate(Object target, Errors errors) {
		//call by reference
		//call by value
		ValidationUtils.rejectIfEmptyOrWhitespace(
				errors, "userid", "required", "유저 아이디 값은 필수입니다.");
		
		GondrVO vo = (GondrVO) target;
		
		if(vo.getCode() < 0) {
			errors.rejectValue("code", "bad", "0이하의 숫자는 올 수 없습니다.");
		}
	}
}
