package client.dataModel;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;

public class ElectionResultDataModel {
	private StringProperty party;
	private StringProperty constituency;
	private StringProperty proportionalRepresentation;
	private StringProperty amount;
	private StringProperty rate;
	
	public ElectionResultDataModel(StringProperty party, StringProperty constituency, StringProperty proportionalRepresentation, StringProperty amount, StringProperty rate)
	{
		this.party = party;
		this.constituency = constituency;
		this.proportionalRepresentation = proportionalRepresentation;
		this.amount = amount;
		this.rate = rate;
	}
	
	public StringProperty partyProperty()
	{
		return party;
	}
	
	public StringProperty constituencyProperty()
	{
		return constituency;
	}
	
	public StringProperty proportionalRepresentationProperty()
	{
		return proportionalRepresentation;
	}
	
	public StringProperty amountProperty()
	{
		return amount;
	}
	
	public StringProperty rateProperty()
	{
		return rate;
	}
}
