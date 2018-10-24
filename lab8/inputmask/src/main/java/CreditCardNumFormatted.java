
public class CreditCardNumFormatted extends CCNumberDecorator implements IDisplayComponent,IKeyEventHandler {
	CreditCardNum ccnumber;	//holds a reference to the class its wrapping
	private IKeyEventHandler nextHandler ;

	CreditCardNumFormatted(CreditCardNum cc) {
		this.ccnumber = cc;
		
	}
	
    public void setNext( IKeyEventHandler next) {
    	this.nextHandler = next ;
    }	
    
	public String display() {
		StringBuffer formattedCCNum = new StringBuffer();
		String ccnum;		
		ccnum = ccnumber.display();
			
			for(int i=0;i<ccnum.length();i++) {
				switch(i) {
				case 5:
					if (ccnum.length() > 8)
						formattedCCNum.append(" " + ccnum.charAt(i));
					else
						formattedCCNum.append(ccnum.charAt(i));
					
					break;
				
				case 9: 
					if (ccnum.length() > 12)
						formattedCCNum.append(" " + ccnum.charAt(i));
					else
						formattedCCNum.append(ccnum.charAt(i));

					break;
				
				case 13:
					if (ccnum.length() > 16)
						formattedCCNum.append(" " + ccnum.charAt(i));
					else
						formattedCCNum.append(ccnum.charAt(i));

					break;
				
				default:
					formattedCCNum.append(ccnum.charAt(i));
					break;
			
				}
			}

		return formattedCCNum.toString();		
	}
	
	public void key(String ch, int cnt) {
		if ( cnt <= 16 ) {
			ccnumber.key(ch, cnt);
		}
		else if ( nextHandler != null )
			nextHandler.key(ch, cnt) ;
	}

	
	public void addSubComponent( IDisplayComponent c ) {
		return ; // do nothing
	}


}
