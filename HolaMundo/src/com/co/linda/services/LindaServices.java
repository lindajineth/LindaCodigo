/**
 * 
 */
package com.co.linda.services;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebService;

import com.co.linda.clases.lindaServicesRemote;

/**
 * @author linda
 *
 */
@WebService
public class LindaServices {

	/**
	 * 
	 */
	@EJB 
	private lindaServicesRemote servicio;
	@WebMethod
	public String servicioLinda(){
		
		return servicio.servicioLinda();
	}

}
