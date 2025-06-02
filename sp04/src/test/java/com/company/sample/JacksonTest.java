package com.company.sample;

//@Log4j2
//public class JacksonTest {
//	
//	@Test
//	public void toStr() throws JsonProcessingException {
//		
//		//SampleVO sample = new SampleVO(10, "치즈", "김", "1234"); // 자바객체(SampleVO타입)
//		SampleVO sample = new SampleVO(10, "치즈", "김"); // 자바객체(SampleVO타입)
//		
//		ObjectMapper om = new ObjectMapper(); // Jackson 객체
//		String str = om.writeValueAsString(sample); // 자바객체(SampleVO타입)를 JSON스트링으로 변경
//		log.info(str);
//		
//		String param = "{\"mno\":10,\"firstName\":\"치즈\",\"lastName\":\"김\"}"; // JSON스트링
//		SampleVO result = om.readValue(param, SampleVO.class); // JSON스트링을 자바객체(SampleVO타입)로 변경
//		log.info(result.getFirstName());
//	}
//}
