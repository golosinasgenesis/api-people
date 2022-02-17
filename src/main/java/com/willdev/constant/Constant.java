package com.willdev.constant;

import java.time.ZoneId;

public final class Constant {

	public Constant() {
		throw new IllegalStateException("Constant class");
	}
	
	public static final String REG_INS_ACCEPTED 	= "EL PROCESO DE REGISTRO SE REALIZO DE MANERA SATISFACTORIA";
	public static final String REG_INS_NOT_ACCEPTED = "EL PROCESO DE REGISTRO NO SE REALIZO DE MANERA SATISFACTORIA";
	public static final String REG_ACT_ACCEPTED 	= "EL PROCESO DE ACTUALIZACION SE REALIZO DE MANERA SATISFACTORIA";
	public static final String REG_ACT_NOT_ACCEPTED = "EL PROCESO DE ACTUALIZACION NO SE REALIZO DE MANERA SATISFACTORIA";
	public static final String REG_ELI_OK 			= "EL PROCESO DE ELIMINACION SE REALIZO DE MANERA SATISFACTORIA";
	public static final String REG_ELI_NOT_OK 		= "EL PROCESO DE ELIMINACION NO SE REALIZO DE MANERA SATISFACTORIA";
	public static final String RELACION_NOT_FOUND 	= "NO SE LOGRO ENCONTRAR LA RELACION";
	public static final String PERSONA_NOT_FOUND 	= "NO SE LOGRO ENCONTRAR A LA PERSONA";
	public static final Integer EST_REG_ACTIVO 		= 1;
	public static final Integer EST_REG_DESACTIVO 	= 0;
	public static final String PHONE_CODE 			= "+51";
	public static final String ZEROS 				= "000";
	public static final String BLANK 				= "";
	public static final String PALOTE 				= "|";
	public static final String GUION 				= "-";
	public static final String DATEFORMAT 			= "dd/MM/yyyy";
	public static final String TIMEFORMAT 			= "HH:mm";
	public static final ZoneId TIMEZONE 			= ZoneId.of("America/Lima");
	public static final String REQUESTDATE 			= "yyyy-MM-dd HH:mm";

}
