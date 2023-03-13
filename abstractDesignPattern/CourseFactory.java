package abstractDesignPattern;

public abstract   class CourseFactory extends SourceCourseFactory {
	
 public Source getSource(String SourceType) {
	 return null;
 }
 public Course getCourse(String CourseType) {
	 if(CourseType.equalsIgnoreCase("programming")) {
		 return new ProgrammingCourse();
	 }
	 else if(CourseType.equalsIgnoreCase("non programming")) {
		 return  new NonProgrammingCourse();
	 }
	 else {
		 return null;
	 }
 }
}
