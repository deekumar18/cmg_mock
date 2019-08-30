package uk.gov.dwp.esb.harddata;

import java.util.ArrayList;
import java.util.List;

import uk.gov.dwp.esb.vo.AddressDetailsOutput;
import uk.gov.dwp.esb.vo.AddressDetailsResponseVO;
import uk.gov.dwp.esb.vo.ClientAddress;
import uk.gov.dwp.esb.vo.ResponseHeader;

public class AddressDetailsResponseHD {

	private AddressDetailsResponseVO data;

	public AddressDetailsResponseHD() {
		data = new AddressDetailsResponseVO();
		this.setData();
	}

	private void setData() {
		this.setAddressOutput();
	}

	private ResponseHeader setHeader() {
		ResponseHeader header = new ResponseHeader();
		header.setResponseCode(0);
		header.setResponseMessage("Success");
		return header;
	}

	private ClientAddress setAddress() {
		ClientAddress address = new ClientAddress();
		address.setAddressLine1("Apartment 406");
		address.setAddressLine2("The Bar");
		address.setAddressLine3("St. James Gate");
		address.setAddressLine4("");
		address.setAddressLine5("");
		address.setCity("Newcastle Upon Tyne");
		address.setCounty("Tyne & Wear");
		address.setCountry("UK");
		address.setPostCode("NE1 4BA");
		address.setDeliveryPointSuffix("hard-coded");

		return address;
	}

	private void setAddressOutput() {
		AddressDetailsOutput output = new AddressDetailsOutput();
		output.setResponseHeader(setHeader());

		List<ClientAddress> addresses = new ArrayList<ClientAddress>(1);
		addresses.add(setAddress());
		output.setAddresses(addresses);

		data.setAddressDetailsOutput(output);
	}

	public AddressDetailsResponseVO getData() {
		return data;
	}
}
