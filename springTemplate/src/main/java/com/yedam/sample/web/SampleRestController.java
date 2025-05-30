package com.yedam.sample.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yedam.SampleVO;


//@Slf4j
//@RequiredArgsConstructor
//@Controller
@RestController // @ResponseBody 포함
public class SampleRestController {

//    private final TimeService timeService;
//	
//	@RequestMapping(value = "/sample", method = RequestMethod.GET)
//	public String home(Locale locale, Model model) {
//		log.info("Welcome home! The client locale is {}.", locale);
//				
//		model.addAttribute("serverTime", timeService.getTime2() );
//		
//		return "/home";
//	}

	@GetMapping("/getSample")
	public SampleVO getSample() {
		return new SampleVO(10, "땅콩", "김");
	}

	@GetMapping("/getList")
	public List<SampleVO> getList() {
		return IntStream.range(1, 10).mapToObj(i-> new SampleVO(i,i+"First",i+"Last")).collect(Collectors.toList());
	}

	@GetMapping("/getMap")
	public Map<String, SampleVO> getMap() {
		Map<String, SampleVO> map = new HashMap<>();
		map.put("first", new SampleVO(10, "치즈", "김"));
		return map;
	}
	
}
