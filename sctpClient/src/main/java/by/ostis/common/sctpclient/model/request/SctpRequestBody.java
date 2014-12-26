package by.ostis.common.sctpclient.model.request;

import java.util.List;

import by.ostis.common.sctpclient.model.ScParameter;


public class SctpRequestBody {

	private List<ScParameter> body;
	
	public List<ScParameter> getParameterList(){
		return body;
	}
	
	public void addParameter(ScParameter parameter){
		body.add(parameter);
	}
	
	public void addParameters(ScParameter ...parameters){
		for (ScParameter scParameter : parameters) {
			body.add(scParameter);
		}
	}	
	
	public int getByteLenght(){
		int byteLenght = 0;
		for (ScParameter scParameter : body) {
			byteLenght += scParameter.getSize();
		}
		return byteLenght;
	}
	
	public int getSize(){
		return body.size();
	}
	
	
}
