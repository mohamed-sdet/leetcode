package map;

import java.util.HashSet;

import org.junit.Test;

public class UniqueEmailAddresses {
	
	
	
	@Test
	public void examplePositiveData()
	{
		
		String[] email = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
		
		uniqueEmailAddresses(email);
		
	}

	private void uniqueEmailAddresses(String[] email) {
		// TODO Auto-generated method stub
		
		HashSet<String>  outputEmail = new HashSet();
		
		
		for(int i=0;i<email.length;i++)
		{
			int domain = email[i].indexOf('@');
			String localName = email[i].substring(0,domain);
			String domainName= email[i].substring(domain);
			
			
			if(localName.contains("+"))
			{
				int plusPosition = localName.indexOf("+");
				localName = localName.substring(0,plusPosition);
				
			}
			 localName= localName.replaceAll("[.]", "");
			String name= localName+domainName;
			
			outputEmail.add(name);
			
			
			
		}
		System.out.print(outputEmail);
		
	}

}
