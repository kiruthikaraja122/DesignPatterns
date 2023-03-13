package abstractDesignPattern;

public abstract  class SourceFactory extends SourceCourseFactory{
	
	
	public Source getSource (String sourceType) {
		if (sourceType.equalsIgnoreCase("online")) {
			return new Online();
		}
		else if (sourceType.equalsIgnoreCase("Offline")) {
			return new Offline();
		}
		else {
			return null;
		}
	}
		public Course getCourse(String Coursetype) {
			return null;
		}
	}


