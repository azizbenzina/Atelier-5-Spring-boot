package com.aziz.jeuvideo.entities;
import org.springframework.data.rest.core.config.Projection;
@Projection(name = "titre", types = { Jeuvideo.class })
public interface JeuvideoProjection {
	public String getTitre();
}
