package map;

import java.util.HashSet;

import org.junit.Test;

public class MaximumNumberofWordsYouCanType {

	@Test
	public void examplePositiveData()
	{
		
		String text = "hello world", brokenLetters = "ad";
		
		maximumNumberofWordsYouCanType(text,brokenLetters);
		
	}
	
	@Test
	public void exampleEdgeeData()
	{
		
		String text = "leet code", brokenLetters = "lt";
		
		maximumNumberofWordsYouCanType(text,brokenLetters);
		
	}
	
	@Test
	public void exampleNagtiveData()
	{
		
		String text = "veikxddtjgpixjrux srxiqrczp cxaldqsvsxpzn xrlxovsjy ervh cdtxwnahcvj xazmhniydmzsseuhq htrsuiabtzcjglilehrpxqcadk ynls r pjkiwtcmvldcr t urevy fjmeutye gjnyd wv fueploq eol zofra xnwaxnwh lpckcgzfcslugpmu judahwebqnwtk gfttojiqcffstkcq nfxbw ugnviyeincmuzoosfy kdazdudaztlnj rqg umaohfgtvk i vfhdvuvbih falmmrke rv zsaqn oswdlfq eapt mnr swcoa jhmui t vkm tumfqvj ehcycfgzxjkhxhdbymmwxy xnsxxerahbrr silb rqmhfbyopev fstlsvpblocrvrheghvgiuqftknewskmhbk nchoj bo cxovzradanq fofsrtmnytq brcixelmzvdxmm";
		String brokenLetters = "wqchprenozi";
		
		maximumNumberofWordsYouCanType(text,brokenLetters);
		
	}

	private int maximumNumberofWordsYouCanType(String text, String brokenLetters) {
		// TODO Auto-generated method stub
		  
		int output=0;
	      
        String[] split = text.split(" ");
        int count=0;
        
        if(brokenLetters.length()<=0)
        {
        	return split.length;
        }
       
		
		HashSet<Character> set = new HashSet<>();
	        
	        for(int i=0;i<brokenLetters.length();i++)
	        {
	            set.add(brokenLetters.charAt(i));
	        }
	        

	        
	        
	        for(int j=0;j<split.length;j++)
	        {
	            
	            String ch = split[j];
	            for(int k=0;k<ch.length();k++)
	            {
	                if(!set.contains(ch.charAt(k)))
	                {
	                    count++;
	                }
	                
	            }
	            if(count==split[j].length())
	            {
	            	 System.out.println(split[j]);
	            	
	                output+=1;
	                count=0;
	            }count=0;
	            
	            
	        }

	        System.out.print(output);
	        return output;
	        
	     
	        
		

}
}
