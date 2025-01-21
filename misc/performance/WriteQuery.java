package performance;

import java.io.IOException;

public class WriteQuery {
	
	public static String getTitleValue(int index) throws IOException {
		ReadProp rps = new ReadProp();
		return rps.getValue(index+"","./misc/titletable.properties");
	}
	
	public static String getProirityValue(int index) throws IOException {
		ReadProp rps = new ReadProp();
		return rps.getValue(index+"","./misc/proiritytable.properties");
	}
	
	
	public static void main(String[] args) throws IOException {
		ReadProp rp = new ReadProp();
		int count = Integer.parseInt(rp.getValue("titlecount","./misc/titletable.properties"));
		System.out.println("title count: "+count);
		
		int c2 = Integer.parseInt(rp.getValue("proiritycount", "./misc/proiritytable.properties"));
		System.out.println("proirity count: "+c2);
		
		
		//write query
		/*sample: 
		UPDATE pensionbox_qa.chatGPT_blog_posts
		SET proirity = CASE
    	WHEN title = 'Simplfying The Ways Of Tax Saving' THEN 0.6
    	WHEN title = 'Comprehensive Guide to Pension Reform in India' THEN 0.2
    
		END
		WHERE title in(
		'Simplfying The Ways Of Tax Saving',
    	'Comprehensive Guide to Pension Reform in India'
    	)
		AND post_id between '1' AND '195'
    	;
		*/
		int limit=0;
		int index=0;
		String queryp0="UPDATE pensionbox_qa.chatGPT_blog_posts SET proirity = CASE ";
		String queryp1="";
		String queryp2="END WHERE title in(";
		String queryp3="";
		while(limit<count && limit<c2) {
			++index;
			
			queryp1+="WHEN title = "+getTitleValue(index)+" THEN "+getProirityValue(index)+"\n";
			
			queryp2+=getTitleValue(index)+",";
			limit++;
		}
		System.out.println(queryp0+queryp1);
		
	}
	
	
	
}
