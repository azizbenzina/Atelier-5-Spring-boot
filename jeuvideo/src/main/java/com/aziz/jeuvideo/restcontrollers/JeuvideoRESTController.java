package com.aziz.jeuvideo.restcontrollers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.aziz.jeuvideo.entities.Jeuvideo;
import com.aziz.jeuvideo.service.JeuvideoService;
@RestController
@RequestMapping("/api")
@CrossOrigin
public class JeuvideoRESTController {
	@Autowired
	JeuvideoService jeuvideoService;
	@RequestMapping(method = RequestMethod.GET)
	public List<Jeuvideo> getAllProduits() {
	return jeuvideoService.getAllJeuvideos();
	}
	@RequestMapping(method = RequestMethod.POST)
	public Jeuvideo createJeuvideo(@RequestBody Jeuvideo jeuvideo) {
	return jeuvideoService.saveJeuvideo(jeuvideo);
	}
	@RequestMapping(method = RequestMethod.PUT)
	public Jeuvideo updateJeuvideo(@RequestBody Jeuvideo jeuvideo) {
	return jeuvideoService.updateJeuvideo(jeuvideo);
	}

	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteJeuvideo(@PathVariable("id") Long id)
	{
		jeuvideoService.deleteJeuvideoById(id);
	}
	@RequestMapping(value="/jeucat/{idCat}",method = RequestMethod.GET)
	public List<Jeuvideo> getProduitsByCatId(@PathVariable("idCat") Long idCat) {
	return jeuvideoService.findByCategorieIdCat(idCat);
	}


}
