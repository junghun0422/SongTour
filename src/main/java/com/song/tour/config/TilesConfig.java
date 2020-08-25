package com.song.tour.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesView;
import org.springframework.web.servlet.view.tiles3.TilesViewResolver;

@Configuration
public class TilesConfig
{
	@Bean
	public TilesConfigurer tilesConfigurer()
	{
		TilesConfigurer configurer = new TilesConfigurer();
		configurer.setDefinitions( new String[] { "file:src/main/webapp/WEB-INF/tiles/layout/tiles.xml" } );
		configurer.setCheckRefresh( true );
		return configurer;
	}

	@Bean
	public TilesViewResolver tilesViewResolver()
	{
		TilesViewResolver tilesViewResolver = new TilesViewResolver();
		tilesViewResolver.setViewClass( TilesView.class );
		tilesViewResolver.setOrder( 1 );
		return tilesViewResolver;
	}
	
	@Bean
	public ViewResolver getViewResolver()
	{
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix( "/WEB-INF/views/" );
		resolver.setSuffix( ".jsp" );
		resolver.setOrder( 2 );
		return resolver;
	}
}
