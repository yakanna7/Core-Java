/*ArrayList To check contains() or remove() on user defined objects must override
equals method */
package packages.java.util.listinterface;
import java.util.*;
class Address
{
	String hno;
	String location;
	String city;
	String district;
	String state;
	String country;
	int pincode;
	
	public Address(String hno, String location, String city,String district,String state,String country,int pincode)
	{
		this.hno = hno;
		this.location = location;
		this.city = city;
		this.district =  district;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
	}

	public String getHno() {
		return hno;
	}

	public void setHno(String hno) {
		this.hno = hno;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result
				+ ((district == null) ? 0 : district.hashCode());
		result = prime * result + pincode;
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (district == null) {
			if (other.district != null)
				return false;
		} else if (!district.equals(other.district))
			return false;
		if (pincode != other.pincode)
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		return true;
	}	
}

class ArrayList16 
{

	 public static void main(String args[])
	 {
		 List<Address> addressList = new ArrayList<Address>();
	
		 addressList.add(new Address("4-112","Main Street", "Ramavaram","Warangal","Telangana","India",506324));
		 addressList.add(new Address("4-113","Nasapeta", "Dharvaram","Ananthapur","Andhrapradesh","India", 515671));
		 addressList.add(new Address("3-1-2","Housing Board", "Hyderabad","Rangareddy","Telangana","India",500072));
		 addressList.add(new Address("1-2-3","Pragathinagar", "Hyderabad","Rangareddy","Telangana","India",500072));
		 
		 Address adr = new Address("4-113","Nasapeta", "Dharvaram","Ananthapur","Andhrapradesh","India", 515671);
		
		 if(addressList.contains(adr))
		 {
			 System.out.println("Address was found");
		 }
		 else 
		 {
			 System.out.println("Address was not found");
		 }
		 
		 addressList.remove(adr);
		 
		 System.out.println("All address are");
		 Iterator<Address> itr = addressList.iterator();
		 
		 while(itr.hasNext())
		 {
			 Address ad = itr.next();
			 
			 System.out.println("House No : "+ad.getHno());
			 System.out.println("Location : "+ad.getLocation());
			 System.out.println("City     : "+ad.getCity());
			 System.out.println("District : "+ad.getDistrict());
			 System.out.println("Country  : "+ad.getCountry());
			 System.out.println("Pincode  : "+ad.getPincode());
			 System.out.println();
		 }
	 }
}
