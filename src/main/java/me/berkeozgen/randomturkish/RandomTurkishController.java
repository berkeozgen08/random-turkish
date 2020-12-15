package me.berkeozgen.randomturkish;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import static org.springframework.web.bind.annotation.RequestMethod.GET;;

@RestController
public class RandomTurkishController {

	@RequestMapping(method = GET, value = "/get", produces = {"application/json"})
	public String getWord(@RequestParam(value = "count", defaultValue = "1") int count) {
		return RandomTurkish.getWord(count);
	}

	@RequestMapping(method = GET, value = "/all", produces = {"application/json"})
	public String getAll() {
		return RandomTurkish.getAll();
	}

}
