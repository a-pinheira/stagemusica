package com.sony.codestage.controllers.services.exceptions;

public class ResourceNotFoundExcpetion extends RuntimeException {
		private static final long serialVersionUID = 1L;
		
		public ResourceNotFoundExcpetion (Object id) {
			super ("Resource Not Found. Id" + id);
		}
		
		

}
