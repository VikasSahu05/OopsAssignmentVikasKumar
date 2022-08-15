package com.techment.aggregation.encapuslation;

public class Address {
		 String AddressLine;
		 String city;
		
		public Address(String AddressLine,String city){
			this.AddressLine=AddressLine;
			this.city=city;
		}
		
		public String getAddressDetails() {
			return AddressLine +" " +city;
			
		}
		
//		public void setAddressDetails(String AddressLine,String city) {
//			this.AddressLine=AddressLine;
//			this.city=city;
//		}
}
