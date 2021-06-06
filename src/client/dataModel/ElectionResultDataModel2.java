package client.dataModel;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;

public class ElectionResultDataModel2 {
	private StringProperty party;
	private StringProperty amount;
	private StringProperty rate;
	
	public ElectionResultDataModel2(StringProperty party, StringProperty amount, StringProperty rate)
	{
		this.party = party;
		this.amount = amount;
		this.rate = rate;
	}
	
	public StringProperty partyProperty()
	{
		return party;
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
