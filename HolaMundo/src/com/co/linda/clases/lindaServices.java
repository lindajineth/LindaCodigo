package com.co.linda.clases;


import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.Date;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class lindaServices
 */
@Stateless

public class lindaServices implements lindaServicesRemote {

    /**
     * Default constructor. 
     */
	private String servicio ;
    public lindaServices() {
        // TODO Auto-generated constructor stub
    }
    @Override
    public String servicioLinda (){
    	DateFormat dateformat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    	Date hora = new Date();	 	   	
		
    	servicio = "Hola Mundo son las: "+dateformat.format(hora);	
		
		return servicio;	
    }

}
