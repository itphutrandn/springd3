//package edu.vinaenter.validator;
//
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//
//import org.springframework.stereotype.Component;
//import org.springframework.validation.Errors;
//import org.springframework.validation.Validator;
//
//import edu.vinaenter.models.Football;
//import edu.vinaenter.util.DateUtil;
//@Component
//public class DateValidator implements Validator {
//
//	@Override
//	public boolean supports(Class<?> clazz) {
//		return true;
//	}
//
//	@Override
//	public void validate(Object object, Errors errors) {
//		Football football = (Football) object;
//		if (football != null && football.getCreatedDate() != null) {
//			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//			String date = sdf.format(football.getCreatedDate());
//			if (football.getCreatedDate() != null) {
//				try {
//					DateUtil.convertStringToDate(date);
//				} catch (ParseException e) {
//					errors.rejectValue("createdDate", null, "Cần nhập đúng định dạng ngày yyyy-MM-dd. Ex: 2021-03-21");
//				}
//			}
//		}
//	}
//}
