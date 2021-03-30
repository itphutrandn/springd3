package edu.vinaenter.controllers;

import java.util.List;
import java.util.Locale;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import edu.vinaenter.models.Football;
import edu.vinaenter.services.FootballService;
import edu.vinaenter.util.FileUtil;

@Controller
@RequestMapping("football")
public class FootballController extends AbstractController<Football> {

	private static final Logger logger = LoggerFactory.getLogger(FootballController.class);

	@Resource
	private MessageSource messageSource;

	@Autowired
	private FootballService<Football> footballService;

	@GetMapping("index")
	public String index(Model model) {
		logger.info("call method index()");
		try {
			List<Football> footballList = footballService.findAll();
			model.addAttribute("footballList", footballList);
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		return "index";
	}

	@GetMapping("add")
	public String add() {
		logger.info("call method add() with request method @GetMapping");
		return "add";
	}

	@PostMapping("add")
	public String add(@Valid @ModelAttribute("fb") Football football, BindingResult rs, MultipartFile file,
			RedirectAttributes msg) {
		logger.info("call method add() with request method @PostMapping");

		if (rs.hasErrors()) {
			logger.info("Data is not valid!");
			return "add";
		}
		football.setPicture(FileUtil.upload(file));
		if (footballService.save(football) > 0) {
			msg.addFlashAttribute("msg", messageSource.getMessage("msg.success", null, Locale.getDefault()));
			return "redirect:/football/index";
		}
		return "add";
	}

	@GetMapping("detail/{id}")
	public String detail(@PathVariable Integer id, Model model) {
		Football football = footballService.findById(id);
		model.addAttribute("football", football);
		return "detail";
	}

	@GetMapping("delete/{id}")
	public String del(@PathVariable Integer id, RedirectAttributes msg) {
		logger.info("call method del() with request method @GetMapping");
		if (footballService.deleteById(id) > 0) {
			msg.addFlashAttribute("msg", messageSource.getMessage("msg.success", null, Locale.getDefault()));
			return "redirect:/football/index";
		}
		return "index";
	}

}
