package ActionPerformingFiles;
public class SetCategory{
	
	String result;
	public String setCategory(int choice){
		switch(choice){
			case 1:
				result = "programming";
			break;
			case 2:
				result = "business";
			break;
			case 3:
				result = "novel";
			break;
			case 4:
				result = "mathematics";
			break;
		}
		return result;			
	}
}