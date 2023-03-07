package AbstractDesignPattern;

public class FactoryCreator  {
	
	public static SourceCourseFactory getSourceCourseFactory(String str) {
		return new SourceCourseFactory() {

			@Override
			public Source getSource(String SourceType) {
				// TODO Auto-generated method stub
				return new Source() {

					@Override
					public String getSourceName() {
						// TODO Auto-generated method stub
						return SourceType;
					}
					
				};
			}

			@Override
			public Course getCource(String CourceType) {
				// TODO Auto-generated method stub
				return new Course() {

					@Override
					public String getCourseName() {
						// TODO Auto-generated method stub
						return CourceType;
					}
					
				};
			}
			
			
		};
	}

}
