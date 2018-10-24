
public class CreditCardExpFormatted extends CCDateDecorator implements IKeyEventHandler, IDisplayComponent{
	CreditCardExp ccexp;	//holds a reference to the class its wrapping
	private IKeyEventHandler nextHandler ;

	CreditCardExpFormatted(CreditCardExp exp) {
		this.ccexp = exp;
	}
	
	public void setNext( IKeyEventHandler next) {
	    	this.nextHandler = next ;
	}	

	
	public String display() {
		StringBuffer formattedCCExpDate = new StringBuffer();
		String expDate;		
		expDate = ccexp.display();
		
		for(int i=0;i<expDate.length();i++) {
			if(i==3)
				if (expDate.charAt(i) != '/')
					formattedCCExpDate.append("/" + expDate.charAt(i));
				else
					formattedCCExpDate.append(expDate.charAt(i));

			else
				formattedCCExpDate.append(expDate.charAt(i));
		}
		
		return formattedCCExpDate.toString();
	
	}
	
	public void key(String ch, int cnt) {
		if ( cnt >= 17 && cnt <= 20  )
			ccexp.key(ch, cnt);
		else if ( nextHandler != null )
			nextHandler.key(ch, cnt) ;
	}
	
	public void addSubComponent( IDisplayComponent c ) {
		return ; // do nothing
	}
}
