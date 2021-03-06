package cs.ualberta.octoaskt12;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;

import cs.ualberta.octoaskt12.ES.ESClient;

public class SearchController {
	
	private static QuestionArrayList questionArrayList = null;
	
	public static QuestionArrayList searchQuestions(String searchString) throws ClientProtocolException, IOException{		
		ESClient esc = new ESClient();
		questionArrayList = esc.searchQuestions(searchString);
		
		return questionArrayList;
	}
}
