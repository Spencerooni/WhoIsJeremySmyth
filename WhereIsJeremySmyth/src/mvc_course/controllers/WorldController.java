package mvc_course.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import mvc_data.IWorldMapper;

@Controller
public class WorldController 
{
//	@Autowired
//	public IWorldMapper worldMapper;
//	
//	@RequestMapping("/continentList.mvc")
//	public String continents(Model m)
//	{
//		m.addAttribute("continents", worldMapper.getContinents());
//		return "continents";
//	}
//	
//	@RequestMapping("/{cont}/regions.mvc")
//	public String regions(Model m, @PathVariable("cont") String continent)
//	{
//		m.addAttribute("regions", worldMapper.getRegionsForContinent(continent));
//		m.addAttribute("continent",continent);
//		return "regions";
//	}
//	
//	
//	@RequestMapping("/{region}/countries.mvc")
//	public String countries(Model m, @PathVariable String region)
//	{
//		m.addAttribute("countries", worldMapper.getCoutriesForRegion(region));
//		m.addAttribute("region", region);
//		return "countries";
//	}
}
